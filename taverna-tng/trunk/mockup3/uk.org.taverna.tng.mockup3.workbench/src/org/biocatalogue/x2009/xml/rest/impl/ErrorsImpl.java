/*
 * XML Type:  Errors
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Errors
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Errors(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class ErrorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Errors
{
    private static final long serialVersionUID = 1L;
    
    public ErrorsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERROR$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "error");
    
    
    /**
     * Gets array of all "error" elements
     */
    public java.lang.String[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "error" element
     */
    public java.lang.String getErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "error" elements
     */
    public org.apache.xmlbeans.XmlString[] xgetErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ERROR$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "error" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "error" element
     */
    public int sizeOfErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERROR$0);
        }
    }
    
    /**
     * Sets array of all "error" element
     */
    public void setErrorArray(java.lang.String[] errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$0);
        }
    }
    
    /**
     * Sets ith "error" element
     */
    public void setErrorArray(int i, java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(error);
        }
    }
    
    /**
     * Sets (as xml) array of all "error" element
     */
    public void xsetErrorArray(org.apache.xmlbeans.XmlString[]errorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(errorArray, ERROR$0);
        }
    }
    
    /**
     * Sets (as xml) ith "error" element
     */
    public void xsetErrorArray(int i, org.apache.xmlbeans.XmlString error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(error);
        }
    }
    
    /**
     * Inserts the value as the ith "error" element
     */
    public void insertError(int i, java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ERROR$0, i);
            target.setStringValue(error);
        }
    }
    
    /**
     * Appends the value as the last "error" element
     */
    public void addError(java.lang.String error)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
            target.setStringValue(error);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "error" element
     */
    public org.apache.xmlbeans.XmlString insertNewError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ERROR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "error" element
     */
    public org.apache.xmlbeans.XmlString addNewError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "error" element
     */
    public void removeError(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERROR$0, i);
        }
    }
}
