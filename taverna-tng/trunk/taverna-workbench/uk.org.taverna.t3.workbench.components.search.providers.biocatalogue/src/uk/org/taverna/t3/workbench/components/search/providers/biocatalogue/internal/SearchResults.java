package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
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
  
  // Data structures for found items
  protected List<Service> foundServices;
  protected List<SoapOperation> foundSoapOperations;
  protected List<ServiceProvider> foundServiceProviders;
  protected List<User> foundUsers;
  protected List<Registry> foundRegistries;
  
  // this set will hold IDs of item types for which some problems
  // were encountered and no more results can be fetched
  private Set<Integer> resultTypesWithProblems;
  
  
  public SearchResults()
  {
    foundServices = new ArrayList<Service>();
    foundSoapOperations = new ArrayList<SoapOperation>();
    foundServiceProviders = new ArrayList<ServiceProvider>();
    foundUsers = new ArrayList<User>();
    foundRegistries = new ArrayList<Registry>();
    
    resultTypesWithProblems = new TreeSet<Integer>();
  }
  
  
  public List<Service> getFoundServices() {
    return foundServices;
  }
  
  public List<SoapOperation> getFoundSoapOperations() {
	  return foundSoapOperations;
  }
  
  public List<ServiceProvider> getFoundServiceProviders() {
    return foundServiceProviders;
  }
  
  public List<User> getFoundUsers() {
    return foundUsers;
  }
  
  public List<Registry> getFoundRegistries() {
    return foundRegistries;
  }
  
  
  public boolean isValidResultType(int itemType) {
    return (itemType == Resource.ALL_RESOURCE_TYPES || Resource.ALL_SUPPORTED_RESOURCE_TYPES.contains(itemType));
  }
  
  
  /**
   * Used to register some sort of problem with a particular result type.
   * Mainly needed to prevent "fetch all results" operation from keeping
   * trying to fetch results of that type if there was some problem - e.g.
   * URL of next page was unavailable, etc.
   * 
   * @param itemType
   */
  public void registerProblemWithResultType(int itemType) {
    if (isValidResultType(itemType)) {
      if (itemType == Resource.ALL_RESOURCE_TYPES) {
        this.resultTypesWithProblems.addAll(Resource.ALL_SUPPORTED_RESOURCE_TYPES);
      }
      else {
        this.resultTypesWithProblems.add(itemType);
      }
    }
  }
  
  
  public int getFetchedItemCount(int itemType)
  {
    switch (itemType) {
      case Resource.SERVICE_TYPE:          return (foundServices.size());
      case Resource.SOAP_OPERATION_TYPE:   return (foundSoapOperations.size());
      case Resource.SERVICE_PROVIDER_TYPE: return (foundServiceProviders.size());
      case Resource.USER_TYPE:             return (foundUsers.size());
      case Resource.REGISTRY_TYPE:         return (foundRegistries.size());
      case Resource.ALL_RESOURCE_TYPES:    return (foundServices.size() + foundSoapOperations.size() + foundServiceProviders.size() +
                                                   foundUsers.size() + foundRegistries.size());
      default: return(-1);
    }
  }
  
  
  public abstract int getTotalItemCount(int itemType);
  
  
  public synchronized boolean hasMoreResults(int itemType)
  {
    // for unknown types there are definitely no more available results
    if (!isValidResultType(itemType)) return (false);
    
    // either need to take into account all item types - or just the supplied one
    Set<Integer> itemTypesToTakeAccountOf = new TreeSet<Integer>();
    if (itemType == Resource.ALL_RESOURCE_TYPES) {
      itemTypesToTakeAccountOf.addAll(Resource.ALL_SUPPORTED_RESOURCE_TYPES);
    }
    else {
      itemTypesToTakeAccountOf.add(itemType);
    }
    
    // go through all identified item types - only decide that there are more
    // results if number of fetched items of that type is less than total and
    // no problems were encountered with that item type yet
    boolean bMoreResultsAvailable = false;
    for (int curItemType : itemTypesToTakeAccountOf) {
      if (getFetchedItemCount(curItemType) < getTotalItemCount(curItemType) && !resultTypesWithProblems.contains(curItemType)) {
        bMoreResultsAvailable = true;
      }
    }
    
    return (bMoreResultsAvailable);
  }
  
  
  /**
   * Mainly for testing - outputs number of search results per item type.
   */
  public String toString()
  {
    StringBuilder out = new StringBuilder("Breakdown of item counts by type:\n");
    for (Map.Entry<Integer,String> itemTypeNamePair : Resource.ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES.entrySet()) {
      out.append(itemTypeNamePair.getValue() + ": " +getFetchedItemCount(itemTypeNamePair.getKey()) +
                 "/" + getTotalItemCount(itemTypeNamePair.getKey()) + "\n");
    }
    
    return (out.toString());
  }
}
