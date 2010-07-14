/*
 * XML Type:  RestService
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RestService
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML RestService(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface RestService extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RestService.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("restserviceaf7dtype");
    
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
     * Gets the "documentationUrl" element
     */
    java.lang.String getDocumentationUrl();
    
    /**
     * Gets (as xml) the "documentationUrl" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentationUrl();
    
    /**
     * Sets the "documentationUrl" element
     */
    void setDocumentationUrl(java.lang.String documentationUrl);
    
    /**
     * Sets (as xml) the "documentationUrl" element
     */
    void xsetDocumentationUrl(org.apache.xmlbeans.XmlString documentationUrl);
    
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
     * Gets the "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Deployments getDeployments();
    
    /**
     * True if has "deployments" element
     */
    boolean isSetDeployments();
    
    /**
     * Sets the "deployments" element
     */
    void setDeployments(org.biocatalogue.x2009.xml.rest.RestService.Deployments deployments);
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Deployments addNewDeployments();
    
    /**
     * Unsets the "deployments" element
     */
    void unsetDeployments();
    
    /**
     * Gets the "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Ancestors getAncestors();
    
    /**
     * True if has "ancestors" element
     */
    boolean isSetAncestors();
    
    /**
     * Sets the "ancestors" element
     */
    void setAncestors(org.biocatalogue.x2009.xml.rest.RestService.Ancestors ancestors);
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Ancestors addNewAncestors();
    
    /**
     * Unsets the "ancestors" element
     */
    void unsetAncestors();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Related getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.RestService.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.RestService.Related addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * An XML deployments(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Deployments extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Deployments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("deployments0037elemtype");
        
        /**
         * Gets a List of "serviceDeployment" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> getServiceDeploymentList();
        
        /**
         * Gets array of all "serviceDeployment" elements
         * @deprecated
         */
        org.biocatalogue.x2009.xml.rest.ServiceDeployment[] getServiceDeploymentArray();
        
        /**
         * Gets ith "serviceDeployment" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceDeployment getServiceDeploymentArray(int i);
        
        /**
         * Returns number of "serviceDeployment" element
         */
        int sizeOfServiceDeploymentArray();
        
        /**
         * Sets array of all "serviceDeployment" element
         */
        void setServiceDeploymentArray(org.biocatalogue.x2009.xml.rest.ServiceDeployment[] serviceDeploymentArray);
        
        /**
         * Sets ith "serviceDeployment" element
         */
        void setServiceDeploymentArray(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment serviceDeployment);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "serviceDeployment" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceDeployment insertNewServiceDeployment(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "serviceDeployment" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceDeployment addNewServiceDeployment();
        
        /**
         * Removes the ith "serviceDeployment" element
         */
        void removeServiceDeployment(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.RestService.Deployments newInstance() {
              return (org.biocatalogue.x2009.xml.rest.RestService.Deployments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.RestService.Deployments newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.RestService.Deployments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ancestors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("ancestors4ee9elemtype");
        
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
            public static org.biocatalogue.x2009.xml.rest.RestService.Ancestors newInstance() {
              return (org.biocatalogue.x2009.xml.rest.RestService.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.RestService.Ancestors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.RestService.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("related3714elemtype");
        
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
            public static org.biocatalogue.x2009.xml.rest.RestService.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.RestService.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.RestService.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.RestService.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.RestService newInstance() {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.RestService parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.RestService parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.RestService parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.RestService) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
