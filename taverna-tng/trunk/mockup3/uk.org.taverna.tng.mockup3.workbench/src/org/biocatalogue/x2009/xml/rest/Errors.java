/*
 * XML Type:  Errors
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Errors
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML Errors(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface Errors extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Errors.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("errorsc199type");
    
    /**
     * Gets array of all "error" elements
     */
    java.lang.String[] getErrorArray();
    
    /**
     * Gets ith "error" element
     */
    java.lang.String getErrorArray(int i);
    
    /**
     * Gets (as xml) array of all "error" elements
     */
    org.apache.xmlbeans.XmlString[] xgetErrorArray();
    
    /**
     * Gets (as xml) ith "error" element
     */
    org.apache.xmlbeans.XmlString xgetErrorArray(int i);
    
    /**
     * Returns number of "error" element
     */
    int sizeOfErrorArray();
    
    /**
     * Sets array of all "error" element
     */
    void setErrorArray(java.lang.String[] errorArray);
    
    /**
     * Sets ith "error" element
     */
    void setErrorArray(int i, java.lang.String error);
    
    /**
     * Sets (as xml) array of all "error" element
     */
    void xsetErrorArray(org.apache.xmlbeans.XmlString[] errorArray);
    
    /**
     * Sets (as xml) ith "error" element
     */
    void xsetErrorArray(int i, org.apache.xmlbeans.XmlString error);
    
    /**
     * Inserts the value as the ith "error" element
     */
    void insertError(int i, java.lang.String error);
    
    /**
     * Appends the value as the last "error" element
     */
    void addError(java.lang.String error);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error" element
     */
    org.apache.xmlbeans.XmlString insertNewError(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error" element
     */
    org.apache.xmlbeans.XmlString addNewError();
    
    /**
     * Removes the ith "error" element
     */
    void removeError(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.Errors newInstance() {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Errors parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.Errors parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.Errors parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Errors) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
