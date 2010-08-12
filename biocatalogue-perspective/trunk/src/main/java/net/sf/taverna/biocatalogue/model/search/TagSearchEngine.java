package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.ui.PartialSearchResultsRenderer;

import org.biocatalogue.x2009.xml.rest.Services;
import org.biocatalogue.x2009.xml.rest.Tag;


/**
 * TODO - NB! Important to read this comment before making changes to this class.
 * 
 * Search by tags first gets a document that has links to various collection of
 * tagged resources.
 * 
 * Currently the API only returns a collection of tagged services. Plans for extending
 * this are to have several collections of tagged objects (e.g. tagged operations, tagged inputs, etc).
 * This has implications on the design of the search capabilities of BioCatalogue plugin.
 * 
 * Methods from <code>SearchEngine</code> interface implemented in this class must always be called
 * from a separate thread (i.e. not the UI thread). These methods currently work in the same
 * thread (i.e. don't start a new thread) just because there is only one collection of tagged items -
 * services - at the moment.
 * 
 * As soon as more collections are added, these methods may easily be extended to start a new
 * thread for fetching items of those collections in parallel. Synchronisation must be used
 * to identify the moment where all those threads will terminate. The caller thread must then
 * be notified using the <code>searchCompleteNotifyCaller()</code> method.
 * 
 * @author Sergejs Aleksejevs
 */
public class TagSearchEngine extends AbstractSearchEngine
{
  public TagSearchEngine(SearchInstance searchInstance, BioCatalogueClient client,
                         Vector<Long> currentParentSearchThreadIDContainer,
                         Long parentSearchThreadID, CountDownLatch doneSignal,
                         PartialSearchResultsRenderer renderer)
  {
    super(searchInstance, client, currentParentSearchThreadIDContainer, parentSearchThreadID, doneSignal, renderer);
  }
  
  
  protected String getPrimarySearchURL() {
    return (searchInstance.getSearchTag().getTagURI());
  }
  
  
  public void startNewSearch()
  {
    // construct search URL to hit on BioCatalogue server
    String searchURL = getPrimarySearchURL();
    
    // perform the actual search operation
    Tag tagData = null;
    try
    {
      tagData = client.getBioCatalogueTag(searchURL);
      TagSearchResults searchResults = new TagSearchResults();
      if (tagData.getRelated().getServices() != null) {
        searchResults.addFoundServicesData(client.getBioCatalogueServices(tagData.getRelated().getServices().getHref()));
      }
    
      // only update search results of the associated search instance if the caller thread of
      // this operation is still active
      if (isParentSearchThreadActive()) {
        searchInstance.setSearchResults(searchResults);
      }
    }
    catch (Exception e) {
      System.err.println("ERROR: Couldn't execute initial phase of a search by tag, details below:");
      e.printStackTrace();
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller
    searchCompleteNotifyCaller();
  }
  
  
  /**
   * NB! This method only fetches tagged services now - it needs to
   *     be updated accordingly when more tagged object types are
   *     available.
   */
  protected void fetchMoreResults(boolean notifyCallerWhenDone)
  {
    TagSearchResults searchResults = (TagSearchResults)searchInstance.getSearchResults();
    
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
        System.err.println("ERROR: unable to extract HREF of the next page of results for search by tag. Details:\n");
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
        System.err.println("ERROR: Couldn't fetch more results for a search by tag;\n" +
                           "Search URL was: " + searchURL + "\ndetails below:");
        e.printStackTrace();
      }
    }
    
    // no matter if search was completed or interrupted by a new search, notify the caller
    if (notifyCallerWhenDone) searchCompleteNotifyCaller();
  }
  
  
}
