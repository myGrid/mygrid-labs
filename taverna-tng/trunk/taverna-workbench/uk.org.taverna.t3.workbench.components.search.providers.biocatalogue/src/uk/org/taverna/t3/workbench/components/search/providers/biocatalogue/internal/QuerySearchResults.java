package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import java.util.List;

import org.biocatalogue.x2009.xml.rest.Search;
import org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults;

/**
 * This class represents results of searches by query.
 * 
 * @author Sergejs Aleksejevs
 */
public class QuerySearchResults extends SearchResults
{
  private static final long serialVersionUID = -5507279997579800154L;
  
  private Search searchResultsData;
  
  
  public QuerySearchResults() {
    super();
  }
  
  
  public Search getSearchResultsData() {
    return searchResultsData;
  }
  
  
  public synchronized void addSearchResults(Search searchResultsData)
  {
    this.searchResultsData = searchResultsData;
    
    foundUsers.addAll(searchResultsData.getResults().getUserList());
    foundServices.addAll(searchResultsData.getResults().getServiceList());
    foundSoapOperations.addAll(searchResultsData.getResults().getSoapOperationList());
    foundServiceProviders.addAll(searchResultsData.getResults().getServiceProviderList());
    foundRegistries.addAll(searchResultsData.getResults().getRegistryList());
  }
  
  
  @Override
  /**
   * NB! Must be synchronised to avoid race conditions!
   */
  public synchronized int getTotalItemCount(int itemType)
  {
    String scopeName = "";
    
    if (itemType == Resource.ALL_RESOURCE_TYPES) {
      // no need for further actions - take value from XML data directly
      return(searchResultsData.getStatistics().getResults().intValue());
    }
    else if (Resource.ALL_SUPPORTED_RESOURCE_TYPES.contains(itemType)) {
      // will use this scope name to find the relevant element within the XML data
      scopeName = Resource.ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES.get(itemType);
    }
    else {
      // not supported resource type
      return (-1);
    }
    
    // find result count for the specified scope
    List<ScopedResults> scopedItemCounts = searchResultsData.getStatistics().getScopedResultsList();
    for (ScopedResults scope : scopedItemCounts) {
      if (scope.getScope().toString().equals(scopeName)) {
        return (scope.getBigIntegerValue().intValue());
      }
    }
    
    // we were searching for item count of a particular type; it wasn't found in the API data -
    // but it's not an error, because we know that the requested result type was legitimate;
    // so return zero to indicate that nothing of this type was found
    return (0);
  }

}
