/*
 * An XML document type.
 * Localname: annotationAttribute
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationAttributeDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one annotationAttribute(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AnnotationAttributeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationAttributeDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationAttributeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationAttribute");
    
    
    /**
     * Gets the "annotationAttribute" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute getAnnotationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().find_element_user(ANNOTATIONATTRIBUTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "annotationAttribute" element
     */
    public void setAnnotationAttribute(org.biocatalogue.x2009.xml.rest.AnnotationAttribute annotationAttribute)
    {
        generatedSetterHelperImpl(annotationAttribute, ANNOTATIONATTRIBUTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annotationAttribute" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute addNewAnnotationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().add_element_user(ANNOTATIONATTRIBUTE$0);
            return target;
        }
    }
}
