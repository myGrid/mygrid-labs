/*
 * An XML document type.
 * Localname: soapOperation
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperationDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one soapOperation(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SoapOperationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperationDocument
{
    private static final long serialVersionUID = 1L;
    
    public SoapOperationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOAPOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperation");
    
    
    /**
     * Gets the "soapOperation" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation getSoapOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().find_element_user(SOAPOPERATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "soapOperation" element
     */
    public void setSoapOperation(org.biocatalogue.x2009.xml.rest.SoapOperation soapOperation)
    {
        generatedSetterHelperImpl(soapOperation, SOAPOPERATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "soapOperation" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation addNewSoapOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().add_element_user(SOAPOPERATION$0);
            return target;
        }
    }
}
