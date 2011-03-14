package org.biocatalogue.api.client.tests;

import java.util.GregorianCalendar;
import java.util.HashMap;

import org.biocatalogue.api.client.BioCatalogueClient;
import org.biocatalogue.api.client.BioCatalogueUtil;
import org.biocatalogue.x2009.xml.rest.Search;
import org.junit.Test;

import junit.framework.TestCase;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BioCatalogueClientTest extends TestCase {
	
	public final static String BASE_URL = "http://sandbox.biocatalogue.org";
	
	@Test
	public void testSearch() throws Exception{
		BioCatalogueClient client = new BioCatalogueClient(BASE_URL);
		
		HashMap<String, String> urlParams = new HashMap<String, String>();
		urlParams.put("q", "blast");
		urlParams.put("per_page", "20");

		String searchUrl = BioCatalogueUtil.appendAllURLParameters(
				BioCatalogueClient.API_SEARCH_URL, urlParams);
		
		Search searchData = client.getBioCatalogueSearchData(searchUrl);
		
		assertNotNull(searchData);
		assertTrue(searchData.getResults().sizeOfServiceArray() > 0);
	}
}
