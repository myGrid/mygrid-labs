/*
 * An XML document type.
 * Localname: accessRights
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AccessRightsDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one accessRights(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AccessRightsDocumentImpl extends org.purl.dc.elements.x11.impl.RightsDocumentImpl implements org.purl.dc.terms.AccessRightsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AccessRightsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ACCESSRIGHTS$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights");
    
    
    /**
     * Gets the "accessRights" element
     */
    public java.lang.String getAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "accessRights" element
     */
    public org.apache.xmlbeans.XmlString xgetAccessRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "accessRights" element
     */
    public void setAccessRights(java.lang.String accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.setStringValue(accessRights);
        }
    }
    
    /**
     * Sets (as xml) the "accessRights" element
     */
    public void xsetAccessRights(org.apache.xmlbeans.XmlString accessRights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ACCESSRIGHTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ACCESSRIGHTS$0);
            }
            target.set(accessRights);
        }
    }
}
