/*
 * An XML document type.
 * Localname: source
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.SourceDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one source(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class SourceDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.SourceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SourceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "source");
    
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$0);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$0);
            }
            target.set(source);
        }
    }
}
