package mockup2_v001.commands;

import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

public class WorkflowNodeCreateCommand extends Command {
	
	private Workflow workflow;
	private WorkflowNode workflowNode;
	
	public WorkflowNodeCreateCommand() {
	
		super();
		workflow = null;
		workflowNode = null;
		
	}
	
	public void setWorkflowNode(Object s) {
		if (s instanceof WorkflowNode) {
			this.workflowNode = (WorkflowNode)s;
		}
	}
	
	public void setWorkflow(Object e) {
		if (e instanceof Workflow) {
			this.workflow = (Workflow)e;
		}
	}
	
	public void setLayout(Rectangle r) {
		if (workflowNode == null) {
			return;
		}
		workflowNode.setLayout(r);
	}
	
	@Override
	public boolean canExecute() {
		if (workflowNode == null || workflow == null) {
			return false;
		}
		return true;
	}
	
	@Override
	public void execute() {
		workflow.addChild(workflowNode);
	}
	
	@Override
	public boolean canUndo() {
		if (workflow == null || workflowNode == null) {
			return false;
		}
		return workflow.contains(workflowNode);
	}

}
