package uk.org.taverna.tng.mockup3.core;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;

public class ComponentDefinitionsRegistry {

	private static final String EXTENSION_POINT_NAMESPACE = "uk.org.taverna.tng.mockup3.core";
	private static final String EXTENSION_POINT_NAME = "workflowComponents";

	private static final String MISC_GROUP = "Misc";

	public final static ComponentDefinitionsRegistry INSTANCE = new ComponentDefinitionsRegistry();

	private List<IComponentDefinition> entries;
	private List<ComponentDefinitionGroup> topLevelGroups;

	private ComponentDefinitionsRegistry() {
	}

	public List<IComponentDefinition> getAllEntries() {
		if (entries == null) {
			reloadAll();
		}

		return entries;
	}

	public List<ComponentDefinitionGroup> getTopLevelGroups() {
		if (topLevelGroups == null) {
			reloadAll();
		}

		return topLevelGroups;
	}

	public void addComponentDefinition(IComponentDefinition def) {
		if (entries != null && def != null) {
			entries.add(def);
			// TODO: update the topLevelGroups collection to reflect the
			// addition.
		}
	}

	public void addComponentDefinition(IConfigurationElement element) {
		if (entries != null && element != null) {
			entries.add(new ComponentDefinition(element));
			// TODO: update the topLevelGroups collection to reflect the
			// addition.
		}
	}

	private void reloadAll() {
		entries = new ArrayList<IComponentDefinition>();
		topLevelGroups = new ArrayList<ComponentDefinitionGroup>();
		loadFromExtensionsRegistry();
		groupTheDefinitions();
	}

	private void loadFromExtensionsRegistry() {
		IConfigurationElement[] elements = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(EXTENSION_POINT_NAMESPACE,
						EXTENSION_POINT_NAME);

		System.out.println(elements.length
				+ " extensions loaded from the Extensions Registry");

		for (IConfigurationElement element : elements) {
			System.out.println(element.getName());
			if (element.getName().equals("componentDefinition")) {
				entries.add(new ComponentDefinition(element));
			}
		}

		System.out
				.println("INFO: "
						+ entries.size()
						+ " Component Definitions were found from the Extensions Registry");
	}

	private void groupTheDefinitions() {
		if (entries != null) {
			for (IComponentDefinition definition : entries) {
				addDefinitionToGroups(definition);
			}
		}
		
		System.out.println("INFO: " + topLevelGroups.size() + " top level component definition groups found"); 
	}

	private void addDefinitionToGroups(IComponentDefinition definition) {
		ComponentDefinitionGroup groupToGoIn = getComponentDefinitionsGroup(definition
				.getGroup());
		groupToGoIn.addChildDefinition(definition);
	}

	public ComponentDefinitionGroup getComponentDefinitionsGroup(
			String groupPath) {
		String[] constituentGroups = splitPath(groupPath);

		if (constituentGroups.length == 0) {
			// Get or create the "Misc" top level group
			ComponentDefinitionGroup group = ComponentDefinitionGroup
					.findWithin(topLevelGroups, MISC_GROUP, 1);
			if (group == null) {
				group = new ComponentDefinitionGroup(MISC_GROUP);
				topLevelGroups.add(group);
			}
			return group;
		} else {
			ComponentDefinitionGroup group;

			List<ComponentDefinitionGroup> currentGroupListToProcess = topLevelGroups;
			ComponentDefinitionGroup currentGroupToProcess = null;

			ComponentDefinitionGroup currentParentGroup = null;

			for (String groupName : constituentGroups) {
				currentGroupToProcess = ComponentDefinitionGroup.findWithin(
						currentGroupListToProcess, groupName, 1);

				if (currentGroupToProcess == null) {
					currentGroupToProcess = new ComponentDefinitionGroup(
							groupName, currentParentGroup);
					currentGroupListToProcess.add(currentGroupToProcess);
				}

				currentGroupListToProcess = currentGroupToProcess
						.getChildGroups();

				currentParentGroup = currentGroupToProcess;
			}

			group = currentGroupToProcess;

			if (group == null) {
				throw new RuntimeException("group should not be null by now!");
			}

			return group;
		}
	}

	private String[] splitPath(String path) {
		if (path == null) {
			return new String[0];
		} else {
			String[] items = path.split("/");
			ArrayList<String> finalItems = new ArrayList<String>();
			for (String s : items) {
				if (s != null && !s.equals("")) {
					finalItems.add(s);
				}
			}
			return finalItems.toArray(new String[finalItems.size()]);
		}
		// TODO: add checks for empty / null groups names in the output
		// collection
	}

	// TODO: implement a registry change listener so that when new components
	// are added via Eclipse plug-ins they can be added to this manager!
}
