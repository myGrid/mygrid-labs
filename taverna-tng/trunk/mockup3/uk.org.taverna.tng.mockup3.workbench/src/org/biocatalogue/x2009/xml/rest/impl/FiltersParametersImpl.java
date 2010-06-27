/*
 * XML Type:  FiltersParameters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.FiltersParameters
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML FiltersParameters(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class FiltersParametersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.FiltersParameters
{
    private static final long serialVersionUID = 1L;
    
    public FiltersParametersImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GROUP$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "group");
    
    
    /**
     * Gets a List of "group" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.FilterGroupParameter> getGroupList()
    {
        final class GroupList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.FilterGroupParameter>
        {
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterGroupParameter get(int i)
                { return FiltersParametersImpl.this.getGroupArray(i); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterGroupParameter set(int i, org.biocatalogue.x2009.xml.rest.FilterGroupParameter o)
            {
                org.biocatalogue.x2009.xml.rest.FilterGroupParameter old = FiltersParametersImpl.this.getGroupArray(i);
                FiltersParametersImpl.this.setGroupArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.biocatalogue.x2009.xml.rest.FilterGroupParameter o)
                { FiltersParametersImpl.this.insertNewGroup(i).set(o); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.FilterGroupParameter remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.FilterGroupParameter old = FiltersParametersImpl.this.getGroupArray(i);
                FiltersParametersImpl.this.removeGroup(i);
                return old;
            }
            
            @Override
            public int size()
                { return FiltersParametersImpl.this.sizeOfGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupList();
        }
    }
    
    /**
     * Gets array of all "group" elements
     * @deprecated
     */
    @Deprecated
    public org.biocatalogue.x2009.xml.rest.FilterGroupParameter[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.FilterGroupParameter> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.FilterGroupParameter>();
            get_store().find_all_element_users(GROUP$0, targetList);
            org.biocatalogue.x2009.xml.rest.FilterGroupParameter[] result = new org.biocatalogue.x2009.xml.rest.FilterGroupParameter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroupParameter getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroupParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroupParameter)get_store().find_element_user(GROUP$0, i);
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
    public void setGroupArray(org.biocatalogue.x2009.xml.rest.FilterGroupParameter[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$0);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, org.biocatalogue.x2009.xml.rest.FilterGroupParameter group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroupParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroupParameter)get_store().find_element_user(GROUP$0, i);
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
    public org.biocatalogue.x2009.xml.rest.FilterGroupParameter insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroupParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroupParameter)get_store().insert_element_user(GROUP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public org.biocatalogue.x2009.xml.rest.FilterGroupParameter addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.FilterGroupParameter target = null;
            target = (org.biocatalogue.x2009.xml.rest.FilterGroupParameter)get_store().add_element_user(GROUP$0);
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
}
