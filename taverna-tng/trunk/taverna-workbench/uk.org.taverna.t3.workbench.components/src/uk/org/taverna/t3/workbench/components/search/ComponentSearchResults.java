package uk.org.taverna.t3.workbench.components.search;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

public class ComponentSearchResults {
	
	@Getter
	private final IComponentSearchProvider provider;
	
	@Getter
	private List<ComponentDefinition> results;
	
	@Getter
	@Setter
	private int totalResultsCount = 0;
	
	@SuppressWarnings("unused")
	private Object rawResultsData;
	
	public ComponentSearchResults(IComponentSearchProvider provider) {
		initialise();
		this.provider = provider;
	}

	public ComponentSearchResults(IComponentSearchProvider provider, Object rawResultsData) {
		initialise();
		this.provider = provider;
		this.rawResultsData = rawResultsData;
	}
	
	private void initialise() {
		results = new ArrayList<ComponentDefinition>();		
	}
	
	public void addResult(ComponentDefinition item) {
		if (item != null) {
			results.add(item);
		}
	}
	
	public int getFetchedResultsCount() {
		return results.size();
	}
	
}
