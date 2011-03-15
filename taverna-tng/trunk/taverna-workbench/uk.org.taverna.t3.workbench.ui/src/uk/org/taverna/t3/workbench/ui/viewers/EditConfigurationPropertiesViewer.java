package uk.org.taverna.t3.workbench.ui.viewers;

import java.util.List;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;

/**
 * Viewer to allow editing and persisting of a set of configuration properties
 * for processors on the canvas.
 * 
 * @author Jiten Bhagat
 *
 */
public class EditConfigurationPropertiesViewer implements IDisposable {

	private final List<ConfigurationProperty> properties;
	
	private Composite parent;
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	public EditConfigurationPropertiesViewer(Composite parent, List<ConfigurationProperty> properties) {
		this.parent = parent;
		this.properties = properties;
		
		createControls();
	}
	
	private void createControls() {
		
	}
	
	public void setFocus() {
		if (form != null) {
			form.setFocus();
		}
	}
	
	@Override
	public void dispose() {
		parent.dispose();
		toolkit.dispose();
	}


}
