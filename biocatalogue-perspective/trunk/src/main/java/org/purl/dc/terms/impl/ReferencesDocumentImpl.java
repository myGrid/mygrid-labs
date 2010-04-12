/*
 * An XML document type.
 * Localname: references
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ReferencesDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one references(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ReferencesDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.ReferencesDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferencesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCES$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references");
    
    
    /**
     * Gets the "references" element
     */
    public java.lang.String getReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "references" element
     */
    public org.apache.xmlbeans.XmlString xgetReferences()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "references" element
     */
    public void setReferences(java.lang.String references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFERENCES$0);
            }
            target.setStringValue(references);
        }
    }
    
    /**
     * Sets (as xml) the "references" element
     */
    public void xsetReferences(org.apache.xmlbeans.XmlString references)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REFERENCES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REFERENCES$0);
            }
            target.set(references);
        }
    }
}
