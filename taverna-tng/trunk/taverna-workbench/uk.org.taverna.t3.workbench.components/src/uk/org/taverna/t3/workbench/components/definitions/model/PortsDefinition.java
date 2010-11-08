package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PortsDefinition {
	@Getter	@Setter
	private List<PortDefinition> inputs;
	
	@Getter	@Setter
	private List<PortDefinition> outputs;
	
	@Getter	@Setter
	private List<DynamicPortsProviderRef> dynamicProviders;
}
