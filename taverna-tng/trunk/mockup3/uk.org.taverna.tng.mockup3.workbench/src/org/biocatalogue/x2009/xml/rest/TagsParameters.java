/*
 * XML Type:  TagsParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagsParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML TagsParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface TagsParameters extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TagsParameters.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("tagsparameters2a11type");
    
    /**
     * Gets the "sort" element
     */
    org.biocatalogue.x2009.xml.rest.TagsParameters.Sort getSort();
    
    /**
     * Sets the "sort" element
     */
    void setSort(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort sort);
    
    /**
     * Appends and returns a new empty "sort" element
     */
    org.biocatalogue.x2009.xml.rest.TagsParameters.Sort addNewSort();
    
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
     * Gets the "limit" element
     */
    java.math.BigInteger getLimit();
    
    /**
     * Gets (as xml) the "limit" element
     */
    org.apache.xmlbeans.XmlNonNegativeInteger xgetLimit();
    
    /**
     * Tests for nil "limit" element
     */
    boolean isNilLimit();
    
    /**
     * Sets the "limit" element
     */
    void setLimit(java.math.BigInteger limit);
    
    /**
     * Sets (as xml) the "limit" element
     */
    void xsetLimit(org.apache.xmlbeans.XmlNonNegativeInteger limit);
    
    /**
     * Nils the "limit" element
     */
    void setNilLimit();
    
    /**
     * An XML sort(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort.
     */
    public interface Sort extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sort.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("sort0b97elemtype");
        
        /**
         * Gets the "urlKey" attribute
         */
        org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey.Enum getUrlKey();
        
        /**
         * Gets (as xml) the "urlKey" attribute
         */
        org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey xgetUrlKey();
        
        /**
         * Sets the "urlKey" attribute
         */
        void setUrlKey(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey.Enum urlKey);
        
        /**
         * Sets (as xml) the "urlKey" attribute
         */
        void xsetUrlKey(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey urlKey);
        
        /**
         * Gets the "urlValue" attribute
         */
        org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue.Enum getUrlValue();
        
        /**
         * Gets (as xml) the "urlValue" attribute
         */
        org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue xgetUrlValue();
        
        /**
         * True if has "urlValue" attribute
         */
        boolean isSetUrlValue();
        
        /**
         * Sets the "urlValue" attribute
         */
        void setUrlValue(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue.Enum urlValue);
        
        /**
         * Sets (as xml) the "urlValue" attribute
         */
        void xsetUrlValue(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue urlValue);
        
        /**
         * Unsets the "urlValue" attribute
         */
        void unsetUrlValue();
        
        /**
         * An XML urlKey(@).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlKey.
         */
        public interface UrlKey extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UrlKey.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("urlkeya127attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum SORT = Enum.forString("sort");
            
            static final int INT_SORT = Enum.INT_SORT;
            
            /**
             * Enumeration value class for org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlKey.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_SORT
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
                
                static final int INT_SORT = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("sort", INT_SORT),
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
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey newValue(java.lang.Object obj) {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey) type.newValue( obj ); }
                
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML urlValue(@).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlValue.
         */
        public interface UrlValue extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(UrlValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("urlvalue4079attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum COUNTS = Enum.forString("counts");
            static final Enum NAME = Enum.forString("name");
            
            static final int INT_COUNTS = Enum.INT_COUNTS;
            static final int INT_NAME = Enum.INT_NAME;
            
            /**
             * Enumeration value class for org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlValue.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_COUNTS
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
                
                static final int INT_COUNTS = 1;
                static final int INT_NAME = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("counts", INT_COUNTS),
                      new Enum("name", INT_NAME),
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
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue newValue(java.lang.Object obj) {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue) type.newValue( obj ); }
                
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort newInstance() {
              return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.TagsParameters.Sort newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.TagsParameters newInstance() {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.TagsParameters parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.TagsParameters) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
