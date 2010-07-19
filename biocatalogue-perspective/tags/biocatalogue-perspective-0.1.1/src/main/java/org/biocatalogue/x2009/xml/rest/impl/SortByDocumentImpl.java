/*
 * An XML document type.
 * Localname: sortBy
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SortByDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one sortBy(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SortByDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SortByDocument
{
    private static final long serialVersionUID = 1L;
    
    public SortByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORTBY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortBy");
    
    
    /**
     * Gets the "sortBy" element
     */
    public org.biocatalogue.x2009.xml.rest.SortByParameter getSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sortBy" element
     */
    public void setSortBy(org.biocatalogue.x2009.xml.rest.SortByParameter sortBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$0);
            }
            target.set(sortBy);
        }
    }
    
    /**
     * Appends and returns a new empty "sortBy" element
     */
    public org.biocatalogue.x2009.xml.rest.SortByParameter addNewSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$0);
            return target;
        }
    }
}
