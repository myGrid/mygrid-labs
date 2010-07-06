package net.sf.taverna.t2.activities.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.taverna.t2.activities.rest.HTTPRequestHandler.HTTPRequestResponse;
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
public class RESTActivity extends
		AbstractAsynchronousActivity<RESTActivityConfigurationBean>
		implements AsynchronousActivity<RESTActivityConfigurationBean>
{
  // This generic activity can deal with any of the four HTTP methods
  public static enum HTTP_METHOD { GET, POST, PUT, DELETE };
  
  // Pre-defined MIME types that this activity "knows" about -
  // these will be available for configuration of the activity
  public static String[] MIME_TYPES = {"text/plain", "text/csv", "text/html", "text/css",
                                       "application/xml", "application/json", "application/msword",
                                       "application/octet-stream", "application/pdf", "application/zip", 
                                       "image/bmp", "image/gif", "image/jpeg", "image/png"};
  
  
	// These ports are default ones; additional ports will be dynamically generated from the
  // URI signature used to configure the activity
  private static final String IN_BODY = "inputBody";
	private static final String OUT_RESPONSE_BODY = "responseBody";
	private static final String OUT_STATUS = "status";
	private static final String OUT_REDIRECTION = "redirection";
	
	// Configuration bean for this activity - essentially defines a particular instance
	// of the activity through the values of its parameters
	private RESTActivityConfigurationBean configBean;
	
	
	@Override
  public RESTActivityConfigurationBean getConfiguration() {
    return this.configBean;
  }
	
	
	@Override
	public void configure(RESTActivityConfigurationBean configBean) throws ActivityConfigurationException
  {
	  // Check configBean is valid - mainly check the URI signature for being well-formed and
	  // other details being present and valid;
	  //
	  // NB! The URI signature will still be valid if there are no placeholders at all - in this
	  //     case for GET and DELETE methods no input ports will be generated and a single input
	  //     port for input message body will be created for POST / PUT methods.
	  if (! configBean.isValid()) {
	    throw new ActivityConfigurationException("Bad data in the REST activity configuration bean - " +
	    		"possible causes are: missing or ill-formed URI signature, missing or invalid MIME types for the " +
	    		"specified HTTP headers ('Accept' | 'Content-Type')");
	  }
	  
		// Store for getConfiguration()
		this.configBean = configBean;
		
		// (Re)create input/output ports depending on configuration
		configurePorts();
	}
	
	
	protected void configurePorts()
	{
		// In case we are being reconfigured - remove existing ports first to avoid duplicates
		removeInputs();
		removeOutputs();
		
		// ---- CREATE INPUTS ----
		
		// all input ports are dynamic and depend on the configuration
		// of the particular instance of the REST activity
		
		// POST and PUT operations send data, so an input for the message body is required
		if (hasMessageBodyInputPort()) {
		  // the input message will be just an XML string for now
		  addInput(IN_BODY, 0, true, null, String.class);
		}
		
		// now process the URL signature - extract all placeholders and create an input port for each
		Map<String,Class<?>> activityInputs = new HashMap<String,Class<?>>();
		List<String> placeholders = URISignatureHandler.extractPlaceholders(configBean.getUrlSignature());
		for (String placeholder : placeholders) {
		  // these inputs will have a dynamic name each;
		  // the data type is string as they are the values to be
		  // substituted into the URL signature at the execution time
		  addInput(placeholder, 0, true, null, String.class);
		  activityInputs.put(placeholder, String.class);
		}
		
		// all inputs have now been configured - store the resulting set-up in the config bean;
		// this configuration will be reused during the execution of activity, so that existing
		// set-up could simply be referred to, rather than "re-calculated"
		configBean.setActivityInputs(activityInputs);
		
		// ---- CREATE OUTPUTS ----
		
		// all outputs are static - none of them depend on the configuration of the activity;
		// all outputs are of depth 0 - i.e. just a single value on each
		
		addOutput(OUT_RESPONSE_BODY, 0);
		addOutput(OUT_STATUS, 0);
		addOutput(OUT_REDIRECTION, 0);
	}
	
	
	/**
	 * Uses HTTP method value of the config bean of the current instance of RESTActivity.
	 * 
	 * @see RESTActivity#hasMessageBodyInputPort(HTTP_METHOD)
	 */
	public boolean hasMessageBodyInputPort() {
	  return (RESTActivity.hasMessageBodyInputPort(configBean.getHttpMethod()));
	}
	
	/**
	 * Return value of this method has a number of implications - various input ports and
	 * configuration options for this activity are applied based on the selected HTTP method.
	 * 
	 * @param httpMethod HTTP method to make the decision for.
	 * @return True if this instance of the REST activity uses HTTP POST / PUT methods;
   *         false otherwise.
	 */
	public static boolean hasMessageBodyInputPort(HTTP_METHOD httpMethod) {
	  return (httpMethod == HTTP_METHOD.POST || httpMethod == HTTP_METHOD.PUT);
	}
	
	
	/**
	 * This method executes pre-configured instance of REST activity.
	 * It resolves inputs of the activity and registers its outputs;
	 * the real invocation of the HTTP request is perfomed by
	 * {@link HTTPRequestHandler#initiateHTTPRequest(String, RESTActivityConfigurationBean, String)}.
	 */
	public void executeAsynch(final Map<String,T2Reference> inputs, final AsynchronousActivityCallback callback)
	{
		// Don't execute service directly now, request to be run asynchronously
		callback.requestRun(new Runnable() {
			public void run() {
			  
				InvocationContext context = callback.getContext();
				ReferenceService referenceService = context.getReferenceService();
				
				// ---- RESOLVE INPUTS ----
				
				// RE-ASSEMBLE REQUEST URL FROM SIGNATURE AND PARAMETERS
				// (just use the configuration that was determined in configurePorts() - all ports in this set are required)
				Map<String,String> urlParameters = new HashMap<String,String>();
				try {
  				for (String inputName : configBean.getActivityInputs().keySet()) {
  				  urlParameters.put(inputName,
  				                    (String) referenceService.renderIdentifier(inputs.get(inputName), 
                                            configBean.getActivityInputs().get(inputName), context)
                             );
  				}
				}
				catch (Exception e) {
				  // problem occurred while resolving the inputs
				  callback.fail("REST activity was unable to resolve all necessary inputs" +
				  		"that contain values for populating the URI signature placeholders " +
				  		"with values.", e);
          
          // make sure we don't call callback.receiveResult later 
          return;
				}
				String completeURL = URISignatureHandler.generateCompleteURI(configBean.getUrlSignature(), urlParameters);
				
				// OBTAIN THE INPUT BODY IF NECESSARY
				// TODO - is the "IN_BODY" input port optional or required?? treat as *optional* for now
				// TODO - stop hard-coding the type of input body...
				String inputMessageBody = null;
				if (hasMessageBodyInputPort() && inputs.containsKey(IN_BODY)) {
				  inputMessageBody = (String) referenceService.renderIdentifier(inputs.get(IN_BODY), 
                                           String.class, context);
				}
				
				
				// ---- DO THE ACTUAL SERVICE INVOCATION ----
				HTTPRequestResponse requestResponse = 
				  HTTPRequestHandler.initiateHTTPRequest(completeURL, configBean, inputMessageBody);
				
				// test if an internal failure has occurred
				if (requestResponse.hasException())
				{
				  callback.fail("Internal error has occurred while trying to execute the REST activity",
				      requestResponse.getException());
				  
				  // make sure we don't call callback.receiveResult later 
          return;
				}
				
				
				// ---- REGISTER OUTPUTS ----
				Map<String, T2Reference> outputs = new HashMap<String, T2Reference>();
				
				T2Reference responseBodyRef = referenceService.register(requestResponse.getResponseBody(), 0, true, context);
				outputs.put(OUT_RESPONSE_BODY, responseBodyRef);
				
				T2Reference statusRef = referenceService.register(requestResponse.getStatusCode() + " " + requestResponse.getReasonPhrase(), 0, true, context);
				outputs.put(OUT_STATUS, statusRef);
				
				T2Reference redirectionRef = referenceService.register(requestResponse.getRedirection(), 0, true, context);
				outputs.put(OUT_REDIRECTION, redirectionRef);
				
				
				// return map of output data, with empty index array as this is
				// the only and final result (this index parameter is used if
				// pipelining output)
				callback.receiveResult(outputs, new int[0]);
			}
		});
	}

}
