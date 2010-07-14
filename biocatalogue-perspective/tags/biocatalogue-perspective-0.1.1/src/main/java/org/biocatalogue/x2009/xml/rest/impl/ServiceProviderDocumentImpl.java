/*
 * An XML document type.
 * Localname: serviceProvider
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceProviderDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one serviceProvider(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServiceProviderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceProviderDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceProviderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProvider");
    
    
    /**
     * Gets the "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider getServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceProvider" element
     */
    public void setServiceProvider(org.biocatalogue.x2009.xml.rest.ServiceProvider serviceProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$0);
            }
            target.set(serviceProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider addNewServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$0);
            return target;
        }
    }
}
