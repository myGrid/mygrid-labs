/*
 * XML Type:  Registry
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Registry
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML Registry(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface Registry extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Registry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4AC35DB484C4D06C4DE788DD0C8A4E11").resolveHandle("registry5dabtype");
    
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
     * Gets the "homepage" element
     */
    java.lang.String getHomepage();
    
    /**
     * Gets (as xml) the "homepage" element
     */
    org.apache.xmlbeans.XmlString xgetHomepage();
    
    /**
     * Sets the "homepage" element
     */
    void setHomepage(java.lang.String homepage);
    
    /**
     * Sets (as xml) the "homepage" element
     */
    void xsetHomepage(org.apache.xmlbeans.XmlString homepage);
    
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
     * Gets the "related" element
     */
    org.biocatalogue.x2009.xml.rest.RegistryRelatedLinks getRelated();
    
    /**
     * True if has "related" element
     */
    boolean isSetRelated();
    
    /**
     * Sets the "related" element
     */
    void setRelated(org.biocatalogue.x2009.xml.rest.RegistryRelatedLinks related);
    
    /**
     * Appends and returns a new empty "related" element
     */
    org.biocatalogue.x2009.xml.rest.RegistryRelatedLinks addNewRelated();
    
    /**
     * Unsets the "related" element
     */
    void unsetRelated();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.Registry newInstance() {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.Registry parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.Registry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.biocatalogue.x2009.xml.rest.Registry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.Registry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
