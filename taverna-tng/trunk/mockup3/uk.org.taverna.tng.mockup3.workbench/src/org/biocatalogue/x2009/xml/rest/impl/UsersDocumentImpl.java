/*
 * An XML document type.
 * Localname: users
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.UsersDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one users(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class UsersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.UsersDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "users");
    
    
    /**
     * Gets the "users" element
     */
    public org.biocatalogue.x2009.xml.rest.Users getUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Users target = null;
            target = (org.biocatalogue.x2009.xml.rest.Users)get_store().find_element_user(USERS$0, 0);
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
    public void setUsers(org.biocatalogue.x2009.xml.rest.Users users)
    {
        generatedSetterHelperImpl(users, USERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "users" element
     */
    public org.biocatalogue.x2009.xml.rest.Users addNewUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Users target = null;
            target = (org.biocatalogue.x2009.xml.rest.Users)get_store().add_element_user(USERS$0);
            return target;
        }
    }
}
