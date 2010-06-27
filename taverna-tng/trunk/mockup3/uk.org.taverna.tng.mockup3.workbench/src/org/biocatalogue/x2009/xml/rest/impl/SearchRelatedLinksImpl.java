/*
 * XML Type:  SearchRelatedLinks
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchRelatedLinks
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SearchRelatedLinks(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SearchRelatedLinksImpl extends org.biocatalogue.x2009.xml.rest.impl.CollectionCoreRelatedLinksImpl implements org.biocatalogue.x2009.xml.rest.SearchRelatedLinks
{
    private static final long serialVersionUID = 1L;
    
    public SearchRelatedLinksImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "searches");
    
    
    /**
     * Gets the "searches" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches getSearches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches)get_store().find_element_user(SEARCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "searches" element
     */
    public void setSearches(org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches searches)
    {
        generatedSetterHelperImpl(searches, SEARCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "searches" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches addNewSearches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches)get_store().add_element_user(SEARCHES$0);
            return target;
        }
    }
    /**
     * An XML searches(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class SearchesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchRelatedLinks.Searches
    {
        private static final long serialVersionUID = 1L;
        
        public SearchesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SCOPED$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "scoped");
        
        
        /**
         * Gets a List of "scoped" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.ScopedSearch> getScopedList()
        {
            final class ScopedList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.ScopedSearch>
            {
                @Override
                public org.biocatalogue.x2009.xml.rest.ScopedSearch get(int i)
                    { return SearchesImpl.this.getScopedArray(i); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ScopedSearch set(int i, org.biocatalogue.x2009.xml.rest.ScopedSearch o)
                {
                    org.biocatalogue.x2009.xml.rest.ScopedSearch old = SearchesImpl.this.getScopedArray(i);
                    SearchesImpl.this.setScopedArray(i, o);
                    return old;
                }
                
                @Override
                public void add(int i, org.biocatalogue.x2009.xml.rest.ScopedSearch o)
                    { SearchesImpl.this.insertNewScoped(i).set(o); }
                
                @Override
                public org.biocatalogue.x2009.xml.rest.ScopedSearch remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.ScopedSearch old = SearchesImpl.this.getScopedArray(i);
                    SearchesImpl.this.removeScoped(i);
                    return old;
                }
                
                @Override
                public int size()
                    { return SearchesImpl.this.sizeOfScopedArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new ScopedList();
            }
        }
        
        /**
         * Gets array of all "scoped" elements
         * @deprecated
         */
        @Deprecated
        public org.biocatalogue.x2009.xml.rest.ScopedSearch[] getScopedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.ScopedSearch> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.ScopedSearch>();
                get_store().find_all_element_users(SCOPED$0, targetList);
                org.biocatalogue.x2009.xml.rest.ScopedSearch[] result = new org.biocatalogue.x2009.xml.rest.ScopedSearch[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "scoped" element
         */
        public org.biocatalogue.x2009.xml.rest.ScopedSearch getScopedArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ScopedSearch target = null;
                target = (org.biocatalogue.x2009.xml.rest.ScopedSearch)get_store().find_element_user(SCOPED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "scoped" element
         */
        public int sizeOfScopedArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SCOPED$0);
            }
        }
        
        /**
         * Sets array of all "scoped" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setScopedArray(org.biocatalogue.x2009.xml.rest.ScopedSearch[] scopedArray)
        {
            check_orphaned();
            arraySetterHelper(scopedArray, SCOPED$0);
        }
        
        /**
         * Sets ith "scoped" element
         */
        public void setScopedArray(int i, org.biocatalogue.x2009.xml.rest.ScopedSearch scoped)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ScopedSearch target = null;
                target = (org.biocatalogue.x2009.xml.rest.ScopedSearch)get_store().find_element_user(SCOPED$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(scoped);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "scoped" element
         */
        public org.biocatalogue.x2009.xml.rest.ScopedSearch insertNewScoped(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ScopedSearch target = null;
                target = (org.biocatalogue.x2009.xml.rest.ScopedSearch)get_store().insert_element_user(SCOPED$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "scoped" element
         */
        public org.biocatalogue.x2009.xml.rest.ScopedSearch addNewScoped()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ScopedSearch target = null;
                target = (org.biocatalogue.x2009.xml.rest.ScopedSearch)get_store().add_element_user(SCOPED$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "scoped" element
         */
        public void removeScoped(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SCOPED$0, i);
            }
        }
    }
}
