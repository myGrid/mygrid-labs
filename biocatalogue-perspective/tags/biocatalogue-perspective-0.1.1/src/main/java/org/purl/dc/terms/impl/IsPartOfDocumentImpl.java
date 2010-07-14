/*
 * An XML document type.
 * Localname: isPartOf
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsPartOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isPartOf(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsPartOfDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsPartOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsPartOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISPARTOF$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isPartOf");
    
    
    /**
     * Gets the "isPartOf" element
     */
    public java.lang.String getIsPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPARTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isPartOf" element
     */
    public org.apache.xmlbeans.XmlString xgetIsPartOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISPARTOF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isPartOf" element
     */
    public void setIsPartOf(java.lang.String isPartOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISPARTOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISPARTOF$0);
            }
            target.setStringValue(isPartOf);
        }
    }
    
    /**
     * Sets (as xml) the "isPartOf" element
     */
    public void xsetIsPartOf(org.apache.xmlbeans.XmlString isPartOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISPARTOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISPARTOF$0);
            }
            target.set(isPartOf);
        }
    }
}
