package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue;

import java.util.Map;

import uk.org.taverna.t3.workbench.components.search.AbstractComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;

public class BioCatalogueSearchProvider extends AbstractComponentSearchProvider {
	
	private final static String ICON_REF = "platform:/plugin/uk.org.taverna.t3.workbench.components.search.providers.biocatalogue/icons/biocat-icon-16x16.png";	//$NON-NLS-1$
	
	// Because constructors are not polymorphic, 
	// have to define this explicitly!
	public BioCatalogueSearchProvider(String label, String name,
			String description, String baseUrl,
			Map<String, Object> additionalConfig) {
		super(label, name, description, baseUrl, additionalConfig);
	}

	@Override
	public String getIconRef() {
		return ICON_REF;
	}

	@Override
	public ComponentSearchResults search(String query) {
		ComponentSearchResults results = new ComponentSearchResults(this);
		
		return results;
	}

	@Override
	protected void init() {
		
	}
}
