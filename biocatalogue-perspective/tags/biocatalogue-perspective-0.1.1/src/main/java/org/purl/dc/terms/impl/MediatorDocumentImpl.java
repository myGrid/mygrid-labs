/*
 * An XML document type.
 * Localname: mediator
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.MediatorDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one mediator(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class MediatorDocumentImpl extends org.purl.dc.terms.impl.AudienceDocumentImpl implements org.purl.dc.terms.MediatorDocument
{
    private static final long serialVersionUID = 1L;
    
    public MediatorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEDIATOR$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator");
    
    
    /**
     * Gets the "mediator" element
     */
    public java.lang.String getMediator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediator" element
     */
    public org.apache.xmlbeans.XmlString xgetMediator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "mediator" element
     */
    public void setMediator(java.lang.String mediator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEDIATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEDIATOR$0);
            }
            target.setStringValue(mediator);
        }
    }
    
    /**
     * Sets (as xml) the "mediator" element
     */
    public void xsetMediator(org.apache.xmlbeans.XmlString mediator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MEDIATOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MEDIATOR$0);
            }
            target.set(mediator);
        }
    }
}
