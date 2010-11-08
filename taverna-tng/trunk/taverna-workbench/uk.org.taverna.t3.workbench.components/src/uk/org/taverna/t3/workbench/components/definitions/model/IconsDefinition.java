package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

public class IconsDefinition {
	@Getter	@Setter
	private String main;
	
	@Getter	@Setter
	private String small;
	
	@Getter	@Setter
	private String large;
	
	@Getter	@Setter
	private URL discoveryUrl;
}
