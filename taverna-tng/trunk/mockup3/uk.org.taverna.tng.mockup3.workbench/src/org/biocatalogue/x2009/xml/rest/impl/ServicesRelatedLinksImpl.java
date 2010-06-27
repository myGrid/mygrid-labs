/*
 * XML Type:  ServicesRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServicesRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServicesRelatedLinksImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreRelatedLinksImpl implements org.biocatalogue.x2009.xml.rest.ServicesRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public ServicesRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
    private static final javax.xml.namespace.QName FILTERSONCURRENTRESULTS$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filtersOnCurrentResults");
    private static final javax.xml.namespace.QName WITHSUMMARIES$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withSummaries");
    private static final javax.xml.namespace.QName WITHDEPLOYMENTS$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withDeployments");
    private static final javax.xml.namespace.QName WITHVARIANTS$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withVariants");
    private static final javax.xml.namespace.QName WITHMONITORING$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withMonitoring");
    private static final javax.xml.namespace.QName WITHALLSECTIONS$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "withAllSections");
    
    
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
        generatedSetterHelperImpl(filters, FILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
        generatedSetterHelperImpl(filtersOnCurrentResults, FILTERSONCURRENTRESULTS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
    
    /**
     * Gets the "withSummaries" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithSummaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHSUMMARIES$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withSummaries" element
     */
    public void setWithSummaries(org.biocatalogue.x2009.xml.rest.ResourceLink withSummaries)
    {
        generatedSetterHelperImpl(withSummaries, WITHSUMMARIES$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withSummaries" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithSummaries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHSUMMARIES$4);
            return target;
        }
    }
    
    /**
     * Gets the "withDeployments" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHDEPLOYMENTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withDeployments" element
     */
    public void setWithDeployments(org.biocatalogue.x2009.xml.rest.ResourceLink withDeployments)
    {
        generatedSetterHelperImpl(withDeployments, WITHDEPLOYMENTS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withDeployments" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHDEPLOYMENTS$6);
            return target;
        }
    }
    
    /**
     * Gets the "withVariants" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getWithVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHVARIANTS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "withVariants" element
     */
    public void setWithVariants(org.biocatalogue.x2009.xml.rest.ResourceLink withVariants)
    {
        generatedSetterHelperImpl(withVariants, WITHVARIANTS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "withVariants" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewWithVariants()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHVARIANTS$8);
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHMONITORING$10, 0);
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
        generatedSetterHelperImpl(withMonitoring, WITHMONITORING$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHMONITORING$10);
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(WITHALLSECTIONS$12, 0);
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
        generatedSetterHelperImpl(withAllSections, WITHALLSECTIONS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(WITHALLSECTIONS$12);
            return target;
        }
    }
}
