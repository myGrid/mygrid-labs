package mockup2_v001.model;

import java.util.List;

public class Workflow extends WorkflowElement {
	
	private List<WorkflowNode> nodes;
	private List edges;
	private List comments;

	// getters
	public List getNodes() {
		return nodes;
	}
	
	public List getEdges() {
		return edges;
	}
	
	public List getComments() {
		return comments;
	}
	
}
