/*
 * XML Type:  PageSizeParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.PageSizeParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML PageSizeParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.PageSizeParameter.
 */
public class PageSizeParameterImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.biocatalogue.x2009.xml.rest.PageSizeParameter
{
    private static final long serialVersionUID = 1L;
    
    public PageSizeParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PageSizeParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName URLKEY$0 = 
        new javax.xml.namespace.QName("", "urlKey");
    
    
    /**
     * Gets the "urlKey" attribute
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey.Enum getUrlKey()
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
            return (org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlKey" attribute
     */
    public org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey xgetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            return target;
        }
    }
    
    /**
     * Sets the "urlKey" attribute
     */
    public void setUrlKey(org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey.Enum urlKey)
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
    public void xsetUrlKey(org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey urlKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey)get_store().add_attribute_user(URLKEY$0);
            }
            target.set(urlKey);
        }
    }
    /**
     * An XML urlKey(@).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.PageSizeParameter$UrlKey.
     */
    public static class UrlKeyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.PageSizeParameter.UrlKey
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
}
