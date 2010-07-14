/*
 * XML Type:  AnnotationsParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationsParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AnnotationsParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationsParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationsParameters
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
    private static final javax.xml.namespace.QName SORTBY$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortBy");
    private static final javax.xml.namespace.QName SORTORDER$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortOrder");
    private static final javax.xml.namespace.QName PAGE$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
    private static final javax.xml.namespace.QName PAGESIZE$8 = 
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
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FiltersParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.FiltersParameters)get_store().find_element_user(FILTERS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.FiltersParameters)get_store().add_element_user(FILTERS$0);
            }
            target.set(filters);
        }
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
     * Gets the "sortBy" element
     */
    public org.biocatalogue.x2009.xml.rest.SortByParameter getSortBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$2, 0);
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
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$2);
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
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$2);
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
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$4, 0);
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
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$4);
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
            target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$4);
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$6, 0);
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
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$6);
            }
            target.set(page);
        }
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$6);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$8, 0);
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
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$8, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$8);
            }
            target.set(pageSize);
        }
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$8);
            return target;
        }
    }
}
