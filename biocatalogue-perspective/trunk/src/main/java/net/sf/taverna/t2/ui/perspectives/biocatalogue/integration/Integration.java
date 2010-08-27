package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.RestMethod;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.SoapService;

import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;
import net.sf.taverna.biocatalogue.model.SoapOperationPortIdentity;
import net.sf.taverna.biocatalogue.model.SoapProcessorIdentity;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;
import net.sf.taverna.t2.activities.rest.ui.servicedescription.GenericRESTTemplateService;
import net.sf.taverna.t2.activities.rest.ui.servicedescription.RESTServiceDescription;
import net.sf.taverna.t2.activities.wsdl.WSDLActivity;
import net.sf.taverna.t2.activities.wsdl.servicedescriptions.WSDLServiceDescription;
import net.sf.taverna.t2.lang.ui.ModelMap;
import net.sf.taverna.t2.ui.menu.ContextualSelection;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.service_panel.BioCatalogueServiceProvider;
import net.sf.taverna.t2.workbench.MainWindow;
import net.sf.taverna.t2.workbench.ModelMapConstants;
import net.sf.taverna.t2.workbench.file.FileManager;
import net.sf.taverna.t2.workbench.ui.workflowview.WorkflowView;
import net.sf.taverna.t2.workflowmodel.Dataflow;
import net.sf.taverna.t2.workflowmodel.Port;
import net.sf.taverna.t2.workflowmodel.Processor;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityInputPort;
import net.sf.taverna.t2.workflowmodel.processor.activity.ActivityOutputPort;
import net.sf.taverna.t2.workflowmodel.utils.Tools;

/**
 * This class contains helpers for deeper integration with Taverna UI.
 * 
 * @author Sergejs Aleksejevs
 */
public class Integration
{
  private static final Logger logger = Logger.getLogger(Integration.class);
  
  
  // deny instantiation of this class
  private Integration() { }
  
  
  /**
   * Adds a processor to the current workflow.
   * The processor is specified by WSDL location and the operation name.
   * 
   * @param processorResource Resource to add to the current workflow.
   * @return Outcome of inserting the processor into the current workflow as a
   *         HTML-formatted string (with no opening and closing HTML tags).
   */
  public static JComponent insertProcessorIntoCurrentWorkflow(ResourceLink processorResource)
  {
    // check if this type of resource can be added to workflow diagram
    TYPE resourceType = Resource.getResourceTypeFromResourceURL(processorResource.getHref());
    if (resourceType.isSuitableForAddingToWorkflowDiagram()) {
      switch (resourceType) {
        case SOAPOperation:
          SoapOperation soapOp = (SoapOperation) processorResource;
          try {
            SoapService soapService = MainComponentFactory.getSharedInstance().getBioCatalogueClient().
                                        getBioCatalogueSoapService(soapOp.getAncestors().getSoapService().getHref());
            
            try {
              WSDLServiceDescription myServiceDescription = new WSDLServiceDescription();
              myServiceDescription.setOperation(soapOp.getName());
              myServiceDescription.setUse("literal"); // or "encoded"
              myServiceDescription.setStyle("document"); // or "rpc"
              myServiceDescription.setURI(new URI(soapService.getWsdlLocation()));
              myServiceDescription.setDescription("My WSDL operation 123");  // TODO - not sure where this is used
              
              WorkflowView.importServiceDescription(myServiceDescription, false);
              
              return (new JLabel("Selected SOAP operation was successfully added as a processor",
                                 ResourceManager.getImageIcon(ResourceManager.TICK_ICON), JLabel.CENTER));
            }
            catch (URISyntaxException e)
            {
              logger.error("Couldn't add SOAP service to the current workflow", e);
              return (new JLabel("<html>Could not add the selected SOAP operation as a processor to the current workflow.<br>" +
                                    		"Log file will containt additional details about this error.</html>",
                                    		ResourceManager.getImageIcon(ResourceManager.ERROR_ICON), JLabel.CENTER));
            }
            
          }
          catch (Exception e) {
            logger.error("Failed to fetch required details to add this processor into the current workflow.", e);
            return (new JLabel("<html>Failed to fetch required details to add this<br>" +
                                  		"processor into the current workflow.</html>",
                                      ResourceManager.getImageIcon(ResourceManager.ERROR_ICON), JLabel.CENTER));
          }
          
        case RESTMethod:
          // received object may only contain limited data, therefore need to fetch full details first
          try {
            RestMethod restMethod = MainComponentFactory.getSharedInstance().getBioCatalogueClient().
                                                getBioCatalogueRestMethod(processorResource.getHref());
            
            RESTServiceDescription restServiceDescription = new RESTServiceDescription();
            restServiceDescription.setHttpMethod(HTTP_METHOD.GET); // HACK - FIXME: need a proper method, not hardcoded
            restServiceDescription.setURLSignature(restMethod.getUrlTemplate());
            
            
            String warnings = "";
            int outputRepresentationCount = restMethod.getOutputs().getRepresentations().getRestRepresentationList().size();
            if (outputRepresentationCount > 0) {
              if (outputRepresentationCount > 1) {
                warnings += "<br><br>BioCatalogue description of this REST method contains more than one<br>" +
                		                "representation of the method's outputs - the first one was used.<br>" +
                		                "Please check value of the 'Accept' header in the configuration<br>" +
                		                "of the imported processor.";
              }
              restServiceDescription.setAcceptHeaderValue(restMethod.getOutputs().getRepresentations().getRestRepresentationList().get(0).getContentType());
            }
            else {
              warnings += "<br><br>BioCatalogue description of this REST method does not contain any<br>" +
                                  "representations of the method's outputs - default value was used.<br>" +
                                  "Please check value of the 'Accept' header in the configuration<br>" +
                                  "of the imported processor.";
            }
            
            int inputRepresentationCount = restMethod.getInputs().getRepresentations().getRestRepresentationList().size();
            if (inputRepresentationCount > 0) {
              if (inputRepresentationCount > 1) {
                warnings += "<br><br>BioCatalogue description of this REST method contains more than one<br>" +
                                    "representation of the method's input data - the first one was used.<br>" +
                                    "Please check value of the 'Content-Type' header in the configuration<br>" +
                                    "of the imported processor.";
              }
              restServiceDescription.setOutgoingContentType(restMethod.getInputs().getRepresentations().getRestRepresentationList().get(0).getContentType());
            }
            else /* FIXME - should not apply for GET and DELETE */ {
              warnings += "<br><br>BioCatalogue description of this REST method does not contain any<br>" +
                                  "representations of the method's input data - default value was used.<br>" +
                                  "Please check value of the 'Content-Type' header in the configuration<br>" +
                                  "of the imported processor.";
            }
            
            
            WorkflowView.importServiceDescription(restServiceDescription, false);
            
            if (warnings.length() > 0) {
              warnings = ".<br><br>WARNINGS:" + warnings;
            }
            JLabel outcomes = new JLabel("<html>Selected REST method was successfully added as a processor" + warnings + "</html>",
                                         ResourceManager.getImageIcon(warnings.length() > 0 ? ResourceManager.WARNING_ICON : ResourceManager.TICK_ICON),
                                         JLabel.CENTER);
            outcomes.setIconTextGap(20);
            return (outcomes);
          }
          catch (Exception e) {
            logger.error("Failed to fetch required details to add this REST method as a processor into the current workflow.", e);
            return (new JLabel("<html>Failed to fetch required details to add this REST method<br>" +
            		                      "as a processor into the current workflow.</html>",
                                      ResourceManager.getImageIcon(ResourceManager.ERROR_ICON), JLabel.CENTER));
          }
        
        // type not currently supported, but maybe in the future?
        default: return (new JLabel("Adding " + resourceType.getCollectionName() + " to the current workflow is not yet possible",
                                     ResourceManager.getImageIcon(ResourceManager.ERROR_ICON), JLabel.CENTER));
      }
    }
    
    // definitely not supported type
    return (new JLabel("<html>It is not possible to add resources of the provided type<br>" +
                              "into the current workflow.</html>",
                              ResourceManager.getImageIcon(ResourceManager.ERROR_ICON), JLabel.CENTER));
  }
  
  
  public static void insertProcesorIntoServicePanel(ResourceLink processorResource)
  {
    // check if this type of resource can be added to Service Panel
    TYPE resourceType = Resource.getResourceTypeFromResourceURL(processorResource.getHref());
    if (resourceType.isSuitableForAddingToServicePanel()) {
      switch (resourceType) {
        case SOAPOperation:
          SoapOperation soapOp = (SoapOperation) processorResource;
          try {
            SoapService soapService = MainComponentFactory.getSharedInstance().getBioCatalogueClient().
                                        getBioCatalogueSoapService(soapOp.getAncestors().getSoapService().getHref());
            SoapOperationIdentity soapOpId = new SoapOperationIdentity(soapService.getWsdlLocation(), soapOp.getName());
            BioCatalogueServiceProvider.registerNewWSDLOperation(soapOpId);
            break;
          }
          catch (Exception e) {
            JOptionPane.showMessageDialog(MainWindow.getMainWindow(), "Failed to fetch required details to add this " +
                "processor into the Service Panel.", "BioCatalogue Plugin", JOptionPane.ERROR_MESSAGE);
            logger.error("Failed to fetch required details to add this processor into the Service Panel.", e);
          }
          
        case RESTMethod:
        
        default: JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
                  "Adding " + resourceType.getCollectionName() + " to the Service Panel is not yet possible",
                  "BioCatalogue Plugin", JOptionPane.ERROR_MESSAGE);
                  break;
      }
    }
  }
  
  
  
  
  /**
   * @param activityPort Probably comes from contextual selection - must be either
   *         ActivityInputPort or ActivityOutputPort.
   * @return SOAP input / output port details (WSDL location, operation name, port name) from
   *         ActivityInputPort/ActivityOutputPort which is obtained from contextual selection in the Dataflow.
   */
  public static <T extends Port> SoapOperationPortIdentity extractSoapOperationPortDetailsFromActivityInputOutputPort(T activityPort)
  {
    // check that we have the correct instance of Port here - either ActivityInputPort or ActivityOutputPort
    boolean hasInputPort;
    if (activityPort instanceof ActivityInputPort) {
      hasInputPort = true;
    }
    else if (activityPort instanceof ActivityOutputPort) {
      hasInputPort = false;
    }
    else {
      // ERROR - wrong type supplied
      return new SoapOperationPortIdentity("Activity port from the contextual selection was not of correct type. Impossible to create preview.");
    }
    
    // get parent processor details
    Dataflow currentDataflow = FileManager.getInstance().getCurrentDataflow();
    Collection<Processor> processors = null;
    if (hasInputPort) {
      processors = Tools.getProcessorsWithActivityInputPort(currentDataflow, (ActivityInputPort)activityPort);
    }
    else {
      processors = Tools.getProcessorsWithActivityOutputPort(currentDataflow, (ActivityOutputPort)activityPort);
    }
    
    // TODO - doesn't take into account that it's possible to have several
    SoapOperationIdentity soapOperationDetails = extractSoapOperationDetailsFromProcessor(processors.toArray(new Processor[]{})[0]);
    
    // if no error happened, add port details and return
    if (!soapOperationDetails.hasError()) {
      return (new SoapOperationPortIdentity(soapOperationDetails.getWsdlLocation(),
                                             soapOperationDetails.getOperationName(),
                                             activityPort.getName(), hasInputPort));
    }
    else {
      // error...
      return (new SoapOperationPortIdentity(soapOperationDetails.getErrorDetails()));
    }
  }
  
  
  /**
   * Uses contextual selection to extract WSDL location and operation name of the
   * currently selected processor within the Design view of current workflow. 
   * 
   * @param contextualSelection Selection that was made in the Design view.
   * @return Details of the SOAP operation that acts as a processor wrapped into
   *         this single instance. If any problems occurred while performing
   *         contextual selection analysis, these are also recorded into the same
   *         instance - before using the returned value the caller must check
   *         <code>SoapOperationIdentity.hasError()</code> value.
   */
  public static SoapOperationIdentity extractSoapOperationDetailsFromProcessorContextualSelection(ContextualSelection contextualSelection)
  {
    if (!(contextualSelection.getSelection() instanceof Processor)) {
      return (new SoapOperationIdentity("ERROR: It is only possible to extract " +
      		"SOAP operation details from a Processor."));
    }
    
    // now we know it's a Processor
    Processor processor = (Processor)contextualSelection.getSelection();
    return (extractSoapOperationDetailsFromProcessor(processor));
  }
  
  
  /**
   * Worker method for <code>extractSoapOperationDetailsFromProcessorContextualSelection()</code>.
   * 
   * @param processor
   * @return
   */
  public static SoapOperationIdentity extractSoapOperationDetailsFromProcessor(Processor processor)
  {
    List<? extends Activity> activityList = (List<? extends Activity>) processor.getActivityList();
    
    if (activityList == null || activityList.size() == 0) {
      return (new SoapOperationIdentity("ERROR: Selected processor doesn't have any activities - " +
          "impossible to extract SOAP operation details."));
    }
    else {
      // take only the first activity - TODO: figure out what should be done here...
      Activity activity = activityList.get(0);
      if (activity instanceof WSDLActivity) {
        WSDLActivity a = (WSDLActivity)activity;
        return (new SoapOperationIdentity(a.getConfiguration().getWsdl(), a.getConfiguration().getOperation()));
      }
      else {
        return (new SoapOperationIdentity("BioCatalogue Plugin only works with WSDL Activities at the moment"));
      }
    }
  }
  
  
  /**
   * @param contextualSelection
   * @return A list of all WSDL activities (the only supported processors by BioCatalogue plugin for now).
   */
  public static List<SoapProcessorIdentity> extractSupportedProcessorsFromDataflow(ContextualSelection contextualSelection)
  {
    // check that there was a correct contextual selection
    if (!(contextualSelection.getSelection() instanceof Dataflow)) {
      System.err.println("ERROR: It is only possible to extract supported all processors from a Dataflow.");
      return (new ArrayList<SoapProcessorIdentity>());
    }
    
    // first extract all processors
    Dataflow dataflow = (Dataflow)contextualSelection.getSelection();
    List<? extends Processor> allProcessors = dataflow.getEntities(Processor.class);
    
    // now filter out any processors that are not WSDL activities
    List<SoapProcessorIdentity> supportedProcessors = new ArrayList<SoapProcessorIdentity>();
    for (Processor proc : allProcessors) {
      List<? extends Activity> activityList = (List<? extends Activity>) proc.getActivityList();
      if (activityList != null && activityList.size() > 0) {
        // take only the first activity - TODO: figure out what should be done here...
        Activity activity = activityList.get(0);
        if (activity instanceof WSDLActivity) {
          WSDLActivity a = (WSDLActivity)activity;
          supportedProcessors.add(new SoapProcessorIdentity(a.getConfiguration().getWsdl(),
                                                            a.getConfiguration().getOperation(),
                                                            proc.getLocalName()));
        }
      }
    }
    
    // return all found processors
    return (supportedProcessors);
  }
  
}
