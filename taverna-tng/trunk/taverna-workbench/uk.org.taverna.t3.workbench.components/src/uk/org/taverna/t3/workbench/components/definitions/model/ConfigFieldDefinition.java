package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigFieldDefinition extends InnerItemDefinition {
	@JsonProperty(JsonFields.FIELD_TYPE) private ConfigFieldType fieldType = ConfigFieldType.TEXT;
	@JsonProperty(JsonFields.DATA_TYPE) private String dataType;
	@JsonProperty(JsonFields.CONFIG_GROUP) private String configGroup;
	private boolean required = true;
	@JsonProperty(JsonFields.DEFAULT_VALUE) private String defaultValue;
	private boolean fixed = false;
	private boolean hidden = false;
	private boolean multiple = false;
	@JsonProperty(JsonFields.CONSTRAINED_TO_OPTIONS) private boolean constrainedToOptions = false;
	private List<Option> options = new ArrayList<Option>();
	@JsonProperty(JsonFields.ADDITIONAL_CONSTRAINTS) private String additionalConstraints;
	private List<String> examples = new ArrayList<String>();
	private ConfigFieldMapping mapping;
	@JsonProperty(JsonFields.MAKE_INPUT_PORT) private boolean makeInputPort = false;
	
	@Getter @Setter
	public static class Option {
		private String label;
		private String value;
	}
}
