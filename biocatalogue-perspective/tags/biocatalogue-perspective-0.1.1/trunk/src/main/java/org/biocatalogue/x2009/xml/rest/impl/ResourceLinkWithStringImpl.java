/*
 * XML Type:  ResourceLinkWithString
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ResourceLinkWithString
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ResourceLinkWithString(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.ResourceLinkWithString.
 */
public class ResourceLinkWithStringImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.biocatalogue.x2009.xml.rest.ResourceLinkWithString
{
    private static final long serialVersionUID = 1L;
    
    public ResourceLinkWithStringImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected ResourceLinkWithStringImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName HREF$0 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "href");
    private static final javax.xml.namespace.QName TITLE$2 = 
        new javax.xml.namespace.QName("http://www.w3.org/1999/xlink", "title");
    private static final javax.xml.namespace.QName RESOURCETYPE$4 = 
        new javax.xml.namespace.QName("", "resourceType");
    
    
    /**
     * Gets the "href" attribute
     */
    public java.lang.String getHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "href" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetHref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            return target;
        }
    }
    
    /**
     * Sets the "href" attribute
     */
    public void setHref(java.lang.String href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$0);
            }
            target.setStringValue(href);
        }
    }
    
    /**
     * Sets (as xml) the "href" attribute
     */
    public void xsetHref(org.apache.xmlbeans.XmlAnyURI href)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(HREF$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(HREF$0);
            }
            target.set(href);
        }
    }
    
    /**
     * Gets the "title" attribute
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" attribute
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
            return target;
        }
    }
    
    /**
     * True if has "title" attribute
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TITLE$2) != null;
        }
    }
    
    /**
     * Sets the "title" attribute
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TITLE$2);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" attribute
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TITLE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TITLE$2);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" attribute
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TITLE$2);
        }
    }
    
    /**
     * Gets the "resourceType" attribute
     */
    public org.biocatalogue.x2009.xml.rest.ResourceType.Enum getResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCETYPE$4);
            if (target == null)
            {
                return null;
            }
            return (org.biocatalogue.x2009.xml.rest.ResourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "resourceType" attribute
     */
    public org.biocatalogue.x2009.xml.rest.ResourceType xgetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().find_attribute_user(RESOURCETYPE$4);
            return target;
        }
    }
    
    /**
     * True if has "resourceType" attribute
     */
    public boolean isSetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RESOURCETYPE$4) != null;
        }
    }
    
    /**
     * Sets the "resourceType" attribute
     */
    public void setResourceType(org.biocatalogue.x2009.xml.rest.ResourceType.Enum resourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RESOURCETYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RESOURCETYPE$4);
            }
            target.setEnumValue(resourceType);
        }
    }
    
    /**
     * Sets (as xml) the "resourceType" attribute
     */
    public void xsetResourceType(org.biocatalogue.x2009.xml.rest.ResourceType resourceType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().find_attribute_user(RESOURCETYPE$4);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().add_attribute_user(RESOURCETYPE$4);
            }
            target.set(resourceType);
        }
    }
    
    /**
     * Unsets the "resourceType" attribute
     */
    public void unsetResourceType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RESOURCETYPE$4);
        }
    }
}
