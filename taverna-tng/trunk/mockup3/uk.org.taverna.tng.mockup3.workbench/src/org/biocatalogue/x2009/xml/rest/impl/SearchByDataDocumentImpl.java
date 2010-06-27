/*
 * An XML document type.
 * Localname: searchByData
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SearchByDataDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one searchByData(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class SearchByDataDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SearchByDataDocument
{
    private static final long serialVersionUID = 1L;
    
    public SearchByDataDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SEARCHBYDATA$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "searchByData");
    
    
    /**
     * Gets the "searchByData" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData getSearchByData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData)get_store().find_element_user(SEARCHBYDATA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "searchByData" element
     */
    public void setSearchByData(org.biocatalogue.x2009.xml.rest.SearchByData searchByData)
    {
        generatedSetterHelperImpl(searchByData, SEARCHBYDATA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "searchByData" element
     */
    public org.biocatalogue.x2009.xml.rest.SearchByData addNewSearchByData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SearchByData target = null;
            target = (org.biocatalogue.x2009.xml.rest.SearchByData)get_store().add_element_user(SEARCHBYDATA$0);
            return target;
        }
    }
}
