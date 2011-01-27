package uk.org.taverna.t3.workbench.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class SenderReceiversItemSemanticEditPolicy extends
		CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SenderReceiversItemSemanticEditPolicy() {
		super(CanvasElementTypes.SenderReceivers_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
