package uk.org.taverna.t3.workbench.common;

import java.net.URI;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DragContainer {
	private URI id;
    private Object data;
    private boolean sameObject;
}
