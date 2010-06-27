/*
 * An XML document type.
 * Localname: agents
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AgentsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one agents(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AgentsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AgentsDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgentsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENTS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "agents");
    
    
    /**
     * Gets the "agents" element
     */
    public org.biocatalogue.x2009.xml.rest.Agents getAgents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agents target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agents)get_store().find_element_user(AGENTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "agents" element
     */
    public void setAgents(org.biocatalogue.x2009.xml.rest.Agents agents)
    {
        generatedSetterHelperImpl(agents, AGENTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "agents" element
     */
    public org.biocatalogue.x2009.xml.rest.Agents addNewAgents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agents target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agents)get_store().add_element_user(AGENTS$0);
            return target;
        }
    }
}
