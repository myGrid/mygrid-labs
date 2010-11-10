package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class InnerItemDefinition {
	private String relativeId;
	private String name;
	private String label;
	private String description;
}
