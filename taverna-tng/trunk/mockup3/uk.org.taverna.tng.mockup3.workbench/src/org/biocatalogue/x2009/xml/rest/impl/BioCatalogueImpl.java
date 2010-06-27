/*
 * XML Type:  BioCatalogue
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.BioCatalogue
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML BioCatalogue(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class BioCatalogueImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.BioCatalogue
{
    private static final long serialVersionUID = 1L;
    
    public BioCatalogueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DOCUMENTATION$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "documentation");
    private static final javax.xml.namespace.QName COLLECTIONS$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "collections");
    
    
    /**
     * Gets the "documentation" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(DOCUMENTATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "documentation" element
     */
    public void setDocumentation(org.biocatalogue.x2009.xml.rest.ResourceLink documentation)
    {
        generatedSetterHelperImpl(documentation, DOCUMENTATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "documentation" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewDocumentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(DOCUMENTATION$0);
            return target;
        }
    }
    
    /**
     * Gets the "collections" element
     */
    public org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections getCollections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections target = null;
            target = (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections)get_store().find_element_user(COLLECTIONS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "collections" element
     */
    public void setCollections(org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections collections)
    {
        generatedSetterHelperImpl(collections, COLLECTIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "collections" element
     */
    public org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections addNewCollections()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections target = null;
            target = (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections)get_store().add_element_user(COLLECTIONS$2);
            return target;
        }
    }
    /**
     * An XML collections(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class CollectionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections
    {
        private static final long serialVersionUID = 1L;
        
        public CollectionsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SEARCH$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "search");
        private static final javax.xml.namespace.QName SERVICES$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
        private static final javax.xml.namespace.QName SOAPOPERATIONS$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperations");
        private static final javax.xml.namespace.QName CATEGORIES$6 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "categories");
        private static final javax.xml.namespace.QName TAGS$8 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tags");
        private static final javax.xml.namespace.QName ANNOTATIONS$10 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
        private static final javax.xml.namespace.QName ANNOTATIONATTRIBUTES$12 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationAttributes");
        private static final javax.xml.namespace.QName SERVICEPROVIDERS$14 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "serviceProviders");
        private static final javax.xml.namespace.QName USERS$16 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "users");
        private static final javax.xml.namespace.QName REGISTRIES$18 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "registries");
        private static final javax.xml.namespace.QName TESTRESULTS$20 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testResults");
        private static final javax.xml.namespace.QName FILTERS$22 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
        
        
        /**
         * Gets the "search" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SEARCH$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "search" element
         */
        public void setSearch(org.biocatalogue.x2009.xml.rest.ResourceLink search)
        {
            generatedSetterHelperImpl(search, SEARCH$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "search" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSearch()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SEARCH$0);
                return target;
            }
        }
        
        /**
         * Gets the "services" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICES$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "services" element
         */
        public void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services)
        {
            generatedSetterHelperImpl(services, SERVICES$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "services" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICES$2);
                return target;
            }
        }
        
        /**
         * Gets the "soapOperations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPOPERATIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "soapOperations" element
         */
        public void setSoapOperations(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperations)
        {
            generatedSetterHelperImpl(soapOperations, SOAPOPERATIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "soapOperations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPOPERATIONS$4);
                return target;
            }
        }
        
        /**
         * Gets the "categories" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(CATEGORIES$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "categories" element
         */
        public void setCategories(org.biocatalogue.x2009.xml.rest.ResourceLink categories)
        {
            generatedSetterHelperImpl(categories, CATEGORIES$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "categories" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewCategories()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(CATEGORIES$6);
                return target;
            }
        }
        
        /**
         * Gets the "tags" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(TAGS$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "tags" element
         */
        public void setTags(org.biocatalogue.x2009.xml.rest.ResourceLink tags)
        {
            generatedSetterHelperImpl(tags, TAGS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tags" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewTags()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(TAGS$8);
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
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$10, 0);
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
            generatedSetterHelperImpl(annotations, ANNOTATIONS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$10);
                return target;
            }
        }
        
        /**
         * Gets the "annotationAttributes" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONATTRIBUTES$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "annotationAttributes" element
         */
        public void setAnnotationAttributes(org.biocatalogue.x2009.xml.rest.ResourceLink annotationAttributes)
        {
            generatedSetterHelperImpl(annotationAttributes, ANNOTATIONATTRIBUTES$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "annotationAttributes" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationAttributes()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONATTRIBUTES$12);
                return target;
            }
        }
        
        /**
         * Gets the "serviceProviders" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getServiceProviders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICEPROVIDERS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "serviceProviders" element
         */
        public void setServiceProviders(org.biocatalogue.x2009.xml.rest.ResourceLink serviceProviders)
        {
            generatedSetterHelperImpl(serviceProviders, SERVICEPROVIDERS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "serviceProviders" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServiceProviders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICEPROVIDERS$14);
                return target;
            }
        }
        
        /**
         * Gets the "users" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getUsers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(USERS$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "users" element
         */
        public void setUsers(org.biocatalogue.x2009.xml.rest.ResourceLink users)
        {
            generatedSetterHelperImpl(users, USERS$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "users" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewUsers()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(USERS$16);
                return target;
            }
        }
        
        /**
         * Gets the "registries" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getRegistries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(REGISTRIES$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "registries" element
         */
        public void setRegistries(org.biocatalogue.x2009.xml.rest.ResourceLink registries)
        {
            generatedSetterHelperImpl(registries, REGISTRIES$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "registries" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewRegistries()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(REGISTRIES$18);
                return target;
            }
        }
        
        /**
         * Gets the "testResults" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getTestResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(TESTRESULTS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "testResults" element
         */
        public void setTestResults(org.biocatalogue.x2009.xml.rest.ResourceLink testResults)
        {
            generatedSetterHelperImpl(testResults, TESTRESULTS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "testResults" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewTestResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(TESTRESULTS$20);
                return target;
            }
        }
        
        /**
         * Gets the "filters" element
         */
        public org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters getFilters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters target = null;
                target = (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters)get_store().find_element_user(FILTERS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "filters" element
         */
        public void setFilters(org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters filters)
        {
            generatedSetterHelperImpl(filters, FILTERS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "filters" element
         */
        public org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters addNewFilters()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters target = null;
                target = (org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters)get_store().add_element_user(FILTERS$22);
                return target;
            }
        }
        /**
         * An XML filters(@http://www.biocatalogue.org/2009/xml/rest).
         *
         * This is a complex type.
         */
        public static class FiltersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.BioCatalogue.Collections.Filters
        {
            private static final long serialVersionUID = 1L;
            
            public FiltersImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SERVICES$0 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
            private static final javax.xml.namespace.QName SOAPOPERATIONS$2 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOperations");
            private static final javax.xml.namespace.QName ANNOTATIONS$4 = 
                new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
            
            
            /**
             * Gets the "services" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICES$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "services" element
             */
            public void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services)
            {
                generatedSetterHelperImpl(services, SERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "services" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICES$0);
                    return target;
                }
            }
            
            /**
             * Gets the "soapOperations" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink getSoapOperations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPOPERATIONS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "soapOperations" element
             */
            public void setSoapOperations(org.biocatalogue.x2009.xml.rest.ResourceLink soapOperations)
            {
                generatedSetterHelperImpl(soapOperations, SOAPOPERATIONS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "soapOperations" element
             */
            public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapOperations()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPOPERATIONS$2);
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
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$4, 0);
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
                generatedSetterHelperImpl(annotations, ANNOTATIONS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$4);
                    return target;
                }
            }
        }
    }
}
