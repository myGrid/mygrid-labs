/*
 * An XML document type.
 * Localname: hasVersion
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.HasVersionDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one hasVersion(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class HasVersionDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.HasVersionDocument
{
    private static final long serialVersionUID = 1L;
    
    public HasVersionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HASVERSION$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion");
    
    
    /**
     * Gets the "hasVersion" element
     */
    public java.lang.String getHasVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASVERSION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "hasVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetHasVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASVERSION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "hasVersion" element
     */
    public void setHasVersion(java.lang.String hasVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HASVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HASVERSION$0);
            }
            target.setStringValue(hasVersion);
        }
    }
    
    /**
     * Sets (as xml) the "hasVersion" element
     */
    public void xsetHasVersion(org.apache.xmlbeans.XmlString hasVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HASVERSION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HASVERSION$0);
            }
            target.set(hasVersion);
        }
    }
}
