package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.service_panel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.Icon;

import org.apache.log4j.Logger;

import com.thoughtworks.xstream.XStream;

import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;
import net.sf.taverna.t2.servicedescriptions.ServiceDescription;
import net.sf.taverna.t2.servicedescriptions.ServiceDescriptionProvider;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.BioCataloguePerspective;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.config.BioCataloguePluginConfiguration;

public class BioCatalogueServiceProvider implements ServiceDescriptionProvider
{
  public static final String PROVIDER_NAME = "BioCatalogue - selected services";
  
  private static BioCatalogueServiceProvider instanceOfSelf = null;
  private static FindServiceDescriptionsCallBack callBack;
  
  private static List<SoapOperationIdentity> registeredSOAPOperations;
  
  private static Logger logger = Logger.getLogger(BioCatalogueServiceProvider.class);
  
  
	public BioCatalogueServiceProvider() {
	  BioCatalogueServiceProvider.instanceOfSelf = this;
	}
	
	@SuppressWarnings("unchecked")
  public void findServiceDescriptionsAsync(FindServiceDescriptionsCallBack callBack)
	{
		BioCatalogueServiceProvider.callBack = callBack;
    callBack.status("Starting BioCatalogue Service Provider");
		
    // --- Initilise the service provider with stored services ---
    
    // read stored settings
    // NB! it's crucial to set the custom classloader, otherwise XStream would fail,
    //     as it would attempt to use the default one, which wouldn't know about the
    //     plugin's classes
    logger.info("Starting to deserialise the list of services stored in the configuration file");
    XStream xstream = new XStream();
    xstream.setClassLoader(BioCataloguePerspective.class.getClassLoader());
    
    BioCataloguePluginConfiguration configuration = BioCataloguePluginConfiguration.getInstance();
    String loadedSOAPServicesXMLString = configuration.getProperty(BioCataloguePluginConfiguration.SOAP_OPERATIONS_IN_SERVICE_PANEL);
    
    Object loadedSOAPServices = (loadedSOAPServicesXMLString == null ?
                                 null :
                                 xstream.fromXML(loadedSOAPServicesXMLString));
    
    registeredSOAPOperations = (loadedSOAPServices == null || !(loadedSOAPServices instanceof List<?>) ?
                                new ArrayList<SoapOperationIdentity>() :
                                (List<SoapOperationIdentity>)loadedSOAPServices
                               );
    logger.info("Deserialisation complete - loaded " + registeredSOAPOperations.size() + "SOAP operations");
    
    // prepare the correct format of data for initialisation
		List<ServiceDescription> results = new ArrayList<ServiceDescription>();
		for (SoapOperationIdentity opId : registeredSOAPOperations) {
		  results.add(new WSDLServiceDescFromBioCatalogue(opId));
		}
		
		// send the services to the Service Panel
		callBack.partialResults(results);
		
		
		// NB! This is to be called when it is known that no more items will be added - 
		// it's never true for this provider, as items may be added on user request
		// at any time!
		//
		// callBack.finished();
	}
	
	public Icon getIcon() {
		return null;
	}
	
	public String getName(){
	  // TODO - not sure where this is used
		return "My dummy service";
	}
	
	public String getId() {
    return "http://www.taverna.org.uk/2010/services/biocatalogue";
  }
	
	
	/**
	 * Adds a new "processor" - i.e. a WSDL operation into the main Service Panel.
	 * 
	 * @param wsdlLocation URL of the WSDL location of the operation to add.
	 * @param operationName Name of the operation within specified WSDL document.
	 * @return True if the operation was added;
	 *         false if the service provided was not yet initiliased (unlikely) or
	 *         when supplied strings were empty/null.
	 */
	public static boolean registerNewWSDLOperation(SoapOperationIdentity soapOperationDetails)
	{
	  if (BioCatalogueServiceProvider.instanceOfSelf == null || soapOperationDetails == null ||
	      soapOperationDetails.getWsdlLocation() == null || soapOperationDetails.getWsdlLocation().length() == 0 ||
	      soapOperationDetails.getOperationName() == null || soapOperationDetails.getOperationName().length() == 0)
	  {
	    // the service provider hasn't been initialised yet
	    // OR not all details available
	    return (false);
	  }
	  else
	  {
	    // record the newly added operation in the internal list
	    registeredSOAPOperations.add(soapOperationDetails);
	    
	    // add the provided operation to the Service Panel
	    ServiceDescription service = new WSDLServiceDescFromBioCatalogue(soapOperationDetails);
	    BioCatalogueServiceProvider.callBack.partialResults(Collections.singletonList(service));
	    return (true);
	  }
	    
	}
	
	
	public static List<SoapOperationIdentity> getRegistereSOAPOperations() {
	  return (registeredSOAPOperations);
	}
  
	
}
