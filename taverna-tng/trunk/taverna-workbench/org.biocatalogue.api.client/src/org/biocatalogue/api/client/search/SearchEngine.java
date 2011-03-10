package org.biocatalogue.api.client.search;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;
import org.biocatalogue.api.client.BeanForPOSTToFilteredIndex;
import org.biocatalogue.api.client.BeansForJSONLiteAPI.ResourceIndex;
import org.biocatalogue.api.client.BioCatalogueAPIRequest;
import org.biocatalogue.api.client.BioCatalogueClient;
import org.biocatalogue.api.client.Pair;
import org.biocatalogue.api.client.Resource;
import org.biocatalogue.api.client.Tag;
import org.biocatalogue.api.client.BioCatalogueUtil;
import org.biocatalogue.api.client.search.SearchInstance.TYPE;
import org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics;
import org.biocatalogue.x2009.xml.rest.ResourceLink;

import com.google.gson.Gson;

/**
 * @author Sergejs Aleksejevs
 * @author Jiten Bhagat
 */
public class SearchEngine
{
  protected Logger logger;
  
  protected SearchInstance searchInstance;
  protected final BioCatalogueClient client;
  protected final SearchInstanceTracker activeSearchInstanceTracker;
  protected final CountDownLatch doneSignal;
  
  
  public SearchEngine(BioCatalogueClient client,
	SearchInstance searchInstance, 
	SearchInstanceTracker activeSearchInstanceTracker,
	CountDownLatch doneSignal)
  {
    this.logger = Logger.getLogger(this.getClass());
    
    this.client = client;
    this.searchInstance = searchInstance;
    this.activeSearchInstanceTracker = activeSearchInstanceTracker;
    this.doneSignal = doneSignal;
  }
  
  
  
  /**
   * @return <code>true</code> if the thread launched by this search engine is still
   *         the one treated as 'active' in the context of the user actions in the plugin;<br/>
   *         <code>false</code> - otherwise.
   */
  protected boolean isCurrentSearch() {
    return (activeSearchInstanceTracker.isCurrentSearchInstance(
              this.searchInstance.getResourceTypeToSearchFor(), searchInstance));
  }
  
  
  
  /**
   * Primary API request is the one that is *generated* when the search is first executed --
   * for further requests (like fetching more data) it won't be fully generated, but rather
   * will be derived from this primary one.
   */
  protected BioCatalogueAPIRequest generateSearchRequest() {
    return (generateSearchRequest(searchInstance.getSearchType()));
  }
  
  protected BioCatalogueAPIRequest generateSearchRequest(TYPE searchType)
  {
    // construct search request to execute on BioCatalogue server
    BioCatalogueAPIRequest.TYPE requestType = BioCatalogueAPIRequest.TYPE.GET;
    String requestURL = null;
    String requestData = null;
    
    switch (searchType) {
      case QuerySearch:
        requestURL = BioCatalogueUtil.appendURLParameter(searchInstance.getResourceTypeToSearchFor().getAPIResourceCollectionIndex(), "q", searchInstance.getSearchString());
        break;
        
      case TagSearch:
        List<String> tags = new ArrayList<String>();
        for (Tag t : searchInstance.getSearchTags()) {
          tags.add(t.getFullTagName());
        }
        String tagParamValue = BioCatalogueUtil.join(tags, "[", "]", ",");
        requestURL = BioCatalogueUtil.appendURLParameter(searchInstance.getResourceTypeToSearchFor().getAPIResourceCollectionIndex(), "tag", tagParamValue);
        break;
      
      case Filtering:
        requestType = BioCatalogueAPIRequest.TYPE.POST;
        
        // get search URL for the 'base' search upon which the filtering is based
        requestURL = generateSearchRequest(searchInstance.getServiceFilteringBasedOn()).getURL();
        requestURL = BioCatalogueUtil.appendStringBeforeParametersOfURL(requestURL, BioCatalogueClient.API_FILTERED_INDEX_SUFFIX, true);
        
        // the base URL was prepared, now prepare filtering parameters as POST data
        BeanForPOSTToFilteredIndex dataBean = new BeanForPOSTToFilteredIndex();
        dataBean.filters = searchInstance.getFilteringSettings().getFilteringURLParameters();
        Gson gson = new Gson();
        requestData = gson.toJson(dataBean);
        break;
    }
    
    // make sure that the URL was generated
    if (requestURL == null) {
      logger.error("Primary search URL couldn't be generated; Search engine must have encountered " +
          "an unexpected search instance type: " + searchInstance.getSearchType());
      return (null);
    }
    
    // Sort by name (for REST and SOAP only at the moment. Parent Web services do not have the sort by name facility yet.)
    if (!searchInstance.getResourceTypeToSearchFor().equals(Resource.TYPE.Service)){
        requestURL = BioCatalogueUtil.appendURLParameter(requestURL, "sort_by", "name");
        requestURL = BioCatalogueUtil.appendURLParameter(requestURL, "sort_order", "asc");	
    }
    logger.info("BioCatalogue Plugin: Request URL for search: " + requestURL);
    
    // append some search-type-independent parameters and return the URL
    requestURL = BioCatalogueUtil.appendAllURLParameters(requestURL, searchInstance.getResourceTypeToSearchFor().getAPIResourceCollectionIndexAdditionalParameters());
    
    return (new BioCatalogueAPIRequest(requestType, requestURL, requestData));
  }
  
  

  public void startNewSearch()
  {
    // construct API request for this search
    BioCatalogueAPIRequest searchRequest = generateSearchRequest();
    
    // perform the actual search operation
    try
    {
      ResourceIndex resourceIndex = null;
      if (searchRequest.getRequestType() == BioCatalogueAPIRequest.TYPE.GET) {
        resourceIndex = client.getBioCatalogueResourceLiteIndex(searchInstance.getResourceTypeToSearchFor(), searchRequest.getURL());
      }
      else {
        // can only be POST then!
        resourceIndex = client.postBioCatalogueResourceLiteIndex(searchInstance.getResourceTypeToSearchFor(), searchRequest.getURL(), searchRequest.getData());
      }
      SearchResults searchResults = new SearchResults(searchInstance.getResourceTypeToSearchFor(), resourceIndex);
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active - synchronisation helps to make sure that the results
      // will definitely only be rendered if the current search instance is definitely active:
      // this way searches finishing in quick succession will 'flash' the results for a short
      // while before being updated, but that will happen in the correct order
      synchronized (activeSearchInstanceTracker) {
        if (isCurrentSearch()) {
          searchInstance.setSearchResults(searchResults);
        }
      }
    }
    catch (Exception e) {
      System.err.println("ERROR: Couldn't execute initial phase of a search by query, details below:");
      e.printStackTrace();
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller  // FIXME - is this needed?
    searchCompleteNotifyCaller();
  }
  
  
  @SuppressWarnings("unchecked")
  public void fetchMoreResults(int resultPageNumber)
  {
    if (resultPageNumber < 1 || resultPageNumber > searchInstance.getSearchResults().getTotalResultPageNumber()) {
      logger.error("Prevented attempt to fetch an invalid result page: " + resultPageNumber + ". Returning...");
      return;
    }
    
    // construct search URL to hit on BioCatalogue server --
    // it is exactly as the one for the initial search, but with a page number
    // parameter being added
    BioCatalogueAPIRequest searchRequest = generateSearchRequest();
    searchRequest.setURL(BioCatalogueUtil.appendURLParameter(searchRequest.getURL(), BioCatalogueClient.API_PAGE_PARAMETER, ""+resultPageNumber));
    
    // fetch required result page
    try 
    {
      Pair<CollectionCoreStatistics,List<ResourceLink>> newResultBatch = client.getListOfItemsFromResourceCollectionIndex(
          searchInstance.getResourceTypeToSearchFor().getXmlBeansGeneratedCollectionClass(), searchRequest);
      
      int firstNewEntryIndex = searchInstance.getSearchResults().getFirstItemIndexOn(resultPageNumber);
      searchInstance.getSearchResults().addSearchResults(newResultBatch.getSecondObject(), firstNewEntryIndex);
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isCurrentSearch()) {
        // CANNOT DO THIS!  renderer.renderFurtherResults(searchInstance, firstNewEntryIndex, searchInstance.getResourceTypeToSearchFor().getApiResourceCountPerIndexPage());
      }
    }
    catch (Exception e) {
      // FIXME
    }
    
    
    // no matter if search was completed or interrupted by a new search, notify the caller  // FIXME - is this needed?
    searchCompleteNotifyCaller();
  }
  
  
  /**
   * This method is used for notifying the object that has started the
   * search of this particular search operation being complete.
   */
  protected void searchCompleteNotifyCaller() {
    this.doneSignal.countDown();
  }
}
