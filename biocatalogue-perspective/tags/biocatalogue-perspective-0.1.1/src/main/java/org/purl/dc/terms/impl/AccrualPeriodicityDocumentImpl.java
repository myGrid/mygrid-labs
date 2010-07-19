/*
 * An XML document type.
 * Localname: accrualPeriodicity
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccrualPeriodicityDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one accrualPeriodicity(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AccrualPeriodicityDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.AccrualPeriodicityDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccrualPeriodicityDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCRUALPERIODICITY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPeriodicity");
    
    
    /**
     * Gets the "accrualPeriodicity" element
     */
    public java.lang.String getAccrualPeriodicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALPERIODICITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accrualPeriodicity" element
     */
    public org.apache.xmlbeans.XmlString xgetAccrualPeriodicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALPERIODICITY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accrualPeriodicity" element
     */
    public void setAccrualPeriodicity(java.lang.String accrualPeriodicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCRUALPERIODICITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCRUALPERIODICITY$0);
            }
            target.setStringValue(accrualPeriodicity);
        }
    }
    
    /**
     * Sets (as xml) the "accrualPeriodicity" element
     */
    public void xsetAccrualPeriodicity(org.apache.xmlbeans.XmlString accrualPeriodicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCRUALPERIODICITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCRUALPERIODICITY$0);
            }
            target.set(accrualPeriodicity);
        }
    }
}
