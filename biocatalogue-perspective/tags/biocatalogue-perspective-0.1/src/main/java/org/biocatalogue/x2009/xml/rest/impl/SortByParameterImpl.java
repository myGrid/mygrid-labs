/*
 * XML Type:  SortByParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SortByParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SortByParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SortByParameter.
 */
public class SortByParameterImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.biocatalogue.x2009.xml.rest.SortByParameter
{
    private static final long serialVersionUID = 1L;
    
    public SortByParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SortByParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
    public org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey.Enum getUrlKey()
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
            return (org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlKey" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey xgetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            return target;
        }
    }
    
    /**
     * Sets the "urlKey" attribute
     */
    public void setUrlKey(org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey.Enum urlKey)
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
    public void xsetUrlKey(org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey urlKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey)get_store().find_attribute_user(URLKEY$0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey)get_store().add_attribute_user(URLKEY$0);
            }
            target.set(urlKey);
        }
    }
    
    /**
     * Gets the "urlValue" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SortBy.Enum getUrlValue()
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
            return (org.biocatalogue.x2009.xml.rest.SortBy.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlValue" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SortBy xgetUrlValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortBy target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortBy)get_store().find_attribute_user(URLVALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "urlValue" attribute
     */
    public void setUrlValue(org.biocatalogue.x2009.xml.rest.SortBy.Enum urlValue)
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
    public void xsetUrlValue(org.biocatalogue.x2009.xml.rest.SortBy urlValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SortBy target = null;
            target = (org.biocatalogue.x2009.xml.rest.SortBy)get_store().find_attribute_user(URLVALUE$2);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SortBy)get_store().add_attribute_user(URLVALUE$2);
            }
            target.set(urlValue);
        }
    }
    /**
     * An XML urlKey(@).
     *
     * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SortByParameter$UrlKey.
     */
    public static class UrlKeyImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.SortByParameter.UrlKey
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
