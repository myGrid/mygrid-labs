package mockup2_v001.part;

import mockup2_v001.editpolicies.AppEditLayoutPolicy;
import mockup2_v001.figure.ServiceFigure;
import mockup2_v001.model.Node;
import mockup2_v001.model.Service;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class ServicePart extends AppAbstractEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new ServiceFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new AppEditLayoutPolicy());
	}
	
	protected void refreshVisuals() {
		
		ServiceFigure figure = (ServiceFigure)getFigure();
		Service model = (Service)getModel();
		
		figure.setName(model.getName());
		figure.setStage(model.getStage());
		figure.setLayout(model.getLayout());
	}
	
	public List<Node> getModelChildren() {
		return ((Service)getModel()).getChildrenArray();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
	}
}
