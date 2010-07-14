/*
 * An XML document type.
 * Localname: annotations
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one annotations(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AnnotationsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
    
    
    /**
     * Gets the "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotations getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotations)get_store().find_element_user(ANNOTATIONS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotations" element
     */
    public void setAnnotations(org.biocatalogue.x2009.xml.rest.Annotations annotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotations)get_store().find_element_user(ANNOTATIONS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Annotations)get_store().add_element_user(ANNOTATIONS$0);
            }
            target.set(annotations);
        }
    }
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotations addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotations)get_store().add_element_user(ANNOTATIONS$0);
            return target;
        }
    }
}
