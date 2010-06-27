/*
 * XML Type:  ServicesParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServicesParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServicesParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServicesParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServicesParameters
{
    private static final long serialVersionUID = 1L;
    
    public ServicesParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
    private static final javax.xml.namespace.QName QUERY$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "query");
    private static final javax.xml.namespace.QName SORTBY$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortBy");
    private static final javax.xml.namespace.QName SORTORDER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortOrder");
    private static final javax.xml.namespace.QName PAGE$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
    private static final javax.xml.namespace.QName PAGESIZE$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
    
    
    /**
     * Gets the "filters" element
     */
    public org.biocatalogue.x2009.xml.rest.FiltersParameters getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FiltersParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.FiltersParameters)get_store().find_element_user(FILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(org.biocatalogue.x2009.xml.rest.FiltersParameters filters)
    {
        generatedSetterHelperImpl(filters, FILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public org.biocatalogue.x2009.xml.rest.FiltersParameters addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FiltersParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.FiltersParameters)get_store().add_element_user(FILTERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "query" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchQueryParameter getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchQueryParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().find_element_user(QUERY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "query" element
     */
    public void setQuery(org.biocatalogue.x2009.xml.rest.SearchQueryParameter query)
    {
        generatedSetterHelperImpl(query, QUERY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "query" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchQueryParameter addNewQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchQueryParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().add_element_user(QUERY$2);
            return target;
        }
    }
    
    /**
     * Gets the "sortBy" element
     */
    public org.biocatalogue.x2009.xml.rest.SortByParameter getSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$4, 0);
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
        generatedSetterHelperImpl(sortBy, SORTBY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$4);
            return target;
        }
    }
    
    /**
     * Gets the "sortOrder" element
     */
    public org.biocatalogue.x2009.xml.rest.SortOrderParameter getSortOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$6, 0);
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
        generatedSetterHelperImpl(sortOrder, SORTORDER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$6);
            return target;
        }
    }
    
    /**
     * Gets the "page" element
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter getPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$8, 0);
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
        generatedSetterHelperImpl(page, PAGE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$8);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$10, 0);
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
        generatedSetterHelperImpl(pageSize, PAGESIZE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$10);
            return target;
        }
    }
}
