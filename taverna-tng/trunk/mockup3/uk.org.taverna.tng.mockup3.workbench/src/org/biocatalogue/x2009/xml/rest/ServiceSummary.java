/*
 * XML Type:  ServiceSummary
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.ServiceSummary
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest;


/**
 * An XML ServiceSummary(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public interface ServiceSummary extends org.biocatalogue.x2009.xml.rest.ResourceLink
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceSummary.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("servicesummary14dftype");
    
    /**
     * Gets the "counts" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts getCounts();
    
    /**
     * Sets the "counts" element
     */
    void setCounts(org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts counts);
    
    /**
     * Appends and returns a new empty "counts" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts addNewCounts();
    
    /**
     * Gets a List of "alternativeName" elements
     */
    java.util.List<java.lang.String> getAlternativeNameList();
    
    /**
     * Gets array of all "alternativeName" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getAlternativeNameArray();
    
    /**
     * Gets ith "alternativeName" element
     */
    java.lang.String getAlternativeNameArray(int i);
    
    /**
     * Gets (as xml) a List of "alternativeName" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetAlternativeNameList();
    
    /**
     * Gets (as xml) array of all "alternativeName" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetAlternativeNameArray();
    
    /**
     * Gets (as xml) ith "alternativeName" element
     */
    org.apache.xmlbeans.XmlString xgetAlternativeNameArray(int i);
    
    /**
     * Returns number of "alternativeName" element
     */
    int sizeOfAlternativeNameArray();
    
    /**
     * Sets array of all "alternativeName" element
     */
    void setAlternativeNameArray(java.lang.String[] alternativeNameArray);
    
    /**
     * Sets ith "alternativeName" element
     */
    void setAlternativeNameArray(int i, java.lang.String alternativeName);
    
    /**
     * Sets (as xml) array of all "alternativeName" element
     */
    void xsetAlternativeNameArray(org.apache.xmlbeans.XmlString[] alternativeNameArray);
    
    /**
     * Sets (as xml) ith "alternativeName" element
     */
    void xsetAlternativeNameArray(int i, org.apache.xmlbeans.XmlString alternativeName);
    
    /**
     * Inserts the value as the ith "alternativeName" element
     */
    void insertAlternativeName(int i, java.lang.String alternativeName);
    
    /**
     * Appends the value as the last "alternativeName" element
     */
    void addAlternativeName(java.lang.String alternativeName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "alternativeName" element
     */
    org.apache.xmlbeans.XmlString insertNewAlternativeName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "alternativeName" element
     */
    org.apache.xmlbeans.XmlString addNewAlternativeName();
    
    /**
     * Removes the ith "alternativeName" element
     */
    void removeAlternativeName(int i);
    
    /**
     * Gets a List of "category" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> getCategoryList();
    
    /**
     * Gets array of all "category" elements
     * @deprecated
     */
    @Deprecated
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] getCategoryArray();
    
    /**
     * Gets ith "category" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString getCategoryArray(int i);
    
    /**
     * Returns number of "category" element
     */
    int sizeOfCategoryArray();
    
    /**
     * Sets array of all "category" element
     */
    void setCategoryArray(org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] categoryArray);
    
    /**
     * Sets ith "category" element
     */
    void setCategoryArray(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString category);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString insertNewCategory(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString addNewCategory();
    
    /**
     * Removes the ith "category" element
     */
    void removeCategory(int i);
    
    /**
     * Gets a List of "provider" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider> getProviderList();
    
    /**
     * Gets array of all "provider" elements
     * @deprecated
     */
    @Deprecated
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[] getProviderArray();
    
    /**
     * Gets ith "provider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider getProviderArray(int i);
    
    /**
     * Returns number of "provider" element
     */
    int sizeOfProviderArray();
    
    /**
     * Sets array of all "provider" element
     */
    void setProviderArray(org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider[] providerArray);
    
    /**
     * Sets ith "provider" element
     */
    void setProviderArray(int i, org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider provider);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "provider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider insertNewProvider(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "provider" element
     */
    org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider addNewProvider();
    
    /**
     * Removes the ith "provider" element
     */
    void removeProvider(int i);
    
    /**
     * Gets a List of "endpoint" elements
     */
    java.util.List<java.lang.String> getEndpointList();
    
    /**
     * Gets array of all "endpoint" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getEndpointArray();
    
    /**
     * Gets ith "endpoint" element
     */
    java.lang.String getEndpointArray(int i);
    
    /**
     * Gets (as xml) a List of "endpoint" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetEndpointList();
    
    /**
     * Gets (as xml) array of all "endpoint" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlAnyURI[] xgetEndpointArray();
    
    /**
     * Gets (as xml) ith "endpoint" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetEndpointArray(int i);
    
    /**
     * Returns number of "endpoint" element
     */
    int sizeOfEndpointArray();
    
    /**
     * Sets array of all "endpoint" element
     */
    void setEndpointArray(java.lang.String[] endpointArray);
    
    /**
     * Sets ith "endpoint" element
     */
    void setEndpointArray(int i, java.lang.String endpoint);
    
    /**
     * Sets (as xml) array of all "endpoint" element
     */
    void xsetEndpointArray(org.apache.xmlbeans.XmlAnyURI[] endpointArray);
    
    /**
     * Sets (as xml) ith "endpoint" element
     */
    void xsetEndpointArray(int i, org.apache.xmlbeans.XmlAnyURI endpoint);
    
    /**
     * Inserts the value as the ith "endpoint" element
     */
    void insertEndpoint(int i, java.lang.String endpoint);
    
    /**
     * Appends the value as the last "endpoint" element
     */
    void addEndpoint(java.lang.String endpoint);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "endpoint" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewEndpoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "endpoint" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewEndpoint();
    
    /**
     * Removes the ith "endpoint" element
     */
    void removeEndpoint(int i);
    
    /**
     * Gets a List of "wsdl" elements
     */
    java.util.List<java.lang.String> getWsdlList();
    
    /**
     * Gets array of all "wsdl" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getWsdlArray();
    
    /**
     * Gets ith "wsdl" element
     */
    java.lang.String getWsdlArray(int i);
    
    /**
     * Gets (as xml) a List of "wsdl" elements
     */
    java.util.List<org.apache.xmlbeans.XmlAnyURI> xgetWsdlList();
    
    /**
     * Gets (as xml) array of all "wsdl" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlAnyURI[] xgetWsdlArray();
    
    /**
     * Gets (as xml) ith "wsdl" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetWsdlArray(int i);
    
    /**
     * Returns number of "wsdl" element
     */
    int sizeOfWsdlArray();
    
    /**
     * Sets array of all "wsdl" element
     */
    void setWsdlArray(java.lang.String[] wsdlArray);
    
    /**
     * Sets ith "wsdl" element
     */
    void setWsdlArray(int i, java.lang.String wsdl);
    
    /**
     * Sets (as xml) array of all "wsdl" element
     */
    void xsetWsdlArray(org.apache.xmlbeans.XmlAnyURI[] wsdlArray);
    
    /**
     * Sets (as xml) ith "wsdl" element
     */
    void xsetWsdlArray(int i, org.apache.xmlbeans.XmlAnyURI wsdl);
    
    /**
     * Inserts the value as the ith "wsdl" element
     */
    void insertWsdl(int i, java.lang.String wsdl);
    
    /**
     * Appends the value as the last "wsdl" element
     */
    void addWsdl(java.lang.String wsdl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "wsdl" element
     */
    org.apache.xmlbeans.XmlAnyURI insertNewWsdl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "wsdl" element
     */
    org.apache.xmlbeans.XmlAnyURI addNewWsdl();
    
    /**
     * Removes the ith "wsdl" element
     */
    void removeWsdl(int i);
    
    /**
     * Gets a List of "location" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.Location> getLocationList();
    
    /**
     * Gets array of all "location" elements
     * @deprecated
     */
    @Deprecated
    org.biocatalogue.x2009.xml.rest.Location[] getLocationArray();
    
    /**
     * Gets ith "location" element
     */
    org.biocatalogue.x2009.xml.rest.Location getLocationArray(int i);
    
    /**
     * Returns number of "location" element
     */
    int sizeOfLocationArray();
    
    /**
     * Sets array of all "location" element
     */
    void setLocationArray(org.biocatalogue.x2009.xml.rest.Location[] locationArray);
    
    /**
     * Sets ith "location" element
     */
    void setLocationArray(int i, org.biocatalogue.x2009.xml.rest.Location location);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "location" element
     */
    org.biocatalogue.x2009.xml.rest.Location insertNewLocation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "location" element
     */
    org.biocatalogue.x2009.xml.rest.Location addNewLocation();
    
    /**
     * Removes the ith "location" element
     */
    void removeLocation(int i);
    
    /**
     * Gets a List of "documentationUrl" elements
     */
    java.util.List<java.lang.String> getDocumentationUrlList();
    
    /**
     * Gets array of all "documentationUrl" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getDocumentationUrlArray();
    
    /**
     * Gets ith "documentationUrl" element
     */
    java.lang.String getDocumentationUrlArray(int i);
    
    /**
     * Gets (as xml) a List of "documentationUrl" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetDocumentationUrlList();
    
    /**
     * Gets (as xml) array of all "documentationUrl" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetDocumentationUrlArray();
    
    /**
     * Gets (as xml) ith "documentationUrl" element
     */
    org.apache.xmlbeans.XmlString xgetDocumentationUrlArray(int i);
    
    /**
     * Returns number of "documentationUrl" element
     */
    int sizeOfDocumentationUrlArray();
    
    /**
     * Sets array of all "documentationUrl" element
     */
    void setDocumentationUrlArray(java.lang.String[] documentationUrlArray);
    
    /**
     * Sets ith "documentationUrl" element
     */
    void setDocumentationUrlArray(int i, java.lang.String documentationUrl);
    
    /**
     * Sets (as xml) array of all "documentationUrl" element
     */
    void xsetDocumentationUrlArray(org.apache.xmlbeans.XmlString[] documentationUrlArray);
    
    /**
     * Sets (as xml) ith "documentationUrl" element
     */
    void xsetDocumentationUrlArray(int i, org.apache.xmlbeans.XmlString documentationUrl);
    
    /**
     * Inserts the value as the ith "documentationUrl" element
     */
    void insertDocumentationUrl(int i, java.lang.String documentationUrl);
    
    /**
     * Appends the value as the last "documentationUrl" element
     */
    void addDocumentationUrl(java.lang.String documentationUrl);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationUrl" element
     */
    org.apache.xmlbeans.XmlString insertNewDocumentationUrl(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationUrl" element
     */
    org.apache.xmlbeans.XmlString addNewDocumentationUrl();
    
    /**
     * Removes the ith "documentationUrl" element
     */
    void removeDocumentationUrl(int i);
    
    /**
     * Gets a List of "description" elements
     */
    java.util.List<java.lang.String> getDescriptionList();
    
    /**
     * Gets array of all "description" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    java.lang.String getDescriptionArray(int i);
    
    /**
     * Gets (as xml) a List of "description" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetDescriptionList();
    
    /**
     * Gets (as xml) array of all "description" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetDescriptionArray();
    
    /**
     * Gets (as xml) ith "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(java.lang.String[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, java.lang.String description);
    
    /**
     * Sets (as xml) array of all "description" element
     */
    void xsetDescriptionArray(org.apache.xmlbeans.XmlString[] descriptionArray);
    
    /**
     * Sets (as xml) ith "description" element
     */
    void xsetDescriptionArray(int i, org.apache.xmlbeans.XmlString description);
    
    /**
     * Inserts the value as the ith "description" element
     */
    void insertDescription(int i, java.lang.String description);
    
    /**
     * Appends the value as the last "description" element
     */
    void addDescription(java.lang.String description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.apache.xmlbeans.XmlString insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.apache.xmlbeans.XmlString addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * Gets a List of "tag" elements
     */
    java.util.List<org.biocatalogue.x2009.xml.rest.ResourceLinkWithString> getTagList();
    
    /**
     * Gets array of all "tag" elements
     * @deprecated
     */
    @Deprecated
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] getTagArray();
    
    /**
     * Gets ith "tag" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString getTagArray(int i);
    
    /**
     * Returns number of "tag" element
     */
    int sizeOfTagArray();
    
    /**
     * Sets array of all "tag" element
     */
    void setTagArray(org.biocatalogue.x2009.xml.rest.ResourceLinkWithString[] tagArray);
    
    /**
     * Sets ith "tag" element
     */
    void setTagArray(int i, org.biocatalogue.x2009.xml.rest.ResourceLinkWithString tag);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tag" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString insertNewTag(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tag" element
     */
    org.biocatalogue.x2009.xml.rest.ResourceLinkWithString addNewTag();
    
    /**
     * Removes the ith "tag" element
     */
    void removeTag(int i);
    
    /**
     * Gets a List of "cost" elements
     */
    java.util.List<java.lang.String> getCostList();
    
    /**
     * Gets array of all "cost" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getCostArray();
    
    /**
     * Gets ith "cost" element
     */
    java.lang.String getCostArray(int i);
    
    /**
     * Gets (as xml) a List of "cost" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetCostList();
    
    /**
     * Gets (as xml) array of all "cost" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetCostArray();
    
    /**
     * Gets (as xml) ith "cost" element
     */
    org.apache.xmlbeans.XmlString xgetCostArray(int i);
    
    /**
     * Returns number of "cost" element
     */
    int sizeOfCostArray();
    
    /**
     * Sets array of all "cost" element
     */
    void setCostArray(java.lang.String[] costArray);
    
    /**
     * Sets ith "cost" element
     */
    void setCostArray(int i, java.lang.String cost);
    
    /**
     * Sets (as xml) array of all "cost" element
     */
    void xsetCostArray(org.apache.xmlbeans.XmlString[] costArray);
    
    /**
     * Sets (as xml) ith "cost" element
     */
    void xsetCostArray(int i, org.apache.xmlbeans.XmlString cost);
    
    /**
     * Inserts the value as the ith "cost" element
     */
    void insertCost(int i, java.lang.String cost);
    
    /**
     * Appends the value as the last "cost" element
     */
    void addCost(java.lang.String cost);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "cost" element
     */
    org.apache.xmlbeans.XmlString insertNewCost(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "cost" element
     */
    org.apache.xmlbeans.XmlString addNewCost();
    
    /**
     * Removes the ith "cost" element
     */
    void removeCost(int i);
    
    /**
     * Gets a List of "license" elements
     */
    java.util.List<java.lang.String> getLicenseList();
    
    /**
     * Gets array of all "license" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getLicenseArray();
    
    /**
     * Gets ith "license" element
     */
    java.lang.String getLicenseArray(int i);
    
    /**
     * Gets (as xml) a List of "license" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetLicenseList();
    
    /**
     * Gets (as xml) array of all "license" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetLicenseArray();
    
    /**
     * Gets (as xml) ith "license" element
     */
    org.apache.xmlbeans.XmlString xgetLicenseArray(int i);
    
    /**
     * Returns number of "license" element
     */
    int sizeOfLicenseArray();
    
    /**
     * Sets array of all "license" element
     */
    void setLicenseArray(java.lang.String[] licenseArray);
    
    /**
     * Sets ith "license" element
     */
    void setLicenseArray(int i, java.lang.String license);
    
    /**
     * Sets (as xml) array of all "license" element
     */
    void xsetLicenseArray(org.apache.xmlbeans.XmlString[] licenseArray);
    
    /**
     * Sets (as xml) ith "license" element
     */
    void xsetLicenseArray(int i, org.apache.xmlbeans.XmlString license);
    
    /**
     * Inserts the value as the ith "license" element
     */
    void insertLicense(int i, java.lang.String license);
    
    /**
     * Appends the value as the last "license" element
     */
    void addLicense(java.lang.String license);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "license" element
     */
    org.apache.xmlbeans.XmlString insertNewLicense(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "license" element
     */
    org.apache.xmlbeans.XmlString addNewLicense();
    
    /**
     * Removes the ith "license" element
     */
    void removeLicense(int i);
    
    /**
     * Gets a List of "usageCondition" elements
     */
    java.util.List<java.lang.String> getUsageConditionList();
    
    /**
     * Gets array of all "usageCondition" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getUsageConditionArray();
    
    /**
     * Gets ith "usageCondition" element
     */
    java.lang.String getUsageConditionArray(int i);
    
    /**
     * Gets (as xml) a List of "usageCondition" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetUsageConditionList();
    
    /**
     * Gets (as xml) array of all "usageCondition" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetUsageConditionArray();
    
    /**
     * Gets (as xml) ith "usageCondition" element
     */
    org.apache.xmlbeans.XmlString xgetUsageConditionArray(int i);
    
    /**
     * Returns number of "usageCondition" element
     */
    int sizeOfUsageConditionArray();
    
    /**
     * Sets array of all "usageCondition" element
     */
    void setUsageConditionArray(java.lang.String[] usageConditionArray);
    
    /**
     * Sets ith "usageCondition" element
     */
    void setUsageConditionArray(int i, java.lang.String usageCondition);
    
    /**
     * Sets (as xml) array of all "usageCondition" element
     */
    void xsetUsageConditionArray(org.apache.xmlbeans.XmlString[] usageConditionArray);
    
    /**
     * Sets (as xml) ith "usageCondition" element
     */
    void xsetUsageConditionArray(int i, org.apache.xmlbeans.XmlString usageCondition);
    
    /**
     * Inserts the value as the ith "usageCondition" element
     */
    void insertUsageCondition(int i, java.lang.String usageCondition);
    
    /**
     * Appends the value as the last "usageCondition" element
     */
    void addUsageCondition(java.lang.String usageCondition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usageCondition" element
     */
    org.apache.xmlbeans.XmlString insertNewUsageCondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usageCondition" element
     */
    org.apache.xmlbeans.XmlString addNewUsageCondition();
    
    /**
     * Removes the ith "usageCondition" element
     */
    void removeUsageCondition(int i);
    
    /**
     * Gets a List of "contact" elements
     */
    java.util.List<java.lang.String> getContactList();
    
    /**
     * Gets array of all "contact" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getContactArray();
    
    /**
     * Gets ith "contact" element
     */
    java.lang.String getContactArray(int i);
    
    /**
     * Gets (as xml) a List of "contact" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetContactList();
    
    /**
     * Gets (as xml) array of all "contact" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetContactArray();
    
    /**
     * Gets (as xml) ith "contact" element
     */
    org.apache.xmlbeans.XmlString xgetContactArray(int i);
    
    /**
     * Returns number of "contact" element
     */
    int sizeOfContactArray();
    
    /**
     * Sets array of all "contact" element
     */
    void setContactArray(java.lang.String[] contactArray);
    
    /**
     * Sets ith "contact" element
     */
    void setContactArray(int i, java.lang.String contact);
    
    /**
     * Sets (as xml) array of all "contact" element
     */
    void xsetContactArray(org.apache.xmlbeans.XmlString[] contactArray);
    
    /**
     * Sets (as xml) ith "contact" element
     */
    void xsetContactArray(int i, org.apache.xmlbeans.XmlString contact);
    
    /**
     * Inserts the value as the ith "contact" element
     */
    void insertContact(int i, java.lang.String contact);
    
    /**
     * Appends the value as the last "contact" element
     */
    void addContact(java.lang.String contact);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contact" element
     */
    org.apache.xmlbeans.XmlString insertNewContact(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contact" element
     */
    org.apache.xmlbeans.XmlString addNewContact();
    
    /**
     * Removes the ith "contact" element
     */
    void removeContact(int i);
    
    /**
     * Gets a List of "publication" elements
     */
    java.util.List<java.lang.String> getPublicationList();
    
    /**
     * Gets array of all "publication" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getPublicationArray();
    
    /**
     * Gets ith "publication" element
     */
    java.lang.String getPublicationArray(int i);
    
    /**
     * Gets (as xml) a List of "publication" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetPublicationList();
    
    /**
     * Gets (as xml) array of all "publication" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetPublicationArray();
    
    /**
     * Gets (as xml) ith "publication" element
     */
    org.apache.xmlbeans.XmlString xgetPublicationArray(int i);
    
    /**
     * Returns number of "publication" element
     */
    int sizeOfPublicationArray();
    
    /**
     * Sets array of all "publication" element
     */
    void setPublicationArray(java.lang.String[] publicationArray);
    
    /**
     * Sets ith "publication" element
     */
    void setPublicationArray(int i, java.lang.String publication);
    
    /**
     * Sets (as xml) array of all "publication" element
     */
    void xsetPublicationArray(org.apache.xmlbeans.XmlString[] publicationArray);
    
    /**
     * Sets (as xml) ith "publication" element
     */
    void xsetPublicationArray(int i, org.apache.xmlbeans.XmlString publication);
    
    /**
     * Inserts the value as the ith "publication" element
     */
    void insertPublication(int i, java.lang.String publication);
    
    /**
     * Appends the value as the last "publication" element
     */
    void addPublication(java.lang.String publication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "publication" element
     */
    org.apache.xmlbeans.XmlString insertNewPublication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "publication" element
     */
    org.apache.xmlbeans.XmlString addNewPublication();
    
    /**
     * Removes the ith "publication" element
     */
    void removePublication(int i);
    
    /**
     * Gets a List of "citation" elements
     */
    java.util.List<java.lang.String> getCitationList();
    
    /**
     * Gets array of all "citation" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getCitationArray();
    
    /**
     * Gets ith "citation" element
     */
    java.lang.String getCitationArray(int i);
    
    /**
     * Gets (as xml) a List of "citation" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetCitationList();
    
    /**
     * Gets (as xml) array of all "citation" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetCitationArray();
    
    /**
     * Gets (as xml) ith "citation" element
     */
    org.apache.xmlbeans.XmlString xgetCitationArray(int i);
    
    /**
     * Returns number of "citation" element
     */
    int sizeOfCitationArray();
    
    /**
     * Sets array of all "citation" element
     */
    void setCitationArray(java.lang.String[] citationArray);
    
    /**
     * Sets ith "citation" element
     */
    void setCitationArray(int i, java.lang.String citation);
    
    /**
     * Sets (as xml) array of all "citation" element
     */
    void xsetCitationArray(org.apache.xmlbeans.XmlString[] citationArray);
    
    /**
     * Sets (as xml) ith "citation" element
     */
    void xsetCitationArray(int i, org.apache.xmlbeans.XmlString citation);
    
    /**
     * Inserts the value as the ith "citation" element
     */
    void insertCitation(int i, java.lang.String citation);
    
    /**
     * Appends the value as the last "citation" element
     */
    void addCitation(java.lang.String citation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "citation" element
     */
    org.apache.xmlbeans.XmlString insertNewCitation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "citation" element
     */
    org.apache.xmlbeans.XmlString addNewCitation();
    
    /**
     * Removes the ith "citation" element
     */
    void removeCitation(int i);
    
    /**
     * An XML counts(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Counts extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Counts.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("countsa0ffelemtype");
        
        /**
         * Gets the "deployments" element
         */
        java.math.BigInteger getDeployments();
        
        /**
         * Gets (as xml) the "deployments" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetDeployments();
        
        /**
         * Sets the "deployments" element
         */
        void setDeployments(java.math.BigInteger deployments);
        
        /**
         * Sets (as xml) the "deployments" element
         */
        void xsetDeployments(org.apache.xmlbeans.XmlPositiveInteger deployments);
        
        /**
         * Gets the "variants" element
         */
        java.math.BigInteger getVariants();
        
        /**
         * Gets (as xml) the "variants" element
         */
        org.apache.xmlbeans.XmlPositiveInteger xgetVariants();
        
        /**
         * Sets the "variants" element
         */
        void setVariants(java.math.BigInteger variants);
        
        /**
         * Sets (as xml) the "variants" element
         */
        void xsetVariants(org.apache.xmlbeans.XmlPositiveInteger variants);
        
        /**
         * Gets a List of "metadata" elements
         */
        java.util.List<org.biocatalogue.x2009.xml.rest.MetadataCount> getMetadataList();
        
        /**
         * Gets array of all "metadata" elements
         * @deprecated
         */
        @Deprecated
        org.biocatalogue.x2009.xml.rest.MetadataCount[] getMetadataArray();
        
        /**
         * Gets ith "metadata" element
         */
        org.biocatalogue.x2009.xml.rest.MetadataCount getMetadataArray(int i);
        
        /**
         * Returns number of "metadata" element
         */
        int sizeOfMetadataArray();
        
        /**
         * Sets array of all "metadata" element
         */
        void setMetadataArray(org.biocatalogue.x2009.xml.rest.MetadataCount[] metadataArray);
        
        /**
         * Sets ith "metadata" element
         */
        void setMetadataArray(int i, org.biocatalogue.x2009.xml.rest.MetadataCount metadata);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "metadata" element
         */
        org.biocatalogue.x2009.xml.rest.MetadataCount insertNewMetadata(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "metadata" element
         */
        org.biocatalogue.x2009.xml.rest.MetadataCount addNewMetadata();
        
        /**
         * Removes the ith "metadata" element
         */
        void removeMetadata(int i);
        
        /**
         * Gets the "favourites" element
         */
        java.math.BigInteger getFavourites();
        
        /**
         * Gets (as xml) the "favourites" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetFavourites();
        
        /**
         * Sets the "favourites" element
         */
        void setFavourites(java.math.BigInteger favourites);
        
        /**
         * Sets (as xml) the "favourites" element
         */
        void xsetFavourites(org.apache.xmlbeans.XmlNonNegativeInteger favourites);
        
        /**
         * Gets the "views" element
         */
        java.math.BigInteger getViews();
        
        /**
         * Gets (as xml) the "views" element
         */
        org.apache.xmlbeans.XmlNonNegativeInteger xgetViews();
        
        /**
         * Sets the "views" element
         */
        void setViews(java.math.BigInteger views);
        
        /**
         * Sets (as xml) the "views" element
         */
        void xsetViews(org.apache.xmlbeans.XmlNonNegativeInteger views);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts newInstance() {
              return (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.ServiceSummary.Counts) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML provider(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public interface Provider extends org.biocatalogue.x2009.xml.rest.ResourceLink
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Provider.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sACAA05EF5CC9F876E6C815F0106522E9").resolveHandle("provider6232elemtype");
        
        /**
         * Gets the "name" element
         */
        java.lang.String getName();
        
        /**
         * Gets (as xml) the "name" element
         */
        org.apache.xmlbeans.XmlString xgetName();
        
        /**
         * Sets the "name" element
         */
        void setName(java.lang.String name);
        
        /**
         * Sets (as xml) the "name" element
         */
        void xsetName(org.apache.xmlbeans.XmlString name);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider newInstance() {
              return (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.biocatalogue.x2009.xml.rest.ServiceSummary.Provider) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary newInstance() {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.biocatalogue.x2009.xml.rest.ServiceSummary parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.biocatalogue.x2009.xml.rest.ServiceSummary) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
