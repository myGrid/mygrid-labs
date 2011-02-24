package uk.org.taverna.t3.workbench.components.search;

import java.util.Map;

import lombok.Getter;

@Getter

public abstract class AbstractComponentSearchProvider implements
		IComponentSearchProvider {
	
	private final String label;
	private final String name;
	private final String description;
	private final String baseUrl;
	private final Map<String, Object> additionalConfig;
	
	public AbstractComponentSearchProvider(String label, String name,
			String description, String baseUrl, Map<String, Object> additionalConfig) {
		this.label = label;
		this.name = name;
		this.description = description;
		this.baseUrl = baseUrl;
		this.additionalConfig = additionalConfig;
		
		init();
	}
	
	public abstract String getIconRef();

	public abstract ComponentSearchResults search(String query);
	
	protected abstract void init();
}
