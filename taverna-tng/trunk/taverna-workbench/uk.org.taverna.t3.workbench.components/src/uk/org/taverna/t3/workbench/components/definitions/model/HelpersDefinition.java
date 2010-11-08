package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class HelpersDefinition {
	@Getter	@Setter
	private List<HelperDefinition> preconfigured;
	
	@Getter	@Setter
	private List<HelperDefinition> suggested;
}
