package mockup2_v001.part.tree;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import mockup2_v001.model.Node;

import org.eclipse.gef.editparts.AbstractTreeEditPart;

public abstract class AppAbstractTreeEditPart extends AbstractTreeEditPart implements
		PropertyChangeListener {

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}
	
	public void activate() {
		super.activate();
		((Node)getModel()).addPropertyChangeListener(this);
	}
	
	public void deactivate() {
		((Node)getModel()).removePropertyChangeListener(this);
		super.deactivate();
	}
}
