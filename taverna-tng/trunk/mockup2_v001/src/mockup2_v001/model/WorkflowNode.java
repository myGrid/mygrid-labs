package mockup2_v001.model;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.geometry.Rectangle;

public class WorkflowNode extends WorkflowElement {
	
	private boolean isStart;
	private boolean isFinish;
	private List outputs;
	private List inputs;
	
	// Gettings and Setters
	
	public boolean isFinish() {
		return isFinish;
	}
	
	public void setIsFinish(boolean val) {
		isFinish = val;
	}
	
	public boolean isStart() {
		return isStart;
	}
	
	public void setIsStart(boolean val) {
		isStart = val;
	}
	
	public Object clone() throws CloneNotSupportedException {
		WorkflowNode workflowNode = new WorkflowNode();
		workflowNode.setName(this.getName());
		workflowNode.setParent(this.getParent());
		workflowNode.setLayout(new Rectangle(getLayout().x + 10, getLayout().y + 10, getLayout().width, getLayout().height));
		
		Iterator<WorkflowElement> it = this.getChildrenArray().iterator();
		while (it.hasNext()) {
			
			WorkflowElement workflowElement = it.next();
			if (workflowElement instanceof Port) {
				Port child = (Port)workflowElement;
				WorkflowElement clone = (WorkflowElement)child.clone();
				workflowNode.addChild(clone);
				clone.setLayout(child.getLayout());
			}
			
		}
		return workflowNode;
	}
	
	
	// to be finished when InputPort & OutputPort is implemented.
	
}
