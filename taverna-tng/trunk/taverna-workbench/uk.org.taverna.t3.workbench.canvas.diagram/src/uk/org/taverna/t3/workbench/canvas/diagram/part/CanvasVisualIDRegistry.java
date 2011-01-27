package uk.org.taverna.t3.workbench.canvas.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.CanvasEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentComponentCompartmentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ComponentTitleEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.Processor2EditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ProcessorInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ProcessorNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.ProcessorOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowInputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.parts.WorkflowOutputNameEditPart;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class CanvasVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "uk.org.taverna.t3.workbench.canvas.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CanvasEditPart.MODEL_ID.equals(view.getType())) {
				return CanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry
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
				CanvasDiagramEditorPlugin.getInstance().logError(
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
		if (CanvasPackage.eINSTANCE.getCanvas().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Canvas) domainElement)) {
			return CanvasEditPart.VISUAL_ID;
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
		String containerModelID = uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CanvasEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getComponent().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentEditPart.VISUAL_ID;
			}
			if (CanvasPackage.eINSTANCE.getWorkflowOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return WorkflowOutputEditPart.VISUAL_ID;
			}
			if (CanvasPackage.eINSTANCE.getWorkflowInput().isSuperTypeOf(
					domainElement.eClass())) {
				return WorkflowInputEditPart.VISUAL_ID;
			}
			break;
		case Processor2EditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getProcessorInput().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessorInputEditPart.VISUAL_ID;
			}
			if (CanvasPackage.eINSTANCE.getProcessorOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return ProcessorOutputEditPart.VISUAL_ID;
			}
			break;
		case ComponentComponentCompartmentEditPart.VISUAL_ID:
			if (CanvasPackage.eINSTANCE.getProcessor().isSuperTypeOf(
					domainElement.eClass())) {
				return Processor2EditPart.VISUAL_ID;
			}
			if (CanvasPackage.eINSTANCE.getComponentInput().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentInputEditPart.VISUAL_ID;
			}
			if (CanvasPackage.eINSTANCE.getComponentOutput().isSuperTypeOf(
					domainElement.eClass())) {
				return ComponentOutputEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry
				.getModelID(containerView);
		if (!CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (CanvasEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CanvasEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CanvasEditPart.VISUAL_ID:
			if (ComponentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkflowOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WorkflowInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentEditPart.VISUAL_ID:
			if (ComponentComponentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
		case Processor2EditPart.VISUAL_ID:
			if (ProcessorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ProcessorOutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ComponentComponentCompartmentEditPart.VISUAL_ID:
			if (Processor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentInputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ComponentOutputEditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(Canvas element) {
		return true;
	}

}
