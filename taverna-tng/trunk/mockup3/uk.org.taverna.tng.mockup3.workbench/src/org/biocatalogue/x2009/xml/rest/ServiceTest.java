/*
 * XML Type:  ServiceTest
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceTest
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServiceTest(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServiceTest extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceTest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("servicetestd0a3type");
    
    /**
     * Gets the "testType" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.TestType getTestType();
    
    /**
     * Sets the "testType" element
     */
    void setTestType(org.biocatalogue.x2009.xml.rest.ServiceTest.TestType testType);
    
    /**
     * Appends and returns a new empty "testType" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.TestType addNewTestType();
    
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
     * Gets the "latestStatus" element
     */
    org.biocatalogue.x2009.xml.rest.MonitoringStatus getLatestStatus();
    
    /**
     * True if has "latestStatus" element
     */
    boolean isSetLatestStatus();
    
    /**
     * Sets the "latestStatus" element
     */
    void setLatestStatus(org.biocatalogue.x2009.xml.rest.MonitoringStatus latestStatus);
    
    /**
     * Appends and returns a new empty "latestStatus" element
     */
    org.biocatalogue.x2009.xml.rest.MonitoringStatus addNewLatestStatus();
    
    /**
     * Unsets the "latestStatus" element
     */
    void unsetLatestStatus();
    
    /**
     * Gets the "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors getAncestors();
    
    /**
     * True if has "ancestors" element
     */
    boolean isSetAncestors();
    
    /**
     * Sets the "ancestors" element
     */
    void setAncestors(org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors ancestors);
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors addNewAncestors();
    
    /**
     * Unsets the "ancestors" element
     */
    void unsetAncestors();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.Related getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.ServiceTest.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceTest.Related addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * An XML testType(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface TestType extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("testtype382belemtype");
        
        /**
         * Gets the "urlMonitor" element
         */
        org.biocatalogue.x2009.xml.rest.UrlMonitor getUrlMonitor();
        
        /**
         * True if has "urlMonitor" element
         */
        boolean isSetUrlMonitor();
        
        /**
         * Sets the "urlMonitor" element
         */
        void setUrlMonitor(org.biocatalogue.x2009.xml.rest.UrlMonitor urlMonitor);
        
        /**
         * Appends and returns a new empty "urlMonitor" element
         */
        org.biocatalogue.x2009.xml.rest.UrlMonitor addNewUrlMonitor();
        
        /**
         * Unsets the "urlMonitor" element
         */
        void unsetUrlMonitor();
        
        /**
         * Gets the "testScript" element
         */
        org.biocatalogue.x2009.xml.rest.TestScript getTestScript();
        
        /**
         * True if has "testScript" element
         */
        boolean isSetTestScript();
        
        /**
         * Sets the "testScript" element
         */
        void setTestScript(org.biocatalogue.x2009.xml.rest.TestScript testScript);
        
        /**
         * Appends and returns a new empty "testScript" element
         */
        org.biocatalogue.x2009.xml.rest.TestScript addNewTestScript();
        
        /**
         * Unsets the "testScript" element
         */
        void unsetTestScript();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.TestType newInstance() {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.TestType newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Ancestors extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ancestors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("ancestors700felemtype");
        
        /**
         * Gets the "service" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getService();
        
        /**
         * Sets the "service" element
         */
        void setService(org.biocatalogue.x2009.xml.rest.ResourceLink service);
        
        /**
         * Appends and returns a new empty "service" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewService();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors newInstance() {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Related extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("related583aelemtype");
        
        /**
         * Gets the "results" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getResults();
        
        /**
         * Sets the "results" element
         */
        void setResults(org.biocatalogue.x2009.xml.rest.ResourceLink results);
        
        /**
         * Appends and returns a new empty "results" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewResults();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.ServiceTest.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.ServiceTest.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServiceTest newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceTest parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceTest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
