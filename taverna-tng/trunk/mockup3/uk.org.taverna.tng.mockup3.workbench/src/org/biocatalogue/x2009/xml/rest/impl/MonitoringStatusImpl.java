/*
 * XML Type:  MonitoringStatus
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.MonitoringStatus
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML MonitoringStatus(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class MonitoringStatusImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.MonitoringStatus
{
    private static final long serialVersionUID = 1L;
    
    public MonitoringStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LABEL$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "label");
    private static final javax.xml.namespace.QName MESSAGE$2 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "message");
    private static final javax.xml.namespace.QName SYMBOL$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "symbol");
    private static final javax.xml.namespace.QName SMALLSYMBOL$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "smallSymbol");
    private static final javax.xml.namespace.QName LASTCHECKED$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "lastChecked");
    
    
    /**
     * Gets the "label" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel.Enum getLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                return null;
            }
            return (org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "label" element
     */
    public org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel xgetLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel)get_store().find_element_user(LABEL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "label" element
     */
    public void setLabel(org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel.Enum label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LABEL$0);
            }
            target.setEnumValue(label);
        }
    }
    
    /**
     * Sets (as xml) the "label" element
     */
    public void xsetLabel(org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel label)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel target = null;
            target = (org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel)get_store().find_element_user(LABEL$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel)get_store().add_element_user(LABEL$0);
            }
            target.set(label);
        }
    }
    
    /**
     * Gets the "message" element
     */
    public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "message" element
     */
    public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "message" element
     */
    public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$2);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "message" element
     */
    public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$2);
            }
            target.set(message);
        }
    }
    
    /**
     * Gets the "symbol" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SYMBOL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "symbol" element
     */
    public void setSymbol(org.biocatalogue.x2009.xml.rest.ResourceLink symbol)
    {
        generatedSetterHelperImpl(symbol, SYMBOL$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "symbol" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SYMBOL$4);
            return target;
        }
    }
    
    /**
     * Gets the "smallSymbol" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink getSmallSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SMALLSYMBOL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "smallSymbol" element
     */
    public void setSmallSymbol(org.biocatalogue.x2009.xml.rest.ResourceLink smallSymbol)
    {
        generatedSetterHelperImpl(smallSymbol, SMALLSYMBOL$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "smallSymbol" element
     */
    public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSmallSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
            target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SMALLSYMBOL$6);
            return target;
        }
    }
    
    /**
     * Gets the "lastChecked" element
     */
    public java.util.Calendar getLastChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCHECKED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "lastChecked" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetLastChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCHECKED$8, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "lastChecked" element
     */
    public boolean isNilLastChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCHECKED$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "lastChecked" element
     */
    public void setLastChecked(java.util.Calendar lastChecked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCHECKED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCHECKED$8);
            }
            target.setCalendarValue(lastChecked);
        }
    }
    
    /**
     * Sets (as xml) the "lastChecked" element
     */
    public void xsetLastChecked(org.apache.xmlbeans.XmlDateTime lastChecked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCHECKED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTCHECKED$8);
            }
            target.set(lastChecked);
        }
    }
    
    /**
     * Nils the "lastChecked" element
     */
    public void setNilLastChecked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCHECKED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTCHECKED$8);
            }
            target.setNil();
        }
    }
}
