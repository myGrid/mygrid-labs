/*
 * XML Type:  ServiceRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServiceRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServiceRelatedLinks extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceRelatedLinks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("servicerelatedlinks5b5ftype");
    
    /**
     * Gets the "withSummary" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getWithSummary();
    
    /**
     * Sets the "withSummary" element
     */
    void setWithSummary(org.biocatalogue.x2009.xml.rest.ResourceLink withSummary);
    
    /**
     * Appends and returns a new empty "withSummary" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithSummary();
    
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
     * Gets the "summary" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getSummary();
    
    /**
     * Sets the "summary" element
     */
    void setSummary(org.biocatalogue.x2009.xml.rest.ResourceLink summary);
    
    /**
     * Appends and returns a new empty "summary" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewSummary();
    
    /**
     * Gets the "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getDeployments();
    
    /**
     * Sets the "deployments" element
     */
    void setDeployments(org.biocatalogue.x2009.xml.rest.ResourceLink deployments);
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewDeployments();
    
    /**
     * Gets the "variants" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getVariants();
    
    /**
     * Sets the "variants" element
     */
    void setVariants(org.biocatalogue.x2009.xml.rest.ResourceLink variants);
    
    /**
     * Appends and returns a new empty "variants" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewVariants();
    
    /**
     * Gets the "monitoring" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getMonitoring();
    
    /**
     * Sets the "monitoring" element
     */
    void setMonitoring(org.biocatalogue.x2009.xml.rest.ResourceLink monitoring);
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewMonitoring();
    
    /**
     * Gets the "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotations();
    
    /**
     * Sets the "annotations" element
     */
    void setAnnotations(org.biocatalogue.x2009.xml.rest.ResourceLink annotations);
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotations();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
