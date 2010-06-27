/*
 * XML Type:  BioCatalogue
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.BioCatalogue
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML BioCatalogue(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface BioCatalogue extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BioCatalogue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("biocatalogue342ftype");
    
    /**
     * Gets the "documentation" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getDocumentation();
    
    /**
     * Sets the "documentation" element
     */
    void setDocumentation(org.biocatalogue.x2009.xml.rest.ResourceLink documentation);
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewDocumentation();
    
    /**
     * Gets the "collections" element
     */
    org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections getCollections();
    
    /**
     * Sets the "collections" element
     */
    void setCollections(org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections collections);
    
    /**
     * Appends and returns a new empty "collections" element
     */
    org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections addNewCollections();
    
    /**
     * An XML collections(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Collections extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Collections.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("collectionsbd4eelemtype");
        
        /**
         * Gets the "search" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getSearch();
        
        /**
         * Sets the "search" element
         */
        void setSearch(org.biocatalogue.x2009.xml.rest.ResourceLink search);
        
        /**
         * Appends and returns a new empty "search" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewSearch();
        
        /**
         * Gets the "services" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getServices();
        
        /**
         * Sets the "services" element
         */
        void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services);
        
        /**
         * Appends and returns a new empty "services" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices();
        
        /**
         * Gets the "soapOperations" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperations();
        
        /**
         * Sets the "soapOperations" element
         */
        void setSoapOperations(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperations);
        
        /**
         * Appends and returns a new empty "soapOperations" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperations();
        
        /**
         * Gets the "categories" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getCategories();
        
        /**
         * Sets the "categories" element
         */
        void setCategories(org.biocatalogue.x2009.xml.rest.ResourceLink categories);
        
        /**
         * Appends and returns a new empty "categories" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewCategories();
        
        /**
         * Gets the "tags" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getTags();
        
        /**
         * Sets the "tags" element
         */
        void setTags(org.biocatalogue.x2009.xml.rest.ResourceLink tags);
        
        /**
         * Appends and returns a new empty "tags" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewTags();
        
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
         * Gets the "annotationAttributes" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationAttributes();
        
        /**
         * Sets the "annotationAttributes" element
         */
        void setAnnotationAttributes(org.biocatalogue.x2009.xml.rest.ResourceLink annotationAttributes);
        
        /**
         * Appends and returns a new empty "annotationAttributes" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationAttributes();
        
        /**
         * Gets the "serviceProviders" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getServiceProviders();
        
        /**
         * Sets the "serviceProviders" element
         */
        void setServiceProviders(org.biocatalogue.x2009.xml.rest.ResourceLink serviceProviders);
        
        /**
         * Appends and returns a new empty "serviceProviders" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewServiceProviders();
        
        /**
         * Gets the "users" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getUsers();
        
        /**
         * Sets the "users" element
         */
        void setUsers(org.biocatalogue.x2009.xml.rest.ResourceLink users);
        
        /**
         * Appends and returns a new empty "users" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewUsers();
        
        /**
         * Gets the "registries" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getRegistries();
        
        /**
         * Sets the "registries" element
         */
        void setRegistries(org.biocatalogue.x2009.xml.rest.ResourceLink registries);
        
        /**
         * Appends and returns a new empty "registries" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewRegistries();
        
        /**
         * Gets the "testResults" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getTestResults();
        
        /**
         * Sets the "testResults" element
         */
        void setTestResults(org.biocatalogue.x2009.xml.rest.ResourceLink testResults);
        
        /**
         * Appends and returns a new empty "testResults" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewTestResults();
        
        /**
         * Gets the "filters" element
         */
        org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters getFilters();
        
        /**
         * Sets the "filters" element
         */
        void setFilters(org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters filters);
        
        /**
         * Appends and returns a new empty "filters" element
         */
        org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters addNewFilters();
        
        /**
         * An XML filters(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public interface Filters extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Filters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("filters4307elemtype");
            
            /**
             * Gets the "services" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink getServices();
            
            /**
             * Sets the "services" element
             */
            void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services);
            
            /**
             * Appends and returns a new empty "services" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices();
            
            /**
             * Gets the "soapOperations" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperations();
            
            /**
             * Sets the "soapOperations" element
             */
            void setSoapOperations(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperations);
            
            /**
             * Appends and returns a new empty "soapOperations" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperations();
            
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
                public static org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections newInstance() {
              return (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue newInstance() {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.BioCatalogue parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.BioCatalogue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
