package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.Application;
import uk.org.taverna.t3.workbench.ui.viewers.ComponentsPaletteViewer;

public class ComponentsPaletteView extends ViewPart {

	@Getter
	private Composite parent;

	private ComponentsPaletteViewer componentsPaletteViewer;

	public ComponentsPaletteView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		componentsPaletteViewer = new ComponentsPaletteViewer(this, parent, FilenameUtils.concat(Platform
				.getInstanceLocation().getURL().getPath(),
				Application.WORKFLOW_COMPONENTS_FOLDER_NAME));
		
		componentsPaletteViewer.getControl().setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		getSite().setSelectionProvider(componentsPaletteViewer);
	}

	@Override
	public void setFocus() {
		componentsPaletteViewer.setFocus();
	}

}
