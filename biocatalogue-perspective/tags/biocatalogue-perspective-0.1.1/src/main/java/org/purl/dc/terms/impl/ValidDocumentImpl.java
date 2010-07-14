/*
 * An XML document type.
 * Localname: valid
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ValidDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one valid(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ValidDocumentImpl extends org.purl.dc.elements.x11.impl.DateDocumentImpl implements org.purl.dc.terms.ValidDocument
{
    private static final long serialVersionUID = 1L;
    
    public ValidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALID$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "valid");
    
    
    /**
     * Gets the "valid" element
     */
    public java.util.Calendar getValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "valid" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetValid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VALID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "valid" element
     */
    public void setValid(java.util.Calendar valid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALID$0);
            }
            target.setCalendarValue(valid);
        }
    }
    
    /**
     * Sets (as xml) the "valid" element
     */
    public void xsetValid(org.apache.xmlbeans.XmlDateTime valid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(VALID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(VALID$0);
            }
            target.set(valid);
        }
    }
}
