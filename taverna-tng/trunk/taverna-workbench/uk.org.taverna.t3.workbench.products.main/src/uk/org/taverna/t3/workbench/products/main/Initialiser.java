package uk.org.taverna.t3.workbench.products.main;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import uk.org.taverna.t3.workbench.components.search.ComponentSearcher;
import uk.org.taverna.t3.workbench.components.search.IComponentSearchProvider;
import uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.BioCatalogueSearchProvider;
import uk.org.taverna.t3.workbench.ui.Application;

/**
 * Initialiser class for initialising/setting certain things during application
 * startup.
 * 
 * Note: this is specific to this particular product and hence exists here. It
 * runs out of band of the UI so do not do any UI specific initialisations here!
 * 
 * FIXME: TODO: look to moving this out of here and as an extension in the .ui bundle.
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
		String newDirPath = FilenameUtils.concat(Platform.getInstanceLocation()
				.getURL().getPath(),
				Application.WORKFLOW_COMPONENTS_FOLDER_NAME);
		File newDir = new File(newDirPath);

		// If the directory already exists then leave it alone.
		// If not, create it with a default set of components
		// currently taken from the example component definitions directory.
		if (newDir.exists() == false) {
			try {
				URL dirUrl = new URL(
						"platform:/plugin/uk.org.taverna.t3.workbench.components/examples/component-definitions");

				File exampleComponentsDir = new File(FileLocator.toFileURL(
						dirUrl).getPath());
				
				FileUtils.copyDirectory(exampleComponentsDir, newDir,
						FileFilterUtils.makeSVNAware(FileFilterUtils
								.notFileFilter(FileFilterUtils
										.prefixFileFilter("_"))), true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void setupInitialSetOfSearchProviders() {
		IComponentSearchProvider biocat = new BioCatalogueSearchProvider("BioCatalogue", 
				"The BioCatalogue Registry",
				"The Life Sciences Web Services Registry", 
				"http://www.biocatalogue.org", 
				null);
		
		ComponentSearcher.getInstance().addProvider(biocat);
	}
}
