/*
 * XML Type:  CollectionCoreRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CollectionCoreRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML CollectionCoreRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CollectionCoreRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CollectionCoreRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public CollectionCoreRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PREVIOUS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "previous");
    private static final javax.xml.namespace.QName NEXT$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "next");
    
    
    /**
     * Gets the "previous" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getPrevious()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(PREVIOUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "previous" element
     */
    public boolean isSetPrevious()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIOUS$0) != 0;
        }
    }
    
    /**
     * Sets the "previous" element
     */
    public void setPrevious(org.biocatalogue.x2009.xml.rest.ResourceLink previous)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(PREVIOUS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(PREVIOUS$0);
            }
            target.set(previous);
        }
    }
    
    /**
     * Appends and returns a new empty "previous" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewPrevious()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(PREVIOUS$0);
            return target;
        }
    }
    
    /**
     * Unsets the "previous" element
     */
    public void unsetPrevious()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIOUS$0, 0);
        }
    }
    
    /**
     * Gets the "next" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(NEXT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "next" element
     */
    public boolean isSetNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXT$2) != 0;
        }
    }
    
    /**
     * Sets the "next" element
     */
    public void setNext(org.biocatalogue.x2009.xml.rest.ResourceLink next)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(NEXT$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(NEXT$2);
            }
            target.set(next);
        }
    }
    
    /**
     * Appends and returns a new empty "next" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(NEXT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "next" element
     */
    public void unsetNext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXT$2, 0);
        }
    }
}
