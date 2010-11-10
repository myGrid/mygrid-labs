package uk.org.taverna.t3.workbench.components.definitions.model;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ExampleValue {
	@JsonProperty(JsonFields.DATA_TYPE) private String dataType;
	private String value;
}
