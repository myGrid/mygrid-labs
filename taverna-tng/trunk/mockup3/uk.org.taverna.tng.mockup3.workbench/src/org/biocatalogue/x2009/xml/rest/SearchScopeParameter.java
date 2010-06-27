/*
 * XML Type:  SearchScopeParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchScopeParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SearchScopeParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchScopeParameter.
 */
public interface SearchScopeParameter extends org.biocatalogue.x2009.xml.rest.SearchScopeName
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchScopeParameter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("searchscopeparameter976btype");
    
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum ALL = org.biocatalogue.x2009.xml.rest.SearchScopeName.ALL;
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum SERVICES = org.biocatalogue.x2009.xml.rest.SearchScopeName.SERVICES;
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum SERVICE_PROVIDERS = org.biocatalogue.x2009.xml.rest.SearchScopeName.SERVICE_PROVIDERS;
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum USERS = org.biocatalogue.x2009.xml.rest.SearchScopeName.USERS;
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum REGISTRIES = org.biocatalogue.x2009.xml.rest.SearchScopeName.REGISTRIES;
    static final org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum SOAP_OPERATIONS = org.biocatalogue.x2009.xml.rest.SearchScopeName.SOAP_OPERATIONS;
    
    static final int INT_ALL = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_ALL;
    static final int INT_SERVICES = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_SERVICES;
    static final int INT_SERVICE_PROVIDERS = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_SERVICE_PROVIDERS;
    static final int INT_USERS = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_USERS;
    static final int INT_REGISTRIES = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_REGISTRIES;
    static final int INT_SOAP_OPERATIONS = org.biocatalogue.x2009.xml.rest.SearchScopeName.INT_SOAP_OPERATIONS;
    
    /**
     * Gets the "urlKey" attribute
     */
    java.lang.String getUrlKey();
    
    /**
     * Gets (as xml) the "urlKey" attribute
     */
    org.apache.xmlbeans.XmlString xgetUrlKey();
    
    /**
     * True if has "urlKey" attribute
     */
    boolean isSetUrlKey();
    
    /**
     * Sets the "urlKey" attribute
     */
    void setUrlKey(java.lang.String urlKey);
    
    /**
     * Sets (as xml) the "urlKey" attribute
     */
    void xsetUrlKey(org.apache.xmlbeans.XmlString urlKey);
    
    /**
     * Unsets the "urlKey" attribute
     */
    void unsetUrlKey();
    
    /**
     * Gets the "urlValue" attribute
     */
    org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue.Enum getUrlValue();
    
    /**
     * Gets (as xml) the "urlValue" attribute
     */
    org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue xgetUrlValue();
    
    /**
     * Sets the "urlValue" attribute
     */
    void setUrlValue(org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue.Enum urlValue);
    
    /**
     * Sets (as xml) the "urlValue" attribute
     */
    void xsetUrlValue(org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue urlValue);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchScopeParameter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchScopeParameter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
