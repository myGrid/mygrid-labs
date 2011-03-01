package uk.org.taverna.t3.workbench.components.search.providers.myexperiment.internal;

import org.myexperiment.api.client.model.Workflow;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class ComponentDefinitionBuilder {
	
public ComponentDefinitionBuilder() {
		
	}
	
	public ComponentDefinition buildComponentDefinition(Workflow wf) {
		ComponentDefinition cd = new ComponentDefinition();
		
		cd.setLabel(wf.getTitle());
		cd.setVersion("N/A");
		cd.setDescription(wf.getDescription());
		
		return cd;
	}
	
}
