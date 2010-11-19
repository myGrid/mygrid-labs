package uk.org.taverna.t3.workbench.components.registry;

import java.util.List;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class ComponentDefinitionFlatGroup extends ComponentDefinitionGroup {

	public ComponentDefinitionFlatGroup(String name) {
		super(name);
	}

	public ComponentDefinitionFlatGroup(String name,
			List<ComponentDefinition> definitions) {
		super(name, definitions);
	}
	
}
