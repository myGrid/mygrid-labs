/*
 * An XML document type.
 * Localname: hasPart
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.HasPartDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one hasPart(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class HasPartDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.HasPartDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasPartDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASPART$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart");
    
    
    /**
     * Gets the "hasPart" element
     */
    public java.lang.String getHasPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPART$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasPart" element
     */
    public org.apache.xmlbeans.XmlString xgetHasPart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASPART$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hasPart" element
     */
    public void setHasPart(java.lang.String hasPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASPART$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASPART$0);
            }
            target.setStringValue(hasPart);
        }
    }
    
    /**
     * Sets (as xml) the "hasPart" element
     */
    public void xsetHasPart(org.apache.xmlbeans.XmlString hasPart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASPART$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASPART$0);
            }
            target.set(hasPart);
        }
    }
}
