package uk.org.taverna.wcl.api.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

/**
 * A client to handle stateful and instance specific interactions with a particular
 * Workflow Component Library.
 * 
 * @see WclClient
 * 
 * @author Jits
 *
 */
public class WclInstanceClient {
	public static final String COMPONENTS_PATH = "/components.json";
	
	@Getter
	private URL instanceBaseUrl;

	@Getter
	private String userAgent;

	public WclInstanceClient(URL instanceBaseUrl, String userAgent) {
		this.instanceBaseUrl = instanceBaseUrl;
		this.userAgent = userAgent;
	}

	public String getComponentsJson() {
		URL url;
		try {
			url = new URL(instanceBaseUrl + COMPONENTS_PATH);
			return WclClient.getInstance().getResource(url, userAgent);
		} catch (MalformedURLException e) {
			// TODO: change to use proper logging mechanism.
			e.printStackTrace();
			return null;
		}
	}
	
	public String getComponentJson(String id) {
		URL url;
		try {
			url = new URL(instanceBaseUrl + COMPONENTS_PATH + "/" + id + ".json");
			return WclClient.getInstance().getResource(url, userAgent);
		} catch (MalformedURLException e) {
			// TODO: change to use proper logging mechanism.
			e.printStackTrace();
			return null;
		}
	}
	
	public List<ComponentDefinition> getComponents() throws WclException {
		List<ComponentDefinition> defs = new ArrayList<ComponentDefinition>();
		
		String componentsJson = getComponentsJson();
		
		ObjectMapper jsonMapper = new ObjectMapper();
		try {
			defs = jsonMapper.readValue(componentsJson, new TypeReference<List<ComponentDefinition>>() { });
		} catch (Exception ex) {
			throw new WclException("Failed to get components from the Components Library", ex);
		}
		
		return defs;
	}
	
	public void dispose() {
		
	}
}
