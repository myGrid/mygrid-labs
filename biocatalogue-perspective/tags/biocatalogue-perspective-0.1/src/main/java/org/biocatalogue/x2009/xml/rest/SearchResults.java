/*
 * XML Type:  SearchResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SearchResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SearchResults extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("searchresultsc26atype");
    
    /**
     * Gets a List of "service" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.Service> getServiceList();
    
    /**
     * Gets array of all "service" elements
     * @deprecated
     */
    org.biocatalogue.x2009.xml.rest.Service[] getServiceArray();
    
    /**
     * Gets ith "service" element
     */
    org.biocatalogue.x2009.xml.rest.Service getServiceArray(int i);
    
    /**
     * Returns number of "service" element
     */
    int sizeOfServiceArray();
    
    /**
     * Sets array of all "service" element
     */
    void setServiceArray(org.biocatalogue.x2009.xml.rest.Service[] serviceArray);
    
    /**
     * Sets ith "service" element
     */
    void setServiceArray(int i, org.biocatalogue.x2009.xml.rest.Service service);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    org.biocatalogue.x2009.xml.rest.Service insertNewService(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    org.biocatalogue.x2009.xml.rest.Service addNewService();
    
    /**
     * Removes the ith "service" element
     */
    void removeService(int i);
    
    /**
     * Gets a List of "soapOperation" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.SoapOperation> getSoapOperationList();
    
    /**
     * Gets array of all "soapOperation" elements
     * @deprecated
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation[] getSoapOperationArray();
    
    /**
     * Gets ith "soapOperation" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation getSoapOperationArray(int i);
    
    /**
     * Returns number of "soapOperation" element
     */
    int sizeOfSoapOperationArray();
    
    /**
     * Sets array of all "soapOperation" element
     */
    void setSoapOperationArray(org.biocatalogue.x2009.xml.rest.SoapOperation[] soapOperationArray);
    
    /**
     * Sets ith "soapOperation" element
     */
    void setSoapOperationArray(int i, org.biocatalogue.x2009.xml.rest.SoapOperation soapOperation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soapOperation" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation insertNewSoapOperation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soapOperation" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation addNewSoapOperation();
    
    /**
     * Removes the ith "soapOperation" element
     */
    void removeSoapOperation(int i);
    
    /**
     * Gets a List of "serviceProvider" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.ServiceProvider> getServiceProviderList();
    
    /**
     * Gets array of all "serviceProvider" elements
     * @deprecated
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvider[] getServiceProviderArray();
    
    /**
     * Gets ith "serviceProvider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvider getServiceProviderArray(int i);
    
    /**
     * Returns number of "serviceProvider" element
     */
    int sizeOfServiceProviderArray();
    
    /**
     * Sets array of all "serviceProvider" element
     */
    void setServiceProviderArray(org.biocatalogue.x2009.xml.rest.ServiceProvider[] serviceProviderArray);
    
    /**
     * Sets ith "serviceProvider" element
     */
    void setServiceProviderArray(int i, org.biocatalogue.x2009.xml.rest.ServiceProvider serviceProvider);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceProvider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvider insertNewServiceProvider(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceProvider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvider addNewServiceProvider();
    
    /**
     * Removes the ith "serviceProvider" element
     */
    void removeServiceProvider(int i);
    
    /**
     * Gets a List of "user" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.User> getUserList();
    
    /**
     * Gets array of all "user" elements
     * @deprecated
     */
    org.biocatalogue.x2009.xml.rest.User[] getUserArray();
    
    /**
     * Gets ith "user" element
     */
    org.biocatalogue.x2009.xml.rest.User getUserArray(int i);
    
    /**
     * Returns number of "user" element
     */
    int sizeOfUserArray();
    
    /**
     * Sets array of all "user" element
     */
    void setUserArray(org.biocatalogue.x2009.xml.rest.User[] userArray);
    
    /**
     * Sets ith "user" element
     */
    void setUserArray(int i, org.biocatalogue.x2009.xml.rest.User user);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    org.biocatalogue.x2009.xml.rest.User insertNewUser(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
     */
    org.biocatalogue.x2009.xml.rest.User addNewUser();
    
    /**
     * Removes the ith "user" element
     */
    void removeUser(int i);
    
    /**
     * Gets a List of "registry" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.Registry> getRegistryList();
    
    /**
     * Gets array of all "registry" elements
     * @deprecated
     */
    org.biocatalogue.x2009.xml.rest.Registry[] getRegistryArray();
    
    /**
     * Gets ith "registry" element
     */
    org.biocatalogue.x2009.xml.rest.Registry getRegistryArray(int i);
    
    /**
     * Returns number of "registry" element
     */
    int sizeOfRegistryArray();
    
    /**
     * Sets array of all "registry" element
     */
    void setRegistryArray(org.biocatalogue.x2009.xml.rest.Registry[] registryArray);
    
    /**
     * Sets ith "registry" element
     */
    void setRegistryArray(int i, org.biocatalogue.x2009.xml.rest.Registry registry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "registry" element
     */
    org.biocatalogue.x2009.xml.rest.Registry insertNewRegistry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "registry" element
     */
    org.biocatalogue.x2009.xml.rest.Registry addNewRegistry();
    
    /**
     * Removes the ith "registry" element
     */
    void removeRegistry(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SearchResults newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.SearchResults parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
