/*
 * XML Type:  CategoriesResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CategoriesResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML CategoriesResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CategoriesResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CategoriesResults
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "category");
    
    
    /**
     * Gets a List of "category" elements
     */
    public java.util.List<org.biocatalogue.x2009.xml.rest.Category> getCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.Category>
        {
            @Override
            public org.biocatalogue.x2009.xml.rest.Category get(int i)
                { return CategoriesResultsImpl.this.getCategoryArray(i); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.Category set(int i, org.biocatalogue.x2009.xml.rest.Category o)
            {
                org.biocatalogue.x2009.xml.rest.Category old = CategoriesResultsImpl.this.getCategoryArray(i);
                CategoriesResultsImpl.this.setCategoryArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.biocatalogue.x2009.xml.rest.Category o)
                { CategoriesResultsImpl.this.insertNewCategory(i).set(o); }
            
            @Override
            public org.biocatalogue.x2009.xml.rest.Category remove(int i)
            {
                org.biocatalogue.x2009.xml.rest.Category old = CategoriesResultsImpl.this.getCategoryArray(i);
                CategoriesResultsImpl.this.removeCategory(i);
                return old;
            }
            
            @Override
            public int size()
                { return CategoriesResultsImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets array of all "category" elements
     * @deprecated
     */
    @Deprecated
    public org.biocatalogue.x2009.xml.rest.Category[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.biocatalogue.x2009.xml.rest.Category> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.Category>();
            get_store().find_all_element_users(CATEGORY$0, targetList);
            org.biocatalogue.x2009.xml.rest.Category[] result = new org.biocatalogue.x2009.xml.rest.Category[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "category" element
     */
    public org.biocatalogue.x2009.xml.rest.Category getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$0);
        }
    }
    
    /**
     * Sets array of all "category" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCategoryArray(org.biocatalogue.x2009.xml.rest.Category[] categoryArray)
    {
        check_orphaned();
        arraySetterHelper(categoryArray, CATEGORY$0);
    }
    
    /**
     * Sets ith "category" element
     */
    public void setCategoryArray(int i, org.biocatalogue.x2009.xml.rest.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().find_element_user(CATEGORY$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(category);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "category" element
     */
    public org.biocatalogue.x2009.xml.rest.Category insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().insert_element_user(CATEGORY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "category" element
     */
    public org.biocatalogue.x2009.xml.rest.Category addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().add_element_user(CATEGORY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$0, i);
        }
    }
}
