/*
 * An XML document type.
 * Localname: soapService
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one soapService(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SoapServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoapServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPSERVICE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapService");
    
    
    /**
     * Gets the "soapService" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapService getSoapService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapService target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().find_element_user(SOAPSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapService" element
     */
    public void setSoapService(org.biocatalogue.x2009.xml.rest.SoapService soapService)
    {
        generatedSetterHelperImpl(soapService, SOAPSERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "soapService" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapService addNewSoapService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapService target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().add_element_user(SOAPSERVICE$0);
            return target;
        }
    }
}
