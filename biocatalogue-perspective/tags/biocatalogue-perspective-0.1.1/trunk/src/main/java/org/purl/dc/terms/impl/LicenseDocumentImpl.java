/*
 * An XML document type.
 * Localname: license
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.LicenseDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one license(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class LicenseDocumentImpl extends org.purl.dc.elements.x11.impl.RightsDocumentImpl implements org.purl.dc.terms.LicenseDocument
{
    private static final long serialVersionUID = 1L;
    
    public LicenseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LICENSE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "license");
    
    
    /**
     * Gets the "license" element
     */
    public java.lang.String getLicense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "license" element
     */
    public org.apache.xmlbeans.XmlString xgetLicense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "license" element
     */
    public void setLicense(java.lang.String license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LICENSE$0);
            }
            target.setStringValue(license);
        }
    }
    
    /**
     * Sets (as xml) the "license" element
     */
    public void xsetLicense(org.apache.xmlbeans.XmlString license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LICENSE$0);
            }
            target.set(license);
        }
    }
}
