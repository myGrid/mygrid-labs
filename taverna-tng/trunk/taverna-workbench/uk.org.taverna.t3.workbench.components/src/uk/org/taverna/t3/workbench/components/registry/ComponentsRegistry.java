package uk.org.taverna.t3.workbench.components.registry;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lombok.Getter;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonHandler;

import com.google.common.base.Preconditions;

/**
 * Manages a local workflow components registry.
 * 
 * One instance of this registry corresponds to one directory location of
 * workflow component definitions (currently in JSON format).
 * 
 * @author Jits
 * 
 */
public final class ComponentsRegistry {
	@Getter
	private List<ComponentDefinition> definitions = new ArrayList<ComponentDefinition>();

	private File sourceDir;
	
	@SuppressWarnings("unused")
	private ComponentsRegistry() {
		throw new AssertionError();
	}
	
	public ComponentsRegistry(String sourceDirPath) {
		Preconditions.checkNotNull(sourceDirPath);
		
		File f = new File(sourceDirPath);
		
		Preconditions.checkArgument(f.exists(), "Source directory for components registry does not exist");
		
		this.sourceDir = f;
		this.initialise();
	}

	public ComponentsRegistry(File sourceDir) {
		Preconditions.checkNotNull(sourceDir);
		Preconditions.checkArgument(sourceDir.exists(), "Source directory for components registry does not exist");
		
		this.sourceDir = sourceDir;
		this.initialise();
	}

	public void addComponentDefinition(ComponentDefinition definition) {
		Preconditions.checkNotNull(definition);
		
		definitions.add(definition);
		
		// TODO: change to use proper logging mechanism.
		// Dependent on JIRA task: http://www.mygrid.org.uk/dev/issues/browse/TNG-105
		System.out.println("New component definition added: " + definition.getTitle());
	}
	
	private void initialise() {
		Iterator<File> iterator = FileUtils.iterateFiles(sourceDir, new String[] { "json" }, true);
		while(iterator.hasNext()) {
		    File file = (File) iterator.next();
		    
		    try {
				this.addComponentDefinition(JsonHandler.getInstance().buildComponentDefinition(file));
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
