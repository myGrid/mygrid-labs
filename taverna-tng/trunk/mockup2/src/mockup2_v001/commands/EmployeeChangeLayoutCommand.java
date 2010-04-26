package mockup2_v001.commands;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import mockup2_v001.model.Employee;

public class EmployeeChangeLayoutCommand extends AbstractLayoutCommand {
	
	private Employee model;
	private Rectangle layout;
	private Rectangle oldLayout;
	
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
		this.model = (Employee)model;
		
		this.oldLayout = ((Employee)model).getLayout();
	}
	
	public void undo() {
		this.model.setLayout(this.oldLayout);
	}

}
