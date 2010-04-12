/*
 * An XML document type.
 * Localname: relation
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.RelationDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one relation(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class RelationDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.RelationDocument
{
    private static final long serialVersionUID = 1L;
    
    public RelationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RELATION$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "relation");
    private static final org.apache.xmlbeans.QNameSet RELATION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "relation"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isVersionOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isPartOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasFormat"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "requires"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isFormatOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy"),
    });
    
    
    /**
     * Gets the "relation" element
     */
    public java.lang.String getRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "relation" element
     */
    public org.apache.xmlbeans.XmlString xgetRelation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATION$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "relation" element
     */
    public void setRelation(java.lang.String relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RELATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RELATION$0);
            }
            target.setStringValue(relation);
        }
    }
    
    /**
     * Sets (as xml) the "relation" element
     */
    public void xsetRelation(org.apache.xmlbeans.XmlString relation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RELATION$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RELATION$0);
            }
            target.set(relation);
        }
    }
}
