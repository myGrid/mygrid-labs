/*
 * XML Type:  RestService
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.RestService
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML RestService(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class RestServiceImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.RestService
{
    private static final long serialVersionUID = 1L;
    
    public RestServiceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE2$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title");
    private static final org.apache.xmlbeans.QNameSet TITLE2$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
    });
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "name");
    private static final javax.xml.namespace.QName SUBMITTER$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "submitter");
    private static final javax.xml.namespace.QName DESCRIPTION$6 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description");
    private static final org.apache.xmlbeans.QNameSet DESCRIPTION$7 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
    });
    private static final javax.xml.namespace.QName DOCUMENTATIONURL$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "documentationUrl");
    private static final javax.xml.namespace.QName CREATED$10 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName DEPLOYMENTS$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "deployments");
    private static final javax.xml.namespace.QName ANCESTORS$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "ancestors");
    private static final javax.xml.namespace.QName RELATED$16 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE2$1, 0);
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle2(java.lang.String title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE2$0);
            }
            target.setStringValue(title2);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle2(org.apache.xmlbeans.XmlString title2)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE2$1, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE2$0);
            }
            target.set(title2);
        }
    }
    
    /**
     * Gets the "name" element
     */
    public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "name" element
     */
    public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "name" element
     */
    public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Gets the "submitter" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSubmitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SUBMITTER$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "submitter" element
     */
    public void setSubmitter(org.biocatalogue.x2009.xml.rest.ResourceLink submitter)
    {
        generatedSetterHelperImpl(submitter, SUBMITTER$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "submitter" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSubmitter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SUBMITTER$4);
            return target;
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$7, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$6);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$7, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$6);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "documentationUrl" element
     */
    public java.lang.String getDocumentationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONURL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "documentationUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONURL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "documentationUrl" element
     */
    public void setDocumentationUrl(java.lang.String documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONURL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTATIONURL$8);
            }
            target.setStringValue(documentationUrl);
        }
    }
    
    /**
     * Sets (as xml) the "documentationUrl" element
     */
    public void xsetDocumentationUrl(org.apache.xmlbeans.XmlString documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONURL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTATIONURL$8);
            }
            target.set(documentationUrl);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$10);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$10);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Deployments getDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Deployments target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Deployments)get_store().find_element_user(DEPLOYMENTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "deployments" element
     */
    public boolean isSetDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEPLOYMENTS$12) != 0;
        }
    }
    
    /**
     * Sets the "deployments" element
     */
    public void setDeployments(org.biocatalogue.x2009.xml.rest.RestService.Deployments deployments)
    {
        generatedSetterHelperImpl(deployments, DEPLOYMENTS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "deployments" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Deployments addNewDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Deployments target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Deployments)get_store().add_element_user(DEPLOYMENTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "deployments" element
     */
    public void unsetDeployments()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEPLOYMENTS$12, 0);
        }
    }
    
    /**
     * Gets the "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Ancestors getAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Ancestors)get_store().find_element_user(ANCESTORS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ancestors" element
     */
    public boolean isSetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCESTORS$14) != 0;
        }
    }
    
    /**
     * Sets the "ancestors" element
     */
    public void setAncestors(org.biocatalogue.x2009.xml.rest.RestService.Ancestors ancestors)
    {
        generatedSetterHelperImpl(ancestors, ANCESTORS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Ancestors addNewAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Ancestors)get_store().add_element_user(ANCESTORS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "ancestors" element
     */
    public void unsetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCESTORS$14, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Related)get_store().find_element_user(RELATED$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "related" element
     */
    public boolean isSetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATED$16) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.RestService.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.RestService.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.RestService.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.RestService.Related)get_store().add_element_user(RELATED$16);
            return target;
        }
    }
    
    /**
     * Unsets the "related" element
     */
    public void unsetRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATED$16, 0);
        }
    }
    /**
     * An XML deployments(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class DeploymentsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.RestService.Deployments
    {
        private static final long serialVersionUID = 1L;
        
        public DeploymentsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICEDEPLOYMENT$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceDeployment");
        
        
        /**
         * Gets a List of "serviceDeployment" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> getServiceDeploymentList()
        {
            final class ServiceDeploymentList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceDeployment>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment get(int i)
                    { return DeploymentsImpl.this.getServiceDeploymentArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment set(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment o)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceDeployment old = DeploymentsImpl.this.getServiceDeploymentArray(i);
                    DeploymentsImpl.this.setServiceDeploymentArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment o)
                    { DeploymentsImpl.this.insertNewServiceDeployment(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ServiceDeployment remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.ServiceDeployment old = DeploymentsImpl.this.getServiceDeploymentArray(i);
                    DeploymentsImpl.this.removeServiceDeployment(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return DeploymentsImpl.this.sizeOfServiceDeploymentArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ServiceDeploymentList();
            }
        }
        
        /**
         * Gets array of all "serviceDeployment" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment[] getServiceDeploymentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.ServiceDeployment> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceDeployment>();
                get_store().find_all_element_users(SERVICEDEPLOYMENT$0, targetList);
                org.biocatalogue.x2009.xml.rest.ServiceDeployment[] result = new org.biocatalogue.x2009.xml.rest.ServiceDeployment[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment getServiceDeploymentArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().find_element_user(SERVICEDEPLOYMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "serviceDeployment" element
         */
        public int sizeOfServiceDeploymentArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SERVICEDEPLOYMENT$0);
            }
        }
        
        /**
         * Sets array of all "serviceDeployment" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setServiceDeploymentArray(org.biocatalogue.x2009.xml.rest.ServiceDeployment[] serviceDeploymentArray)
        {
            check_orphaned();
            arraySetterHelper(serviceDeploymentArray, SERVICEDEPLOYMENT$0);
        }
        
        /**
         * Sets ith "serviceDeployment" element
         */
        public void setServiceDeploymentArray(int i, org.biocatalogue.x2009.xml.rest.ServiceDeployment serviceDeployment)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().find_element_user(SERVICEDEPLOYMENT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(serviceDeployment);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment insertNewServiceDeployment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().insert_element_user(SERVICEDEPLOYMENT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "serviceDeployment" element
         */
        public org.biocatalogue.x2009.xml.rest.ServiceDeployment addNewServiceDeployment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ServiceDeployment target = null;
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment)get_store().add_element_user(SERVICEDEPLOYMENT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "serviceDeployment" element
         */
        public void removeServiceDeployment(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SERVICEDEPLOYMENT$0, i);
            }
        }
    }
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AncestorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RestService.Ancestors
    {
        private static final long serialVersionUID = 1L;
        
        public AncestorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
        
        
        /**
         * Gets the "service" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(org.biocatalogue.x2009.xml.rest.ResourceLink service)
        {
            generatedSetterHelperImpl(service, SERVICE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "service" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                return target;
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.RestService.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPLOYMENTS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "deployments");
        private static final javax.xml.namespace.QName ANNOTATIONS$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
        
        
        /**
         * Gets the "deployments" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getDeployments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(DEPLOYMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "deployments" element
         */
        public void setDeployments(org.biocatalogue.x2009.xml.rest.ResourceLink deployments)
        {
            generatedSetterHelperImpl(deployments, DEPLOYMENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "deployments" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewDeployments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(DEPLOYMENTS$0);
                return target;
            }
        }
        
        /**
         * Gets the "annotations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "annotations" element
         */
        public void setAnnotations(org.biocatalogue.x2009.xml.rest.ResourceLink annotations)
        {
            generatedSetterHelperImpl(annotations, ANNOTATIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "annotations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$2);
                return target;
            }
        }
    }
}
