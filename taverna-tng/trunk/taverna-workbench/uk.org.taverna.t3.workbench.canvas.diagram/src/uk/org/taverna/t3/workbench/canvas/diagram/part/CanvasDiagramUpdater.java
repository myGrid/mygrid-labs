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
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInput2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutput2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CoreComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.HelperComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.NodeEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.SenderReceiversEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceInput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ComponentInstanceOutput;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.HelperComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;
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
		case NodeEditPart.VISUAL_ID:
			return getNode_2002SemanticChildren(view);
		case CoreComponentInstanceEditPart.VISUAL_ID:
			return getCoreComponentInstance_3001SemanticChildren(view);
		case HelperComponentInstanceEditPart.VISUAL_ID:
			return getHelperComponentInstance_3004SemanticChildren(view);
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
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			WorkflowInput childElement = (WorkflowInput) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkflowInputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
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
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getNode_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Node modelElement = (Node) view.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		{
			CoreComponentInstance childElement = modelElement
					.getCoreComponents();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CoreComponentInstanceEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHelperComponents().iterator(); it
				.hasNext();) {
			HelperComponentInstance childElement = (HelperComponentInstance) it
					.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == HelperComponentInstanceEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getCoreComponentInstance_3001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CoreComponentInstance modelElement = (CoreComponentInstance) view
				.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			ComponentInstanceInput childElement = (ComponentInstanceInput) it
					.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceInputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			ComponentInstanceOutput childElement = (ComponentInstanceOutput) it
					.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceOutputEditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasNodeDescriptor> getHelperComponentInstance_3004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		HelperComponentInstance modelElement = (HelperComponentInstance) view
				.getElement();
		LinkedList<CanvasNodeDescriptor> result = new LinkedList<CanvasNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			ComponentInstanceInput childElement = (ComponentInstanceInput) it
					.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceInput2EditPart.VISUAL_ID) {
				result.add(new CanvasNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			ComponentInstanceOutput childElement = (ComponentInstanceOutput) it
					.next();
			int visualID = CanvasVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceOutput2EditPart.VISUAL_ID) {
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
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2002ContainedLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003ContainedLinks(view);
		case CoreComponentInstanceEditPart.VISUAL_ID:
			return getCoreComponentInstance_3001ContainedLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3002ContainedLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3003ContainedLinks(view);
		case HelperComponentInstanceEditPart.VISUAL_ID:
			return getHelperComponentInstance_3004ContainedLinks(view);
		case ComponentInstanceInput2EditPart.VISUAL_ID:
			return getComponentInstanceInput_3005ContainedLinks(view);
		case ComponentInstanceOutput2EditPart.VISUAL_ID:
			return getComponentInstanceOutput_3006ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getIncomingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001IncomingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2002IncomingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003IncomingLinks(view);
		case CoreComponentInstanceEditPart.VISUAL_ID:
			return getCoreComponentInstance_3001IncomingLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3002IncomingLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3003IncomingLinks(view);
		case HelperComponentInstanceEditPart.VISUAL_ID:
			return getHelperComponentInstance_3004IncomingLinks(view);
		case ComponentInstanceInput2EditPart.VISUAL_ID:
			return getComponentInstanceInput_3005IncomingLinks(view);
		case ComponentInstanceOutput2EditPart.VISUAL_ID:
			return getComponentInstanceOutput_3006IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getOutgoingLinks(View view) {
		switch (CanvasVisualIDRegistry.getVisualID(view)) {
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowInput_2001OutgoingLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2002OutgoingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003OutgoingLinks(view);
		case CoreComponentInstanceEditPart.VISUAL_ID:
			return getCoreComponentInstance_3001OutgoingLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3002OutgoingLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3003OutgoingLinks(view);
		case HelperComponentInstanceEditPart.VISUAL_ID:
			return getHelperComponentInstance_3004OutgoingLinks(view);
		case ComponentInstanceInput2EditPart.VISUAL_ID:
			return getComponentInstanceInput_3005OutgoingLinks(view);
		case ComponentInstanceOutput2EditPart.VISUAL_ID:
			return getComponentInstanceOutput_3006OutgoingLinks(view);
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
	public static List<CanvasLinkDescriptor> getWorkflowInput_2001ContainedLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getNode_2002ContainedLinks(
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
	public static List<CanvasLinkDescriptor> getCoreComponentInstance_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3003ContainedLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getHelperComponentInstance_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3006ContainedLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
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
	public static List<CanvasLinkDescriptor> getNode_2002IncomingLinks(View view) {
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
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getCoreComponentInstance_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3002IncomingLinks(
			View view) {
		ComponentInstanceInput modelElement = (ComponentInstanceInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getHelperComponentInstance_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3005IncomingLinks(
			View view) {
		ComponentInstanceInput modelElement = (ComponentInstanceInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3006IncomingLinks(
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
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getNode_2002OutgoingLinks(View view) {
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
	public static List<CanvasLinkDescriptor> getCoreComponentInstance_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3003OutgoingLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getHelperComponentInstance_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceInput_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<CanvasLinkDescriptor> getComponentInstanceOutput_3006OutgoingLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CanvasLinkDescriptor> getIncomingFeatureModelFacetLinks_Sender_Receivers_4001(
			Receiver target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == CanvasPackage.eINSTANCE
					.getSender_Receivers()) {
				result.add(new CanvasLinkDescriptor(setting.getEObject(),
						target, CanvasElementTypes.SenderReceivers_4001,
						SenderReceiversEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<CanvasLinkDescriptor> getOutgoingFeatureModelFacetLinks_Sender_Receivers_4001(
			Sender source) {
		LinkedList<CanvasLinkDescriptor> result = new LinkedList<CanvasLinkDescriptor>();
		for (Iterator<?> destinations = source.getReceivers().iterator(); destinations
				.hasNext();) {
			Receiver destination = (Receiver) destinations.next();
			result.add(new CanvasLinkDescriptor(source, destination,
					CanvasElementTypes.SenderReceivers_4001,
					SenderReceiversEditPart.VISUAL_ID));
		}
		return result;
	}

}
