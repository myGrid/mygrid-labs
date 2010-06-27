/*
 * XML Type:  AnnotationAttributesParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationAttributesParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AnnotationAttributesParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationAttributesParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationAttributesParameters
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationAttributesParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
    private static final javax.xml.namespace.QName PAGESIZE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
    
    
    /**
     * Gets the "page" element
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter getPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "page" element
     */
    public void setPage(org.biocatalogue.x2009.xml.rest.PageParameter page)
    {
        generatedSetterHelperImpl(page, PAGE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "page" element
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter addNewPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$0);
            return target;
        }
    }
    
    /**
     * Gets the "pageSize" element
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pageSize" element
     */
    public void setPageSize(org.biocatalogue.x2009.xml.rest.PageSizeParameter pageSize)
    {
        generatedSetterHelperImpl(pageSize, PAGESIZE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pageSize" element
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter addNewPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$2);
            return target;
        }
    }
}
