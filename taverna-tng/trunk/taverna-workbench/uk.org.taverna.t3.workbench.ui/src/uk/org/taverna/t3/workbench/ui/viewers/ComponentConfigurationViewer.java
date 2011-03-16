package uk.org.taverna.t3.workbench.ui.viewers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
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
		
		form.setBusy(true);
		
		form.getBody().setLayout(new GridLayout(1, true));
		
		form.setText("Component: " + component.getTitle());
		
//		Label subTitle = toolkit.createLabel(form.getBody(), "Edit configuration");
//		subTitle.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		
		mainPropertiesSection = toolkit.createSection(form.getBody(), Section.TITLE_BAR);
		mainPropertiesSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		mainPropertiesSection.setText("Main Configuration");
		mainPropertiesSection.setExpanded(true);
		mainPropertiesSection.setToolTipText("Edit the main configuration properties for this component");
		mainPropertiesContainer = toolkit.createComposite(mainPropertiesSection);
		mainPropertiesSection.setClient(mainPropertiesContainer);
		TableWrapLayout mainPropertiesContainerLayout = new TableWrapLayout();
		mainPropertiesContainerLayout.numColumns = 2;
		mainPropertiesContainer.setLayout(mainPropertiesContainerLayout);
		
		advancedPropertiesSection = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE);
		advancedPropertiesSection.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		advancedPropertiesSection.setText("Advanced");
		advancedPropertiesSection.setExpanded(false);
		advancedPropertiesSection.setToolTipText("Edit the advanced configuration properties for this component. WARNING: these are not generally meant to be changed so be careful!");
		advancedPropertiesContainer = toolkit.createComposite(advancedPropertiesSection);
		advancedPropertiesSection.setClient(advancedPropertiesContainer);
		TableWrapLayout advancedPropertiesContainerLayout = new TableWrapLayout();
		advancedPropertiesContainerLayout.numColumns = 2;
		mainPropertiesContainer.setLayout(advancedPropertiesContainerLayout);
		
		createPropertyControls();
		
		form.layout();
		form.setBusy(false);
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
		
		// Disable sections if no configuration properties are available in them
		
		if (mainCount == 0) {
			Label label = toolkit.createLabel(mainPropertiesContainer, "Nothing to configure here");
			label.setLayoutData(buildTableWrapData(2));
		}
		
		if (advancedCount == 0) {
			advancedPropertiesSection.setExpanded(false);
			advancedPropertiesSection.setEnabled(false);
		}
	}

	private void createPropertyControl(ConfigurationProperty property,
			Composite container) {
		
		Label label = toolkit.createLabel(container, property.getPredicate());
		label.setLayoutData(buildTableWrapData(2));
		
	}
	
	private TableWrapData buildTableWrapData(int columns) {
		TableWrapData td = new TableWrapData();
		td.colspan = columns;
		td.grabHorizontal = true;
		
		return td;
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
