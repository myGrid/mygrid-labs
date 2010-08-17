package net.sf.taverna.biocatalogue.model.search;

import java.util.ArrayList;
import java.util.List;

import net.sf.taverna.biocatalogue.model.Pair;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;

import org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Search;
import org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults;
import org.biocatalogue.x2009.xml.rest.Service;

/**
 * This class represents results of searches by query.
 * 
 * @author Sergejs Aleksejevs
 */
public class QuerySearchResults extends SearchResults
{
  private static final long serialVersionUID = -5507279997579800154L;
  
  
  public QuerySearchResults(TYPE resultResourceType) {
    super(resultResourceType);
  }
  
  
  public List<ResourceLink> getSearchResultsData() {
    return foundItems;
  }
  
  
  public synchronized void addSearchResults(Pair<CollectionCoreStatistics, List<ResourceLink>> searchResultsData)
  {
    this.statistics = searchResultsData.getFirstObject();
    this.foundItems.addAll(searchResultsData.getSecondObject());
  }
  
  
  @Override
  /**
   * NB! Must be synchronised to avoid race conditions!
   */
  public synchronized int getTotalItemCount()
  {
    //FIXME
//    String scopeName = "";
//    
//    if (itemType == Resource.ALL_RESOURCE_TYPES) {
//      // no need for further actions - take value from XML data directly
//      return(searchResultsData.getStatistics().getResults().intValue());
//    }
//    else if (Resource.ALL_SUPPORTED_RESOURCE_TYPES.contains(itemType)) {
//      // will use this scope name to find the relevant element within the XML data
//      scopeName = Resource.ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES.get(itemType);
//    }
//    else {
//      // not supported resource type
//      return (-1);
//    }
//    
//    // find result count for the specified scope
//    List<ScopedResults> scopedItemCounts = searchResultsData.getStatistics().getScopedResultsList();
//    for (ScopedResults scope : scopedItemCounts) {
//      if (scope.getScope().toString().equals(scopeName)) {
//        return (scope.getBigIntegerValue().intValue());
//      }
//    }
//    
//    // we were searching for item count of a particular type; it wasn't found in the API data -
//    // but it's not an error, because we know that the requested result type was legitimate;
//    // so return zero to indicate that nothing of this type was found
    return (this.statistics.getTotal().intValue());
  }

}
