package uk.org.taverna.t3.workbench.canvas.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.NodeCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.WorkflowInputCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.edit.commands.WorkflowOutputCreateCommand;
import uk.org.taverna.t3.workbench.canvas.diagram.providers.CanvasElementTypes;

/**
 * @generated
 */
public class CanvasItemSemanticEditPolicy extends
		CanvasBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CanvasItemSemanticEditPolicy() {
		super(CanvasElementTypes.Canvas_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CanvasElementTypes.WorkflowInput_2001 == req.getElementType()) {
			return getGEFWrapper(new WorkflowInputCreateCommand(req));
		}
		if (CanvasElementTypes.Node_2002 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (CanvasElementTypes.WorkflowOutput_2003 == req.getElementType()) {
			return getGEFWrapper(new WorkflowOutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
