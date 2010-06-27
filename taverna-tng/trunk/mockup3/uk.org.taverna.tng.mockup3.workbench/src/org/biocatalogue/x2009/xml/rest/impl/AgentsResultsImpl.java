/*
 * XML Type:  AgentsResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.AgentsResults
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML AgentsResults(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class AgentsResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.AgentsResults
{
    private static final long serialVersionUID = 1L;
    
    public AgentsResultsImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AGENT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "agent");
    
    
    /**
     * Gets array of all "agent" elements
     */
    public org.biocatalogue.x2009.xml.rest.Agent[] getAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AGENT$0, targetList);
            org.biocatalogue.x2009.xml.rest.Agent[] result = new org.biocatalogue.x2009.xml.rest.Agent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "agent" element
     */
    public org.biocatalogue.x2009.xml.rest.Agent getAgentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agent target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agent)get_store().find_element_user(AGENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "agent" element
     */
    public int sizeOfAgentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AGENT$0);
        }
    }
    
    /**
     * Sets array of all "agent" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAgentArray(org.biocatalogue.x2009.xml.rest.Agent[] agentArray)
    {
        check_orphaned();
        arraySetterHelper(agentArray, AGENT$0);
    }
    
    /**
     * Sets ith "agent" element
     */
    public void setAgentArray(int i, org.biocatalogue.x2009.xml.rest.Agent agent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agent target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agent)get_store().find_element_user(AGENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(agent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "agent" element
     */
    public org.biocatalogue.x2009.xml.rest.Agent insertNewAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.Agent target = null;
            target = (org.biocatalogue.x2009.xml.rest.Agent)get_store().insert_element_user(AGENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "agent" element
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
    
    /**
     * Removes the ith "agent" element
     */
    public void removeAgent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AGENT$0, i);
        }
    }
}
