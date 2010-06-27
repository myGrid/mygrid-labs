/*
 * XML Type:  SearchStatistics
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchStatistics
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SearchStatistics(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SearchStatistics extends org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchStatistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("searchstatistics1bd9type");
    
    /**
     * Gets a List of "scopedResults" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults> getScopedResultsList();
    
    /**
     * Gets array of all "scopedResults" elements
     * @deprecated
     */
    @Deprecated
    org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[] getScopedResultsArray();
    
    /**
     * Gets ith "scopedResults" element
     */
    org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults getScopedResultsArray(int i);
    
    /**
     * Returns number of "scopedResults" element
     */
    int sizeOfScopedResultsArray();
    
    /**
     * Sets array of all "scopedResults" element
     */
    void setScopedResultsArray(org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[] scopedResultsArray);
    
    /**
     * Sets ith "scopedResults" element
     */
    void setScopedResultsArray(int i, org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults scopedResults);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scopedResults" element
     */
    org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults insertNewScopedResults(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scopedResults" element
     */
    org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults addNewScopedResults();
    
    /**
     * Removes the ith "scopedResults" element
     */
    void removeScopedResults(int i);
    
    /**
     * An XML scopedResults(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchStatistics$ScopedResults.
     */
    public interface ScopedResults extends org.apache.xmlbeans.XmlNonNegativeInteger
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ScopedResults.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("scopedresultse567elemtype");
        
        /**
         * Gets the "scope" attribute
         */
        org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum getScope();
        
        /**
         * Gets (as xml) the "scope" attribute
         */
        org.biocatalogue.x2009.xml.rest.SearchScopeName xgetScope();
        
        /**
         * True if has "scope" attribute
         */
        boolean isSetScope();
        
        /**
         * Sets the "scope" attribute
         */
        void setScope(org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum scope);
        
        /**
         * Sets (as xml) the "scope" attribute
         */
        void xsetScope(org.biocatalogue.x2009.xml.rest.SearchScopeName scope);
        
        /**
         * Unsets the "scope" attribute
         */
        void unsetScope();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchStatistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
