/*
 * An XML document type.
 * Localname: isRequiredBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsRequiredByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isRequiredBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsRequiredByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsRequiredByDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsRequiredByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREQUIREDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy");
    
    
    /**
     * Gets the "isRequiredBy" element
     */
    public java.lang.String getIsRequiredBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREQUIREDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isRequiredBy" element
     */
    public org.apache.xmlbeans.XmlString xgetIsRequiredBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREQUIREDBY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isRequiredBy" element
     */
    public void setIsRequiredBy(java.lang.String isRequiredBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREQUIREDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREQUIREDBY$0);
            }
            target.setStringValue(isRequiredBy);
        }
    }
    
    /**
     * Sets (as xml) the "isRequiredBy" element
     */
    public void xsetIsRequiredBy(org.apache.xmlbeans.XmlString isRequiredBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREQUIREDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISREQUIREDBY$0);
            }
            target.set(isRequiredBy);
        }
    }
}
