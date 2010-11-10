package uk.org.taverna.t3.workbench.components.definitions.model;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class InnerItemDefinition {
	@JsonProperty(JsonFields.RELATIVE_ID) private String relativeId;
	private String name;
	private String label;
	private String description;
}
