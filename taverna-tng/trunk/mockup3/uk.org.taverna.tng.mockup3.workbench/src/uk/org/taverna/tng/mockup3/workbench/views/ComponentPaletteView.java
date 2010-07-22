package uk.org.taverna.tng.mockup3.workbench.views;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
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
	private SashForm containerSashForm;
	private Button searchMoreButton;
	private FilteredTree currentComponentsTree;
	private TreeViewer searchComponentsTree;

	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {
//		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
//				| SWT.V_SCROLL);
//		viewer.setContentProvider(new ViewContentProvider());
//		viewer.setLabelProvider(new ViewLabelProvider());
//		viewer.setInput(getViewSite());
		
		parentContainer = parent;
		
		final FillLayout mainLayout = new FillLayout(SWT.VERTICAL);
		mainLayout.marginHeight = 0;
		mainLayout.marginWidth = 0;
		parent.setLayout(mainLayout);
		
		containerSashForm = new SashForm(parent, SWT.SMOOTH | SWT.VERTICAL);
		
		Composite top = new Composite(containerSashForm, SWT.NONE);
		top.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		GridLayout topLayout = new GridLayout(1, true);
		topLayout.marginWidth = 0;
		topLayout.marginHeight = 0;
		top.setLayout(topLayout);
		
		currentComponentsTree = new FilteredTree(top, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, new PatternFilter(), true);
		currentComponentsTree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		TreeViewer currentComponentsTreeViewer = currentComponentsTree.getViewer();
		getSite().setSelectionProvider(currentComponentsTreeViewer);
		currentComponentsTreeViewer.setContentProvider(new CustomContentProvider());
		currentComponentsTreeViewer.setLabelProvider(new CustomLabelProvider());
		currentComponentsTreeViewer.setInput(ComponentDefinitionsRegistry.INSTANCE.getAllEntries());
		
		Composite bottom = new Composite(containerSashForm, SWT.NONE);
		bottom.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		GridLayout bottomLayout = new GridLayout(1, true);
		bottomLayout.marginWidth = 0;
		bottomLayout.marginHeight = 0;
		bottom.setLayout(bottomLayout);
		
		searchMoreButton = new Button(bottom, SWT.PUSH);
		searchMoreButton.setText("Search for more...");
		GridData searchMoreButtonGridData = new GridData(SWT.FILL, SWT.END, true, false);
		searchMoreButton.setLayoutData(searchMoreButtonGridData);
		
		searchComponentsTree = new TreeViewer(bottom, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		searchComponentsTree.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		containerSashForm.setWeights(new int[]{2, 1});
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
