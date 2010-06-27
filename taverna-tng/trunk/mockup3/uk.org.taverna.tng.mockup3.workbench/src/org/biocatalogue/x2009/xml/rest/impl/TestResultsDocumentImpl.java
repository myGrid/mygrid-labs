/*
 * An XML document type.
 * Localname: testResults
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TestResultsDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one testResults(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class TestResultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResultsDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestResultsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTRESULTS$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testResults");
    
    
    /**
     * Gets the "testResults" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults getTestResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults)get_store().find_element_user(TESTRESULTS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testResults" element
     */
    public void setTestResults(org.biocatalogue.x2009.xml.rest.TestResults testResults)
    {
        generatedSetterHelperImpl(testResults, TESTRESULTS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "testResults" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResults addNewTestResults()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResults target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResults)get_store().add_element_user(TESTRESULTS$0);
            return target;
        }
    }
}
