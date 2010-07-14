/*
 * An XML document type.
 * Localname: abstract
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AbstractDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one abstract(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AbstractDocumentImpl extends org.purl.dc.elements.x11.impl.DescriptionDocumentImpl implements org.purl.dc.terms.AbstractDocument
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ABSTRACT$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract");
    
    
    /**
     * Gets the "abstract" element
     */
    public java.lang.String getAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abstract" element
     */
    public org.apache.xmlbeans.XmlString xgetAbstract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "abstract" element
     */
    public void setAbstract(java.lang.String xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABSTRACT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABSTRACT$0);
            }
            target.setStringValue(xabstract);
        }
    }
    
    /**
     * Sets (as xml) the "abstract" element
     */
    public void xsetAbstract(org.apache.xmlbeans.XmlString xabstract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ABSTRACT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ABSTRACT$0);
            }
            target.set(xabstract);
        }
    }
}
