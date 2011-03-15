package uk.org.taverna.t3.workbench.ui.viewers;

import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
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
	
	private Composite container;
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	public EditConfigurationPropertiesViewer(Composite parent, List<ConfigurationProperty> properties) {
		this.properties = properties;
		
		container = new Composite(parent, SWT.NONE);
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		createControls();
	}
	
	private void createControls() {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		container.setLayout(mainLayout);
		
		form = toolkit.createScrolledForm(container);
		form.setLayoutData(new GridData(GridData.FILL_BOTH));
		
		TableWrapLayout layout = new TableWrapLayout();
		form.getBody().setLayout(layout);
		
		form.setText("Editing " + properties.size() + " configuration properties");
	}
	
	public Control getControl() {
		return container;
	}
	
	public void setFocus() {
		if (form != null) {
			form.setFocus();
		}
	}
	
	@Override
	public void dispose() {
		container.dispose();
		toolkit.dispose();
	}


}
