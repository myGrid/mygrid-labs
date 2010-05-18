package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import mockup2_v001.model.WorkflowElement;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public abstract class ApplicationAbstractEditPart extends
		AbstractGraphicalEditPart implements PropertyChangeListener {

	public void activate() {
		super.activate();
		((WorkflowElement)getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate() {
		super.deactivate();
		((WorkflowElement)getModel()).removePropertyChangeListener(this);
	}
	
	@Override
	protected IFigure createFigure() {
		return null;
	}

	@Override
	protected void createEditPolicies() {

	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {

	}

}
