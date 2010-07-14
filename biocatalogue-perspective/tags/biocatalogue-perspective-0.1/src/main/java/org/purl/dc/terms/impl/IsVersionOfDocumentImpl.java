/*
 * An XML document type.
 * Localname: isVersionOf
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsVersionOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isVersionOf(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsVersionOfDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsVersionOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsVersionOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISVERSIONOF$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isVersionOf");
    
    
    /**
     * Gets the "isVersionOf" element
     */
    public java.lang.String getIsVersionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVERSIONOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isVersionOf" element
     */
    public org.apache.xmlbeans.XmlString xgetIsVersionOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISVERSIONOF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isVersionOf" element
     */
    public void setIsVersionOf(java.lang.String isVersionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISVERSIONOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISVERSIONOF$0);
            }
            target.setStringValue(isVersionOf);
        }
    }
    
    /**
     * Sets (as xml) the "isVersionOf" element
     */
    public void xsetIsVersionOf(org.apache.xmlbeans.XmlString isVersionOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISVERSIONOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISVERSIONOF$0);
            }
            target.set(isVersionOf);
        }
    }
}
