package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class ConfigDefinition {
	@Getter	@Setter
	private List<ConfigFieldDefinition> fields;
	
	@Getter	@Setter
	private List<DynamicConfigFieldsProviderRef> dynamicProviders;
}
