package net.sf.taverna.t2.activities.rest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;

import net.sf.taverna.t2.invocation.InvocationContext;
import net.sf.taverna.t2.reference.ReferenceService;
import net.sf.taverna.t2.reference.T2Reference;
import net.sf.taverna.t2.workflowmodel.processor.activity.AbstractAsynchronousActivity;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityConfigurationException;
import net.sf.taverna.t2.workflowmodel.processor.activity.AsynchronousActivity;
import net.sf.taverna.t2.workflowmodel.processor.activity.AsynchronousActivityCallback;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class RESTActivity extends
		AbstractAsynchronousActivity<RESTActivityConfigurationBean>
		implements AsynchronousActivity<RESTActivityConfigurationBean>
{
  // This generic activity can deal with any of the four HTTP methods
  public static enum HTTP_METHOD { GET, POST, PUT, DELETE }; 
  
  
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
	  // TODO - check configBean is valid
	  // TODO - mainly check the URI signature for being well-formed
	  // TODO - what if the signature does not have any placeholders?
        //		// Any pre-config sanity checks
        //		if (configBean.getExampleString().equals("invalidExample")) {
        //			throw new ActivityConfigurationException(
        //					"Example string can't be 'invalidExample'");
        //		}
	  
		// Store for getConfiguration()
		this.configBean = configBean;
		
		// (Re)create input/output ports depending on configuration
		configurePorts();
	}
	
	
	protected void configurePorts() {
		// In case we are being reconfigured - remove existing ports first to avoid duplicates
		removeInputs();
		removeOutputs();
		
		// ---- CREATE INPUTS ----
		
		// all input ports are dynamic and depend on the configuration of the
		// particular instance of the REST activity
		
		// POST and PUT operations send data, so an input for the message body is required
		if (hasMessageBodyInputPort()) {
		  // the input message will be just an XML string for now
		  addInput(IN_BODY, 0, true, null, String.class);
		}
		
		// now process the URL signature - extract all placeholders and create an input port for each
		List<String> placeholders = URISignatureHandler.extractPlaceholders(configBean.getUrlSignature());
		for (String placeholder : placeholders) {
		  // these inputs will have a dynamic name each;
		  // the data type is string as they are the values to be
		  // substituted into the URL signature at the execution time
		  addInput(placeholder, 0, true, null, String.class);
		}
		
		// ---- CREATE OUTPUTS ----
		
		// all outputs are static - none of them depend on the configuration of the activity;
		// all outputs are of depth 0 - i.e. just a single value on each
		
		addOutput(OUT_RESPONSE_BODY, 0);
		addOutput(OUT_STATUS, 0);
		addOutput(OUT_REDIRECTION, 0);
	}
	
	
	/**
	 * @return True if this instance of the REST activity uses HTTP POST / PUT methods;
	 *         false otherwise.
	 */
	private boolean hasMessageBodyInputPort() {
	  return (configBean.getHttpMethod() == HTTP_METHOD.POST || configBean.getHttpMethod() == HTTP_METHOD.PUT);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public void executeAsynch(final Map<String, T2Reference> inputs,
			final AsynchronousActivityCallback callback)
	{
		// Don't execute service directly now, request to be run asynchronously
		callback.requestRun(new Runnable() {
			public void run() {
			  
				InvocationContext context = callback.getContext();
				ReferenceService referenceService = context.getReferenceService();
				
				// ---- RESOLVE INPUTS ----
				// TODO - all inputs are dynamic
              //				String firstInput = (String) referenceService.renderIdentifier(inputs.get(IN_FIRST_INPUT), 
              //						                           String.class, context);
              //				
              //				// Support our configuration-dependendent input
              //				boolean optionalPorts = configBean.getExampleString().equals("specialCase"); 
              //				
              //				List<byte[]> special = null;
              //				// We'll also allow IN_EXTRA_DATA to be optionally not provided
              //				if (optionalPorts && inputs.containsKey(IN_EXTRA_DATA)) {
              //				  T2Reference reference = inputs.get(IN_EXTRA_DATA);
              //				  System.out.println("Reference " + reference + " is depth " + reference.getDepth());
              //				  
              //				  // Resolve as a list of byte[]
              //					special = (List<byte[]>) referenceService.renderIdentifier(
              //							inputs.get(IN_EXTRA_DATA), byte[].class, context);
              //				}
				
				
				// ---- DO THE ACTUAL SERVICE INVOCATION ----
				// TODO: Do the actual service invocation
              //				try {
              //					results = this.service.invoke(firstInput, special)
              //				} catch (ServiceException ex) {
              //					callback.fail("Could not invoke Example service " + configBean.getExampleUri(),
              //							ex);
              //					// Make sure we don't call callback.receiveResult later 
              //					return;
              //				}
				
				
				// ---- REGISTER OUTPUTS ----
				// TODO - do the proper outputs
				Map<String, T2Reference> outputs = new HashMap<String, T2Reference>();
				
				T2Reference responseBodyRef = referenceService.register("<< The response body object >>", 0, true, context);
				outputs.put(OUT_RESPONSE_BODY, responseBodyRef);
				
				T2Reference statusRef = referenceService.register("200 OK", 0, true, context);
				outputs.put(OUT_STATUS, statusRef);
				
				T2Reference redirectionRef = referenceService.register("redirection", 0, true, context);
				outputs.put(OUT_REDIRECTION, redirectionRef);
				
				
				// return map of output data, with empty index array as this is
				// the only and final result (this index parameter is used if
				// pipelining output)
				callback.receiveResult(outputs, new int[0]);
			}
		});
	}

}