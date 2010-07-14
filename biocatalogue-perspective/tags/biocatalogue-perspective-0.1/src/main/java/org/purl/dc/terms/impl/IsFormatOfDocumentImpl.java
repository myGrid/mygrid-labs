/*
 * An XML document type.
 * Localname: isFormatOf
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.IsFormatOfDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one isFormatOf(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class IsFormatOfDocumentImpl extends org.purl.dc.elements.x11.impl.RelationDocumentImpl implements org.purl.dc.terms.IsFormatOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public IsFormatOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ISFORMATOF$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isFormatOf");
    
    
    /**
     * Gets the "isFormatOf" element
     */
    public java.lang.String getIsFormatOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFORMATOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "isFormatOf" element
     */
    public org.apache.xmlbeans.XmlString xgetIsFormatOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISFORMATOF$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "isFormatOf" element
     */
    public void setIsFormatOf(java.lang.String isFormatOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISFORMATOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISFORMATOF$0);
            }
            target.setStringValue(isFormatOf);
        }
    }
    
    /**
     * Sets (as xml) the "isFormatOf" element
     */
    public void xsetIsFormatOf(org.apache.xmlbeans.XmlString isFormatOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISFORMATOF$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISFORMATOF$0);
            }
            target.set(isFormatOf);
        }
    }
}
