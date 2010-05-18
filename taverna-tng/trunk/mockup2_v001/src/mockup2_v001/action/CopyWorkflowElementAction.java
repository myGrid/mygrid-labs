package mockup2_v001.action;

import java.util.Iterator;
import java.util.List;

import mockup2_v001.commands.CopyWorkflowElementCommand;
import mockup2_v001.model.WorkflowElement;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;

public class CopyWorkflowElementAction extends SelectionAction {

	public CopyWorkflowElementAction(IWorkbenchPart part) {
		super(part);

		setLazyEnablementCalculation(true);
	}

	@Override
	protected void init() {
		super.init();
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		setText("Copy");
		setId(ActionFactory.COPY.getId());
		
		setHoverImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY_DISABLED));
		setEnabled(false);
	}
	
	private Command createCopyCommand(List<Object> selectedObjects) {
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			return null;
		}
		
		CopyWorkflowElementCommand cmd = new CopyWorkflowElementCommand();
		Iterator<Object> it = selectedObjects.iterator();
		while(it.hasNext()) {
			EditPart ep = (EditPart)it.next();
			WorkflowElement workflowElement = (WorkflowElement)ep.getModel();
			if (!cmd.isCopyableWorkflowElement(workflowElement)) {
				return null;
			}
			cmd.addElement(workflowElement);
		}
		return cmd;
	}
	
	@Override
	protected boolean calculateEnabled() {
		Command cmd = createCopyCommand(getSelectedObjects());
		if (cmd == null) {
			return false;
		}
		return cmd.canExecute();
	}

	@Override
	public void run() {
		Command cmd = createCopyCommand(getSelectedObjects());
		if (cmd != null && cmd.canExecute()) {
			cmd.execute();
		}
	}
}
