package org.myexperiment.api.client.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.jdom.Document;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.myexperiment.api.client.MyExperimentClient;
import org.myexperiment.api.client.model.SearchEngine.QuerySearchInstance;

import junit.framework.TestCase;

public class MyExperimentClientTest extends TestCase {
	
	public final static String BASE_URL = "http://sandbox.myexperiment.org";
	
	@Before
	public void setup(){
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testSearch(){
		MyExperimentClient client = new MyExperimentClient(BASE_URL);
		QuerySearchInstance searchQuery = new QuerySearchInstance("blast", 100, true, true, true, true, true);
		Document document = client.searchByQuery(searchQuery);
		assertNotNull(document);
	}
	
}
