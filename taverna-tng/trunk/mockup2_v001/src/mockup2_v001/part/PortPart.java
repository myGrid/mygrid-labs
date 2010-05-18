package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.editpolicies.ApplicationConnectionPolicy;
import mockup2_v001.editpolicies.ApplicationDeletePolicy;
import mockup2_v001.editpolicies.ApplicationRenamePolicy;
import mockup2_v001.figure.PortFigure;
import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class PortPart extends ApplicationAbstractEditPart implements NodeEditPart {

	@Override
	protected IFigure createFigure() {
		IFigure figure = new PortFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		//connections
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ApplicationConnectionPolicy());
        installEditPolicy(EditPolicy.CONNECTION_ROLE, new ApplicationDeletePolicy());
        installEditPolicy(EditPolicy.NODE_ROLE, new ApplicationRenamePolicy());
	}

	protected void refreshVisuals() {
		PortFigure figure = (PortFigure)getFigure();
		Port model = (Port)getModel();
		
		figure.setName(model.getName());
		figure.setLayout(model.getLayout());
		figure.setPortType(model.getIsOutput());
	}
	
	public List<WorkflowElement> getModelChildren() {
		return new ArrayList<WorkflowElement>();
	}
	
	
	public List getModelSourceConnections() {
        return ((Port)getModel()).getSourceConnectionsArray();
    }
    
    public List getModelTargetConnections() {
        return ((Port)getModel()).getTargetConnectionsArray();
    }

    
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_LAYOUT)) refreshVisuals();
		   if (evt.getPropertyName().equals(WorkflowElement.SOURCE_CONNECTION)) refreshSourceConnections();
	        if (evt.getPropertyName().equals(WorkflowElement.TARGET_CONNECTION)) refreshTargetConnections();
	   
	        // rename
			if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_RENAME)) refreshVisuals();
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return new ChopboxAnchor(getFigure());		
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		return new ChopboxAnchor(getFigure());
	}

	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ChopboxAnchor(getFigure());
	}
	
	// docking
	
   	
}
