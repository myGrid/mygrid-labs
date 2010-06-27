/*
 * XML Type:  SearchResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SearchResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchResults
{
    private static final long serialVersionUID = 1L;
    
    public SearchResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SERVICE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
    private static final javax.xml.namespace.QName SOAPOPERATION$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperation");
    private static final javax.xml.namespace.QName SERVICEPROVIDER$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProvider");
    private static final javax.xml.namespace.QName USER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "user");
    private static final javax.xml.namespace.QName REGISTRY$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "registry");
    
    
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
    
    /**
     * Gets array of all "soapOperation" elements
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation[] getSoapOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SOAPOPERATION$2, targetList);
            org.biocatalogue.x2009.xml.rest.SoapOperation[] result = new org.biocatalogue.x2009.xml.rest.SoapOperation[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "soapOperation" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation getSoapOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().find_element_user(SOAPOPERATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "soapOperation" element
     */
    public int sizeOfSoapOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOAPOPERATION$2);
        }
    }
    
    /**
     * Sets array of all "soapOperation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSoapOperationArray(org.biocatalogue.x2009.xml.rest.SoapOperation[] soapOperationArray)
    {
        check_orphaned();
        arraySetterHelper(soapOperationArray, SOAPOPERATION$2);
    }
    
    /**
     * Sets ith "soapOperation" element
     */
    public void setSoapOperationArray(int i, org.biocatalogue.x2009.xml.rest.SoapOperation soapOperation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().find_element_user(SOAPOPERATION$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(soapOperation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "soapOperation" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation insertNewSoapOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().insert_element_user(SOAPOPERATION$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "soapOperation" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation addNewSoapOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation)get_store().add_element_user(SOAPOPERATION$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "soapOperation" element
     */
    public void removeSoapOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOAPOPERATION$2, i);
        }
    }
    
    /**
     * Gets array of all "serviceProvider" elements
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider[] getServiceProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SERVICEPROVIDER$4, targetList);
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
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$4, i);
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
            return get_store().count_elements(SERVICEPROVIDER$4);
        }
    }
    
    /**
     * Sets array of all "serviceProvider" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setServiceProviderArray(org.biocatalogue.x2009.xml.rest.ServiceProvider[] serviceProviderArray)
    {
        check_orphaned();
        arraySetterHelper(serviceProviderArray, SERVICEPROVIDER$4);
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
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$4, i);
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
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().insert_element_user(SERVICEPROVIDER$4, i);
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
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$4);
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
            get_store().remove_element(SERVICEPROVIDER$4, i);
        }
    }
    
    /**
     * Gets array of all "user" elements
     */
    public org.biocatalogue.x2009.xml.rest.User[] getUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USER$6, targetList);
            org.biocatalogue.x2009.xml.rest.User[] result = new org.biocatalogue.x2009.xml.rest.User[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User getUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().find_element_user(USER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "user" element
     */
    public int sizeOfUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$6);
        }
    }
    
    /**
     * Sets array of all "user" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUserArray(org.biocatalogue.x2009.xml.rest.User[] userArray)
    {
        check_orphaned();
        arraySetterHelper(userArray, USER$6);
    }
    
    /**
     * Sets ith "user" element
     */
    public void setUserArray(int i, org.biocatalogue.x2009.xml.rest.User user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().find_element_user(USER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(user);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User insertNewUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().insert_element_user(USER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().add_element_user(USER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "user" element
     */
    public void removeUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$6, i);
        }
    }
    
    /**
     * Gets array of all "registry" elements
     */
    public org.biocatalogue.x2009.xml.rest.Registry[] getRegistryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REGISTRY$8, targetList);
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
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$8, i);
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
            return get_store().count_elements(REGISTRY$8);
        }
    }
    
    /**
     * Sets array of all "registry" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRegistryArray(org.biocatalogue.x2009.xml.rest.Registry[] registryArray)
    {
        check_orphaned();
        arraySetterHelper(registryArray, REGISTRY$8);
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
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().find_element_user(REGISTRY$8, i);
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
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().insert_element_user(REGISTRY$8, i);
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
            target = (org.biocatalogue.x2009.xml.rest.Registry)get_store().add_element_user(REGISTRY$8);
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
            get_store().remove_element(REGISTRY$8, i);
        }
    }
}
