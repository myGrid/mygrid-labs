/*
 * XML Type:  TagsResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TagsResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML TagsResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class TagsResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TagsResults
{
    private static final long serialVersionUID = 1L;
    
    public TagsResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TAG$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "tag");
    
    
    /**
     * Gets array of all "tag" elements
     */
    public org.biocatalogue.x2009.xml.rest.Tag[] getTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TAG$0, targetList);
            org.biocatalogue.x2009.xml.rest.Tag[] result = new org.biocatalogue.x2009.xml.rest.Tag[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.Tag getTagArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().find_element_user(TAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tag" element
     */
    public int sizeOfTagArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TAG$0);
        }
    }
    
    /**
     * Sets array of all "tag" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTagArray(org.biocatalogue.x2009.xml.rest.Tag[] tagArray)
    {
        check_orphaned();
        arraySetterHelper(tagArray, TAG$0);
    }
    
    /**
     * Sets ith "tag" element
     */
    public void setTagArray(int i, org.biocatalogue.x2009.xml.rest.Tag tag)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().find_element_user(TAG$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tag);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.Tag insertNewTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().insert_element_user(TAG$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tag" element
     */
    public org.biocatalogue.x2009.xml.rest.Tag addNewTag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Tag target = null;
            target = (org.biocatalogue.x2009.xml.rest.Tag)get_store().add_element_user(TAG$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "tag" element
     */
    public void removeTag(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TAG$0, i);
        }
    }
}
