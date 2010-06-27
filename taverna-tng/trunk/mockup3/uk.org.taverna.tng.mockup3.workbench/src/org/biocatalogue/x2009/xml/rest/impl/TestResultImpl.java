/*
 * XML Type:  TestResult
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TestResult
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML TestResult(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class TestResultImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.TestResult
{
    private static final long serialVersionUID = 1L;
    
    public TestResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTACTION$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testAction");
    private static final javax.xml.namespace.QName RESULTCODE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "resultCode");
    private static final javax.xml.namespace.QName CREATED$4 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "status");
    private static final javax.xml.namespace.QName ANCESTORS$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "ancestors");
    private static final javax.xml.namespace.QName RELATED$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "testAction" element
     */
    public java.lang.String getTestAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTACTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "testAction" element
     */
    public org.apache.xmlbeans.XmlString xgetTestAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTACTION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "testAction" element
     */
    public void setTestAction(java.lang.String testAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTACTION$0);
            }
            target.setStringValue(testAction);
        }
    }
    
    /**
     * Sets (as xml) the "testAction" element
     */
    public void xsetTestAction(org.apache.xmlbeans.XmlString testAction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTACTION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTACTION$0);
            }
            target.set(testAction);
        }
    }
    
    /**
     * Gets the "resultCode" element
     */
    public java.math.BigInteger getResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "resultCode" element
     */
    public org.apache.xmlbeans.XmlInteger xgetResultCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESULTCODE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "resultCode" element
     */
    public void setResultCode(java.math.BigInteger resultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTCODE$2);
            }
            target.setBigIntegerValue(resultCode);
        }
    }
    
    /**
     * Sets (as xml) the "resultCode" element
     */
    public void xsetResultCode(org.apache.xmlbeans.XmlInteger resultCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(RESULTCODE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(RESULTCODE$2);
            }
            target.set(resultCode);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$4);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$4);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.biocatalogue.x2009.xml.rest.MonitoringStatus status)
    {
        generatedSetterHelperImpl(status, STATUS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().add_element_user(STATUS$6);
            return target;
        }
    }
    
    /**
     * Gets the "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult.Ancestors getAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult.Ancestors)get_store().find_element_user(ANCESTORS$8, 0);
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
            return get_store().count_elements(ANCESTORS$8) != 0;
        }
    }
    
    /**
     * Sets the "ancestors" element
     */
    public void setAncestors(org.biocatalogue.x2009.xml.rest.TestResult.Ancestors ancestors)
    {
        generatedSetterHelperImpl(ancestors, ANCESTORS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult.Ancestors addNewAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult.Ancestors)get_store().add_element_user(ANCESTORS$8);
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
            get_store().remove_element(ANCESTORS$8, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult.Related)get_store().find_element_user(RELATED$10, 0);
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
            return get_store().count_elements(RELATED$10) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.TestResult.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult.Related)get_store().add_element_user(RELATED$10);
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
            get_store().remove_element(RELATED$10, 0);
        }
    }
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AncestorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResult.Ancestors
    {
        private static final long serialVersionUID = 1L;
        
        public AncestorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
        private static final javax.xml.namespace.QName SERVICETEST$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceTest");
        
        
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
            generatedSetterHelperImpl(service, SERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
         * Gets the "serviceTest" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getServiceTest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICETEST$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "serviceTest" element
         */
        public void setServiceTest(org.biocatalogue.x2009.xml.rest.ResourceLink serviceTest)
        {
            generatedSetterHelperImpl(serviceTest, SERVICETEST$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICETEST$2);
                return target;
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResult.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
