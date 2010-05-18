package mockup2_v001.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.Clipboard;

public class PasteWorkflowElementCommand extends Command {

	private HashMap<WorkflowElement, WorkflowElement> list = new HashMap<WorkflowElement, WorkflowElement>();
	
	@Override
	public boolean canExecute() {
		ArrayList<WorkflowElement> bList = (ArrayList<WorkflowElement>)Clipboard.getDefault().getContents();
		if (bList == null || bList.isEmpty()) {
			return false;
		}
		
		Iterator<WorkflowElement> it = bList.iterator();
		while (it.hasNext()) {
			WorkflowElement workflowElement = (WorkflowElement)it.next();
			if (isPastableWorkflowElement(workflowElement)) {
				list.put(workflowElement, null);
			}
		}
		return true;
	}
	
	@Override
	public void execute() {
		if(!canExecute()) {
			return;
		}
		
		Iterator<WorkflowElement> it = list.keySet().iterator();
		while (it.hasNext()) {
			
			WorkflowElement workflowElement = (WorkflowElement)it.next();
			try {
				
				if (workflowElement instanceof WorkflowNode) {
					WorkflowNode workflowNode = (WorkflowNode)workflowElement;
					WorkflowNode clone = (WorkflowNode) workflowNode.clone();
					list.put(workflowElement, clone);
				}
				else if (workflowElement instanceof Port) {
					Port port = (Port) workflowElement;
					Port clone = (Port) port.clone();
					list.put(workflowElement, clone);
				}
				
			}
			catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
			
		}
		
		redo();
	}
	
	@Override
	public void redo() {
		Iterator<WorkflowElement> it = list.values().iterator();
		while(it.hasNext()) {
			WorkflowElement workflowElement = it.next();
			if (isPastableWorkflowElement(workflowElement)) {
				workflowElement.getParent().addChild(workflowElement);
			}
		}
	}
	
	@Override
	public boolean canUndo() {
		return !(list.isEmpty());
	}
	
	@Override
	public void undo() {
		Iterator<WorkflowElement> it = list.values().iterator();
		while (it.hasNext()) {
			WorkflowElement workflowElement = it.next();
			if (isPastableWorkflowElement(workflowElement)) {
				workflowElement.getParent().removeChild(workflowElement);
			}
		}
	}
	
	public boolean isPastableWorkflowElement(WorkflowElement workflowElement) {
		if (workflowElement instanceof WorkflowNode || workflowElement instanceof Port) {
			return true;	
		}
		return false;
	}
	
}
