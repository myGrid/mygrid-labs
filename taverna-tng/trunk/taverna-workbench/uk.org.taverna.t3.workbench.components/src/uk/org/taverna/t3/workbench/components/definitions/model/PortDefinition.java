package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortDefinition extends InnerItemDefinition {
	private Integer depth;
	private Boolean visible = true;
	@JsonProperty(JsonFields.DATA_TYPES) private List<String> dataTypes = new ArrayList<String>();
	private List<ExampleValue> examples = new ArrayList<ExampleValue>();
	private List<String> tags = new ArrayList<String>();
	private PortMapping mapping;
}
