package uk.org.taverna.t3.workbench.components.registry;

import java.util.ArrayList;
import java.util.List;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

import lombok.Getter;

import com.google.common.base.Preconditions;

public class ComponentDefinitionTreeGroup extends ComponentDefinitionGroup {
	@Getter
	private final ComponentDefinitionTreeGroup parent;
	
	private final List<ComponentDefinitionTreeGroup> childGroups = new ArrayList<ComponentDefinitionTreeGroup>();
	
	public ComponentDefinitionTreeGroup(String name) {
		super(name);
		
		parent = null;
	}
	
	public ComponentDefinitionTreeGroup(String name,
			List<ComponentDefinition> definitions) {
		super(name, definitions);
		
		parent = null;
	}
	
	public ComponentDefinitionTreeGroup(String name, ComponentDefinitionTreeGroup parent) {
		super(name);
		this.parent = parent;
	}
	
	public ComponentDefinitionTreeGroup(String name, List<ComponentDefinition> definitions, ComponentDefinitionTreeGroup parent) {
		super(name, definitions);
		this.parent = parent;
	}
	
	public void addChildGroup(ComponentDefinitionTreeGroup group) {
		Preconditions.checkNotNull(group);
		
		childGroups.add(group);
	}
	
	public List<ComponentDefinitionTreeGroup> getChildGroups() {
		return childGroups;
	}
	
	public String getFullGroupPathFriendlyLabel() {
		StringBuilder sb = new StringBuilder();
		
		ComponentDefinitionTreeGroup parentToProcess = parent;
		
		while (parentToProcess != null) {
			sb.append(parentToProcess.getName() + " > ");
			parentToProcess = parentToProcess.getParent();
		}
		
		sb.append(name);
		
		return sb.toString();
	}
	
	/**
	 * Returns the complete list of flat groups from this tree group and all it's children.
	 * 
	 * @return the complete list of flat groups.
	 */
	public List<ComponentDefinitionFlatGroup> flattenedGroups() {
		List<ComponentDefinitionFlatGroup> groups = new ArrayList<ComponentDefinitionFlatGroup>();
		
		if (definitions.size() > 0) {
			groups.add(new ComponentDefinitionFlatGroup(getFullGroupPathFriendlyLabel(), definitions));
		}
		
		for (ComponentDefinitionTreeGroup treeGroup : childGroups) {
			groups.addAll(treeGroup.flattenedGroups());
		}
		
		return groups;
	}
}
