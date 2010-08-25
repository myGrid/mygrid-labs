package uk.org.taverna.t3.workbench.canvas.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.models.workflow.Workflow;
import uk.org.taverna.t3.workbench.canvas.models.workflow.WorkflowPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WorkflowVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "uk.org.taverna.t3.workbench.canvas.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorkflowEditPart.MODEL_ID.equals(view.getType())) {
				return WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				WorkflowDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WorkflowPackage.eINSTANCE.getWorkflow().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Workflow) domainElement)) {
			return WorkflowEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry
				.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getComponentInstance().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentInstanceEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getWorkflowInput().isSuperTypeOf(
					domainElement.eClass())) {
				return WorkflowOutputEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getWorkflowOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return WorkflowInputEditPart.VISUAL_ID;
			}
			break;
		case ComponentInstanceEditPart.VISUAL_ID:
			if (WorkflowPackage.eINSTANCE.getComponentInstanceInput()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentInstanceInputEditPart.VISUAL_ID;
			}
			if (WorkflowPackage.eINSTANCE.getComponentInstanceOutput()
					.isSuperTypeOf(domainElement.eClass())) {
				return ComponentInstanceOutputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry
				.getModelID(containerView);
		if (!WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WorkflowEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.org.taverna.t3.workbench.canvas.diagram.part.WorkflowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorkflowEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorkflowEditPart.VISUAL_ID:
			if (ComponentInstanceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkflowOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkflowInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentInstanceEditPart.VISUAL_ID:
			if (ComponentInstanceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInstanceOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkflowOutputEditPart.VISUAL_ID:
			if (WorkflowOutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WorkflowInputEditPart.VISUAL_ID:
			if (WorkflowInputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Workflow element) {
		return true;
	}

}
