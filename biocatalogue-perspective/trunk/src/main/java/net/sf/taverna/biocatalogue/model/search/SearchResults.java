package net.sf.taverna.biocatalogue.model.search;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;

import org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics;
import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.User;


/**
 * Generic class for search results;
 * to be subclassed for particular types of search results.
 * 
 * @author Sergejs Aleksejevs
 */
public abstract class SearchResults implements Serializable
{
  private static final long serialVersionUID = 6994685875323246165L;
  
  // statistics on the found items
  protected CollectionCoreStatistics statistics;
  
  // Data store for found items
  protected List<ResourceLink> foundItems;
  
  // FIXME
//  // this set will hold IDs of item types for which some problems
//  // were encountered and no more results can be fetched
//  private Set<Integer> resultTypesWithProblems;
  
  
  public SearchResults(TYPE typeOfResourcesInTheResultSet)
  {
    foundItems = new ArrayList<ResourceLink>();
    
    // FIXME
//    resultTypesWithProblems = new TreeSet<Integer>();
  }
  
  
  public List<ResourceLink> getFoundItems() {
    return (this.foundItems);
  }
  
  
  // FIXME
//  /**
//   * Used to register some sort of problem with a particular result type.
//   * Mainly needed to prevent "fetch all results" operation from keeping
//   * trying to fetch results of that type if there was some problem - e.g.
//   * URL of next page was unavailable, etc.
//   * 
//   * @param itemType
//   */
//  public void registerProblemWithResultType(int itemType) {
//    if (isValidResultType(itemType)) {
//      if (itemType == Resource.ALL_RESOURCE_TYPES) {
//        this.resultTypesWithProblems.addAll(Resource.ALL_SUPPORTED_RESOURCE_TYPES);
//      }
//      else {
//        this.resultTypesWithProblems.add(itemType);
//      }
//    }
//  }
  
  
  public int getFetchedItemCount() {
    return (this.foundItems.size());
  }
  
  
  public abstract int getTotalItemCount();
  
  
  public synchronized boolean hasMoreResults(int itemType)
  {
    // FIXME
//    // for unknown types there are definitely no more available results
//    if (!isValidResultType(itemType)) return (false);
//    
//    // either need to take into account all item types - or just the supplied one
//    Set<Integer> itemTypesToTakeAccountOf = new TreeSet<Integer>();
//    if (itemType == Resource.ALL_RESOURCE_TYPES) {
//      itemTypesToTakeAccountOf.addAll(Resource.ALL_SUPPORTED_RESOURCE_TYPES);
//    }
//    else {
//      itemTypesToTakeAccountOf.add(itemType);
//    }
//    
//    // go through all identified item types - only decide that there are more
//    // results if number of fetched items of that type is less than total and
//    // no problems were encountered with that item type yet
//    boolean bMoreResultsAvailable = false;
//    for (int curItemType : itemTypesToTakeAccountOf) {
//      if (getFetchedItemCount(curItemType) < getTotalItemCount(curItemType) && !resultTypesWithProblems.contains(curItemType)) {
//        bMoreResultsAvailable = true;
//      }
//    }
//    
//    return (bMoreResultsAvailable);
    
    return (false);
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
