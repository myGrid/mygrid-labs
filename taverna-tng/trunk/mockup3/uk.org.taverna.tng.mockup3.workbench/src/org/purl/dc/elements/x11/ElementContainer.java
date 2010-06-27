/*
 * XML Type:  elementContainer
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.ElementContainer
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11;


/**
 * An XML elementContainer(@http://purl.org/dc/elements/1.1/).
 *
 * This is a complex type.
 */
public interface ElementContainer extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ElementContainer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sCF549AC37EE0C3B13988A95A8228AC5A").resolveHandle("elementcontainer6bbdtype");
    
    /**
     * Gets array of all "any" elements
     */
    java.lang.String[] getAnyArray();
    
    /**
     * Gets ith "any" element
     */
    java.lang.String getAnyArray(int i);
    
    /**
     * Gets (as xml) array of all "any" elements
     */
    org.apache.xmlbeans.XmlString[] xgetAnyArray();
    
    /**
     * Gets (as xml) ith "any" element
     */
    org.apache.xmlbeans.XmlString xgetAnyArray(int i);
    
    /**
     * Returns number of "any" element
     */
    int sizeOfAnyArray();
    
    /**
     * Sets array of all "any" element
     */
    void setAnyArray(java.lang.String[] anyArray);
    
    /**
     * Sets ith "any" element
     */
    void setAnyArray(int i, java.lang.String any);
    
    /**
     * Sets (as xml) array of all "any" element
     */
    void xsetAnyArray(org.apache.xmlbeans.XmlString[] anyArray);
    
    /**
     * Sets (as xml) ith "any" element
     */
    void xsetAnyArray(int i, org.apache.xmlbeans.XmlString any);
    
    /**
     * Inserts the value as the ith "any" element
     */
    void insertAny(int i, java.lang.String any);
    
    /**
     * Appends the value as the last "any" element
     */
    void addAny(java.lang.String any);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    org.apache.xmlbeans.XmlString insertNewAny(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    org.apache.xmlbeans.XmlString addNewAny();
    
    /**
     * Removes the ith "any" element
     */
    void removeAny(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.dc.elements.x11.ElementContainer newInstance() {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.dc.elements.x11.ElementContainer parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.dc.elements.x11.ElementContainer parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.dc.elements.x11.ElementContainer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.purl.dc.elements.x11.ElementContainer parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.elements.x11.ElementContainer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
