/*
 * XML Type:  AnnotationsResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AnnotationsResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AnnotationsResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationsResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AnnotationsResults
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationsResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATION$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotation");
    
    
    /**
     * Gets a List of "annotation" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.Annotation> getAnnotationList()
    {
        final class AnnotationList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.Annotation>
        {
            public org.biocatalogue.x2009.xml.rest.Annotation get(int i)
                { return AnnotationsResultsImpl.this.getAnnotationArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.Annotation set(int i, org.biocatalogue.x2009.xml.rest.Annotation o)
            {
                org.biocatalogue.x2009.xml.rest.Annotation old = AnnotationsResultsImpl.this.getAnnotationArray(i);
                AnnotationsResultsImpl.this.setAnnotationArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.Annotation o)
                { AnnotationsResultsImpl.this.insertNewAnnotation(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.Annotation remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.Annotation old = AnnotationsResultsImpl.this.getAnnotationArray(i);
                AnnotationsResultsImpl.this.removeAnnotation(i);
                return old;
            }
            
            public int size()
                { return AnnotationsResultsImpl.this.sizeOfAnnotationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnnotationList();
        }
    }
    
    /**
     * Gets array of all "annotation" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.Annotation[] getAnnotationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.Annotation> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.Annotation>();
            get_store().find_all_element_users(ANNOTATION$0, targetList);
            org.biocatalogue.x2009.xml.rest.Annotation[] result = new org.biocatalogue.x2009.xml.rest.Annotation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "annotation" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation getAnnotationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "annotation" element
     */
    public int sizeOfAnnotationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATION$0);
        }
    }
    
    /**
     * Sets array of all "annotation" element
     */
    public void setAnnotationArray(org.biocatalogue.x2009.xml.rest.Annotation[] annotationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(annotationArray, ANNOTATION$0);
        }
    }
    
    /**
     * Sets ith "annotation" element
     */
    public void setAnnotationArray(int i, org.biocatalogue.x2009.xml.rest.Annotation annotation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(annotation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "annotation" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation insertNewAnnotation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().insert_element_user(ANNOTATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "annotation" element
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
    
    /**
     * Removes the ith "annotation" element
     */
    public void removeAnnotation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATION$0, i);
        }
    }
}
