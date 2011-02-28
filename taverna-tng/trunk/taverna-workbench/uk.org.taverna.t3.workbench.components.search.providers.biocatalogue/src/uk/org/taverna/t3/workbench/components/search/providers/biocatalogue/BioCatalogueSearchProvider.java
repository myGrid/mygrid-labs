package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue;

import java.util.HashMap;

import org.biocatalogue.api.client.BioCatalogueClient;
import org.biocatalogue.api.client.BioCatalogueUtil;
import org.biocatalogue.api.client.QuerySearchResults;
import org.biocatalogue.api.client.Resource;
import org.biocatalogue.x2009.xml.rest.SoapOperation;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.search.AbstractComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal.ComponentDefinitionBuilder;

public class BioCatalogueSearchProvider extends AbstractComponentSearchProvider {
	
	private final static String ICON_REF = "platform:/plugin/uk.org.taverna.t3.workbench.components.search.providers.biocatalogue/icons/biocat-icon-16x16.png";	//$NON-NLS-1$
	
	private BioCatalogueClient biocatClient;
	
	private ComponentDefinitionBuilder cdBuilder;
	
	// Because constructors are not polymorphic, 
	// have to define this explicitly!
	public BioCatalogueSearchProvider(String label, String name,
			String description, String baseUrl) {
		super(label, name, description, baseUrl, null);
		
		biocatClient = new BioCatalogueClient();
		cdBuilder = new ComponentDefinitionBuilder();
	}

	@Override
	public String getIconRef() {
		return ICON_REF;
	}

	@Override
	public ComponentSearchResults search(String query) {
		ComponentSearchResults results = new ComponentSearchResults(this);
		
		HashMap<String, String> biocatSearchParams = new HashMap<String, String>();
		biocatSearchParams.put("q", query);
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

			for (SoapOperation op : biocatSearchResults.getFoundSoapOperations()) {
				ComponentDefinition cd = cdBuilder.buildComponentDefinition(op);
				//cd.getIcons().setMain(getIconRef());
				results.addResult(cd);
			}
			
			// Make sure to set total results (as it may not be the same as the collection built up, due to paging)
			results.setTotalResults(biocatSearchResults.getTotalItemCount(Resource.SOAP_OPERATION_TYPE));
		} catch (Exception e) {
			System.err
					.println("ERROR: Couldn't execute BioCatalogue search, details below:");
			e.printStackTrace();
		}
		
		return results;
	}

	@Override
	protected void init() {
		
	}
}
