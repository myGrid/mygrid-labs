package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortsDefinition {
	private List<PortDefinition> inputs = new ArrayList<PortDefinition>();
	private List<PortDefinition> outputs = new ArrayList<PortDefinition>();
	@JsonProperty(JsonFields.DYNAMIC_PROVIDERS) private List<DynamicPortsProviderRef> dynamicProviders = new ArrayList<DynamicPortsProviderRef>();
}
