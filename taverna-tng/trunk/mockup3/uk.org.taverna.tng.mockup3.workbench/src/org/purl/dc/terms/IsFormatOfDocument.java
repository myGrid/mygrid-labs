/*
 * An XML document type.
 * Localname: isFormatOf
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsFormatOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms;


/**
 * A document containing one isFormatOf(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public interface IsFormatOfDocument extends org.purl.dc.elements.x11.RelationDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsFormatOfDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("isformatof57c1doctype");
    
    /**
     * Gets the "isFormatOf" element
     */
    java.lang.String getIsFormatOf();
    
    /**
     * Gets (as xml) the "isFormatOf" element
     */
    org.apache.xmlbeans.XmlString xgetIsFormatOf();
    
    /**
     * Sets the "isFormatOf" element
     */
    void setIsFormatOf(java.lang.String isFormatOf);
    
    /**
     * Sets (as xml) the "isFormatOf" element
     */
    void xsetIsFormatOf(org.apache.xmlbeans.XmlString isFormatOf);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.dc.terms.IsFormatOfDocument newInstance() {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.dc.terms.IsFormatOfDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.purl.dc.terms.IsFormatOfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.purl.dc.terms.IsFormatOfDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.terms.IsFormatOfDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
