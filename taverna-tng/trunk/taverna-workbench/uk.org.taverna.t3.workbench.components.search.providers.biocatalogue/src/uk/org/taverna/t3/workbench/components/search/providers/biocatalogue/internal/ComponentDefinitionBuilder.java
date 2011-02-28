package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import org.biocatalogue.x2009.xml.rest.SoapOperation;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class ComponentDefinitionBuilder {
	
	public ComponentDefinitionBuilder() {
		
	}
	
	public ComponentDefinition buildComponentDefinition(SoapOperation op) {
		ComponentDefinition cd = new ComponentDefinition();
		
		cd.setLabel(op.getName());
		cd.setVersion("N/A");
		cd.setDescription(op.getDescription());
		
		return cd;
	}
	
}
