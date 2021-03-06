/*
 * An XML document type.
 * Localname: rights
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.RightsDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one rights(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class RightsDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.RightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public RightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIGHTS$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "rights");
    private static final org.apache.xmlbeans.QNameSet RIGHTS$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "rights"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "license"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights"),
    });
    
    
    /**
     * Gets the "rights" element
     */
    public java.lang.String getRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTS$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rights" element
     */
    public org.apache.xmlbeans.XmlString xgetRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTS$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "rights" element
     */
    public void setRights(java.lang.String rights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIGHTS$0);
            }
            target.setStringValue(rights);
        }
    }
    
    /**
     * Sets (as xml) the "rights" element
     */
    public void xsetRights(org.apache.xmlbeans.XmlString rights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTS$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RIGHTS$0);
            }
            target.set(rights);
        }
    }
}
