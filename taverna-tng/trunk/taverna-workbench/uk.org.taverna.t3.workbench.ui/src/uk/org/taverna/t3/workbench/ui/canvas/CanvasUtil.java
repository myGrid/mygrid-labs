package uk.org.taverna.t3.workbench.ui.canvas;

import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentDefinitionReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;

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
		
		// Processor
		
		Processor processor = CanvasFactory.eINSTANCE.createProcessor();
		processor.setActivitiy(cd.getTavernaActivity().getType().toString());
		processor.setLabel(cd.getLabel());
		processor.setName(cd.getLabel().replaceAll("\\s", "_").toLowerCase());
		
		// Reference to original component definition 
		
		ComponentDefinitionReference cdRef = CanvasFactory.eINSTANCE.createComponentDefinitionReference();
		cdRef.setComponentDefinitionId(cd.getId().toString());
		if (cd.getPublisher() != null)
			cdRef.setDiscoveryUrl(cd.getPublisher().getResource().toString());
		
		processor.setOriginalComponentDefinition(cdRef);
		
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

		return component;
	}

}
