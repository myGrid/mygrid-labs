/*
 * An XML document type.
 * Localname: registry
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RegistryDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one registry(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class RegistryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RegistryDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "registry");
    
    
    /**
     * Gets the "registry" element
     */
    public org.biocatalogue.x2009.xml.rest.Registry getRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "registry" element
     */
    public void setRegistry(org.biocatalogue.x2009.xml.rest.Registry registry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().add_element_user(REGISTRY$0);
            }
            target.set(registry);
        }
    }
    
    /**
     * Appends and returns a new empty "registry" element
     */
    public org.biocatalogue.x2009.xml.rest.Registry addNewRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().add_element_user(REGISTRY$0);
            return target;
        }
    }
}
