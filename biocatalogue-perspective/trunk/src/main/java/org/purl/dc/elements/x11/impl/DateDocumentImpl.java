/*
 * An XML document type.
 * Localname: date
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.DateDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one date(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class DateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.dc.elements.x11.DateDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "date");
    private static final org.apache.xmlbeans.QNameSet DATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateCopyrighted"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "available"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "date"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "modified"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "valid"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateAccepted"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateSubmitted"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "issued"),
    });
    
    
    /**
     * Gets the "date" element
     */
    public java.util.Calendar getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "date" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(java.util.Calendar date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATE$0);
            }
            target.setCalendarValue(date);
        }
    }
    
    /**
     * Sets (as xml) the "date" element
     */
    public void xsetDate(org.apache.xmlbeans.XmlDateTime date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATE$0);
            }
            target.set(date);
        }
    }
}
