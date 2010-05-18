package mockup2_v001.editpolicies;

import mockup2_v001.commands.RenameCommand;

import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractEditPart;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;

public class ApplicationRenamePolicy extends AbstractEditPolicy {


	public Command getCommand(Request request) {
		if (request.getType().equals("rename")) {
			return createRenameCommand(request);
		}
		return null;
	}
	
	protected Command createRenameCommand(Request renameRequest) {

	
		RenameCommand command = new RenameCommand();
		command.setModel(getHost().getModel());
		command.setNewName((String)renameRequest.getExtendedData().get("newName"));
		
		return command;
	}
	
}
