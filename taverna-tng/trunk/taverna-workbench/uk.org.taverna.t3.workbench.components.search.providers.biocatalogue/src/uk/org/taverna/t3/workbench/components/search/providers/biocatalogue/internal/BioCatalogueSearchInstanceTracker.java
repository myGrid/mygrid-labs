package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import org.biocatalogue.api.client.Resource.TYPE;
import org.biocatalogue.api.client.search.SearchInstance;
import org.biocatalogue.api.client.search.SearchInstanceTracker;


/**
 * Only supports the SOAPOperation resource type.
 * 
 * @author jits
 *
 */
public class BioCatalogueSearchInstanceTracker implements SearchInstanceTracker {

	private SearchInstance searchInstance;
	
	public BioCatalogueSearchInstanceTracker() {
		
	}
	
	@Override
	public void clearPreviousSearchInstances() {
		searchInstance = null;
	}

	@Override
	public void registerSearchInstance(TYPE searchType,
			SearchInstance searchInstance) {
		checkSearchType(searchType);
		this.searchInstance = searchInstance; 
	}

	@Override
	public boolean isCurrentSearchInstance(TYPE searchType,
			SearchInstance searchInstance) {
		checkSearchType(searchType);
		return true;
	}

	@Override
	public SearchInstance getCurrentSearchInstance(TYPE searchType) {
		checkSearchType(searchType);
		return searchInstance;
	}
	
	private void checkSearchType(TYPE searchType) {
		if (searchType != TYPE.SOAPOperation) {
			throw new IllegalArgumentException("Only supports Resource.TYPE.SOAPOperation for now");
		}
	}

}
