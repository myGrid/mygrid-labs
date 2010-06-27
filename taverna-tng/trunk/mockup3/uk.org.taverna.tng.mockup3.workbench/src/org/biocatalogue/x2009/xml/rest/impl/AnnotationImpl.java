/*
 * XML Type:  Annotation
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Annotation
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Annotation(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AnnotationImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Annotation
{
    private static final long serialVersionUID = 1L;
    
    public AnnotationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANNOTATABLE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotatable");
    private static final javax.xml.namespace.QName SOURCE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "source");
    private static final javax.xml.namespace.QName VERSION$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "version");
    private static final javax.xml.namespace.QName ANNOTATIONATTRIBUTE$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationAttribute");
    private static final javax.xml.namespace.QName VALUE$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "value");
    private static final javax.xml.namespace.QName CREATED$10 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName MODIFIED$12 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "modified");
    private static final javax.xml.namespace.QName RELATED$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "annotatable" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "annotatable" element
     */
    public boolean isSetAnnotatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATABLE$0) != 0;
        }
    }
    
    /**
     * Sets the "annotatable" element
     */
    public void setAnnotatable(org.biocatalogue.x2009.xml.rest.ResourceLink annotatable)
    {
        generatedSetterHelperImpl(annotatable, ANNOTATABLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "annotatable" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATABLE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "annotatable" element
     */
    public void unsetAnnotatable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATABLE$0, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$2) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(org.biocatalogue.x2009.xml.rest.ResourceLink source)
    {
        generatedSetterHelperImpl(source, SOURCE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "source" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOURCE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$2, 0);
        }
    }
    
    /**
     * Gets the "version" element
     */
    public java.math.BigInteger getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(VERSION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "version" element
     */
    public void setVersion(java.math.BigInteger version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$4);
            }
            target.setBigIntegerValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" element
     */
    public void xsetVersion(org.apache.xmlbeans.XmlPositiveInteger version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(VERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(VERSION$4);
            }
            target.set(version);
        }
    }
    
    /**
     * Gets the "annotationAttribute" element
     */
    public org.biocatalogue.x2009.xml.rest.AnnotationAttribute getAnnotationAttribute()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.AnnotationAttribute target = null;
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().find_element_user(ANNOTATIONATTRIBUTE$6, 0);
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
        generatedSetterHelperImpl(annotationAttribute, ANNOTATIONATTRIBUTE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (org.biocatalogue.x2009.xml.rest.AnnotationAttribute)get_store().add_element_user(ANNOTATIONATTRIBUTE$6);
            return target;
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation.Value getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation.Value target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation.Value)get_store().find_element_user(VALUE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.biocatalogue.x2009.xml.rest.Annotation.Value value)
    {
        generatedSetterHelperImpl(value, VALUE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation.Value addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation.Value target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation.Value)get_store().add_element_user(VALUE$8);
            return target;
        }
    }
    
    /**
     * Gets the "created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$10);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$10);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "modified" element
     */
    public java.util.Calendar getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "modified" element
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIED$12) != 0;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    public void setModified(java.util.Calendar modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$12);
            }
            target.setCalendarValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" element
     */
    public void xsetModified(org.apache.xmlbeans.XmlDateTime modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(MODIFIED$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(MODIFIED$12);
            }
            target.set(modified);
        }
    }
    
    /**
     * Unsets the "modified" element
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIED$12, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation.Related)get_store().find_element_user(RELATED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "related" element
     */
    public boolean isSetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATED$14) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.Annotation.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.Annotation.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Annotation.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.Annotation.Related)get_store().add_element_user(RELATED$14);
            return target;
        }
    }
    
    /**
     * Unsets the "related" element
     */
    public void unsetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATED$14, 0);
        }
    }
    /**
     * An XML value(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Annotation.Value
    {
        private static final long serialVersionUID = 1L;
        
        public ValueImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESOURCE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "resource");
        private static final javax.xml.namespace.QName TYPE$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "type");
        private static final javax.xml.namespace.QName CONTENT$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "content");
        
        
        /**
         * Gets the "resource" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(RESOURCE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "resource" element
         */
        public boolean isSetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESOURCE$0) != 0;
            }
        }
        
        /**
         * Sets the "resource" element
         */
        public void setResource(org.biocatalogue.x2009.xml.rest.ResourceLink resource)
        {
            generatedSetterHelperImpl(resource, RESOURCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "resource" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(RESOURCE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "resource" element
         */
        public void unsetResource()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESOURCE$0, 0);
            }
        }
        
        /**
         * Gets the "type" element
         */
        public java.lang.String getType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "type" element
         */
        public org.apache.xmlbeans.XmlString xgetType()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "type" element
         */
        public void setType(java.lang.String type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$2);
                }
                target.setStringValue(type);
            }
        }
        
        /**
         * Sets (as xml) the "type" element
         */
        public void xsetType(org.apache.xmlbeans.XmlString type)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$2);
                }
                target.set(type);
            }
        }
        
        /**
         * Gets the "content" element
         */
        public java.lang.String getContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "content" element
         */
        public org.apache.xmlbeans.XmlString xgetContent()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "content" element
         */
        public void setContent(java.lang.String content)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTENT$4);
                }
                target.setStringValue(content);
            }
        }
        
        /**
         * Sets (as xml) the "content" element
         */
        public void xsetContent(org.apache.xmlbeans.XmlString content)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTENT$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTENT$4);
                }
                target.set(content);
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Annotation.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        
    }
}
