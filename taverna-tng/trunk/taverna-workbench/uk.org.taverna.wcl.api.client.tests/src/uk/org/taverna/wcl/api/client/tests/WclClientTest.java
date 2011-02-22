package uk.org.taverna.wcl.api.client.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.URL;
import java.util.Map;

import junit.framework.TestCase;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.org.taverna.wcl.api.client.WclClient;

public class WclClientTest extends TestCase {
	
	// TODO: find a way to get the version number of the host bundle programmatically
	public final static String PLUGIN_VERSION = "0.0.1";
	
	public final static String BASE_URL = "http://components.taverna.org.uk";
	public final static String USER_AGENT = "WCL-API-Client-Test/" +
										    PLUGIN_VERSION +
										    " Java/" + System.getProperty("java.version");
	
	public final static String TEST_COMPONENT_PATH = BASE_URL + "/components/9e9dfad0-11e7-012e-7a9f-002564beee16"; 
	
	@BeforeClass
	public void setup() {
		
	}
	
	@Test
	public void testLoadingOfAComponent() {
		try {
			URL url = new URL(TEST_COMPONENT_PATH + ".json");
			String cdString = WclClient.getInstance().getResource(url, USER_AGENT);
			assertNotNull(cdString);
			
			// Attempt to load it up into a Map and look for the relevant bits
			
			ObjectMapper jsonMapper = new ObjectMapper();
			Map<String,Object> cdMap = jsonMapper.readValue(cdString, Map.class);
			assertNotNull(cdMap);
			assertThat(cdMap.get("id").toString(), is(equalTo(TEST_COMPONENT_PATH)));
		} catch (Exception ex) {
			System.out.println("Exception - " + ex.toString() + " - whilst fetching component: " + BASE_URL + "/" + TEST_COMPONENT_PATH);
			throw new RuntimeException(ex);
		}
	}
	
	@AfterClass
	public void finalise() {
		
	}
}
