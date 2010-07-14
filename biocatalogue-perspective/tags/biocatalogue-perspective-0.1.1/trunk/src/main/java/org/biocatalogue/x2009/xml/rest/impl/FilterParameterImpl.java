/*
 * XML Type:  FilterParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.FilterParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML FilterParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.FilterParameter.
 */
public class FilterParameterImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.biocatalogue.x2009.xml.rest.FilterParameter
{
    private static final long serialVersionUID = 1L;
    
    public FilterParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected FilterParameterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName URLVALUE$0 = 
        new javax.xml.namespace.QName("", "urlValue");
    
    
    /**
     * Gets the "urlValue" attribute
     */
    public java.lang.String getUrlValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLVALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "urlValue" attribute
     */
    public org.apache.xmlbeans.XmlString xgetUrlValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLVALUE$0);
            return target;
        }
    }
    
    /**
     * Sets the "urlValue" attribute
     */
    public void setUrlValue(java.lang.String urlValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLVALUE$0);
            }
            target.setStringValue(urlValue);
        }
    }
    
    /**
     * Sets (as xml) the "urlValue" attribute
     */
    public void xsetUrlValue(org.apache.xmlbeans.XmlString urlValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLVALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URLVALUE$0);
            }
            target.set(urlValue);
        }
    }
}
