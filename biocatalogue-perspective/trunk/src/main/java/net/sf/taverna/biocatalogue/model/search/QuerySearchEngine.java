package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.PartialSearchResultsRenderer;

import org.biocatalogue.x2009.xml.rest.Search;

/**
 * @author Sergejs Aleksejevs
 */
public class QuerySearchEngine extends AbstractSearchEngine
{
  
  public QuerySearchEngine(SearchInstance searchInstance, BioCatalogueClient client,
                           Vector<Long> currentParentSearchThreadIDContainer,
                           Long parentSearchThreadID, CountDownLatch doneSignal,
                           PartialSearchResultsRenderer renderer) 
  {
    super(searchInstance, client, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
  }
  
  
  protected String getPrimarySearchURL()
  {
    // take account of desired search scope
    String searchScope = "";
    if (searchInstance.getSearchServices()) searchScope += BioCatalogueClient.API_SCOPE_SERVICES + ",";
    if (searchInstance.getSearchServiceProviders()) searchScope += BioCatalogueClient.API_SCOPE_SERVICE_PROVIDERS + ",";
    if (searchInstance.getSearchUsers()) searchScope += BioCatalogueClient.API_SCOPE_USERS + ",";
    if (searchInstance.getSearchRegistries()) searchScope += BioCatalogueClient.API_SCOPE_REGISTRIES + ",";
    
    if (searchScope.endsWith(",")) searchScope = searchScope.substring(0, searchScope.length() - 1);
    if (searchScope.length() > 0) searchScope = "&" + BioCatalogueClient.API_SCOPE_PARAMETER + "=" + searchScope;
    
    // construct search URL to hit on BioCatalogue server
    String searchURL = Util.appendURLParameter(BioCatalogueClient.API_SEARCH_URL, "q", searchInstance.getSearchString());
    searchURL += searchScope;
    
    return (searchURL);
  }
  
  
  public void startNewSearch()
  {
    // construct search URL to hit on BioCatalogue server
    String searchURL = getPrimarySearchURL();
    
    // perform the actual search operation
    try
    {
      QuerySearchResults searchResults = new QuerySearchResults();
        searchResults.addSearchResults(client.getBioCatalogueSearchData(searchURL));
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        searchInstance.setSearchResults(searchResults);
      }
    }
    catch (Exception e) {
      System.err.println("ERROR: Couldn't execute initial phase of a search by query, details below:");
      e.printStackTrace();
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller
    searchCompleteNotifyCaller();
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
    QuerySearchResults searchResults = (QuerySearchResults)searchInstance.getSearchResults();
    
    // only attempt to fetch more results if the search was performed before
    if (searchResults != null)
    {
      String searchURL = null;
      try {
        searchURL = searchResults.getSearchResultsData().getRelated().getNext().getHref();
      }
      catch (NullPointerException e) {
        // this might be caused by some problem in the API output - link to next page
        // should have been available
        System.err.println("ERROR: unable to extract HREF of the next page of results for search by query. Details:\n");
        e.printStackTrace();
        
        // can't continue: register the problem, notify the caller that the search is "finished" -
        // if prescribed by the parameter - then terminate
        searchInstance.getSearchResults().registerProblemWithResultType(Resource.ALL_RESOURCE_TYPES);
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
          searchResults.addSearchResults(moreResultsData);
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
