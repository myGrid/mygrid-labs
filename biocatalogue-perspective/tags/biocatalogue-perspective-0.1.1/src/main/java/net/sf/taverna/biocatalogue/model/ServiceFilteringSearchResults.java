package net.sf.taverna.biocatalogue.model;

import org.biocatalogue.x2009.xml.rest.Services;

/**
 * This class represents results of filtering /services.xml
 * endpoint by various criteria. 
 * 
 * @author Sergejs Aleksejevs
 */
public class ServiceFilteringSearchResults extends SearchResults
{
  private static final long serialVersionUID = 8209157594067513106L;
  
  private Services foundServicesData;
  
  
  public ServiceFilteringSearchResults() {
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
