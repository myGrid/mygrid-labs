package mockup2_v001.part;

import java.beans.PropertyChangeEvent;
import java.util.ArrayList;
import java.util.List;

import mockup2_v001.figure.EmployeeFigure;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Node;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class EmployeePart extends AppAbstractEditPart {

	@Override
	protected IFigure createFigure() {
		// TODO Auto-generated method stub
		IFigure figure = new EmployeeFigure();
		return figure;
	}

	@Override
	protected void createEditPolicies() {
		// TODO Auto-generated method stub

	}
	
	protected void refreshVisuals() {
		EmployeeFigure figure = (EmployeeFigure)getFigure();
		Employee model = (Employee)getModel();
		
		figure.setName(model.getName());
		figure.setFirstName(model.getFirstName());
		figure.setLayout(model.getLayout());
		
	}
	
	public List<Node> getModelChildren() {
		return new ArrayList<Node>();
	}
	
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals(Node.PROPERTY_LAYOUT)) refreshVisuals();
	}

}
