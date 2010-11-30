package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortDefinition extends InnerItemDefinition {
	private int depth;
	private boolean visible = true;
	@JsonProperty(JsonFields.DATA_TYPES) private List<URI> dataTypes = new ArrayList<URI>();
	private List<ExampleValue> examples = new ArrayList<ExampleValue>();
	private List<String> tags = new ArrayList<String>();
	private PortMapping mapping;
}
