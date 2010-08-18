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
  
  // statistics on the found items
  protected CollectionCoreStatistics statistics;
  
  // Data store for found items
  protected ArrayList<ResourceLink> foundItems;
  
  
  public SearchResults(TYPE typeOfResourcesInTheResultSet) {
    foundItems = new ArrayList<ResourceLink>();
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
  
  
  public List<ResourceLink> getFoundItems() {
    return (this.foundItems);
  }
  
  
  public int getFetchedItemCount() {
    return (this.foundItems.size());
  }
  
  
  public int getTotalMatchingItemCount() {
    return (this.statistics.getResults().intValue());
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
