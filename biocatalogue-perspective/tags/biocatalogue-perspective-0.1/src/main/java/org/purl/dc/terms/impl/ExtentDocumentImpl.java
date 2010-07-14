/*
 * An XML document type.
 * Localname: extent
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ExtentDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one extent(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ExtentDocumentImpl extends org.purl.dc.elements.x11.impl.FormatDocumentImpl implements org.purl.dc.terms.ExtentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent");
    
    
    /**
     * Gets the "extent" element
     */
    public java.lang.String getExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extent" element
     */
    public org.apache.xmlbeans.XmlString xgetExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "extent" element
     */
    public void setExtent(java.lang.String extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENT$0);
            }
            target.setStringValue(extent);
        }
    }
    
    /**
     * Sets (as xml) the "extent" element
     */
    public void xsetExtent(org.apache.xmlbeans.XmlString extent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXTENT$0);
            }
            target.set(extent);
        }
    }
}
