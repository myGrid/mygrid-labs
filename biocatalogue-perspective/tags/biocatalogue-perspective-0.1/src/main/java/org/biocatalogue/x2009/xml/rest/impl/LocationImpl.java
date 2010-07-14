/*
 * XML Type:  Location
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Location
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Location(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class LocationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Location
{
    private static final long serialVersionUID = 1L;
    
    public LocationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CITY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "city");
    private static final javax.xml.namespace.QName COUNTRY$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "country");
    private static final javax.xml.namespace.QName ISO3166COUNTRYCODE$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "iso3166CountryCode");
    private static final javax.xml.namespace.QName FLAG$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "flag");
    
    
    /**
     * Gets the "city" element
     */
    public java.lang.String getCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "city" element
     */
    public org.apache.xmlbeans.XmlString xgetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "city" element
     */
    public boolean isSetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$0) != 0;
        }
    }
    
    /**
     * Sets the "city" element
     */
    public void setCity(java.lang.String city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CITY$0);
            }
            target.setStringValue(city);
        }
    }
    
    /**
     * Sets (as xml) the "city" element
     */
    public void xsetCity(org.apache.xmlbeans.XmlString city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CITY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CITY$0);
            }
            target.set(city);
        }
    }
    
    /**
     * Unsets the "city" element
     */
    public void unsetCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$0, 0);
        }
    }
    
    /**
     * Gets the "country" element
     */
    public java.lang.String getCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "country" element
     */
    public org.apache.xmlbeans.XmlString xgetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "country" element
     */
    public boolean isSetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$2) != 0;
        }
    }
    
    /**
     * Sets the "country" element
     */
    public void setCountry(java.lang.String country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTRY$2);
            }
            target.setStringValue(country);
        }
    }
    
    /**
     * Sets (as xml) the "country" element
     */
    public void xsetCountry(org.apache.xmlbeans.XmlString country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COUNTRY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COUNTRY$2);
            }
            target.set(country);
        }
    }
    
    /**
     * Unsets the "country" element
     */
    public void unsetCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$2, 0);
        }
    }
    
    /**
     * Gets the "iso3166CountryCode" element
     */
    public java.lang.String getIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISO3166COUNTRYCODE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "iso3166CountryCode" element
     */
    public org.apache.xmlbeans.XmlString xgetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISO3166COUNTRYCODE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "iso3166CountryCode" element
     */
    public boolean isSetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISO3166COUNTRYCODE$4) != 0;
        }
    }
    
    /**
     * Sets the "iso3166CountryCode" element
     */
    public void setIso3166CountryCode(java.lang.String iso3166CountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISO3166COUNTRYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISO3166COUNTRYCODE$4);
            }
            target.setStringValue(iso3166CountryCode);
        }
    }
    
    /**
     * Sets (as xml) the "iso3166CountryCode" element
     */
    public void xsetIso3166CountryCode(org.apache.xmlbeans.XmlString iso3166CountryCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ISO3166COUNTRYCODE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ISO3166COUNTRYCODE$4);
            }
            target.set(iso3166CountryCode);
        }
    }
    
    /**
     * Unsets the "iso3166CountryCode" element
     */
    public void unsetIso3166CountryCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISO3166COUNTRYCODE$4, 0);
        }
    }
    
    /**
     * Gets the "flag" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FLAG$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "flag" element
     */
    public boolean isSetFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FLAG$6) != 0;
        }
    }
    
    /**
     * Sets the "flag" element
     */
    public void setFlag(org.biocatalogue.x2009.xml.rest.ResourceLink flag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(FLAG$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FLAG$6);
            }
            target.set(flag);
        }
    }
    
    /**
     * Appends and returns a new empty "flag" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(FLAG$6);
            return target;
        }
    }
    
    /**
     * Unsets the "flag" element
     */
    public void unsetFlag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FLAG$6, 0);
        }
    }
}
