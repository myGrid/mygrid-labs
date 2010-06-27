/*
 * XML Type:  UserRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.UserRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML UserRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class UserRelatedLinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.UserRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public UserRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONSBY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationsBy");
    private static final javax.xml.namespace.QName SERVICES$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
    
    
    /**
     * Gets the "annotationsBy" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationsBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONSBY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotationsBy" element
     */
    public void setAnnotationsBy(org.biocatalogue.x2009.xml.rest.ResourceLink annotationsBy)
    {
        generatedSetterHelperImpl(annotationsBy, ANNOTATIONSBY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annotationsBy" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationsBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONSBY$0);
            return target;
        }
    }
    
    /**
     * Gets the "services" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICES$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "services" element
     */
    public void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services)
    {
        generatedSetterHelperImpl(services, SERVICES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "services" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICES$2);
            return target;
        }
    }
}
