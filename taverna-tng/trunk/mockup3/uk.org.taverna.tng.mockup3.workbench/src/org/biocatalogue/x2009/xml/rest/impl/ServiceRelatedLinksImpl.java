/*
 * XML Type:  ServiceRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServiceRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public ServiceRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName WITHSUMMARY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withSummary");
    private static final javax.xml.namespace.QName WITHMONITORING$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withMonitoring");
    private static final javax.xml.namespace.QName WITHALLSECTIONS$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withAllSections");
    private static final javax.xml.namespace.QName SUMMARY$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "summary");
    private static final javax.xml.namespace.QName DEPLOYMENTS$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "deployments");
    private static final javax.xml.namespace.QName VARIANTS$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "variants");
    private static final javax.xml.namespace.QName MONITORING$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "monitoring");
    private static final javax.xml.namespace.QName ANNOTATIONS$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
    
    
    /**
     * Gets the "withSummary" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHSUMMARY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withSummary" element
     */
    public void setWithSummary(org.biocatalogue.x2009.xml.rest.ResourceLink withSummary)
    {
        generatedSetterHelperImpl(withSummary, WITHSUMMARY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withSummary" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHSUMMARY$0);
            return target;
        }
    }
    
    /**
     * Gets the "withMonitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHMONITORING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withMonitoring" element
     */
    public void setWithMonitoring(org.biocatalogue.x2009.xml.rest.ResourceLink withMonitoring)
    {
        generatedSetterHelperImpl(withMonitoring, WITHMONITORING$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withMonitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHMONITORING$2);
            return target;
        }
    }
    
    /**
     * Gets the "withAllSections" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithAllSections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHALLSECTIONS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withAllSections" element
     */
    public void setWithAllSections(org.biocatalogue.x2009.xml.rest.ResourceLink withAllSections)
    {
        generatedSetterHelperImpl(withAllSections, WITHALLSECTIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withAllSections" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithAllSections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHALLSECTIONS$4);
            return target;
        }
    }
    
    /**
     * Gets the "summary" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SUMMARY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "summary" element
     */
    public void setSummary(org.biocatalogue.x2009.xml.rest.ResourceLink summary)
    {
        generatedSetterHelperImpl(summary, SUMMARY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "summary" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SUMMARY$6);
            return target;
        }
    }
    
    /**
     * Gets the "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(DEPLOYMENTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "deployments" element
     */
    public void setDeployments(org.biocatalogue.x2009.xml.rest.ResourceLink deployments)
    {
        generatedSetterHelperImpl(deployments, DEPLOYMENTS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(DEPLOYMENTS$8);
            return target;
        }
    }
    
    /**
     * Gets the "variants" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(VARIANTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "variants" element
     */
    public void setVariants(org.biocatalogue.x2009.xml.rest.ResourceLink variants)
    {
        generatedSetterHelperImpl(variants, VARIANTS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "variants" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(VARIANTS$10);
            return target;
        }
    }
    
    /**
     * Gets the "monitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(MONITORING$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "monitoring" element
     */
    public void setMonitoring(org.biocatalogue.x2009.xml.rest.ResourceLink monitoring)
    {
        generatedSetterHelperImpl(monitoring, MONITORING$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "monitoring" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewMonitoring()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(MONITORING$12);
            return target;
        }
    }
    
    /**
     * Gets the "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotations" element
     */
    public void setAnnotations(org.biocatalogue.x2009.xml.rest.ResourceLink annotations)
    {
        generatedSetterHelperImpl(annotations, ANNOTATIONS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$14);
            return target;
        }
    }
}
