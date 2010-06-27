/*
 * XML Type:  ServicesResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServicesResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServicesResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServicesResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServicesResults
{
    private static final long serialVersionUID = 1L;
    
    public ServicesResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
    
    
    /**
     * Gets array of all "service" elements
     */
    public org.biocatalogue.x2009.xml.rest.Service[] getServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICE$0, targetList);
            org.biocatalogue.x2009.xml.rest.Service[] result = new org.biocatalogue.x2009.xml.rest.Service[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "service" element
     */
    public org.biocatalogue.x2009.xml.rest.Service getServiceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "service" element
     */
    public int sizeOfServiceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICE$0);
        }
    }
    
    /**
     * Sets array of all "service" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setServiceArray(org.biocatalogue.x2009.xml.rest.Service[] serviceArray)
    {
        check_orphaned();
        arraySetterHelper(serviceArray, SERVICE$0);
    }
    
    /**
     * Sets ith "service" element
     */
    public void setServiceArray(int i, org.biocatalogue.x2009.xml.rest.Service service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().find_element_user(SERVICE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(service);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "service" element
     */
    public org.biocatalogue.x2009.xml.rest.Service insertNewService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().insert_element_user(SERVICE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "service" element
     */
    public org.biocatalogue.x2009.xml.rest.Service addNewService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Service target = null;
            target = (org.biocatalogue.x2009.xml.rest.Service)get_store().add_element_user(SERVICE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "service" element
     */
    public void removeService(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICE$0, i);
        }
    }
}
