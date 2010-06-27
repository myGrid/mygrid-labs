/*
 * An XML document type.
 * Localname: services
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServicesDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one services(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServicesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServicesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServicesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
    
    
    /**
     * Gets the "services" element
     */
    public org.biocatalogue.x2009.xml.rest.Services getServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Services target = null;
            target = (org.biocatalogue.x2009.xml.rest.Services)get_store().find_element_user(SERVICES$0, 0);
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
    public void setServices(org.biocatalogue.x2009.xml.rest.Services services)
    {
        generatedSetterHelperImpl(services, SERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "services" element
     */
    public org.biocatalogue.x2009.xml.rest.Services addNewServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Services target = null;
            target = (org.biocatalogue.x2009.xml.rest.Services)get_store().add_element_user(SERVICES$0);
            return target;
        }
    }
}
