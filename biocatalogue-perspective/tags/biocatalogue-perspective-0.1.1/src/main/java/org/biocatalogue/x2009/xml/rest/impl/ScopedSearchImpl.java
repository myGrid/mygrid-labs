/*
 * XML Type:  ScopedSearch
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ScopedSearch
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ScopedSearch(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ScopedSearchImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.ScopedSearch
{
    private static final long serialVersionUID = 1L;
    
    public ScopedSearchImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SCOPE$0 = 
        new javax.xml.namespace.QName("", "scope");
    
    
    /**
     * Gets the "scope" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$0);
            if (target == null)
            {
                return null;
            }
            return (org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" attribute
     */
    public org.biocatalogue.x2009.xml.rest.SearchScopeName xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeName target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().find_attribute_user(SCOPE$0);
            return target;
        }
    }
    
    /**
     * True if has "scope" attribute
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCOPE$0) != null;
        }
    }
    
    /**
     * Sets the "scope" attribute
     */
    public void setScope(org.biocatalogue.x2009.xml.rest.SearchScopeName.Enum scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCOPE$0);
            }
            target.setEnumValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" attribute
     */
    public void xsetScope(org.biocatalogue.x2009.xml.rest.SearchScopeName scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchScopeName target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().find_attribute_user(SCOPE$0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SearchScopeName)get_store().add_attribute_user(SCOPE$0);
            }
            target.set(scope);
        }
    }
    
    /**
     * Unsets the "scope" attribute
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCOPE$0);
        }
    }
}
