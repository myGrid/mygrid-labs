package uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import uk.org.taverna.tng.mockup3.models.workflow.WorkflowPackage;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.ComponentInstanceInputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.parts.ComponentInstanceOutputEditPart;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowDiagramUpdater;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowNodeDescriptor;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowVisualIDRegistry;

/**
 * @generated
 */
public class ComponentInstanceCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = WorkflowDiagramUpdater
				.getComponentInstance_2001SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
			result.add(((WorkflowNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = WorkflowVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ComponentInstanceInputEditPart.VISUAL_ID:
		case ComponentInstanceOutputEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(WorkflowPackage.eINSTANCE
					.getComponentInstance_Inputs());
			myFeaturesToSynchronize.add(WorkflowPackage.eINSTANCE
					.getComponentInstance_Outputs());
		}
		return myFeaturesToSynchronize;
	}

}
