	package mockup2_v001.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import mockup2_v001.model.Connection;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Service;
public class AppEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		
		AbstractGraphicalEditPart part = null;
		
		if (model instanceof Enterprise) {
			part = new EnterprisePart();
		} else if (model instanceof Service) {
			part = new ServicePart();
		} else if (model instanceof Employee) {
			part = new EmployeePart();
		} else if (model instanceof Connection) {
			part = new ConnectionPart();
		}
		
		part.setModel(model);
		return part;
	}

}
