/*
 * XML Type:  CollectionCoreStatistics
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML CollectionCoreStatistics(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CollectionCoreStatisticsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CollectionCoreStatistics
{
    private static final long serialVersionUID = 1L;
    
    public CollectionCoreStatisticsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAGES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "pages");
    private static final javax.xml.namespace.QName RESULTS$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "results");
    private static final javax.xml.namespace.QName TOTAL$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "total");
    
    
    /**
     * Gets the "pages" element
     */
    public java.math.BigInteger getPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "pages" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PAGES$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pages" element
     */
    public void setPages(java.math.BigInteger pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$0);
            }
            target.setBigIntegerValue(pages);
        }
    }
    
    /**
     * Sets (as xml) the "pages" element
     */
    public void xsetPages(org.apache.xmlbeans.XmlNonNegativeInteger pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(PAGES$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(PAGES$0);
            }
            target.set(pages);
        }
    }
    
    /**
     * Gets the "results" element
     */
    public java.math.BigInteger getResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "results" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(RESULTS$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "results" element
     */
    public void setResults(java.math.BigInteger results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESULTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESULTS$2);
            }
            target.setBigIntegerValue(results);
        }
    }
    
    /**
     * Sets (as xml) the "results" element
     */
    public void xsetResults(org.apache.xmlbeans.XmlNonNegativeInteger results)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(RESULTS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(RESULTS$2);
            }
            target.set(results);
        }
    }
    
    /**
     * Gets the "total" element
     */
    public java.math.BigInteger getTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "total" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTAL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "total" element
     */
    public boolean isSetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTAL$4) != 0;
        }
    }
    
    /**
     * Sets the "total" element
     */
    public void setTotal(java.math.BigInteger total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTAL$4);
            }
            target.setBigIntegerValue(total);
        }
    }
    
    /**
     * Sets (as xml) the "total" element
     */
    public void xsetTotal(org.apache.xmlbeans.XmlNonNegativeInteger total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(TOTAL$4);
            }
            target.set(total);
        }
    }
    
    /**
     * Unsets the "total" element
     */
    public void unsetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTAL$4, 0);
        }
    }
}
