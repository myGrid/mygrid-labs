package uk.org.taverna.t3.workbench.ui.views;

import lombok.Getter;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.viewers.ConfigureItemViewer;

public class ConfigureItemView extends ViewPart {
	
	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.configureItem";	//$NON-NLS-1$

	@Getter
	private Composite parent;
	
	private ConfigureItemViewer configureItemViewer;
	
	public ConfigureItemView() {
		
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);
		
		configureItemViewer = new ConfigureItemViewer(this, parent);
		configureItemViewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
	}

	@Override
	public void setFocus() {
		configureItemViewer.setFocus();
	}
	
	@Override
	public void dispose() {
		configureItemViewer.dispose();
		super.dispose();
	}

}
