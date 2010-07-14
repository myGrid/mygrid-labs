/*
 * An XML document type.
 * Localname: hasFormat
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.HasFormatDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one hasFormat(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class HasFormatDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.HasFormatDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasFormatDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASFORMAT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasFormat");
    
    
    /**
     * Gets the "hasFormat" element
     */
    public java.lang.String getHasFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFORMAT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasFormat" element
     */
    public org.apache.xmlbeans.XmlString xgetHasFormat()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASFORMAT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hasFormat" element
     */
    public void setHasFormat(java.lang.String hasFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASFORMAT$0);
            }
            target.setStringValue(hasFormat);
        }
    }
    
    /**
     * Sets (as xml) the "hasFormat" element
     */
    public void xsetHasFormat(org.apache.xmlbeans.XmlString hasFormat)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASFORMAT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASFORMAT$0);
            }
            target.set(hasFormat);
        }
    }
}
