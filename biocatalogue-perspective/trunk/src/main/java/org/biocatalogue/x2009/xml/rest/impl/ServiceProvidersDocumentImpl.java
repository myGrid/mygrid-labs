/*
 * An XML document type.
 * Localname: serviceProviders
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceProvidersDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one serviceProviders(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServiceProvidersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceProvidersDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceProvidersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEPROVIDERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProviders");
    
    
    /**
     * Gets the "serviceProviders" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProviders getServiceProviders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProviders target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProviders)get_store().find_element_user(SERVICEPROVIDERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceProviders" element
     */
    public void setServiceProviders(org.biocatalogue.x2009.xml.rest.ServiceProviders serviceProviders)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProviders target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProviders)get_store().find_element_user(SERVICEPROVIDERS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceProviders)get_store().add_element_user(SERVICEPROVIDERS$0);
            }
            target.set(serviceProviders);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceProviders" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProviders addNewServiceProviders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProviders target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProviders)get_store().add_element_user(SERVICEPROVIDERS$0);
            return target;
        }
    }
}
