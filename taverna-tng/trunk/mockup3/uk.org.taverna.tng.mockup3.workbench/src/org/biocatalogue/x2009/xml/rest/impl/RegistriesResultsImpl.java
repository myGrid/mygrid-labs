/*
 * XML Type:  RegistriesResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RegistriesResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML RegistriesResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class RegistriesResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RegistriesResults
{
    private static final long serialVersionUID = 1L;
    
    public RegistriesResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REGISTRY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "registry");
    
    
    /**
     * Gets array of all "registry" elements
     */
    public org.biocatalogue.x2009.xml.rest.Registry[] getRegistryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRY$0, targetList);
            org.biocatalogue.x2009.xml.rest.Registry[] result = new org.biocatalogue.x2009.xml.rest.Registry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "registry" element
     */
    public org.biocatalogue.x2009.xml.rest.Registry getRegistryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "registry" element
     */
    public int sizeOfRegistryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGISTRY$0);
        }
    }
    
    /**
     * Sets array of all "registry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRegistryArray(org.biocatalogue.x2009.xml.rest.Registry[] registryArray)
    {
        check_orphaned();
        arraySetterHelper(registryArray, REGISTRY$0);
    }
    
    /**
     * Sets ith "registry" element
     */
    public void setRegistryArray(int i, org.biocatalogue.x2009.xml.rest.Registry registry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(registry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "registry" element
     */
    public org.biocatalogue.x2009.xml.rest.Registry insertNewRegistry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().insert_element_user(REGISTRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "registry" element
     */
    public org.biocatalogue.x2009.xml.rest.Registry addNewRegistry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Registry target = null;
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().add_element_user(REGISTRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "registry" element
     */
    public void removeRegistry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGISTRY$0, i);
        }
    }
}
