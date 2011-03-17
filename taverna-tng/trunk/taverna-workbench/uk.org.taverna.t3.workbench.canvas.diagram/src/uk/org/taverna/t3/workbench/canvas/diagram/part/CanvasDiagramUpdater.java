package uk.org.taverna.t3.workbench.canvas.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentComponentCompartmentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.Processor2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ProcessorInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ProcessorOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.SenderReceiversEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Processor;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ProcessorOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Sender;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowOutput;

/**
 * @generated
 */
public class CanvasDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getSemanticChildren(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1000SemanticChildren(view);
		case Processor2EditPart.VISUAL_ID:
			return getProcessor_3001SemanticChildren(view);
		case ComponentComponentCompartmentEditPart.VISUAL_ID:
			return getComponentComponent_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCanvas_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Canvas modelElement = (Canvas) view.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			Component childElement = (Component) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			WorkflowOutput childElement = (WorkflowOutput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkflowOutputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			WorkflowInput childElement = (WorkflowInput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkflowInputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getProcessor_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Processor modelElement = (Processor) view.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessorInputs().iterator(); it
				.hasNext();) {
			ProcessorInput childElement = (ProcessorInput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProcessorInputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getProcessorOutputs().iterator(); it
				.hasNext();) {
			ProcessorOutput childElement = (ProcessorOutput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ProcessorOutputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getComponentComponent_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Component modelElement = (Component) containerView.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getProcessors().iterator(); it
				.hasNext();) {
			Processor childElement = (Processor) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Processor2EditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponentInputs().iterator(); it
				.hasNext();) {
			ComponentInput childElement = (ComponentInput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getComponentOutputs().iterator(); it
				.hasNext();) {
			ComponentOutput childElement = (ComponentOutput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentOutputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getContainedLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case CanvasEditPart.VISUAL_ID:
			return getCanvas_1000ContainedLinks(view);
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2004ContainedLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003ContainedLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001ContainedLinks(view);
		case Processor2EditPart.VISUAL_ID:
			return getProcessor_3001ContainedLinks(view);
		case ProcessorInputEditPart.VISUAL_ID:
			return getProcessorInput_3002ContainedLinks(view);
		case ProcessorOutputEditPart.VISUAL_ID:
			return getProcessorOutput_3003ContainedLinks(view);
		case ComponentInputEditPart.VISUAL_ID:
			return getComponentInput_3004ContainedLinks(view);
		case ComponentOutputEditPart.VISUAL_ID:
			return getComponentOutput_3005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getIncomingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2004IncomingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003IncomingLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001IncomingLinks(view);
		case Processor2EditPart.VISUAL_ID:
			return getProcessor_3001IncomingLinks(view);
		case ProcessorInputEditPart.VISUAL_ID:
			return getProcessorInput_3002IncomingLinks(view);
		case ProcessorOutputEditPart.VISUAL_ID:
			return getProcessorOutput_3003IncomingLinks(view);
		case ComponentInputEditPart.VISUAL_ID:
			return getComponentInput_3004IncomingLinks(view);
		case ComponentOutputEditPart.VISUAL_ID:
			return getComponentOutput_3005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getOutgoingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case ComponentEditPart.VISUAL_ID:
			return getComponent_2004OutgoingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003OutgoingLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001OutgoingLinks(view);
		case Processor2EditPart.VISUAL_ID:
			return getProcessor_3001OutgoingLinks(view);
		case ProcessorInputEditPart.VISUAL_ID:
			return getProcessorInput_3002OutgoingLinks(view);
		case ProcessorOutputEditPart.VISUAL_ID:
			return getProcessorOutput_3003OutgoingLinks(view);
		case ComponentInputEditPart.VISUAL_ID:
			return getComponentInput_3004OutgoingLinks(view);
		case ComponentOutputEditPart.VISUAL_ID:
			return getComponentOutput_3005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCanvas_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponent_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowOutput_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowInput_2001ContainedLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessor_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorInput_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorOutput_3003ContainedLinks(
			View view) {
		ProcessorOutput modelElement = (ProcessorOutput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInput_3004ContainedLinks(
			View view) {
		ComponentInput modelElement = (ComponentInput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentOutput_3005ContainedLinks(
			View view) {
		ComponentOutput modelElement = (ComponentOutput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponent_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowOutput_2003IncomingLinks(
			View view) {
		WorkflowOutput modelElement = (WorkflowOutput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowInput_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessor_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorInput_3002IncomingLinks(
			View view) {
		ProcessorInput modelElement = (ProcessorInput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorOutput_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInput_3004IncomingLinks(
			View view) {
		ComponentInput modelElement = (ComponentInput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentOutput_3005IncomingLinks(
			View view) {
		ComponentOutput modelElement = (ComponentOutput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponent_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowOutput_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getWorkflowInput_2001OutgoingLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessor_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorInput_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getProcessorOutput_3003OutgoingLinks(
			View view) {
		ProcessorOutput modelElement = (ProcessorOutput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInput_3004OutgoingLinks(
			View view) {
		ComponentInput modelElement = (ComponentInput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentOutput_3005OutgoingLinks(
			View view) {
		ComponentOutput modelElement = (ComponentOutput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CanvasLinkDescriptor> getIncomingFeatureModelFacetLinks_Sender_Receivers_4003(
			Receiver target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CanvasPackage.eINSTANCE
					.getSender_Receivers()) {
				result.add(new CanvasLinkDescriptor(setting.getEObject(),
						target, CanvasElementTypes.SenderReceivers_4003,
						SenderReceiversEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CanvasLinkDescriptor> getOutgoingFeatureModelFacetLinks_Sender_Receivers_4003(
			Sender source) {
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceivers().iterator(); destinations
				.hasNext();) {
			Receiver destination = (Receiver) destinations.next();
			result.add(new CanvasLinkDescriptor(source, destination,
					CanvasElementTypes.SenderReceivers_4003,
					SenderReceiversEditPart.VISUAL_ID));
		}
		return result;
	}

}
