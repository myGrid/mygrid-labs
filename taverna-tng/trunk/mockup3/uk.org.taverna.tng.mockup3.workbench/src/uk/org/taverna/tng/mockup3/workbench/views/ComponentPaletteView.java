package uk.org.taverna.tng.mockup3.workbench.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.tng.mockup3.core.ComponentDefinitionsRegistry;
import uk.org.taverna.tng.mockup3.core.ISearchTermProvider;
import uk.org.taverna.tng.mockup3.workbench.util.CustomContentProvider;
import uk.org.taverna.tng.mockup3.workbench.util.CustomLabelProvider;

public class ComponentPaletteView extends ViewPart implements ISearchTermProvider{
	public static final String ID = "uk.org.taverna.tng.mockup3.workbench.views.ComponentPaletteView";

	protected static final int SASH_LIMIT = 50;
	
	private Composite parentContainer;
	private StackLayout containerStackLayout;
	private FilteredTree currentComponentsTree;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
		parentContainer = parent;
		
		containerStackLayout = new StackLayout();
		
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
 		parent.setLayout(containerStackLayout);
 		
 		currentComponentsTree = new FilteredTree(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, new PatternFilter(), true);
		currentComponentsTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		TreeViewer currentComponentsTreeViewer = currentComponentsTree.getViewer();
		getSite().setSelectionProvider(currentComponentsTreeViewer);
		currentComponentsTreeViewer.setContentProvider(new CustomContentProvider());
		currentComponentsTreeViewer.setLabelProvider(new CustomLabelProvider());
		currentComponentsTreeViewer.setInput(ComponentDefinitionsRegistry.INSTANCE.getAllEntries());
 		
 		containerStackLayout.topControl = currentComponentsTree;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		currentComponentsTree.getFilterControl().setFocus();
	}

	@Override
	public String getSearchTerm() {
		return currentComponentsTree.getFilterControl().getText();
	}

}
