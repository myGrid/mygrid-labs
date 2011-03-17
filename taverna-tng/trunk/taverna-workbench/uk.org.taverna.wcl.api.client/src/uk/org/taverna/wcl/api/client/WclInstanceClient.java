package uk.org.taverna.wcl.api.client;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private static final String ENCODING = "UTF-8";
	
	@Getter
	private URL instanceBaseUrl;

	@Getter
	private String userAgent;

	public WclInstanceClient(URL instanceBaseUrl, String userAgent) {
		this.instanceBaseUrl = instanceBaseUrl;
		this.userAgent = userAgent;
	}
	
	public String getComponentsJson() throws WclApiClientException {
		return getComponentsJson(null);
	}

	public String getComponentsJson(Map<String,String> queryParams) throws WclApiClientException {
		URL url;
		try {
			url = new URL(instanceBaseUrl + COMPONENTS_PATH + queryParamsToString(queryParams));
			System.out.println("WCL Client API: URL in getComponentsJson method = " + url.toString());
			return WclClient.getInstance().getResource(url, userAgent);
		} catch (Exception ex) {
			throw new WclApiClientException("Failed to get components from the Components Library", ex);
		}
	}
	
	public String getComponentJson(String id) throws WclApiClientException {
		URL url;
		try {
			url = new URL(instanceBaseUrl + COMPONENTS_PATH + "/" + id + ".json");
			System.out.println("WCL Client API: URL in getComponentJson method = " + url.toString());
			return WclClient.getInstance().getResource(url, userAgent);
		} catch (Exception ex) {
			throw new WclApiClientException("Failed to get components from the Components Library", ex);
		}
	}
	
	public List<ComponentDefinition> getComponents() throws WclApiClientException {
		List<ComponentDefinition> defs = new ArrayList<ComponentDefinition>();
		
		String componentsJson = getComponentsJson();
		
		ObjectMapper jsonMapper = new ObjectMapper();
		try {
			defs = jsonMapper.readValue(componentsJson, new TypeReference<List<ComponentDefinition>>() { });
		} catch (Exception ex) {
			throw new WclApiClientException("Failed to get components index from the Components Library", ex);
		}
		
		return defs;
	}
	
	public List<ComponentDefinition> getComponentsSearch(String query) throws WclApiClientException {
		List<ComponentDefinition> defs = new ArrayList<ComponentDefinition>();
		
		Map<String,String> queryParams = new HashMap<String, String>();
		queryParams.put("q", query);
		
		String componentsJson = getComponentsJson(queryParams);
		
		ObjectMapper jsonMapper = new ObjectMapper();
		try {
			defs = jsonMapper.readValue(componentsJson, new TypeReference<List<ComponentDefinition>>() { });
		} catch (Exception ex) {
			throw new WclApiClientException("Failed to get components search from the Components Library", ex);
		}
		
		return defs;
	}
	
	private String queryParamsToString(Map<String, String> queryParams) {
		StringBuilder sb = new StringBuilder();
		
		if (queryParams != null && queryParams.size() > 0) {
			sb.append("?");
			
			for (String key : queryParams.keySet()) {
				try {
					sb.append(URLEncoder.encode(key, ENCODING));
					sb.append("=");
					sb.append(URLEncoder.encode(queryParams.get(key), ENCODING));
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		return sb.toString();
	}
	
	public void dispose() {
		
	}
}
