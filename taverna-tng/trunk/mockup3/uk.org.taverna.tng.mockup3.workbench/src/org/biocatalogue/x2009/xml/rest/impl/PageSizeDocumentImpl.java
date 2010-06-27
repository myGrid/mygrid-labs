/*
 * An XML document type.
 * Localname: pageSize
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.PageSizeDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one pageSize(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class PageSizeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.PageSizeDocument
{
    private static final long serialVersionUID = 1L;
    
    public PageSizeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGESIZE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
    
    
    /**
     * Gets the "pageSize" element
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$0, 0);
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
        generatedSetterHelperImpl(pageSize, PAGESIZE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$0);
            return target;
        }
    }
}
