/*
 * XML Type:  Categories
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Categories
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Categories(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CategoriesImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Categories
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesImpl(org.apache.xmlbeans.SchemaType sType)
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
    public org.biocatalogue.x2009.xml.rest.CategoriesParameters getParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters)get_store().find_element_user(PARAMETERS$0, 0);
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
    public void setParameters(org.biocatalogue.x2009.xml.rest.CategoriesParameters parameters)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters)get_store().find_element_user(PARAMETERS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters)get_store().add_element_user(PARAMETERS$0);
            }
            target.set(parameters);
        }
    }
    
    /**
     * Appends and returns a new empty "parameters" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesParameters addNewParameters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters)get_store().add_element_user(PARAMETERS$0);
            return target;
        }
    }
    
    /**
     * Gets the "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesStatistics getStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesStatistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesStatistics)get_store().find_element_user(STATISTICS$2, 0);
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
    public void setStatistics(org.biocatalogue.x2009.xml.rest.CategoriesStatistics statistics)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesStatistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesStatistics)get_store().find_element_user(STATISTICS$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.CategoriesStatistics)get_store().add_element_user(STATISTICS$2);
            }
            target.set(statistics);
        }
    }
    
    /**
     * Appends and returns a new empty "statistics" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesStatistics addNewStatistics()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesStatistics target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesStatistics)get_store().add_element_user(STATISTICS$2);
            return target;
        }
    }
    
    /**
     * Gets the "results" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesResults getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesResults)get_store().find_element_user(RESULTS$4, 0);
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
    public void setResults(org.biocatalogue.x2009.xml.rest.CategoriesResults results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesResults)get_store().find_element_user(RESULTS$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.CategoriesResults)get_store().add_element_user(RESULTS$4);
            }
            target.set(results);
        }
    }
    
    /**
     * Appends and returns a new empty "results" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesResults addNewResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesResults)get_store().add_element_user(RESULTS$4);
            return target;
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks)get_store().find_element_user(RELATED$6, 0);
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
    public void setRelated(org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks)get_store().find_element_user(RELATED$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks)get_store().add_element_user(RELATED$6);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesRelatedLinks)get_store().add_element_user(RELATED$6);
            return target;
        }
    }
}
