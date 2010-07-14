/*
 * An XML document type.
 * Localname: accrualMethod
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccrualMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one accrualMethod(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AccrualMethodDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.AccrualMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccrualMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCRUALMETHOD$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualMethod");
    
    
    /**
     * Gets the "accrualMethod" element
     */
    public java.lang.String getAccrualMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accrualMethod" element
     */
    public org.apache.xmlbeans.XmlString xgetAccrualMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALMETHOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accrualMethod" element
     */
    public void setAccrualMethod(java.lang.String accrualMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCRUALMETHOD$0);
            }
            target.setStringValue(accrualMethod);
        }
    }
    
    /**
     * Sets (as xml) the "accrualMethod" element
     */
    public void xsetAccrualMethod(org.apache.xmlbeans.XmlString accrualMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCRUALMETHOD$0);
            }
            target.set(accrualMethod);
        }
    }
}
