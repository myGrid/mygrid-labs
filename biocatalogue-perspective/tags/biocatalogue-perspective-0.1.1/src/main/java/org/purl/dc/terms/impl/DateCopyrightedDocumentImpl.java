/*
 * An XML document type.
 * Localname: dateCopyrighted
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.DateCopyrightedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one dateCopyrighted(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class DateCopyrightedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.DateCopyrightedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateCopyrightedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATECOPYRIGHTED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateCopyrighted");
    
    
    /**
     * Gets the "dateCopyrighted" element
     */
    public java.util.Calendar getDateCopyrighted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateCopyrighted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateCopyrighted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateCopyrighted" element
     */
    public void setDateCopyrighted(java.util.Calendar dateCopyrighted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATECOPYRIGHTED$0);
            }
            target.setCalendarValue(dateCopyrighted);
        }
    }
    
    /**
     * Sets (as xml) the "dateCopyrighted" element
     */
    public void xsetDateCopyrighted(org.apache.xmlbeans.XmlDateTime dateCopyrighted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATECOPYRIGHTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATECOPYRIGHTED$0);
            }
            target.set(dateCopyrighted);
        }
    }
}
