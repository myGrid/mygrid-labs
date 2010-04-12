/*
 * An XML document type.
 * Localname: tags
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one tags(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class TagsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TagsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TagsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAGS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tags");
    
    
    /**
     * Gets the "tags" element
     */
    public org.biocatalogue.x2009.xml.rest.Tags getTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tags target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tags)get_store().find_element_user(TAGS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tags" element
     */
    public void setTags(org.biocatalogue.x2009.xml.rest.Tags tags)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tags target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tags)get_store().find_element_user(TAGS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Tags)get_store().add_element_user(TAGS$0);
            }
            target.set(tags);
        }
    }
    
    /**
     * Appends and returns a new empty "tags" element
     */
    public org.biocatalogue.x2009.xml.rest.Tags addNewTags()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tags target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tags)get_store().add_element_user(TAGS$0);
            return target;
        }
    }
}
