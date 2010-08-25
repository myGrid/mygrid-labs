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

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.SenderReceiversEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.WorkflowElementTypes;
import uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentInstanceInput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.ComponentInstanceOutput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Receiver;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Sender;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowInput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowOutput;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * @generated
 */
public class WorkflowDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<WorkflowNodeDescriptor> getSemanticChildren(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000SemanticChildren(view);
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowNodeDescriptor> getWorkflow_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Workflow modelElement = (Workflow) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComponents().iterator(); it
				.hasNext();) {
			ComponentInstance childElement = (ComponentInstance) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			WorkflowInput childElement = (WorkflowInput) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkflowOutputEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			WorkflowOutput childElement = (WorkflowOutput) it.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == WorkflowInputEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowNodeDescriptor> getComponentInstance_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ComponentInstance modelElement = (ComponentInstance) view.getElement();
		LinkedList<WorkflowNodeDescriptor> result = new LinkedList<WorkflowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputs().iterator(); it.hasNext();) {
			ComponentInstanceInput childElement = (ComponentInstanceInput) it
					.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceInputEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOutputs().iterator(); it
				.hasNext();) {
			ComponentInstanceOutput childElement = (ComponentInstanceOutput) it
					.next();
			int visualID = WorkflowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ComponentInstanceOutputEditPart.VISUAL_ID) {
				result.add(new WorkflowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getContainedLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case WorkflowEditPart.VISUAL_ID:
			return getWorkflow_1000ContainedLinks(view);
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2001ContainedLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowInput_2002ContainedLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003ContainedLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3001ContainedLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getIncomingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2001IncomingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowInput_2002IncomingLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003IncomingLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3001IncomingLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getOutgoingLinks(View view) {
		switch (WorkflowVisualIDRegistry.getVisualID(view)) {
		case ComponentInstanceEditPart.VISUAL_ID:
			return getComponentInstance_2001OutgoingLinks(view);
		case WorkflowOutputEditPart.VISUAL_ID:
			return getWorkflowInput_2002OutgoingLinks(view);
		case WorkflowInputEditPart.VISUAL_ID:
			return getWorkflowOutput_2003OutgoingLinks(view);
		case ComponentInstanceInputEditPart.VISUAL_ID:
			return getComponentInstanceInput_3001OutgoingLinks(view);
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			return getComponentInstanceOutput_3002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflow_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstance_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowInput_2002ContainedLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowOutput_2003ContainedLinks(
			View view) {
		WorkflowOutput modelElement = (WorkflowOutput) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceInput_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceOutput_3002ContainedLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstance_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowInput_2002IncomingLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowOutput_2003IncomingLinks(
			View view) {
		WorkflowOutput modelElement = (WorkflowOutput) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceInput_3001IncomingLinks(
			View view) {
		ComponentInstanceInput modelElement = (ComponentInstanceInput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceOutput_3002IncomingLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Sender_Receivers_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstance_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowInput_2002OutgoingLinks(
			View view) {
		WorkflowInput modelElement = (WorkflowInput) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getWorkflowOutput_2003OutgoingLinks(
			View view) {
		WorkflowOutput modelElement = (WorkflowOutput) view.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceInput_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WorkflowLinkDescriptor> getComponentInstanceOutput_3002OutgoingLinks(
			View view) {
		ComponentInstanceOutput modelElement = (ComponentInstanceOutput) view
				.getElement();
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getIncomingFeatureModelFacetLinks_Sender_Receivers_4002(
			Receiver target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WorkflowPackage.eINSTANCE
					.getSender_Receivers()) {
				result.add(new WorkflowLinkDescriptor(setting.getEObject(),
						target, WorkflowElementTypes.SenderReceivers_4002,
						SenderReceiversEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WorkflowLinkDescriptor> getOutgoingFeatureModelFacetLinks_Sender_Receivers_4002(
			Sender source) {
		LinkedList<WorkflowLinkDescriptor> result = new LinkedList<WorkflowLinkDescriptor>();
		Receiver destination = source.getReceivers();
		if (destination == null) {
			return result;
		}
		result.add(new WorkflowLinkDescriptor(source, destination,
				WorkflowElementTypes.SenderReceivers_4002,
				SenderReceiversEditPart.VISUAL_ID));
		return result;
	}

}
