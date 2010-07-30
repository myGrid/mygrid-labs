package uk.org.taverna.tng.mockup3.core;

import java.util.ArrayList;
import java.util.List;

public class ComponentDefinitionGroup {
	
	// Currently, only depth = 1 is supported
	public static ComponentDefinitionGroup findWithin(List<ComponentDefinitionGroup> groups, String groupNameToFind, int depth) {
		if (depth != 1) {
			return null;
		}
		
		for (ComponentDefinitionGroup group : groups) {
			if (group.getName().equals(groupNameToFind)) {
				return group;
			}
		}
		
		return null;
	}
	
	private final String name;
	private final ComponentDefinitionGroup parent;
	
	private List<ComponentDefinitionGroup> childGroups;
	private List<IComponentDefinition> childDefinitions;
	
	public ComponentDefinitionGroup(String name) {
		this.name = name;
		parent = null; 
		initialise();
	}

	public ComponentDefinitionGroup(String name, ComponentDefinitionGroup parent) {
		this.name = name;
		this.parent = parent;
		initialise();
	}

	public String getName() {
		return name;
	}
	
	public ComponentDefinitionGroup getParent() {
		return parent;
	}

	public List<ComponentDefinitionGroup> getChildGroups() {
		return childGroups;
	}
	
	public List<IComponentDefinition> getChildDefinitions() {
		return childDefinitions;
	}
	
	public void addChildGroup(ComponentDefinitionGroup group) {
		if (group != null) {
			childGroups.add(group);
		}
	}
	
	public void addChildDefinition(IComponentDefinition definition) {
		if (definition != null) {
			childDefinitions.add(definition);			
		}
	}
	
	private void initialise() {
		childGroups = new ArrayList<ComponentDefinitionGroup>();
		childDefinitions = new ArrayList<IComponentDefinition>();
	}
	
	public String getFullGroupPathFriendlyLabel() {
		StringBuilder sb = new StringBuilder();
		
		ComponentDefinitionGroup parentToProcess = parent;
		
		while (parentToProcess != null) {
			sb.append(parentToProcess.getName() + " > ");
			parentToProcess = parentToProcess.getParent();
		}
		
		sb.append(name);
		
		return sb.toString();
	}
	
}
