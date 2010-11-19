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
import uk.org.taverna.t3.workbench.ui.viewers.ComponentPaletteViewer;

public class ComponentPaletteView extends ViewPart {

	@Getter
	private Composite parent;

	private ComponentPaletteViewer componentPaletteViewer;

	public ComponentPaletteView() {

	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		componentPaletteViewer = new ComponentPaletteViewer(parent, FilenameUtils.concat(Platform
				.getInstanceLocation().getURL().getPath(),
				Application.WORKFLOW_COMPONENTS_FOLDER_NAME));
	}

	@Override
	public void setFocus() {
		componentPaletteViewer.setFocus();
	}

}
