/*
 * XML Type:  TagRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML TagRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class TagRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TagRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public TagRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
    private static final javax.xml.namespace.QName SOAPOPERATIONS$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperations");
    
    
    /**
     * Gets the "services" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "services" element
     */
    public void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services)
    {
        generatedSetterHelperImpl(services, SERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "services" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICES$0);
            return target;
        }
    }
    
    /**
     * Gets the "soapOperations" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPOPERATIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapOperations" element
     */
    public void setSoapOperations(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperations)
    {
        generatedSetterHelperImpl(soapOperations, SOAPOPERATIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "soapOperations" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPOPERATIONS$2);
            return target;
        }
    }
}
