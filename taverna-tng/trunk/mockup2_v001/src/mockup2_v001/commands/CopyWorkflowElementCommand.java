package mockup2_v001.commands;

import java.util.ArrayList;
import java.util.Iterator;

import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.Clipboard;

public class CopyWorkflowElementCommand extends Command {

	private ArrayList<WorkflowElement> list = new ArrayList<WorkflowElement>();
	
	public boolean addElement(WorkflowElement workflowElement) {
		if (!list.contains(workflowElement)) {
			return list.add(workflowElement);
		}
		return false;
	}
	
	@Override 
	public boolean canExecute() {
		if (list == null || list.isEmpty()) {
			return false;
		}
		Iterator<WorkflowElement> it = list.iterator();
		while (it.hasNext()) {
			if (!isCopyableWorkflowElement(it.next())) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public void execute() {
		if (canExecute()) {
			Clipboard.getDefault().setContents(list);
		}
	}

	public boolean isCopyableWorkflowElement(WorkflowElement workflowElement) {
		if (workflowElement instanceof WorkflowNode || workflowElement instanceof Port) {
			return true;
		}
		return false;
	}
	
}
