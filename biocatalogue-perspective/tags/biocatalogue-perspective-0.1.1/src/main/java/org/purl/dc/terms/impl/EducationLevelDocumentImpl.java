/*
 * An XML document type.
 * Localname: educationLevel
 * Namespace: http://purl.org/dc/terms/
 * Java type: org.purl.dc.terms.EducationLevelDocument
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.terms.impl;
/**
 * A document containing one educationLevel(@http://purl.org/dc/terms/) element.
 *
 * This is a complex type.
 */
public class EducationLevelDocumentImpl extends org.purl.dc.terms.impl.AudienceDocumentImpl implements org.purl.dc.terms.EducationLevelDocument
{
    private static final long serialVersionUID = 1L;
    
    public EducationLevelDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EDUCATIONLEVEL$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel");
    
    
    /**
     * Gets the "educationLevel" element
     */
    public java.lang.String getEducationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATIONLEVEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "educationLevel" element
     */
    public org.apache.xmlbeans.XmlString xgetEducationLevel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATIONLEVEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "educationLevel" element
     */
    public void setEducationLevel(java.lang.String educationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDUCATIONLEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDUCATIONLEVEL$0);
            }
            target.setStringValue(educationLevel);
        }
    }
    
    /**
     * Sets (as xml) the "educationLevel" element
     */
    public void xsetEducationLevel(org.apache.xmlbeans.XmlString educationLevel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDUCATIONLEVEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDUCATIONLEVEL$0);
            }
            target.set(educationLevel);
        }
    }
}
