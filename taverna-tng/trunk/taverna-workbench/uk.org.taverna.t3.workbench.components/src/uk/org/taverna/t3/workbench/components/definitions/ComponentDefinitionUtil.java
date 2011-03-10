package uk.org.taverna.t3.workbench.components.definitions;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

public class ComponentDefinitionUtil {
	
	private ComponentDefinitionUtil() {
		throw new AssertionError();
	}
	
	public static URI generateNewId() {
		try {
			// FIXME: update the base URL below
			return new URI("http://t3.taverna.org.uk/components/local/" + UUID.randomUUID());
		} catch (URISyntaxException e) {
			return null;
		}
	}

}
