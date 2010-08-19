package net.sf.taverna.biocatalogue.model.connectivity;


/**
 * Binding beans for GSON library to instantiate objects
 * from JSON data obtained from the 'Lite' version of the
 * BioCatalogue JSON API.
 * 
 * @author Sergejs Aleksejevs
 */
public class BeansForJSONLiteAPI
{
  public static class SOAPOperationsIndex {
    public SOAPOperationsIndex() { }
    public ResourceLinkWithName[] soap_operations;
  }
  
  public static class RESTMethodsIndex {
    public RESTMethodsIndex() { }
    public ResourceLinkWithName[] rest_methods;
  }
  
  public static class ServicesIndex {
    public ServicesIndex() { }
    public ResourceLinkWithName[] services;
  }
  
  public static class ServiceProvidersIndex {
    public ServiceProvidersIndex() { }
    public ResourceLinkWithName[] service_providers;
  }
  
  public static class UsersIndex {
    public UsersIndex() { }
    public ResourceLinkWithName[] users;
  }
  
  
  public static class ResourceLinkWithName
  {
    private ResourceLinkWithName() { }
    
    private String resource;
    private String name;
    
    public String getURL() {
      return (this.resource);
    }
    
    public String getName() {
      return (this.name);
    }
  }
  
}
