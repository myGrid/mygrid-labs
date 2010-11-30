package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelperDefinition extends InnerItemDefinition {
	@JsonProperty(JsonFields.FOR_PORT) private List<PortRef> forPorts = new ArrayList<PortRef>();
	@JsonProperty(JsonFields.EXTERNAL_COMPONENT_DEFINITION) private ComponentDefinitionRef externalComponentDefinition;
	private boolean inline = false;
	@JsonProperty(JsonFields.INLINE_COMPONENT_DEFINITION) private ComponentDefinition inlineComponentDefinition;
}
