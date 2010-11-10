package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RelatedItemRef extends ResourceRef {
	private String type;
}
