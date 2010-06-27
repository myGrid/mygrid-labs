/*
 * An XML document type.
 * Localname: accrualPeriodicity
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccrualPeriodicityDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms;


/**
 * A document containing one accrualPeriodicity(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public interface AccrualPeriodicityDocument extends org.purl.dc.elements.x11.AnyDocument
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AccrualPeriodicityDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("accrualperiodicity174ddoctype");
    
    /**
     * Gets the "accrualPeriodicity" element
     */
    java.lang.String getAccrualPeriodicity();
    
    /**
     * Gets (as xml) the "accrualPeriodicity" element
     */
    org.apache.xmlbeans.XmlString xgetAccrualPeriodicity();
    
    /**
     * Sets the "accrualPeriodicity" element
     */
    void setAccrualPeriodicity(java.lang.String accrualPeriodicity);
    
    /**
     * Sets (as xml) the "accrualPeriodicity" element
     */
    void xsetAccrualPeriodicity(org.apache.xmlbeans.XmlString accrualPeriodicity);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.purl.dc.terms.AccrualPeriodicityDocument newInstance() {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.purl.dc.terms.AccrualPeriodicityDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.purl.dc.terms.AccrualPeriodicityDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
