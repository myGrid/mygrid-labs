/*
 * An XML document type.
 * Localname: accrualPolicy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccrualPolicyDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one accrualPolicy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AccrualPolicyDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.AccrualPolicyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccrualPolicyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCRUALPOLICY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPolicy");
    
    
    /**
     * Gets the "accrualPolicy" element
     */
    public java.lang.String getAccrualPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALPOLICY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accrualPolicy" element
     */
    public org.apache.xmlbeans.XmlString xgetAccrualPolicy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALPOLICY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accrualPolicy" element
     */
    public void setAccrualPolicy(java.lang.String accrualPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALPOLICY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCRUALPOLICY$0);
            }
            target.setStringValue(accrualPolicy);
        }
    }
    
    /**
     * Sets (as xml) the "accrualPolicy" element
     */
    public void xsetAccrualPolicy(org.apache.xmlbeans.XmlString accrualPolicy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALPOLICY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCRUALPOLICY$0);
            }
            target.set(accrualPolicy);
        }
    }
}
