/*
 * An XML document type.
 * Localname: biocatalogue
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.BiocatalogueDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one biocatalogue(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class BiocatalogueDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.BiocatalogueDocument
{
    private static final long serialVersionUID = 1L;
    
    public BiocatalogueDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BIOCATALOGUE$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "biocatalogue");
    
    
    /**
     * Gets the "biocatalogue" element
     */
    public org.biocatalogue.x2009.xml.rest.BioCatalogue getBiocatalogue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.BioCatalogue target = null;
            target = (org.biocatalogue.x2009.xml.rest.BioCatalogue)get_store().find_element_user(BIOCATALOGUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "biocatalogue" element
     */
    public void setBiocatalogue(org.biocatalogue.x2009.xml.rest.BioCatalogue biocatalogue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.BioCatalogue target = null;
            target = (org.biocatalogue.x2009.xml.rest.BioCatalogue)get_store().find_element_user(BIOCATALOGUE$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.BioCatalogue)get_store().add_element_user(BIOCATALOGUE$0);
            }
            target.set(biocatalogue);
        }
    }
    
    /**
     * Appends and returns a new empty "biocatalogue" element
     */
    public org.biocatalogue.x2009.xml.rest.BioCatalogue addNewBiocatalogue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.BioCatalogue target = null;
            target = (org.biocatalogue.x2009.xml.rest.BioCatalogue)get_store().add_element_user(BIOCATALOGUE$0);
            return target;
        }
    }
}
