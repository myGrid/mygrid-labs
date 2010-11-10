package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelpersDefinition {
	private List<HelperDefinition> preconfigured = new ArrayList<HelperDefinition>();
	private List<HelperDefinition> suggested = new ArrayList<HelperDefinition>();
}
