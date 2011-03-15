package uk.org.taverna.t3.workbench.ui.canvas;

import java.util.ArrayList;
import java.util.List;

import uk.org.taverna.platform.activity.ActivityConfigurationException;
import uk.org.taverna.platform.activity.ActivityNotFoundException;
import uk.org.taverna.scufl2.api.configurations.ConfigurationDefinition;
import uk.org.taverna.scufl2.api.configurations.PropertyDefinition;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.ui.util.Services;

import com.google.common.base.Preconditions;

public class CanvasUtil {

	private CanvasUtil() {
		throw new AssertionError();
	}

	public static Component buildComponentFrom(ComponentDefinition cd) {
		Preconditions.checkNotNull(cd);
		
		final Component component = CanvasFactory.eINSTANCE.createComponent();
		
		component.setLabel(cd.getLabel());
		component.setTitle(cd.getTitle());
		
		// Reference to original component definition 
		
		ComponentDefinitionReference cdRef = CanvasFactory.eINSTANCE.createComponentDefinitionReference();
		cdRef.setComponentDefinitionId(cd.getId().toString());
		if (cd.getPublisher() != null)
			cdRef.setDiscoveryUrl(cd.getPublisher().getResource().toString());
		component.setOriginalComponentDefinition(cdRef);
		
		// Processor
		
		Processor processor = CanvasFactory.eINSTANCE.createProcessor();
		processor.setType(cd.getTavernaActivity().getType().toString());
		processor.setActivitiy(cd.getTavernaActivity().getType().toString());
		processor.setLabel(cd.getLabel());
		processor.setName(cd.getLabel().replaceAll("\\s", "_").toLowerCase());
		
		// Inputs and outputs
		
		for (PortDefinition portDef : cd.getPorts().getInputs()) {
			ProcessorInput port = CanvasFactory.eINSTANCE.createProcessorInput();
			port.setName(portDef.getName());
			port.setDepth(portDef.getDepth());
			processor.getProcessorInputs().add(port);
		}
		
		for (PortDefinition portDef : cd.getPorts().getOutputs()) {
			ProcessorOutput port = CanvasFactory.eINSTANCE.createProcessorOutput();
			port.setName(portDef.getName());
			port.setDepth(portDef.getDepth());
			processor.getProcessorOutputs().add(port);
		}
		
		component.getProcessors().add(processor);
		
		// Configuration Properties
		
		for (ConfigFieldDefinition field : resolveConfigFields(cd)) {
			
		}

		return component;
	}
	
	private static List<ConfigFieldDefinition> resolveConfigFields(ComponentDefinition cd) {
		List<ConfigFieldDefinition> fields = new ArrayList<ConfigFieldDefinition>();
		
		ConfigurationDefinition activityConfigurationDefinition = null;
		try {
			activityConfigurationDefinition = Services.getInstance().getActivityService().getActivityConfigurationDefinition(cd.getTavernaActivity().getType());
		} catch (ActivityNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ActivityConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (activityConfigurationDefinition != null) {
			List<PropertyDefinition> propertyDefinitions = activityConfigurationDefinition.getPropertyResourceDefinition().getPropertyDefinitions();
			// Can be:
			// - PropertyLiteralDefinition - string
			// - PropertyReferenceDefinition - reference to WSDL; reference to a nested wf within the SCUFL2
			// - PropertyResourceDefinition - a complex property bean
		}
		
		return fields;
	}

}
