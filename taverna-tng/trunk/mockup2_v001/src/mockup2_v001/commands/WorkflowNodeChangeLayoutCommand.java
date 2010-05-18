package mockup2_v001.commands;

import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.draw2d.geometry.Rectangle;

public class WorkflowNodeChangeLayoutCommand extends AbstractLayoutCommand {

	private WorkflowNode model;
	private Rectangle layout;
	
	// undo - redo
	private Rectangle oldLayout;
	
	public void execute() {
		model.setLayout(layout);
	}
	
	
	@Override
	public void setConstraint(Rectangle rect) {
		this.layout = rect;
	}

	@Override
	public void setModel(Object model) {
		this.model = (WorkflowNode)model;
		this.oldLayout = ((WorkflowNode)model).getLayout();
	}
	
	public void undo() {
		this.model.setLayout(this.oldLayout);
	}

}
