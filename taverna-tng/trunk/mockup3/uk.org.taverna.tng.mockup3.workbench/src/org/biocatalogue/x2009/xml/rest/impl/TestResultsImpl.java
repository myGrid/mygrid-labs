/*
 * XML Type:  TestResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TestResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML TestResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class TestResultsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.TestResults
{
    private static final long serialVersionUID = 1L;
    
    public TestResultsImpl(org.apache.xmlbeans.SchemaType sType)
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
    public org.biocatalogue.x2009.xml.rest.TestResults.Parameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Parameters)get_store().find_element_user(PARAMETERS$0, 0);
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
    public void setParameters(org.biocatalogue.x2009.xml.rest.TestResults.Parameters parameters)
    {
        generatedSetterHelperImpl(parameters, PARAMETERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Parameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Parameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Parameters)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Statistics getStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Statistics)get_store().find_element_user(STATISTICS$2, 0);
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
    public void setStatistics(org.biocatalogue.x2009.xml.rest.TestResults.Statistics statistics)
    {
        generatedSetterHelperImpl(statistics, STATISTICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Statistics addNewStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Statistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Statistics)get_store().add_element_user(STATISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "results" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Results getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Results)get_store().find_element_user(RESULTS$4, 0);
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
    public void setResults(org.biocatalogue.x2009.xml.rest.TestResults.Results results)
    {
        generatedSetterHelperImpl(results, RESULTS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "results" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Results addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Results target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Results)get_store().add_element_user(RESULTS$4);
            return target;
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Related)get_store().find_element_user(RELATED$6, 0);
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
    public void setRelated(org.biocatalogue.x2009.xml.rest.TestResults.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults.Related)get_store().add_element_user(RELATED$6);
            return target;
        }
    }
    /**
     * An XML parameters(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResults.Parameters
    {
        private static final long serialVersionUID = 1L;
        
        public ParametersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SORTBY$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortBy");
        private static final javax.xml.namespace.QName SORTORDER$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sortOrder");
        private static final javax.xml.namespace.QName PAGE$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
        private static final javax.xml.namespace.QName PAGESIZE$6 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
        private static final javax.xml.namespace.QName SERVICETEST$8 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceTest");
        
        
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
            generatedSetterHelperImpl(sortBy, SORTBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
        
        /**
         * Gets the "sortOrder" element
         */
        public org.biocatalogue.x2009.xml.rest.SortOrderParameter getSortOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SortOrderParameter target = null;
                target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().find_element_user(SORTORDER$2, 0);
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
            generatedSetterHelperImpl(sortOrder, SORTORDER$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.biocatalogue.x2009.xml.rest.SortOrderParameter)get_store().add_element_user(SORTORDER$2);
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
            generatedSetterHelperImpl(page, PAGE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            generatedSetterHelperImpl(pageSize, PAGESIZE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
        
        /**
         * Gets the "serviceTest" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getServiceTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICETEST$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "serviceTest" element
         */
        public boolean isSetServiceTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICETEST$8) != 0;
            }
        }
        
        /**
         * Sets the "serviceTest" element
         */
        public void setServiceTest(org.biocatalogue.x2009.xml.rest.ResourceLink serviceTest)
        {
            generatedSetterHelperImpl(serviceTest, SERVICETEST$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "serviceTest" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServiceTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICETEST$8);
                return target;
            }
        }
        
        /**
         * Unsets the "serviceTest" element
         */
        public void unsetServiceTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICETEST$8, 0);
            }
        }
    }
    /**
     * An XML statistics(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class StatisticsImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreStatisticsImpl implements org.biocatalogue.x2009.xml.rest.TestResults.Statistics
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
    public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResults.Results
    {
        private static final long serialVersionUID = 1L;
        
        public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTRESULT$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testResult");
        
        
        /**
         * Gets a List of "testResult" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.TestResult> getTestResultList()
        {
            final class TestResultList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.TestResult>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.TestResult get(int i)
                    { return ResultsImpl.this.getTestResultArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.TestResult set(int i, org.biocatalogue.x2009.xml.rest.TestResult o)
                {
                    org.biocatalogue.x2009.xml.rest.TestResult old = ResultsImpl.this.getTestResultArray(i);
                    ResultsImpl.this.setTestResultArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.TestResult o)
                    { ResultsImpl.this.insertNewTestResult(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.TestResult remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.TestResult old = ResultsImpl.this.getTestResultArray(i);
                    ResultsImpl.this.removeTestResult(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ResultsImpl.this.sizeOfTestResultArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TestResultList();
            }
        }
        
        /**
         * Gets array of all "testResult" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.TestResult[] getTestResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.TestResult> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.TestResult>();
                get_store().find_all_element_users(TESTRESULT$0, targetList);
                org.biocatalogue.x2009.xml.rest.TestResult[] result = new org.biocatalogue.x2009.xml.rest.TestResult[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "testResult" element
         */
        public org.biocatalogue.x2009.xml.rest.TestResult getTestResultArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestResult target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().find_element_user(TESTRESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "testResult" element
         */
        public int sizeOfTestResultArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTRESULT$0);
            }
        }
        
        /**
         * Sets array of all "testResult" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTestResultArray(org.biocatalogue.x2009.xml.rest.TestResult[] testResultArray)
        {
            check_orphaned();
            arraySetterHelper(testResultArray, TESTRESULT$0);
        }
        
        /**
         * Sets ith "testResult" element
         */
        public void setTestResultArray(int i, org.biocatalogue.x2009.xml.rest.TestResult testResult)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestResult target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().find_element_user(TESTRESULT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(testResult);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "testResult" element
         */
        public org.biocatalogue.x2009.xml.rest.TestResult insertNewTestResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestResult target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().insert_element_user(TESTRESULT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "testResult" element
         */
        public org.biocatalogue.x2009.xml.rest.TestResult addNewTestResult()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestResult target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().add_element_user(TESTRESULT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "testResult" element
         */
        public void removeTestResult(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTRESULT$0, i);
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreRelatedLinksImpl implements org.biocatalogue.x2009.xml.rest.TestResults.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
