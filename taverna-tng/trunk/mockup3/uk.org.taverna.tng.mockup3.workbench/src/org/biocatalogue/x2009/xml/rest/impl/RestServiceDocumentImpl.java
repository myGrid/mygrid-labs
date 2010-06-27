/*
 * An XML document type.
 * Localname: restService
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RestServiceDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one restService(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class RestServiceDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RestServiceDocument
{
    private static final long serialVersionUID = 1L;
    
    public RestServiceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESTSERVICE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "restService");
    
    
    /**
     * Gets the "restService" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService getRestService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().find_element_user(RESTSERVICE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "restService" element
     */
    public void setRestService(org.biocatalogue.x2009.xml.rest.RestService restService)
    {
        generatedSetterHelperImpl(restService, RESTSERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "restService" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService addNewRestService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().add_element_user(RESTSERVICE$0);
            return target;
        }
    }
}
