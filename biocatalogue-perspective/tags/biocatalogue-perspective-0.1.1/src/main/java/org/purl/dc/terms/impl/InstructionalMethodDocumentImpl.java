/*
 * An XML document type.
 * Localname: instructionalMethod
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.InstructionalMethodDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one instructionalMethod(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class InstructionalMethodDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.InstructionalMethodDocument
{
    private static final long serialVersionUID = 1L;
    
    public InstructionalMethodDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INSTRUCTIONALMETHOD$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "instructionalMethod");
    
    
    /**
     * Gets the "instructionalMethod" element
     */
    public java.lang.String getInstructionalMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTIONALMETHOD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "instructionalMethod" element
     */
    public org.apache.xmlbeans.XmlString xgetInstructionalMethod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTIONALMETHOD$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "instructionalMethod" element
     */
    public void setInstructionalMethod(java.lang.String instructionalMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTRUCTIONALMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTRUCTIONALMETHOD$0);
            }
            target.setStringValue(instructionalMethod);
        }
    }
    
    /**
     * Sets (as xml) the "instructionalMethod" element
     */
    public void xsetInstructionalMethod(org.apache.xmlbeans.XmlString instructionalMethod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTRUCTIONALMETHOD$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTRUCTIONALMETHOD$0);
            }
            target.set(instructionalMethod);
        }
    }
}
