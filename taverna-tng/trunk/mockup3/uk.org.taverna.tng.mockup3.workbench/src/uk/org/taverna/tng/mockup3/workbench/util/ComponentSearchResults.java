package uk.org.taverna.tng.mockup3.workbench.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComponentSearchResults {
	
	private List<ComponentSearchSourceResults> items;

	public ComponentSearchResults() {
		items = new ArrayList<ComponentSearchSourceResults>();
	};
	
	public List<ComponentSearchSourceResults> getSourceResults() {
		return items;
	}
	
	public void addSourceResults(ComponentSearchSourceResults results) {
		if (results != null) {
			items.add(results);
		}
	}
}
