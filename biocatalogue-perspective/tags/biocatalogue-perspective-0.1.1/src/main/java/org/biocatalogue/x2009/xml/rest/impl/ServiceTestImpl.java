/*
 * XML Type:  ServiceTest
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceTest
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServiceTest(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceTestImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.ServiceTest
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testType");
    private static final javax.xml.namespace.QName CREATED$2 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName LATESTSTATUS$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "latestStatus");
    private static final javax.xml.namespace.QName ANCESTORS$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "ancestors");
    private static final javax.xml.namespace.QName RELATED$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "testType" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.TestType getTestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.TestType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType)get_store().find_element_user(TESTTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testType" element
     */
    public void setTestType(org.biocatalogue.x2009.xml.rest.ServiceTest.TestType testType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.TestType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType)get_store().find_element_user(TESTTYPE$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType)get_store().add_element_user(TESTTYPE$0);
            }
            target.set(testType);
        }
    }
    
    /**
     * Appends and returns a new empty "testType" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.TestType addNewTestType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.TestType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.TestType)get_store().add_element_user(TESTTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$2);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$2);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "latestStatus" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus getLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().find_element_user(LATESTSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "latestStatus" element
     */
    public boolean isSetLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LATESTSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "latestStatus" element
     */
    public void setLatestStatus(org.biocatalogue.x2009.xml.rest.MonitoringStatus latestStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().find_element_user(LATESTSTATUS$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().add_element_user(LATESTSTATUS$4);
            }
            target.set(latestStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "latestStatus" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus addNewLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().add_element_user(LATESTSTATUS$4);
            return target;
        }
    }
    
    /**
     * Unsets the "latestStatus" element
     */
    public void unsetLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LATESTSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors getAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors)get_store().find_element_user(ANCESTORS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ancestors" element
     */
    public boolean isSetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCESTORS$6) != 0;
        }
    }
    
    /**
     * Sets the "ancestors" element
     */
    public void setAncestors(org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors ancestors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors)get_store().find_element_user(ANCESTORS$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors)get_store().add_element_user(ANCESTORS$6);
            }
            target.set(ancestors);
        }
    }
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors addNewAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors)get_store().add_element_user(ANCESTORS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "ancestors" element
     */
    public void unsetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCESTORS$6, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Related)get_store().find_element_user(RELATED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "related" element
     */
    public boolean isSetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATED$8) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.ServiceTest.Related related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Related)get_store().find_element_user(RELATED$8, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Related)get_store().add_element_user(RELATED$8);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest.Related)get_store().add_element_user(RELATED$8);
            return target;
        }
    }
    
    /**
     * Unsets the "related" element
     */
    public void unsetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATED$8, 0);
        }
    }
    /**
     * An XML testType(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class TestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceTest.TestType
    {
        private static final long serialVersionUID = 1L;
        
        public TestTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName URLMONITOR$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "urlMonitor");
        private static final javax.xml.namespace.QName TESTSCRIPT$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testScript");
        
        
        /**
         * Gets the "urlMonitor" element
         */
        public org.biocatalogue.x2009.xml.rest.UrlMonitor getUrlMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.UrlMonitor target = null;
                target = (org.biocatalogue.x2009.xml.rest.UrlMonitor)get_store().find_element_user(URLMONITOR$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "urlMonitor" element
         */
        public boolean isSetUrlMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(URLMONITOR$0) != 0;
            }
        }
        
        /**
         * Sets the "urlMonitor" element
         */
        public void setUrlMonitor(org.biocatalogue.x2009.xml.rest.UrlMonitor urlMonitor)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.UrlMonitor target = null;
                target = (org.biocatalogue.x2009.xml.rest.UrlMonitor)get_store().find_element_user(URLMONITOR$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.UrlMonitor)get_store().add_element_user(URLMONITOR$0);
                }
                target.set(urlMonitor);
            }
        }
        
        /**
         * Appends and returns a new empty "urlMonitor" element
         */
        public org.biocatalogue.x2009.xml.rest.UrlMonitor addNewUrlMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.UrlMonitor target = null;
                target = (org.biocatalogue.x2009.xml.rest.UrlMonitor)get_store().add_element_user(URLMONITOR$0);
                return target;
            }
        }
        
        /**
         * Unsets the "urlMonitor" element
         */
        public void unsetUrlMonitor()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(URLMONITOR$0, 0);
            }
        }
        
        /**
         * Gets the "testScript" element
         */
        public org.biocatalogue.x2009.xml.rest.TestScript getTestScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestScript target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestScript)get_store().find_element_user(TESTSCRIPT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "testScript" element
         */
        public boolean isSetTestScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TESTSCRIPT$2) != 0;
            }
        }
        
        /**
         * Sets the "testScript" element
         */
        public void setTestScript(org.biocatalogue.x2009.xml.rest.TestScript testScript)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestScript target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestScript)get_store().find_element_user(TESTSCRIPT$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.TestScript)get_store().add_element_user(TESTSCRIPT$2);
                }
                target.set(testScript);
            }
        }
        
        /**
         * Appends and returns a new empty "testScript" element
         */
        public org.biocatalogue.x2009.xml.rest.TestScript addNewTestScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TestScript target = null;
                target = (org.biocatalogue.x2009.xml.rest.TestScript)get_store().add_element_user(TESTSCRIPT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "testScript" element
         */
        public void unsetTestScript()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TESTSCRIPT$2, 0);
            }
        }
    }
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AncestorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceTest.Ancestors
    {
        private static final long serialVersionUID = 1L;
        
        public AncestorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
        
        
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
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceTest.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "results");
        
        
        /**
         * Gets the "results" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(RESULTS$0, 0);
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
        public void setResults(org.biocatalogue.x2009.xml.rest.ResourceLink results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(RESULTS$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(RESULTS$0);
                }
                target.set(results);
            }
        }
        
        /**
         * Appends and returns a new empty "results" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(RESULTS$0);
                return target;
            }
        }
    }
}
