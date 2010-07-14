/*
 * An XML document type.
 * Localname: isReplacedBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsReplacedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isReplacedBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsReplacedByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsReplacedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsReplacedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREPLACEDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy");
    
    
    /**
     * Gets the "isReplacedBy" element
     */
    public java.lang.String getIsReplacedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREPLACEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isReplacedBy" element
     */
    public org.apache.xmlbeans.XmlString xgetIsReplacedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREPLACEDBY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isReplacedBy" element
     */
    public void setIsReplacedBy(java.lang.String isReplacedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREPLACEDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREPLACEDBY$0);
            }
            target.setStringValue(isReplacedBy);
        }
    }
    
    /**
     * Sets (as xml) the "isReplacedBy" element
     */
    public void xsetIsReplacedBy(org.apache.xmlbeans.XmlString isReplacedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREPLACEDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISREPLACEDBY$0);
            }
            target.set(isReplacedBy);
        }
    }
}
