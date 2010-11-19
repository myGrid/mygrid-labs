package uk.org.taverna.t3.workbench.components.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

import com.google.common.base.Preconditions;

/**
 * Helper singleton to build ComponentDefinitionGroups (of all kinds).
 * 
 * This works in such a way that groups built from other groups always point to
 * the same list of definitions under the hood. Therefore updates to this
 * underlying list is available to all groups built from it.
 * 
 * All lists of groups returned, by default, will be sorted alphabetically.
 * 
 * @author Jits
 * 
 */
public class ComponentDefinitionGroupsBuilder {

	/*
	 * Singleton handling
	 */

	// Private constructor prevents instantiation from other classes
	private ComponentDefinitionGroupsBuilder() {

	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * ComponentDefinitionGroupsBuilder.getInstance() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final ComponentDefinitionGroupsBuilder INSTANCE = new ComponentDefinitionGroupsBuilder();
	}

	public static ComponentDefinitionGroupsBuilder getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/*
	 * ==================
	 */

	/**
	 * Builds the tree of groups for the definitions provided.
	 * 
	 * @param definitions
	 * @return a list of the top level groups
	 */
	public List<ComponentDefinitionTreeGroup> buildTreeGroups(
			List<ComponentDefinition> definitions) {
		Preconditions.checkNotNull(definitions);

		List<ComponentDefinitionTreeGroup> topLevelGroups = new ArrayList<ComponentDefinitionTreeGroup>();

		for (ComponentDefinition definition : definitions) {
			for (String path : definition.getGroups()) {
				ComponentDefinitionTreeGroup groupToGoIn = getOrCreateTreeGroup(
						path, topLevelGroups);
				groupToGoIn.addDefinition(definition);
			}
		}
		
		// Sorting not required here as it should have been taken care of by the method(s)
		// used to build the groups.

		return topLevelGroups;
	}

	private ComponentDefinitionTreeGroup getOrCreateTreeGroup(String groupPath,
			List<ComponentDefinitionTreeGroup> groups) {
		ComponentDefinitionTreeGroup group = null;
		
		String[] constituentGroups = splitPath(groupPath);

		if (constituentGroups.length == 0) {
			group = getOrCreateTreeGroup(ComponentsRegistry.NO_GROUP, groups);
		} else {
			List<ComponentDefinitionTreeGroup> currentGroupListToProcess = groups;
			ComponentDefinitionTreeGroup currentGroupToProcess = null;
			ComponentDefinitionTreeGroup currentParentGroup = null;

			for (String groupName : constituentGroups) {
				currentGroupToProcess = (ComponentDefinitionTreeGroup) findGroupWithin(currentGroupListToProcess, groupName);

				if (currentGroupToProcess == null) {
					currentGroupToProcess = new ComponentDefinitionTreeGroup(groupName, currentParentGroup);
					currentGroupListToProcess.add(currentGroupToProcess);
					Collections.sort(currentGroupListToProcess);
				}

				currentGroupListToProcess = currentGroupToProcess
						.getChildGroups();

				currentParentGroup = currentGroupToProcess;
			}

			group = currentGroupToProcess;

			if (group == null) {
				throw new NullPointerException("Component definitions group should not be null by now!");
			}
		}
		
		return group;
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
		// array
	}
	
	/**
	 * Finds a matching group within the list of groups provided.
	 * 
	 * Note: this does not drill down into the sub groups of the groups.
	 * 
	 * @param groups
	 * @return the matching groups
	 */
	private ComponentDefinitionTreeGroup findGroupWithin(List<ComponentDefinitionTreeGroup> groups, String name) {
		for (ComponentDefinitionTreeGroup group : groups) {
			if (group.getName().equals(name)) {
				return group;
			}
		}
		
		return null;
	}
	
	/**
	 * Builds the flat list of groups from the given list of
	 * ComponentDefinitionTreeGroup objects.
	 * 
	 * @param definitions
	 * @return a list of groups
	 */
	public List<ComponentDefinitionFlatGroup> buildFlatGroups(
			List<ComponentDefinitionTreeGroup> treeGroups) {
		Preconditions.checkNotNull(treeGroups);

		List<ComponentDefinitionFlatGroup> groups = new ArrayList<ComponentDefinitionFlatGroup>();

		for (ComponentDefinitionTreeGroup treeGroup : treeGroups) {
			groups.addAll(treeGroup.flattenedGroups());
		}
		
		Collections.sort(groups);

		return groups;
	}
}
