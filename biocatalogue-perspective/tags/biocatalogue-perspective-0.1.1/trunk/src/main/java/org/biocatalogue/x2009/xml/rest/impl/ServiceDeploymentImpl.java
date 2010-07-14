/*
 * XML Type:  ServiceDeployment
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceDeployment
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServiceDeployment(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceDeploymentImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.ServiceDeployment
{
    private static final long serialVersionUID = 1L;
    
    public ServiceDeploymentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENDPOINT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "endpoint");
    private static final javax.xml.namespace.QName SERVICEPROVIDER$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProvider");
    private static final javax.xml.namespace.QName LOCATION$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "location");
    private static final javax.xml.namespace.QName SUBMITTER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "submitter");
    private static final javax.xml.namespace.QName CREATED$8 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName PROVIDEDVARIANT$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "providedVariant");
    private static final javax.xml.namespace.QName ANCESTORS$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "ancestors");
    private static final javax.xml.namespace.QName RELATED$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "related");
    
    
    /**
     * Gets the "endpoint" element
     */
    public java.lang.String getEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "endpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "endpoint" element
     */
    public void setEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$0);
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) the "endpoint" element
     */
    public void xsetEndpoint(org.apache.xmlbeans.XmlAnyURI endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$0);
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Gets the "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider getServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "serviceProvider" element
     */
    public void setServiceProvider(org.biocatalogue.x2009.xml.rest.ServiceProvider serviceProvider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().find_element_user(SERVICEPROVIDER$2, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$2);
            }
            target.set(serviceProvider);
        }
    }
    
    /**
     * Appends and returns a new empty "serviceProvider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceProvider addNewServiceProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceProvider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceProvider)get_store().add_element_user(SERVICEPROVIDER$2);
            return target;
        }
    }
    
    /**
     * Gets the "location" element
     */
    public org.biocatalogue.x2009.xml.rest.Location getLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "location" element
     */
    public void setLocation(org.biocatalogue.x2009.xml.rest.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$4, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Location)get_store().add_element_user(LOCATION$4);
            }
            target.set(location);
        }
    }
    
    /**
     * Appends and returns a new empty "location" element
     */
    public org.biocatalogue.x2009.xml.rest.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().add_element_user(LOCATION$4);
            return target;
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SUBMITTER$6, 0);
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
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SUBMITTER$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SUBMITTER$6);
            }
            target.set(submitter);
        }
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
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SUBMITTER$6);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$8, 0);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$8);
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
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$8);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "providedVariant" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant getProvidedVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant)get_store().find_element_user(PROVIDEDVARIANT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "providedVariant" element
     */
    public boolean isSetProvidedVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDEDVARIANT$10) != 0;
        }
    }
    
    /**
     * Sets the "providedVariant" element
     */
    public void setProvidedVariant(org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant providedVariant)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant)get_store().find_element_user(PROVIDEDVARIANT$10, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant)get_store().add_element_user(PROVIDEDVARIANT$10);
            }
            target.set(providedVariant);
        }
    }
    
    /**
     * Appends and returns a new empty "providedVariant" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant addNewProvidedVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant)get_store().add_element_user(PROVIDEDVARIANT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "providedVariant" element
     */
    public void unsetProvidedVariant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDEDVARIANT$10, 0);
        }
    }
    
    /**
     * Gets the "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors getAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors)get_store().find_element_user(ANCESTORS$12, 0);
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
            return get_store().count_elements(ANCESTORS$12) != 0;
        }
    }
    
    /**
     * Sets the "ancestors" element
     */
    public void setAncestors(org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors ancestors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors)get_store().find_element_user(ANCESTORS$12, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors)get_store().add_element_user(ANCESTORS$12);
            }
            target.set(ancestors);
        }
    }
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors addNewAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors)get_store().add_element_user(ANCESTORS$12);
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
            get_store().remove_element(ANCESTORS$12, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related)get_store().find_element_user(RELATED$14, 0);
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
            return get_store().count_elements(RELATED$14) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related)get_store().find_element_user(RELATED$14, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related)get_store().add_element_user(RELATED$14);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related)get_store().add_element_user(RELATED$14);
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
            get_store().remove_element(RELATED$14, 0);
        }
    }
    /**
     * An XML providedVariant(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ProvidedVariantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceDeployment.ProvidedVariant
    {
        private static final long serialVersionUID = 1L;
        
        public ProvidedVariantImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOAPSERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapService");
        private static final javax.xml.namespace.QName RESTSERVICE$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "restService");
        
        
        /**
         * Gets the "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapService getSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().find_element_user(SOAPSERVICE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "soapService" element
         */
        public boolean isSetSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOAPSERVICE$0) != 0;
            }
        }
        
        /**
         * Sets the "soapService" element
         */
        public void setSoapService(org.biocatalogue.x2009.xml.rest.SoapService soapService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().find_element_user(SOAPSERVICE$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().add_element_user(SOAPSERVICE$0);
                }
                target.set(soapService);
            }
        }
        
        /**
         * Appends and returns a new empty "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapService addNewSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapService target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapService)get_store().add_element_user(SOAPSERVICE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "soapService" element
         */
        public void unsetSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOAPSERVICE$0, 0);
            }
        }
        
        /**
         * Gets the "restService" element
         */
        public org.biocatalogue.x2009.xml.rest.RestService getRestService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().find_element_user(RESTSERVICE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "restService" element
         */
        public boolean isSetRestService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESTSERVICE$2) != 0;
            }
        }
        
        /**
         * Sets the "restService" element
         */
        public void setRestService(org.biocatalogue.x2009.xml.rest.RestService restService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().find_element_user(RESTSERVICE$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().add_element_user(RESTSERVICE$2);
                }
                target.set(restService);
            }
        }
        
        /**
         * Appends and returns a new empty "restService" element
         */
        public org.biocatalogue.x2009.xml.rest.RestService addNewRestService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.RestService target = null;
                target = (org.biocatalogue.x2009.xml.rest.RestService)get_store().add_element_user(RESTSERVICE$2);
                return target;
            }
        }
        
        /**
         * Unsets the "restService" element
         */
        public void unsetRestService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESTSERVICE$2, 0);
            }
        }
    }
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AncestorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceDeployment.Ancestors
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                }
                target.set(service);
            }
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
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceDeployment.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTATIONS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
        
        
        /**
         * Gets the "annotations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$0, 0);
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
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$0);
                }
                target.set(annotations);
            }
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
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$0);
                return target;
            }
        }
    }
}
