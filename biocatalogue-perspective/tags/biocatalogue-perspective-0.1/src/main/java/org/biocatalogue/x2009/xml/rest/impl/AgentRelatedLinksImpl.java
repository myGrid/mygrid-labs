/*
 * XML Type:  AgentRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AgentRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AgentRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AgentRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AgentRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public AgentRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONSBY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationsBy");
    
    
    /**
     * Gets the "annotationsBy" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationsBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONSBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotationsBy" element
     */
    public void setAnnotationsBy(org.biocatalogue.x2009.xml.rest.ResourceLink annotationsBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONSBY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONSBY$0);
            }
            target.set(annotationsBy);
        }
    }
    
    /**
     * Appends and returns a new empty "annotationsBy" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationsBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONSBY$0);
            return target;
        }
    }
}
