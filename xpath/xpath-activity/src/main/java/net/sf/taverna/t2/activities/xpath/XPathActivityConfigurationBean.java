package net.sf.taverna.t2.activities.xpath;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.XPath;

/**
 * 
 * @author Sergejs Aleksejevs 
 */
public class XPathActivityConfigurationBean implements Serializable
{
	private Document xmlDocument;
	private XPath xpathExpression;
	private Map<String,String> xpathNamespaceMap;
	
	
	
	/**
	 * @return An instance of the {@link XPathActivityConfigurationBean} pre-configured with
	 *         default settings for all parameters.
	 * @throws DocumentException 
	 */
	public static XPathActivityConfigurationBean getDefaultInstance()
	{
	  // TODO - set sensible default values here
	  XPathActivityConfigurationBean defaultBean = new XPathActivityConfigurationBean();
	  try {
  	  defaultBean.setXmlDocument(DocumentHelper.parseText("<xml>Example XML document</xml>"));
  	  defaultBean.setXpathExpression(DocumentHelper.createXPath("/"));
  	  defaultBean.setXpathNamespaceMap(new HashMap<String,String>());
	  }
	  catch (DocumentException e) { /* cannot happen as the example XML is hard-coded and verified to be correct */ }
	  
    return (defaultBean);
	}
	
	
	
	/**
	 * Tests validity of the configuration held in this bean.
	 * 
	 * @return <code>true</code> if the configuration in the bean is valid;
	 *         <code>false</code> otherwise.
	 */
	public boolean isValid() {
	  return (xmlDocument != null && 
	          xpathExpression != null && 
	          getXpathNamespaceMap() != null);
	}
	
	
	
	public Document getXmlDocument() {
	  return xmlDocument;
	}
  public void setXmlDocument(Document xmlDocument) {
    this.xmlDocument = xmlDocument;
  }
  
  public XPath getXpathExpression() {
    return xpathExpression;
  }
  public void setXpathExpression(XPath xpathExpression) {
    this.xpathExpression = xpathExpression;
  }
  
  public Map<String,String> getXpathNamespaceMap() {
    return xpathNamespaceMap;
  }
  public void setXpathNamespaceMap(Map<String,String> xpathNamespaceMap) {
    this.xpathNamespaceMap = xpathNamespaceMap;
  }
	
}
