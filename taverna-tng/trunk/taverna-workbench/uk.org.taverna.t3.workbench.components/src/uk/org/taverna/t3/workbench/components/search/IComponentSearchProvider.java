package uk.org.taverna.t3.workbench.components.search;

import java.util.Map;

public interface IComponentSearchProvider {
	public String getLabel();
	public String getName();
	public String getDescription();
	public String getIconRef();
	public String getBaseUrl();
	public Map<String,Object> getAdditionalConfig();
	public ComponentSearchResults search(String query);
}
