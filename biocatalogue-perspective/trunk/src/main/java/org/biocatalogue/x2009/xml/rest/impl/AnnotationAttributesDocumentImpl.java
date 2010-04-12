/*
 * An XML document type.
 * Localname: annotationAttributes
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationAttributesDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one annotationAttributes(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AnnotationAttributesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationAttributesDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationAttributesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONATTRIBUTES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationAttributes");
    
    
    /**
     * Gets the "annotationAttributes" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttributes getAnnotationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttributes target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttributes)get_store().find_element_user(ANNOTATIONATTRIBUTES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotationAttributes" element
     */
    public void setAnnotationAttributes(org.biocatalogue.x2009.xml.rest.AnnotationAttributes annotationAttributes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttributes target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttributes)get_store().find_element_user(ANNOTATIONATTRIBUTES$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.AnnotationAttributes)get_store().add_element_user(ANNOTATIONATTRIBUTES$0);
            }
            target.set(annotationAttributes);
        }
    }
    
    /**
     * Appends and returns a new empty "annotationAttributes" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttributes addNewAnnotationAttributes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttributes target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttributes)get_store().add_element_user(ANNOTATIONATTRIBUTES$0);
            return target;
        }
    }
}
