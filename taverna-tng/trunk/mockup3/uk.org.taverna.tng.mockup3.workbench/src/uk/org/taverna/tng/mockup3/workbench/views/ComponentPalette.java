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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueClient;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.BioCatalogueUtil;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.QuerySearchResults;
import uk.org.taverna.tng.mockup3.workbench.biocatalogue.Resource;

public class ComponentPalette extends ViewPart {
	public static final String ID = "uk.org.taverna.tng.mockup3.workbench.views.ComponentPalette";
	
	private static BioCatalogueClient biocatClient = new BioCatalogueClient();

	private TableViewer viewer;

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
		viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL
				| SWT.V_SCROLL);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setInput(getViewSite());
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

}
