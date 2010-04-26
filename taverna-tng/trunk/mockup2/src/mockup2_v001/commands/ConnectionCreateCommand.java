package mockup2_v001.commands;

import org.eclipse.gef.commands.Command;

import mockup2_v001.model.Connection;
import mockup2_v001.model.Node;

public class ConnectionCreateCommand extends Command {

	private Node sourceNode, targetNode;
	private Connection conn;
	private int connectionType;
	
	public void setSourceNode(Node sourceNode) {
		this.sourceNode = sourceNode;
	}
	
	public void setTargetNode(Node targetNode) {
		this.targetNode = targetNode;
	}
	
	@Override
	public boolean canExecute() {
		
		if (sourceNode == null || targetNode == null)
		{
			return false;
		}
		else if (sourceNode.equals(targetNode)) {
			return false;
		}
		
		return true;
		
	}
	
	@Override
	public void execute() {
		conn = new Connection(sourceNode, targetNode, connectionType);
		conn.connect();
	}
	
	@Override
	public boolean canUndo() {
		if (sourceNode == null || targetNode == null || conn == null) {
			return false;
		}
		return true;
	}
	
	@Override
	public void undo() {
		conn.disconnect();
	}
	
	public void setConnectionType(int connectionType) {
		this.connectionType = connectionType;
	}

	public int getConnectionType() {
		return connectionType;
	}
}
