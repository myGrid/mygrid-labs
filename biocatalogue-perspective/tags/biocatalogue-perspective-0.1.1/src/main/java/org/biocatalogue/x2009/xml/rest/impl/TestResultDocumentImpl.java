/*
 * An XML document type.
 * Localname: testResult
 * Namespace: http://www.biocatalogue.org/2009/xml/rest
 * Java type: org.biocatalogue.x2009.xml.rest.TestResultDocument
 *
 * Automatically generated - do not modify.
 */
package org.biocatalogue.x2009.xml.rest.impl;
/**
 * A document containing one testResult(@http://www.biocatalogue.org/2009/xml/rest) element.
 *
 * This is a complex type.
 */
public class TestResultDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.biocatalogue.x2009.xml.rest.TestResultDocument
{
    private static final long serialVersionUID = 1L;
    
    public TestResultDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TESTRESULT$0 = 
        new javax.xml.namespace.QName("http://www.biocatalogue.org/2009/xml/rest", "testResult");
    
    
    /**
     * Gets the "testResult" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult getTestResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().find_element_user(TESTRESULT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "testResult" element
     */
    public void setTestResult(org.biocatalogue.x2009.xml.rest.TestResult testResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().find_element_user(TESTRESULT$0, 0);
            if (target == null)
            {
                target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().add_element_user(TESTRESULT$0);
            }
            target.set(testResult);
        }
    }
    
    /**
     * Appends and returns a new empty "testResult" element
     */
    public org.biocatalogue.x2009.xml.rest.TestResult addNewTestResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.biocatalogue.x2009.xml.rest.TestResult target = null;
            target = (org.biocatalogue.x2009.xml.rest.TestResult)get_store().add_element_user(TESTRESULT$0);
            return target;
        }
    }
}
