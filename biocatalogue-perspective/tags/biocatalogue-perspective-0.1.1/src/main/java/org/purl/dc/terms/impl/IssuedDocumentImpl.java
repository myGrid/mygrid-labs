/*
 * An XML document type.
 * Localname: issued
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IssuedDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one issued(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IssuedDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.IssuedDocument
{
    private static final long serialVersionUID = 1L;
    
    public IssuedDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISSUED$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "issued");
    
    
    /**
     * Gets the "issued" element
     */
    public java.util.Calendar getIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "issued" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetIssued()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ISSUED$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "issued" element
     */
    public void setIssued(java.util.Calendar issued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSUED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSUED$0);
            }
            target.setCalendarValue(issued);
        }
    }
    
    /**
     * Sets (as xml) the "issued" element
     */
    public void xsetIssued(org.apache.xmlbeans.XmlDateTime issued)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(ISSUED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(ISSUED$0);
            }
            target.set(issued);
        }
    }
}
