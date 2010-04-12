/*
 * An XML document type.
 * Localname: sortOrder
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SortOrderDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one sortOrder(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SortOrderDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SortOrderDocument
{
    private static final long serialVersionUID = 1L;
    
    public SortOrderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTORDER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortOrder");
    
    
    /**
     * Gets the "sortOrder" element
     */
    public org.biocatalogue.x2009.xml.rest.SortOrderParameter getSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sortOrder" element
     */
    public void setSortOrder(org.biocatalogue.x2009.xml.rest.SortOrderParameter sortOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$0);
            }
            target.set(sortOrder);
        }
    }
    
    /**
     * Appends and returns a new empty "sortOrder" element
     */
    public org.biocatalogue.x2009.xml.rest.SortOrderParameter addNewSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$0);
            return target;
        }
    }
}
