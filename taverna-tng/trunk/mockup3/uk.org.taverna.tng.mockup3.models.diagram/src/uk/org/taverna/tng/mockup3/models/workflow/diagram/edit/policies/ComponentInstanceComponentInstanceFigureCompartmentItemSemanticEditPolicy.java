package uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.commands.ComponentInstanceInputCreateCommand;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.commands.ComponentInstanceOutputCreateCommand;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class ComponentInstanceComponentInstanceFigureCompartmentItemSemanticEditPolicy
		extends WorkflowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentInstanceComponentInstanceFigureCompartmentItemSemanticEditPolicy() {
		super(WorkflowElementTypes.ComponentInstance_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.ComponentInstanceInput_3001 == req
				.getElementType()) {
			return getGEFWrapper(new ComponentInstanceInputCreateCommand(req));
		}
		if (WorkflowElementTypes.ComponentInstanceOutput_3002 == req
				.getElementType()) {
			return getGEFWrapper(new ComponentInstanceOutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
