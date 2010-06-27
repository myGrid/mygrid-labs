/*
 * An XML document type.
 * Localname: soapInput
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapInputDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one soapInput(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SoapInputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapInputDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoapInputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPINPUT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapInput");
    
    
    /**
     * Gets the "soapInput" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapInput getSoapInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapInput target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().find_element_user(SOAPINPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapInput" element
     */
    public void setSoapInput(org.biocatalogue.x2009.xml.rest.SoapInput soapInput)
    {
        generatedSetterHelperImpl(soapInput, SOAPINPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "soapInput" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapInput addNewSoapInput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapInput target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().add_element_user(SOAPINPUT$0);
            return target;
        }
    }
}
