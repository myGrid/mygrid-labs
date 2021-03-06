/*
 * XML Type:  SoapOutput
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOutput
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SoapOutput(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SoapOutput extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapOutput.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("soapoutputf8datype");
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle2();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle2();
    
    /**
     * Sets the "title" element
     */
    void setTitle2(java.lang.String title2);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle2(org.apache.xmlbeans.XmlString title2);
    
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
     * Gets the "computationalType" element
     */
    java.lang.String getComputationalType();
    
    /**
     * Gets (as xml) the "computationalType" element
     */
    org.apache.xmlbeans.XmlString xgetComputationalType();
    
    /**
     * Sets the "computationalType" element
     */
    void setComputationalType(java.lang.String computationalType);
    
    /**
     * Sets (as xml) the "computationalType" element
     */
    void xsetComputationalType(org.apache.xmlbeans.XmlString computationalType);
    
    /**
     * Gets the "computationalTypeDetails" element
     */
    java.lang.String getComputationalTypeDetails();
    
    /**
     * Gets (as xml) the "computationalTypeDetails" element
     */
    org.apache.xmlbeans.XmlString xgetComputationalTypeDetails();
    
    /**
     * Sets the "computationalTypeDetails" element
     */
    void setComputationalTypeDetails(java.lang.String computationalTypeDetails);
    
    /**
     * Sets (as xml) the "computationalTypeDetails" element
     */
    void xsetComputationalTypeDetails(org.apache.xmlbeans.XmlString computationalTypeDetails);
    
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
     * Gets the "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations getAnnotations();
    
    /**
     * True if has "annotations" element
     */
    boolean isSetAnnotations();
    
    /**
     * Sets the "annotations" element
     */
    void setAnnotations(org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations annotations);
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations addNewAnnotations();
    
    /**
     * Unsets the "annotations" element
     */
    void unsetAnnotations();
    
    /**
     * Gets the "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors getAncestors();
    
    /**
     * True if has "ancestors" element
     */
    boolean isSetAncestors();
    
    /**
     * Sets the "ancestors" element
     */
    void setAncestors(org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors ancestors);
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors addNewAncestors();
    
    /**
     * Unsets the "ancestors" element
     */
    void unsetAncestors();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Related getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.SoapOutput.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOutput.Related addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * An XML annotations(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Annotations extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annotations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("annotations934aelemtype");
        
        /**
         * Gets a List of "annotation" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.Annotation> getAnnotationList();
        
        /**
         * Gets array of all "annotation" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.Annotation[] getAnnotationArray();
        
        /**
         * Gets ith "annotation" element
         */
        org.biocatalogue.x2009.xml.rest.Annotation getAnnotationArray(int i);
        
        /**
         * Returns number of "annotation" element
         */
        int sizeOfAnnotationArray();
        
        /**
         * Sets array of all "annotation" element
         */
        void setAnnotationArray(org.biocatalogue.x2009.xml.rest.Annotation[] annotationArray);
        
        /**
         * Sets ith "annotation" element
         */
        void setAnnotationArray(int i, org.biocatalogue.x2009.xml.rest.Annotation annotation);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        org.biocatalogue.x2009.xml.rest.Annotation insertNewAnnotation(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        org.biocatalogue.x2009.xml.rest.Annotation addNewAnnotation();
        
        /**
         * Removes the ith "annotation" element
         */
        void removeAnnotation(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Annotations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ancestors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("ancestorsbbeeelemtype");
        
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
         * Gets the "soapService" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getSoapService();
        
        /**
         * Sets the "soapService" element
         */
        void setSoapService(org.biocatalogue.x2009.xml.rest.ResourceLink soapService);
        
        /**
         * Appends and returns a new empty "soapService" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapService();
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("relateda263elemtype");
        
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
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOutput.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOutput.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SoapOutput newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SoapOutput parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOutput) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
