package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PortsDefinition {
	private List<PortDefinition> inputs;
	private List<PortDefinition> outputs;
	private List<DynamicPortsProviderRef> dynamicProviders;
}
