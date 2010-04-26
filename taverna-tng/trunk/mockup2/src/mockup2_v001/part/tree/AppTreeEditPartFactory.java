package mockup2_v001.part.tree;

import mockup2_v001.model.Employee;
import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Service;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class AppTreeEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		// TODO Auto-generated method stub
		
		EditPart part = null;
		
		if (model instanceof Enterprise) 
			part = new EnterpriseTreeEditPart();
		else if (model instanceof Service)
			part = new ServiceTreeEditPart();
		else if (model instanceof Employee)
			part = new EmployeeTreeEditPart();
		
		if (part != null)
			part.setModel(model);
		
		return part;
		
	}

}
