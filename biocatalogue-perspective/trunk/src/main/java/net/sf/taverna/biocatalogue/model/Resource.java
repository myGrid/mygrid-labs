package net.sf.taverna.biocatalogue.model;

import javax.swing.Icon;
import javax.swing.ListCellRenderer;

import net.sf.taverna.biocatalogue.ui.JResourceListCellRenderer;
import net.sf.taverna.biocatalogue.ui.JServiceListCellRenderer;

import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.ServiceProviders;
import org.biocatalogue.x2009.xml.rest.Services;
import org.biocatalogue.x2009.xml.rest.User;
import org.biocatalogue.x2009.xml.rest.Users;

/**
 * @author Sergejs Aleksejevs
 */
public class Resource
{
  /**
   * A single point of definition of the types of resources that the BioCatalogue plugin
   * "knows" about. This enum provides various details about resource types -
   * display names for single items of that type, names of collections of items of that
   * type, icons to represent the items of a particular type, etc.
   * 
   * @author Sergejs Aleksejevs
   */
  public static enum TYPE
  {
    // the order is important - all these types will appear in the user interface
    // in the same order as listed here
    SOAPOperation ("SOAP Operation", "SOAP Operations", true, true, ResourceManager.getImageIcon(ResourceManager.SERVICE_OPERATION_ICON),  // TODO - identical icons -- replace
                   new JResourceListCellRenderer(), BioCatalogueClient.API_SOAP_OPERATIONS_URL, BioCatalogueClient.API_SCOPE_SOAP_OPERATIONS, null, null),
                   
    RESTMethod    ("REST Method", "REST Methods", true, true, ResourceManager.getImageIcon(ResourceManager.SERVICE_OPERATION_ICON),        // TODO - identical icons
                   new JResourceListCellRenderer(), BioCatalogueClient.API_REST_METHODS_URL, BioCatalogueClient.API_SCOPE_REST_METHODS, null, null),
                   
    Service       ("Web Service", "Web Services", true, true, ResourceManager.getImageIcon(ResourceManager.SERVICE_ICON),
                   new JServiceListCellRenderer(), BioCatalogueClient.API_SERVICES_URL, BioCatalogueClient.API_SCOPE_SERVICES,
                   Service.class, Services.class),
                   
    ServiceProvider ("Service Provider", "Service Providers", false, false, ResourceManager.getImageIcon(ResourceManager.SERVICE_PROVIDER_ICON),
                     new JResourceListCellRenderer(), BioCatalogueClient.API_SERVICE_PROVIDERS_URL, BioCatalogueClient.API_SCOPE_SERVICE_PROVIDERS,
                     ServiceProvider.class, ServiceProviders.class),
                     
    User          ("User", "Users", false, false, ResourceManager.getImageIcon(ResourceManager.USER_ICON),
                   new JResourceListCellRenderer(), BioCatalogueClient.API_USERS_URL, BioCatalogueClient.API_SCOPE_USERS, User.class, Users.class);
    
    private String resourceTypeName;
    private String resourceCollectionName;
    private boolean defaultType;
    private boolean suitableForTagSearch;
    private Icon icon;
    private ListCellRenderer resultListingCellRenderer;
    private String apiResourceCollectionIndex;
    private String apiScopeParameterValue;
    private Class<?> xmlbeansGeneratedClass;
    private Class<?> xmlbeansGeneratedCollectionClass;
    
    TYPE(String resourceTypeName, String resourceCollectionName, boolean defaultType, boolean suitableForTagSearch,
                  Icon icon, ListCellRenderer resultListingCellRenderer, String apiResourceCollectionIndex,
                  String apiScopeParameterValue, Class xmlbeansGeneratedClass, Class xmlbeansGeneratedCollectionClass)
    {
      this.resourceTypeName = resourceTypeName;
      this.resourceCollectionName = resourceCollectionName;
      this.defaultType = defaultType;
      this.suitableForTagSearch = suitableForTagSearch;
      this.icon = icon;
      this.resultListingCellRenderer = resultListingCellRenderer;
      this.apiResourceCollectionIndex = apiResourceCollectionIndex;
      this.apiScopeParameterValue = apiScopeParameterValue;
      this.xmlbeansGeneratedClass = xmlbeansGeneratedClass;
      this.xmlbeansGeneratedCollectionClass = xmlbeansGeneratedCollectionClass;
    }
    
    public String getTypeName() {
      return this.resourceTypeName;
    }
    
    public String getCollectionName() {
      return this.resourceCollectionName;
    }
    
    /**
     * @return <code>true</code> - if used for search by default;<br/>
     *         <code>false</code> - otherwise.
     */
    public boolean isDefaultSearchType() {
      return this.defaultType;
    }
    
    /**
     * Resources not of all resource types can be searched for by tags (although every resource type
     * can be searched for by a free-text query).
     * 
     * @return <code>true</code> if resources of this type can be searched for by tags,<br/>
     *         <code>false</code> otherwise.
     */
    public boolean isSuitableForTagSearch() {
      return this.suitableForTagSearch;
    }
    
    /**
     * @return Small icon that represents this resource type.
     */
    public Icon getIcon() {
      return this.icon;
    }
    
    public ListCellRenderer getResultListingCellRenderer() {
      return this.resultListingCellRenderer;
    }
    
    /**
     * @return URL that in the BioCatalogue API that provides an index of the collection of
     *         all resources of this type.
     */
    public String getAPIResourceCollectionIndex() {
      return apiResourceCollectionIndex;
    }
    
    /**
     * @return Value for the "scope" parameter to be used in the BioCatalogue API search requests
     *         in order to retrieve items of this type. 
     */
    public String getAPIScopeParameterValue() {
      return apiScopeParameterValue;
    }
    
    public Class getXmlBeansGeneratedClass() {
      return this.xmlbeansGeneratedClass;
    }
    
    /**
     * @return Class that represents collection of resources of this type,
     *         as represented by XmlBeans.
     */
    public Class getXmlBeansGeneratedCollectionClass() {
      return this.xmlbeansGeneratedCollectionClass;
    }
    
    
    /**
     * This method is useful for adding / removing tabs into the results view - provides
     * and index for the tabbed view to place a tab, relevant to a particular resource type.
     * This helps to preserve the order of tabs after adding / removing them.
     * 
     * @return Zero-based index of this resource type in the <code>RESOURCE_TYPE</code> enum or 
     *         <code>-1</code> if not found (which is impossible under normal conditions).
     */
    public int index()
    {
      TYPE[] values = TYPE.values();
      for (int i = 0; i < values.length; i++) {
        if (this == values[i]) {
          return (i);
        }
      }
      return (-1);
    }

    
  };
  
  
  
  // current resource data
  private final TYPE resourceType;
  private final String resourceURL;
  private final String resourceTitle;
  
  
  public Resource(String resourceURL, String resourceTitle)
  {
    this.resourceURL = extractPureResourceURLFromPreviewActionCommand(resourceURL);
    this.resourceTitle = resourceTitle;
    this.resourceType = getResourceTypeFromResourceURL(resourceURL);
  }
  
  public TYPE getType() {
    return resourceType;
  }
  
  public String getURL() {
    return resourceURL;
  }

  public String getTitle() {
    return resourceTitle;
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
   * @param url Either URL of the resource in BioCatalogue or preview action command
   *            ({@link BioCataloguePluginConstants#ACTION_PREVIEW_RESOURCE}).
   * @return Type of this resource according to the BioCatalogue URL that points to this
   *         resource or <code>null</code> if the type of the resource couldn't be determined.
   */
  public static TYPE getResourceTypeFromResourceURL(String url)
  {
    String pureURL = extractPureResourceURLFromPreviewActionCommand(url);
    
    if (pureURL.startsWith(BioCatalogueClient.API_SERVICES_URL))               return(TYPE.Service);
    else if (pureURL.startsWith(BioCatalogueClient.API_SOAP_OPERATIONS_URL))   return(TYPE.SOAPOperation);
    else if (pureURL.startsWith(BioCatalogueClient.API_REST_METHODS_URL))      return(TYPE.RESTMethod);
    else if (pureURL.startsWith(BioCatalogueClient.API_SERVICE_PROVIDERS_URL)) return(TYPE.ServiceProvider);
    else if (pureURL.startsWith(BioCatalogueClient.API_USERS_URL))             return(TYPE.User);
    else {
      return (null);
    }
  }
  
  
  /**
   * @param previewActionCommand Either resource preview action command or a 'pure' resource URL already.
   * @return A "pure" resource URL in BioCatalogue with the action prefix
   *         ({@link BioCataloguePluginConstants#ACTION_PREVIEW_RESOURCE}) removed. 
   */
  public static String extractPureResourceURLFromPreviewActionCommand(String previewActionCommand)
  {
    return (previewActionCommand.startsWith(BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE) ?
            previewActionCommand.substring(BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE.length()) :
            previewActionCommand);
  }
  
}
