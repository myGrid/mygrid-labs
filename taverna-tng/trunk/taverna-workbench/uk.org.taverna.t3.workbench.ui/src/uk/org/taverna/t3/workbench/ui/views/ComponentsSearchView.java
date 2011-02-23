package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentsPaletteViewer;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentsSearchViewer;

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

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		componentsSearchViewer.dispose();
		super.dispose();
	}

}
