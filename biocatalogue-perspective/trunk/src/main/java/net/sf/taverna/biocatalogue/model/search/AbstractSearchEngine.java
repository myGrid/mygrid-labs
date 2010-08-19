package net.sf.taverna.biocatalogue.model.search;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import org.apache.log4j.Logger;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.Resource;
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
  protected final Vector<Long> currentParentSearchThreadIDContainer;
  protected final Long parentSearchThreadID;
  protected final CountDownLatch doneSignal;
  protected final SearchResultsRenderer renderer;
  
  
  public AbstractSearchEngine(SearchInstance searchInstance, 
                              Vector<Long> currentParentSearchThreadIDContainer,
                              Long parentSearchThreadID, CountDownLatch doneSignal,
                              SearchResultsRenderer renderer)
  {
    this.logger = Logger.getLogger(this.getClass());
    
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
   * @return The URL used to fetch the initial portion of results from the API.
   */
  protected abstract String getPrimarySearchURL();


  public abstract void startNewSearch();
  public abstract void fetchMoreResults(int resultPageNumber);
  
}
