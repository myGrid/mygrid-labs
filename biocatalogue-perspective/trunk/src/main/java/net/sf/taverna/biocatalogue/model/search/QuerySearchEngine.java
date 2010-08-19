package net.sf.taverna.biocatalogue.model.search;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

import net.sf.taverna.biocatalogue.model.LoadingResource;
import net.sf.taverna.biocatalogue.model.Pair;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.model.connectivity.BeansForJSONLiteAPI.ResourceIndex;
import net.sf.taverna.biocatalogue.model.connectivity.BeansForJSONLiteAPI.ResourceLinkWithName;
import net.sf.taverna.biocatalogue.model.connectivity.BioCatalogueClient;
import net.sf.taverna.biocatalogue.ui.search_results.SearchResultsRenderer;

import org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Search;

/**
 * @author Sergejs Aleksejevs
 */
public class QuerySearchEngine extends AbstractSearchEngine
{
  
  public QuerySearchEngine(SearchInstance searchInstance,
                           Vector<Long> currentParentSearchThreadIDContainer,
                           Long parentSearchThreadID, CountDownLatch doneSignal,
                           SearchResultsRenderer renderer) 
  {
    super(searchInstance, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
  }
  
  
  /**
   * Primary search URL is the one that is *generated* when the search is first executed --
   * for further requests (like fetching more data) it won't be fully generated, but rather
   * will be derived from this primary URL.
   */
  protected String getPrimarySearchURL()
  {
    // construct search URL to hit on BioCatalogue server
    String searchURL = Util.appendURLParameter(searchInstance.getResourceTypeToSearchFor().getAPIResourceCollectionIndex(), "q", searchInstance.getSearchString());
    searchURL = Util.appendAllURLParameters(searchURL, searchInstance.getResourceTypeToSearchFor().getAPIResourceCollectionIndexAdditionalParameters());
    
    return (searchURL);
  }
  
  
  public void startNewSearch()
  {
    // construct search URL to hit on BioCatalogue server
    String searchURL = getPrimarySearchURL();
    
    // perform the actual search operation
    try
    {
      ResourceIndex resourceIndex = client.getBioCatalogueResourceLiteIndex(searchInstance.getResourceTypeToSearchFor(), searchURL);
      SearchResults searchResults = new SearchResults(searchInstance.getResourceTypeToSearchFor(), resourceIndex);
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        searchInstance.setSearchResults(searchResults);
        renderer.renderInitialResults(searchInstance);
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
      logger.error("Prevented attempt to fetch an invalid result page: " + resultPageNumber + ". Returnining...");
      return;
    }
    
    // construct search URL to hit on BioCatalogue server --
    // it is exactly as the one for the initial search, but with a page number
    // parameter being added
    String searchURL = getPrimarySearchURL();
    searchURL = Util.appendURLParameter(searchURL, BioCatalogueClient.API_PAGE_PARAMETER, ""+resultPageNumber);
    
    // fetch required result page
    try 
    {
      Pair<CollectionCoreStatistics,List<ResourceLink>> newResultBatch = client.getListOfItemsFromResourceCollectionIndex(
          searchInstance.getResourceTypeToSearchFor().getXmlBeansGeneratedCollectionClass(), searchURL);
      
      int firstNewEntryIndex = searchInstance.getSearchResults().getFirstItemIndexOn(resultPageNumber);
      searchInstance.getSearchResults().addSearchResults(newResultBatch.getSecondObject(), firstNewEntryIndex);
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        renderer.renderFurtherResults(searchInstance, firstNewEntryIndex, searchInstance.getResourceTypeToSearchFor().getApiResourceCountPerIndexPage());
      }
    }
    catch (Exception e) {
      
    }
    
  }
  
  
  /**
   * This is an internal method. It can be called as
   * part of <code>fetchAllResults()</code> and then
   * doesn't need to notify caller of search completion
   * after this method terminates.
   * 
   * @param notifyCallerWhenDone Defines whether or not caller will be notified
   *                             of search completion on termination of this method.
   */
  protected void fetchMoreResults(boolean notifyCallerWhenDone)
  {
    SearchResults searchResults = (SearchResults)searchInstance.getSearchResults();
    
    // only attempt to fetch more results if the search was performed before
    if (searchResults != null)
    {
      String searchURL = null;
      try {
//        searchURL = searchResults.getSearchResultsData().getRelated().getNext().getHref();
      }
      catch (NullPointerException e) {
        // this might be caused by some problem in the API output - link to next page
        // should have been available
        System.err.println("ERROR: unable to extract HREF of the next page of results for search by query. Details:\n");
        e.printStackTrace();
        
        // can't continue: register the problem, notify the caller that the search is "finished" -
        // if prescribed by the parameter - then terminate
//        searchInstance.getSearchResults().registerProblemWithResultType(Resource.ALL_RESOURCE_TYPES);  // FIXME
        if (notifyCallerWhenDone) searchCompleteNotifyCaller();
        
        return;
      }
      
      // do results fetching
      try
      {
        Search moreResultsData = client.getBioCatalogueSearchData(searchURL);
        
        // only update search results of the associated search instance if the caller thread of
        // this operation is still active
        if (isParentSearchThreadActive()) {
//          searchResults.addSearchResults(moreResultsData);  // FIXME
        }
      }
      catch (Exception e) {
        // log the problem, but don't register - this doesn't prevent from trying again
        System.err.println("ERROR: Couldn't fetch results page for a search by query;\n" +
                           "Search URL was: " + searchURL + "\ndetails below:");
        e.printStackTrace();
      }
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller -
    // if prescribed by the parameter
    if (notifyCallerWhenDone) searchCompleteNotifyCaller();
  }
  
  
  
}
