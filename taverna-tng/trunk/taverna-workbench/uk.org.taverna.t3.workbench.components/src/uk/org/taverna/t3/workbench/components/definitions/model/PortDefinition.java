package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PortDefinition extends InnerItemDefinition {
	@Getter	@Setter
	private Integer depth;
	
	@Getter	@Setter
	private Boolean visible = true;
	
	@Getter	@Setter
	private List<String> dataTypes;
	
	@Getter	@Setter
	private List<ExampleValue> examples;
	
	@Getter	@Setter
	private List<String> tags;
	
	@Getter	@Setter
	private PortMapping mapping;
}
