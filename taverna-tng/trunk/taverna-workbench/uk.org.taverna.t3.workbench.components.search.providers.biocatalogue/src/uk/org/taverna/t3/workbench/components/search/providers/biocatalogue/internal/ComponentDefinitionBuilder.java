package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.biocatalogue.x2009.xml.rest.SoapInput;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.SoapOutput;

import uk.org.taverna.t3.workbench.components.definitions.ComponentDefinitionUtil;
import uk.org.taverna.t3.workbench.components.definitions.model.ActivityRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortMapping;
import uk.org.taverna.t3.workbench.components.definitions.model.SourceRef;

public class ComponentDefinitionBuilder {
	
	private static final String TAVERNA_ACTIVITY_URI = "http://ns.taverna.org.uk/2010/activity/wsdl";

	private ActivityRef tavernaActivity;
	
	public ComponentDefinitionBuilder() {
		tavernaActivity = new ActivityRef();
		try {
			tavernaActivity.setType(new URI(TAVERNA_ACTIVITY_URI));
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new RuntimeException("Internal error - failed to set up the ComponentDefinitionBuilder for the myExperiment search provider");
		}
	}
	
	public ComponentDefinition buildComponentDefinition(SoapOperation op) {
		ComponentDefinition cd = new ComponentDefinition();
		
		cd.setId(ComponentDefinitionUtil.generateNewId());
		cd.setLabel(op.getName());
		cd.setTitle(op.getName());
		cd.setTavernaActivity(tavernaActivity);
		cd.setDescription(op.getDescription());
		
		// Set source to point to the original BioCatalogue SOAP operation entry
		SourceRef source = new SourceRef();
		URL sourceUrl;
		try {
			sourceUrl = new URL(op.getHref());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			sourceUrl = null;
		}
		source.setResource(sourceUrl);
		source.setTitle(op.getName());
		
		// Inputs and outputs
		
		// TODO: it may be worth at this stage checking the WSDL for any updates to the ports, etc.
		
		for (SoapInput input : op.getInputs().getSoapInputList()) {
			PortDefinition portDef = new PortDefinition();
			
			portDef.setRelativeId("ports/inputs/" + input.getName());
			portDef.setName(input.getName());
			portDef.setLabel(input.getName());
			portDef.setDescription(input.getDescription());
			portDef.setDepth(0);		// FIXME: this is just an assumption, for now. Need to check the SOAP op for the type and determine whether it's a list or not
			portDef.setVisible(true);
			
			URI dataType = null;
			try {
				dataType = new URI(input.getComputationalType());
			} catch (URISyntaxException e) {
				System.out.println("No valid computation type detected");
			}
			if (dataType != null) {
				portDef.getDataTypes().add(dataType);
			}
			
			// TODO: get examples
			
			PortMapping mapping = new PortMapping();
			mapping.setToProcessorPort(true);
			mapping.setNewProcessorPort(input.getName());
			
			cd.getPorts().getInputs().add(portDef);
		}
		
		for (SoapOutput output : op.getOutputs().getSoapOutputList()) {
			PortDefinition portDef = new PortDefinition();
			
			portDef.setRelativeId("ports/outputs/" + output.getName());
			portDef.setName(output.getName());
			portDef.setLabel(output.getName());
			portDef.setDescription(output.getDescription());
			portDef.setDepth(0);		// FIXME: this is just an assumption, for now. Need to check the SOAP op for the type and determine whether it's a list or not
			portDef.setVisible(true);
			
			URI dataType = null;
			try {
				dataType = new URI(output.getComputationalType());
			} catch (URISyntaxException e) {
				System.out.println("No valid computation type detected");
			}
			if (dataType != null) {
				portDef.getDataTypes().add(dataType);
			}
			
			// TODO: get examples
			
			PortMapping mapping = new PortMapping();
			mapping.setToProcessorPort(true);
			mapping.setNewProcessorPort(output.getName());
			
			cd.getPorts().getOutputs().add(portDef);
		}
		
		return cd;
	}
	
}
