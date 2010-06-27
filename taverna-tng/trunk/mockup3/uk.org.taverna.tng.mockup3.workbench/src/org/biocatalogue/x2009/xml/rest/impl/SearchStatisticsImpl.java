/*
 * XML Type:  SearchStatistics
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchStatistics
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchStatistics(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SearchStatisticsImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreStatisticsImpl implements org.biocatalogue.x2009.xml.rest.SearchStatistics
{
    private static final long serialVersionUID = 1L;
    
    public SearchStatisticsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPEDRESULTS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "scopedResults");
    
    
    /**
     * Gets array of all "scopedResults" elements
     */
    public org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[] getScopedResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCOPEDRESULTS$0, targetList);
            org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[] result = new org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "scopedResults" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults getScopedResultsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults)get_store().find_element_user(SCOPEDRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "scopedResults" element
     */
    public int sizeOfScopedResultsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPEDRESULTS$0);
        }
    }
    
    /**
     * Sets array of all "scopedResults" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setScopedResultsArray(org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults[] scopedResultsArray)
    {
        check_orphaned();
        arraySetterHelper(scopedResultsArray, SCOPEDRESULTS$0);
    }
    
    /**
     * Sets ith "scopedResults" element
     */
    public void setScopedResultsArray(int i, org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults scopedResults)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults)get_store().find_element_user(SCOPEDRESULTS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(scopedResults);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "scopedResults" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults insertNewScopedResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults)get_store().insert_element_user(SCOPEDRESULTS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "scopedResults" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults addNewScopedResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults)get_store().add_element_user(SCOPEDRESULTS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "scopedResults" element
     */
    public void removeScopedResults(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPEDRESULTS$0, i);
        }
    }
    /**
     * An XML scopedResults(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchStatistics$ScopedResults.
     */
    public static class ScopedResultsImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.biocatalogue.x2009.xml.rest.SearchStatistics.ScopedResults
    {
        private static final long serialVersionUID = 1L;
        
        public ScopedResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ScopedResultsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName SCOPE$0 = 
            new javax.xml.namespace.QName("", "scope");
        
        
        /**
         * Gets the "scope" attribute
         */
        public org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum getScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$0);
                if (target == null)
                {
                    return null;
                }
                return (org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "scope" attribute
         */
        public org.biocatalogue.x2009.xml.rest.SearchScopeName xgetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchScopeName target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().find_attribute_user(SCOPE$0);
                return target;
            }
        }
        
        /**
         * True if has "scope" attribute
         */
        public boolean isSetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SCOPE$0) != null;
            }
        }
        
        /**
         * Sets the "scope" attribute
         */
        public void setScope(org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCOPE$0);
                }
                target.setEnumValue(scope);
            }
        }
        
        /**
         * Sets (as xml) the "scope" attribute
         */
        public void xsetScope(org.biocatalogue.x2009.xml.rest.SearchScopeName scope)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchScopeName target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().find_attribute_user(SCOPE$0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().add_attribute_user(SCOPE$0);
                }
                target.set(scope);
            }
        }
        
        /**
         * Unsets the "scope" attribute
         */
        public void unsetScope()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SCOPE$0);
            }
        }
    }
}
