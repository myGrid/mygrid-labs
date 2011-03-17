package uk.org.taverna.wcl.api.client.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.wcl.api.client.WclException;
import uk.org.taverna.wcl.api.client.WclInstanceClient;

public class WclInstanceClientTest extends TestCase {
	
	@Test
	public void testLoadingOfComponents() throws WclException, MalformedURLException {
		WclInstanceClient client = new WclInstanceClient(new URL(WclClientTest.BASE_URL), WclClientTest.USER_AGENT);
		
		List<ComponentDefinition> defs = client.getComponents();
		
		assertThat(defs.size(), is(equalTo(20)));
	}

}
