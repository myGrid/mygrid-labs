package mockup2_v001.model;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.requests.CreationFactory;

public class WorkflowElementCreationFactory implements CreationFactory {

	private Class<?> template;
	private int templateId;
	public WorkflowElementCreationFactory(Class<?> t, int templateId) {
		this.template = t;
		this.templateId = templateId;
	}
	
	@Override
	public Object getNewObject() {
	
		if (template == null) {
			return null;
		}
		if (template == WorkflowNode.class && templateId == 1) {
			WorkflowNode myNode = new WorkflowNode();
			myNode.setName("Get_Protein_FASTA");
			myNode.setLayout(new Rectangle(170,200,200,75));
			
				Port myFirstPort = new Port();
				myFirstPort.setName("Sequence");
				myFirstPort.setLayout(new Rectangle(-10,40, 100,18));
				myNode.addChild(myFirstPort);
				
				Port myFirstPort1 = new Port();
				myFirstPort1.setName("outputText");
				myFirstPort1.setIsOutput(true);
				myFirstPort1.setLayout(new Rectangle(100,40, 100,18));
				myNode.addChild(myFirstPort1);
			return myNode;
		} else if (template == WorkflowNode.class && templateId == 2) {
			WorkflowNode myOtherNode = new WorkflowNode();
			myOtherNode.setName("searchSimple");
			myOtherNode.setLayout(new Rectangle(500,140,200,130));
			
				Port myOtherPort = new Port();
				myOtherPort.setName("Database");
				myOtherPort.setLayout(new Rectangle(-10,40, 100,18));
				myOtherNode.addChild(myOtherPort);
				
				Port myOtherOtherPort = new Port();
				myOtherOtherPort.setName("Program");
				myOtherOtherPort.setLayout(new Rectangle(-10,70, 100,18));
				myOtherNode.addChild(myOtherOtherPort);
				
				Port myLazyOtherOtherPort = new Port();
				myLazyOtherOtherPort.setName("Query");
				myLazyOtherOtherPort.setLayout(new Rectangle(-10,100, 100,18));
				myOtherNode.addChild(myLazyOtherOtherPort);
				
				Port myOutputPort = new Port();
				myOutputPort.setIsOutput(true);
				myOutputPort.setName("searchSimple");
				myOutputPort.setLayout(new Rectangle(100,70, 100,18));
				myOtherNode.addChild(myOutputPort);
			return myOtherNode;
		
		} 
		
		return null;
	}

	@Override
	public Object getObjectType() {
		return template;
	}

}
