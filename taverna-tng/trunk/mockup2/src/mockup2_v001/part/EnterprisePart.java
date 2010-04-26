package mockup2_v001.part;

import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.editpolicies.AppEditLayoutPolicy;
import mockup2_v001.figure.EnterpriseFigure;
import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Node;

public class EnterprisePart extends AppAbstractEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new EnterpriseFigure();
		
		ConnectionLayer connLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
		connLayer.setAntialias(SWT.ON);
		connLayer.setConnectionRouter(new ShortestPathConnectionRouter(figure));
		
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new AppEditLayoutPolicy());
	}
	
	protected void refreshVisuals() {
		EnterpriseFigure figure = (EnterpriseFigure)getFigure();
		Enterprise model = (Enterprise)getModel();
		
		figure.setName(model.getName());
		figure.setAddress(model.getAddress());
		figure.setCapital(model.getCapital());
	}
	
	public List<Node> getModelChildren() {
		return ((Enterprise)getModel()).getChildrenArray();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
		if (evt.getPropertyName().equals(Node.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(Node.PROPERTY_REMOVE)) refreshChildren();
	}
	
}
