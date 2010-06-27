/*
 * An XML document type.
 * Localname: serviceTest
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceTestDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one serviceTest(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServiceTestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceTestDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceTestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICETEST$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceTest");
    
    
    /**
     * Gets the "serviceTest" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest getServiceTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().find_element_user(SERVICETEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceTest" element
     */
    public void setServiceTest(org.biocatalogue.x2009.xml.rest.ServiceTest serviceTest)
    {
        generatedSetterHelperImpl(serviceTest, SERVICETEST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceTest" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceTest addNewServiceTest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceTest target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceTest)get_store().add_element_user(SERVICETEST$0);
            return target;
        }
    }
}
