package uk.org.taverna.t3.workbench.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.CoreComponentInstanceCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.HelperComponentInstanceCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class NodeNodeCompartmentItemSemanticEditPolicy extends
		CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeNodeCompartmentItemSemanticEditPolicy() {
		super(CanvasElementTypes.Node_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.CoreComponentInstance_3001 == req
				.getElementType()) {
			return getGEFWrapper(new CoreComponentInstanceCreateCommand(req));
		}
		if (CanvasElementTypes.HelperComponentInstance_3004 == req
				.getElementType()) {
			return getGEFWrapper(new HelperComponentInstanceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
