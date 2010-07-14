/*
 * An XML document type.
 * Localname: any
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.AnyDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one any(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class AnyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.dc.elements.x11.AnyDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any");
    private static final org.apache.xmlbeans.QNameSet ANY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "relation"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "license"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasFormat"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPeriodicity"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "rightsHolder"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "language"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isFormatOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "source"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "coverage"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "rights"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isVersionOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPolicy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isPartOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "type"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "publisher"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "provenance"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "subject"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "temporal"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualMethod"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "instructionalMethod"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "requires"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "spatial"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "contributor"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any"),
    });
    
    
    /**
     * Gets the "any" element
     */
    public java.lang.String getAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANY$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "any" element
     */
    public org.apache.xmlbeans.XmlString xgetAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANY$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "any" element
     */
    public void setAny(java.lang.String any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANY$0);
            }
            target.setStringValue(any);
        }
    }
    
    /**
     * Sets (as xml) the "any" element
     */
    public void xsetAny(org.apache.xmlbeans.XmlString any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANY$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANY$0);
            }
            target.set(any);
        }
    }
}
