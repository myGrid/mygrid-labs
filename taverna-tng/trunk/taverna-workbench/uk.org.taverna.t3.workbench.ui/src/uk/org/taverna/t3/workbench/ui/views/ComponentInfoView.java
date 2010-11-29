package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.widgets.ComponentInfoViewer;

public class ComponentInfoView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.componentInfo";
	
	@Getter
	private Composite parent;
	
	private ComponentInfoViewer componentInfoViewer;
	
	public ComponentInfoView() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);
		
		componentInfoViewer = new ComponentInfoViewer(this, parent);
		componentInfoViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Override
	public void setFocus() {
		componentInfoViewer.setFocus();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		componentInfoViewer.dispose();
		super.dispose();
	}
	
}
