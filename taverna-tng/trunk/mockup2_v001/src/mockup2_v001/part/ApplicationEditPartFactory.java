package mockup2_v001.part;

import mockup2_v001.model.Connection;
import mockup2_v001.model.Port;
import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class ApplicationEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		AbstractGraphicalEditPart part = null;
		
		if (model instanceof Workflow) {
			part = new WorkflowPart();
		} else if (model instanceof WorkflowNode) {
			part = new WorkflowNodePart();
		} else if (model instanceof Port) {
			part = new PortPart();
		} else if (model instanceof Connection) {
			part = new ConnectionPart();
		}
		
		part.setModel(model);
		
		return part;
	}

}
