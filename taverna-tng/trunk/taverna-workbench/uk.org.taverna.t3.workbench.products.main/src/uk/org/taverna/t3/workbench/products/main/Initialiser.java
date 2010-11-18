package uk.org.taverna.t3.workbench.products.main;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.osgi.service.datalocation.Location;

import uk.org.taverna.t3.workbench.ui.Application;

/**
 * Initialiser class for initialising/setting certain things during application
 * startup.
 * 
 * Note: this is specific to this particular product and hence exists here. It
 * runs out of band of the UI so do not do any UI specific initialisations here!
 * 
 * TODO: look to moving this out of here and as an extension in the .ui bundle.
 * That way products AND other bundles can provide loading/setup routines. Then,
 * for example the initialisation of the initial set of components can happen in
 * the .components bundle. (JIRA task:
 * http://www.mygrid.org.uk/dev/issues/browse/TNG-102)
 * 
 * @author Jits
 */
public class Initialiser {
	// private IWorkspace workspace;
	// private IPath workspaceLoc;
	
	public Initialiser() {
		// workspace = ResourcesPlugin.getWorkspace();
		// workspaceLoc = workspace.getRoot().getLocation();
	}

	/**
	 * Sets up an initial set of workflow components in the user's local
	 * components registry.
	 * 
	 * @throws IOException 
	 */
	public void setupInitialSetOfWorkflowsComponents() throws IOException {
		Location workspaceLoc = Platform.getInstanceLocation();
		String newDirPath = FilenameUtils.concat(workspaceLoc.getURL().toString(), Application.WORKFLOW_COMPONENTS_FOLDER_NAME);
		File dir = new File(newDirPath);

		// If the directory already exists then leave it alone.
		// If not, create it with a default set of components.
		if (!dir.exists()) {
			String exampleComponentsFilePath = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions/";
			File exampleComponentsDir = new File(exampleComponentsFilePath);
			FileUtils.copyDirectory(exampleComponentsDir, dir, FileFilterUtils.notFileFilter(FileFilterUtils.prefixFileFilter("_")));
		}
	}
}
