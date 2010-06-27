/*
 * An XML document type.
 * Localname: user
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.UserDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one user(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class UserDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.UserDocument
{
    private static final long serialVersionUID = 1L;
    
    public UserDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "user");
    
    
    /**
     * Gets the "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User getUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().find_element_user(USER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "user" element
     */
    public void setUser(org.biocatalogue.x2009.xml.rest.User user)
    {
        generatedSetterHelperImpl(user, USER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User addNewUser()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().add_element_user(USER$0);
            return target;
        }
    }
}
