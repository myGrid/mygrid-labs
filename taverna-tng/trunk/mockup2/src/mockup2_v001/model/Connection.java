package mockup2_v001.model;

public class Connection {

	public static final int CONNECTION_SERVICE = 1;

	private int connectionType;
	
	protected Node sourceNode;
	protected Node targetNode;
	
	public Connection(Node sourceNode, Node targetNode, int connectionType) {
		this.sourceNode = sourceNode;
		this.targetNode = targetNode;
		this.connectionType = connectionType;
	}
	
	public Node getSourceNode() {
		return sourceNode;
	}
	
	public Node getTargetNode() {
		return targetNode;
	}
	
	public void connect() {
		sourceNode.addConnection(this);
		targetNode.addConnection(this);
	}
	
	public void disconnect() {
		sourceNode.removeConnection(this);
		targetNode.removeConnection(this);
	}
	
	public void reconnect(Node sourceNode, Node targetNode) {
		if (sourceNode == null || targetNode == null || sourceNode == targetNode) {
			throw new IllegalArgumentException();
		}
		
		disconnect();
		this.sourceNode = sourceNode;
		this.targetNode = targetNode;
		connect();
		
	}
	
	public void setConnectionType(int connectionType) {
		this.connectionType = connectionType;
	}
	
	public int getConnectionType() {
		return connectionType;
	}
}
