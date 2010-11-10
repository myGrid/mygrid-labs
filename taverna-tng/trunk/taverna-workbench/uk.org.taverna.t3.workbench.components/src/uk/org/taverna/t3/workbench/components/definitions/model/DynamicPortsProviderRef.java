package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

@Getter @Setter
public class DynamicPortsProviderRef extends ResourceRef {
	@JsonProperty(JsonFields.RELATIVE_ID) private String relativeId;
}
