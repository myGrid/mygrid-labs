package uk.org.taverna.tng.mockup3.workbench.util;

import java.util.ArrayList;
import java.util.List;

public class ComponentSearchSourceResults {

	private final ComponentSearchResults parent;
	private final ComponentSearchSource source;
	private List<ComponentSearchResultItem> results;
	private Object rawResultsData;
	
	public ComponentSearchSourceResults(ComponentSearchResults parent, ComponentSearchSource source) {
		initialise();
		this.parent = parent;
		this.source = source;
	}

	public ComponentSearchSourceResults(ComponentSearchResults parent, ComponentSearchSource source, Object rawResultsData) {
		initialise();
		this.parent = parent;
		this.source = source;
		this.rawResultsData = rawResultsData;
	}
	
	public ComponentSearchResults getParent() {
		return parent;
	}

	public ComponentSearchSource getSource() {
		return source;
	}

	public Object getRawResultsData() {
		return rawResultsData;
	}

	public void setRawResultsData(Object rawResultsData) {
		this.rawResultsData = rawResultsData;
	}
	
	public List<ComponentSearchResultItem> getResults() {
		return results;
	}

	public void setResults(List<ComponentSearchResultItem> results) {
		this.results = results;
	}
	
	public void addResult(ComponentSearchResultItem item) {
		if (item != null) {
			results.add(item);
		}
	}
	
	private void initialise() {
		results = new ArrayList<ComponentSearchResultItem>();		
	}
	
}
