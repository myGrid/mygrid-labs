/*
 * XML Type:  SearchParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SearchParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchParameters
{
    private static final long serialVersionUID = 1L;
    
    public SearchParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QUERY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "query");
    private static final javax.xml.namespace.QName SCOPE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "scope");
    private static final javax.xml.namespace.QName PAGE$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
    private static final javax.xml.namespace.QName PAGESIZE$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
    
    
    /**
     * Gets the "query" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchQueryParameter getQuery()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchQueryParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().find_element_user(QUERY$0, 0);
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
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchQueryParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().find_element_user(QUERY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().add_element_user(QUERY$0);
            }
            target.set(query);
        }
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
            target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().add_element_user(QUERY$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "scope" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.SearchScopeParameter> getScopeList()
    {
        final class ScopeList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SearchScopeParameter>
        {
            public org.biocatalogue.x2009.xml.rest.SearchScopeParameter get(int i)
                { return SearchParametersImpl.this.getScopeArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.SearchScopeParameter set(int i, org.biocatalogue.x2009.xml.rest.SearchScopeParameter o)
            {
                org.biocatalogue.x2009.xml.rest.SearchScopeParameter old = SearchParametersImpl.this.getScopeArray(i);
                SearchParametersImpl.this.setScopeArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.SearchScopeParameter o)
                { SearchParametersImpl.this.insertNewScope(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.SearchScopeParameter remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.SearchScopeParameter old = SearchParametersImpl.this.getScopeArray(i);
                SearchParametersImpl.this.removeScope(i);
                return old;
            }
            
            public int size()
                { return SearchParametersImpl.this.sizeOfScopeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ScopeList();
        }
    }
    
    /**
     * Gets array of all "scope" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeParameter[] getScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.SearchScopeParameter> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SearchScopeParameter>();
            get_store().find_all_element_users(SCOPE$2, targetList);
            org.biocatalogue.x2009.xml.rest.SearchScopeParameter[] result = new org.biocatalogue.x2009.xml.rest.SearchScopeParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scope" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeParameter getScopeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeParameter)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scope" element
     */
    public int sizeOfScopeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$2);
        }
    }
    
    /**
     * Sets array of all "scope" element
     */
    public void setScopeArray(org.biocatalogue.x2009.xml.rest.SearchScopeParameter[] scopeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(scopeArray, SCOPE$2);
        }
    }
    
    /**
     * Sets ith "scope" element
     */
    public void setScopeArray(int i, org.biocatalogue.x2009.xml.rest.SearchScopeParameter scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeParameter)get_store().find_element_user(SCOPE$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scope);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scope" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeParameter insertNewScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeParameter)get_store().insert_element_user(SCOPE$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scope" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeParameter addNewScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeParameter)get_store().add_element_user(SCOPE$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "scope" element
     */
    public void removeScope(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$2, i);
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$4, 0);
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$4);
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
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$4);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$6, 0);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$6);
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
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$6);
            return target;
        }
    }
}
