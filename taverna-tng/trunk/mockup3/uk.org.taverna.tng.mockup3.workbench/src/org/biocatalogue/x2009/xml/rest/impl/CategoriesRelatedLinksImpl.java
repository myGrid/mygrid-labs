/*
 * XML Type:  CategoriesRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML CategoriesRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CategoriesRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEFILTERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceFilters");
    
    
    /**
     * Gets the "serviceFilters" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getServiceFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICEFILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceFilters" element
     */
    public void setServiceFilters(org.biocatalogue.x2009.xml.rest.ResourceLink serviceFilters)
    {
        generatedSetterHelperImpl(serviceFilters, SERVICEFILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceFilters" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServiceFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICEFILTERS$0);
            return target;
        }
    }
}
