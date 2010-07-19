/*
 * An XML document type.
 * Localname: publisher
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.PublisherDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one publisher(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class PublisherDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.PublisherDocument
{
    private static final long serialVersionUID = 1L;
    
    public PublisherDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PUBLISHER$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "publisher");
    
    
    /**
     * Gets the "publisher" element
     */
    public java.lang.String getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publisher" element
     */
    public org.apache.xmlbeans.XmlString xgetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publisher" element
     */
    public void setPublisher(java.lang.String publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHER$0);
            }
            target.setStringValue(publisher);
        }
    }
    
    /**
     * Sets (as xml) the "publisher" element
     */
    public void xsetPublisher(org.apache.xmlbeans.XmlString publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHER$0);
            }
            target.set(publisher);
        }
    }
}
