package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigDefinition {
	private List<ConfigFieldDefinition> fields;
	private List<DynamicConfigFieldsProviderRef> dynamicProviders;
}
