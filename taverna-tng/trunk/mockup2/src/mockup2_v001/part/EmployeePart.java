package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.editpolicies.AppConnectionPolicy;
import mockup2_v001.editpolicies.AppDeletePolicy;
import mockup2_v001.figure.EmployeeFigure;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Node;
import mockup2_v001.model.Service;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYAnchor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class EmployeePart extends AppAbstractEditPart implements NodeEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new EmployeeFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new AppDeletePolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new AppConnectionPolicy());

	}
	
	protected void refreshVisuals() {
		EmployeeFigure figure = (EmployeeFigure)getFigure();
		Employee model = (Employee)getModel();
		
		figure.setName(model.getName());
		figure.setFirstName(model.getFirstName());
		figure.setLayout(model.getLayout());
		
	}
	
	public List<Node> getModelChildren() {
		return new ArrayList<Node>();
	}
	
	public List getModelSourceConnections() {
		return ((Employee)getModel()).getSourceConnectionsArray();
	}
	
	public List getModelTargetConnections() {
		return ((Employee)getModel()).getTargetConnectionsArray();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
		if (evt.getPropertyName().equals(Node.SOURCE_CONNECTION)) refreshSourceConnections();
		if (evt.getPropertyName().equals(Node.TARGET_CONNECTION)) refreshTargetConnections();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(ConnectionEditPart arg0) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request arg0) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(ConnectionEditPart arg0) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request arg0) {
		return new ChopboxAnchor(getFigure());
	}

}
