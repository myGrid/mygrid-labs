/*
 * XML Type:  SoapOperation
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.SoapOperation
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * An XML SoapOperation(@http://www.biocatalogue.org/2009/xml/rest).
 *
 * This is a complex type.
 */
public class SoapOperationImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation
{
    private static final long serialVersionUID = 1L;
    
    public SoapOperationImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description");
    private static final org.apache.xmlbeans.QNameSet DESCRIPTION$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "abstract"),
        new javax.xml.namespace.QName("http://purl.org/dc/elements/1.1/", "description"),
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "tableOfContents"),
    });
    private static final javax.xml.namespace.QName PARAMETERORDER$6 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "parameterOrder");
    private static final javax.xml.namespace.QName CREATED$8 = 
        new javax.xml.namespace.QName("http://purl.org/dc/terms/", "created");
    private static final javax.xml.namespace.QName INPUTS$10 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "inputs");
    private static final javax.xml.namespace.QName OUTPUTS$12 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "outputs");
    private static final javax.xml.namespace.QName ANNOTATIONS$14 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
    private static final javax.xml.namespace.QName ANCESTORS$16 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "ancestors");
    private static final javax.xml.namespace.QName RELATED$18 = 
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
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$5, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$5, 0);
            return target;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$5, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$5, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Gets the "parameterOrder" element
     */
    public java.lang.String getParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERORDER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "parameterOrder" element
     */
    public org.apache.xmlbeans.XmlString xgetParameterOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERORDER$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "parameterOrder" element
     */
    public void setParameterOrder(java.lang.String parameterOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARAMETERORDER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARAMETERORDER$6);
            }
            target.setStringValue(parameterOrder);
        }
    }
    
    /**
     * Sets (as xml) the "parameterOrder" element
     */
    public void xsetParameterOrder(org.apache.xmlbeans.XmlString parameterOrder)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARAMETERORDER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARAMETERORDER$6);
            }
            target.set(parameterOrder);
        }
    }
    
    /**
     * Gets the "created" element
     */
    public java.util.Calendar getCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "created" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetCreated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "created" element
     */
    public void setCreated(java.util.Calendar created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATED$8);
            }
            target.setCalendarValue(created);
        }
    }
    
    /**
     * Sets (as xml) the "created" element
     */
    public void xsetCreated(org.apache.xmlbeans.XmlDateTime created)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CREATED$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CREATED$8);
            }
            target.set(created);
        }
    }
    
    /**
     * Gets the "inputs" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs getInputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs)get_store().find_element_user(INPUTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inputs" element
     */
    public boolean isSetInputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INPUTS$10) != 0;
        }
    }
    
    /**
     * Sets the "inputs" element
     */
    public void setInputs(org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs inputs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs)get_store().find_element_user(INPUTS$10, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs)get_store().add_element_user(INPUTS$10);
            }
            target.set(inputs);
        }
    }
    
    /**
     * Appends and returns a new empty "inputs" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs addNewInputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs)get_store().add_element_user(INPUTS$10);
            return target;
        }
    }
    
    /**
     * Unsets the "inputs" element
     */
    public void unsetInputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INPUTS$10, 0);
        }
    }
    
    /**
     * Gets the "outputs" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs getOutputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs)get_store().find_element_user(OUTPUTS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "outputs" element
     */
    public boolean isSetOutputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OUTPUTS$12) != 0;
        }
    }
    
    /**
     * Sets the "outputs" element
     */
    public void setOutputs(org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs outputs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs)get_store().find_element_user(OUTPUTS$12, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs)get_store().add_element_user(OUTPUTS$12);
            }
            target.set(outputs);
        }
    }
    
    /**
     * Appends and returns a new empty "outputs" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs addNewOutputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs)get_store().add_element_user(OUTPUTS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "outputs" element
     */
    public void unsetOutputs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OUTPUTS$12, 0);
        }
    }
    
    /**
     * Gets the "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations getAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations)get_store().find_element_user(ANNOTATIONS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "annotations" element
     */
    public boolean isSetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANNOTATIONS$14) != 0;
        }
    }
    
    /**
     * Sets the "annotations" element
     */
    public void setAnnotations(org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations annotations)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations)get_store().find_element_user(ANNOTATIONS$14, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations)get_store().add_element_user(ANNOTATIONS$14);
            }
            target.set(annotations);
        }
    }
    
    /**
     * Appends and returns a new empty "annotations" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations addNewAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations)get_store().add_element_user(ANNOTATIONS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "annotations" element
     */
    public void unsetAnnotations()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANNOTATIONS$14, 0);
        }
    }
    
    /**
     * Gets the "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors getAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors)get_store().find_element_user(ANCESTORS$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ancestors" element
     */
    public boolean isSetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCESTORS$16) != 0;
        }
    }
    
    /**
     * Sets the "ancestors" element
     */
    public void setAncestors(org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors ancestors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors)get_store().find_element_user(ANCESTORS$16, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors)get_store().add_element_user(ANCESTORS$16);
            }
            target.set(ancestors);
        }
    }
    
    /**
     * Appends and returns a new empty "ancestors" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors addNewAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors)get_store().add_element_user(ANCESTORS$16);
            return target;
        }
    }
    
    /**
     * Unsets the "ancestors" element
     */
    public void unsetAncestors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCESTORS$16, 0);
        }
    }
    
    /**
     * Gets the "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Related getRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Related)get_store().find_element_user(RELATED$18, 0);
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
            return get_store().count_elements(RELATED$18) != 0;
        }
    }
    
    /**
     * Sets the "related" element
     */
    public void setRelated(org.biocatalogue.x2009.xml.rest.SoapOperation.Related related)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Related)get_store().find_element_user(RELATED$18, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Related)get_store().add_element_user(RELATED$18);
            }
            target.set(related);
        }
    }
    
    /**
     * Appends and returns a new empty "related" element
     */
    public org.biocatalogue.x2009.xml.rest.SoapOperation.Related addNewRelated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.SoapOperation.Related target = null;
            target = (org.biocatalogue.x2009.xml.rest.SoapOperation.Related)get_store().add_element_user(RELATED$18);
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
            get_store().remove_element(RELATED$18, 0);
        }
    }
    /**
     * An XML inputs(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class InputsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation.Inputs
    {
        private static final long serialVersionUID = 1L;
        
        public InputsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOAPINPUT$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapInput");
        
        
        /**
         * Gets a List of "soapInput" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.SoapInput> getSoapInputList()
        {
            final class SoapInputList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SoapInput>
            {
                public org.biocatalogue.x2009.xml.rest.SoapInput get(int i)
                    { return InputsImpl.this.getSoapInputArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.SoapInput set(int i, org.biocatalogue.x2009.xml.rest.SoapInput o)
                {
                    org.biocatalogue.x2009.xml.rest.SoapInput old = InputsImpl.this.getSoapInputArray(i);
                    InputsImpl.this.setSoapInputArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.SoapInput o)
                    { InputsImpl.this.insertNewSoapInput(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.SoapInput remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.SoapInput old = InputsImpl.this.getSoapInputArray(i);
                    InputsImpl.this.removeSoapInput(i);
                    return old;
                }
                
                public int size()
                    { return InputsImpl.this.sizeOfSoapInputArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SoapInputList();
            }
        }
        
        /**
         * Gets array of all "soapInput" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.SoapInput[] getSoapInputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.SoapInput> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SoapInput>();
                get_store().find_all_element_users(SOAPINPUT$0, targetList);
                org.biocatalogue.x2009.xml.rest.SoapInput[] result = new org.biocatalogue.x2009.xml.rest.SoapInput[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "soapInput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapInput getSoapInputArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapInput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().find_element_user(SOAPINPUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "soapInput" element
         */
        public int sizeOfSoapInputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOAPINPUT$0);
            }
        }
        
        /**
         * Sets array of all "soapInput" element
         */
        public void setSoapInputArray(org.biocatalogue.x2009.xml.rest.SoapInput[] soapInputArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(soapInputArray, SOAPINPUT$0);
            }
        }
        
        /**
         * Sets ith "soapInput" element
         */
        public void setSoapInputArray(int i, org.biocatalogue.x2009.xml.rest.SoapInput soapInput)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapInput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().find_element_user(SOAPINPUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(soapInput);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapInput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapInput insertNewSoapInput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapInput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().insert_element_user(SOAPINPUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapInput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapInput addNewSoapInput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapInput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapInput)get_store().add_element_user(SOAPINPUT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "soapInput" element
         */
        public void removeSoapInput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOAPINPUT$0, i);
            }
        }
    }
    /**
     * An XML outputs(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class OutputsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation.Outputs
    {
        private static final long serialVersionUID = 1L;
        
        public OutputsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SOAPOUTPUT$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapOutput");
        
        
        /**
         * Gets a List of "soapOutput" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.SoapOutput> getSoapOutputList()
        {
            final class SoapOutputList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.SoapOutput>
            {
                public org.biocatalogue.x2009.xml.rest.SoapOutput get(int i)
                    { return OutputsImpl.this.getSoapOutputArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.SoapOutput set(int i, org.biocatalogue.x2009.xml.rest.SoapOutput o)
                {
                    org.biocatalogue.x2009.xml.rest.SoapOutput old = OutputsImpl.this.getSoapOutputArray(i);
                    OutputsImpl.this.setSoapOutputArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.SoapOutput o)
                    { OutputsImpl.this.insertNewSoapOutput(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.SoapOutput remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.SoapOutput old = OutputsImpl.this.getSoapOutputArray(i);
                    OutputsImpl.this.removeSoapOutput(i);
                    return old;
                }
                
                public int size()
                    { return OutputsImpl.this.sizeOfSoapOutputArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new SoapOutputList();
            }
        }
        
        /**
         * Gets array of all "soapOutput" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.SoapOutput[] getSoapOutputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.SoapOutput> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.SoapOutput>();
                get_store().find_all_element_users(SOAPOUTPUT$0, targetList);
                org.biocatalogue.x2009.xml.rest.SoapOutput[] result = new org.biocatalogue.x2009.xml.rest.SoapOutput[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "soapOutput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOutput getSoapOutputArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().find_element_user(SOAPOUTPUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "soapOutput" element
         */
        public int sizeOfSoapOutputArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SOAPOUTPUT$0);
            }
        }
        
        /**
         * Sets array of all "soapOutput" element
         */
        public void setSoapOutputArray(org.biocatalogue.x2009.xml.rest.SoapOutput[] soapOutputArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(soapOutputArray, SOAPOUTPUT$0);
            }
        }
        
        /**
         * Sets ith "soapOutput" element
         */
        public void setSoapOutputArray(int i, org.biocatalogue.x2009.xml.rest.SoapOutput soapOutput)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().find_element_user(SOAPOUTPUT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(soapOutput);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "soapOutput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOutput insertNewSoapOutput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().insert_element_user(SOAPOUTPUT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "soapOutput" element
         */
        public org.biocatalogue.x2009.xml.rest.SoapOutput addNewSoapOutput()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.SoapOutput target = null;
                target = (org.biocatalogue.x2009.xml.rest.SoapOutput)get_store().add_element_user(SOAPOUTPUT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "soapOutput" element
         */
        public void removeSoapOutput(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SOAPOUTPUT$0, i);
            }
        }
    }
    /**
     * An XML annotations(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AnnotationsImpl extends org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation.Annotations
    {
        private static final long serialVersionUID = 1L;
        
        public AnnotationsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ANNOTATION$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotation");
        
        
        /**
         * Gets a List of "annotation" elements
         */
        public java.util.List<org.biocatalogue.x2009.xml.rest.Annotation> getAnnotationList()
        {
            final class AnnotationList extends java.util.AbstractList<org.biocatalogue.x2009.xml.rest.Annotation>
            {
                public org.biocatalogue.x2009.xml.rest.Annotation get(int i)
                    { return AnnotationsImpl.this.getAnnotationArray(i); }
                
                public org.biocatalogue.x2009.xml.rest.Annotation set(int i, org.biocatalogue.x2009.xml.rest.Annotation o)
                {
                    org.biocatalogue.x2009.xml.rest.Annotation old = AnnotationsImpl.this.getAnnotationArray(i);
                    AnnotationsImpl.this.setAnnotationArray(i, o);
                    return old;
                }
                
                public void add(int i, org.biocatalogue.x2009.xml.rest.Annotation o)
                    { AnnotationsImpl.this.insertNewAnnotation(i).set(o); }
                
                public org.biocatalogue.x2009.xml.rest.Annotation remove(int i)
                {
                    org.biocatalogue.x2009.xml.rest.Annotation old = AnnotationsImpl.this.getAnnotationArray(i);
                    AnnotationsImpl.this.removeAnnotation(i);
                    return old;
                }
                
                public int size()
                    { return AnnotationsImpl.this.sizeOfAnnotationArray(); }
                
            }
            
            synchronized (monitor())
            {
                check_orphaned();
                return new AnnotationList();
            }
        }
        
        /**
         * Gets array of all "annotation" elements
         * @deprecated
         */
        public org.biocatalogue.x2009.xml.rest.Annotation[] getAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List<org.biocatalogue.x2009.xml.rest.Annotation> targetList = new java.util.ArrayList<org.biocatalogue.x2009.xml.rest.Annotation>();
                get_store().find_all_element_users(ANNOTATION$0, targetList);
                org.biocatalogue.x2009.xml.rest.Annotation[] result = new org.biocatalogue.x2009.xml.rest.Annotation[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "annotation" element
         */
        public org.biocatalogue.x2009.xml.rest.Annotation getAnnotationArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Annotation target = null;
                target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "annotation" element
         */
        public int sizeOfAnnotationArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ANNOTATION$0);
            }
        }
        
        /**
         * Sets array of all "annotation" element
         */
        public void setAnnotationArray(org.biocatalogue.x2009.xml.rest.Annotation[] annotationArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(annotationArray, ANNOTATION$0);
            }
        }
        
        /**
         * Sets ith "annotation" element
         */
        public void setAnnotationArray(int i, org.biocatalogue.x2009.xml.rest.Annotation annotation)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Annotation target = null;
                target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().find_element_user(ANNOTATION$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(annotation);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "annotation" element
         */
        public org.biocatalogue.x2009.xml.rest.Annotation insertNewAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Annotation target = null;
                target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().insert_element_user(ANNOTATION$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "annotation" element
         */
        public org.biocatalogue.x2009.xml.rest.Annotation addNewAnnotation()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.Annotation target = null;
                target = (org.biocatalogue.x2009.xml.rest.Annotation)get_store().add_element_user(ANNOTATION$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "annotation" element
         */
        public void removeAnnotation(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ANNOTATION$0, i);
            }
        }
    }
    /**
     * An XML ancestors(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class AncestorsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation.Ancestors
    {
        private static final long serialVersionUID = 1L;
        
        public AncestorsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SERVICE$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "service");
        private static final javax.xml.namespace.QName SOAPSERVICE$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "soapService");
        
        
        /**
         * Gets the "service" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "service" element
         */
        public void setService(org.biocatalogue.x2009.xml.rest.ResourceLink service)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SERVICE$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                }
                target.set(service);
            }
        }
        
        /**
         * Appends and returns a new empty "service" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SERVICE$0);
                return target;
            }
        }
        
        /**
         * Gets the "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPSERVICE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "soapService" element
         */
        public void setSoapService(org.biocatalogue.x2009.xml.rest.ResourceLink soapService)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(SOAPSERVICE$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPSERVICE$2);
                }
                target.set(soapService);
            }
        }
        
        /**
         * Appends and returns a new empty "soapService" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewSoapService()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(SOAPSERVICE$2);
                return target;
            }
        }
    }
    /**
     * An XML related(@http://www.biocatalogue.org/2009/xml/rest).
     *
     * This is a complex type.
     */
    public static class RelatedImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.SoapOperation.Related
    {
        private static final long serialVersionUID = 1L;
        
        public RelatedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INPUTS$0 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "inputs");
        private static final javax.xml.namespace.QName OUTPUTS$2 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "outputs");
        private static final javax.xml.namespace.QName ANNOTATIONS$4 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotations");
        private static final javax.xml.namespace.QName ANNOTATIONSONALL$6 = 
            new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "annotationsOnAll");
        
        
        /**
         * Gets the "inputs" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getInputs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(INPUTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "inputs" element
         */
        public void setInputs(org.biocatalogue.x2009.xml.rest.ResourceLink inputs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(INPUTS$0, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(INPUTS$0);
                }
                target.set(inputs);
            }
        }
        
        /**
         * Appends and returns a new empty "inputs" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewInputs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(INPUTS$0);
                return target;
            }
        }
        
        /**
         * Gets the "outputs" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getOutputs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(OUTPUTS$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "outputs" element
         */
        public void setOutputs(org.biocatalogue.x2009.xml.rest.ResourceLink outputs)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(OUTPUTS$2, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(OUTPUTS$2);
                }
                target.set(outputs);
            }
        }
        
        /**
         * Appends and returns a new empty "outputs" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewOutputs()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(OUTPUTS$2);
                return target;
            }
        }
        
        /**
         * Gets the "annotations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "annotations" element
         */
        public void setAnnotations(org.biocatalogue.x2009.xml.rest.ResourceLink annotations)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONS$4, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$4);
                }
                target.set(annotations);
            }
        }
        
        /**
         * Appends and returns a new empty "annotations" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotations()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONS$4);
                return target;
            }
        }
        
        /**
         * Gets the "annotationsOnAll" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink getAnnotationsOnAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONSONALL$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "annotationsOnAll" element
         */
        public void setAnnotationsOnAll(org.biocatalogue.x2009.xml.rest.ResourceLink annotationsOnAll)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().find_element_user(ANNOTATIONSONALL$6, 0);
                if (target == null)
                {
                    target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONSONALL$6);
                }
                target.set(annotationsOnAll);
            }
        }
        
        /**
         * Appends and returns a new empty "annotationsOnAll" element
         */
        public org.biocatalogue.x2009.xml.rest.ResourceLink addNewAnnotationsOnAll()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.biocatalogue.x2009.xml.rest.ResourceLink target = null;
                target = (org.biocatalogue.x2009.xml.rest.ResourceLink)get_store().add_element_user(ANNOTATIONSONALL$6);
                return target;
            }
        }
    }
}
