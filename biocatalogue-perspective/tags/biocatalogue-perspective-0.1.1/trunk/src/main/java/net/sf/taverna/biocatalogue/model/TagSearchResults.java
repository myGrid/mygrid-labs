package net.sf.taverna.biocatalogue.model;

import org.biocatalogue.x2009.xml.rest.Services;

/**
 * This class represents results of searches by tags.
 * 
 * NB! Currently this class is nearly identical to <code>ServiceFilteringSearchResults</code>.
 *     This is because the plugin currently deals only with tagged services - nothing else.
 * 
 * @author Sergejs Aleksejevs
 */
public class TagSearchResults extends SearchResults
{
  private static final long serialVersionUID = -6926508328400528040L;
  
  private Services foundServicesData;
  
  
  public TagSearchResults() {
    super();
  }
  
  
  public synchronized void addFoundServicesData(Services foundServicesData)
  {
    this.foundServicesData = foundServicesData;
    
    foundServices.addAll(foundServicesData.getResults().getServiceList());
  }
  
  public Services getFoundServicesData() {
    return foundServicesData;
  }
  
  
  @Override
  /**
   * Will need to update this method to count the sum of totals for each type, when
   * there are more tagged item types, except for just services.
   */
  public synchronized int getTotalItemCount(int itemType)
  {
    switch (itemType) {
      case Resource.ALL_RESOURCE_TYPES:  // break deliberately skipped, because need to "fall through" to SERVICE_TYPE
      case Resource.SERVICE_TYPE:        return (foundServicesData.getStatistics().getResults().intValue());
      default: return(-1);
    }
  }
  
  
  
  
  
  
  
  

}
