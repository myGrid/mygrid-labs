package uk.org.taverna.tng.mockup3.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ComponentDefinitionsRegistry {

	private static final String EXTENSION_POINT_ID = "uk.org.taverna.tng.mockup3.core.componentDefinitions";

	public final static ComponentDefinitionsRegistry INSTANCE = new ComponentDefinitionsRegistry();

	private List<IComponentDefinition> entries;

	private ComponentDefinitionsRegistry() {
	}

	public List<IComponentDefinition> getAllEntries() {
		if (entries == null) {
			reloadAll();
		}

		return entries;
	}
	
	public void addComponentDefinition(IComponentDefinition def) {
		if (this.entries != null && def != null) {
			this.entries.add(def);
		}
	}
	
	public void addComponentDefinition(IConfigurationElement element) {
		if (this.entries != null && element != null) {
			this.entries.add(new ComponentDefinition(element));
		}
	}
	
	private void reloadAll() {
		this.entries = new ArrayList<IComponentDefinition>();
		this.loadFromExtensionsRegistry();	
	}

	private void loadFromExtensionsRegistry() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(EXTENSION_POINT_ID);

		for (IConfigurationElement element : elements) {
			this.entries.add(new ComponentDefinition(element));
		}
	}
	
	// TODO: implement a registry change listener so that when new components 
	// are added via Eclipse plug-ins they can be added to this manager!
}
