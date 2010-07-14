/*
 * An XML document type.
 * Localname: alternative
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.AlternativeDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one alternative(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class AlternativeDocumentImpl extends org.purl.dc.elements.x11.impl.TitleDocumentImpl implements org.purl.dc.terms.AlternativeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AlternativeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALTERNATIVE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative");
    
    
    /**
     * Gets the "alternative" element
     */
    public java.lang.String getAlternative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alternative" element
     */
    public org.apache.xmlbeans.XmlString xgetAlternative()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "alternative" element
     */
    public void setAlternative(java.lang.String alternative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATIVE$0);
            }
            target.setStringValue(alternative);
        }
    }
    
    /**
     * Sets (as xml) the "alternative" element
     */
    public void xsetAlternative(org.apache.xmlbeans.XmlString alternative)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTERNATIVE$0);
            }
            target.set(alternative);
        }
    }
}
