/*
 * An XML document type.
 * Localname: creator
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.CreatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one creator(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class CreatorDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.CreatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public CreatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CREATOR$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator");
    
    
    /**
     * Gets the "creator" element
     */
    public java.lang.String getCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "creator" element
     */
    public org.apache.xmlbeans.XmlString xgetCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "creator" element
     */
    public void setCreator(java.lang.String creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATOR$0);
            }
            target.setStringValue(creator);
        }
    }
    
    /**
     * Sets (as xml) the "creator" element
     */
    public void xsetCreator(org.apache.xmlbeans.XmlString creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATOR$0);
            }
            target.set(creator);
        }
    }
}
