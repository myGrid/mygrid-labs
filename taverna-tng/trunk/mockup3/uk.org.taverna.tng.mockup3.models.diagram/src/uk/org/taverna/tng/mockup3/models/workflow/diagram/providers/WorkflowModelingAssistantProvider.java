package uk.org.taverna.tng.mockup3.models.workflow.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.ComponentInstanceEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.WorkflowEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.WorkflowInputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.WorkflowOutputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.Messages;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowDiagramEditorPlugin;

/**
 * @generated
 */
public class WorkflowModelingAssistantProvider extends
		ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof ComponentInstanceEditPart) {
			ArrayList types = new ArrayList(2);
			types.add(WorkflowElementTypes.ComponentInstanceInput_3001);
			types.add(WorkflowElementTypes.ComponentInstanceOutput_3002);
			return types;
		}
		if (editPart instanceof WorkflowEditPart) {
			ArrayList types = new ArrayList(3);
			types.add(WorkflowElementTypes.ComponentInstance_2001);
			types.add(WorkflowElementTypes.WorkflowInput_2002);
			types.add(WorkflowElementTypes.WorkflowOutput_2003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WorkflowOutputEditPart) {
			return ((WorkflowOutputEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof WorkflowInputEditPart) {
			return ((WorkflowInputEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ComponentInstanceOutputEditPart) {
			return ((ComponentInstanceOutputEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WorkflowOutputEditPart) {
			return ((WorkflowOutputEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof WorkflowInputEditPart) {
			return ((WorkflowInputEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ComponentInstanceInputEditPart) {
			return ((ComponentInstanceInputEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ComponentInstanceOutputEditPart) {
			return ((ComponentInstanceOutputEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WorkflowOutputEditPart) {
			return ((WorkflowOutputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof WorkflowInputEditPart) {
			return ((WorkflowInputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ComponentInstanceOutputEditPart) {
			return ((ComponentInstanceOutputEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof WorkflowOutputEditPart) {
			return ((WorkflowOutputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof WorkflowInputEditPart) {
			return ((WorkflowInputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ComponentInstanceInputEditPart) {
			return ((ComponentInstanceInputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ComponentInstanceOutputEditPart) {
			return ((ComponentInstanceOutputEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof WorkflowOutputEditPart) {
			return ((WorkflowOutputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof WorkflowInputEditPart) {
			return ((WorkflowInputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ComponentInstanceOutputEditPart) {
			return ((ComponentInstanceOutputEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				WorkflowDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.WorkflowModelingAssistantProviderMessage);
		dialog.setTitle(Messages.WorkflowModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
