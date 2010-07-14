/*
 * An XML document type.
 * Localname: rightsHolder
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.RightsHolderDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one rightsHolder(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class RightsHolderDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.RightsHolderDocument
{
    private static final long serialVersionUID = 1L;
    
    public RightsHolderDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIGHTSHOLDER$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "rightsHolder");
    
    
    /**
     * Gets the "rightsHolder" element
     */
    public java.lang.String getRightsHolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTSHOLDER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rightsHolder" element
     */
    public org.apache.xmlbeans.XmlString xgetRightsHolder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTSHOLDER$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rightsHolder" element
     */
    public void setRightsHolder(java.lang.String rightsHolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTSHOLDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIGHTSHOLDER$0);
            }
            target.setStringValue(rightsHolder);
        }
    }
    
    /**
     * Sets (as xml) the "rightsHolder" element
     */
    public void xsetRightsHolder(org.apache.xmlbeans.XmlString rightsHolder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTSHOLDER$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RIGHTSHOLDER$0);
            }
            target.set(rightsHolder);
        }
    }
}
