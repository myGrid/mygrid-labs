/*
 * An XML document type.
 * Localname: categories
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CategoriesDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one categories(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class CategoriesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CategoriesDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoriesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORIES$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "categories");
    
    
    /**
     * Gets the "categories" element
     */
    public org.biocatalogue.x2009.xml.rest.Categories getCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Categories target = null;
            target = (org.biocatalogue.x2009.xml.rest.Categories)get_store().find_element_user(CATEGORIES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "categories" element
     */
    public void setCategories(org.biocatalogue.x2009.xml.rest.Categories categories)
    {
        generatedSetterHelperImpl(categories, CATEGORIES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "categories" element
     */
    public org.biocatalogue.x2009.xml.rest.Categories addNewCategories()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Categories target = null;
            target = (org.biocatalogue.x2009.xml.rest.Categories)get_store().add_element_user(CATEGORIES$0);
            return target;
        }
    }
}
