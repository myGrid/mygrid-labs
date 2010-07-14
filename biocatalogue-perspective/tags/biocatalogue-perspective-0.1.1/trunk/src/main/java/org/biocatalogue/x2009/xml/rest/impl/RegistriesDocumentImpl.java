/*
 * An XML document type.
 * Localname: registries
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RegistriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one registries(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class RegistriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RegistriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public RegistriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRIES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "registries");
    
    
    /**
     * Gets the "registries" element
     */
    public org.biocatalogue.x2009.xml.rest.Registries getRegistries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registries target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registries)get_store().find_element_user(REGISTRIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "registries" element
     */
    public void setRegistries(org.biocatalogue.x2009.xml.rest.Registries registries)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registries target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registries)get_store().find_element_user(REGISTRIES$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Registries)get_store().add_element_user(REGISTRIES$0);
            }
            target.set(registries);
        }
    }
    
    /**
     * Appends and returns a new empty "registries" element
     */
    public org.biocatalogue.x2009.xml.rest.Registries addNewRegistries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registries target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registries)get_store().add_element_user(REGISTRIES$0);
            return target;
        }
    }
}
