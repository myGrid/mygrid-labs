package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortMapping {
	private Boolean toProcessorPort = false;
	private ProcessorPort processorPort;
	
	@Getter @Setter
	public class ProcessorPort {
		private String name;
	}
}
