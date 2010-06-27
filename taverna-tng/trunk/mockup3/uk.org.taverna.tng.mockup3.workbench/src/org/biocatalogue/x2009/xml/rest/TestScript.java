/*
 * XML Type:  TestScript
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TestScript
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML TestScript(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface TestScript extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestScript.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("testscriptdb2btype");
    
    /**
     * Gets the "name" element
     */
    java.lang.String getName();
    
    /**
     * Gets (as xml) the "name" element
     */
    org.apache.xmlbeans.XmlString xgetName();
    
    /**
     * Sets the "name" element
     */
    void setName(java.lang.String name);
    
    /**
     * Sets (as xml) the "name" element
     */
    void xsetName(org.apache.xmlbeans.XmlString name);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Gets the "contentType" element
     */
    java.lang.String getContentType();
    
    /**
     * Gets (as xml) the "contentType" element
     */
    org.apache.xmlbeans.XmlString xgetContentType();
    
    /**
     * Sets the "contentType" element
     */
    void setContentType(java.lang.String contentType);
    
    /**
     * Sets (as xml) the "contentType" element
     */
    void xsetContentType(org.apache.xmlbeans.XmlString contentType);
    
    /**
     * Gets the "programmingLanguage" element
     */
    java.lang.String getProgrammingLanguage();
    
    /**
     * Gets (as xml) the "programmingLanguage" element
     */
    org.apache.xmlbeans.XmlString xgetProgrammingLanguage();
    
    /**
     * Sets the "programmingLanguage" element
     */
    void setProgrammingLanguage(java.lang.String programmingLanguage);
    
    /**
     * Sets (as xml) the "programmingLanguage" element
     */
    void xsetProgrammingLanguage(org.apache.xmlbeans.XmlString programmingLanguage);
    
    /**
     * Gets the "executableFilename" element
     */
    java.lang.String getExecutableFilename();
    
    /**
     * Gets (as xml) the "executableFilename" element
     */
    org.apache.xmlbeans.XmlString xgetExecutableFilename();
    
    /**
     * Sets the "executableFilename" element
     */
    void setExecutableFilename(java.lang.String executableFilename);
    
    /**
     * Sets (as xml) the "executableFilename" element
     */
    void xsetExecutableFilename(org.apache.xmlbeans.XmlString executableFilename);
    
    /**
     * Gets the "download" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getDownload();
    
    /**
     * Sets the "download" element
     */
    void setDownload(org.biocatalogue.x2009.xml.rest.ResourceLink download);
    
    /**
     * Appends and returns a new empty "download" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewDownload();
    
    /**
     * Gets the "submitter" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getSubmitter();
    
    /**
     * Sets the "submitter" element
     */
    void setSubmitter(org.biocatalogue.x2009.xml.rest.ResourceLink submitter);
    
    /**
     * Appends and returns a new empty "submitter" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewSubmitter();
    
    /**
     * Gets the "created" element
     */
    java.util.Calendar getCreated();
    
    /**
     * Gets (as xml) the "created" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreated();
    
    /**
     * Sets the "created" element
     */
    void setCreated(java.util.Calendar created);
    
    /**
     * Sets (as xml) the "created" element
     */
    void xsetCreated(org.apache.xmlbeans.XmlDateTime created);
    
    /**
     * Gets the "activatedAt" element
     */
    java.util.Calendar getActivatedAt();
    
    /**
     * Gets (as xml) the "activatedAt" element
     */
    org.apache.xmlbeans.XmlDateTime xgetActivatedAt();
    
    /**
     * Tests for nil "activatedAt" element
     */
    boolean isNilActivatedAt();
    
    /**
     * Sets the "activatedAt" element
     */
    void setActivatedAt(java.util.Calendar activatedAt);
    
    /**
     * Sets (as xml) the "activatedAt" element
     */
    void xsetActivatedAt(org.apache.xmlbeans.XmlDateTime activatedAt);
    
    /**
     * Nils the "activatedAt" element
     */
    void setNilActivatedAt();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.TestScript newInstance() {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.TestScript parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.TestScript) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
