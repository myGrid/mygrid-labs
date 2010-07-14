/*
 * XML Type:  UsersResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.UsersResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML UsersResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class UsersResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.UsersResults
{
    private static final long serialVersionUID = 1L;
    
    public UsersResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USER$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "user");
    
    
    /**
     * Gets a List of "user" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.User> getUserList()
    {
        final class UserList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.User>
        {
            public org.biocatalogue.x2009.xml.rest.User get(int i)
                { return UsersResultsImpl.this.getUserArray(i); }
            
            public org.biocatalogue.x2009.xml.rest.User set(int i, org.biocatalogue.x2009.xml.rest.User o)
            {
                org.biocatalogue.x2009.xml.rest.User old = UsersResultsImpl.this.getUserArray(i);
                UsersResultsImpl.this.setUserArray(i, o);
                return old;
            }
            
            public void add(int i, org.biocatalogue.x2009.xml.rest.User o)
                { UsersResultsImpl.this.insertNewUser(i).set(o); }
            
            public org.biocatalogue.x2009.xml.rest.User remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.User old = UsersResultsImpl.this.getUserArray(i);
                UsersResultsImpl.this.removeUser(i);
                return old;
            }
            
            public int size()
                { return UsersResultsImpl.this.sizeOfUserArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UserList();
        }
    }
    
    /**
     * Gets array of all "user" elements
     * @deprecated
     */
    public org.biocatalogue.x2009.xml.rest.User[] getUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.User> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.User>();
            get_store().find_all_element_users(USER$0, targetList);
            org.biocatalogue.x2009.xml.rest.User[] result = new org.biocatalogue.x2009.xml.rest.User[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User getUserArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "user" element
     */
    public int sizeOfUserArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USER$0);
        }
    }
    
    /**
     * Sets array of all "user" element
     */
    public void setUserArray(org.biocatalogue.x2009.xml.rest.User[] userArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(userArray, USER$0);
        }
    }
    
    /**
     * Sets ith "user" element
     */
    public void setUserArray(int i, org.biocatalogue.x2009.xml.rest.User user)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().find_element_user(USER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(user);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "user" element
     */
    public org.biocatalogue.x2009.xml.rest.User insertNewUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.User target = null;
            target = (org.biocatalogue.x2009.xml.rest.User)get_store().insert_element_user(USER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "user" element
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
    
    /**
     * Removes the ith "user" element
     */
    public void removeUser(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USER$0, i);
        }
    }
}
