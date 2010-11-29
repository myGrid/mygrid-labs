package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.util.ComponentsPaletteLayout;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentsPaletteViewer;

public class ComponentsPaletteView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.componentsPalette";	//$NON-NLS-1$

	@Getter
	private Composite parent;

	private ComponentsPaletteViewer componentsPaletteViewer;

	public ComponentsPaletteView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		componentsPaletteViewer = new ComponentsPaletteViewer(this, parent, FilenameUtils.concat(Platform
				.getInstanceLocation().getURL().getPath(),
				Application.WORKFLOW_COMPONENTS_FOLDER_NAME));
		componentsPaletteViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		
		getSite().setSelectionProvider(componentsPaletteViewer);
	}

	@Override
	public void setFocus() {
		componentsPaletteViewer.setFocus();
	}
	
	public ComponentsPaletteLayout cycleComponentsLayout() {
		return componentsPaletteViewer.cycleComponentsLayout();
	}
	
	public void setComponentsLayout(ComponentsPaletteLayout layout) {
		componentsPaletteViewer.setComponentsLayout(layout);
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		componentsPaletteViewer.dispose();
		super.dispose();
	}
}
