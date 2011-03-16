package uk.org.taverna.t3.workbench.ui.viewers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;

/**
 * Viewer to provide viewing and editing capabilities for the
 * configuration of a {@link Component} on the canvas.
 * 
 * @author Jiten Bhagat
 *
 */
public class ComponentConfigurationViewer implements IDisposable {

	private final Component component;
	
	private Composite container;
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private Section mainPropertiesSection;
	private Composite mainPropertiesContainer;
	
	private Section advancedPropertiesSection;
	private Composite advancedPropertiesContainer;
	
	public ComponentConfigurationViewer(Composite parent, Component component) {
		this.component = component;
		
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
		layout.numColumns = 2;
		form.getBody().setLayout(layout);
		
		form.setText("Editing " + component.getConfigurationProperties().size() + " configuration properties");
		
		mainPropertiesSection = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE);
		mainPropertiesContainer = toolkit.createComposite(mainPropertiesSection);
		mainPropertiesSection.setClient(mainPropertiesContainer);
		TableWrapData td1 = new TableWrapData();
		td1.colspan = 2;
		td1.grabHorizontal = true;
		mainPropertiesSection.setLayoutData(td1);
		mainPropertiesSection.setText("Main");
		
		advancedPropertiesSection = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE);
		advancedPropertiesContainer = toolkit.createComposite(advancedPropertiesSection);
		advancedPropertiesSection.setClient(advancedPropertiesContainer);
		TableWrapData td2 = new TableWrapData();
		td1.colspan = 2;
		td2.grabHorizontal = true;
		advancedPropertiesSection.setLayoutData(td2);
		advancedPropertiesSection.setText("Advanced");
		advancedPropertiesSection.setExpanded(false);
		
		createPropertyControls();
	}
	
	private void createPropertyControls() {
		int mainCount = 0;
		int advancedCount = 0;
		
		for (ConfigurationProperty property : component.getConfigurationProperties()) {
			if (property.isHidden()) {
				createPropertyControl(property, advancedPropertiesContainer);
				advancedCount++;
			} else {
				createPropertyControl(property, mainPropertiesContainer);
				mainCount++;
			}
		}
		
		// Disable sections if no component are available in them
		
		if (mainCount == 0) {
			mainPropertiesSection.setExpanded(false);
			mainPropertiesSection.setEnabled(false);
		}
		
		if (advancedCount == 0) {
			advancedPropertiesSection.setExpanded(false);
			advancedPropertiesSection.setEnabled(false);
		}
	}

	private void createPropertyControl(ConfigurationProperty property,
			Composite container) {
		
		
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
