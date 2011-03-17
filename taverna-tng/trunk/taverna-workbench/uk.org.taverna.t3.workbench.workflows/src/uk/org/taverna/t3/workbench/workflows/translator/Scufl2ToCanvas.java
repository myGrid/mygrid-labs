package uk.org.taverna.t3.workbench.workflows.translator;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedSet;

import org.eclipse.emf.common.util.EList;

import uk.org.taverna.scufl2.api.activity.Activity;
import uk.org.taverna.scufl2.api.common.Scufl2Tools;
import uk.org.taverna.scufl2.api.common.URITools;
import uk.org.taverna.scufl2.api.configurations.Configuration;
import uk.org.taverna.scufl2.api.container.WorkflowBundle;
import uk.org.taverna.scufl2.api.core.DataLink;
import uk.org.taverna.scufl2.api.core.Processor;
import uk.org.taverna.scufl2.api.core.Workflow;
import uk.org.taverna.scufl2.api.iterationstrategy.CrossProduct;
import uk.org.taverna.scufl2.api.iterationstrategy.DotProduct;
import uk.org.taverna.scufl2.api.iterationstrategy.IterationStrategyNode;
import uk.org.taverna.scufl2.api.iterationstrategy.IterationStrategyStack;
import uk.org.taverna.scufl2.api.iterationstrategy.IterationStrategyTopNode;
import uk.org.taverna.scufl2.api.iterationstrategy.PortNode;
import uk.org.taverna.scufl2.api.port.InputProcessorPort;
import uk.org.taverna.scufl2.api.port.InputWorkflowPort;
import uk.org.taverna.scufl2.api.port.OutputProcessorPort;
import uk.org.taverna.scufl2.api.port.OutputWorkflowPort;
import uk.org.taverna.scufl2.api.port.ReceiverPort;
import uk.org.taverna.scufl2.api.port.SenderPort;
import uk.org.taverna.scufl2.api.profiles.ProcessorBinding;
import uk.org.taverna.scufl2.api.profiles.Profile;
import uk.org.taverna.scufl2.api.property.PropertyLiteral;
import uk.org.taverna.scufl2.api.property.PropertyObject;
import uk.org.taverna.scufl2.api.property.PropertyReference;
import uk.org.taverna.scufl2.api.property.PropertyResource;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference;
import uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyPortNode;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Port;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Sender;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput;

public class Scufl2ToCanvas {

	private static final URI NESTED_WORKFLOW_URI = URI.create("http://ns.taverna.org.uk/2010/activity/nested-workflow");
	private final static CanvasFactory canvasFactory = CanvasFactory.eINSTANCE;
	private final static Scufl2Tools scufl2Tools = new Scufl2Tools();
	private final static URITools uriTools = new URITools();

	public static Canvas translate(WorkflowBundle workflowBundle) {
		return translate(workflowBundle, workflowBundle.getMainWorkflow(),
				workflowBundle.getMainProfile());
	}

	public static Canvas translate(WorkflowBundle workflowBundle, Workflow workflow, Profile profile) {
		Map<uk.org.taverna.scufl2.api.port.Port, Port> ports = new HashMap<uk.org.taverna.scufl2.api.port.Port, Port>();

		// create canvas
		Canvas canvas = canvasFactory.createCanvas();

		// add inputs
		for (InputWorkflowPort inputWorkflowPort : workflow.getInputPorts()) {
			WorkflowInput workflowInput = createWorkflowInput(inputWorkflowPort);
			canvas.getInputs().add(workflowInput);
			ports.put(inputWorkflowPort, workflowInput);
		}

		// add outputs
		for (OutputWorkflowPort outputWorkflowPort : workflow.getOutputPorts()) {
			WorkflowOutput workflowOutput = createWorkflowOutput(outputWorkflowPort);
			canvas.getOutputs().add(workflowOutput);
			ports.put(outputWorkflowPort, workflowOutput);
		}

		// add components
		for (Processor processor : workflow.getProcessors()) {
			canvas.getComponents().add(createComponent(workflowBundle, profile, processor, ports));
		}

		// add receiver ports
		Map<Sender, List<DataLink>> receiverMap = new HashMap<Sender, List<DataLink>>();
		for (DataLink dataLink : workflow.getDataLinks()) {
			SenderPort receivesFrom = dataLink.getReceivesFrom();
			ReceiverPort sendsTo = dataLink.getSendsTo();
			Sender sender = (Sender) ports.get(receivesFrom);
			Receiver receiver = (Receiver) ports.get(sendsTo);
			EList<Receiver> receivers = sender.getReceivers();
			if (dataLink.getMergePosition() == null) {
				receivers.add(receiver);
			} else {
				if (receiverMap.get(sender) == null) {
					receiverMap.put(sender, new ArrayList<DataLink>());
				}
				receiverMap.get(sender).add(dataLink);
			}
		}
		for (Entry<Sender, List<DataLink>> entry : receiverMap.entrySet()) {
			Sender sender = entry.getKey();
			List<DataLink> receivers = entry.getValue();
			Collections.sort(receivers);
			for (DataLink dataLink : receivers) {
				ReceiverPort sendsTo = dataLink.getSendsTo();
				Receiver receiver = (Receiver) ports.get(sendsTo);
				sender.getReceivers().add(receiver);
			}
		}
		return canvas;
	}

	private static Component createComponent(WorkflowBundle workflowBundle, Profile profile,
			Processor processor, Map<uk.org.taverna.scufl2.api.port.Port, Port> ports) {
		Component component = canvasFactory.createComponent();
		component.setLabel(processor.getName());

		List<ProcessorBinding> processorBindings = scufl2Tools.processorBindingsForProcessor(
				processor, profile);

		for (ProcessorBinding processorBinding : processorBindings) {
			Activity activity = processorBinding.getBoundActivity();
			URI activityType = activity.getConfigurableType();

			Configuration configuration = scufl2Tools.configurationFor(activity, profile);

			if (activityType.equals(NESTED_WORKFLOW_URI)) {
				// TODO how do we map nested workflows?
				// try {
				// PropertyReference propertyReference =
				// configuration.getPropertyResource()
				// .getPropertyAsReference(NESTED_WORKFLOW_URI.resolve("#workflow"));
				// URI dataflowURI = propertyReference.getResourceURI();
				// Workflow nestedWorkflow = (Workflow)
				// uriTools.resolveUri(dataflowURI,
				// workflowBundle);
				//
				// for (InputActivityPort inputActivityPort :
				// activity.getInputPorts()) {
				// ComponentInput componentInput =
				// canvasFactory.createComponentInput();
				// componentInput.setName(inputActivityPort.getName());
				// componentInput.setLabel(inputActivityPort.getName());
				// componentInput.setDepth(inputActivityPort.getDepth());
				// component.getComponentInputs().add(componentInput);
				// }
				//
				// for (OutputActivityPort outputActivityPort :
				// activity.getOutputPorts()) {
				// ComponentOutput componentOutput =
				// canvasFactory.createComponentOutput();
				// componentOutput.setName(outputActivityPort.getName());
				// componentOutput.setLabel(outputActivityPort.getName());
				// componentOutput.setDepth(outputActivityPort.getDepth());
				// component.getComponentOutputs().add(componentOutput);
				// }
				//
				// NamedSet<Processor> nestedProcessors =
				// nestedWorkflow.getProcessors();
				// for (Processor nestedProcessor : nestedProcessors) {
				// }
				// } catch (UnexpectedPropertyException e) {
				// e.printStackTrace();
				// } catch (PropertyNotFoundException e) {
				// e.printStackTrace();
				// } catch (MultiplePropertiesException e) {
				// e.printStackTrace();
				// }
			} else {
				// create processor
				uk.org.taverna.t3.workbench.canvas.models.canvas.Processor canvasProcessor = canvasFactory
						.createProcessor();
				canvasProcessor.setName(processor.getName());
				canvasProcessor.setLabel(processor.getName());
				canvasProcessor.setActivitiy(activityType.toString());

				// add inputs
				for (InputProcessorPort inputProcessorPort : processor.getInputPorts()) {
					ProcessorInput processorInput = canvasFactory.createProcessorInput();
					processorInput.setName(inputProcessorPort.getName());
					processorInput.setLabel(inputProcessorPort.getName());
					processorInput.setDepth(inputProcessorPort.getDepth());
					canvasProcessor.getProcessorInputs().add(processorInput);
					ports.put(inputProcessorPort, processorInput);

					ComponentInput componentInput = canvasFactory.createComponentInput();
					componentInput.setName(inputProcessorPort.getName());
					componentInput.setLabel(inputProcessorPort.getName());
					componentInput.setDepth(inputProcessorPort.getDepth());
					componentInput.getReceivers().add(processorInput);
					component.getComponentInputs().add(componentInput);
				}

				// add outputs
				for (OutputProcessorPort outputProcessorPort : processor.getOutputPorts()) {
					ComponentOutput componentOutput = canvasFactory.createComponentOutput();
					componentOutput.setName(outputProcessorPort.getName());
					componentOutput.setLabel(outputProcessorPort.getName());
					componentOutput.setDepth(outputProcessorPort.getDepth());
					component.getComponentOutputs().add(componentOutput);

					ProcessorOutput processorOutput = canvasFactory.createProcessorOutput();
					processorOutput.setName(outputProcessorPort.getName());
					processorOutput.setLabel(outputProcessorPort.getName());
					processorOutput.setDepth(outputProcessorPort.getDepth());
					processorOutput.setGranularDepth(outputProcessorPort.getGranularDepth());
					processorOutput.getReceivers().add(componentOutput);
					canvasProcessor.getProcessorOutputs().add(processorOutput);
					ports.put(outputProcessorPort, processorOutput);
				}

				// add iteration strategy
				IterationStrategyStack iterationStrategyStack = processor
						.getIterationStrategyStack();
				uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyStack canvasIterationStrategyStack = canvasFactory
						.createIterationStrategyStack();
				for (IterationStrategyTopNode iterationStrategyTopNode : iterationStrategyStack) {
					canvasIterationStrategyStack
							.getStrategies()
							.add((uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyTopNode) createIterationStrategyNode(
									iterationStrategyTopNode, canvasProcessor));
				}
				canvasProcessor.setIterationStrategyStack(canvasIterationStrategyStack);

				// add configuration properties
				addProperties(component.getConfigurationProperties(), configuration.getPropertyResource());
				
				// add the processor to the component
				component.getProcessors().add(canvasProcessor);
			}
			// TODO handle multiple activities
			break;
		}

		return component;
	}

	private static void addProperties(List<ConfigurationProperty> configurationProperties, PropertyResource propertyResource) {
		for (Entry<URI, SortedSet<PropertyObject>> entry : propertyResource.getProperties().entrySet()) {
			URI predicate = entry.getKey();
			for (PropertyObject property : entry.getValue()) {
				if (property instanceof PropertyLiteral) {
					PropertyLiteral propertyLiteral = (PropertyLiteral) property;
					ConfigurationPropertyLiteral literal = canvasFactory.createConfigurationPropertyLiteral();
					literal.setPredicate(predicate.toString());
					literal.setDataType(propertyLiteral.getLiteralType().toString());
					literal.setValue(propertyLiteral.getLiteralValue());
					configurationProperties.add(literal);
				} else if (property instanceof PropertyReference) {
					PropertyReference propertyReference = (PropertyReference) property;
					ConfigurationPropertyReference reference = canvasFactory.createConfigurationPropertyReference();
					reference.setPredicate(predicate.toString());
					if (propertyReference.getResourceURI() != null) {
						reference.setUri(propertyReference.getResourceURI().toString());
					}
					configurationProperties.add(reference);
				} else if (property instanceof PropertyResource) {
					ConfigurationPropertyComplex complex = canvasFactory.createConfigurationPropertyComplex();
					complex.setPredicate(predicate.toString());
					addProperties(complex.getProperties(), (PropertyResource) property);
					configurationProperties.add(complex);
				}
			}
		}
	}

	private static uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyNode createIterationStrategyNode(
			IterationStrategyNode iterationStrategyNode,
			uk.org.taverna.t3.workbench.canvas.models.canvas.Processor canvasProcessor) {
		uk.org.taverna.t3.workbench.canvas.models.canvas.IterationStrategyNode canvasIterationStrategyNode = null;
		if (iterationStrategyNode instanceof CrossProduct) {
			CrossProduct crossProduct = (CrossProduct) iterationStrategyNode;
			uk.org.taverna.t3.workbench.canvas.models.canvas.CrossProduct canvasCrossProduct = canvasFactory
					.createCrossProduct();
			canvasIterationStrategyNode = canvasCrossProduct;
			for (IterationStrategyNode iterationStrategyNode2 : crossProduct) {
				canvasCrossProduct.getNodes().add(
						createIterationStrategyNode(iterationStrategyNode2, canvasProcessor));
			}
		} else if (iterationStrategyNode instanceof DotProduct) {
			DotProduct dotProduct = (DotProduct) iterationStrategyNode;
			uk.org.taverna.t3.workbench.canvas.models.canvas.DotProduct canvasDotProduct = canvasFactory
					.createDotProduct();
			canvasIterationStrategyNode = canvasDotProduct;
			for (IterationStrategyNode iterationStrategyNode2 : dotProduct) {
				canvasDotProduct.getNodes()
						.add(createIterationStrategyNode(iterationStrategyNode2, canvasProcessor));
			}
		} else if (iterationStrategyNode instanceof PortNode) {
			PortNode portNode = (PortNode) iterationStrategyNode;
			IterationStrategyPortNode canvasPortNode = canvasFactory
					.createIterationStrategyPortNode();
			canvasIterationStrategyNode = canvasPortNode;
			InputProcessorPort inputProcessorPort = portNode.getInputProcessorPort();
			EList<ProcessorInput> processorInputs = canvasProcessor.getProcessorInputs();
			for (ProcessorInput processorInput : processorInputs) {
				if (processorInput.getName().equals(inputProcessorPort.getName())) {
					canvasPortNode.setPort(processorInput);
					break;
				}
			}
			Integer desiredDepth = portNode.getDesiredDepth();
			if (desiredDepth == null) {
				canvasPortNode.setDesiredDepth(-1);
			} else {
				canvasPortNode.setDesiredDepth(desiredDepth);
			}
		}

		return canvasIterationStrategyNode;
	}

	private static WorkflowOutput createWorkflowOutput(OutputWorkflowPort outputWorkflowPort) {
		WorkflowOutput workflowOutput = canvasFactory.createWorkflowOutput();
		workflowOutput.setName(outputWorkflowPort.getName());
		workflowOutput.setLabel(outputWorkflowPort.getName());
		return workflowOutput;
	}

	private static WorkflowInput createWorkflowInput(InputWorkflowPort inputWorkflowPort) {
		WorkflowInput workflowInput = canvasFactory.createWorkflowInput();
		workflowInput.setName(inputWorkflowPort.getName());
		workflowInput.setLabel(inputWorkflowPort.getName());
		workflowInput.setDepth(inputWorkflowPort.getDepth());
		return workflowInput;
	}

}
