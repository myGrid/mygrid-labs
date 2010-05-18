package mockup2_v001.action;

import java.util.HashMap;
import java.util.List;

import mockup2_v001.model.WorkflowElement;
import mockup2_v001.wizard.RenameWizard;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class RenameAction extends SelectionAction {

	public RenameAction(IWorkbenchPart part) {
		super(part);
		setLazyEnablementCalculation(false);
	}

	protected void init() {
		setText("Rename...");
		setToolTipText("Rename");
		
		setId(ActionFactory.RENAME.getId());
		
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin("mockup2_v001", "icons/alt_window_16.gif");
		if (icon != null) {
			setImageDescriptor(icon);
			setEnabled(false);
		}
	}
	
	@Override
	protected boolean calculateEnabled() {
		Command cmd = createRenameCommand("");
		if (cmd == null) {
			return false;
		}
		return true;
	}

	public Command createRenameCommand(String name) {

		Request renameReq = new Request("rename");
		
		HashMap<String, String> reqData = new HashMap<String, String>();
		reqData.put("newName", name);
		renameReq.setExtendedData(reqData);
		
		EditPart object = (EditPart)getSelectedObjects().get(0);
		Command cmd = object.getCommand(renameReq);
		
		return cmd;
	}
	
	public void run() {
		WorkflowElement node = getSelectedNode();
		RenameWizard wizard = new RenameWizard(node.getName());
		WizardDialog dialog = new WizardDialog(getWorkbenchPart().getSite().getShell(), wizard);
		
		dialog.create();
		dialog.getShell().setSize(400, 225);
		
		dialog.setTitle("Rename wizard");
		dialog.setMessage("Rename");
		if (dialog.open() == WizardDialog.OK) {
			String name = wizard.getRenameValue();
			execute(createRenameCommand(name));
		}
		
	}

	private WorkflowElement getSelectedNode() {

		List objects = getSelectedObjects();
		if (objects.isEmpty()) {
			return null;
		}
		if (!(objects.get(0) instanceof EditPart)) {
			return null;
		}
		
		EditPart part = (EditPart)objects.get(0);
		
		return (WorkflowElement)part.getModel();
	}

}
