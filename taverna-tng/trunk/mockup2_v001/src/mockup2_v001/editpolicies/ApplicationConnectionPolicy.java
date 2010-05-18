package mockup2_v001.editpolicies;

import mockup2_v001.commands.ConnectionCreateCommand;
import mockup2_v001.commands.ConnectionReconnectCommand;
import mockup2_v001.model.Connection;
import mockup2_v001.model.WorkflowElement;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;

public class ApplicationConnectionPolicy extends GraphicalNodeEditPolicy {

	@Override
	protected Command getConnectionCompleteCommand(
			CreateConnectionRequest request) {

		ConnectionCreateCommand cmd = (ConnectionCreateCommand)request.getStartCommand();
        WorkflowElement targetNode = (WorkflowElement)getHost().getModel();
        cmd.setTargetNode(targetNode);
        return cmd;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {

		ConnectionCreateCommand cmd = new ConnectionCreateCommand();
		WorkflowElement sourceNode = (WorkflowElement)getHost().getModel();
        cmd.setConnectionType(Integer.parseInt(request.getNewObjectType().toString()));
        cmd.setSourceNode(sourceNode);
        request.setStartCommand(cmd);
        return cmd;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		  Connection conn = (Connection)request.getConnectionEditPart().getModel();
		  WorkflowElement sourceNode = (WorkflowElement)getHost().getModel();
	        ConnectionReconnectCommand cmd = new ConnectionReconnectCommand(conn);
	        cmd.setNewSourceNode(sourceNode);        
	        return cmd;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		  Connection conn = (Connection)request.getConnectionEditPart().getModel();
		  WorkflowElement targetNode = (WorkflowElement)getHost().getModel();
	        ConnectionReconnectCommand cmd = new ConnectionReconnectCommand(conn);
	        cmd.setNewTargetNode(targetNode);        
	        return cmd;
	}

}
