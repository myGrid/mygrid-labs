package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import mockup2_v001.editpolicies.ApplicationDeletePolicy;
import mockup2_v001.editpolicies.ApplicationRenamePolicy;
import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowElement;

public class PortTreeEditPart extends ApplicationAbstractTreeEditPart {

	protected List<WorkflowElement> getModelChildren() {
		return ((WorkflowElement)getModel()).getChildrenArray();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ApplicationDeletePolicy());
        installEditPolicy(EditPolicy.NODE_ROLE, new ApplicationRenamePolicy());

	}
	
	public void refreshVisuals() {
		Port model = (Port)getModel();
		setWidgetText(model.getName());
		
		setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_DEF_VIEW));
		
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_REMOVE)) refreshChildren();
	}
}
