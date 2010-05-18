package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import mockup2_v001.model.WorkflowElement;

import org.eclipse.gef.editparts.AbstractTreeEditPart;

public abstract class ApplicationAbstractTreeEditPart extends
		AbstractTreeEditPart implements PropertyChangeListener {

	public void activate() {
		super.activate();
		((WorkflowElement) getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate() {
		((WorkflowElement) getModel()).removePropertyChangeListener(this);
		super.deactivate();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
	}

}
