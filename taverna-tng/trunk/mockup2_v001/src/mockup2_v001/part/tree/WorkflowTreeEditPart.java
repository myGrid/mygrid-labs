package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.util.List;

import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowElement;

public class WorkflowTreeEditPart extends ApplicationAbstractTreeEditPart {

	protected List<WorkflowElement> getModelChildren() {
		return ((Workflow) getModel()).getChildrenArray();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_REMOVE)) refreshChildren();
	}
	
}
