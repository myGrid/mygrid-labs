/*
 * An XML document type.
 * Localname: agent
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AgentDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one agent(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class AgentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AgentDocument
{
    private static final long serialVersionUID = 1L;
    
    public AgentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "agent");
    
    
    /**
     * Gets the "agent" element
     */
    public org.biocatalogue.x2009.xml.rest.Agent getAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agent target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agent)get_store().find_element_user(AGENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "agent" element
     */
    public void setAgent(org.biocatalogue.x2009.xml.rest.Agent agent)
    {
        generatedSetterHelperImpl(agent, AGENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "agent" element
     */
    public org.biocatalogue.x2009.xml.rest.Agent addNewAgent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agent target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agent)get_store().add_element_user(AGENT$0);
            return target;
        }
    }
}
