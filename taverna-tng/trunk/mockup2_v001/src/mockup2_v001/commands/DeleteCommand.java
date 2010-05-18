package mockup2_v001.commands;

import java.util.List;

import mockup2_v001.model.Connection;
import mockup2_v001.model.WorkflowElement;

import org.eclipse.gef.commands.Command;

public class DeleteCommand extends Command {

	private WorkflowElement model;
	private WorkflowElement parentModel;
	
	public void execute() {
		this.parentModel.removeChild(model);
	}
	
	public void setModel(Object model) {
		this.model = (WorkflowElement)model;
	}
	
	public void setParentModel(Object model) {
		parentModel = (WorkflowElement)model;
	}
	
	public void undo() {
		this.parentModel.addChild(model);
	}
	
}
