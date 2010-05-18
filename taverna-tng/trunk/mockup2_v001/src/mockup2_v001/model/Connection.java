package mockup2_v001.model;

public class Connection {

	public static final int CONNECTION_PORT = 1;
	
	private int connectionType;
	
	protected WorkflowElement sourceNode;
	protected WorkflowElement targetNode;
	
	public Connection(WorkflowElement sourceNode, WorkflowElement targetNode, int connectionType) {
        this.sourceNode = sourceNode;
        this.targetNode = targetNode;
        this.connectionType = connectionType;
    }

    public WorkflowElement getSourceNode() {
        return sourceNode;
    }
    
    public WorkflowElement getTargetNode() {
        return targetNode;
    }

    public void connect() {
        sourceNode.addConnections(this);
        targetNode.addConnections(this);
    }
    
    public void disconnect() {
        sourceNode.removeConnection(this);
        targetNode.removeConnection(this);
    }
    
    public void reconnect(WorkflowElement sourceNode, WorkflowElement targetNode) {
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
