/*
 * An XML document type.
 * Localname: tag
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one tag(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class TagDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TagDocument
{
    private static final long serialVersionUID = 1L;
    
    public TagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAG$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tag");
    
    
    /**
     * Gets the "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.Tag getTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().find_element_user(TAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tag" element
     */
    public void setTag(org.biocatalogue.x2009.xml.rest.Tag tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().find_element_user(TAG$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().add_element_user(TAG$0);
            }
            target.set(tag);
        }
    }
    
    /**
     * Appends and returns a new empty "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.Tag addNewTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().add_element_user(TAG$0);
            return target;
        }
    }
}
