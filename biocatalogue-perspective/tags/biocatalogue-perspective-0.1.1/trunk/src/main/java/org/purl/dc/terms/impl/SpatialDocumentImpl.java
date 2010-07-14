/*
 * An XML document type.
 * Localname: spatial
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.SpatialDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one spatial(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class SpatialDocumentImpl extends org.purl.dc.elements.x11.impl.CoverageDocumentImpl implements org.purl.dc.terms.SpatialDocument
{
    private static final long serialVersionUID = 1L;
    
    public SpatialDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPATIAL$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "spatial");
    
    
    /**
     * Gets the "spatial" element
     */
    public java.lang.String getSpatial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPATIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "spatial" element
     */
    public org.apache.xmlbeans.XmlString xgetSpatial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPATIAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "spatial" element
     */
    public void setSpatial(java.lang.String spatial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPATIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPATIAL$0);
            }
            target.setStringValue(spatial);
        }
    }
    
    /**
     * Sets (as xml) the "spatial" element
     */
    public void xsetSpatial(org.apache.xmlbeans.XmlString spatial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SPATIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SPATIAL$0);
            }
            target.set(spatial);
        }
    }
}
