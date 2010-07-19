/*
 * XML Type:  CategoriesParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CategoriesParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML CategoriesParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CategoriesParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CategoriesParameters
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOTSONLY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "rootsOnly");
    
    
    /**
     * Gets the "rootsOnly" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly getRootsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly)get_store().find_element_user(ROOTSONLY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "rootsOnly" element
     */
    public void setRootsOnly(org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly rootsOnly)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly)get_store().find_element_user(ROOTSONLY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly)get_store().add_element_user(ROOTSONLY$0);
            }
            target.set(rootsOnly);
        }
    }
    
    /**
     * Appends and returns a new empty "rootsOnly" element
     */
    public org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly addNewRootsOnly()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly target = null;
            target = (org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly)get_store().add_element_user(ROOTSONLY$0);
            return target;
        }
    }
    /**
     * An XML rootsOnly(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.CategoriesParameters$RootsOnly.
     */
    public static class RootsOnlyImpl extends org.apache.xmlbeans.impl.values.JavaBooleanHolderEx implements org.biocatalogue.x2009.xml.rest.CategoriesParameters.RootsOnly
    {
        private static final long serialVersionUID = 1L;
        
        public RootsOnlyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected RootsOnlyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName URLKEY$0 = 
            new javax.xml.namespace.QName("", "urlKey");
        
        
        /**
         * Gets the "urlKey" attribute
         */
        public java.lang.String getUrlKey()
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
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "urlKey" attribute
         */
        public org.apache.xmlbeans.XmlString xgetUrlKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLKEY$0);
                return target;
            }
        }
        
        /**
         * Sets the "urlKey" attribute
         */
        public void setUrlKey(java.lang.String urlKey)
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
                target.setStringValue(urlKey);
            }
        }
        
        /**
         * Sets (as xml) the "urlKey" attribute
         */
        public void xsetUrlKey(org.apache.xmlbeans.XmlString urlKey)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLKEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URLKEY$0);
                }
                target.set(urlKey);
            }
        }
    }
}
