/*
 * An XML document type.
 * Localname: modified
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ModifiedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one modified(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ModifiedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.ModifiedDocument
{
    private static final long serialVersionUID = 1L;
    
    public ModifiedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "modified");
    
    
    /**
     * Gets the "modified" element
     */
    public java.util.Calendar getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    public void setModified(java.util.Calendar modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$0);
            }
            target.setCalendarValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" element
     */
    public void xsetModified(org.apache.xmlbeans.XmlDateTime modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIED$0);
            }
            target.set(modified);
        }
    }
}
