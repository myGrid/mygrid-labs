package uk.org.taverna.t3.workbench.components.definitions.model;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigFieldMapping {
	@JsonProperty(JsonFields.TO_ACTIVITY_CONFIGURATION_PROPERTY) private boolean toActivityConfigurationProperty = false;
	@JsonProperty(JsonFields.ACTIVITY_CONFIGURATION_PROPERTY) private ActivityConfigurationProperty activityConfigurationProperty;
	
	@JsonProperty(JsonFields.TO_COMPONENT_PORT) private boolean toComponentPort = false;
	@JsonProperty(JsonFields.COMPONENT_PORT) private PortRef componentPort;
	
	@JsonProperty(JsonFields.TO_PROCESSOR_PORT) private boolean toProcessorPort = false;
	@JsonProperty(JsonFields.PROCESSOR_PORT) private ProcessorPort processorPort;
	
	@Getter @Setter
	public static class ActivityConfigurationProperty {
		private String name;
	}
	
	@Getter @Setter
	public static class ProcessorPort {
		private String name;
	}
}
