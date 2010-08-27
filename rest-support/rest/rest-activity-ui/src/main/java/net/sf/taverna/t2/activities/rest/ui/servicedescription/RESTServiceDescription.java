package net.sf.taverna.t2.activities.rest.ui.servicedescription;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import net.sf.taverna.t2.servicedescriptions.ServiceDescription;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivity.DATA_FORMAT;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;

/**
 * This class is solely intended to support import of REST services from BioCatalogue.
 * 
 * @author Sergejs Aleksejevs
 */
public class RESTServiceDescription extends ServiceDescription<RESTActivityConfigurationBean>
{
	private RESTActivityConfigurationBean serviceConfigBean;
	
	
	/**
	 * Constructor instantiates config bean and pre-populates
	 * it with default values.
	 */
	public RESTServiceDescription() {
	  this.serviceConfigBean = RESTActivityConfigurationBean.getDefaultInstance();
	}
  
  /**
	 * The subclass of Activity which should be instantiated when adding a service
	 * for this description.
	 */
	@Override
	public Class<? extends Activity<RESTActivityConfigurationBean>> getActivityClass() {
		return RESTActivity.class;
	}

	/**
	 * The configuration bean which is to be used for configuring the instantiated activity.
	 * 
	 * Values are to be set through individual setters provided in this class.
	 */
	@Override
	public RESTActivityConfigurationBean getActivityConfiguration() {
		return serviceConfigBean;
	}

	/**
	 * An icon to represent this service description in the service palette.
	 * (This method is not really used, as RESTActivityIcon SPI takes care of this).
	 */
	@Override
	public Icon getIcon() {
	  return null;
	}

	/**
	 * The display name that will be shown in service palette and will
	 * be used as a template for processor name when added to workflow.
	 */
	@Override
	public String getName() {
		return "REST Service";
	}

	/**
	 * The path to this service description in the service palette. Folders
	 * will be created for each element of the returned path.
	 * 
	 * (Shouldn't really be ever used, as instances of different type are
	 *  added into the Service Panel).
	 */
	@Override
	public List<String> getPath() {
		// For deeper paths you may return several strings
		return Arrays.asList("REST Services", serviceConfigBean.getUrlSignature());
	}

	/**
	 * Return a list of data values uniquely identifying this service
	 * description (to avoid duplicates). Include only primary key like fields,
	 * ie. ignore descriptions, icons, etc.
	 */
	@Override
	protected List<? extends Object> getIdentifyingData() {
		return Arrays.<Object>asList(serviceConfigBean.getUrlSignature(), serviceConfigBean.getHttpMethod());
	}
	
	
	public void setURLSignature(String urlSignature) {
	  this.serviceConfigBean.setUrlSignature(urlSignature);
	}
	
	public void setHttpMethod(HTTP_METHOD httpMethod) {
    this.serviceConfigBean.setHttpMethod(httpMethod);
  }
	
	public void setAcceptHeaderValue(String acceptHeaderValue) {
    this.serviceConfigBean.setAcceptsHeaderValue(acceptHeaderValue);
  }
	
	public void setOutgoingContentType(String outgoingContentType) 
	{
    this.serviceConfigBean.setUrlSignature(outgoingContentType);
    
    // automatically infer data format - string/binary from the content type
    if (outgoingContentType.startsWith("text")) { this.serviceConfigBean.setOutgoingDataFormat(DATA_FORMAT.String); }
    else { this.serviceConfigBean.setOutgoingDataFormat(DATA_FORMAT.Binary); }
  }
	
}
