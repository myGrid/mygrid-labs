/*
 * XML Type:  MetadataCount
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.MetadataCount
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML MetadataCount(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is an atomic type that is a restriction of org.biocatalogue.x2009.xml.rest.MetadataCount.
 */
public class MetadataCountImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements org.biocatalogue.x2009.xml.rest.MetadataCount
{
    private static final long serialVersionUID = 1L;
    
    public MetadataCountImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected MetadataCountImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName BY$0 = 
        new javax.xml.namespace.QName("", "by");
    
    
    /**
     * Gets the "by" attribute
     */
    public org.biocatalogue.x2009.xml.rest.MetadataBy.Enum getBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$0);
            if (target == null)
            {
                return null;
            }
            return (org.biocatalogue.x2009.xml.rest.MetadataBy.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "by" attribute
     */
    public org.biocatalogue.x2009.xml.rest.MetadataBy xgetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MetadataBy target = null;
            target = (org.biocatalogue.x2009.xml.rest.MetadataBy)get_store().find_attribute_user(BY$0);
            return target;
        }
    }
    
    /**
     * True if has "by" attribute
     */
    public boolean isSetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BY$0) != null;
        }
    }
    
    /**
     * Sets the "by" attribute
     */
    public void setBy(org.biocatalogue.x2009.xml.rest.MetadataBy.Enum by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BY$0);
            }
            target.setEnumValue(by);
        }
    }
    
    /**
     * Sets (as xml) the "by" attribute
     */
    public void xsetBy(org.biocatalogue.x2009.xml.rest.MetadataBy by)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MetadataBy target = null;
            target = (org.biocatalogue.x2009.xml.rest.MetadataBy)get_store().find_attribute_user(BY$0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.MetadataBy)get_store().add_attribute_user(BY$0);
            }
            target.set(by);
        }
    }
    
    /**
     * Unsets the "by" attribute
     */
    public void unsetBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BY$0);
        }
    }
}
