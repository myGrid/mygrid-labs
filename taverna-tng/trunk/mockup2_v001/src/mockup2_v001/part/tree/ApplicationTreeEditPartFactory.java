package mockup2_v001.part.tree;

import mockup2_v001.model.Port;
import mockup2_v001.model.Workflow;
import mockup2_v001.model.WorkflowNode;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

public class ApplicationTreeEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		EditPart part = null;
		
		if (model instanceof Workflow) {
			part = new WorkflowTreeEditPart();
		} else if (model instanceof WorkflowNode) {
			part = new WorkflowNodeTreeEditPart();
		} else if (model instanceof Port) {
			part = new PortTreeEditPart();
		}
		
		if (part != null) {
			part.setModel(model);
		}
		
		return part;
	}

}
