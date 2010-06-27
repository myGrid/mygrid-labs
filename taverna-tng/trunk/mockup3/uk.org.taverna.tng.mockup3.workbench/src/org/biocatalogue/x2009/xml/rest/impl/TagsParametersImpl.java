/*
 * XML Type:  TagsParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagsParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML TagsParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class TagsParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TagsParameters
{
    private static final long serialVersionUID = 1L;
    
    public TagsParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SORT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "sort");
    private static final javax.xml.namespace.QName PAGE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "page");
    private static final javax.xml.namespace.QName PAGESIZE$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pageSize");
    private static final javax.xml.namespace.QName LIMIT$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "limit");
    
    
    /**
     * Gets the "sort" element
     */
    public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort getSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TagsParameters.Sort target = null;
            target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort)get_store().find_element_user(SORT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "sort" element
     */
    public void setSort(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort sort)
    {
        generatedSetterHelperImpl(sort, SORT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sort" element
     */
    public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort addNewSort()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TagsParameters.Sort target = null;
            target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort)get_store().add_element_user(SORT$0);
            return target;
        }
    }
    
    /**
     * Gets the "page" element
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter getPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().find_element_user(PAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "page" element
     */
    public void setPage(org.biocatalogue.x2009.xml.rest.PageParameter page)
    {
        generatedSetterHelperImpl(page, PAGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "page" element
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter addNewPage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter)get_store().add_element_user(PAGE$2);
            return target;
        }
    }
    
    /**
     * Gets the "pageSize" element
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter getPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().find_element_user(PAGESIZE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pageSize" element
     */
    public void setPageSize(org.biocatalogue.x2009.xml.rest.PageSizeParameter pageSize)
    {
        generatedSetterHelperImpl(pageSize, PAGESIZE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pageSize" element
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter addNewPageSize()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter)get_store().add_element_user(PAGESIZE$4);
            return target;
        }
    }
    
    /**
     * Gets the "limit" element
     */
    public java.math.BigInteger getLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMIT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "limit" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "limit" element
     */
    public boolean isNilLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "limit" element
     */
    public void setLimit(java.math.BigInteger limit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LIMIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LIMIT$6);
            }
            target.setBigIntegerValue(limit);
        }
    }
    
    /**
     * Sets (as xml) the "limit" element
     */
    public void xsetLimit(org.apache.xmlbeans.XmlNonNegativeInteger limit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LIMIT$6);
            }
            target.set(limit);
        }
    }
    
    /**
     * Nils the "limit" element
     */
    public void setNilLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(LIMIT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(LIMIT$6);
            }
            target.setNil();
        }
    }
    /**
     * An XML sort(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort.
     */
    public static class SortImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.biocatalogue.x2009.xml.rest.TagsParameters.Sort
    {
        private static final long serialVersionUID = 1L;
        
        public SortImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected SortImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName URLKEY$0 = 
            new javax.xml.namespace.QName("", "urlKey");
        private static final javax.xml.namespace.QName URLVALUE$2 = 
            new javax.xml.namespace.QName("", "urlValue");
        
        
        /**
         * Gets the "urlKey" attribute
         */
        public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey.Enum getUrlKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLKEY$0);
                if (target == null)
                {
                    return null;
                }
                return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "urlKey" attribute
         */
        public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey xgetUrlKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey target = null;
                target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey)get_store().find_attribute_user(URLKEY$0);
                return target;
            }
        }
        
        /**
         * Sets the "urlKey" attribute
         */
        public void setUrlKey(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey.Enum urlKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLKEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLKEY$0);
                }
                target.setEnumValue(urlKey);
            }
        }
        
        /**
         * Sets (as xml) the "urlKey" attribute
         */
        public void xsetUrlKey(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey urlKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey target = null;
                target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey)get_store().find_attribute_user(URLKEY$0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey)get_store().add_attribute_user(URLKEY$0);
                }
                target.set(urlKey);
            }
        }
        
        /**
         * Gets the "urlValue" attribute
         */
        public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue.Enum getUrlValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLVALUE$2);
                if (target == null)
                {
                    return null;
                }
                return (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "urlValue" attribute
         */
        public org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue xgetUrlValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue target = null;
                target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue)get_store().find_attribute_user(URLVALUE$2);
                return target;
            }
        }
        
        /**
         * True if has "urlValue" attribute
         */
        public boolean isSetUrlValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(URLVALUE$2) != null;
            }
        }
        
        /**
         * Sets the "urlValue" attribute
         */
        public void setUrlValue(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue.Enum urlValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLVALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLVALUE$2);
                }
                target.setEnumValue(urlValue);
            }
        }
        
        /**
         * Sets (as xml) the "urlValue" attribute
         */
        public void xsetUrlValue(org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue urlValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue target = null;
                target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue)get_store().find_attribute_user(URLVALUE$2);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue)get_store().add_attribute_user(URLVALUE$2);
                }
                target.set(urlValue);
            }
        }
        
        /**
         * Unsets the "urlValue" attribute
         */
        public void unsetUrlValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(URLVALUE$2);
            }
        }
        /**
         * An XML urlKey(@).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlKey.
         */
        public static class UrlKeyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlKey
        {
            private static final long serialVersionUID = 1L;
            
            public UrlKeyImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UrlKeyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML urlValue(@).
         *
         * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.TagsParameters$Sort$UrlValue.
         */
        public static class UrlValueImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.TagsParameters.Sort.UrlValue
        {
            private static final long serialVersionUID = 1L;
            
            public UrlValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected UrlValueImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
