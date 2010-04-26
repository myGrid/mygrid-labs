package mockup2_v001.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

public abstract class AppAbstractConnectionEditPart extends
		AbstractConnectionEditPart {

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	protected IFigure createFigure() {
		return super.createFigure();
	}
	
	public void activate() {
		super.activate();
	}
	
	public void deactivate() {
		super.deactivate();
	}

}
