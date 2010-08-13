package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.ui.PartialSearchResultsRenderer;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

/**
 * @author Sergejs Aleksejevs
 */
public abstract class AbstractSearchEngine implements SearchEngine
{
  protected SearchInstance searchInstance;
  protected final BioCatalogueClient client;
  protected final Vector<Long> currentParentSearchThreadIDContainer;
  protected final Long parentSearchThreadID;
  protected final CountDownLatch doneSignal;
  protected final PartialSearchResultsRenderer renderer;
  
  
  public AbstractSearchEngine(SearchInstance searchInstance, 
                              Vector<Long> currentParentSearchThreadIDContainer,
                              Long parentSearchThreadID, CountDownLatch doneSignal,
                              PartialSearchResultsRenderer renderer)
  {
    this.searchInstance = searchInstance;
    this.client = MainComponentFactory.getSharedInstance().getBioCatalogueClient();
    this.currentParentSearchThreadIDContainer = currentParentSearchThreadIDContainer;
    this.parentSearchThreadID = parentSearchThreadID;
    this.doneSignal = doneSignal;
    this.renderer = renderer;
  }
  
  
  /**
   * This method is used for notifying the object that has started the
   * search of this particular search operation being complete.
   */
  protected void searchCompleteNotifyCaller() {
    this.doneSignal.countDown();
  }
  
  
  /**
   * @return True if the thread which has been reported as the caller of this
   *         search operation is still active (and hence the search engine
   *         may continue its operation); false otherwise.
   */
  protected boolean isParentSearchThreadActive() {
    // currentParentSearchThreadIDContainer may contain null at its 0th element, so
    // it's critical to keep the comparison this way round
    return (parentSearchThreadID.equals(currentParentSearchThreadIDContainer.get(0)));
  }
  
  
  /**
   * This is a method from external interface - it will
   * fetch more results 'once', notify the caller and terminate.
   */
  public void fetchMoreResults() {
    fetchMoreResults(true);
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
  protected abstract void fetchMoreResults(boolean notifyCallerWhenDone);
  
  
  public void fetchAllResults()
  {
    while (isParentSearchThreadActive() && searchInstance.getSearchResults().hasMoreResults(Resource.ALL_RESOURCE_TYPES)) {
      fetchMoreResults(false);
      renderer.renderPartialResults(parentSearchThreadID, searchInstance);
    }
    searchCompleteNotifyCaller();
  }
  
  
  /**
   * @return The URL used to fetch the initial portion of results from the API.
   */
  protected abstract String getPrimarySearchURL();
}
