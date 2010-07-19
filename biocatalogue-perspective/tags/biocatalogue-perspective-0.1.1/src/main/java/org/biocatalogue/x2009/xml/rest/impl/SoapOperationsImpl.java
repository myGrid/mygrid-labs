/*
 * XML Type:  SoapOperations
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperations
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SoapOperations(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SoapOperationsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SoapOperations
{
    private static final long serialVersionUID = 1L;
    
    public SoapOperationsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "parameters");
    private static final javax.xml.namespace.QName STATISTICS$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "statistics");
    private static final javax.xml.namespace.QName RESULTS$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "results");
    private static final javax.xml.namespace.QName RELATED$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "parameters" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameters" element
     */
    public void setParameters(org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics getStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "statistics" element
     */
    public void setStatistics(org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics statistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics)get_store().add_element_user(STATISTICS$2);
            }
            target.set(statistics);
        }
    }
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics addNewStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics)get_store().add_element_user(STATISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "results" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Results getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Results)get_store().find_element_user(RESULTS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "results" element
     */
    public void setResults(org.biocatalogue.x2009.xml.rest.SoapOperations.Results results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Results)get_store().find_element_user(RESULTS$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Results)get_store().add_element_user(RESULTS$4);
            }
            target.set(results);
        }
    }
    
    /**
     * Appends and returns a new empty "results" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Results addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Results)get_store().add_element_user(RESULTS$4);
            return target;
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Related)get_store().find_element_user(RELATED$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.SoapOperations.Related related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Related)get_store().find_element_user(RELATED$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Related)get_store().add_element_user(RELATED$6);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations.Related)get_store().add_element_user(RELATED$6);
            return target;
        }
    }
    /**
     * An XML parameters(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperations.Parameters
    {
        private static final long serialVersionUID = 1L;
        
        public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchQueryParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().find_element_user(QUERY$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SearchQueryParameter)get_store().add_element_user(QUERY$2);
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SortByParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().find_element_user(SORTBY$4, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SortByParameter)get_store().add_element_user(SORTBY$4);
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$6, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$6);
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.PageParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$8, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$8);
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$10, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$10);
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
                target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$10);
                return target;
            }
        }
    }
    /**
     * An XML statistics(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class StatisticsImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreStatisticsImpl implements org.biocatalogue.x2009.xml.rest.SoapOperations.Statistics
    {
        private static final long serialVersionUID = 1L;
        
        public StatisticsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
    /**
     * An XML results(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperations.Results
    {
        private static final long serialVersionUID = 1L;
        
        public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOAPOPERATION$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperation");
        
        
        /**
         * Gets a List of "soapOperation" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.SoapOperation> getSoapOperationList()
        {
            final class SoapOperationList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SoapOperation>
            {
                public org.biocatalogue.x2009.xml.rest.SoapOperation get(int i)
                    { return ResultsImpl.this.getSoapOperationArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.SoapOperation set(int i, org.biocatalogue.x2009.xml.rest.SoapOperation o)
                {
                    org.biocatalogue.x2009.xml.rest.SoapOperation old = ResultsImpl.this.getSoapOperationArray(i);
                    ResultsImpl.this.setSoapOperationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.SoapOperation o)
                    { ResultsImpl.this.insertNewSoapOperation(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.SoapOperation remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.SoapOperation old = ResultsImpl.this.getSoapOperationArray(i);
                    ResultsImpl.this.removeSoapOperation(i);
                    return old;
                }
                
                public int size()
                    { return ResultsImpl.this.sizeOfSoapOperationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SoapOperationList();
            }
        }
        
        /**
         * Gets array of all "soapOperation" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.SoapOperation[] getSoapOperationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.SoapOperation> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SoapOperation>();
                get_store().find_all_element_users(SOAPOPERATION$0, targetList);
                org.biocatalogue.x2009.xml.rest.SoapOperation[] result = new org.biocatalogue.x2009.xml.rest.SoapOperation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "soapOperation" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOperation getSoapOperationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().find_element_user(SOAPOPERATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "soapOperation" element
         */
        public int sizeOfSoapOperationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOAPOPERATION$0);
            }
        }
        
        /**
         * Sets array of all "soapOperation" element
         */
        public void setSoapOperationArray(org.biocatalogue.x2009.xml.rest.SoapOperation[] soapOperationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(soapOperationArray, SOAPOPERATION$0);
            }
        }
        
        /**
         * Sets ith "soapOperation" element
         */
        public void setSoapOperationArray(int i, org.biocatalogue.x2009.xml.rest.SoapOperation soapOperation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().find_element_user(SOAPOPERATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(soapOperation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapOperation" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOperation insertNewSoapOperation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().insert_element_user(SOAPOPERATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapOperation" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOperation addNewSoapOperation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().add_element_user(SOAPOPERATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "soapOperation" element
         */
        public void removeSoapOperation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOAPOPERATION$0, i);
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreRelatedLinksImpl implements org.biocatalogue.x2009.xml.rest.SoapOperations.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FILTERS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
        private static final javax.xml.namespace.QName FILTERSONCURRENTRESULTS$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filtersOnCurrentResults");
        
        
        /**
         * Gets the "filters" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getFilters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FILTERS$0, 0);
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
        public void setFilters(org.biocatalogue.x2009.xml.rest.ResourceLink filters)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FILTERS$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FILTERS$0);
                }
                target.set(filters);
            }
        }
        
        /**
         * Appends and returns a new empty "filters" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewFilters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FILTERS$0);
                return target;
            }
        }
        
        /**
         * Gets the "filtersOnCurrentResults" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getFiltersOnCurrentResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FILTERSONCURRENTRESULTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "filtersOnCurrentResults" element
         */
        public void setFiltersOnCurrentResults(org.biocatalogue.x2009.xml.rest.ResourceLink filtersOnCurrentResults)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FILTERSONCURRENTRESULTS$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FILTERSONCURRENTRESULTS$2);
                }
                target.set(filtersOnCurrentResults);
            }
        }
        
        /**
         * Appends and returns a new empty "filtersOnCurrentResults" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewFiltersOnCurrentResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FILTERSONCURRENTRESULTS$2);
                return target;
            }
        }
    }
}
