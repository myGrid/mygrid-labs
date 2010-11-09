package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class HelperDefinition extends InnerItemDefinition {
	private PortRef for_port;
	private Boolean inline = false;
	private ComponentDefinition component;
}
