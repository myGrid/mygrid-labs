package uk.org.taverna.t3.workbench.components.definitions.model.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class JsonHandler {
	private final ObjectMapper jacksonObjectMapper = new ObjectMapper();

	// Private constructor prevents instantiation from other classes
	private JsonHandler() {
		
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * JsonHandler.getInstance() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final JsonHandler INSTANCE = new JsonHandler();
	}

	public static JsonHandler getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public ComponentDefinition buildComponentDefinition(String filePath)
			throws JsonParseException, JsonMappingException, IOException {
		File f = new File(filePath);

		if (!f.isFile()) {
			throw new FileNotFoundException("File not found: " + filePath);
		}

		return buildComponentDefinition(f);
	}

	public ComponentDefinition buildComponentDefinition(File f)
			throws JsonParseException, JsonMappingException, IOException {
		return jacksonObjectMapper.readValue(f, ComponentDefinition.class);
	}
}
