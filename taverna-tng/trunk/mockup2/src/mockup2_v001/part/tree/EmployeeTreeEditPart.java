package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.util.List;

import org.eclipse.gef.EditPolicy;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import mockup2_v001.editpolicies.AppDeletePolicy;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Node;

public class EmployeeTreeEditPart extends AppAbstractTreeEditPart {

	protected List<Node> getModelChildren() {
		return ((Employee)getModel()).getChildrenArray();
	}
	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
	}
	
	public void refreshVisuals() {
		Employee model = (Employee)getModel();
		setWidgetText(model.getName() + " " + model.getFirstName());
		
		setWidgetImage(PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_DEF_VIEW));
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
	}
}
