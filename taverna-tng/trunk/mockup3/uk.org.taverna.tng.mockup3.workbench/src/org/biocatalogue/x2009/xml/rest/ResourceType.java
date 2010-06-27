/*
 * XML Type:  ResourceType
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ResourceType
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ResourceType(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.ResourceType.
 */
public interface ResourceType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResourceType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("resourcetype8b96type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ANNOTATION = Enum.forString("Annotation");
    static final Enum ANNOTATION_ATTRIBUTE = Enum.forString("AnnotationAttribute");
    static final Enum ANNOTATIONS = Enum.forString("Annotations");
    static final Enum BIO_CATALOGUE = Enum.forString("BioCatalogue");
    static final Enum CATEGORIES = Enum.forString("Categories");
    static final Enum CATEGORY = Enum.forString("Category");
    static final Enum FILTERS = Enum.forString("Filters");
    static final Enum REGISTRIES = Enum.forString("Registries");
    static final Enum REGISTRY = Enum.forString("Registry");
    static final Enum REST_SERVICE = Enum.forString("RestService");
    static final Enum SEARCH = Enum.forString("Search");
    static final Enum SERVICE = Enum.forString("Service");
    static final Enum SERVICE_DEPLOYMENT = Enum.forString("ServiceDeployment");
    static final Enum SERVICE_PROVIDER = Enum.forString("ServiceProvider");
    static final Enum SERVICE_PROVIDERS = Enum.forString("ServiceProviders");
    static final Enum SERVICES = Enum.forString("Services");
    static final Enum SOAP_INPUT = Enum.forString("SoapInput");
    static final Enum SOAP_OPERATION = Enum.forString("SoapOperation");
    static final Enum SOAP_OUTPUT = Enum.forString("SoapOutput");
    static final Enum SOAP_SERVICE = Enum.forString("SoapService");
    static final Enum TAG = Enum.forString("Tag");
    static final Enum TAGS = Enum.forString("Tags");
    static final Enum USER = Enum.forString("User");
    static final Enum USERS = Enum.forString("Users");
    static final Enum ANNOTATION_ATTRIBUTES = Enum.forString("AnnotationAttributes");
    static final Enum SERVICE_TEST = Enum.forString("ServiceTest");
    static final Enum TEST_RESULT = Enum.forString("TestResult");
    static final Enum TEST_RESULTS = Enum.forString("TestResults");
    static final Enum URL_MONITOR = Enum.forString("UrlMonitor");
    static final Enum TEST_SCRIPT = Enum.forString("TestScript");
    static final Enum ERRORS = Enum.forString("Errors");
    static final Enum SEARCH_BY_DATA = Enum.forString("SearchByData");
    static final Enum SOAP_OPERATIONS = Enum.forString("SoapOperations");
    static final Enum AGENT = Enum.forString("Agent");
    static final Enum AGENTS = Enum.forString("Agents");
    static final Enum REST_METHOD = Enum.forString("RestMethod");
    static final Enum REST_PARAMETER = Enum.forString("RestParameter");
    static final Enum REST_REPRESENTATION = Enum.forString("RestRepresentation");
    
    static final int INT_ANNOTATION = Enum.INT_ANNOTATION;
    static final int INT_ANNOTATION_ATTRIBUTE = Enum.INT_ANNOTATION_ATTRIBUTE;
    static final int INT_BIO_CATALOGUE = Enum.INT_BIO_CATALOGUE;
    static final int INT_CATEGORIES = Enum.INT_CATEGORIES;
    static final int INT_CATEGORY = Enum.INT_CATEGORY;
    static final int INT_FILTERS = Enum.INT_FILTERS;
    static final int INT_REGISTRIES = Enum.INT_REGISTRIES;
    static final int INT_REGISTRY = Enum.INT_REGISTRY;
    static final int INT_REST_SERVICE = Enum.INT_REST_SERVICE;
    static final int INT_SEARCH = Enum.INT_SEARCH;
    static final int INT_SERVICE = Enum.INT_SERVICE;
    static final int INT_SERVICE_DEPLOYMENT = Enum.INT_SERVICE_DEPLOYMENT;
    static final int INT_SERVICE_PROVIDER = Enum.INT_SERVICE_PROVIDER;
    static final int INT_SERVICE_PROVIDERS = Enum.INT_SERVICE_PROVIDERS;
    static final int INT_SERVICES = Enum.INT_SERVICES;
    static final int INT_SOAP_INPUT = Enum.INT_SOAP_INPUT;
    static final int INT_SOAP_OPERATION = Enum.INT_SOAP_OPERATION;
    static final int INT_SOAP_OUTPUT = Enum.INT_SOAP_OUTPUT;
    static final int INT_SOAP_SERVICE = Enum.INT_SOAP_SERVICE;
    static final int INT_TAG = Enum.INT_TAG;
    static final int INT_USER = Enum.INT_USER;
    static final int INT_USERS = Enum.INT_USERS;
    static final int INT_ANNOTATION_ATTRIBUTES = Enum.INT_ANNOTATION_ATTRIBUTES;
    static final int INT_SERVICE_TEST = Enum.INT_SERVICE_TEST;
    static final int INT_TEST_RESULT = Enum.INT_TEST_RESULT;
    static final int INT_TEST_RESULTS = Enum.INT_TEST_RESULTS;
    static final int INT_URL_MONITOR = Enum.INT_URL_MONITOR;
    static final int INT_TEST_SCRIPT = Enum.INT_TEST_SCRIPT;
    static final int INT_ERRORS = Enum.INT_ERRORS;
    static final int INT_SEARCH_BY_DATA = Enum.INT_SEARCH_BY_DATA;
    static final int INT_SOAP_OPERATIONS = Enum.INT_SOAP_OPERATIONS;
    static final int INT_AGENT = Enum.INT_AGENT;
    static final int INT_AGENTS = Enum.INT_AGENTS;
    static final int INT_REST_METHOD = Enum.INT_REST_METHOD;
    static final int INT_REST_PARAMETER = Enum.INT_REST_PARAMETER;
    static final int INT_REST_REPRESENTATION = Enum.INT_REST_REPRESENTATION;
    
    /**
     * Enumeration value class for org.biocatalogue.x2009.xml.rest.ResourceType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ANNOTATION
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
        
        static final int INT_ANNOTATION = 1;
        static final int INT_ANNOTATION_ATTRIBUTE = 2;
        static final int INT_ANNOTATIONS = 3;
        static final int INT_BIO_CATALOGUE = 4;
        static final int INT_CATEGORIES = 5;
        static final int INT_CATEGORY = 6;
        static final int INT_FILTERS = 7;
        static final int INT_REGISTRIES = 8;
        static final int INT_REGISTRY = 9;
        static final int INT_REST_SERVICE = 10;
        static final int INT_SEARCH = 11;
        static final int INT_SERVICE = 12;
        static final int INT_SERVICE_DEPLOYMENT = 13;
        static final int INT_SERVICE_PROVIDER = 14;
        static final int INT_SERVICE_PROVIDERS = 15;
        static final int INT_SERVICES = 16;
        static final int INT_SOAP_INPUT = 17;
        static final int INT_SOAP_OPERATION = 18;
        static final int INT_SOAP_OUTPUT = 19;
        static final int INT_SOAP_SERVICE = 20;
        static final int INT_TAG = 21;
        static final int INT_TAGS = 22;
        static final int INT_TAGS_2 = 23;
        static final int INT_USER = 24;
        static final int INT_USERS = 25;
        static final int INT_ANNOTATIONS_2 = 26;
        static final int INT_ANNOTATION_ATTRIBUTES = 27;
        static final int INT_SERVICE_TEST = 28;
        static final int INT_TEST_RESULT = 29;
        static final int INT_TEST_RESULTS = 30;
        static final int INT_URL_MONITOR = 31;
        static final int INT_TEST_SCRIPT = 32;
        static final int INT_ERRORS = 33;
        static final int INT_SEARCH_BY_DATA = 34;
        static final int INT_SOAP_OPERATIONS = 35;
        static final int INT_AGENT = 36;
        static final int INT_AGENTS = 37;
        static final int INT_REST_METHOD = 38;
        static final int INT_REST_PARAMETER = 39;
        static final int INT_REST_REPRESENTATION = 40;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Annotation", INT_ANNOTATION),
                new Enum("AnnotationAttribute", INT_ANNOTATION_ATTRIBUTE),
                new Enum("Annotations", INT_ANNOTATIONS),
                new Enum("BioCatalogue", INT_BIO_CATALOGUE),
                new Enum("Categories", INT_CATEGORIES),
                new Enum("Category", INT_CATEGORY),
                new Enum("Filters", INT_FILTERS),
                new Enum("Registries", INT_REGISTRIES),
                new Enum("Registry", INT_REGISTRY),
                new Enum("RestService", INT_REST_SERVICE),
                new Enum("Search", INT_SEARCH),
                new Enum("Service", INT_SERVICE),
                new Enum("ServiceDeployment", INT_SERVICE_DEPLOYMENT),
                new Enum("ServiceProvider", INT_SERVICE_PROVIDER),
                new Enum("ServiceProviders", INT_SERVICE_PROVIDERS),
                new Enum("Services", INT_SERVICES),
                new Enum("SoapInput", INT_SOAP_INPUT),
                new Enum("SoapOperation", INT_SOAP_OPERATION),
                new Enum("SoapOutput", INT_SOAP_OUTPUT),
                new Enum("SoapService", INT_SOAP_SERVICE),
                new Enum("Tag", INT_TAG),
                new Enum("Tags", INT_TAGS),
                new Enum("Tags", INT_TAGS_2),
                new Enum("User", INT_USER),
                new Enum("Users", INT_USERS),
                new Enum("Annotations", INT_ANNOTATIONS_2),
                new Enum("AnnotationAttributes", INT_ANNOTATION_ATTRIBUTES),
                new Enum("ServiceTest", INT_SERVICE_TEST),
                new Enum("TestResult", INT_TEST_RESULT),
                new Enum("TestResults", INT_TEST_RESULTS),
                new Enum("UrlMonitor", INT_URL_MONITOR),
                new Enum("TestScript", INT_TEST_SCRIPT),
                new Enum("Errors", INT_ERRORS),
                new Enum("SearchByData", INT_SEARCH_BY_DATA),
                new Enum("SoapOperations", INT_SOAP_OPERATIONS),
                new Enum("Agent", INT_AGENT),
                new Enum("Agents", INT_AGENTS),
                new Enum("RestMethod", INT_REST_METHOD),
                new Enum("RestParameter", INT_REST_PARAMETER),
                new Enum("RestRepresentation", INT_REST_REPRESENTATION),
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
        public static org.biocatalogue.x2009.xml.rest.ResourceType newValue(java.lang.Object obj) {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) type.newValue( obj ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ResourceType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ResourceType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
