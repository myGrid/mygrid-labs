package uk.org.taverna.t3.workbench.components.search.providers.wcl;

import java.net.MalformedURLException;
import java.net.URL;

import uk.org.taverna.t3.workbench.components.search.AbstractComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.wcl.api.client.WclInstanceClient;

public class WclSearchProvider extends AbstractComponentSearchProvider {
	
	private static final String ICON_REF = "platform:/plugin/uk.org.taverna.t3.workbench.components.search.providers.wcl/icons/taverna-logo-16x16.png";	//$NON-NLS-1$
	
	public static final String VERSION = "0.0.1";
	public static final String USER_AGENT = "Taverna-TNG_Wcl_Client/" +
    	VERSION +
    	" Java/" + System.getProperty("java.version");

	private WclInstanceClient wclClient;
	
	public WclSearchProvider(String label, String name, String description,
			String baseUrl) {
		super(label, name, description, baseUrl, null);
		
		try {
			wclClient = new WclInstanceClient(new URL(baseUrl), USER_AGENT);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			wclClient = null;
		}
		
		init();
	}

	@Override
	public String getIconRef() {
		return ICON_REF;
	}

	@Override
	public ComponentSearchResults search(String query) {
		ComponentSearchResults results = new ComponentSearchResults(this);
		
		if (wclClient != null) {
			// FIXME: this gets the index of components, NOT the search!
			results.getResults().addAll(wclClient.getComponents());
		}
		
		results.setTotalResultsCount(results.getResults().size());
		
		System.out.println("Workflow Components Library search - "
				+ results.getTotalResultsCount()
				+ " components found.");
		
		return results;
	}

	@Override
	protected void init() {
		
	}

}
