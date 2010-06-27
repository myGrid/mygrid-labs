/*
 * XML Type:  ServicesRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServicesRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServicesRelatedLinks extends org.biocatalogue.x2009.xml.rest.CollectionCoreRelatedLinks
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServicesRelatedLinks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("servicesrelatedlinks12fatype");
    
    /**
     * Gets the "filters" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getFilters();
    
    /**
     * Sets the "filters" element
     */
    void setFilters(org.biocatalogue.x2009.xml.rest.ResourceLink filters);
    
    /**
     * Appends and returns a new empty "filters" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewFilters();
    
    /**
     * Gets the "filtersOnCurrentResults" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getFiltersOnCurrentResults();
    
    /**
     * Sets the "filtersOnCurrentResults" element
     */
    void setFiltersOnCurrentResults(org.biocatalogue.x2009.xml.rest.ResourceLink filtersOnCurrentResults);
    
    /**
     * Appends and returns a new empty "filtersOnCurrentResults" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewFiltersOnCurrentResults();
    
    /**
     * Gets the "withSummaries" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithSummaries();
    
    /**
     * Sets the "withSummaries" element
     */
    void setWithSummaries(org.biocatalogue.x2009.xml.rest.ResourceLink withSummaries);
    
    /**
     * Appends and returns a new empty "withSummaries" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithSummaries();
    
    /**
     * Gets the "withDeployments" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithDeployments();
    
    /**
     * Sets the "withDeployments" element
     */
    void setWithDeployments(org.biocatalogue.x2009.xml.rest.ResourceLink withDeployments);
    
    /**
     * Appends and returns a new empty "withDeployments" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithDeployments();
    
    /**
     * Gets the "withVariants" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithVariants();
    
    /**
     * Sets the "withVariants" element
     */
    void setWithVariants(org.biocatalogue.x2009.xml.rest.ResourceLink withVariants);
    
    /**
     * Appends and returns a new empty "withVariants" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithVariants();
    
    /**
     * Gets the "withMonitoring" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithMonitoring();
    
    /**
     * Sets the "withMonitoring" element
     */
    void setWithMonitoring(org.biocatalogue.x2009.xml.rest.ResourceLink withMonitoring);
    
    /**
     * Appends and returns a new empty "withMonitoring" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithMonitoring();
    
    /**
     * Gets the "withAllSections" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithAllSections();
    
    /**
     * Sets the "withAllSections" element
     */
    void setWithAllSections(org.biocatalogue.x2009.xml.rest.ResourceLink withAllSections);
    
    /**
     * Appends and returns a new empty "withAllSections" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithAllSections();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
