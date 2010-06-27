/*
 * XML Type:  elementContainer
 * Namespace: http://purl.org/dc/elements/1.1/
 * Java type: org.purl.dc.elements.x11.ElementContainer
 *
 * Automatically generated - do not modify.
 */
package org.purl.dc.elements.x11.impl;
/**
 * An XML elementContainer(@http://purl.org/dc/elements/1.1/).
 *
 * This is a complex type.
 */
public class ElementContainerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.purl.dc.elements.x11.ElementContainer
{
    private static final long serialVersionUID = 1L;
    
    public ElementContainerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANY$0 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any");
    private static final org.apache.xmlbeans.QNameSet ANY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "relation"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "bibliographicCitation"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "format"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "license"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasFormat"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "references"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPeriodicity"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "extent"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "conformsTo"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "educationLevel"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "rightsHolder"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "language"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "identifier"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isFormatOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "source"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "coverage"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReplacedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "rights"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "mediator"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isReferencedBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isVersionOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasVersion"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualPolicy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isPartOf"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "type"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "creator"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "publisher"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "provenance"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accessRights"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "subject"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "temporal"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "alternative"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "hasPart"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "accrualMethod"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "instructionalMethod"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "isRequiredBy"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "medium"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "requires"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "title"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "replaces"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "audience"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "spatial"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "contributor"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "any"),
    });
    
    
    /**
     * Gets a List of "any" elements
     */
    public java.util.List<java.lang.String> getAnyList()
    {
        final class AnyList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return ElementContainerImpl.this.getAnyArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = ElementContainerImpl.this.getAnyArray(i);
                ElementContainerImpl.this.setAnyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { ElementContainerImpl.this.insertAny(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = ElementContainerImpl.this.getAnyArray(i);
                ElementContainerImpl.this.removeAny(i);
                return old;
            }
            
            @Override
            public int size()
                { return ElementContainerImpl.this.sizeOfAnyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnyList();
        }
    }
    
    /**
     * Gets array of all "any" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getAnyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ANY$1, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "any" element
     */
    public java.lang.String getAnyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "any" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAnyList()
    {
        final class AnyList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return ElementContainerImpl.this.xgetAnyArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = ElementContainerImpl.this.xgetAnyArray(i);
                ElementContainerImpl.this.xsetAnyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { ElementContainerImpl.this.insertNewAny(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = ElementContainerImpl.this.xgetAnyArray(i);
                ElementContainerImpl.this.removeAny(i);
                return old;
            }
            
            @Override
            public int size()
                { return ElementContainerImpl.this.sizeOfAnyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnyList();
        }
    }
    
    /**
     * Gets array of all "any" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetAnyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ANY$1, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "any" element
     */
    public org.apache.xmlbeans.XmlString xgetAnyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "any" element
     */
    public int sizeOfAnyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANY$1);
        }
    }
    
    /**
     * Sets array of all "any" element
     */
    public void setAnyArray(java.lang.String[] anyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anyArray, ANY$0, ANY$1);
        }
    }
    
    /**
     * Sets ith "any" element
     */
    public void setAnyArray(int i, java.lang.String any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(any);
        }
    }
    
    /**
     * Sets (as xml) array of all "any" element
     */
    public void xsetAnyArray(org.apache.xmlbeans.XmlString[]anyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anyArray, ANY$0);
        }
    }
    
    /**
     * Sets (as xml) ith "any" element
     */
    public void xsetAnyArray(int i, org.apache.xmlbeans.XmlString any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(any);
        }
    }
    
    /**
     * Inserts the value as the ith "any" element
     */
    public void insertAny(int i, java.lang.String any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ANY$1, ANY$0, i);
            target.setStringValue(any);
        }
    }
    
    /**
     * Appends the value as the last "any" element
     */
    public void addAny(java.lang.String any)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANY$0);
            target.setStringValue(any);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "any" element
     */
    public org.apache.xmlbeans.XmlString insertNewAny(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ANY$1, ANY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "any" element
     */
    public org.apache.xmlbeans.XmlString addNewAny()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "any" element
     */
    public void removeAny(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANY$1, i);
        }
    }
}
