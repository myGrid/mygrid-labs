package net.sf.taverna.t2.activities.rest;

import java.io.Serializable;
import java.net.URI;
import java.util.Map;

/**
 * @author Sergejs Aleksejevs 
 */
public class RESTActivityConfigurationBean implements Serializable
{
	private RESTActivity.HTTP_METHOD httpMethod;
  private String urlSignature;
	private String acceptsHeaderValue;
	private String contentTypeForUpdates;
	
	// only need to store the configuration of inputs, as all of them are dynamic;
	// only inputs that constitute components of URL signature are to be stored in this map
	// all outputs are currently fixed, so no need to keep configuration of those
	private Map<String,Class<?>> activityInputs;
	
	
  public void setHttpMethod(RESTActivity.HTTP_METHOD httpMethod) {
    this.httpMethod = httpMethod;
  }
  public RESTActivity.HTTP_METHOD getHttpMethod() {
    return httpMethod;
  }
  
  public String getUrlSignature() {
    return urlSignature;
  }
  public void setUrlSignature(String urlSignature) {
    this.urlSignature = urlSignature;
  }
  
  public String getAcceptsHeaderValue() {
    return acceptsHeaderValue;
  }
  public void setAcceptsHeaderValue(String acceptsHeaderValue) {
    this.acceptsHeaderValue = acceptsHeaderValue;
  }
  
  public String getContentTypeForUpdates() {
    return contentTypeForUpdates;
  }
  public void setContentTypeForUpdates(String contentTypeForUpdates) {
    this.contentTypeForUpdates = contentTypeForUpdates;
  }
  
  public void setActivityInputs(Map<String,Class<?>> activityInputs) {
    this.activityInputs = activityInputs;
  }
  public Map<String,Class<?>> getActivityInputs() {
    return activityInputs;
  }
}
