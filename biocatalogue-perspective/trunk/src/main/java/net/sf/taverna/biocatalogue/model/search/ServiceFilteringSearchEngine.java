package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.search_results.PartialSearchResultsRenderer;

import org.biocatalogue.x2009.xml.rest.Services;


/**
 * @author Sergejs Aleksejevs
 */
public class ServiceFilteringSearchEngine extends AbstractSearchEngine
{
  public ServiceFilteringSearchEngine(SearchInstance searchInstance,
                         Vector<Long> currentParentSearchThreadIDContainer,
                         Long parentSearchThreadID, CountDownLatch doneSignal,
                         PartialSearchResultsRenderer renderer)
  {
    super(searchInstance, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
  }
  
  
  protected String getPrimarySearchURL()
  {
    String searchURL = null;
    if (searchInstance.isServiceFilteringSearch()) {
      if (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH) {
        // extract all parameters that would be sent to the /search endpoint and use them for /services endpoint
        // as we need for service filtering
        String querySearchURL = new QuerySearchEngine(searchInstance, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer).getPrimarySearchURL();
        searchURL = Util.appendAllURLParameters(BioCatalogueClient.API_SERVICES_URL, Util.extractURLParameters(querySearchURL));
      }
      else if (searchInstance.getServiceFilteringBasedOn() == SearchInstance.TAG_SEARCH) {
        // create the initial URL from the base one plus the tag to search for
        searchURL = Util.appendURLParameter(BioCatalogueClient.API_SERVICES_URL, 
                                            BioCatalogueClient.API_TAG_PARAMETER,
                                            "[" + searchInstance.getSearchTag().getFullTagName() + "]");
      }
    }
    
    // the base URL was prepared, now proceed identically for both filtering
    // based on query searches and based on tag searches -- add filtering parameters
    searchURL = Util.appendAllURLParameters(searchURL, searchInstance.getFilteringSettings().getFilteringURLParameters());
    
    // scope parameter is likely to be present in the URL already, but we override this 
    // to only request services (this will overwrite the old value if it was there)
    searchURL = Util.appendURLParameter(searchURL, BioCatalogueClient.API_SCOPE_PARAMETER, BioCatalogueClient.API_SCOPE_SERVICES);
    
    return (searchURL);
  }
  
  
  public void startNewSearch()
  {
    // construct search URL to hit on BioCatalogue server - this depends on the type
    // of SearchInstance from which the current SearchInstance was produced
    String searchURL = getPrimarySearchURL();
    
    // perform the actual search operation
    try
    {
      ServiceFilteringSearchResults searchResults = new ServiceFilteringSearchResults();
      searchResults.addFoundServicesData(client.getBioCatalogueServices(searchURL));
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        searchInstance.setSearchResults(searchResults);
      }
    }
    catch (Exception e) {
      System.err.println("ERROR: Couldn't execute initial phase of service filtering search, details below:");
      e.printStackTrace();
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller
    searchCompleteNotifyCaller();
  }
  
  
  protected void fetchMoreResults(boolean notifyCallerWhenDone)
  {
    ServiceFilteringSearchResults searchResults = (ServiceFilteringSearchResults)searchInstance.getSearchResults();
    
    // only attempt to fetch more results if the search was performed before
    if (searchResults != null)
    {
      String searchURL = null;
      try {
        searchURL = searchResults.getFoundServicesData().getRelated().getNext().getHref();
      }
      catch (NullPointerException e) {
        // this might be caused by some problem in the API output - link to next page
        // should have been available
        System.err.println("ERROR: unable to extract HREF of the next page of results for service filtering searhc. Details:\n");
        e.printStackTrace();
        
        // can't continue: register the problem, notify the caller that the search is "finished" -
        // if prescribed by the parameter - then terminate
        searchInstance.getSearchResults().registerProblemWithResultType(Resource.SERVICE_TYPE);
        if (notifyCallerWhenDone) searchCompleteNotifyCaller();
        
        return;
      }
    
      // do results fetching
      try
      {
        Services moreServicesData = client.getBioCatalogueServices(searchURL);
        
        // only update search results of the associated search instance if the caller thread of
        // this operation is still active
        if (isParentSearchThreadActive()) {
          searchResults.addFoundServicesData(moreServicesData);
        }
      }
      catch (Exception e) {
        System.err.println("ERROR: Couldn't fetch more results for a service filtering search;\n" +
                           "Search URL was: " + searchURL + "\ndetails below:");
        e.printStackTrace();
      }
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller
    if (notifyCallerWhenDone) searchCompleteNotifyCaller();
  }
  
  
}
