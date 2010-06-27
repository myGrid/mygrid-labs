/*
 * An XML document type.
 * Localname: soapOutput
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOutputDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one soapOutput(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SoapOutputDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOutputDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoapOutputDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPOUTPUT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOutput");
    
    
    /**
     * Gets the "soapOutput" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOutput getSoapOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().find_element_user(SOAPOUTPUT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapOutput" element
     */
    public void setSoapOutput(org.biocatalogue.x2009.xml.rest.SoapOutput soapOutput)
    {
        generatedSetterHelperImpl(soapOutput, SOAPOUTPUT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "soapOutput" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOutput addNewSoapOutput()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().add_element_user(SOAPOUTPUT$0);
            return target;
        }
    }
}
