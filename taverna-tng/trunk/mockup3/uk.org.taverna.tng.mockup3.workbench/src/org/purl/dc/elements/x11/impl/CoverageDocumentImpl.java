/*
 * An XML document type.
 * Localname: coverage
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.CoverageDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * A document containing one coverage(@http://purl.org/dc/elements/1.1/) element.
 *
 * This is a complex type.
 */
public class CoverageDocumentImpl extends org.purl.dc.elements.x11.impl.AnyDocumentImpl implements org.purl.dc.elements.x11.CoverageDocument
{
    private static final long serialVersionUID = 1L;
    
    public CoverageDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COVERAGE$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "coverage");
    private static final org.apache.xmlbeans.QNameSet COVERAGE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "spatial"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "coverage"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "temporal"),
    });
    
    
    /**
     * Gets the "coverage" element
     */
    public java.lang.String getCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "coverage" element
     */
    public org.apache.xmlbeans.XmlString xgetCoverage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COVERAGE$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "coverage" element
     */
    public void setCoverage(java.lang.String coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COVERAGE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COVERAGE$0);
            }
            target.setStringValue(coverage);
        }
    }
    
    /**
     * Sets (as xml) the "coverage" element
     */
    public void xsetCoverage(org.apache.xmlbeans.XmlString coverage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COVERAGE$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COVERAGE$0);
            }
            target.set(coverage);
        }
    }
}
