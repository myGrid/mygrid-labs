/*
 * An XML document type.
 * Localname: dateAccepted
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.DateAcceptedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one dateAccepted(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class DateAcceptedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.DateAcceptedDocument
{
    private static final long serialVersionUID = 1L;
    
    public DateAcceptedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATEACCEPTED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "dateAccepted");
    
    
    /**
     * Gets the "dateAccepted" element
     */
    public java.util.Calendar getDateAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEACCEPTED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "dateAccepted" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDateAccepted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEACCEPTED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "dateAccepted" element
     */
    public void setDateAccepted(java.util.Calendar dateAccepted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATEACCEPTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATEACCEPTED$0);
            }
            target.setCalendarValue(dateAccepted);
        }
    }
    
    /**
     * Sets (as xml) the "dateAccepted" element
     */
    public void xsetDateAccepted(org.apache.xmlbeans.XmlDateTime dateAccepted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATEACCEPTED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATEACCEPTED$0);
            }
            target.set(dateAccepted);
        }
    }
}
