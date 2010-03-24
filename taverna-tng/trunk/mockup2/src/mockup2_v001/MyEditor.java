package mockup2_v001;
import mockup2_v001.model.Employee;
import mockup2_v001.model.Enterprise;
import mockup2_v001.model.Service;
import mockup2_v001.part.AppEditPartFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;


public class MyEditor extends GraphicalEditor {

	public static final String ID = "mygraphicaleditor";
	public MyEditor() {
		// TODO Auto-generated constructor stub
		setEditDomain(new DefaultEditDomain(this));
		
	}
	
	public Enterprise CreateEnterprise() {
		
		Enterprise myEnterprise = new Enterprise();
		myEnterprise.setName("my Workflow");
		myEnterprise.setAddress("some details about workflow");
		myEnterprise.setCapital(10000000);
		
			Service componentOne = new Service();
			componentOne.setName("Component One");
			componentOne.setStage(2);
			componentOne.setLayout(new Rectangle(30,50,250,150));
			
			
				Employee serviceOne = new Employee();
				serviceOne.setName("Service One");
				serviceOne.setFirstName("Service detail");
				serviceOne.setLayout(new Rectangle(25, 40, 100, 40));
				componentOne.addChild(serviceOne);
				
				Employee serviceTwo = new Employee();
				serviceTwo.setName("Service Two");
				serviceTwo.setFirstName("Service detail");
				serviceTwo.setLayout(new Rectangle(25, 95, 100, 40));
				componentOne.addChild(serviceTwo);
				
			myEnterprise.addChild(componentOne);
		return myEnterprise;
	}
	
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new AppEditPartFactory());
	}

	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setContents(CreateEnterprise());

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

}
