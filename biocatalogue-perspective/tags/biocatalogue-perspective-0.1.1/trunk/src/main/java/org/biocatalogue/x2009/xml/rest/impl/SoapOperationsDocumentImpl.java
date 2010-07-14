/*
 * An XML document type.
 * Localname: soapOperations
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one soapOperations(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SoapOperationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoapOperationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPOPERATIONS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperations");
    
    
    /**
     * Gets the "soapOperations" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations getSoapOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations)get_store().find_element_user(SOAPOPERATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapOperations" element
     */
    public void setSoapOperations(org.biocatalogue.x2009.xml.rest.SoapOperations soapOperations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations)get_store().find_element_user(SOAPOPERATIONS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperations)get_store().add_element_user(SOAPOPERATIONS$0);
            }
            target.set(soapOperations);
        }
    }
    
    /**
     * Appends and returns a new empty "soapOperations" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperations addNewSoapOperations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperations)get_store().add_element_user(SOAPOPERATIONS$0);
            return target;
        }
    }
}
