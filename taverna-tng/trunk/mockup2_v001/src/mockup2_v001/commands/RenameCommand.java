package mockup2_v001.commands;

import mockup2_v001.model.WorkflowElement;

import org.eclipse.gef.commands.Command;

public class RenameCommand extends Command {

	private WorkflowElement model;
	private String oldName;
	private String newName;
	
	public void execute() {
		this.oldName = model.getName();
		this.model.setName(newName);
		
	}
	
	public void setModel(Object model) {
		this.model = (WorkflowElement)model;
		
	}
	
	public void setNewName(String newName) {
		this.newName = newName;
	}
	
	public void undo() {
		this.model.setName(oldName);
	}
}
