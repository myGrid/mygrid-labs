/*
 * An XML document type.
 * Localname: available
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AvailableDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one available(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AvailableDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.AvailableDocument
{
    private static final long serialVersionUID = 1L;
    
    public AvailableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AVAILABLE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "available");
    
    
    /**
     * Gets the "available" element
     */
    public java.util.Calendar getAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "available" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetAvailable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AVAILABLE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "available" element
     */
    public void setAvailable(java.util.Calendar available)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AVAILABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AVAILABLE$0);
            }
            target.setCalendarValue(available);
        }
    }
    
    /**
     * Sets (as xml) the "available" element
     */
    public void xsetAvailable(org.apache.xmlbeans.XmlDateTime available)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(AVAILABLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(AVAILABLE$0);
            }
            target.set(available);
        }
    }
}
