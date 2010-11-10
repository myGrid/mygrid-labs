package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class ResourceRef {
	private URL resource;
	private String title;
	private String description;
	private URL discoveryUrl;
}
