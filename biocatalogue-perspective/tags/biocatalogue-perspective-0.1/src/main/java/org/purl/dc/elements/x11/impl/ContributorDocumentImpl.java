/*
 * An XML document type.
 * Localname: contributor
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.ContributorDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one contributor(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class ContributorDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.ContributorDocument
{
    private static final long serialVersionUID = 1L;
    
    public ContributorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTRIBUTOR$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "contributor");
    
    
    /**
     * Gets the "contributor" element
     */
    public java.lang.String getContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contributor" element
     */
    public org.apache.xmlbeans.XmlString xgetContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRIBUTOR$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "contributor" element
     */
    public void setContributor(java.lang.String contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRIBUTOR$0);
            }
            target.setStringValue(contributor);
        }
    }
    
    /**
     * Sets (as xml) the "contributor" element
     */
    public void xsetContributor(org.apache.xmlbeans.XmlString contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRIBUTOR$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRIBUTOR$0);
            }
            target.set(contributor);
        }
    }
}
