/*
 * XML Type:  Filter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Filter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Filter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class FilterImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Filter
{
    private static final long serialVersionUID = 1L;
    
    public FilterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filter");
    private static final javax.xml.namespace.QName URLVALUE$2 = 
        new javax.xml.namespace.QName("", "urlValue");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.Filter> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.Filter>
        {
            @Override
            public org.biocatalogue.x2009.xml.rest.Filter get(int i)
                { return FilterImpl.this.getFilterArray(i); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.Filter set(int i, org.biocatalogue.x2009.xml.rest.Filter o)
            {
                org.biocatalogue.x2009.xml.rest.Filter old = FilterImpl.this.getFilterArray(i);
                FilterImpl.this.setFilterArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.biocatalogue.x2009.xml.rest.Filter o)
                { FilterImpl.this.insertNewFilter(i).set(o); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.Filter remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.Filter old = FilterImpl.this.getFilterArray(i);
                FilterImpl.this.removeFilter(i);
                return old;
            }
            
            @Override
            public int size()
                { return FilterImpl.this.sizeOfFilterArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FilterList();
        }
    }
    
    /**
     * Gets array of all "filter" elements
     * @deprecated
     */
    @Deprecated
    public org.biocatalogue.x2009.xml.rest.Filter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.Filter> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.Filter>();
            get_store().find_all_element_users(FILTER$0, targetList);
            org.biocatalogue.x2009.xml.rest.Filter[] result = new org.biocatalogue.x2009.xml.rest.Filter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public org.biocatalogue.x2009.xml.rest.Filter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filter target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "filter" element
     */
    public int sizeOfFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$0);
        }
    }
    
    /**
     * Sets array of all "filter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFilterArray(org.biocatalogue.x2009.xml.rest.Filter[] filterArray)
    {
        check_orphaned();
        arraySetterHelper(filterArray, FILTER$0);
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, org.biocatalogue.x2009.xml.rest.Filter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filter target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filter)get_store().find_element_user(FILTER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(filter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "filter" element
     */
    public org.biocatalogue.x2009.xml.rest.Filter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filter target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filter)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.biocatalogue.x2009.xml.rest.Filter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filter target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filter)get_store().add_element_user(FILTER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "filter" element
     */
    public void removeFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$0, i);
        }
    }
    
    /**
     * Gets the "urlValue" attribute
     */
    public java.lang.String getUrlValue()
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLVALUE$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLVALUE$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(URLVALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(URLVALUE$2);
            }
            target.set(urlValue);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NAME$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(NAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(NAME$4);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(COUNT$6);
            return target;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$6);
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlNonNegativeInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_attribute_user(COUNT$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_attribute_user(COUNT$6);
            }
            target.set(count);
        }
    }
}
