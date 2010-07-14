/*
 * XML Type:  PageParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.PageParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML PageParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.PageParameter.
 */
public class PageParameterImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.biocatalogue.x2009.xml.rest.PageParameter
{
    private static final long serialVersionUID = 1L;
    
    public PageParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected PageParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName URLKEY$0 = 
        new javax.xml.namespace.QName("", "urlKey");
    
    
    /**
     * Gets the "urlKey" attribute
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey.Enum getUrlKey()
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
            return (org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlKey" attribute
     */
    public org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey xgetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            return target;
        }
    }
    
    /**
     * Sets the "urlKey" attribute
     */
    public void setUrlKey(org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey.Enum urlKey)
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
    public void xsetUrlKey(org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey urlKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey)get_store().add_attribute_user(URLKEY$0);
            }
            target.set(urlKey);
        }
    }
    /**
     * An XML urlKey(@).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.PageParameter$UrlKey.
     */
    public static class UrlKeyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.PageParameter.UrlKey
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
