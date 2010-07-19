/*
 * An XML document type.
 * Localname: isReferencedBy
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsReferencedByDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isReferencedBy(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsReferencedByDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsReferencedByDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsReferencedByDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISREFERENCEDBY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy");
    
    
    /**
     * Gets the "isReferencedBy" element
     */
    public java.lang.String getIsReferencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isReferencedBy" element
     */
    public org.apache.xmlbeans.XmlString xgetIsReferencedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isReferencedBy" element
     */
    public void setIsReferencedBy(java.lang.String isReferencedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISREFERENCEDBY$0);
            }
            target.setStringValue(isReferencedBy);
        }
    }
    
    /**
     * Sets (as xml) the "isReferencedBy" element
     */
    public void xsetIsReferencedBy(org.apache.xmlbeans.XmlString isReferencedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISREFERENCEDBY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISREFERENCEDBY$0);
            }
            target.set(isReferencedBy);
        }
    }
}
