package uk.org.taverna.wcl.api.client;

import java.net.MalformedURLException;
import java.net.URL;

import lombok.Getter;

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
	public static final String COMPONENTS_PATH = "/components";
	
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
			url = new URL(instanceBaseUrl + COMPONENTS_PATH + "/" + id);
			return WclClient.getInstance().getResource(url, userAgent);
		} catch (MalformedURLException e) {
			// TODO: change to use proper logging mechanism.
			e.printStackTrace();
			return null;
		}
	}
	
	public void dispose() {
		
	}
}
