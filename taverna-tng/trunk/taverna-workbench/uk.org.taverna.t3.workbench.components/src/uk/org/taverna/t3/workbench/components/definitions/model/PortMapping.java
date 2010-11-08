package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

public class PortMapping {
	@Getter	@Setter
	private Boolean toProcessorPort = false;
	
	@Getter	@Setter
	private ProcessorPort processorPort;
	
	public class ProcessorPort {
		@Getter	@Setter
		private String name;
	}
}
