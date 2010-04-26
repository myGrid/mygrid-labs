package mockup2_v001.editpolicies;

import mockup2_v001.commands.AbstractLayoutCommand;
import mockup2_v001.commands.EmployeeChangeLayoutCommand;
import mockup2_v001.commands.ServiceChangeLayoutCommand;
import mockup2_v001.part.EmployeePart;
import mockup2_v001.part.ServicePart;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

public class AppEditLayoutPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint) {
		// TODO Auto-generated method stub
		
		AbstractLayoutCommand command = null;
		
		if (child instanceof EmployeePart) {
			command = new EmployeeChangeLayoutCommand();
		} else if (child instanceof ServicePart) {
			command = new ServiceChangeLayoutCommand();
		}
		
		command.setModel(child.getModel());
		command.setConstraint((Rectangle)constraint);
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
