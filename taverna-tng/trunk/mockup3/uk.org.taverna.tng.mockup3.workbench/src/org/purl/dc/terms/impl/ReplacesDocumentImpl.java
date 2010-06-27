/*
 * An XML document type.
 * Localname: replaces
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ReplacesDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one replaces(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ReplacesDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ReplacesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReplacesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPLACES$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces");
    
    
    /**
     * Gets the "replaces" element
     */
    public java.lang.String getReplaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "replaces" element
     */
    public org.apache.xmlbeans.XmlString xgetReplaces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "replaces" element
     */
    public void setReplaces(java.lang.String replaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLACES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLACES$0);
            }
            target.setStringValue(replaces);
        }
    }
    
    /**
     * Sets (as xml) the "replaces" element
     */
    public void xsetReplaces(org.apache.xmlbeans.XmlString replaces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLACES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLACES$0);
            }
            target.set(replaces);
        }
    }
}
