/*
 * XML Type:  AnnotationsRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationsRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AnnotationsRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationsRelatedLinksImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreRelatedLinksImpl implements org.biocatalogue.x2009.xml.rest.AnnotationsRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
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
