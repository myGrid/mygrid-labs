package uk.org.taverna.tng.mockup3.workbench.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueClient;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueUtil;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.QuerySearchResults;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.Resource;
import uk.org.taverna.tng.mockup3.workbench.core.ISearchTermProvider;

public class ComponentPaletteView extends ViewPart implements ISearchTermProvider{
	public static final String ID = "uk.org.taverna.tng.mockup3.workbench.views.ComponentPaletteView";

	protected static final int SASH_LIMIT = 50;
	
	private static BioCatalogueClient biocatClient = new BioCatalogueClient();
	
	private Composite parentContainer;
	private SashForm containerSashForm;
	private Button searchMoreButton;
	private FilteredTree currentComponentsTree;
	private TreeViewer searchComponentsTree;

	/**
	 * The content provider class is responsible for providing objects to the
	 * view. It can wrap existing objects in adapters or simply return objects
	 * as-is. These objects may be sensitive to the current input of the view,
	 * or ignore it and always show the same content (like Task List, for
	 * example).
	 */
	class ViewContentProvider implements IStructuredContentProvider {
		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}

		public Object[] getElements(Object parent) {
			List<String> serviceNames = new ArrayList<String>();
			
			String query = "blast";
			
			String searchURL = BioCatalogueUtil.appendURLParameter(BioCatalogueClient.API_SEARCH_URL, "q", query);
			
			QuerySearchResults searchResults = new QuerySearchResults();
			
		    try
		    {
		      searchResults.addSearchResults(biocatClient.getBioCatalogueSearchData(searchURL));
		      System.out.println("INFO: " + searchResults.getTotalItemCount(Resource.SERVICE_TYPE)  + " services found.");
		    }
		    catch (Exception e) {
		      System.err.println("ERROR: Couldn't execute initial phase of a search by query, details below:");
		      e.printStackTrace();
		    }
			
			return serviceNames.toArray();	
		}
	}

	class ViewLabelProvider extends LabelProvider implements
			ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			return getText(obj);
		}

		public Image getColumnImage(Object obj, int index) {
			return getImage(obj);
		}

		public Image getImage(Object obj) {
			return PlatformUI.getWorkbench().getSharedImages().getImage(
					ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

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
