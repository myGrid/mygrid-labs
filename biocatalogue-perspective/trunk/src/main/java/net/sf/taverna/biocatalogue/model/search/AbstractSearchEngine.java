package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.connectivity.BioCatalogueAPIRequest;
import net.sf.taverna.biocatalogue.model.connectivity.BioCatalogueClient;
import net.sf.taverna.biocatalogue.ui.search_results.SearchResultsRenderer;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

/**
 * @author Sergejs Aleksejevs
 */
public abstract class AbstractSearchEngine implements SearchEngine
{
  protected Logger logger;
  
  protected SearchInstance searchInstance;
  protected final BioCatalogueClient client;
  protected final SearchInstanceTracker activeSearchInstanceTracker;
  protected final CountDownLatch doneSignal;
  protected final SearchResultsRenderer renderer;
  
  
  public AbstractSearchEngine(SearchInstance searchInstance, 
                              SearchInstanceTracker activeSearchInstanceTracker,
                              CountDownLatch doneSignal,
                              SearchResultsRenderer renderer)
  {
    this.logger = Logger.getLogger(this.getClass());
    
    this.searchInstance = searchInstance;
    this.client = MainComponentFactory.getSharedInstance().getBioCatalogueClient();
    this.activeSearchInstanceTracker = activeSearchInstanceTracker;
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
   * @return <code>true</code> if the thread launched by this search engine is still
   *         the one treated as 'active' in the context of the user actions in the plugin;<br/>
   *         <code>false</code> - otherwise.
   */
  protected boolean isCurrentSearch() {
    return (activeSearchInstanceTracker.isCurrentSearchInstance(
              this.searchInstance.getResourceTypeToSearchFor(), searchInstance));
  }
  
  
  /**
   * @return The URL used to fetch the initial portion of results from the API.
   */
  protected abstract BioCatalogueAPIRequest generateSearchRequest();


  public abstract void startNewSearch();
  public abstract void fetchMoreResults(int resultPageNumber);
  
}
