/*
 * An XML document type.
 * Localname: provenance
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.ProvenanceDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one provenance(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class ProvenanceDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.ProvenanceDocument
{
    private static final long serialVersionUID = 1L;
    
    public ProvenanceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROVENANCE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "provenance");
    
    
    /**
     * Gets the "provenance" element
     */
    public java.lang.String getProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVENANCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "provenance" element
     */
    public org.apache.xmlbeans.XmlString xgetProvenance()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVENANCE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "provenance" element
     */
    public void setProvenance(java.lang.String provenance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVENANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVENANCE$0);
            }
            target.setStringValue(provenance);
        }
    }
    
    /**
     * Sets (as xml) the "provenance" element
     */
    public void xsetProvenance(org.apache.xmlbeans.XmlString provenance)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROVENANCE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROVENANCE$0);
            }
            target.set(provenance);
        }
    }
}
