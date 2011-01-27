package uk.org.taverna.t3.workbench.canvas.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.ComponentInputCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.ComponentOutputCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.Processor2CreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class ComponentComponentCompartmentItemSemanticEditPolicy extends
		CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ComponentComponentCompartmentItemSemanticEditPolicy() {
		super(CanvasElementTypes.Component_2004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.Processor_3001 == req.getElementType()) {
			return getGEFWrapper(new Processor2CreateCommand(req));
		}
		if (CanvasElementTypes.ComponentInput_3004 == req.getElementType()) {
			return getGEFWrapper(new ComponentInputCreateCommand(req));
		}
		if (CanvasElementTypes.ComponentOutput_3005 == req.getElementType()) {
			return getGEFWrapper(new ComponentOutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
