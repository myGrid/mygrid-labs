package uk.org.taverna.t3.workbench.components.definitions.model;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelperDefinition extends InnerItemDefinition {
	@JsonProperty(JsonFields.FOR_PORT) private PortRef forPort;
	private Boolean inline = false;
	@JsonProperty(JsonFields.INLINE_COMPONENT_DEFINITION) private ComponentDefinition inlineComponentDefinition;
	@JsonProperty(JsonFields.EXTERNAL_COMPONENT_DEFINITION) private ComponentDefinitionRef externalComponentDefinition;
}
