/*
 * XML Type:  FilterTypeParameter
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.FilterTypeParameter
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML FilterTypeParameter(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class FilterTypeParameterImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.FilterTypeParameter
{
    private static final long serialVersionUID = 1L;
    
    public FilterTypeParameterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filter");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName URLKEY$4 = 
        new javax.xml.namespace.QName("", "urlKey");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("", "description");
    
    
    /**
     * Gets a List of "filter" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.FilterParameter> getFilterList()
    {
        final class FilterList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.FilterParameter>
        {
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterParameter get(int i)
                { return FilterTypeParameterImpl.this.getFilterArray(i); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterParameter set(int i, org.biocatalogue.x2009.xml.rest.FilterParameter o)
            {
                org.biocatalogue.x2009.xml.rest.FilterParameter old = FilterTypeParameterImpl.this.getFilterArray(i);
                FilterTypeParameterImpl.this.setFilterArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.biocatalogue.x2009.xml.rest.FilterParameter o)
                { FilterTypeParameterImpl.this.insertNewFilter(i).set(o); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterParameter remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.FilterParameter old = FilterTypeParameterImpl.this.getFilterArray(i);
                FilterTypeParameterImpl.this.removeFilter(i);
                return old;
            }
            
            @Override
            public int size()
                { return FilterTypeParameterImpl.this.sizeOfFilterArray(); }
            
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
    public org.biocatalogue.x2009.xml.rest.FilterParameter[] getFilterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.FilterParameter> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.FilterParameter>();
            get_store().find_all_element_users(FILTER$0, targetList);
            org.biocatalogue.x2009.xml.rest.FilterParameter[] result = new org.biocatalogue.x2009.xml.rest.FilterParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "filter" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterParameter getFilterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterParameter)get_store().find_element_user(FILTER$0, i);
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
    public void setFilterArray(org.biocatalogue.x2009.xml.rest.FilterParameter[] filterArray)
    {
        check_orphaned();
        arraySetterHelper(filterArray, FILTER$0);
    }
    
    /**
     * Sets ith "filter" element
     */
    public void setFilterArray(int i, org.biocatalogue.x2009.xml.rest.FilterParameter filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterParameter)get_store().find_element_user(FILTER$0, i);
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
    public org.biocatalogue.x2009.xml.rest.FilterParameter insertNewFilter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterParameter)get_store().insert_element_user(FILTER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "filter" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterParameter addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterParameter)get_store().add_element_user(FILTER$0);
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
    public org.biocatalogue.x2009.xml.rest.FilterTypeName xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterTypeName target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterTypeName)get_store().find_attribute_user(NAME$2);
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
    public void xsetName(org.biocatalogue.x2009.xml.rest.FilterTypeName name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterTypeName target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterTypeName)get_store().find_attribute_user(NAME$2);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.FilterTypeName)get_store().add_attribute_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "urlKey" attribute
     */
    public java.lang.String getUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLKEY$4);
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
    public org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey xgetUrlKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey)get_store().find_attribute_user(URLKEY$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URLKEY$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URLKEY$4);
            }
            target.setStringValue(urlKey);
        }
    }
    
    /**
     * Sets (as xml) the "urlKey" attribute
     */
    public void xsetUrlKey(org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey urlKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey)get_store().find_attribute_user(URLKEY$4);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.FilterTypeUrlKey)get_store().add_attribute_user(URLKEY$4);
            }
            target.set(urlKey);
        }
    }
    
    /**
     * Gets the "description" attribute
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" attribute
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
            return target;
        }
    }
    
    /**
     * Sets the "description" attribute
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" attribute
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(DESCRIPTION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
}
