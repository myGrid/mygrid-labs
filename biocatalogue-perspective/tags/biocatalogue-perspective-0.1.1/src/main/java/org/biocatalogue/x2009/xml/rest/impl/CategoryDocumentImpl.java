/*
 * An XML document type.
 * Localname: category
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.CategoryDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one category(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class CategoryDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.CategoryDocument
{
    private static final long serialVersionUID = 1L;
    
    public CategoryDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORY$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "category");
    
    
    /**
     * Gets the "category" element
     */
    public org.biocatalogue.x2009.xml.rest.Category getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "category" element
     */
    public void setCategory(org.biocatalogue.x2009.xml.rest.Category category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Category target = null;
            target = (org.biocatalogue.x2009.xml.rest.Category)get_store().find_element_user(CATEGORY$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.Category)get_store().add_element_user(CATEGORY$0);
            }
            target.set(category);
        }
    }
    
    /**
     * Appends and returns a new empty "category" element
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
}
