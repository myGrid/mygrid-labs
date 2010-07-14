/*
 * An XML document type.
 * Localname: service
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one service(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
    
    
    /**
     * Gets the "service" element
     */
    public org.biocatalogue.x2009.xml.rest.Service getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "service" element
     */
    public void setService(org.biocatalogue.x2009.xml.rest.Service service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().find_element_user(SERVICE$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Service)get_store().add_element_user(SERVICE$0);
            }
            target.set(service);
        }
    }
    
    /**
     * Appends and returns a new empty "service" element
     */
    public org.biocatalogue.x2009.xml.rest.Service addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
}
