package uk.org.taverna.t3.workbench.ui.views;

import java.util.List;

import lombok.Getter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.ui.viewers.ComponentsSearchViewer;

public class ComponentsSearchView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.componentsSearch";	//$NON-NLS-1$
	
	@Getter
	private Composite parent;
	
	private ComponentsSearchViewer componentsSearchViewer;

	public ComponentsSearchView() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		componentsSearchViewer = new ComponentsSearchViewer(this, parent);
		componentsSearchViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		getSite().setSelectionProvider(componentsSearchViewer);
	}

	@Override
	public void setFocus() {
		componentsSearchViewer.setFocus();
	}
	
	@Override
	public void showBusy(boolean busy) {
	     super.showBusy(busy);
	     if (busy)
	         setPartName("Searching...");
	     else
	         setPartName("Find New Components");
	 }
	
	public String getSearchQuery() {
		return componentsSearchViewer.getSearchQuery();
	}
	
	public void setSearchQuery(String searchQuery) {
		componentsSearchViewer.setSearchQuery(searchQuery);
	}

	public List<ComponentSearchResults> getCurrentSearchResults() {
		return componentsSearchViewer.getCurrentSearchResults();
	}

	public void setSearchResults(List<ComponentSearchResults> results) {
		componentsSearchViewer.setSearchResults(results);
	}
	
	public Control getControl() {
		return componentsSearchViewer.getControl();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		componentsSearchViewer.dispose();
		super.dispose();
	}

}
