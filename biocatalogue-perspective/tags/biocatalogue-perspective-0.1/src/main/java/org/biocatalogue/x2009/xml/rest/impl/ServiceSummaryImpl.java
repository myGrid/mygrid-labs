/*
 * XML Type:  ServiceSummary
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceSummary
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML ServiceSummary(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ServiceSummaryImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.ServiceSummary
{
    private static final long serialVersionUID = 1L;
    
    public ServiceSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COUNTS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "counts");
    private static final javax.xml.namespace.QName ALTERNATIVENAME$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "alternativeName");
    private static final javax.xml.namespace.QName CATEGORY$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "category");
    private static final javax.xml.namespace.QName PROVIDER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "provider");
    private static final javax.xml.namespace.QName ENDPOINT$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "endpoint");
    private static final javax.xml.namespace.QName WSDL$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "wsdl");
    private static final javax.xml.namespace.QName LOCATION$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "location");
    private static final javax.xml.namespace.QName DOCUMENTATIONURL$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "documentationUrl");
    private static final javax.xml.namespace.QName DESCRIPTION$16 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description");
    private static final org.apache.xmlbeans.QNameSet DESCRIPTION$17 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
    });
    private static final javax.xml.namespace.QName TAG$18 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tag");
    private static final javax.xml.namespace.QName COST$20 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "cost");
    private static final javax.xml.namespace.QName LICENSE$22 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "license");
    private static final javax.xml.namespace.QName USAGECONDITION$24 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "usageCondition");
    private static final javax.xml.namespace.QName CONTACT$26 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "contact");
    private static final javax.xml.namespace.QName PUBLICATION$28 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "publication");
    private static final javax.xml.namespace.QName CITATION$30 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "citation");
    
    
    /**
     * Gets the "counts" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts getCounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts)get_store().find_element_user(COUNTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "counts" element
     */
    public void setCounts(org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts counts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts)get_store().find_element_user(COUNTS$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts)get_store().add_element_user(COUNTS$0);
            }
            target.set(counts);
        }
    }
    
    /**
     * Appends and returns a new empty "counts" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts addNewCounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts)get_store().add_element_user(COUNTS$0);
            return target;
        }
    }
    
    /**
     * Gets a List of "alternativeName" elements
     */
    public java.util.List<java.lang.String> getAlternativeNameList()
    {
        final class AlternativeNameList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getAlternativeNameArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getAlternativeNameArray(i);
                ServiceSummaryImpl.this.setAlternativeNameArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertAlternativeName(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getAlternativeNameArray(i);
                ServiceSummaryImpl.this.removeAlternativeName(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfAlternativeNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlternativeNameList();
        }
    }
    
    /**
     * Gets array of all "alternativeName" elements
     * @deprecated
     */
    public java.lang.String[] getAlternativeNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ALTERNATIVENAME$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "alternativeName" element
     */
    public java.lang.String getAlternativeNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "alternativeName" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAlternativeNameList()
    {
        final class AlternativeNameList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetAlternativeNameArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetAlternativeNameArray(i);
                ServiceSummaryImpl.this.xsetAlternativeNameArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewAlternativeName(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetAlternativeNameArray(i);
                ServiceSummaryImpl.this.removeAlternativeName(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfAlternativeNameArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AlternativeNameList();
        }
    }
    
    /**
     * Gets array of all "alternativeName" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetAlternativeNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ALTERNATIVENAME$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "alternativeName" element
     */
    public org.apache.xmlbeans.XmlString xgetAlternativeNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "alternativeName" element
     */
    public int sizeOfAlternativeNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTERNATIVENAME$2);
        }
    }
    
    /**
     * Sets array of all "alternativeName" element
     */
    public void setAlternativeNameArray(java.lang.String[] alternativeNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alternativeNameArray, ALTERNATIVENAME$2);
        }
    }
    
    /**
     * Sets ith "alternativeName" element
     */
    public void setAlternativeNameArray(int i, java.lang.String alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALTERNATIVENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(alternativeName);
        }
    }
    
    /**
     * Sets (as xml) array of all "alternativeName" element
     */
    public void xsetAlternativeNameArray(org.apache.xmlbeans.XmlString[]alternativeNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(alternativeNameArray, ALTERNATIVENAME$2);
        }
    }
    
    /**
     * Sets (as xml) ith "alternativeName" element
     */
    public void xsetAlternativeNameArray(int i, org.apache.xmlbeans.XmlString alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALTERNATIVENAME$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(alternativeName);
        }
    }
    
    /**
     * Inserts the value as the ith "alternativeName" element
     */
    public void insertAlternativeName(int i, java.lang.String alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ALTERNATIVENAME$2, i);
            target.setStringValue(alternativeName);
        }
    }
    
    /**
     * Appends the value as the last "alternativeName" element
     */
    public void addAlternativeName(java.lang.String alternativeName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALTERNATIVENAME$2);
            target.setStringValue(alternativeName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
     */
    public org.apache.xmlbeans.XmlString insertNewAlternativeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ALTERNATIVENAME$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeName" element
     */
    public org.apache.xmlbeans.XmlString addNewAlternativeName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALTERNATIVENAME$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "alternativeName" element
     */
    public void removeAlternativeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTERNATIVENAME$2, i);
        }
    }
    
    /**
     * Gets a List of "category" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> getCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString>
        {
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString get(int i)
                { return ServiceSummaryImpl.this.getCategoryArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString set(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString o)
            {
                org.biocatalogue.x2009.xml.rest.ResourceLinkWithString old = ServiceSummaryImpl.this.getCategoryArray(i);
                ServiceSummaryImpl.this.setCategoryArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString o)
                { ServiceSummaryImpl.this.insertNewCategory(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.ResourceLinkWithString old = ServiceSummaryImpl.this.getCategoryArray(i);
                ServiceSummaryImpl.this.removeCategory(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets array of all "category" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString>();
            get_store().find_all_element_users(CATEGORY$4, targetList);
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] result = new org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().find_element_user(CATEGORY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$4);
        }
    }
    
    /**
     * Sets array of all "category" element
     */
    public void setCategoryArray(org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] categoryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(categoryArray, CATEGORY$4);
        }
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().find_element_user(CATEGORY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().insert_element_user(CATEGORY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().add_element_user(CATEGORY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$4, i);
        }
    }
    
    /**
     * Gets a List of "provider" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider> getProviderList()
    {
        final class ProviderList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider>
        {
            public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider get(int i)
                { return ServiceSummaryImpl.this.getProviderArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider set(int i, org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider o)
            {
                org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider old = ServiceSummaryImpl.this.getProviderArray(i);
                ServiceSummaryImpl.this.setProviderArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider o)
                { ServiceSummaryImpl.this.insertNewProvider(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider old = ServiceSummaryImpl.this.getProviderArray(i);
                ServiceSummaryImpl.this.removeProvider(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfProviderArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ProviderList();
        }
    }
    
    /**
     * Gets array of all "provider" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[] getProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider>();
            get_store().find_all_element_users(PROVIDER$6, targetList);
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[] result = new org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "provider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider getProviderArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider)get_store().find_element_user(PROVIDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "provider" element
     */
    public int sizeOfProviderArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVIDER$6);
        }
    }
    
    /**
     * Sets array of all "provider" element
     */
    public void setProviderArray(org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[] providerArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(providerArray, PROVIDER$6);
        }
    }
    
    /**
     * Sets ith "provider" element
     */
    public void setProviderArray(int i, org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider provider)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider)get_store().find_element_user(PROVIDER$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(provider);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "provider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider insertNewProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider)get_store().insert_element_user(PROVIDER$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "provider" element
     */
    public org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider addNewProvider()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider target = null;
            target = (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider)get_store().add_element_user(PROVIDER$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "provider" element
     */
    public void removeProvider(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVIDER$6, i);
        }
    }
    
    /**
     * Gets a List of "endpoint" elements
     */
    public java.util.List<java.lang.String> getEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getEndpointArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getEndpointArray(i);
                ServiceSummaryImpl.this.setEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertEndpoint(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getEndpointArray(i);
                ServiceSummaryImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfEndpointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointList();
        }
    }
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    public java.lang.String[] getEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlAnyURI> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlAnyURI>();
            get_store().find_all_element_users(ENDPOINT$8, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "endpoint" element
     */
    public java.lang.String getEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "endpoint" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetEndpointList()
    {
        final class EndpointList extends java.util.AbstractList<org.apache.xmlbeans.XmlAnyURI>
        {
            public org.apache.xmlbeans.XmlAnyURI get(int i)
                { return ServiceSummaryImpl.this.xgetEndpointArray(i); }
            
            public org.apache.xmlbeans.XmlAnyURI set(int i, org.apache.xmlbeans.XmlAnyURI o)
            {
                org.apache.xmlbeans.XmlAnyURI old = ServiceSummaryImpl.this.xgetEndpointArray(i);
                ServiceSummaryImpl.this.xsetEndpointArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlAnyURI o)
                { ServiceSummaryImpl.this.insertNewEndpoint(i).set(o); }
            
            public org.apache.xmlbeans.XmlAnyURI remove(int i)
            {
                org.apache.xmlbeans.XmlAnyURI old = ServiceSummaryImpl.this.xgetEndpointArray(i);
                ServiceSummaryImpl.this.removeEndpoint(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfEndpointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EndpointList();
        }
    }
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlAnyURI> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlAnyURI>();
            get_store().find_all_element_users(ENDPOINT$8, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "endpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetEndpointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlAnyURI)target;
        }
    }
    
    /**
     * Returns number of "endpoint" element
     */
    public int sizeOfEndpointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDPOINT$8);
        }
    }
    
    /**
     * Sets array of all "endpoint" element
     */
    public void setEndpointArray(java.lang.String[] endpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointArray, ENDPOINT$8);
        }
    }
    
    /**
     * Sets ith "endpoint" element
     */
    public void setEndpointArray(int i, java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Sets (as xml) array of all "endpoint" element
     */
    public void xsetEndpointArray(org.apache.xmlbeans.XmlAnyURI[]endpointArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(endpointArray, ENDPOINT$8);
        }
    }
    
    /**
     * Sets (as xml) ith "endpoint" element
     */
    public void xsetEndpointArray(int i, org.apache.xmlbeans.XmlAnyURI endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ENDPOINT$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(endpoint);
        }
    }
    
    /**
     * Inserts the value as the ith "endpoint" element
     */
    public void insertEndpoint(int i, java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ENDPOINT$8, i);
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Appends the value as the last "endpoint" element
     */
    public void addEndpoint(java.lang.String endpoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDPOINT$8);
            target.setStringValue(endpoint);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(ENDPOINT$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewEndpoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ENDPOINT$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "endpoint" element
     */
    public void removeEndpoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDPOINT$8, i);
        }
    }
    
    /**
     * Gets a List of "wsdl" elements
     */
    public java.util.List<java.lang.String> getWsdlList()
    {
        final class WsdlList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getWsdlArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getWsdlArray(i);
                ServiceSummaryImpl.this.setWsdlArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertWsdl(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getWsdlArray(i);
                ServiceSummaryImpl.this.removeWsdl(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfWsdlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WsdlList();
        }
    }
    
    /**
     * Gets array of all "wsdl" elements
     * @deprecated
     */
    public java.lang.String[] getWsdlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlAnyURI> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlAnyURI>();
            get_store().find_all_element_users(WSDL$10, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "wsdl" element
     */
    public java.lang.String getWsdlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "wsdl" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetWsdlList()
    {
        final class WsdlList extends java.util.AbstractList<org.apache.xmlbeans.XmlAnyURI>
        {
            public org.apache.xmlbeans.XmlAnyURI get(int i)
                { return ServiceSummaryImpl.this.xgetWsdlArray(i); }
            
            public org.apache.xmlbeans.XmlAnyURI set(int i, org.apache.xmlbeans.XmlAnyURI o)
            {
                org.apache.xmlbeans.XmlAnyURI old = ServiceSummaryImpl.this.xgetWsdlArray(i);
                ServiceSummaryImpl.this.xsetWsdlArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlAnyURI o)
                { ServiceSummaryImpl.this.insertNewWsdl(i).set(o); }
            
            public org.apache.xmlbeans.XmlAnyURI remove(int i)
            {
                org.apache.xmlbeans.XmlAnyURI old = ServiceSummaryImpl.this.xgetWsdlArray(i);
                ServiceSummaryImpl.this.removeWsdl(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfWsdlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new WsdlList();
        }
    }
    
    /**
     * Gets array of all "wsdl" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlAnyURI[] xgetWsdlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlAnyURI> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlAnyURI>();
            get_store().find_all_element_users(WSDL$10, targetList);
            org.apache.xmlbeans.XmlAnyURI[] result = new org.apache.xmlbeans.XmlAnyURI[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "wsdl" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetWsdlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlAnyURI)target;
        }
    }
    
    /**
     * Returns number of "wsdl" element
     */
    public int sizeOfWsdlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WSDL$10);
        }
    }
    
    /**
     * Sets array of all "wsdl" element
     */
    public void setWsdlArray(java.lang.String[] wsdlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wsdlArray, WSDL$10);
        }
    }
    
    /**
     * Sets ith "wsdl" element
     */
    public void setWsdlArray(int i, java.lang.String wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WSDL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(wsdl);
        }
    }
    
    /**
     * Sets (as xml) array of all "wsdl" element
     */
    public void xsetWsdlArray(org.apache.xmlbeans.XmlAnyURI[]wsdlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(wsdlArray, WSDL$10);
        }
    }
    
    /**
     * Sets (as xml) ith "wsdl" element
     */
    public void xsetWsdlArray(int i, org.apache.xmlbeans.XmlAnyURI wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(WSDL$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(wsdl);
        }
    }
    
    /**
     * Inserts the value as the ith "wsdl" element
     */
    public void insertWsdl(int i, java.lang.String wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(WSDL$10, i);
            target.setStringValue(wsdl);
        }
    }
    
    /**
     * Appends the value as the last "wsdl" element
     */
    public void addWsdl(java.lang.String wsdl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WSDL$10);
            target.setStringValue(wsdl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wsdl" element
     */
    public org.apache.xmlbeans.XmlAnyURI insertNewWsdl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().insert_element_user(WSDL$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wsdl" element
     */
    public org.apache.xmlbeans.XmlAnyURI addNewWsdl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(WSDL$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "wsdl" element
     */
    public void removeWsdl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WSDL$10, i);
        }
    }
    
    /**
     * Gets a List of "location" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.Location> getLocationList()
    {
        final class LocationList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.Location>
        {
            public org.biocatalogue.x2009.xml.rest.Location get(int i)
                { return ServiceSummaryImpl.this.getLocationArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.Location set(int i, org.biocatalogue.x2009.xml.rest.Location o)
            {
                org.biocatalogue.x2009.xml.rest.Location old = ServiceSummaryImpl.this.getLocationArray(i);
                ServiceSummaryImpl.this.setLocationArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.Location o)
                { ServiceSummaryImpl.this.insertNewLocation(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.Location remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.Location old = ServiceSummaryImpl.this.getLocationArray(i);
                ServiceSummaryImpl.this.removeLocation(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfLocationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LocationList();
        }
    }
    
    /**
     * Gets array of all "location" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.Location[] getLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.Location> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.Location>();
            get_store().find_all_element_users(LOCATION$12, targetList);
            org.biocatalogue.x2009.xml.rest.Location[] result = new org.biocatalogue.x2009.xml.rest.Location[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "location" element
     */
    public org.biocatalogue.x2009.xml.rest.Location getLocationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "location" element
     */
    public int sizeOfLocationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOCATION$12);
        }
    }
    
    /**
     * Sets array of all "location" element
     */
    public void setLocationArray(org.biocatalogue.x2009.xml.rest.Location[] locationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(locationArray, LOCATION$12);
        }
    }
    
    /**
     * Sets ith "location" element
     */
    public void setLocationArray(int i, org.biocatalogue.x2009.xml.rest.Location location)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(location);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    public org.biocatalogue.x2009.xml.rest.Location insertNewLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().insert_element_user(LOCATION$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    public org.biocatalogue.x2009.xml.rest.Location addNewLocation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Location target = null;
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().add_element_user(LOCATION$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "location" element
     */
    public void removeLocation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOCATION$12, i);
        }
    }
    
    /**
     * Gets a List of "documentationUrl" elements
     */
    public java.util.List<java.lang.String> getDocumentationUrlList()
    {
        final class DocumentationUrlList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getDocumentationUrlArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getDocumentationUrlArray(i);
                ServiceSummaryImpl.this.setDocumentationUrlArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertDocumentationUrl(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getDocumentationUrlArray(i);
                ServiceSummaryImpl.this.removeDocumentationUrl(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfDocumentationUrlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocumentationUrlList();
        }
    }
    
    /**
     * Gets array of all "documentationUrl" elements
     * @deprecated
     */
    public java.lang.String[] getDocumentationUrlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(DOCUMENTATIONURL$14, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "documentationUrl" element
     */
    public java.lang.String getDocumentationUrlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONURL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "documentationUrl" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetDocumentationUrlList()
    {
        final class DocumentationUrlList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetDocumentationUrlArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetDocumentationUrlArray(i);
                ServiceSummaryImpl.this.xsetDocumentationUrlArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewDocumentationUrl(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetDocumentationUrlArray(i);
                ServiceSummaryImpl.this.removeDocumentationUrl(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfDocumentationUrlArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DocumentationUrlList();
        }
    }
    
    /**
     * Gets array of all "documentationUrl" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetDocumentationUrlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(DOCUMENTATIONURL$14, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "documentationUrl" element
     */
    public org.apache.xmlbeans.XmlString xgetDocumentationUrlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONURL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "documentationUrl" element
     */
    public int sizeOfDocumentationUrlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATIONURL$14);
        }
    }
    
    /**
     * Sets array of all "documentationUrl" element
     */
    public void setDocumentationUrlArray(java.lang.String[] documentationUrlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentationUrlArray, DOCUMENTATIONURL$14);
        }
    }
    
    /**
     * Sets ith "documentationUrl" element
     */
    public void setDocumentationUrlArray(int i, java.lang.String documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOCUMENTATIONURL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(documentationUrl);
        }
    }
    
    /**
     * Sets (as xml) array of all "documentationUrl" element
     */
    public void xsetDocumentationUrlArray(org.apache.xmlbeans.XmlString[]documentationUrlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(documentationUrlArray, DOCUMENTATIONURL$14);
        }
    }
    
    /**
     * Sets (as xml) ith "documentationUrl" element
     */
    public void xsetDocumentationUrlArray(int i, org.apache.xmlbeans.XmlString documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DOCUMENTATIONURL$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(documentationUrl);
        }
    }
    
    /**
     * Inserts the value as the ith "documentationUrl" element
     */
    public void insertDocumentationUrl(int i, java.lang.String documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DOCUMENTATIONURL$14, i);
            target.setStringValue(documentationUrl);
        }
    }
    
    /**
     * Appends the value as the last "documentationUrl" element
     */
    public void addDocumentationUrl(java.lang.String documentationUrl)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOCUMENTATIONURL$14);
            target.setStringValue(documentationUrl);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationUrl" element
     */
    public org.apache.xmlbeans.XmlString insertNewDocumentationUrl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DOCUMENTATIONURL$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationUrl" element
     */
    public org.apache.xmlbeans.XmlString addNewDocumentationUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DOCUMENTATIONURL$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentationUrl" element
     */
    public void removeDocumentationUrl(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATIONURL$14, i);
        }
    }
    
    /**
     * Gets a List of "description" elements
     */
    public java.util.List<java.lang.String> getDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getDescriptionArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getDescriptionArray(i);
                ServiceSummaryImpl.this.setDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertDescription(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getDescriptionArray(i);
                ServiceSummaryImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public java.lang.String[] getDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(DESCRIPTION$17, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "description" element
     */
    public java.lang.String getDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$17, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "description" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetDescriptionList()
    {
        final class DescriptionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetDescriptionArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetDescriptionArray(i);
                ServiceSummaryImpl.this.xsetDescriptionArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewDescription(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetDescriptionArray(i);
                ServiceSummaryImpl.this.removeDescription(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfDescriptionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DescriptionList();
        }
    }
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(DESCRIPTION$17, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescriptionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$17, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "description" element
     */
    public int sizeOfDescriptionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$17);
        }
    }
    
    /**
     * Sets array of all "description" element
     */
    public void setDescriptionArray(java.lang.String[] descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$16, DESCRIPTION$17);
        }
    }
    
    /**
     * Sets ith "description" element
     */
    public void setDescriptionArray(int i, java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$17, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) array of all "description" element
     */
    public void xsetDescriptionArray(org.apache.xmlbeans.XmlString[]descriptionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(descriptionArray, DESCRIPTION$16);
        }
    }
    
    /**
     * Sets (as xml) ith "description" element
     */
    public void xsetDescriptionArray(int i, org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$17, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(description);
        }
    }
    
    /**
     * Inserts the value as the ith "description" element
     */
    public void insertDescription(int i, java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DESCRIPTION$17, DESCRIPTION$16, i);
            target.setStringValue(description);
        }
    }
    
    /**
     * Appends the value as the last "description" element
     */
    public void addDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$16);
            target.setStringValue(description);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    public org.apache.xmlbeans.XmlString insertNewDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DESCRIPTION$17, DESCRIPTION$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    public org.apache.xmlbeans.XmlString addNewDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "description" element
     */
    public void removeDescription(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$17, i);
        }
    }
    
    /**
     * Gets a List of "tag" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> getTagList()
    {
        final class TagList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString>
        {
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString get(int i)
                { return ServiceSummaryImpl.this.getTagArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString set(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString o)
            {
                org.biocatalogue.x2009.xml.rest.ResourceLinkWithString old = ServiceSummaryImpl.this.getTagArray(i);
                ServiceSummaryImpl.this.setTagArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString o)
                { ServiceSummaryImpl.this.insertNewTag(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.ResourceLinkWithString old = ServiceSummaryImpl.this.getTagArray(i);
                ServiceSummaryImpl.this.removeTag(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfTagArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new TagList();
        }
    }
    
    /**
     * Gets array of all "tag" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] getTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString>();
            get_store().find_all_element_users(TAG$18, targetList);
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] result = new org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString getTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().find_element_user(TAG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tag" element
     */
    public int sizeOfTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAG$18);
        }
    }
    
    /**
     * Sets array of all "tag" element
     */
    public void setTagArray(org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] tagArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tagArray, TAG$18);
        }
    }
    
    /**
     * Sets ith "tag" element
     */
    public void setTagArray(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().find_element_user(TAG$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString insertNewTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().insert_element_user(TAG$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLinkWithString addNewTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLinkWithString target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLinkWithString)get_store().add_element_user(TAG$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "tag" element
     */
    public void removeTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAG$18, i);
        }
    }
    
    /**
     * Gets a List of "cost" elements
     */
    public java.util.List<java.lang.String> getCostList()
    {
        final class CostList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getCostArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getCostArray(i);
                ServiceSummaryImpl.this.setCostArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertCost(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getCostArray(i);
                ServiceSummaryImpl.this.removeCost(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfCostArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CostList();
        }
    }
    
    /**
     * Gets array of all "cost" elements
     * @deprecated
     */
    public java.lang.String[] getCostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(COST$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "cost" element
     */
    public java.lang.String getCostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "cost" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetCostList()
    {
        final class CostList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetCostArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetCostArray(i);
                ServiceSummaryImpl.this.xsetCostArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewCost(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetCostArray(i);
                ServiceSummaryImpl.this.removeCost(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfCostArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CostList();
        }
    }
    
    /**
     * Gets array of all "cost" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetCostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(COST$20, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "cost" element
     */
    public org.apache.xmlbeans.XmlString xgetCostArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "cost" element
     */
    public int sizeOfCostArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COST$20);
        }
    }
    
    /**
     * Sets array of all "cost" element
     */
    public void setCostArray(java.lang.String[] costArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(costArray, COST$20);
        }
    }
    
    /**
     * Sets ith "cost" element
     */
    public void setCostArray(int i, java.lang.String cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(cost);
        }
    }
    
    /**
     * Sets (as xml) array of all "cost" element
     */
    public void xsetCostArray(org.apache.xmlbeans.XmlString[]costArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(costArray, COST$20);
        }
    }
    
    /**
     * Sets (as xml) ith "cost" element
     */
    public void xsetCostArray(int i, org.apache.xmlbeans.XmlString cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COST$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(cost);
        }
    }
    
    /**
     * Inserts the value as the ith "cost" element
     */
    public void insertCost(int i, java.lang.String cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COST$20, i);
            target.setStringValue(cost);
        }
    }
    
    /**
     * Appends the value as the last "cost" element
     */
    public void addCost(java.lang.String cost)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COST$20);
            target.setStringValue(cost);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cost" element
     */
    public org.apache.xmlbeans.XmlString insertNewCost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COST$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cost" element
     */
    public org.apache.xmlbeans.XmlString addNewCost()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COST$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "cost" element
     */
    public void removeCost(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COST$20, i);
        }
    }
    
    /**
     * Gets a List of "license" elements
     */
    public java.util.List<java.lang.String> getLicenseList()
    {
        final class LicenseList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getLicenseArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getLicenseArray(i);
                ServiceSummaryImpl.this.setLicenseArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertLicense(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getLicenseArray(i);
                ServiceSummaryImpl.this.removeLicense(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfLicenseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LicenseList();
        }
    }
    
    /**
     * Gets array of all "license" elements
     * @deprecated
     */
    public java.lang.String[] getLicenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(LICENSE$22, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "license" element
     */
    public java.lang.String getLicenseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "license" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetLicenseList()
    {
        final class LicenseList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetLicenseArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetLicenseArray(i);
                ServiceSummaryImpl.this.xsetLicenseArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewLicense(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetLicenseArray(i);
                ServiceSummaryImpl.this.removeLicense(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfLicenseArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new LicenseList();
        }
    }
    
    /**
     * Gets array of all "license" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetLicenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(LICENSE$22, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "license" element
     */
    public org.apache.xmlbeans.XmlString xgetLicenseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "license" element
     */
    public int sizeOfLicenseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LICENSE$22);
        }
    }
    
    /**
     * Sets array of all "license" element
     */
    public void setLicenseArray(java.lang.String[] licenseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(licenseArray, LICENSE$22);
        }
    }
    
    /**
     * Sets ith "license" element
     */
    public void setLicenseArray(int i, java.lang.String license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LICENSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(license);
        }
    }
    
    /**
     * Sets (as xml) array of all "license" element
     */
    public void xsetLicenseArray(org.apache.xmlbeans.XmlString[]licenseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(licenseArray, LICENSE$22);
        }
    }
    
    /**
     * Sets (as xml) ith "license" element
     */
    public void xsetLicenseArray(int i, org.apache.xmlbeans.XmlString license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(LICENSE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(license);
        }
    }
    
    /**
     * Inserts the value as the ith "license" element
     */
    public void insertLicense(int i, java.lang.String license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(LICENSE$22, i);
            target.setStringValue(license);
        }
    }
    
    /**
     * Appends the value as the last "license" element
     */
    public void addLicense(java.lang.String license)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LICENSE$22);
            target.setStringValue(license);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "license" element
     */
    public org.apache.xmlbeans.XmlString insertNewLicense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(LICENSE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "license" element
     */
    public org.apache.xmlbeans.XmlString addNewLicense()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(LICENSE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "license" element
     */
    public void removeLicense(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LICENSE$22, i);
        }
    }
    
    /**
     * Gets a List of "usageCondition" elements
     */
    public java.util.List<java.lang.String> getUsageConditionList()
    {
        final class UsageConditionList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getUsageConditionArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getUsageConditionArray(i);
                ServiceSummaryImpl.this.setUsageConditionArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertUsageCondition(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getUsageConditionArray(i);
                ServiceSummaryImpl.this.removeUsageCondition(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfUsageConditionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsageConditionList();
        }
    }
    
    /**
     * Gets array of all "usageCondition" elements
     * @deprecated
     */
    public java.lang.String[] getUsageConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(USAGECONDITION$24, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "usageCondition" element
     */
    public java.lang.String getUsageConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USAGECONDITION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "usageCondition" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetUsageConditionList()
    {
        final class UsageConditionList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetUsageConditionArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetUsageConditionArray(i);
                ServiceSummaryImpl.this.xsetUsageConditionArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewUsageCondition(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetUsageConditionArray(i);
                ServiceSummaryImpl.this.removeUsageCondition(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfUsageConditionArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsageConditionList();
        }
    }
    
    /**
     * Gets array of all "usageCondition" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetUsageConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(USAGECONDITION$24, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "usageCondition" element
     */
    public org.apache.xmlbeans.XmlString xgetUsageConditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USAGECONDITION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "usageCondition" element
     */
    public int sizeOfUsageConditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USAGECONDITION$24);
        }
    }
    
    /**
     * Sets array of all "usageCondition" element
     */
    public void setUsageConditionArray(java.lang.String[] usageConditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usageConditionArray, USAGECONDITION$24);
        }
    }
    
    /**
     * Sets ith "usageCondition" element
     */
    public void setUsageConditionArray(int i, java.lang.String usageCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USAGECONDITION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(usageCondition);
        }
    }
    
    /**
     * Sets (as xml) array of all "usageCondition" element
     */
    public void xsetUsageConditionArray(org.apache.xmlbeans.XmlString[]usageConditionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(usageConditionArray, USAGECONDITION$24);
        }
    }
    
    /**
     * Sets (as xml) ith "usageCondition" element
     */
    public void xsetUsageConditionArray(int i, org.apache.xmlbeans.XmlString usageCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USAGECONDITION$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(usageCondition);
        }
    }
    
    /**
     * Inserts the value as the ith "usageCondition" element
     */
    public void insertUsageCondition(int i, java.lang.String usageCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(USAGECONDITION$24, i);
            target.setStringValue(usageCondition);
        }
    }
    
    /**
     * Appends the value as the last "usageCondition" element
     */
    public void addUsageCondition(java.lang.String usageCondition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USAGECONDITION$24);
            target.setStringValue(usageCondition);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usageCondition" element
     */
    public org.apache.xmlbeans.XmlString insertNewUsageCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(USAGECONDITION$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usageCondition" element
     */
    public org.apache.xmlbeans.XmlString addNewUsageCondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USAGECONDITION$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "usageCondition" element
     */
    public void removeUsageCondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USAGECONDITION$24, i);
        }
    }
    
    /**
     * Gets a List of "contact" elements
     */
    public java.util.List<java.lang.String> getContactList()
    {
        final class ContactList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getContactArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getContactArray(i);
                ServiceSummaryImpl.this.setContactArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertContact(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getContactArray(i);
                ServiceSummaryImpl.this.removeContact(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfContactArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContactList();
        }
    }
    
    /**
     * Gets array of all "contact" elements
     * @deprecated
     */
    public java.lang.String[] getContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CONTACT$26, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "contact" element
     */
    public java.lang.String getContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "contact" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetContactList()
    {
        final class ContactList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetContactArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetContactArray(i);
                ServiceSummaryImpl.this.xsetContactArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewContact(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetContactArray(i);
                ServiceSummaryImpl.this.removeContact(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfContactArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContactList();
        }
    }
    
    /**
     * Gets array of all "contact" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CONTACT$26, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "contact" element
     */
    public org.apache.xmlbeans.XmlString xgetContactArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "contact" element
     */
    public int sizeOfContactArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTACT$26);
        }
    }
    
    /**
     * Sets array of all "contact" element
     */
    public void setContactArray(java.lang.String[] contactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactArray, CONTACT$26);
        }
    }
    
    /**
     * Sets ith "contact" element
     */
    public void setContactArray(int i, java.lang.String contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTACT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(contact);
        }
    }
    
    /**
     * Sets (as xml) array of all "contact" element
     */
    public void xsetContactArray(org.apache.xmlbeans.XmlString[]contactArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contactArray, CONTACT$26);
        }
    }
    
    /**
     * Sets (as xml) ith "contact" element
     */
    public void xsetContactArray(int i, org.apache.xmlbeans.XmlString contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTACT$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contact);
        }
    }
    
    /**
     * Inserts the value as the ith "contact" element
     */
    public void insertContact(int i, java.lang.String contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONTACT$26, i);
            target.setStringValue(contact);
        }
    }
    
    /**
     * Appends the value as the last "contact" element
     */
    public void addContact(java.lang.String contact)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTACT$26);
            target.setStringValue(contact);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    public org.apache.xmlbeans.XmlString insertNewContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONTACT$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    public org.apache.xmlbeans.XmlString addNewContact()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTACT$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "contact" element
     */
    public void removeContact(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTACT$26, i);
        }
    }
    
    /**
     * Gets a List of "publication" elements
     */
    public java.util.List<java.lang.String> getPublicationList()
    {
        final class PublicationList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getPublicationArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getPublicationArray(i);
                ServiceSummaryImpl.this.setPublicationArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertPublication(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getPublicationArray(i);
                ServiceSummaryImpl.this.removePublication(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfPublicationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PublicationList();
        }
    }
    
    /**
     * Gets array of all "publication" elements
     * @deprecated
     */
    public java.lang.String[] getPublicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PUBLICATION$28, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "publication" element
     */
    public java.lang.String getPublicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "publication" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetPublicationList()
    {
        final class PublicationList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetPublicationArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetPublicationArray(i);
                ServiceSummaryImpl.this.xsetPublicationArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewPublication(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetPublicationArray(i);
                ServiceSummaryImpl.this.removePublication(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfPublicationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PublicationList();
        }
    }
    
    /**
     * Gets array of all "publication" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetPublicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(PUBLICATION$28, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "publication" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "publication" element
     */
    public int sizeOfPublicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATION$28);
        }
    }
    
    /**
     * Sets array of all "publication" element
     */
    public void setPublicationArray(java.lang.String[] publicationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publicationArray, PUBLICATION$28);
        }
    }
    
    /**
     * Sets ith "publication" element
     */
    public void setPublicationArray(int i, java.lang.String publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(publication);
        }
    }
    
    /**
     * Sets (as xml) array of all "publication" element
     */
    public void xsetPublicationArray(org.apache.xmlbeans.XmlString[]publicationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(publicationArray, PUBLICATION$28);
        }
    }
    
    /**
     * Sets (as xml) ith "publication" element
     */
    public void xsetPublicationArray(int i, org.apache.xmlbeans.XmlString publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publication);
        }
    }
    
    /**
     * Inserts the value as the ith "publication" element
     */
    public void insertPublication(int i, java.lang.String publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PUBLICATION$28, i);
            target.setStringValue(publication);
        }
    }
    
    /**
     * Appends the value as the last "publication" element
     */
    public void addPublication(java.lang.String publication)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATION$28);
            target.setStringValue(publication);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "publication" element
     */
    public org.apache.xmlbeans.XmlString insertNewPublication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PUBLICATION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "publication" element
     */
    public org.apache.xmlbeans.XmlString addNewPublication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICATION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "publication" element
     */
    public void removePublication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATION$28, i);
        }
    }
    
    /**
     * Gets a List of "citation" elements
     */
    public java.util.List<java.lang.String> getCitationList()
    {
        final class CitationList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ServiceSummaryImpl.this.getCitationArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ServiceSummaryImpl.this.getCitationArray(i);
                ServiceSummaryImpl.this.setCitationArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ServiceSummaryImpl.this.insertCitation(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ServiceSummaryImpl.this.getCitationArray(i);
                ServiceSummaryImpl.this.removeCitation(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfCitationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CitationList();
        }
    }
    
    /**
     * Gets array of all "citation" elements
     * @deprecated
     */
    public java.lang.String[] getCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CITATION$30, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "citation" element
     */
    public java.lang.String getCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITATION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "citation" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetCitationList()
    {
        final class CitationList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ServiceSummaryImpl.this.xgetCitationArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetCitationArray(i);
                ServiceSummaryImpl.this.xsetCitationArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ServiceSummaryImpl.this.insertNewCitation(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ServiceSummaryImpl.this.xgetCitationArray(i);
                ServiceSummaryImpl.this.removeCitation(i);
                return old;
            }
            
            public int size()
                { return ServiceSummaryImpl.this.sizeOfCitationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CitationList();
        }
    }
    
    /**
     * Gets array of all "citation" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CITATION$30, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "citation" element
     */
    public org.apache.xmlbeans.XmlString xgetCitationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITATION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return (org.apache.xmlbeans.XmlString)target;
        }
    }
    
    /**
     * Returns number of "citation" element
     */
    public int sizeOfCitationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITATION$30);
        }
    }
    
    /**
     * Sets array of all "citation" element
     */
    public void setCitationArray(java.lang.String[] citationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(citationArray, CITATION$30);
        }
    }
    
    /**
     * Sets ith "citation" element
     */
    public void setCitationArray(int i, java.lang.String citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITATION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(citation);
        }
    }
    
    /**
     * Sets (as xml) array of all "citation" element
     */
    public void xsetCitationArray(org.apache.xmlbeans.XmlString[]citationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(citationArray, CITATION$30);
        }
    }
    
    /**
     * Sets (as xml) ith "citation" element
     */
    public void xsetCitationArray(int i, org.apache.xmlbeans.XmlString citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITATION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(citation);
        }
    }
    
    /**
     * Inserts the value as the ith "citation" element
     */
    public void insertCitation(int i, java.lang.String citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CITATION$30, i);
            target.setStringValue(citation);
        }
    }
    
    /**
     * Appends the value as the last "citation" element
     */
    public void addCitation(java.lang.String citation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITATION$30);
            target.setStringValue(citation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    public org.apache.xmlbeans.XmlString insertNewCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CITATION$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
     */
    public org.apache.xmlbeans.XmlString addNewCitation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITATION$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "citation" element
     */
    public void removeCitation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITATION$30, i);
        }
    }
    /**
     * An XML counts(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class CountsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts
    {
        private static final long serialVersionUID = 1L;
        
        public CountsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DEPLOYMENTS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "deployments");
        private static final javax.xml.namespace.QName VARIANTS$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "variants");
        private static final javax.xml.namespace.QName METADATA$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "metadata");
        
        
        /**
         * Gets the "deployments" element
         */
        public java.math.BigInteger getDeployments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "deployments" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetDeployments()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(DEPLOYMENTS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "deployments" element
         */
        public void setDeployments(java.math.BigInteger deployments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEPLOYMENTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEPLOYMENTS$0);
                }
                target.setBigIntegerValue(deployments);
            }
        }
        
        /**
         * Sets (as xml) the "deployments" element
         */
        public void xsetDeployments(org.apache.xmlbeans.XmlPositiveInteger deployments)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(DEPLOYMENTS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(DEPLOYMENTS$0);
                }
                target.set(deployments);
            }
        }
        
        /**
         * Gets the "variants" element
         */
        public java.math.BigInteger getVariants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "variants" element
         */
        public org.apache.xmlbeans.XmlPositiveInteger xgetVariants()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(VARIANTS$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "variants" element
         */
        public void setVariants(java.math.BigInteger variants)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VARIANTS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VARIANTS$2);
                }
                target.setBigIntegerValue(variants);
            }
        }
        
        /**
         * Sets (as xml) the "variants" element
         */
        public void xsetVariants(org.apache.xmlbeans.XmlPositiveInteger variants)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlPositiveInteger target = null;
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(VARIANTS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(VARIANTS$2);
                }
                target.set(variants);
            }
        }
        
        /**
         * Gets a List of "metadata" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.MetadataCount> getMetadataList()
        {
            final class MetadataList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.MetadataCount>
            {
                public org.biocatalogue.x2009.xml.rest.MetadataCount get(int i)
                    { return CountsImpl.this.getMetadataArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.MetadataCount set(int i, org.biocatalogue.x2009.xml.rest.MetadataCount o)
                {
                    org.biocatalogue.x2009.xml.rest.MetadataCount old = CountsImpl.this.getMetadataArray(i);
                    CountsImpl.this.setMetadataArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.MetadataCount o)
                    { CountsImpl.this.insertNewMetadata(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.MetadataCount remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.MetadataCount old = CountsImpl.this.getMetadataArray(i);
                    CountsImpl.this.removeMetadata(i);
                    return old;
                }
                
                public int size()
                    { return CountsImpl.this.sizeOfMetadataArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new MetadataList();
            }
        }
        
        /**
         * Gets array of all "metadata" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.MetadataCount[] getMetadataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.MetadataCount> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.MetadataCount>();
                get_store().find_all_element_users(METADATA$4, targetList);
                org.biocatalogue.x2009.xml.rest.MetadataCount[] result = new org.biocatalogue.x2009.xml.rest.MetadataCount[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "metadata" element
         */
        public org.biocatalogue.x2009.xml.rest.MetadataCount getMetadataArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.MetadataCount target = null;
                target = (org.biocatalogue.x2009.xml.rest.MetadataCount)get_store().find_element_user(METADATA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "metadata" element
         */
        public int sizeOfMetadataArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METADATA$4);
            }
        }
        
        /**
         * Sets array of all "metadata" element
         */
        public void setMetadataArray(org.biocatalogue.x2009.xml.rest.MetadataCount[] metadataArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(metadataArray, METADATA$4);
            }
        }
        
        /**
         * Sets ith "metadata" element
         */
        public void setMetadataArray(int i, org.biocatalogue.x2009.xml.rest.MetadataCount metadata)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.MetadataCount target = null;
                target = (org.biocatalogue.x2009.xml.rest.MetadataCount)get_store().find_element_user(METADATA$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(metadata);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "metadata" element
         */
        public org.biocatalogue.x2009.xml.rest.MetadataCount insertNewMetadata(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.MetadataCount target = null;
                target = (org.biocatalogue.x2009.xml.rest.MetadataCount)get_store().insert_element_user(METADATA$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "metadata" element
         */
        public org.biocatalogue.x2009.xml.rest.MetadataCount addNewMetadata()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.MetadataCount target = null;
                target = (org.biocatalogue.x2009.xml.rest.MetadataCount)get_store().add_element_user(METADATA$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "metadata" element
         */
        public void removeMetadata(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METADATA$4, i);
            }
        }
    }
    /**
     * An XML provider(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class ProviderImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider
    {
        private static final long serialVersionUID = 1L;
        
        public ProviderImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NAME$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "name");
        
        
        /**
         * Gets the "name" element
         */
        public java.lang.String getName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                }
                target.set(name);
            }
        }
    }
}
