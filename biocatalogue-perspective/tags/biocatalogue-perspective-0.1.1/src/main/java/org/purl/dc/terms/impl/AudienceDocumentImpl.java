/*
 * An XML document type.
 * Localname: audience
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AudienceDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one audience(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AudienceDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.terms.AudienceDocument
{
    private static final long serialVersionUID = 1L;
    
    public AudienceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AUDIENCE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience");
    private static final org.apache.xmlbeans.QNameSet AUDIENCE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel"),
    });
    
    
    /**
     * Gets the "audience" element
     */
    public java.lang.String getAudience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDIENCE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "audience" element
     */
    public org.apache.xmlbeans.XmlString xgetAudience()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUDIENCE$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "audience" element
     */
    public void setAudience(java.lang.String audience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUDIENCE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUDIENCE$0);
            }
            target.setStringValue(audience);
        }
    }
    
    /**
     * Sets (as xml) the "audience" element
     */
    public void xsetAudience(org.apache.xmlbeans.XmlString audience)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUDIENCE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUDIENCE$0);
            }
            target.set(audience);
        }
    }
}
