/*
 * XML Type:  FilterGroup
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.FilterGroup
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML FilterGroup(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class FilterGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.FilterGroup
{
    private static final long serialVersionUID = 1L;
    
    public FilterGroupImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "type");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets a List of "type" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.FilterType> getTypeList()
    {
        final class TypeList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.FilterType>
        {
            public org.biocatalogue.x2009.xml.rest.FilterType get(int i)
                { return FilterGroupImpl.this.getTypeArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.FilterType set(int i, org.biocatalogue.x2009.xml.rest.FilterType o)
            {
                org.biocatalogue.x2009.xml.rest.FilterType old = FilterGroupImpl.this.getTypeArray(i);
                FilterGroupImpl.this.setTypeArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.FilterType o)
                { FilterGroupImpl.this.insertNewType(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.FilterType remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.FilterType old = FilterGroupImpl.this.getTypeArray(i);
                FilterGroupImpl.this.removeType(i);
                return old;
            }
            
            public int size()
                { return FilterGroupImpl.this.sizeOfTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TypeList();
        }
    }
    
    /**
     * Gets array of all "type" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.FilterType[] getTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.FilterType> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.FilterType>();
            get_store().find_all_element_users(TYPE$0, targetList);
            org.biocatalogue.x2009.xml.rest.FilterType[] result = new org.biocatalogue.x2009.xml.rest.FilterType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "type" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterType getTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterType target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterType)get_store().find_element_user(TYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "type" element
     */
    public int sizeOfTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0);
        }
    }
    
    /**
     * Sets array of all "type" element
     */
    public void setTypeArray(org.biocatalogue.x2009.xml.rest.FilterType[] typeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(typeArray, TYPE$0);
        }
    }
    
    /**
     * Sets ith "type" element
     */
    public void setTypeArray(int i, org.biocatalogue.x2009.xml.rest.FilterType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterType target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterType)get_store().find_element_user(TYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(type);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "type" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterType insertNewType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterType target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterType)get_store().insert_element_user(TYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "type" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterType addNewType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterType target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterType)get_store().add_element_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "type" element
     */
    public void removeType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, i);
        }
    }
    
    /**
     * Gets the "name" attribute
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" attribute
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            return target;
        }
    }
    
    /**
     * Sets the "name" attribute
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" attribute
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
}
