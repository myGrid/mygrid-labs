package uk.org.taverna.t3.workbench.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

public class ConfigureItemViewer implements IDisposable {

	private Composite container;
	
	public ConfigureItemViewer(ViewPart viewPart, Composite parent) {
		container = new Composite(parent, SWT.NONE);
		
		createControls();
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
		
	}

	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
