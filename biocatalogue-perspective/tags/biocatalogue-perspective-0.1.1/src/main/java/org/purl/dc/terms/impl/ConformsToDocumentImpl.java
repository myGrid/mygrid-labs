/*
 * An XML document type.
 * Localname: conformsTo
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ConformsToDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one conformsTo(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ConformsToDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ConformsToDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConformsToDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONFORMSTO$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo");
    
    
    /**
     * Gets the "conformsTo" element
     */
    public java.lang.String getConformsTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFORMSTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "conformsTo" element
     */
    public org.apache.xmlbeans.XmlString xgetConformsTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFORMSTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "conformsTo" element
     */
    public void setConformsTo(java.lang.String conformsTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONFORMSTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONFORMSTO$0);
            }
            target.setStringValue(conformsTo);
        }
    }
    
    /**
     * Sets (as xml) the "conformsTo" element
     */
    public void xsetConformsTo(org.apache.xmlbeans.XmlString conformsTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONFORMSTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONFORMSTO$0);
            }
            target.set(conformsTo);
        }
    }
}
