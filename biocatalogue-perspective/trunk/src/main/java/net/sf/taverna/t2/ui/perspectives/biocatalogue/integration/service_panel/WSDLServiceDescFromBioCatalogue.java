package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.service_panel;

import java.util.Arrays;
import java.util.List;

import javax.swing.Icon;

import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;
import net.sf.taverna.t2.activities.wsdl.WSDLActivity;
import net.sf.taverna.t2.activities.wsdl.WSDLActivityConfigurationBean;
import net.sf.taverna.t2.servicedescriptions.ServiceDescription;

public class WSDLServiceDescFromBioCatalogue extends ServiceDescription
{
  private final String wsdlLocation;
  private final String operationName;
  
  
  public WSDLServiceDescFromBioCatalogue(String wsdlLocation, String operationName)
  {
    this.wsdlLocation = wsdlLocation;
    this.operationName = operationName;
  }
  
  public WSDLServiceDescFromBioCatalogue(SoapOperationIdentity soapOpearationIdentity)
  {
    this.wsdlLocation = soapOpearationIdentity.getWsdlLocation();
    this.operationName = soapOpearationIdentity.getOperationName();
  }
  
  
	@Override
	public Class getActivityClass() {
		return WSDLActivity.class;
	}

	@Override
	public Object getActivityConfiguration() {
		WSDLActivityConfigurationBean bean = new WSDLActivityConfigurationBean();
		bean.setOperation(operationName);
		bean.setWsdl(wsdlLocation);
		return bean;
	}

	@Override
	public Icon getIcon() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		return (this.operationName);
	}

	@Override
	public List<String> getPath() {
		return Arrays.asList(BioCatalogueServiceProvider.PROVIDER_NAME, "WSDL @ " + this.wsdlLocation);
	}
	
	
	@Override
	protected List<? extends Object> getIdentifyingData()
	{
	  // This is important - Taverna won't add identical operations
	  // into the Service Panel. These tokens distinguish added items.
		return Arrays.asList(wsdlLocation, operationName);
	}

}
