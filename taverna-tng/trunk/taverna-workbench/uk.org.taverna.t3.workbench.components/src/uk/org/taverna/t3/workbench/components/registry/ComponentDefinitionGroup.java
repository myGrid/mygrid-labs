package uk.org.taverna.t3.workbench.components.registry;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

public abstract class ComponentDefinitionGroup implements Comparable<ComponentDefinitionGroup> {
	@Getter
	protected String name;
	
	protected final List<ComponentDefinition> definitions;
	
	public ComponentDefinitionGroup(String name) {
		this.name = name;
		
		definitions = new ArrayList<ComponentDefinition>();
	}
	
	public ComponentDefinitionGroup(String name, List<ComponentDefinition> definitions) {
		this.name = name;
		this.definitions = definitions;
	}
	
	/**
	 * @return An immutable list of the component definitions in this group.
	 */
	public List<ComponentDefinition> getDefinitions() {
		return ImmutableList.copyOf(definitions);
	}
	
	public void addDefinition(ComponentDefinition cd) {
		Preconditions.checkNotNull(cd);
		
		definitions.add(cd);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(ComponentDefinitionGroup o) {
		Preconditions.checkNotNull(o);
		return getName().compareToIgnoreCase(o.getName());
	}
}
