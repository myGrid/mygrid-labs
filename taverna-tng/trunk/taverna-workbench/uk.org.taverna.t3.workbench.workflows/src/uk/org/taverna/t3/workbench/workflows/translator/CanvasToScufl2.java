package uk.org.taverna.t3.workbench.workflows.translator;

import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

import uk.org.taverna.scufl2.api.activity.Activity;
import uk.org.taverna.scufl2.api.container.WorkflowBundle;
import uk.org.taverna.scufl2.api.core.DataLink;
import uk.org.taverna.scufl2.api.core.Processor;
import uk.org.taverna.scufl2.api.core.Workflow;
import uk.org.taverna.scufl2.api.dispatchstack.DispatchStack;
import uk.org.taverna.scufl2.api.dispatchstack.DispatchStackLayer;
import uk.org.taverna.scufl2.api.port.InputProcessorPort;
import uk.org.taverna.scufl2.api.port.InputWorkflowPort;
import uk.org.taverna.scufl2.api.port.OutputProcessorPort;
import uk.org.taverna.scufl2.api.port.OutputWorkflowPort;
import uk.org.taverna.scufl2.api.port.ReceiverPort;
import uk.org.taverna.scufl2.api.port.SenderPort;
import uk.org.taverna.scufl2.api.profiles.Profile;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Port;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Sender;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput;

public class CanvasToScufl2 {

	private static final URI DISPATCH_LAYER = URI.create("http://ns.taverna.org.uk/2010/scufl2/taverna/dispatchlayer/");

	public WorkflowBundle translate(Canvas canvas) {
		Map<Port, uk.org.taverna.scufl2.api.port.Port> ports = new HashMap<Port, uk.org.taverna.scufl2.api.port.Port>();

		WorkflowBundle workflowBundle = new WorkflowBundle();

		Set<Workflow> workflows = new HashSet<Workflow>();
		workflowBundle.setWorkflows(workflows);

		Set<Profile> profiles = new HashSet<Profile>();
		workflowBundle.setProfiles(profiles);

		Workflow mainWorkflow = new Workflow();
		workflows.add(mainWorkflow);

		Profile mainProfile = new Profile();
		profiles.add(mainProfile);

		EList<WorkflowInput> inputs = canvas.getInputs();
		for (WorkflowInput workflowInput : inputs) {
			InputWorkflowPort inputWorkflowPort = new InputWorkflowPort(mainWorkflow,
					workflowInput.getName());
			inputWorkflowPort.setDepth(workflowInput.getDepth());
			ports.put(workflowInput, inputWorkflowPort);
		}

		EList<WorkflowOutput> outputs = canvas.getOutputs();
		for (WorkflowOutput workflowOutput : outputs) {
			OutputWorkflowPort outputWorkflowPort = new OutputWorkflowPort(mainWorkflow,
					workflowOutput.getName());
			ports.put(workflowOutput, outputWorkflowPort);
		}

		EList<Component> components = canvas.getComponents();
		for (Component component : components) {
			if (component.isCompound()) {
				Workflow workflow = createWorkflow(component.getComponentInputs(),
						component.getComponentOutputs(), component.getProcessors());
				workflows.add(workflow);
				Processor scuflProcessor = new Processor(workflow, "component.getName()");

			} else {
				createProcessor(mainWorkflow, component.getProcessors().get(0), ports);
			}
		}

		createDatalinks(mainWorkflow, ports);
		
		return workflowBundle;
	}

	public Workflow createWorkflow(List<? extends Port> inputs, List<? extends Port> outputs,
			List<uk.org.taverna.t3.workbench.canvas.models.canvas.Processor> processors) {
		Map<Port, uk.org.taverna.scufl2.api.port.Port> ports = new HashMap<Port, uk.org.taverna.scufl2.api.port.Port>();

		Workflow workflow = new Workflow();
		for (Port inputPort : inputs) {
			InputWorkflowPort inputWorkflowPort = new InputWorkflowPort(workflow,
					inputPort.getName());
			inputWorkflowPort.setDepth(inputPort.getDepth());
			ports.put(inputPort, inputWorkflowPort);
		}
		for (Port outputPort : outputs) {
			OutputWorkflowPort outputWorkflowPort = new OutputWorkflowPort(workflow,
					outputPort.getName());
			ports.put(outputPort, outputWorkflowPort);
		}
		for (uk.org.taverna.t3.workbench.canvas.models.canvas.Processor processor : processors) {
			createProcessor(workflow, processor, ports);
		}

		createDatalinks(workflow, ports);
		
		return workflow;
	}

	public Processor createProcessor(Workflow workflow,
			uk.org.taverna.t3.workbench.canvas.models.canvas.Processor canvasProcessor,
			Map<Port, uk.org.taverna.scufl2.api.port.Port> ports) {
		Processor scuflProcessor = new Processor(workflow, canvasProcessor.getName());

		EList<ProcessorInput> processorInputs = canvasProcessor.getProcessorInputs();
		for (ProcessorInput processorInput : processorInputs) {
			InputProcessorPort inputProcessorPort = new InputProcessorPort(scuflProcessor,
					processorInput.getName());
			inputProcessorPort.setDepth(processorInput.getDepth());
			ports.put(processorInput, inputProcessorPort);
		}

		EList<ProcessorOutput> processorOutputs = canvasProcessor.getProcessorOutputs();
		for (ProcessorOutput processorOutput : processorOutputs) {
			OutputProcessorPort outputProcessorPort = new OutputProcessorPort(scuflProcessor,
					processorOutput.getName());
			outputProcessorPort.setDepth(processorOutput.getDepth());
			outputProcessorPort.setGranularDepth(processorOutput.getGranularDepth());
			ports.put(processorOutput, outputProcessorPort);
		}

		DispatchStack dispatchStack = createDefaultDispatchStack();
		scuflProcessor.setDispatchStack(dispatchStack);
		
		Activity activity = new Activity(canvasProcessor.getName());
		activity.setConfigurableType(URI.create(canvasProcessor.getActivitiy()));

		Profile profile = new Profile();
		EList<ConfigurationProperty> configurationProperties = canvasProcessor
				.getConfigurationProperties();
		for (ConfigurationProperty configurationProperty : configurationProperties) {
			// TODO
		}

		return scuflProcessor;
	}

	public DispatchStack createDefaultDispatchStack() {
		DispatchStack dispatchStack = new DispatchStack();
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("Parallelise"));
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("ErrorBounce"));
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("Failover"));
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("Retry"));
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("Stop"));
		new DispatchStackLayer(dispatchStack, DISPATCH_LAYER.resolve("Invoke"));
		return dispatchStack;
	}

	public void createDatalinks(Workflow workflow, Map<Port, uk.org.taverna.scufl2.api.port.Port> ports) {
		for (Port port : ports.keySet()) {
			if (port instanceof Sender) {
				Sender sender = (Sender) port;
				EList<Receiver> receivers = sender.getReceivers();
				for (int i = 0; i < receivers.size(); i++) {
					Receiver receiver = receivers.get(i);
					DataLink dataLink = new DataLink(workflow, (SenderPort) ports.get(sender),
							(ReceiverPort) ports.get(receiver));
					if (receivers.size() > 1) {
						dataLink.setMergePosition(i);
					}
				}
			}
		}
	}

}
