/*
 * XML Type:  AnnotationAttributesResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationAttributesResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AnnotationAttributesResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationAttributesResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationAttributesResults
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationAttributesResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATIONATTRIBUTE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationAttribute");
    
    
    /**
     * Gets array of all "annotationAttribute" elements
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute[] getAnnotationAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ANNOTATIONATTRIBUTE$0, targetList);
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute[] result = new org.biocatalogue.x2009.xml.rest.AnnotationAttribute[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "annotationAttribute" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute getAnnotationAttributeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().find_element_user(ANNOTATIONATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "annotationAttribute" element
     */
    public int sizeOfAnnotationAttributeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONATTRIBUTE$0);
        }
    }
    
    /**
     * Sets array of all "annotationAttribute" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAnnotationAttributeArray(org.biocatalogue.x2009.xml.rest.AnnotationAttribute[] annotationAttributeArray)
    {
        check_orphaned();
        arraySetterHelper(annotationAttributeArray, ANNOTATIONATTRIBUTE$0);
    }
    
    /**
     * Sets ith "annotationAttribute" element
     */
    public void setAnnotationAttributeArray(int i, org.biocatalogue.x2009.xml.rest.AnnotationAttribute annotationAttribute)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().find_element_user(ANNOTATIONATTRIBUTE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(annotationAttribute);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "annotationAttribute" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute insertNewAnnotationAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().insert_element_user(ANNOTATIONATTRIBUTE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "annotationAttribute" element
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
    
    /**
     * Removes the ith "annotationAttribute" element
     */
    public void removeAnnotationAttribute(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONATTRIBUTE$0, i);
        }
    }
}
