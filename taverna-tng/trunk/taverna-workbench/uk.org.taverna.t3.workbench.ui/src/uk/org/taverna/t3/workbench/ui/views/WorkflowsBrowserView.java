package uk.org.taverna.t3.workbench.ui.views;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.util.ImageKeys;
import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionManager;
import uk.org.taverna.t3.workbench.workflows.model.WorkflowsCollectionSource;

public class WorkflowsBrowserView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.workflows";
	
	private FilteredTree tree;

	public WorkflowsBrowserView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		
		/**********
		 * Dummy data, for now.
		 */
		
		WorkflowsCollectionManager manager = new WorkflowsCollectionManager();
		manager.addSource(new WorkflowsCollectionSource("myExperiment: My Workflows", ImageKeys.MYEXP_ICON));
		manager.addSource(new WorkflowsCollectionSource("myExperiment: Favourite Workflows", ImageKeys.MYEXP_ICON));
		manager.addSource(new WorkflowsCollectionSource("myExperiment: Saved Search - 'Blast'", ImageKeys.MYEXP_ICON));
		manager.addSource(new WorkflowsCollectionSource("Local Folder: C:\\workflows", ImageKeys.FOLDER_ICON));
		manager.addSource(new WorkflowsCollectionSource("Local Folder: C:\\Users\\Jym\\workflows", ImageKeys.FOLDER_ICON));
		manager.addSource(new WorkflowsCollectionSource("In Workspace", ImageKeys.FOLDER_ICON));
		
		/**********/
		
		tree = new FilteredTree(parent, SWT.MULTI
				| SWT.H_SCROLL | SWT.V_SCROLL, new PatternFilter(), true);
		tree.getViewer().setContentProvider(new WorkbenchContentProvider());
		tree.getViewer().setLabelProvider(new WorkbenchLabelProvider());
		tree.getViewer().setInput(manager);

	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

}
