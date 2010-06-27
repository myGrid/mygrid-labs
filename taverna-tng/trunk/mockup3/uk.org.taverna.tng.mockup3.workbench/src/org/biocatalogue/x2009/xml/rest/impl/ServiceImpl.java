/*
 * XML Type:  Service
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Service
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Service(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Service
{
    private static final long serialVersionUID = 1L;
    
    public ServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE2$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title");
    private static final org.apache.xmlbeans.QNameSet TITLE2$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
    });
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "name");
    private static final javax.xml.namespace.QName ORIGINALSUBMITTER$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "originalSubmitter");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description");
    private static final org.apache.xmlbeans.QNameSet DESCRIPTION$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
    });
    private static final javax.xml.namespace.QName SERVICETECHNOLOGYTYPES$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceTechnologyTypes");
    private static final javax.xml.namespace.QName LATESTMONITORINGSTATUS$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "latestMonitoringStatus");
    private static final javax.xml.namespace.QName CREATED$12 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName SUMMARY$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "summary");
    private static final javax.xml.namespace.QName DEPLOYMENTS$16 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "deployments");
    private static final javax.xml.namespace.QName VARIANTS$18 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "variants");
    private static final javax.xml.namespace.QName MONITORING$20 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "monitoring");
    private static final javax.xml.namespace.QName RELATED$22 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE2$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle2(java.lang.String title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE2$0);
            }
            target.setStringValue(title2);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle2(org.apache.xmlbeans.XmlString title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE2$0);
            }
            target.set(title2);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "originalSubmitter" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getOriginalSubmitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ORIGINALSUBMITTER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "originalSubmitter" element
     */
    public void setOriginalSubmitter(org.biocatalogue.x2009.xml.rest.ResourceLink originalSubmitter)
    {
        generatedSetterHelperImpl(originalSubmitter, ORIGINALSUBMITTER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originalSubmitter" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewOriginalSubmitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ORIGINALSUBMITTER$4);
            return target;
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$7, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "serviceTechnologyTypes" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes getServiceTechnologyTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes)get_store().find_element_user(SERVICETECHNOLOGYTYPES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceTechnologyTypes" element
     */
    public void setServiceTechnologyTypes(org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes serviceTechnologyTypes)
    {
        generatedSetterHelperImpl(serviceTechnologyTypes, SERVICETECHNOLOGYTYPES$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceTechnologyTypes" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes addNewServiceTechnologyTypes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes)get_store().add_element_user(SERVICETECHNOLOGYTYPES$8);
            return target;
        }
    }
    
    /**
     * Gets the "latestMonitoringStatus" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus getLatestMonitoringStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().find_element_user(LATESTMONITORINGSTATUS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "latestMonitoringStatus" element
     */
    public void setLatestMonitoringStatus(org.biocatalogue.x2009.xml.rest.MonitoringStatus latestMonitoringStatus)
    {
        generatedSetterHelperImpl(latestMonitoringStatus, LATESTMONITORINGSTATUS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "latestMonitoringStatus" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatus addNewLatestMonitoringStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatus target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatus)get_store().add_element_user(LATESTMONITORINGSTATUS$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$12, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "created" element
     */
    public boolean isSetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATED$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$12);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$12);
            }
            target.set(created);
        }
    }
    
    /**
     * Unsets the "created" element
     */
    public void unsetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATED$12, 0);
        }
    }
    
    /**
     * Gets the "summary" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary)get_store().find_element_user(SUMMARY$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "summary" element
     */
    public boolean isSetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUMMARY$14) != 0;
        }
    }
    
    /**
     * Sets the "summary" element
     */
    public void setSummary(org.biocatalogue.x2009.xml.rest.ServiceSummary summary)
    {
        generatedSetterHelperImpl(summary, SUMMARY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "summary" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary addNewSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary)get_store().add_element_user(SUMMARY$14);
            return target;
        }
    }
    
    /**
     * Unsets the "summary" element
     */
    public void unsetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUMMARY$14, 0);
        }
    }
    
    /**
     * Gets the "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Deployments getDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Deployments target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Deployments)get_store().find_element_user(DEPLOYMENTS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deployments" element
     */
    public boolean isSetDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPLOYMENTS$16) != 0;
        }
    }
    
    /**
     * Sets the "deployments" element
     */
    public void setDeployments(org.biocatalogue.x2009.xml.rest.Service.Deployments deployments)
    {
        generatedSetterHelperImpl(deployments, DEPLOYMENTS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Deployments addNewDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Deployments target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Deployments)get_store().add_element_user(DEPLOYMENTS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "deployments" element
     */
    public void unsetDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPLOYMENTS$16, 0);
        }
    }
    
    /**
     * Gets the "variants" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Variants getVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Variants target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Variants)get_store().find_element_user(VARIANTS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "variants" element
     */
    public boolean isSetVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VARIANTS$18) != 0;
        }
    }
    
    /**
     * Sets the "variants" element
     */
    public void setVariants(org.biocatalogue.x2009.xml.rest.Service.Variants variants)
    {
        generatedSetterHelperImpl(variants, VARIANTS$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "variants" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Variants addNewVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Variants target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Variants)get_store().add_element_user(VARIANTS$18);
            return target;
        }
    }
    
    /**
     * Unsets the "variants" element
     */
    public void unsetVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VARIANTS$18, 0);
        }
    }
    
    /**
     * Gets the "monitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Monitoring getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Monitoring target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Monitoring)get_store().find_element_user(MONITORING$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "monitoring" element
     */
    public boolean isSetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MONITORING$20) != 0;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.biocatalogue.x2009.xml.rest.Service.Monitoring monitoring)
    {
        generatedSetterHelperImpl(monitoring, MONITORING$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.Service.Monitoring addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service.Monitoring target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service.Monitoring)get_store().add_element_user(MONITORING$20);
            return target;
        }
    }
    
    /**
     * Unsets the "monitoring" element
     */
    public void unsetMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MONITORING$20, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks)get_store().find_element_user(RELATED$22, 0);
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
            return get_store().count_elements(RELATED$22) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks related)
    {
        generatedSetterHelperImpl(related, RELATED$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks)get_store().add_element_user(RELATED$22);
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
            get_store().remove_element(RELATED$22, 0);
        }
    }
    /**
     * An XML serviceTechnologyTypes(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ServiceTechnologyTypesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Service.ServiceTechnologyTypes
    {
        private static final long serialVersionUID = 1L;
        
        public ServiceTechnologyTypesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TYPE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "type");
        
        
        /**
         * Gets a List of "type" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum> getTypeList()
        {
            final class TypeList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum get(int i)
                    { return ServiceTechnologyTypesImpl.this.getTypeArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum set(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum o)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum old = ServiceTechnologyTypesImpl.this.getTypeArray(i);
                    ServiceTechnologyTypesImpl.this.setTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum o)
                    { ServiceTechnologyTypesImpl.this.insertType(i, o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum old = ServiceTechnologyTypesImpl.this.getTypeArray(i);
                    ServiceTechnologyTypesImpl.this.removeType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ServiceTechnologyTypesImpl.this.sizeOfTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TypeList();
            }
        }
        
        /**
         * Gets array of all "type" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[] getTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType>();
                get_store().find_all_element_users(TYPE$0, targetList);
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[] result = new org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                return result;
            }
        }
        
        /**
         * Gets ith "type" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum getTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) a List of "type" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType> xgetTypeList()
        {
            final class TypeList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType get(int i)
                    { return ServiceTechnologyTypesImpl.this.xgetTypeArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType set(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType o)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceTechnologyType old = ServiceTechnologyTypesImpl.this.xgetTypeArray(i);
                    ServiceTechnologyTypesImpl.this.xsetTypeArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType o)
                    { ServiceTechnologyTypesImpl.this.insertNewType(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceTechnologyType old = ServiceTechnologyTypesImpl.this.xgetTypeArray(i);
                    ServiceTechnologyTypesImpl.this.removeType(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return ServiceTechnologyTypesImpl.this.sizeOfTypeArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new TypeList();
            }
        }
        
        /**
         * Gets array of all "type" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[] xgetTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceTechnologyType>();
                get_store().find_all_element_users(TYPE$0, targetList);
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[] result = new org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "type" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType xgetTypeArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "type" element
         */
        public int sizeOfTypeArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TYPE$0);
            }
        }
        
        /**
         * Sets array of all "type" element
         */
        public void setTypeArray(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum[] typeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typeArray, TYPE$0);
            }
        }
        
        /**
         * Sets ith "type" element
         */
        public void setTypeArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setEnumValue(type);
            }
        }
        
        /**
         * Sets (as xml) array of all "type" element
         */
        public void xsetTypeArray(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType[]typeArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(typeArray, TYPE$0);
            }
        }
        
        /**
         * Sets (as xml) ith "type" element
         */
        public void xsetTypeArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType)get_store().find_element_user(TYPE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(type);
            }
        }
        
        /**
         * Inserts the value as the ith "type" element
         */
        public void insertType(int i, org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TYPE$0, i);
                target.setEnumValue(type);
            }
        }
        
        /**
         * Appends the value as the last "type" element
         */
        public void addType(org.biocatalogue.x2009.xml.rest.ServiceTechnologyType.Enum type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
                target.setEnumValue(type);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "type" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType insertNewType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType)get_store().insert_element_user(TYPE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "type" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceTechnologyType addNewType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceTechnologyType target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceTechnologyType)get_store().add_element_user(TYPE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "type" element
         */
        public void removeType(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TYPE$0, i);
            }
        }
    }
    /**
     * An XML deployments(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class DeploymentsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Service.Deployments
    {
        private static final long serialVersionUID = 1L;
        
        public DeploymentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICEDEPLOYMENT$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceDeployment");
        
        
        /**
         * Gets a List of "serviceDeployment" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> getServiceDeploymentList()
        {
            final class ServiceDeploymentList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceDeployment>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment get(int i)
                    { return DeploymentsImpl.this.getServiceDeploymentArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment set(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment o)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceDeployment old = DeploymentsImpl.this.getServiceDeploymentArray(i);
                    DeploymentsImpl.this.setServiceDeploymentArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment o)
                    { DeploymentsImpl.this.insertNewServiceDeployment(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceDeployment old = DeploymentsImpl.this.getServiceDeploymentArray(i);
                    DeploymentsImpl.this.removeServiceDeployment(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DeploymentsImpl.this.sizeOfServiceDeploymentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ServiceDeploymentList();
            }
        }
        
        /**
         * Gets array of all "serviceDeployment" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment[] getServiceDeploymentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceDeployment>();
                get_store().find_all_element_users(SERVICEDEPLOYMENT$0, targetList);
                org.biocatalogue.x2009.xml.rest.ServiceDeployment[] result = new org.biocatalogue.x2009.xml.rest.ServiceDeployment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment getServiceDeploymentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().find_element_user(SERVICEDEPLOYMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "serviceDeployment" element
         */
        public int sizeOfServiceDeploymentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEDEPLOYMENT$0);
            }
        }
        
        /**
         * Sets array of all "serviceDeployment" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceDeploymentArray(org.biocatalogue.x2009.xml.rest.ServiceDeployment[] serviceDeploymentArray)
        {
            check_orphaned();
            arraySetterHelper(serviceDeploymentArray, SERVICEDEPLOYMENT$0);
        }
        
        /**
         * Sets ith "serviceDeployment" element
         */
        public void setServiceDeploymentArray(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment serviceDeployment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().find_element_user(SERVICEDEPLOYMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(serviceDeployment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment insertNewServiceDeployment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().insert_element_user(SERVICEDEPLOYMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment addNewServiceDeployment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().add_element_user(SERVICEDEPLOYMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "serviceDeployment" element
         */
        public void removeServiceDeployment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEDEPLOYMENT$0, i);
            }
        }
    }
    /**
     * An XML variants(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class VariantsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Service.Variants
    {
        private static final long serialVersionUID = 1L;
        
        public VariantsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOAPSERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapService");
        private static final javax.xml.namespace.QName RESTSERVICE$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "restService");
        
        
        /**
         * Gets a List of "soapService" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.SoapService> getSoapServiceList()
        {
            final class SoapServiceList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SoapService>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.SoapService get(int i)
                    { return VariantsImpl.this.getSoapServiceArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.SoapService set(int i, org.biocatalogue.x2009.xml.rest.SoapService o)
                {
                    org.biocatalogue.x2009.xml.rest.SoapService old = VariantsImpl.this.getSoapServiceArray(i);
                    VariantsImpl.this.setSoapServiceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.SoapService o)
                    { VariantsImpl.this.insertNewSoapService(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.SoapService remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.SoapService old = VariantsImpl.this.getSoapServiceArray(i);
                    VariantsImpl.this.removeSoapService(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return VariantsImpl.this.sizeOfSoapServiceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SoapServiceList();
            }
        }
        
        /**
         * Gets array of all "soapService" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.SoapService[] getSoapServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.SoapService> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SoapService>();
                get_store().find_all_element_users(SOAPSERVICE$0, targetList);
                org.biocatalogue.x2009.xml.rest.SoapService[] result = new org.biocatalogue.x2009.xml.rest.SoapService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapService getSoapServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().find_element_user(SOAPSERVICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "soapService" element
         */
        public int sizeOfSoapServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOAPSERVICE$0);
            }
        }
        
        /**
         * Sets array of all "soapService" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setSoapServiceArray(org.biocatalogue.x2009.xml.rest.SoapService[] soapServiceArray)
        {
            check_orphaned();
            arraySetterHelper(soapServiceArray, SOAPSERVICE$0);
        }
        
        /**
         * Sets ith "soapService" element
         */
        public void setSoapServiceArray(int i, org.biocatalogue.x2009.xml.rest.SoapService soapService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().find_element_user(SOAPSERVICE$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(soapService);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapService insertNewSoapService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().insert_element_user(SOAPSERVICE$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapService addNewSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().add_element_user(SOAPSERVICE$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "soapService" element
         */
        public void removeSoapService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOAPSERVICE$0, i);
            }
        }
        
        /**
         * Gets a List of "restService" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.RestService> getRestServiceList()
        {
            final class RestServiceList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.RestService>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.RestService get(int i)
                    { return VariantsImpl.this.getRestServiceArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.RestService set(int i, org.biocatalogue.x2009.xml.rest.RestService o)
                {
                    org.biocatalogue.x2009.xml.rest.RestService old = VariantsImpl.this.getRestServiceArray(i);
                    VariantsImpl.this.setRestServiceArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.RestService o)
                    { VariantsImpl.this.insertNewRestService(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.RestService remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.RestService old = VariantsImpl.this.getRestServiceArray(i);
                    VariantsImpl.this.removeRestService(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return VariantsImpl.this.sizeOfRestServiceArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new RestServiceList();
            }
        }
        
        /**
         * Gets array of all "restService" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.RestService[] getRestServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.RestService> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.RestService>();
                get_store().find_all_element_users(RESTSERVICE$2, targetList);
                org.biocatalogue.x2009.xml.rest.RestService[] result = new org.biocatalogue.x2009.xml.rest.RestService[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "restService" element
         */
        public org.biocatalogue.x2009.xml.rest.RestService getRestServiceArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().find_element_user(RESTSERVICE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "restService" element
         */
        public int sizeOfRestServiceArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESTSERVICE$2);
            }
        }
        
        /**
         * Sets array of all "restService" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setRestServiceArray(org.biocatalogue.x2009.xml.rest.RestService[] restServiceArray)
        {
            check_orphaned();
            arraySetterHelper(restServiceArray, RESTSERVICE$2);
        }
        
        /**
         * Sets ith "restService" element
         */
        public void setRestServiceArray(int i, org.biocatalogue.x2009.xml.rest.RestService restService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().find_element_user(RESTSERVICE$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(restService);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "restService" element
         */
        public org.biocatalogue.x2009.xml.rest.RestService insertNewRestService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().insert_element_user(RESTSERVICE$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "restService" element
         */
        public org.biocatalogue.x2009.xml.rest.RestService addNewRestService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().add_element_user(RESTSERVICE$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "restService" element
         */
        public void removeRestService(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESTSERVICE$2, i);
            }
        }
    }
    /**
     * An XML monitoring(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class MonitoringImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Service.Monitoring
    {
        private static final long serialVersionUID = 1L;
        
        public MonitoringImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TESTS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tests");
        
        
        /**
         * Gets the "tests" element
         */
        public org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests getTests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests target = null;
                target = (org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests)get_store().find_element_user(TESTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "tests" element
         */
        public void setTests(org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests tests)
        {
            generatedSetterHelperImpl(tests, TESTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tests" element
         */
        public org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests addNewTests()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests target = null;
                target = (org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests)get_store().add_element_user(TESTS$0);
                return target;
            }
        }
        /**
         * An XML tests(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public static class TestsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Service.Monitoring.Tests
        {
            private static final long serialVersionUID = 1L;
            
            public TestsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SERVICETEST$0 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceTest");
            
            
            /**
             * Gets a List of "serviceTest" elements
             */
            public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTest> getServiceTestList()
            {
                final class ServiceTestList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceTest>
                {
                    @Override
                    public org.biocatalogue.x2009.xml.rest.ServiceTest get(int i)
                        { return TestsImpl.this.getServiceTestArray(i); }
                    
                    @Override
                    public org.biocatalogue.x2009.xml.rest.ServiceTest set(int i, org.biocatalogue.x2009.xml.rest.ServiceTest o)
                    {
                      org.biocatalogue.x2009.xml.rest.ServiceTest old = TestsImpl.this.getServiceTestArray(i);
                      TestsImpl.this.setServiceTestArray(i, o);
                      return old;
                    }
                    
                    @Override
                    public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceTest o)
                        { TestsImpl.this.insertNewServiceTest(i).set(o); }
                    
                    @Override
                    public org.biocatalogue.x2009.xml.rest.ServiceTest remove(int i)
                    {
                      org.biocatalogue.x2009.xml.rest.ServiceTest old = TestsImpl.this.getServiceTestArray(i);
                      TestsImpl.this.removeServiceTest(i);
                      return old;
                    }
                    
                    @Override
                    public int size()
                        { return TestsImpl.this.sizeOfServiceTestArray(); }
                    
                }
                
                synchronized (monitor())
                {
                    check_orphaned();
                    return new ServiceTestList();
                }
            }
            
            /**
             * Gets array of all "serviceTest" elements
             * @deprecated
             */
            @Deprecated
            public org.biocatalogue.x2009.xml.rest.ServiceTest[] getServiceTestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List<org.biocatalogue.x2009.xml.rest.ServiceTest> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceTest>();
                    get_store().find_all_element_users(SERVICETEST$0, targetList);
                    org.biocatalogue.x2009.xml.rest.ServiceTest[] result = new org.biocatalogue.x2009.xml.rest.ServiceTest[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "serviceTest" element
             */
            public org.biocatalogue.x2009.xml.rest.ServiceTest getServiceTestArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().find_element_user(SERVICETEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "serviceTest" element
             */
            public int sizeOfServiceTestArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SERVICETEST$0);
                }
            }
            
            /**
             * Sets array of all "serviceTest" element  WARNING: This method is not atomicaly synchronized.
             */
            public void setServiceTestArray(org.biocatalogue.x2009.xml.rest.ServiceTest[] serviceTestArray)
            {
                check_orphaned();
                arraySetterHelper(serviceTestArray, SERVICETEST$0);
            }
            
            /**
             * Sets ith "serviceTest" element
             */
            public void setServiceTestArray(int i, org.biocatalogue.x2009.xml.rest.ServiceTest serviceTest)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().find_element_user(SERVICETEST$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(serviceTest);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "serviceTest" element
             */
            public org.biocatalogue.x2009.xml.rest.ServiceTest insertNewServiceTest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().insert_element_user(SERVICETEST$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "serviceTest" element
             */
            public org.biocatalogue.x2009.xml.rest.ServiceTest addNewServiceTest()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().add_element_user(SERVICETEST$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "serviceTest" element
             */
            public void removeServiceTest(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SERVICETEST$0, i);
                }
            }
        }
    }
}
