package mockup2_v001.part;

import mockup2_v001.editpolicies.AppConnectionPolicy;
import mockup2_v001.editpolicies.AppDeletePolicy;
import mockup2_v001.editpolicies.AppEditLayoutPolicy;
import mockup2_v001.figure.ServiceFigure;
import mockup2_v001.model.Node;
import mockup2_v001.model.Service;

import org.eclipse.draw2d.LabelAnchor;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import java.beans.PropertyChangeEvent;
import java.util.List;

public class ServicePart extends AppAbstractEditPart implements NodeEditPart{

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
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new AppConnectionPolicy());
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
	
	public List getModelSourceConnections() {
		return ((Service)getModel()).getSourceConnectionsArray();
	}
	
	public List getModelTargetConnections() {
		return ((Service)getModel()).getTargetConnectionsArray();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
		if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
		if (evt.getPropertyName().equals(Node.SOURCE_CONNECTION)) refreshSourceConnections();
		if (evt.getPropertyName().equals(Node.TARGET_CONNECTION)) refreshTargetConnections();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart connection) {

		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart connection) {
		return new ChopboxAnchor(getFigure());	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());		
	}
}
