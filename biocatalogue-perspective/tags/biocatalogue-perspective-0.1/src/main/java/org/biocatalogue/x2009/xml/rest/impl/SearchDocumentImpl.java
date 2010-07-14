/*
 * An XML document type.
 * Localname: search
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one search(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SearchDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCH$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "search");
    
    
    /**
     * Gets the "search" element
     */
    public org.biocatalogue.x2009.xml.rest.Search getSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Search target = null;
            target = (org.biocatalogue.x2009.xml.rest.Search)get_store().find_element_user(SEARCH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "search" element
     */
    public void setSearch(org.biocatalogue.x2009.xml.rest.Search search)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Search target = null;
            target = (org.biocatalogue.x2009.xml.rest.Search)get_store().find_element_user(SEARCH$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Search)get_store().add_element_user(SEARCH$0);
            }
            target.set(search);
        }
    }
    
    /**
     * Appends and returns a new empty "search" element
     */
    public org.biocatalogue.x2009.xml.rest.Search addNewSearch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Search target = null;
            target = (org.biocatalogue.x2009.xml.rest.Search)get_store().add_element_user(SEARCH$0);
            return target;
        }
    }
}
