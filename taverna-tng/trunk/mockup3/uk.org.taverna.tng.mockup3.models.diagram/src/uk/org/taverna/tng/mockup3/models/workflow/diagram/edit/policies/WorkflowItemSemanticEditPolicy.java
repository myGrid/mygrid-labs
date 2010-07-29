package uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.commands.ComponentInstanceCreateCommand;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.commands.WorkflowInputCreateCommand;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.edit.commands.WorkflowOutputCreateCommand;
import uk.org.taverna.tng.mockup3.models.workflow.diagram.providers.WorkflowElementTypes;

/**
 * @generated
 */
public class WorkflowItemSemanticEditPolicy extends
		WorkflowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WorkflowItemSemanticEditPolicy() {
		super(WorkflowElementTypes.Workflow_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WorkflowElementTypes.ComponentInstance_2001 == req.getElementType()) {
			return getGEFWrapper(new ComponentInstanceCreateCommand(req));
		}
		if (WorkflowElementTypes.WorkflowInput_2002 == req.getElementType()) {
			return getGEFWrapper(new WorkflowOutputCreateCommand(req));
		}
		if (WorkflowElementTypes.WorkflowOutput_2003 == req.getElementType()) {
			return getGEFWrapper(new WorkflowInputCreateCommand(req));
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
