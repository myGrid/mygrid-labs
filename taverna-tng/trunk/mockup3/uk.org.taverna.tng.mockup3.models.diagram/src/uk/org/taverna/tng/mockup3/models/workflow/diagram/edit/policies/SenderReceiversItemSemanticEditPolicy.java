package uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class SenderReceiversItemSemanticEditPolicy extends
		WorkflowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SenderReceiversItemSemanticEditPolicy() {
		super(WorkflowElementTypes.SenderReceivers_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
