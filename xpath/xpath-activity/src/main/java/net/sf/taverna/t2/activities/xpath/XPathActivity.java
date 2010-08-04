package net.sf.taverna.t2.activities.xpath;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.taverna.t2.invocation.InvocationContext;
import net.sf.taverna.t2.reference.ReferenceService;
import net.sf.taverna.t2.reference.T2Reference;
import net.sf.taverna.t2.workflowmodel.processor.activity.AbstractAsynchronousActivity;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityConfigurationException;
import net.sf.taverna.t2.workflowmodel.processor.activity.AsynchronousActivity;
import net.sf.taverna.t2.workflowmodel.processor.activity.AsynchronousActivityCallback;

/**
 * Generic REST activity that is capable to perform all four
 * HTTP methods.
 * 
 * @author Sergejs Aleksejevs
 */
public class XPathActivity extends
		AbstractAsynchronousActivity<XPathActivityConfigurationBean>
		implements AsynchronousActivity<XPathActivityConfigurationBean>
{
  
	// These ports are default ones (and only ones - XPath activity will not have dynamic ports)
  private static final String IN_XML = "xml_text";
  private static final String OUT_TEXT = "nodelist";
	private static final String OUT_XML = "nodelistAsXML";
	
	// Configuration bean for this activity - essentially defines a particular instance
	// of the activity through the values of its parameters
	private XPathActivityConfigurationBean configBean;
	
	
	@Override
  public XPathActivityConfigurationBean getConfiguration() {
    return this.configBean;
  }
	
	
	@Override
	public void configure(XPathActivityConfigurationBean configBean) throws ActivityConfigurationException
  {
	  // Check configBean is valid
	  if (! configBean.isValid()) {
	    throw new ActivityConfigurationException("Invalid configuration bean...");  // TODO - check this
	  }
	  
		// Store for getConfiguration()
		this.configBean = configBean;
		
		// (Re)create input/output ports depending on configuration
		configurePorts();
	}
	
	
	protected void configurePorts()
	{
		// ---- REMOVE OLD PORTS ----
	  
	  // In case we are being reconfigured - remove existing ports first to avoid duplicates
		removeInputs();
		removeOutputs();
		
		
		// ---- CREATE NEW INPUTS AND OUTPUTS ----
		
		// all ports in this activity are static, so no dependency on the values in config bean
		
		// single input port: the input XML text will be treated as String for now
	  addInput(IN_XML, 0, true, null, String.class);
		
		// all outputs are of depth 1 - lists of strings / XML nodes
		addOutput(OUT_TEXT, 1);
		addOutput(OUT_XML, 1);
	}
	
	
	
	/**
	 * This method executes pre-configured instance of XPath activity.
	 */
	public void executeAsynch(final Map<String,T2Reference> inputs, final AsynchronousActivityCallback callback)
	{
		// Don't execute service directly now, request to be run asynchronously
		callback.requestRun(new Runnable() {
			public void run() {
			  
//				InvocationContext context = callback.getContext();
//				ReferenceService referenceService = context.getReferenceService();
//				
//				// ---- RESOLVE INPUTS ----
//				
//				// RE-ASSEMBLE REQUEST URL FROM SIGNATURE AND PARAMETERS
//				// (just use the configuration that was determined in configurePorts() - all ports in this set are required)
//				Map<String,String> urlParameters = new HashMap<String,String>();
//				try {
//  				for (String inputName : configBean.getActivityInputs().keySet()) {
//  				  urlParameters.put(inputName,
//  				                    (String) referenceService.renderIdentifier(inputs.get(inputName), 
//                                            configBean.getActivityInputs().get(inputName), context)
//                             );
//  				}
//				}
//				catch (Exception e) {
//				  // problem occurred while resolving the inputs
//				  callback.fail("REST activity was unable to resolve all necessary inputs" +
//				  		"that contain values for populating the URI signature placeholders " +
//				  		"with values.", e);
//          
//          // make sure we don't call callback.receiveResult later 
//          return;
//				}
//				String completeURL = URISignatureHandler.generateCompleteURI(configBean.getUrlSignature(), urlParameters);
//				
//				// OBTAIN THE INPUT BODY IF NECESSARY
//				// ("IN_BODY" is treated as *optional* for now)
//				Object inputMessageBody = null;
//				if (hasMessageBodyInputPort() && inputs.containsKey(IN_BODY)) {
//				  inputMessageBody = referenceService.renderIdentifier(
//				                              inputs.get(IN_BODY), 
//				                              configBean.getOutgoingDataFormat().getDataFormat(), context);
//				}
//				
//				
//				// ---- DO THE ACTUAL SERVICE INVOCATION ----
//				HTTPRequestResponse requestResponse = 
//				  HTTPRequestHandler.initiateHTTPRequest(completeURL, configBean, inputMessageBody);
//				
//				// test if an internal failure has occurred
//				if (requestResponse.hasException())
//				{
//				  callback.fail("Internal error has occurred while trying to execute the REST activity",
//				      requestResponse.getException());
//				  
//				  // make sure we don't call callback.receiveResult later 
//          return;
//				}
//				
//				
//				// ---- REGISTER OUTPUTS ----
//				Map<String, T2Reference> outputs = new HashMap<String, T2Reference>();
//				
//				T2Reference responseBodyRef = referenceService.register(requestResponse.getResponseBody(), 0, true, context);
//				outputs.put(OUT_RESPONSE_BODY, responseBodyRef);
//				
//				T2Reference statusRef = referenceService.register(requestResponse.getStatusCode() + " " + requestResponse.getReasonPhrase(), 0, true, context);
//				outputs.put(OUT_STATUS, statusRef);
//				
//				// only put an output to the Redirection port if the processor is configured to display that port
//				if (configBean.getShowRedirectionOutputPort()) {
//  				T2Reference redirectionRef = referenceService.register(requestResponse.getRedirection(), 0, true, context);
//  				outputs.put(OUT_REDIRECTION, redirectionRef);
//				}
//				
//				
//				// return map of output data, with empty index array as this is
//				// the only and final result (this index parameter is used if
//				// pipelining output)
//				callback.receiveResult(outputs, new int[0]);
			}
		});
	}

}
