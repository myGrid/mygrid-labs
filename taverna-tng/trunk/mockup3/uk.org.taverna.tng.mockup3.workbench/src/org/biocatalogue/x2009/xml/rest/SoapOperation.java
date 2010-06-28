/*
 * XML Type:  SoapOperation
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperation
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML SoapOperation(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface SoapOperation extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SoapOperation.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("soapoperation45d8type");
    
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
     * Gets the "parameterOrder" element
     */
    java.lang.String getParameterOrder();
    
    /**
     * Gets (as xml) the "parameterOrder" element
     */
    org.apache.xmlbeans.XmlString xgetParameterOrder();
    
    /**
     * Sets the "parameterOrder" element
     */
    void setParameterOrder(java.lang.String parameterOrder);
    
    /**
     * Sets (as xml) the "parameterOrder" element
     */
    void xsetParameterOrder(org.apache.xmlbeans.XmlString parameterOrder);
    
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
     * Gets the "inputs" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs getInputs();
    
    /**
     * True if has "inputs" element
     */
    boolean isSetInputs();
    
    /**
     * Sets the "inputs" element
     */
    void setInputs(org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs inputs);
    
    /**
     * Appends and returns a new empty "inputs" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs addNewInputs();
    
    /**
     * Unsets the "inputs" element
     */
    void unsetInputs();
    
    /**
     * Gets the "outputs" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs getOutputs();
    
    /**
     * True if has "outputs" element
     */
    boolean isSetOutputs();
    
    /**
     * Sets the "outputs" element
     */
    void setOutputs(org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs outputs);
    
    /**
     * Appends and returns a new empty "outputs" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs addNewOutputs();
    
    /**
     * Unsets the "outputs" element
     */
    void unsetOutputs();
    
    /**
     * Gets the "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations getAnnotations();
    
    /**
     * True if has "annotations" element
     */
    boolean isSetAnnotations();
    
    /**
     * Sets the "annotations" element
     */
    void setAnnotations(org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations annotations);
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations addNewAnnotations();
    
    /**
     * Unsets the "annotations" element
     */
    void unsetAnnotations();
    
    /**
     * Gets the "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors getAncestors();
    
    /**
     * True if has "ancestors" element
     */
    boolean isSetAncestors();
    
    /**
     * Sets the "ancestors" element
     */
    void setAncestors(org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors ancestors);
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors addNewAncestors();
    
    /**
     * Unsets the "ancestors" element
     */
    void unsetAncestors();
    
    /**
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Related getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.SoapOperation.Related related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.SoapOperation.Related addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * An XML inputs(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Inputs extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Inputs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("inputs7e1delemtype");
        
        /**
         * Gets a List of "soapInput" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.SoapInput> getSoapInputList();
        
        /**
         * Gets array of all "soapInput" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.SoapInput[] getSoapInputArray();
        
        /**
         * Gets ith "soapInput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapInput getSoapInputArray(int i);
        
        /**
         * Returns number of "soapInput" element
         */
        int sizeOfSoapInputArray();
        
        /**
         * Sets array of all "soapInput" element
         */
        void setSoapInputArray(org.biocatalogue.x2009.xml.rest.SoapInput[] soapInputArray);
        
        /**
         * Sets ith "soapInput" element
         */
        void setSoapInputArray(int i, org.biocatalogue.x2009.xml.rest.SoapInput soapInput);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapInput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapInput insertNewSoapInput(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapInput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapInput addNewSoapInput();
        
        /**
         * Removes the ith "soapInput" element
         */
        void removeSoapInput(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML outputs(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Outputs extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Outputs.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("outputs5056elemtype");
        
        /**
         * Gets a List of "soapOutput" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.SoapOutput> getSoapOutputList();
        
        /**
         * Gets array of all "soapOutput" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.SoapOutput[] getSoapOutputArray();
        
        /**
         * Gets ith "soapOutput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapOutput getSoapOutputArray(int i);
        
        /**
         * Returns number of "soapOutput" element
         */
        int sizeOfSoapOutputArray();
        
        /**
         * Sets array of all "soapOutput" element
         */
        void setSoapOutputArray(org.biocatalogue.x2009.xml.rest.SoapOutput[] soapOutputArray);
        
        /**
         * Sets ith "soapOutput" element
         */
        void setSoapOutputArray(int i, org.biocatalogue.x2009.xml.rest.SoapOutput soapOutput);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapOutput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapOutput insertNewSoapOutput(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapOutput" element
         */
        org.biocatalogue.x2009.xml.rest.SoapOutput addNewSoapOutput();
        
        /**
         * Removes the ith "soapOutput" element
         */
        void removeSoapOutput(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML annotations(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Annotations extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Annotations.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("annotations5568elemtype");
        
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
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ancestors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("ancestorsba44elemtype");
        
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
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
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
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Related.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s273ECF033335E20431C98CF7C5350BEE").resolveHandle("related43afelemtype");
        
        /**
         * Gets the "inputs" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getInputs();
        
        /**
         * Sets the "inputs" element
         */
        void setInputs(org.biocatalogue.x2009.xml.rest.ResourceLink inputs);
        
        /**
         * Appends and returns a new empty "inputs" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewInputs();
        
        /**
         * Gets the "outputs" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getOutputs();
        
        /**
         * Sets the "outputs" element
         */
        void setOutputs(org.biocatalogue.x2009.xml.rest.ResourceLink outputs);
        
        /**
         * Appends and returns a new empty "outputs" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewOutputs();
        
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
         * Gets the "annotationsOnAll" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationsOnAll();
        
        /**
         * Sets the "annotationsOnAll" element
         */
        void setAnnotationsOnAll(org.biocatalogue.x2009.xml.rest.ResourceLink annotationsOnAll);
        
        /**
         * Appends and returns a new empty "annotationsOnAll" element
         */
        org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationsOnAll();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Related newInstance() {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.SoapOperation.Related newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.SoapOperation.Related) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.SoapOperation newInstance() {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.SoapOperation parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.SoapOperation) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
