package mockup2_v001.part;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;

public abstract class ApplicationAbstractConnectionEditPart extends
		AbstractConnectionEditPart {

	protected IFigure createFigure() {
		return super.createFigure();
	}
	
	public void activate() {
		super.activate();
	}
	
	public void deactivate() {
		super.deactivate();
	}
	
	@Override
	protected void createEditPolicies() {
	}

}
