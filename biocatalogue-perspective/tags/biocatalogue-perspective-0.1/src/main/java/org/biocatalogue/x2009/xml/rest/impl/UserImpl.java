/*
 * XML Type:  User
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.User
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML User(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class UserImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.User
{
    private static final long serialVersionUID = 1L;
    
    public UserImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName AFFILIATION$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "affiliation");
    private static final javax.xml.namespace.QName LOCATION$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "location");
    private static final javax.xml.namespace.QName PUBLICEMAIL$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "publicEmail");
    private static final javax.xml.namespace.QName JOINED$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "joined");
    private static final javax.xml.namespace.QName RELATED$12 = 
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
     * Gets the "affiliation" element
     */
    public java.lang.String getAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "affiliation" element
     */
    public org.apache.xmlbeans.XmlString xgetAffiliation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "affiliation" element
     */
    public void setAffiliation(java.lang.String affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AFFILIATION$4);
            }
            target.setStringValue(affiliation);
        }
    }
    
    /**
     * Sets (as xml) the "affiliation" element
     */
    public void xsetAffiliation(org.apache.xmlbeans.XmlString affiliation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AFFILIATION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AFFILIATION$4);
            }
            target.set(affiliation);
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
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$6, 0);
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
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().find_element_user(LOCATION$6, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Location)get_store().add_element_user(LOCATION$6);
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
            target = (org.biocatalogue.x2009.xml.rest.Location)get_store().add_element_user(LOCATION$6);
            return target;
        }
    }
    
    /**
     * Gets the "publicEmail" element
     */
    public java.lang.String getPublicEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICEMAIL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicEmail" element
     */
    public org.apache.xmlbeans.XmlString xgetPublicEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICEMAIL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publicEmail" element
     */
    public void setPublicEmail(java.lang.String publicEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICEMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICEMAIL$8);
            }
            target.setStringValue(publicEmail);
        }
    }
    
    /**
     * Sets (as xml) the "publicEmail" element
     */
    public void xsetPublicEmail(org.apache.xmlbeans.XmlString publicEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLICEMAIL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLICEMAIL$8);
            }
            target.set(publicEmail);
        }
    }
    
    /**
     * Gets the "joined" element
     */
    public java.util.Calendar getJoined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINED$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "joined" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetJoined()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(JOINED$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "joined" element
     */
    public void setJoined(java.util.Calendar joined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOINED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOINED$10);
            }
            target.setCalendarValue(joined);
        }
    }
    
    /**
     * Sets (as xml) the "joined" element
     */
    public void xsetJoined(org.apache.xmlbeans.XmlDateTime joined)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(JOINED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(JOINED$10);
            }
            target.set(joined);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.UserRelatedLinks getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.UserRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.UserRelatedLinks)get_store().find_element_user(RELATED$12, 0);
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
            return get_store().count_elements(RELATED$12) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.UserRelatedLinks related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.UserRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.UserRelatedLinks)get_store().find_element_user(RELATED$12, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.UserRelatedLinks)get_store().add_element_user(RELATED$12);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.UserRelatedLinks addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.UserRelatedLinks target = null;
            target = (org.biocatalogue.x2009.xml.rest.UserRelatedLinks)get_store().add_element_user(RELATED$12);
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
            get_store().remove_element(RELATED$12, 0);
        }
    }
}
