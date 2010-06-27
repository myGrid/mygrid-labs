/*
 * XML Type:  Filters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Filters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Filters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class FiltersImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Filters
{
    private static final long serialVersionUID = 1L;
    
    public FiltersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "group");
    private static final javax.xml.namespace.QName FOR$2 = 
        new javax.xml.namespace.QName("", "for");
    
    
    /**
     * Gets array of all "group" elements
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroup[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$0, targetList);
            org.biocatalogue.x2009.xml.rest.FilterGroup[] result = new org.biocatalogue.x2009.xml.rest.FilterGroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroup getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroup target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroup)get_store().find_element_user(GROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$0);
        }
    }
    
    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(org.biocatalogue.x2009.xml.rest.FilterGroup[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$0);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.biocatalogue.x2009.xml.rest.FilterGroup group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroup target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroup)get_store().find_element_user(GROUP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroup insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroup target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroup)get_store().insert_element_user(GROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroup addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroup target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroup)get_store().add_element_user(GROUP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$0, i);
        }
    }
    
    /**
     * Gets the "for" attribute
     */
    public org.biocatalogue.x2009.xml.rest.ResourceType.Enum getFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$2);
            if (target == null)
            {
                return null;
            }
            return (org.biocatalogue.x2009.xml.rest.ResourceType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "for" attribute
     */
    public org.biocatalogue.x2009.xml.rest.ResourceType xgetFor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().find_attribute_user(FOR$2);
            return target;
        }
    }
    
    /**
     * Sets the "for" attribute
     */
    public void setFor(org.biocatalogue.x2009.xml.rest.ResourceType.Enum xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FOR$2);
            }
            target.setEnumValue(xfor);
        }
    }
    
    /**
     * Sets (as xml) the "for" attribute
     */
    public void xsetFor(org.biocatalogue.x2009.xml.rest.ResourceType xfor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceType target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().find_attribute_user(FOR$2);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceType)get_store().add_attribute_user(FOR$2);
            }
            target.set(xfor);
        }
    }
}
