package uk.org.taverna.t3.workbench.components.search.providers.myexperiment;

import java.util.ArrayList;
import java.util.Map;

import org.myexperiment.api.client.MyExperimentClient;
import org.myexperiment.api.client.model.Resource;
import org.myexperiment.api.client.model.SearchEngine.QuerySearchInstance;
import org.myexperiment.api.client.model.Workflow;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.search.AbstractComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.providers.myexperiment.internal.ComponentDefinitionBuilder;

public class MyExperimentSearchProvider extends AbstractComponentSearchProvider {
	
	private final static String ICON_REF = "platform:/plugin/uk.org.taverna.t3.workbench.components.search.providers.myexperiment/icons/myexp-icon-16x16.png";	//$NON-NLS-1$
	
	private MyExperimentClient myExpClient;
	
	private ComponentDefinitionBuilder cdBuilder;
	
	public MyExperimentSearchProvider(String label, String name,
			String description, String baseUrl) {
		super(label, name, description, baseUrl, null);
		
		myExpClient = new MyExperimentClient(baseUrl);
		cdBuilder = new ComponentDefinitionBuilder();
	}

	@Override
	public String getIconRef() {
		return ICON_REF;
	}

	@Override
	public ComponentSearchResults search(String query) {
		ComponentSearchResults results = new ComponentSearchResults(this);
		
		try {
			QuerySearchInstance searchQuery = new QuerySearchInstance("blast", 100, true, false, false, false, false);
			Map<Integer, ArrayList<org.myexperiment.api.client.model.Resource>> myExpSearchResults = myExpClient.getSearchResults(searchQuery);
			
			System.out.println("INFO: myExperiment search - "
					+ myExpSearchResults.get(Resource.WORKFLOW).size()
					+ " workflows found.");

			for (Resource wf : myExpSearchResults.get(Resource.WORKFLOW)) {
				ComponentDefinition cd = cdBuilder.buildComponentDefinition((Workflow) wf);
				results.addResult(cd);
			}
			
			// Make sure to set total results (as it may not be the same as the collection built up, due to paging)
			// FIXME: we currently don't get the full results, so just set to how many we have.
			results.setTotalResultsCount(myExpSearchResults.get(Resource.WORKFLOW).size());
		} catch (Exception e) {
			System.err
					.println("ERROR: Couldn't execute myExperiment search, details below:");
			e.printStackTrace();
		}
		
		return results;
	}

	@Override
	protected void init() {
		
	}

}
