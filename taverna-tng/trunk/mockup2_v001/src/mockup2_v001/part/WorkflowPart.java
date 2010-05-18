package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.editpolicies.ApplicationEditLayoutPolicy;
import mockup2_v001.figure.WorkflowFigure;
import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.draw2d.AutomaticRouter;
import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.ShortestPathConnectionRouter;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.SWT;

public class WorkflowPart extends ApplicationAbstractEditPart {

	@Override
	protected IFigure createFigure() {
		IFigure figure = new WorkflowFigure();
		
		ConnectionLayer connLayer = (ConnectionLayer)getLayer(LayerConstants.CONNECTION_LAYER);
        connLayer.setAntialias(SWT.ON);
        connLayer.setConnectionRouter(new ShortestPathConnectionRouter(figure));
        
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ApplicationEditLayoutPolicy());
	}
	
	protected void refreshVisuals() {
		
		WorkflowFigure figure =  (WorkflowFigure)getFigure();
		Workflow model = (Workflow)getModel();
		
		figure.setName(model.getName());
		figure.setId(model.getId());

	}
	
	public List<WorkflowElement> getModelChildren() {
		return ((Workflow)getModel()).getChildrenArray();
	}

	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_LAYOUT)) refreshVisuals();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_REMOVE)) refreshChildren();
	}
}
