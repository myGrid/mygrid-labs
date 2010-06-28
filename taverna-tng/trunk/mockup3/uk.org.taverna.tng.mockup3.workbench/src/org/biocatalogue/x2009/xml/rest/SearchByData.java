/*
 * XML Type:  SearchByData
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchByData
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SearchByData(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SearchByData extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchByData.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("searchbydataca57type");
    
    /**
     * Gets the "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Parameters getParameters();
    
    /**
     * Sets the "parameters" element
     */
    void setParameters(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters parameters);
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Parameters addNewParameters();
    
    /**
     * Gets the "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Statistics getStatistics();
    
    /**
     * Sets the "statistics" element
     */
    void setStatistics(org.biocatalogue.x2009.xml.rest.SearchByData.Statistics statistics);
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Statistics addNewStatistics();
    
    /**
     * Gets the "results" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Results getResults();
    
    /**
     * Sets the "results" element
     */
    void setResults(org.biocatalogue.x2009.xml.rest.SearchByData.Results results);
    
    /**
     * Appends and returns a new empty "results" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Results addNewResults();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Related getRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.SearchByData.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.SearchByData.Related addNewRelated();
    
    /**
     * An XML parameters(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Parameters extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Parameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("parameters7891elemtype");
        
        /**
         * Gets the "data" element
         */
        java.lang.String getData();
        
        /**
         * Gets (as xml) the "data" element
         */
        org.apache.xmlbeans.XmlString xgetData();
        
        /**
         * Sets the "data" element
         */
        void setData(java.lang.String data);
        
        /**
         * Sets (as xml) the "data" element
         */
        void xsetData(org.apache.xmlbeans.XmlString data);
        
        /**
         * Gets the "searchType" element
         */
        org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType.Enum getSearchType();
        
        /**
         * Gets (as xml) the "searchType" element
         */
        org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType xgetSearchType();
        
        /**
         * Sets the "searchType" element
         */
        void setSearchType(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType.Enum searchType);
        
        /**
         * Sets (as xml) the "searchType" element
         */
        void xsetSearchType(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType searchType);
        
        /**
         * Gets the "limit" element
         */
        java.math.BigInteger getLimit();
        
        /**
         * Gets (as xml) the "limit" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetLimit();
        
        /**
         * Sets the "limit" element
         */
        void setLimit(java.math.BigInteger limit);
        
        /**
         * Sets (as xml) the "limit" element
         */
        void xsetLimit(org.apache.xmlbeans.XmlNonNegativeInteger limit);
        
        /**
         * An XML searchType(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchByData$Parameters$SearchType.
         */
        public interface SearchType extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SearchType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("searchtype59afelemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum INPUT = Enum.forString("input");
            static final Enum OUTPUT = Enum.forString("output");
            
            static final int INT_INPUT = Enum.INT_INPUT;
            static final int INT_OUTPUT = Enum.INT_OUTPUT;
            
            /**
             * Enumeration value class for org.biocatalogue.x2009.xml.rest.SearchByData$Parameters$SearchType.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_INPUT
             * Enum.forString(s); // returns the enum value for a string
             * Enum.forInt(i); // returns the enum value for an int
             * </pre>
             * Enumeration objects are immutable singleton objects that
             * can be compared using == object equality. They have no
             * public constructor. See the constants defined within this
             * class for all the valid values.
             */
            static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
            {
                /**
                 * Returns the enum value for a string, or null if none.
                 */
                public static Enum forString(java.lang.String s)
                    { return (Enum)table.forString(s); }
                /**
                 * Returns the enum value corresponding to an int, or null if none.
                 */
                public static Enum forInt(int i)
                    { return (Enum)table.forInt(i); }
                
                private Enum(java.lang.String s, int i)
                    { super(s, i); }
                
                static final int INT_INPUT = 1;
                static final int INT_OUTPUT = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("input", INT_INPUT),
                      new Enum("output", INT_OUTPUT),
                    }
                );
                private static final long serialVersionUID = 1L;
                private java.lang.Object readResolve() { return forInt(intValue()); } 
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType newValue(java.lang.Object obj) {
                  return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType) type.newValue( obj ); }
                
                public static org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Parameters newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Parameters newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Statistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("statistics8f78elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Statistics newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Statistics newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Results.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("resultscc35elemtype");
        
        /**
         * Gets a List of "resultItem" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem> getResultItemList();
        
        /**
         * Gets array of all "resultItem" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[] getResultItemArray();
        
        /**
         * Gets ith "resultItem" element
         */
        org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem getResultItemArray(int i);
        
        /**
         * Returns number of "resultItem" element
         */
        int sizeOfResultItemArray();
        
        /**
         * Sets array of all "resultItem" element
         */
        void setResultItemArray(org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[] resultItemArray);
        
        /**
         * Sets ith "resultItem" element
         */
        void setResultItemArray(int i, org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem resultItem);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resultItem" element
         */
        org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem insertNewResultItem(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resultItem" element
         */
        org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem addNewResultItem();
        
        /**
         * Removes the ith "resultItem" element
         */
        void removeResultItem(int i);
        
        /**
         * An XML resultItem(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public interface ResultItem extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultItem.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("resultitemd949elemtype");
            
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
             * Gets the "soapOperation" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperation();
            
            /**
             * Sets the "soapOperation" element
             */
            void setSoapOperation(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperation);
            
            /**
             * Appends and returns a new empty "soapOperation" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperation();
            
            /**
             * Gets the "port" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink getPort();
            
            /**
             * Sets the "port" element
             */
            void setPort(org.biocatalogue.x2009.xml.rest.ResourceLink port);
            
            /**
             * Appends and returns a new empty "port" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink addNewPort();
            
            /**
             * Gets the "annotation" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotation();
            
            /**
             * Sets the "annotation" element
             */
            void setAnnotation(org.biocatalogue.x2009.xml.rest.ResourceLink annotation);
            
            /**
             * Appends and returns a new empty "annotation" element
             */
            org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotation();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Results newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Results newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Results) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("related35a0elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SearchByData.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SearchByData.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SearchByData newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SearchByData parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SearchByData) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
