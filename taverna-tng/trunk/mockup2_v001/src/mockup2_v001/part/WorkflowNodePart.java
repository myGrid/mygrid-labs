package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.editpolicies.ApplicationConnectionPolicy;
import mockup2_v001.editpolicies.ApplicationDeletePolicy;
import mockup2_v001.editpolicies.ApplicationEditLayoutPolicy;
import mockup2_v001.editpolicies.ApplicationRenamePolicy;
import mockup2_v001.figure.WorkflowNodeFigure;
import mockup2_v001.model.Port;
import mockup2_v001.model.WorkflowElement;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.CompoundSnapToHelper;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.SnapToGeometry;
import org.eclipse.gef.SnapToGrid;
import org.eclipse.gef.SnapToGuides;
import org.eclipse.gef.SnapToHelper;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.rulers.RulerProvider;

public class WorkflowNodePart extends ApplicationAbstractEditPart implements NodeEditPart{
	
	@Override
	protected IFigure createFigure() {
		IFigure figure = new WorkflowNodeFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new ApplicationEditLayoutPolicy());
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ApplicationConnectionPolicy());
        installEditPolicy(EditPolicy.COMPONENT_ROLE, new ApplicationDeletePolicy());
	
        installEditPolicy(EditPolicy.NODE_ROLE, new ApplicationRenamePolicy());
	}
	
	protected void refreshVisuals() {
		WorkflowNodeFigure figure = (WorkflowNodeFigure)getFigure();
		WorkflowNode model = (WorkflowNode)getModel();
		
		figure.setName(model.getName());
		figure.setLayout(model.getLayout());
	}
	
	public List<WorkflowElement> getModelChildren() {
		return ((WorkflowNode)getModel()).getChildrenArray();
	}
	
	//connections
	public List getModelSourceConnections() {
        return ((WorkflowNode)getModel()).getSourceConnectionsArray();
    }
    
    public List getModelTargetConnections() {
        return ((WorkflowNode)getModel()).getTargetConnectionsArray();
    }
    
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_LAYOUT)) refreshVisuals();
		if (evt.getPropertyName().equals(WorkflowElement.SOURCE_CONNECTION)) refreshSourceConnections();
	    if (evt.getPropertyName().equals(WorkflowElement.TARGET_CONNECTION)) refreshTargetConnections();
	        
	    // add - delete
	    if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_ADD)) refreshChildren();
		if (evt.getPropertyName().equals(WorkflowElement.PROPERTY_REMOVE)) refreshChildren();
	
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
	
	// grid
	public Object getAdapter(Class adapter) {
		if (adapter == SnapToHelper.class) {
			List snapStrategies = new ArrayList();
			Boolean val = (Boolean)getViewer().getProperty(RulerProvider.PROPERTY_RULER_VISIBILITY);
			if (val != null && val.booleanValue())
				snapStrategies.add(new SnapToGuides(this));
			val = (Boolean)getViewer().getProperty(SnapToGeometry.PROPERTY_SNAP_ENABLED);
			if (val != null && val.booleanValue())
				snapStrategies.add(new SnapToGeometry(this));
			val = (Boolean)getViewer().getProperty(SnapToGrid.PROPERTY_GRID_ENABLED);
			if (val != null && val.booleanValue())
				snapStrategies.add(new SnapToGrid(this));
			
			if (snapStrategies.size() == 0)
				return null;
			if (snapStrategies.size() == 1)
				return snapStrategies.get(0);

			SnapToHelper ss[] = new SnapToHelper[snapStrategies.size()];
			for (int i = 0; i < snapStrategies.size(); i++)
				ss[i] = (SnapToHelper)snapStrategies.get(i);
			return new CompoundSnapToHelper(ss);
		}
		return super.getAdapter(adapter);
	}

}
