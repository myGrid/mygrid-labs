/*
 * An XML document type.
 * Localname: annotation
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one annotation(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AnnotationDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotation");
    
    
    /**
     * Gets the "annotation" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation getAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotation" element
     */
    public void setAnnotation(org.biocatalogue.x2009.xml.rest.Annotation annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().add_element_user(ANNOTATION$0);
            }
            target.set(annotation);
        }
    }
    
    /**
     * Appends and returns a new empty "annotation" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation addNewAnnotation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().add_element_user(ANNOTATION$0);
            return target;
        }
    }
}
