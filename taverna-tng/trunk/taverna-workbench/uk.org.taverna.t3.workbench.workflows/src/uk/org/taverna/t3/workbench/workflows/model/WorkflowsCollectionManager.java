package uk.org.taverna.t3.workbench.workflows.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor
public class WorkflowsCollectionManager {
	private List<WorkflowsCollectionSource> sources = new ArrayList<WorkflowsCollectionSource>();
	
	public void addSource(WorkflowsCollectionSource source) {
		sources.add(source);
	}
}
