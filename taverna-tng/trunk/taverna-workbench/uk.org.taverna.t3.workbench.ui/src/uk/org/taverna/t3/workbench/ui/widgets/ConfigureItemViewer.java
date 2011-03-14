package uk.org.taverna.t3.workbench.ui.widgets;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;


/**
 * Viewer to allow configuring of an item.
 * 
 * Currently, this specifically supports configuring of
 * {@link ConfigurationProperty} items in a {@link Canvas},
 * but in the future it could be made to handle other things
 * in a pluggable fashion (possibly building on {@link StructuredViewer})
 * 
 * @author Jiten Bhagat
 *
 */
public class ConfigureItemViewer implements IDisposable {

	private Composite container;
	
	private EditConfigurationPropertiesViewer editConfigurationPropertiesViewer;
	
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
