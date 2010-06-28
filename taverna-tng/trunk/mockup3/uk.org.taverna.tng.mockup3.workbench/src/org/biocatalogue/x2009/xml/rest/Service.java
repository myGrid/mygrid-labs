/*
 * XML Type:  Service
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Service
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML Service(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface Service extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Service.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("service7c71type");
    
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
     * Gets the "originalSubmitter" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink getOriginalSubmitter();
    
    /**
     * Sets the "originalSubmitter" element
     */
    void setOriginalSubmitter(org.biocatalogue.x2009.xml.rest.ResourceLink originalSubmitter);
    
    /**
     * Appends and returns a new empty "originalSubmitter" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLink addNewOriginalSubmitter();
    
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
     * Gets the "serviceTechnologyTypes" element
     */
    org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes getServiceTechnologyTypes();
    
    /**
     * Sets the "serviceTechnologyTypes" element
     */
    void setServiceTechnologyTypes(org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes serviceTechnologyTypes);
    
    /**
     * Appends and returns a new empty "serviceTechnologyTypes" element
     */
    org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes addNewServiceTechnologyTypes();
    
    /**
     * Gets the "latestMonitoringStatus" element
     */
    org.biocatalogue.x2009.xml.rest.MonitoringStatus getLatestMonitoringStatus();
    
    /**
     * Sets the "latestMonitoringStatus" element
     */
    void setLatestMonitoringStatus(org.biocatalogue.x2009.xml.rest.MonitoringStatus latestMonitoringStatus);
    
    /**
     * Appends and returns a new empty "latestMonitoringStatus" element
     */
    org.biocatalogue.x2009.xml.rest.MonitoringStatus addNewLatestMonitoringStatus();
    
    /**
     * Gets the "created" element
     */
    java.util.Calendar getCreated();
    
    /**
     * Gets (as xml) the "created" element
     */
    org.apache.xmlbeans.XmlDateTime xgetCreated();
    
    /**
     * True if has "created" element
     */
    boolean isSetCreated();
    
    /**
     * Sets the "created" element
     */
    void setCreated(java.util.Calendar created);
    
    /**
     * Sets (as xml) the "created" element
     */
    void xsetCreated(org.apache.xmlbeans.XmlDateTime created);
    
    /**
     * Unsets the "created" element
     */
    void unsetCreated();
    
    /**
     * Gets the "summary" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary getSummary();
    
    /**
     * True if has "summary" element
     */
    boolean isSetSummary();
    
    /**
     * Sets the "summary" element
     */
    void setSummary(org.biocatalogue.x2009.xml.rest.ServiceSummary summary);
    
    /**
     * Appends and returns a new empty "summary" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary addNewSummary();
    
    /**
     * Unsets the "summary" element
     */
    void unsetSummary();
    
    /**
     * Gets the "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Deployments getDeployments();
    
    /**
     * True if has "deployments" element
     */
    boolean isSetDeployments();
    
    /**
     * Sets the "deployments" element
     */
    void setDeployments(org.biocatalogue.x2009.xml.rest.Service.Deployments deployments);
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Deployments addNewDeployments();
    
    /**
     * Unsets the "deployments" element
     */
    void unsetDeployments();
    
    /**
     * Gets the "variants" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Variants getVariants();
    
    /**
     * True if has "variants" element
     */
    boolean isSetVariants();
    
    /**
     * Sets the "variants" element
     */
    void setVariants(org.biocatalogue.x2009.xml.rest.Service.Variants variants);
    
    /**
     * Appends and returns a new empty "variants" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Variants addNewVariants();
    
    /**
     * Unsets the "variants" element
     */
    void unsetVariants();
    
    /**
     * Gets the "monitoring" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Monitoring getMonitoring();
    
    /**
     * True if has "monitoring" element
     */
    boolean isSetMonitoring();
    
    /**
     * Sets the "monitoring" element
     */
    void setMonitoring(org.biocatalogue.x2009.xml.rest.Service.Monitoring monitoring);
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    org.biocatalogue.x2009.xml.rest.Service.Monitoring addNewMonitoring();
    
    /**
     * Unsets the "monitoring" element
     */
    void unsetMonitoring();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * An XML serviceTechnologyTypes(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface ServiceTechnologyTypes extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceTechnologyTypes.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("servicetechnologytypes6c65elemtype");
        
        /**
         * Gets a List of "type" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum> getTypeList();
        
        /**
         * Gets array of all "type" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[] getTypeArray();
        
        /**
         * Gets ith "type" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum getTypeArray(int i);
        
        /**
         * Gets (as xml) a List of "type" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType> xgetTypeList();
        
        /**
         * Gets (as xml) array of all "type" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[] xgetTypeArray();
        
        /**
         * Gets (as xml) ith "type" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType xgetTypeArray(int i);
        
        /**
         * Returns number of "type" element
         */
        int sizeOfTypeArray();
        
        /**
         * Sets array of all "type" element
         */
        void setTypeArray(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[] typeArray);
        
        /**
         * Sets ith "type" element
         */
        void setTypeArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type);
        
        /**
         * Sets (as xml) array of all "type" element
         */
        void xsetTypeArray(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[] typeArray);
        
        /**
         * Sets (as xml) ith "type" element
         */
        void xsetTypeArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType type);
        
        /**
         * Inserts the value as the ith "type" element
         */
        void insertType(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type);
        
        /**
         * Appends the value as the last "type" element
         */
        void addType(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "type" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType insertNewType(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "type" element
         */
        org.biocatalogue.x2009.xml.rest.ServiceTechnologyType addNewType();
        
        /**
         * Removes the ith "type" element
         */
        void removeType(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes newInstance() {
              return (org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML deployments(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Deployments extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Deployments.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("deployments3a2belemtype");
        
        /**
         * Gets a List of "serviceDeployment" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> getServiceDeploymentList();
        
        /**
         * Gets array of all "serviceDeployment" elements
         * @deprecated
         */
        @Deprecated
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
            public static org.biocatalogue.x2009.xml.rest.Service.Deployments newInstance() {
              return (org.biocatalogue.x2009.xml.rest.Service.Deployments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.Service.Deployments newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.Service.Deployments) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML variants(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Variants extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Variants.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("variants0c9belemtype");
        
        /**
         * Gets a List of "soapService" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.SoapService> getSoapServiceList();
        
        /**
         * Gets array of all "soapService" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.SoapService[] getSoapServiceArray();
        
        /**
         * Gets ith "soapService" element
         */
        org.biocatalogue.x2009.xml.rest.SoapService getSoapServiceArray(int i);
        
        /**
         * Returns number of "soapService" element
         */
        int sizeOfSoapServiceArray();
        
        /**
         * Sets array of all "soapService" element
         */
        void setSoapServiceArray(org.biocatalogue.x2009.xml.rest.SoapService[] soapServiceArray);
        
        /**
         * Sets ith "soapService" element
         */
        void setSoapServiceArray(int i, org.biocatalogue.x2009.xml.rest.SoapService soapService);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapService" element
         */
        org.biocatalogue.x2009.xml.rest.SoapService insertNewSoapService(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapService" element
         */
        org.biocatalogue.x2009.xml.rest.SoapService addNewSoapService();
        
        /**
         * Removes the ith "soapService" element
         */
        void removeSoapService(int i);
        
        /**
         * Gets a List of "restService" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.RestService> getRestServiceList();
        
        /**
         * Gets array of all "restService" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.RestService[] getRestServiceArray();
        
        /**
         * Gets ith "restService" element
         */
        org.biocatalogue.x2009.xml.rest.RestService getRestServiceArray(int i);
        
        /**
         * Returns number of "restService" element
         */
        int sizeOfRestServiceArray();
        
        /**
         * Sets array of all "restService" element
         */
        void setRestServiceArray(org.biocatalogue.x2009.xml.rest.RestService[] restServiceArray);
        
        /**
         * Sets ith "restService" element
         */
        void setRestServiceArray(int i, org.biocatalogue.x2009.xml.rest.RestService restService);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "restService" element
         */
        org.biocatalogue.x2009.xml.rest.RestService insertNewRestService(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "restService" element
         */
        org.biocatalogue.x2009.xml.rest.RestService addNewRestService();
        
        /**
         * Removes the ith "restService" element
         */
        void removeRestService(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.Service.Variants newInstance() {
              return (org.biocatalogue.x2009.xml.rest.Service.Variants) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.Service.Variants newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.Service.Variants) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML monitoring(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Monitoring extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Monitoring.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("monitoring6155elemtype");
        
        /**
         * Gets the "tests" element
         */
        org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests getTests();
        
        /**
         * Sets the "tests" element
         */
        void setTests(org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests tests);
        
        /**
         * Appends and returns a new empty "tests" element
         */
        org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests addNewTests();
        
        /**
         * An XML tests(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public interface Tests extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Tests.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("testsf668elemtype");
            
            /**
             * Gets a List of "serviceTest" elements
             */
            java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTest> getServiceTestList();
            
            /**
             * Gets array of all "serviceTest" elements
             * @deprecated
             */
            @Deprecated
            org.biocatalogue.x2009.xml.rest.ServiceTest[] getServiceTestArray();
            
            /**
             * Gets ith "serviceTest" element
             */
            org.biocatalogue.x2009.xml.rest.ServiceTest getServiceTestArray(int i);
            
            /**
             * Returns number of "serviceTest" element
             */
            int sizeOfServiceTestArray();
            
            /**
             * Sets array of all "serviceTest" element
             */
            void setServiceTestArray(org.biocatalogue.x2009.xml.rest.ServiceTest[] serviceTestArray);
            
            /**
             * Sets ith "serviceTest" element
             */
            void setServiceTestArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTest serviceTest);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "serviceTest" element
             */
            org.biocatalogue.x2009.xml.rest.ServiceTest insertNewServiceTest(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "serviceTest" element
             */
            org.biocatalogue.x2009.xml.rest.ServiceTest addNewServiceTest();
            
            /**
             * Removes the ith "serviceTest" element
             */
            void removeServiceTest(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests newInstance() {
                  return (org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.Service.Monitoring newInstance() {
              return (org.biocatalogue.x2009.xml.rest.Service.Monitoring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.Service.Monitoring newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.Service.Monitoring) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.Service newInstance() {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Service parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.Service parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.Service parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Service) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
