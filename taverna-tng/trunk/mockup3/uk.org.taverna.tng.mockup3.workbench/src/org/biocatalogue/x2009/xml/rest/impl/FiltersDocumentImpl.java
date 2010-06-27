/*
 * An XML document type.
 * Localname: filters
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.FiltersDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one filters(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class FiltersDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.FiltersDocument
{
    private static final long serialVersionUID = 1L;
    
    public FiltersDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FILTERS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "filters");
    
    
    /**
     * Gets the "filters" element
     */
    public org.biocatalogue.x2009.xml.rest.Filters getFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filters target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filters)get_store().find_element_user(FILTERS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "filters" element
     */
    public void setFilters(org.biocatalogue.x2009.xml.rest.Filters filters)
    {
        generatedSetterHelperImpl(filters, FILTERS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "filters" element
     */
    public org.biocatalogue.x2009.xml.rest.Filters addNewFilters()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Filters target = null;
            target = (org.biocatalogue.x2009.xml.rest.Filters)get_store().add_element_user(FILTERS$0);
            return target;
        }
    }
}
