package net.sf.taverna.biocatalogue.model.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.sf.taverna.biocatalogue.model.Pair;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics;
import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.User;


/**
 * Generic class for any kinds of search results.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchResults implements Serializable
{
  private static final long serialVersionUID = 6994685875323246165L;
  
  private Logger logger;
  
  private final TYPE typeOfResourcesInTheResultSet;
  
  // statistics on the found items
  protected CollectionCoreStatistics statistics;
  
  // Data store for found items
  protected ArrayList<ResourceLink> foundItems;

  
  
  public SearchResults(TYPE typeOfResourcesInTheResultSet)
  {
    this.typeOfResourcesInTheResultSet = typeOfResourcesInTheResultSet;
    this.foundItems = new ArrayList<ResourceLink>();
    
    this.logger = Logger.getLogger(this.getClass());
  }
  
  
  /**
   * To be called when the first portion of search results is 
   * obtained - and, therefore, the total number of results is
   * already known.
   * 
   * The collection of results is then initialised with <code>null</code>
   * values - one for each of the expected total results.
   */
  protected void initialiseSearchResultCollection() 
  {
    foundItems.clear();
    foundItems.ensureCapacity(getTotalMatchingItemCount());
    for (int i = 0; i < getTotalMatchingItemCount(); i++) {
      foundItems.add(null);
    }
  }
  
  
  public synchronized void addSearchResults(Pair<CollectionCoreStatistics, List<ResourceLink>> searchResultsData,
      int positionToStartAddingResults)
  {
    // store statistics of the obtained data
    this.statistics = searchResultsData.getFirstObject();
    
    // adding results for the first time - some extra initialisation is needed
    if (this.foundItems.size() == 0) {
      initialiseSearchResultCollection();
    }
    
    // only update a specific portion of results
    for (int i = 0; i < searchResultsData.getSecondObject().size(); i++) {
      this.foundItems.set(i + positionToStartAddingResults, searchResultsData.getSecondObject().get(i));
    }
  }
  
  
  public TYPE getTypeOfResourcesInTheResultSet() {
    return typeOfResourcesInTheResultSet;
  }
  
  
  /**
   * @return List of resources that have matched the search query
   *         and/or specified filtering criteria. 
   */
  public List<ResourceLink> getFoundItems() {
    return (this.foundItems);
  }
  
  
  /**
   * @return Number of resources that have matched the search query
   *         (and/or specified filtering criteria) that have already been
   *         fetched.
   */
  public int getFetchedItemCount() {
    return (this.foundItems.size());
  }
  
  
  /**
   * @return Total number of resources that have matched the search query
   *         (and/or specified filtering criteria) - most of these will
   *         likely not be fetched yet.
   */
  public int getTotalMatchingItemCount() {
    return (this.statistics.getResults().intValue());
  }
  
  
  /**
   * @return Total number of pages in the current result set.
   */
  public int getTotalResultPageNumber() {
    int numberOfResourcesPerPageForThisResourceType = this.getTypeOfResourcesInTheResultSet().getApiResourceCountPerIndexPage();
    return (int)(Math.ceil((double)getTotalMatchingItemCount() / numberOfResourcesPerPageForThisResourceType));
  }
  
  
  /**
   * List of matching items will be partial and populated sequentially
   * based on user actions. Therefore, this method helps to check
   * which list entries are still not populated.
   * 
   * @param startIndex Beginning of the range to check.
   * @param endIndex End of the range to check.
   * @return Zero-based index of the first entry in the list of
   *         matching resources that hasn't been fetched yet.
   *         Will return <code>-1</code> if the provided range
   *         parameters are incorrect or if all items in the
   *         specified range are already available.
   */
  public int getFirstMatchingItemIndexNotYetFetched(int startIndex, int endIndex)
  {
    // check the specified range is correct
    if (startIndex < 0 || endIndex > getTotalMatchingItemCount() - 1) {
      return (-1);
    }
    
    // go through the search results in the specified range
    // in an attempt to find an item that hasn't been fetched
    // just yet
    for (int i = startIndex; i <= endIndex; i++) {
      if (this.foundItems.get(i) == null) {
        return (i);
      }
    }
    
    // apparently, all items in the provided range are fetched
    return (-1);
  }
  
  
  
  /**
   * @param matchingItemIndex Index of the matching item from search results.
   * @return Index (starting from "1") of page in the search results, where
   *         the matching item with a specified index is located. If the
   *         <code>matchingItemIndex</code> is wrong, <code>-1</code> is returned.
   */
  public int getMatchingItemPageNumberFor(int matchingItemIndex)
  {
    // check the specified index is correct
    if (matchingItemIndex < 0 || matchingItemIndex > getTotalMatchingItemCount() - 1) {
      return (-1);
    }
    
    int resultsPerPageForThisType = this.getTypeOfResourcesInTheResultSet().getApiResourceCountPerIndexPage();
    return (matchingItemIndex / resultsPerPageForThisType + 1);
  }
  
  
  /**
   * @param resultPageNumber Number of the page, for which the calculations are to be done.
   * @return Index of the first result entry on the specified result page. If <code>resultPageNumber</code>
   *         is less than <code>1</code> or greater than the total number of pages in the result set,
   *         a value of <code>-1</code> will be returned.
   */
  public int getFirstItemIndexOn(int resultPageNumber)
  {
    // page number must be in a valid range - starting with 1..onwards
    if (resultPageNumber < 1 || resultPageNumber > getTotalResultPageNumber()) {
      return (-1);
    }
    
    int numberOfResourcesPerPageForThisResourceType = this.getTypeOfResourcesInTheResultSet().getApiResourceCountPerIndexPage();
    return ((resultPageNumber - 1) * numberOfResourcesPerPageForThisResourceType);
  }
  
  
  
  /**
   * Mainly for testing - outputs number of search results per item type.
   */
  public String toString()
  {
    // FIXME
    
//    StringBuilder out = new StringBuilder("Breakdown of item counts by type:\n");
//    for (Map.Entry<Integer,String> itemTypeNamePair : Resource.ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES.entrySet()) {
//      out.append(itemTypeNamePair.getValue() + ": " +getFetchedItemCount(itemTypeNamePair.getKey()) +
//                 "/" + getTotalItemCount(itemTypeNamePair.getKey()) + "\n");
//    }
//    
//    return (out.toString());
    
    return ("search results... not implemented!!!");
  }
  
}
