/*
 * XML Type:  SearchByData
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchByData
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchByData(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SearchByDataImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SearchByData
{
    private static final long serialVersionUID = 1L;
    
    public SearchByDataImpl(org.apache.xmlbeans.SchemaType sType)
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
    public org.biocatalogue.x2009.xml.rest.SearchByData.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
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
    public void setParameters(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Statistics getStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics)get_store().find_element_user(STATISTICS$2, 0);
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
    public void setStatistics(org.biocatalogue.x2009.xml.rest.SearchByData.Statistics statistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics)get_store().add_element_user(STATISTICS$2);
            }
            target.set(statistics);
        }
    }
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Statistics addNewStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Statistics)get_store().add_element_user(STATISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "results" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Results getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results)get_store().find_element_user(RESULTS$4, 0);
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
    public void setResults(org.biocatalogue.x2009.xml.rest.SearchByData.Results results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results)get_store().find_element_user(RESULTS$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results)get_store().add_element_user(RESULTS$4);
            }
            target.set(results);
        }
    }
    
    /**
     * Appends and returns a new empty "results" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Results addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results)get_store().add_element_user(RESULTS$4);
            return target;
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Related)get_store().find_element_user(RELATED$6, 0);
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
    public void setRelated(org.biocatalogue.x2009.xml.rest.SearchByData.Related related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Related)get_store().find_element_user(RELATED$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Related)get_store().add_element_user(RELATED$6);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData.Related)get_store().add_element_user(RELATED$6);
            return target;
        }
    }
    /**
     * An XML parameters(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchByData.Parameters
    {
        private static final long serialVersionUID = 1L;
        
        public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DATA$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "data");
        private static final javax.xml.namespace.QName SEARCHTYPE$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "searchType");
        private static final javax.xml.namespace.QName LIMIT$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "limit");
        
        
        /**
         * Gets the "data" element
         */
        public java.lang.String getData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "data" element
         */
        public org.apache.xmlbeans.XmlString xgetData()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "data" element
         */
        public void setData(java.lang.String data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$0);
                }
                target.setStringValue(data);
            }
        }
        
        /**
         * Sets (as xml) the "data" element
         */
        public void xsetData(org.apache.xmlbeans.XmlString data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DATA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DATA$0);
                }
                target.set(data);
            }
        }
        
        /**
         * Gets the "searchType" element
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType.Enum getSearchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "searchType" element
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType xgetSearchType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType)get_store().find_element_user(SEARCHTYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "searchType" element
         */
        public void setSearchType(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType.Enum searchType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEARCHTYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEARCHTYPE$2);
                }
                target.setEnumValue(searchType);
            }
        }
        
        /**
         * Sets (as xml) the "searchType" element
         */
        public void xsetSearchType(org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType searchType)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType)get_store().find_element_user(SEARCHTYPE$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType)get_store().add_element_user(SEARCHTYPE$2);
                }
                target.set(searchType);
            }
        }
        
        /**
         * Gets the "limit" element
         */
        public java.math.BigInteger getLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMIT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "limit" element
         */
        public org.apache.xmlbeans.XmlNonNegativeInteger xgetLimit()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "limit" element
         */
        public void setLimit(java.math.BigInteger limit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMIT$4);
                }
                target.setBigIntegerValue(limit);
            }
        }
        
        /**
         * Sets (as xml) the "limit" element
         */
        public void xsetLimit(org.apache.xmlbeans.XmlNonNegativeInteger limit)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNonNegativeInteger target = null;
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LIMIT$4);
                }
                target.set(limit);
            }
        }
        /**
         * An XML searchType(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchByData$Parameters$SearchType.
         */
        public static class SearchTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.SearchByData.Parameters.SearchType
        {
            private static final long serialVersionUID = 1L;
            
            public SearchTypeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected SearchTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
    /**
     * An XML statistics(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class StatisticsImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreStatisticsImpl implements org.biocatalogue.x2009.xml.rest.SearchByData.Statistics
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
    public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchByData.Results
    {
        private static final long serialVersionUID = 1L;
        
        public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTITEM$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "resultItem");
        
        
        /**
         * Gets a List of "resultItem" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem> getResultItemList()
        {
            final class ResultItemList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem>
            {
                public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem get(int i)
                    { return ResultsImpl.this.getResultItemArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem set(int i, org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem o)
                {
                    org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem old = ResultsImpl.this.getResultItemArray(i);
                    ResultsImpl.this.setResultItemArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem o)
                    { ResultsImpl.this.insertNewResultItem(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem old = ResultsImpl.this.getResultItemArray(i);
                    ResultsImpl.this.removeResultItem(i);
                    return old;
                }
                
                public int size()
                    { return ResultsImpl.this.sizeOfResultItemArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ResultItemList();
            }
        }
        
        /**
         * Gets array of all "resultItem" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[] getResultItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem>();
                get_store().find_all_element_users(RESULTITEM$0, targetList);
                org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[] result = new org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "resultItem" element
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem getResultItemArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem)get_store().find_element_user(RESULTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "resultItem" element
         */
        public int sizeOfResultItemArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTITEM$0);
            }
        }
        
        /**
         * Sets array of all "resultItem" element
         */
        public void setResultItemArray(org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem[] resultItemArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultItemArray, RESULTITEM$0);
            }
        }
        
        /**
         * Sets ith "resultItem" element
         */
        public void setResultItemArray(int i, org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem resultItem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem)get_store().find_element_user(RESULTITEM$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(resultItem);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "resultItem" element
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem insertNewResultItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem)get_store().insert_element_user(RESULTITEM$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "resultItem" element
         */
        public org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem addNewResultItem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem target = null;
                target = (org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem)get_store().add_element_user(RESULTITEM$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "resultItem" element
         */
        public void removeResultItem(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTITEM$0, i);
            }
        }
        /**
         * An XML resultItem(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public static class ResultItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchByData.Results.ResultItem
        {
            private static final long serialVersionUID = 1L;
            
            public ResultItemImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SERVICE$0 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
            private static final javax.xml.namespace.QName SOAPOPERATION$2 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperation");
            private static final javax.xml.namespace.QName PORT$4 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "port");
            private static final javax.xml.namespace.QName ANNOTATION$6 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotation");
            
            
            /**
             * Gets the "service" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "service" element
             */
            public void setService(org.biocatalogue.x2009.xml.rest.ResourceLink service)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                    if (target == null)
                    {
                      target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                    }
                    target.set(service);
                }
            }
            
            /**
             * Appends and returns a new empty "service" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewService()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                    return target;
                }
            }
            
            /**
             * Gets the "soapOperation" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPOPERATION$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "soapOperation" element
             */
            public void setSoapOperation(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPOPERATION$2, 0);
                    if (target == null)
                    {
                      target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPOPERATION$2);
                    }
                    target.set(soapOperation);
                }
            }
            
            /**
             * Appends and returns a new empty "soapOperation" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPOPERATION$2);
                    return target;
                }
            }
            
            /**
             * Gets the "port" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(PORT$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "port" element
             */
            public void setPort(org.biocatalogue.x2009.xml.rest.ResourceLink port)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(PORT$4, 0);
                    if (target == null)
                    {
                      target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(PORT$4);
                    }
                    target.set(port);
                }
            }
            
            /**
             * Appends and returns a new empty "port" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewPort()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(PORT$4);
                    return target;
                }
            }
            
            /**
             * Gets the "annotation" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "annotation" element
             */
            public void setAnnotation(org.biocatalogue.x2009.xml.rest.ResourceLink annotation)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATION$6, 0);
                    if (target == null)
                    {
                      target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATION$6);
                    }
                    target.set(annotation);
                }
            }
            
            /**
             * Appends and returns a new empty "annotation" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotation()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATION$6);
                    return target;
                }
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchByData.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
