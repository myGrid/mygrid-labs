/*
 * An XML document type.
 * Localname: format
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.FormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one format(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class FormatDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.FormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public FormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FORMAT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format");
    private static final org.apache.xmlbeans.QNameSet FORMAT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent"),
    });
    
    
    /**
     * Gets the "format" element
     */
    public java.lang.String getFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "format" element
     */
    public org.apache.xmlbeans.XmlString xgetFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "format" element
     */
    public void setFormat(java.lang.String format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMAT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMAT$0);
            }
            target.setStringValue(format);
        }
    }
    
    /**
     * Sets (as xml) the "format" element
     */
    public void xsetFormat(org.apache.xmlbeans.XmlString format)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORMAT$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORMAT$0);
            }
            target.set(format);
        }
    }
}
