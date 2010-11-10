package uk.org.taverna.t3.workbench.components.definitions.model;

import org.codehaus.jackson.annotate.JsonProperty;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortMapping {
	@JsonProperty(JsonFields.TO_PROCESSOR_PORT) private Boolean toProcessorPort = false;
	@JsonProperty(JsonFields.PROCESSOR_PORT) private ProcessorPort processorPort;
	
	@Getter @Setter
	public static class ProcessorPort {
		private String name;
	}
}
