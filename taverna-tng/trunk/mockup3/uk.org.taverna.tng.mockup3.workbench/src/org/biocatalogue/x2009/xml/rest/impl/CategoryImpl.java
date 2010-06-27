/*
 * XML Type:  Category
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.Category
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML Category(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class CategoryImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.Category
{
    private static final long serialVersionUID = 1L;
    
    public CategoryImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName TOTALITEMSCOUNT$4 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "totalItemsCount");
    private static final javax.xml.namespace.QName BROADER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "broader");
    private static final javax.xml.namespace.QName NARROWER$8 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "narrower");
    private static final javax.xml.namespace.QName RELATED$10 = 
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
     * Gets the "totalItemsCount" element
     */
    public java.math.BigInteger getTotalItemsCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALITEMSCOUNT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "totalItemsCount" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetTotalItemsCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTALITEMSCOUNT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "totalItemsCount" element
     */
    public void setTotalItemsCount(java.math.BigInteger totalItemsCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALITEMSCOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALITEMSCOUNT$4);
            }
            target.setBigIntegerValue(totalItemsCount);
        }
    }
    
    /**
     * Sets (as xml) the "totalItemsCount" element
     */
    public void xsetTotalItemsCount(org.apache.xmlbeans.XmlNonNegativeInteger totalItemsCount)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(TOTALITEMSCOUNT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(TOTALITEMSCOUNT$4);
            }
            target.set(totalItemsCount);
        }
    }
    
    /**
     * Gets the "broader" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Broader getBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Broader target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Broader)get_store().find_element_user(BROADER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "broader" element
     */
    public boolean isSetBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BROADER$6) != 0;
        }
    }
    
    /**
     * Sets the "broader" element
     */
    public void setBroader(org.biocatalogue.x2009.xml.rest.Category.Broader broader)
    {
        generatedSetterHelperImpl(broader, BROADER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "broader" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Broader addNewBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Broader target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Broader)get_store().add_element_user(BROADER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "broader" element
     */
    public void unsetBroader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BROADER$6, 0);
        }
    }
    
    /**
     * Gets the "narrower" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Narrower getNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Narrower target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Narrower)get_store().find_element_user(NARROWER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "narrower" element
     */
    public boolean isSetNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NARROWER$8) != 0;
        }
    }
    
    /**
     * Sets the "narrower" element
     */
    public void setNarrower(org.biocatalogue.x2009.xml.rest.Category.Narrower narrower)
    {
        generatedSetterHelperImpl(narrower, NARROWER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "narrower" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Narrower addNewNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Narrower target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Narrower)get_store().add_element_user(NARROWER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "narrower" element
     */
    public void unsetNarrower()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NARROWER$8, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Related)get_store().find_element_user(RELATED$10, 0);
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
            return get_store().count_elements(RELATED$10) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.Category.Related related)
    {
        generatedSetterHelperImpl(related, RELATED$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.Category.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category.Related)get_store().add_element_user(RELATED$10);
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
            get_store().remove_element(RELATED$10, 0);
        }
    }
    /**
     * An XML broader(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class BroaderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Category.Broader
    {
        private static final long serialVersionUID = 1L;
        
        public BroaderImpl(org.apache.xmlbeans.SchemaType sType)
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
                    { return BroaderImpl.this.getCategoryArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.Category set(int i, org.biocatalogue.x2009.xml.rest.Category o)
                {
                    org.biocatalogue.x2009.xml.rest.Category old = BroaderImpl.this.getCategoryArray(i);
                    BroaderImpl.this.setCategoryArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.Category o)
                    { BroaderImpl.this.insertNewCategory(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.Category remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.Category old = BroaderImpl.this.getCategoryArray(i);
                    BroaderImpl.this.removeCategory(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return BroaderImpl.this.sizeOfCategoryArray(); }
                
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
    /**
     * An XML narrower(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class NarrowerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Category.Narrower
    {
        private static final long serialVersionUID = 1L;
        
        public NarrowerImpl(org.apache.xmlbeans.SchemaType sType)
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
                    { return NarrowerImpl.this.getCategoryArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.Category set(int i, org.biocatalogue.x2009.xml.rest.Category o)
                {
                    org.biocatalogue.x2009.xml.rest.Category old = NarrowerImpl.this.getCategoryArray(i);
                    NarrowerImpl.this.setCategoryArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.Category o)
                    { NarrowerImpl.this.insertNewCategory(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.Category remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.Category old = NarrowerImpl.this.getCategoryArray(i);
                    NarrowerImpl.this.removeCategory(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return NarrowerImpl.this.sizeOfCategoryArray(); }
                
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
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.Category.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICES$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "services");
        
        
        /**
         * Gets the "services" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICES$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "services" element
         */
        public void setServices(org.biocatalogue.x2009.xml.rest.ResourceLink services)
        {
            generatedSetterHelperImpl(services, SERVICES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "services" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewServices()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICES$0);
                return target;
            }
        }
    }
}
