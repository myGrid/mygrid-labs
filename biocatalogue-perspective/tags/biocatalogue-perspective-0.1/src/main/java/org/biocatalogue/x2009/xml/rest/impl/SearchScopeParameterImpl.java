/*
 * XML Type:  SearchScopeParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchScopeParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchScopeParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.SearchScopeParameter.
 */
public class SearchScopeParameterImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.biocatalogue.x2009.xml.rest.SearchScopeParameter
{
    private static final long serialVersionUID = 1L;
    
    public SearchScopeParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SearchScopeParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
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
     * True if has "urlKey" attribute
     */
    public boolean isSetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(URLKEY$0) != null;
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
    
    /**
     * Unsets the "urlKey" attribute
     */
    public void unsetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(URLKEY$0);
        }
    }
    
    /**
     * Gets the "urlValue" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue.Enum getUrlValue()
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
            return (org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlValue" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue xgetUrlValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue)get_store().find_attribute_user(URLVALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "urlValue" attribute
     */
    public void setUrlValue(org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue.Enum urlValue)
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
    public void xsetUrlValue(org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue urlValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue)get_store().find_attribute_user(URLVALUE$2);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchScopeUrlValue)get_store().add_attribute_user(URLVALUE$2);
            }
            target.set(urlValue);
        }
    }
}
