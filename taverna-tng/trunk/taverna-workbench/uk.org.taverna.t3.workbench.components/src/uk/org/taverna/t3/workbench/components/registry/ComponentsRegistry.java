package uk.org.taverna.t3.workbench.components.registry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonHandler;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

/**
 * Manages a local workflow components registry.
 * 
 * Currently, one instance of a component registry uses one storage location of
 * workflow component definitions (in JSON format). THIS IS SUBJECT TO CHANGE IN
 * THE FUTURE.
 * 
 * @author Jits
 * 
 */
public final class ComponentsRegistry {
	public static final String NO_GROUP = "Misc";

	private boolean loaded = false;

	private List<ComponentDefinition> definitions = new ArrayList<ComponentDefinition>();
	private List<ComponentDefinitionTreeGroup> topLevelTreeGroups = new ArrayList<ComponentDefinitionTreeGroup>();
	private List<ComponentDefinitionFlatGroup> topLevelFlatGroups = new ArrayList<ComponentDefinitionFlatGroup>();

	private File storageLoc;

	@SuppressWarnings("unused")
	private ComponentsRegistry() {
		throw new AssertionError();
	}

	public ComponentsRegistry(String storageLocPath) {
		Preconditions.checkNotNull(storageLocPath);

		File f = new File(storageLocPath);

		Preconditions.checkArgument(f.exists(),
				"Storage location for components registry does not exist");

		this.storageLoc = f;
	}

	public ComponentsRegistry(File storageLocPath) {
		Preconditions.checkNotNull(storageLocPath);
		Preconditions.checkArgument(storageLocPath.exists(),
				"Storage location for components registry does not exist");

		this.storageLoc = storageLocPath;
	}

	public void addComponentDefinition(ComponentDefinition definition) {
		Preconditions.checkNotNull(definition);

		definitions.add(definition);

		// TODO: need to add to the groups.
		// See mockup3 code.

		// TODO: change to use proper logging mechanism.
		// Dependent on JIRA task:
		// http://www.mygrid.org.uk/dev/issues/browse/TNG-105
		System.out.println("New component definition added: "
				+ definition.getTitle());
	}

	/**
	 * @return An immutable flat list of all the component definitions in this
	 *         registry.
	 */
	public List<ComponentDefinition> getAllDefinitions() {
		return ImmutableList.copyOf(definitions);
	}
	
	public int totalDefinitions() {
		return definitions.size();
	}

	public List<ComponentDefinitionTreeGroup> getTopLevelTreeGroups() {
		return ImmutableList.copyOf(topLevelTreeGroups);
	}

	public List<ComponentDefinitionFlatGroup> getTopLevelFlatGroups() {
		return ImmutableList.copyOf(topLevelFlatGroups);
	}
	
	public int totalGroups() {
		return topLevelFlatGroups.size();
	}

	public boolean load() {
		boolean status = true;

		definitions = new ArrayList<ComponentDefinition>();

		Iterator<File> iterator = FileUtils.iterateFiles(storageLoc,
				new String[] { "json" }, true);

		while (iterator.hasNext()) {
			File file = (File) iterator.next();

			try {
				ComponentDefinition cd = JsonHandler.getInstance().buildComponentDefinition(file);
				
				if (!definitions.contains(cd)) {
					this.addComponentDefinition(cd);
				} else {
					System.out.println("Duplicate component definition found...");
					System.out.println("\tID: " + cd.getId());
					System.out.println("\tLabel: " + cd.getLabel());
					
					// TODO: log this somewhere both for system and user purposes.
					// See JIRA task: http://www.mygrid.org.uk/dev/issues/browse/TNG-109
				}
			} catch (JsonParseException e) {
				// TODO: log!
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO: log!
				e.printStackTrace();
			} catch (IOException e) {
				status = false;
				e.printStackTrace();
			}
		}
		
		System.out.println("INFO: " + definitions.size()
				+ " component definitions found");

		buildGroups();

		loaded = status;

		return status;
	}

	public boolean isLoaded() {
		return loaded;
	}

	public boolean reload() {
		return load();
	}

	public String getStorageLocFullPath() {
		return storageLoc.getAbsolutePath();
	}

	private void buildGroups() {
		topLevelTreeGroups = ComponentDefinitionGroupsBuilder.getInstance()
				.buildTreeGroups(definitions);
		topLevelFlatGroups = ComponentDefinitionGroupsBuilder.getInstance()
				.buildFlatGroups(topLevelTreeGroups);

		System.out.println("INFO: " + topLevelTreeGroups.size()
				+ " top level component definition tree groups found");
		System.out.println("INFO: " + topLevelFlatGroups.size()
				+ " top level component definition flat groups found");
	}
}
