/*
 * An XML document type.
 * Localname: dateSubmitted
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.DateSubmittedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one dateSubmitted(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class DateSubmittedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.DateSubmittedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateSubmittedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATESUBMITTED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateSubmitted");
    
    
    /**
     * Gets the "dateSubmitted" element
     */
    public java.util.Calendar getDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESUBMITTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateSubmitted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateSubmitted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATESUBMITTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateSubmitted" element
     */
    public void setDateSubmitted(java.util.Calendar dateSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATESUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATESUBMITTED$0);
            }
            target.setCalendarValue(dateSubmitted);
        }
    }
    
    /**
     * Sets (as xml) the "dateSubmitted" element
     */
    public void xsetDateSubmitted(org.apache.xmlbeans.XmlDateTime dateSubmitted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATESUBMITTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATESUBMITTED$0);
            }
            target.set(dateSubmitted);
        }
    }
}
