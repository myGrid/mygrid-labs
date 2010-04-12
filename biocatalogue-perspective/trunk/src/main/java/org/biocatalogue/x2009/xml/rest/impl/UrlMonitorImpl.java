/*
 * XML Type:  UrlMonitor
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.UrlMonitor
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML UrlMonitor(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class UrlMonitorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.UrlMonitor
{
    private static final long serialVersionUID = 1L;
    
    public UrlMonitorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName URL$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "url");
    private static final javax.xml.namespace.QName RESOURCE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "resource");
    
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$0);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlAnyURI url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(URL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(URL$0);
            }
            target.set(url);
        }
    }
    
    /**
     * Gets the "resource" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getResource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(RESOURCE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resource" element
     */
    public void setResource(org.biocatalogue.x2009.xml.rest.ResourceLink resource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(RESOURCE$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(RESOURCE$2);
            }
            target.set(resource);
        }
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(RESOURCE$2);
            return target;
        }
    }
}
