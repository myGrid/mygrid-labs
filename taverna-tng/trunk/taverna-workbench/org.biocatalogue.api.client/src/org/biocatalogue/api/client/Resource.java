package org.biocatalogue.api.client;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.ImageIcon;

/**
 * @author Sergejs Aleksejevs
 */
public class Resource
{
  // CONSTANTS for use throughout the plugin
  public static final int UNKNOWN_TYPE = -1;
  
  public static final int ALL_RESOURCE_TYPES = 0;     // a 'shorthand' for enumerating all resource types separately as a list
  
  public static final int SERVICE_TYPE = 1;
  public static final int SOAP_OPERATION_TYPE = 2;
  public static final int SERVICE_PROVIDER_TYPE = 3;
  public static final int USER_TYPE = 4;
  public static final int REGISTRY_TYPE = 5;
  
  public static final Map<Integer,String> ALL_SUPPORTED_RESOURCE_TYPE_NAMES = new TreeMap<Integer,String>() {{
    put(SERVICE_TYPE, "Service");
    put(SOAP_OPERATION_TYPE, "SOAP Operation");
    put(SERVICE_PROVIDER_TYPE, "Service Provider");
    put(USER_TYPE, "User");
    put(REGISTRY_TYPE, "Registry");
  }};
  public static final Map<Integer,String> ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES = new TreeMap<Integer,String>() {{
    put(SERVICE_TYPE, "Services");
    put(SOAP_OPERATION_TYPE, "SOAP Operations");
    put(SERVICE_PROVIDER_TYPE, "Service Providers");
    put(USER_TYPE, "Users");
    put(REGISTRY_TYPE, "Registries");
  }};
  public static final SortedSet<Integer> ALL_SUPPORTED_RESOURCE_TYPES = new TreeSet<Integer>(ALL_SUPPORTED_RESOURCE_TYPE_NAMES.keySet());
  
  
  // current resource data
  private final int resourceType;
  private final String resourceURL;
  private final String resourceTitle;
  
  
  public Resource(String resourceURL, String resourceTitle)
  {
    this.resourceURL = resourceURL;
    this.resourceTitle = resourceTitle;
    this.resourceType = getResourceTypeFromResourceURL(resourceURL);
  }
  
  public int getType() {
    return resourceType;
  }
  
  public String getURL() {
    return resourceURL;
  }

  public String getTitle() {
    return resourceTitle;
  }
  
  public ImageIcon getIcon()
  {
    int iconID = -1;
    
    switch (this.resourceType) {
      case SERVICE_TYPE:          iconID = ResourceManager.SERVICE_ICON; break;
      case SOAP_OPERATION_TYPE:   iconID = ResourceManager.SERVICE_OPERATION_ICON; break;
      case SERVICE_PROVIDER_TYPE: iconID = ResourceManager.SERVICE_PROVIDER_ICON; break;
      case USER_TYPE:             iconID = ResourceManager.USER_ICON; break;
      case REGISTRY_TYPE:         iconID = ResourceManager.REGISTRY_ICON; break;
      default:                    iconID = ResourceManager.CROSS_ICON; break; // unknown type...
    }
    
    return (ResourceManager.getImageIcon(iconID));
  }
  
  
  /**
   * @return Type name for single a item of this resource type (e.g. "Service").
   */
  public String getTypeName() {
    return (getResourceTypeName(this.resourceType));
  }
  
  
  public boolean equals(Object other)
  {
    if (other instanceof Resource)
    {
      // compare by all components
      Resource otherRes = (Resource)other;
      return (this.resourceType == otherRes.resourceType &&
              this.resourceTitle.equals(otherRes.resourceTitle) &&
              this.resourceURL.equals(otherRes.resourceURL));
    }
    else {
      // other object is of different type
      return (false);
    }
  }
  
  
  /**
   * @param resourceType Type of the resource. Values declared as constants in this class.
   * @return Type name for single a item of this resource type (e.g. "Service");
   *         <code>null</code> if the provided <code>resourceType</code> is invalid.
   */
  public static String getResourceTypeName(int resourceType) {
    return (ALL_SUPPORTED_RESOURCE_TYPES.contains(resourceType) ?
            ALL_SUPPORTED_RESOURCE_TYPE_NAMES.get(resourceType) :
            null);
  }
  
  
  /**
   * @param resourceType Type of the resource. Values declared as constants in this class.
   * @return Collection name for items of this resource type (e.g. "Services");
   *         <code>null</code> if the provided <code>resourceType</code> is invalid.
   */
  public static String getResourceCollectionName(int resourceType) {
    return (ALL_SUPPORTED_RESOURCE_TYPES.contains(resourceType) ?
            ALL_SUPPORTED_RESOURCE_COLLECTION_NAMES.get(resourceType) :
            null);
  }
  
  
  /**
   * @param url Either URL of the resource in BioCatalogue or preview action command
   *            (<code>BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE</code>).
   * @return Type of this resource - possible values for resource types are defined
   *         within this class.
   */
  public static int getResourceTypeFromResourceURL(String url)
  {
    String pureURL = url;
    
    if (pureURL.startsWith(BioCatalogueClient.API_SERVICES_URL))               return(SERVICE_TYPE);
    else if (pureURL.startsWith(BioCatalogueClient.API_SOAP_OPERATIONS_URL))   return(SOAP_OPERATION_TYPE);
    else if (pureURL.startsWith(BioCatalogueClient.API_SERVICE_PROVIDERS_URL)) return(SERVICE_PROVIDER_TYPE);
    else if (pureURL.startsWith(BioCatalogueClient.API_USERS_URL))             return(USER_TYPE);
    else if (pureURL.startsWith(BioCatalogueClient.API_REGISTRIES_URL))        return(REGISTRY_TYPE);
    else return(UNKNOWN_TYPE);
  }
  
  
  /**
   * @param resourceType An integer value representing a resource type.
   * @return True if the supplied value is identified as a valid type within
   *         <code>Resource.ALL_SUPPORTED_RESOURCE_TYPES</code> collection;
   *         false otherwise.
   */
  public static boolean isValidType(int resourceType) {
    return (Resource.ALL_SUPPORTED_RESOURCE_TYPES.contains(resourceType));
  }
  
}
