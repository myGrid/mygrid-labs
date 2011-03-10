package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue;

import java.util.HashMap;

import org.biocatalogue.api.client.BioCatalogueClient;
import org.biocatalogue.api.client.BioCatalogueUtil;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.SoapOperations;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.search.AbstractComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal.ComponentDefinitionBuilder;

public class BioCatalogueSearchProvider extends AbstractComponentSearchProvider {
	
	private final static String ICON_REF = "platform:/plugin/uk.org.taverna.t3.workbench.components.search.providers.biocatalogue/icons/biocat-icon-16x16.png";	//$NON-NLS-1$
	
	private BioCatalogueClient biocatClient;
//	private BioCatalogueSearchInstanceTracker searchInstanceTracker;
//	private CountDownLatch latch;
	
	private ComponentDefinitionBuilder cdBuilder;
	
	// Because constructors are not polymorphic, 
	// have to define this explicitly!
	public BioCatalogueSearchProvider(String label, String name,
			String description, String baseUrl) {
		super(label, name, description, baseUrl, null);
		
		biocatClient = new BioCatalogueClient(baseUrl);
		
		init();
	}
	
	@Override
	protected void init() {
//		searchInstanceTracker = new BioCatalogueSearchInstanceTracker();
//		latch  = new CountDownLatch(1);
		cdBuilder = new ComponentDefinitionBuilder();
	}

	@Override
	public String getIconRef() {
		return ICON_REF;
	}

	@Override
	public ComponentSearchResults search(String query) {
		ComponentSearchResults results = new ComponentSearchResults(this);
		
		HashMap<String, String> urlParams = new HashMap<String, String>();
		urlParams.put("q", query);
		urlParams.put("per_page", "20");
		urlParams.put("include", "inputs,outputs");

		String soapOpsURL = BioCatalogueUtil.appendAllURLParameters(
				BioCatalogueClient.API_SOAP_OPERATIONS_URL, urlParams);

		try {
//			SearchInstance searchInstance = new SearchInstance(biocatClient, query, Resource.TYPE.SOAPOperation);
//			searchInstanceTracker.registerSearchInstance(TYPE.SOAPOperation, searchInstance);
//			searchInstance.startNewSearch(searchInstanceTracker, latch);
//			
//			if (searchInstance.hasSearchResults()) {
//				SearchResults biocatSearchResults = searchInstance.getSearchResults();
//				
//				System.out.println("BioCatalogue search - "
//						+ biocatSearchResults.getTotalMatchingItemCount()
//						+ " total SOAP operations found. Showing only " 
//						+ biocatSearchResults.getFetchedItemCount());
//				
//				for (ResourceLink resourceLink : biocatSearchResults.getFoundItems()) {
//					LoadingResource loadingResource = (LoadingResource) resourceLink;
//					...
//					SoapOperation op = (SoapOperation) resourceLink;
//					ComponentDefinition cd = cdBuilder.buildComponentDefinition(op);
//					results.addResult(cd);
//				}
//				
//				// Make sure to set total results (as it may not be the same as the collection built up, due to paging)
//				results.setTotalResultsCount(biocatSearchResults.getTotalMatchingItemCount());
//			} else {
//				System.err
//				.println("ERROR: No search results returned by the BioCatalogue SearchInstance");
//			}
			
			
			SoapOperations soapOperations = (SoapOperations) biocatClient.getBioCatalogueResource(SoapOperations.class, soapOpsURL);
			
			System.out.println("BioCatalogue search - "
					+ soapOperations.getStatistics().getResults()
					+ " total SOAP operations found. Showing only " 
					+ soapOperations.getParameters().getPageSize().getBigIntegerValue());
			
			results.setTotalResultsCount(soapOperations.getStatistics().getResults().intValue());
			
			for (SoapOperation op : soapOperations.getResults().getSoapOperationList()) {
				ComponentDefinition cd = cdBuilder.buildComponentDefinition(op);
				results.addResult(cd);
			}
			
		} catch (Exception e) {
			System.err
					.println("ERROR: Couldn't execute BioCatalogue search, details below:");
			e.printStackTrace();
		}
		
		return results;
	}

}
