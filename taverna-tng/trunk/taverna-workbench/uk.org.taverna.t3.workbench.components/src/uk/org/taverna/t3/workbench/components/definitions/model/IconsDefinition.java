package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class IconsDefinition {
	private String main;
	private String small;
	private String large;
	@JsonProperty(JsonFields.DISCOVERY_URL) private URL discoveryUrl;
}
