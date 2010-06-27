/*
 * An XML document type.
 * Localname: serviceDeployment
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceDeploymentDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one serviceDeployment(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class ServiceDeploymentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceDeploymentDocument
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDeploymentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEDEPLOYMENT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceDeployment");
    
    
    /**
     * Gets the "serviceDeployment" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment getServiceDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().find_element_user(SERVICEDEPLOYMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceDeployment" element
     */
    public void setServiceDeployment(org.biocatalogue.x2009.xml.rest.ServiceDeployment serviceDeployment)
    {
        generatedSetterHelperImpl(serviceDeployment, SERVICEDEPLOYMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "serviceDeployment" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment addNewServiceDeployment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().add_element_user(SERVICEDEPLOYMENT$0);
            return target;
        }
    }
}
