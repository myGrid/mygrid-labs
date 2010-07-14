/*
 * XML Type:  ServiceProvidersStatistics
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServiceProvidersStatistics(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServiceProvidersStatistics extends org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceProvidersStatistics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("serviceprovidersstatistics53detype");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceProvidersStatistics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
