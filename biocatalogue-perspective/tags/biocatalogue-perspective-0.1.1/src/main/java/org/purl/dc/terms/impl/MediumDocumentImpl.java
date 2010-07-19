/*
 * An XML document type.
 * Localname: medium
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.MediumDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one medium(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class MediumDocumentImpl extends org.purl.dc.elements.x11.impl.FormatDocumentImpl implements org.purl.dc.terms.MediumDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIUM$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium");
    
    
    /**
     * Gets the "medium" element
     */
    public java.lang.String getMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "medium" element
     */
    public org.apache.xmlbeans.XmlString xgetMedium()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUM$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "medium" element
     */
    public void setMedium(java.lang.String medium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIUM$0);
            }
            target.setStringValue(medium);
        }
    }
    
    /**
     * Sets (as xml) the "medium" element
     */
    public void xsetMedium(org.apache.xmlbeans.XmlString medium)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIUM$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIUM$0);
            }
            target.set(medium);
        }
    }
}
