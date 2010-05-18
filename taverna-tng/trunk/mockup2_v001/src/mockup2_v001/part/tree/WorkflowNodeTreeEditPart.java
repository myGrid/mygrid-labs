package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import mockup2_v001.editpolicies.ApplicationDeletePolicy;
import mockup2_v001.editpolicies.ApplicationRenamePolicy;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

public class WorkflowNodeTreeEditPart extends ApplicationAbstractTreeEditPart {

	protected List<WorkflowElement> getModelChildren() {
		return ((WorkflowNode)getModel()).getChildrenArray();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ApplicationDeletePolicy());
        installEditPolicy(EditPolicy.NODE_ROLE, new ApplicationRenamePolicy());

	}
	
	public void refreshVisuals() {
		WorkflowNode model = (WorkflowNode)getModel();
		setWidgetText(model.getName());
		
		setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ELEMENT));
		
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_REMOVE)) refreshChildren();
	
		// rename
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_RENAME)) refreshVisuals();
	}
	
}
