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
     * Gets a List of "error" elements
     */
    public java.util.List<java.lang.String> getErrorList()
    {
        final class ErrorList extends java.util.AbstractList<java.lang.String>
        {
            public java.lang.String get(int i)
                { return ErrorsImpl.this.getErrorArray(i); }
            
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ErrorsImpl.this.getErrorArray(i);
                ErrorsImpl.this.setErrorArray(i, o);
                return old;
            }
            
            public void add(int i, java.lang.String o)
                { ErrorsImpl.this.insertError(i, o); }
            
            public java.lang.String remove(int i)
            {
                java.lang.String old = ErrorsImpl.this.getErrorArray(i);
                ErrorsImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return ErrorsImpl.this.sizeOfErrorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorList();
        }
    }
    
    /**
     * Gets array of all "error" elements
     * @deprecated
     */
    public java.lang.String[] getErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
     * Gets (as xml) a List of "error" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetErrorList()
    {
        final class ErrorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            public org.apache.xmlbeans.XmlString get(int i)
                { return ErrorsImpl.this.xgetErrorArray(i); }
            
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ErrorsImpl.this.xgetErrorArray(i);
                ErrorsImpl.this.xsetErrorArray(i, o);
                return old;
            }
            
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ErrorsImpl.this.insertNewError(i).set(o); }
            
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ErrorsImpl.this.xgetErrorArray(i);
                ErrorsImpl.this.removeError(i);
                return old;
            }
            
            public int size()
                { return ErrorsImpl.this.sizeOfErrorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ErrorList();
        }
    }
    
    /**
     * Gets array of all "error" elements
     * @deprecated
     */
    public org.apache.xmlbeans.XmlString[] xgetErrorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
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
            return (org.apache.xmlbeans.XmlString)target;
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
