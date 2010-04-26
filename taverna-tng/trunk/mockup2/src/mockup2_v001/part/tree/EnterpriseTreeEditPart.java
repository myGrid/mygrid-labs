package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.util.List;

import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Node;

public class EnterpriseTreeEditPart extends AppAbstractTreeEditPart {
	
	protected List<Node> getModelChildren() {
		return ((Enterprise)getModel()).getChildrenArray();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
	}
	
	
}
