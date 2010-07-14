/*
 * An XML document type.
 * Localname: errors
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ErrorsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one errors(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ErrorsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ErrorsDocument
{
    private static final long serialVersionUID = 1L;
    
    public ErrorsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "errors");
    
    
    /**
     * Gets the "errors" element
     */
    public org.biocatalogue.x2009.xml.rest.Errors getErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Errors target = null;
            target = (org.biocatalogue.x2009.xml.rest.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "errors" element
     */
    public void setErrors(org.biocatalogue.x2009.xml.rest.Errors errors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Errors target = null;
            target = (org.biocatalogue.x2009.xml.rest.Errors)get_store().find_element_user(ERRORS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Errors)get_store().add_element_user(ERRORS$0);
            }
            target.set(errors);
        }
    }
    
    /**
     * Appends and returns a new empty "errors" element
     */
    public org.biocatalogue.x2009.xml.rest.Errors addNewErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Errors target = null;
            target = (org.biocatalogue.x2009.xml.rest.Errors)get_store().add_element_user(ERRORS$0);
            return target;
        }
    }
}
