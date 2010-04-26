package mockup2_v001.editpolicies;

import mockup2_v001.commands.ConnectionDeleteCommand;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ConnectionEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

public class AppConnectionDeleteEditPolicy extends ConnectionEditPolicy {

	@Override
	protected Command getDeleteCommand(GroupRequest arg0) {
		// TODO Auto-generated method stub
		ConnectionDeleteCommand command = new ConnectionDeleteCommand();
		command.setLink(getHost().getModel());
		return command;
	}

}
