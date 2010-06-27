/*
 * An XML document type.
 * Localname: temporal
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.TemporalDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one temporal(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class TemporalDocumentImpl extends org.purl.dc.elements.x11.impl.CoverageDocumentImpl implements org.purl.dc.terms.TemporalDocument
{
    private static final long serialVersionUID = 1L;
    
    public TemporalDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TEMPORAL$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "temporal");
    
    
    /**
     * Gets the "temporal" element
     */
    public java.lang.String getTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPORAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "temporal" element
     */
    public org.apache.xmlbeans.XmlString xgetTemporal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPORAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "temporal" element
     */
    public void setTemporal(java.lang.String temporal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEMPORAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEMPORAL$0);
            }
            target.setStringValue(temporal);
        }
    }
    
    /**
     * Sets (as xml) the "temporal" element
     */
    public void xsetTemporal(org.apache.xmlbeans.XmlString temporal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEMPORAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEMPORAL$0);
            }
            target.set(temporal);
        }
    }
}
