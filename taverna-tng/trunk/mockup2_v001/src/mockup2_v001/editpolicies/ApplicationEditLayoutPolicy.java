package mockup2_v001.editpolicies;

import mockup2_v001.commands.AbstractLayoutCommand;
import mockup2_v001.commands.PortChangeLayoutCommand;
import mockup2_v001.commands.WorkflowNodeChangeLayoutCommand;
import mockup2_v001.commands.WorkflowNodeCreateCommand;
import mockup2_v001.figure.WorkflowNodeFigure;
import mockup2_v001.part.PortPart;
import mockup2_v001.part.WorkflowNodePart;
import mockup2_v001.part.WorkflowPart;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class ApplicationEditLayoutPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		
		AbstractLayoutCommand command = null;
		
		if (child instanceof WorkflowNodePart) {
			command = new WorkflowNodeChangeLayoutCommand();
		} else if (child instanceof PortPart) {
			command = new PortChangeLayoutCommand();
		}
		
		command.setModel(child.getModel());
		command.setConstraint((Rectangle)constraint);
		
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {

		if (request.getType() == REQ_CREATE && getHost() instanceof WorkflowPart) {
			
			WorkflowNodeCreateCommand cmd = new WorkflowNodeCreateCommand();
			cmd.setWorkflow(getHost().getModel());
			cmd.setWorkflowNode(request.getNewObject());
			
			Rectangle constraint = (Rectangle)getConstraintFor(request);
			constraint.x = (constraint.x < 0) ? 0 :constraint.x;
			constraint.y = (constraint.y < 0) ? 0 :constraint.y;
			constraint.width = (constraint.height <= 0) ? WorkflowNodeFigure.WORKFLOWNODE_FIGURE_DEFWIDTH : constraint.width;
			constraint.height = (constraint.height <= 0) ? WorkflowNodeFigure.WORKFLOWNODE_FIGURE_DEFHEIGHT : constraint.height;
			//cmd.setLayout(constraint);
			return cmd;
		}
		return null;
		
	}

}
