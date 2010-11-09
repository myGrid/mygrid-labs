package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortDefinition extends InnerItemDefinition {
	private Integer depth;
	private Boolean visible = true;
	private List<String> dataTypes;
	private List<ExampleValue> examples;
	private List<String> tags;
	private PortMapping mapping;
}
