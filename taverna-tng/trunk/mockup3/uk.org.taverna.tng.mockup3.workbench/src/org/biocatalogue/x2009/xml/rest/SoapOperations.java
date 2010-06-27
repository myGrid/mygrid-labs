/*
 * XML Type:  SoapOperations
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperations
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SoapOperations(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SoapOperations extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapOperations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("soapoperationse805type");
    
    /**
     * Gets the "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters getParameters();
    
    /**
     * Sets the "parameters" element
     */
    void setParameters(org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters parameters);
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters addNewParameters();
    
    /**
     * Gets the "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics getStatistics();
    
    /**
     * Sets the "statistics" element
     */
    void setStatistics(org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics statistics);
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics addNewStatistics();
    
    /**
     * Gets the "results" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Results getResults();
    
    /**
     * Sets the "results" element
     */
    void setResults(org.biocatalogue.x2009.xml.rest.SoapOperations.Results results);
    
    /**
     * Appends and returns a new empty "results" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Results addNewResults();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Related getRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.SoapOperations.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperations.Related addNewRelated();
    
    /**
     * An XML parameters(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Parameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("parametersefbfelemtype");
        
        /**
         * Gets the "filters" element
         */
        org.biocatalogue.x2009.xml.rest.FiltersParameters getFilters();
        
        /**
         * Sets the "filters" element
         */
        void setFilters(org.biocatalogue.x2009.xml.rest.FiltersParameters filters);
        
        /**
         * Appends and returns a new empty "filters" element
         */
        org.biocatalogue.x2009.xml.rest.FiltersParameters addNewFilters();
        
        /**
         * Gets the "query" element
         */
        org.biocatalogue.x2009.xml.rest.SearchQueryParameter getQuery();
        
        /**
         * Sets the "query" element
         */
        void setQuery(org.biocatalogue.x2009.xml.rest.SearchQueryParameter query);
        
        /**
         * Appends and returns a new empty "query" element
         */
        org.biocatalogue.x2009.xml.rest.SearchQueryParameter addNewQuery();
        
        /**
         * Gets the "sortBy" element
         */
        org.biocatalogue.x2009.xml.rest.SortByParameter getSortBy();
        
        /**
         * Sets the "sortBy" element
         */
        void setSortBy(org.biocatalogue.x2009.xml.rest.SortByParameter sortBy);
        
        /**
         * Appends and returns a new empty "sortBy" element
         */
        org.biocatalogue.x2009.xml.rest.SortByParameter addNewSortBy();
        
        /**
         * Gets the "sortOrder" element
         */
        org.biocatalogue.x2009.xml.rest.SortOrderParameter getSortOrder();
        
        /**
         * Sets the "sortOrder" element
         */
        void setSortOrder(org.biocatalogue.x2009.xml.rest.SortOrderParameter sortOrder);
        
        /**
         * Appends and returns a new empty "sortOrder" element
         */
        org.biocatalogue.x2009.xml.rest.SortOrderParameter addNewSortOrder();
        
        /**
         * Gets the "page" element
         */
        org.biocatalogue.x2009.xml.rest.PageParameter getPage();
        
        /**
         * Sets the "page" element
         */
        void setPage(org.biocatalogue.x2009.xml.rest.PageParameter page);
        
        /**
         * Appends and returns a new empty "page" element
         */
        org.biocatalogue.x2009.xml.rest.PageParameter addNewPage();
        
        /**
         * Gets the "pageSize" element
         */
        org.biocatalogue.x2009.xml.rest.PageSizeParameter getPageSize();
        
        /**
         * Sets the "pageSize" element
         */
        void setPageSize(org.biocatalogue.x2009.xml.rest.PageSizeParameter pageSize);
        
        /**
         * Appends and returns a new empty "pageSize" element
         */
        org.biocatalogue.x2009.xml.rest.PageSizeParameter addNewPageSize();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML statistics(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Statistics extends org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("statisticse8e6elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML results(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Results extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Results.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("resultsea63elemtype");
        
        /**
         * Gets array of all "soapOperation" elements
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Results newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Results newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Related extends org.biocatalogue.x2009.xml.rest.CollectionCoreRelatedLinks
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("relateda50eelemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperations.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperations.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SoapOperations newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.SoapOperations parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
