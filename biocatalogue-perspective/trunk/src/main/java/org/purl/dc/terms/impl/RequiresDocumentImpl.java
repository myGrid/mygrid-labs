/*
 * An XML document type.
 * Localname: requires
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.RequiresDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one requires(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class RequiresDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.RequiresDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequiresDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUIRES$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "requires");
    
    
    /**
     * Gets the "requires" element
     */
    public java.lang.String getRequires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "requires" element
     */
    public org.apache.xmlbeans.XmlString xgetRequires()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "requires" element
     */
    public void setRequires(java.lang.String requires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUIRES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUIRES$0);
            }
            target.setStringValue(requires);
        }
    }
    
    /**
     * Sets (as xml) the "requires" element
     */
    public void xsetRequires(org.apache.xmlbeans.XmlString requires)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUIRES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUIRES$0);
            }
            target.set(requires);
        }
    }
}
