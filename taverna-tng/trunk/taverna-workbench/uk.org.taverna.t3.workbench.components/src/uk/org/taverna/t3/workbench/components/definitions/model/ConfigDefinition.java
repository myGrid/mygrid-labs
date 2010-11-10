package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigDefinition {
	private List<ConfigFieldDefinition> fields = new ArrayList<ConfigFieldDefinition>();
	
	@JsonProperty(JsonFields.DYNAMIC_PROVIDERS)
	private List<DynamicConfigFieldsProviderRef> dynamicProviders = new ArrayList<DynamicConfigFieldsProviderRef>();
}
