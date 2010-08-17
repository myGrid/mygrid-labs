package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.JOptionPane;

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
  
  public QuerySearchEngine(SearchInstance searchInstance,
                           Vector<Long> currentParentSearchThreadIDContainer,
                           Long parentSearchThreadID, CountDownLatch doneSignal,
                           PartialSearchResultsRenderer renderer) 
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
    // TODO - add: "page" param
    // TODO - add: "per_page" param
    
    return (searchURL);
  }
  
  
  public void startNewSearch()
  {
    // construct search URL to hit on BioCatalogue server
    String searchURL = getPrimarySearchURL();
    
    // perform the actual search operation
    try
    {
      QuerySearchResults searchResults = new QuerySearchResults(searchInstance.getResourceTypeToSearchFor());
      searchResults.addSearchResults(client.getListOfItemsFromResourceCollectionIndex(searchInstance.getResourceTypeToSearchFor().getXmlBeansGeneratedCollectionClass(), searchURL));
      
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        searchInstance.setSearchResults(searchResults);
        renderer.renderPartialResults(/*parentSearchThreadID, */searchInstance);  // FIXME
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
