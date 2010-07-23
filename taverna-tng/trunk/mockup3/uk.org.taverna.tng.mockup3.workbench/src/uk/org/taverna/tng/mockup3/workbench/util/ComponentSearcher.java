package uk.org.taverna.tng.mockup3.workbench.util;

import java.util.HashMap;

import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.tng.mockup3.workbench.Application;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueClient;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueUtil;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.QuerySearchResults;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.Resource;

public class ComponentSearcher {

	public final static ComponentSearcher INSTANCE = new ComponentSearcher();

	private BioCatalogueClient biocatClient;

	private ComponentSearcher() {
		this.biocatClient = new BioCatalogueClient();
	}

	public ComponentSearchResults search(String searchTerm) {
		ComponentSearchResults results = new ComponentSearchResults();

		// BioCatalogue search

		HashMap<String, String> biocatSearchParams = new HashMap<String, String>();
		biocatSearchParams.put("q", searchTerm);
		biocatSearchParams.put("per_page", "50");
		biocatSearchParams.put("scope", "soap_operations");

		String searchURL = BioCatalogueUtil.appendAllURLParameters(
				BioCatalogueClient.API_SEARCH_URL, biocatSearchParams);

		QuerySearchResults biocatSearchResults = new QuerySearchResults();

		try {
			biocatSearchResults.addSearchResults(biocatClient
					.getBioCatalogueSearchData(searchURL));

			System.out.println("INFO: BioCatalogue search - "
					+ biocatSearchResults
							.getTotalItemCount(Resource.SOAP_OPERATION_TYPE)
					+ " SOAP operations found.");

			ComponentSearchSource biocatSource = ComponentSearchSource.BIOCATALOGUE;
			ComponentSearchSourceResults biocatSourceResults = new ComponentSearchSourceResults(
					biocatSource, biocatSearchResults);

			ImageDescriptor biocatIcon = AbstractUIPlugin
					.imageDescriptorFromPlugin(Application.PLUGIN_ID,
							IImageKeys.BIOCAT_ICON);

			for (SoapOperation op : biocatSearchResults.getFoundSoapOperations()) {
				biocatSourceResults.addResult(new ComponentSearchResultItem(
						biocatSourceResults, op, op.getName(), op
								.getDescription(), biocatIcon));
			}
			
			results.addSourceResults(biocatSourceResults);
		} catch (Exception e) {
			System.err
					.println("ERROR: Couldn't execute BioCatalolgue search, details below:");
			e.printStackTrace();
		}

		// myExperiment search

		return results;
	}
}
