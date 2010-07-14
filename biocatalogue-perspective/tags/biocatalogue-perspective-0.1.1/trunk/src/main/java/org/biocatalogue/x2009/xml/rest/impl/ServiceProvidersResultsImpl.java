/*
 * XML Type:  ServiceProvidersResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceProvidersResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServiceProvidersResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceProvidersResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceProvidersResults
{
    private static final long serialVersionUID = 1L;
    
    public ServiceProvidersResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICEPROVIDER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProvider");
    
    
    /**
     * Gets a List of "serviceProvider" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceProvider> getServiceProviderList()
    {
        final class ServiceProviderList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceProvider>
        {
            public org.biocatalogue.x2009.xml.rest.ServiceProvider get(int i)
                { return ServiceProvidersResultsImpl.this.getServiceProviderArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.ServiceProvider set(int i, org.biocatalogue.x2009.xml.rest.ServiceProvider o)
            {
                org.biocatalogue.x2009.xml.rest.ServiceProvider old = ServiceProvidersResultsImpl.this.getServiceProviderArray(i);
                ServiceProvidersResultsImpl.this.setServiceProviderArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceProvider o)
                { ServiceProvidersResultsImpl.this.insertNewServiceProvider(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.ServiceProvider remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.ServiceProvider old = ServiceProvidersResultsImpl.this.getServiceProviderArray(i);
                ServiceProvidersResultsImpl.this.removeServiceProvider(i);
                return old;
            }
            
            public int size()
                { return ServiceProvidersResultsImpl.this.sizeOfServiceProviderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ServiceProviderList();
        }
    }
    
    /**
     * Gets array of all "serviceProvider" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider[] getServiceProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.ServiceProvider> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceProvider>();
            get_store().find_all_element_users(SERVICEPROVIDER$0, targetList);
            org.biocatalogue.x2009.xml.rest.ServiceProvider[] result = new org.biocatalogue.x2009.xml.rest.ServiceProvider[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider getServiceProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "serviceProvider" element
     */
    public int sizeOfServiceProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SERVICEPROVIDER$0);
        }
    }
    
    /**
     * Sets array of all "serviceProvider" element
     */
    public void setServiceProviderArray(org.biocatalogue.x2009.xml.rest.ServiceProvider[] serviceProviderArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(serviceProviderArray, SERVICEPROVIDER$0);
        }
    }
    
    /**
     * Sets ith "serviceProvider" element
     */
    public void setServiceProviderArray(int i, org.biocatalogue.x2009.xml.rest.ServiceProvider serviceProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(serviceProvider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider insertNewServiceProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().insert_element_user(SERVICEPROVIDER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider addNewServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "serviceProvider" element
     */
    public void removeServiceProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SERVICEPROVIDER$0, i);
        }
    }
}
