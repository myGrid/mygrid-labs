/*
 * An XML document type.
 * Localname: tableOfContents
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.TableOfContentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one tableOfContents(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class TableOfContentsDocumentImpl extends org.purl.dc.elements.x11.impl.DescriptionDocumentImpl implements org.purl.dc.terms.TableOfContentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TableOfContentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLEOFCONTENTS$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents");
    
    
    /**
     * Gets the "tableOfContents" element
     */
    public java.lang.String getTableOfContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "tableOfContents" element
     */
    public org.apache.xmlbeans.XmlString xgetTableOfContents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "tableOfContents" element
     */
    public void setTableOfContents(java.lang.String tableOfContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TABLEOFCONTENTS$0);
            }
            target.setStringValue(tableOfContents);
        }
    }
    
    /**
     * Sets (as xml) the "tableOfContents" element
     */
    public void xsetTableOfContents(org.apache.xmlbeans.XmlString tableOfContents)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TABLEOFCONTENTS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TABLEOFCONTENTS$0);
            }
            target.set(tableOfContents);
        }
    }
}
