package mockup2_v001.commands;

import mockup2_v001.model.Service;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;

public class ServiceChangeLayoutCommand extends AbstractLayoutCommand {

	private Service model;
	private Rectangle layout;
	
	public void execute() {
		model.setLayout(layout);
	}
	
	@Override
	public void setConstraint(Rectangle rect) {
		// TODO Auto-generated method stub
		this.layout = rect;
	}

	@Override
	public void setModel(Object model) {
		// TODO Auto-generated method stub
		this.model = (Service)model;
	}

}
