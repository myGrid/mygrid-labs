package org.biocatalogue.api.client.search;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * This class provides functionality to deal with service filtering settings.
 * Particularly used to save the current state of the filtering tree as a
 * favourite filter.
 * 
 * Instances of this class hold all necessary information to restore the
 * filtering state at a later point.
 * 
 * FIXME: this class needs redoing as it used to be UI specific, but now is just a shell.
 * 
 * @author Sergejs Aleksejevs
 * @author Jiten Bhagat
 */
public class ServiceFilteringSettings implements Comparable<ServiceFilteringSettings>, Serializable
{
  private static final long serialVersionUID = -5706169924295062628L;
  
  private String filterName;
  private int filteringCriteriaNumber;

  private Map<String,String[]> filteringURLParameters;
  
  public ServiceFilteringSettings()
  {
    this(null);
  }
  
  /**
   * 
   * @param filterName The name to associate with this filter.
   */
  public ServiceFilteringSettings(String filterName)
  {
    this.filterName = filterName;
    
    this.filteringCriteriaNumber = -1;	// FIXME!
    this.filteringURLParameters = new HashMap<String, String[]>(); 	// FIXME: allow populating of filters
  }
  
  public Map<String,String[]> getFilteringURLParameters()
  {
    return filteringURLParameters;
  }
  
  
  // *** Getters ***
  
  public String getFilterName() {
    return (this.filterName == null || filterName.length() == 0 ? "untitled filter" : this.filterName);
  }
  
  /**
   * @return Number of filtering criteria within the current filter.
   */
  public int getNumberOfFilteringCriteria() {
    return filteringCriteriaNumber;
  }
  
  // *** End of getters ***
  
  
  public boolean equals(Object other)
  {
    if (other instanceof ServiceFilteringSettings)
    {
      ServiceFilteringSettings o = (ServiceFilteringSettings)other;
      return (this.filterName.equals(o.filterName));	// FIXME!
    }
    else {
      return false;
    }
  }
  
  
  public int compareTo(ServiceFilteringSettings other)
  {
    int iOrdering = this.filterName.compareTo(other.filterName);
    if (iOrdering == 0) {
      iOrdering = this.getNumberOfFilteringCriteria() - other.getNumberOfFilteringCriteria();
    }
    
    // inverse order, as the traversal of lists in the favourite filters panel is
    // done this way round
    return (-1 * iOrdering);
  }
  
  
  public String toString() {
    return ("Filter: '" + getFilterName() + "' [" + detailsAsString() + "]");
  }
  
  public String detailsAsString() {
    return (getNumberOfFilteringCriteria() + " filtering criteria");
  }
}
