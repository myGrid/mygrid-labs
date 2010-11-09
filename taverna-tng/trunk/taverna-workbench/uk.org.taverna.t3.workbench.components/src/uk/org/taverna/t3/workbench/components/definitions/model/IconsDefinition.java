package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class IconsDefinition {
	private String main;
	private String small;
	private String large;
	private URL discoveryUrl;
}
