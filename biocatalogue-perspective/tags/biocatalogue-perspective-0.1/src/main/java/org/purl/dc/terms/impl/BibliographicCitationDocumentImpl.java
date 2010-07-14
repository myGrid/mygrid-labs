/*
 * An XML document type.
 * Localname: bibliographicCitation
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.BibliographicCitationDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one bibliographicCitation(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class BibliographicCitationDocumentImpl extends org.purl.dc.elements.x11.impl.IdentifierDocumentImpl implements org.purl.dc.terms.BibliographicCitationDocument
{
    private static final long serialVersionUID = 1L;
    
    public BibliographicCitationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIBLIOGRAPHICCITATION$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation");
    
    
    /**
     * Gets the "bibliographicCitation" element
     */
    public java.lang.String getBibliographicCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "bibliographicCitation" element
     */
    public org.apache.xmlbeans.XmlString xgetBibliographicCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "bibliographicCitation" element
     */
    public void setBibliographicCitation(java.lang.String bibliographicCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIBLIOGRAPHICCITATION$0);
            }
            target.setStringValue(bibliographicCitation);
        }
    }
    
    /**
     * Sets (as xml) the "bibliographicCitation" element
     */
    public void xsetBibliographicCitation(org.apache.xmlbeans.XmlString bibliographicCitation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BIBLIOGRAPHICCITATION$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BIBLIOGRAPHICCITATION$0);
            }
            target.set(bibliographicCitation);
        }
    }
}
