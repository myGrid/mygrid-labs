/*
 * XML Type:  ServiceProviders
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceProviders
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServiceProviders(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServiceProviders extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceProviders.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("serviceproviders25dbtype");
    
    /**
     * Gets the "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersParameters getParameters();
    
    /**
     * Sets the "parameters" element
     */
    void setParameters(org.biocatalogue.x2009.xml.rest.ServiceProvidersParameters parameters);
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersParameters addNewParameters();
    
    /**
     * Gets the "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics getStatistics();
    
    /**
     * Sets the "statistics" element
     */
    void setStatistics(org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics statistics);
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics addNewStatistics();
    
    /**
     * Gets the "results" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersResults getResults();
    
    /**
     * Sets the "results" element
     */
    void setResults(org.biocatalogue.x2009.xml.rest.ServiceProvidersResults results);
    
    /**
     * Appends and returns a new empty "results" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersResults addNewResults();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersRelatedLinks getRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.ServiceProvidersRelatedLinks related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceProvidersRelatedLinks addNewRelated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceProviders parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProviders) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
