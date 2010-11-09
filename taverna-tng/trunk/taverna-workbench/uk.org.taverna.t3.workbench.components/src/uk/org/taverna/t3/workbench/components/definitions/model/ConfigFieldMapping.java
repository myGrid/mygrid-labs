package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigFieldMapping {
	private Boolean toActivityConfigurationProperty = false;
	private ActivityConfigurationProperty activityConfigurationProperty;
	
	private Boolean toComponentPort = false;
	private PortRef componentPort;
	
	private Boolean toProcessorPort = false;
	private ProcessorPort processorPort;
	
	@Getter @Setter
	public class ActivityConfigurationProperty {
		private String name;
	}
	
	@Getter @Setter
	public class ProcessorPort {
		private String name;
	}
}
