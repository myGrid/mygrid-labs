package uk.org.taverna.t3.workbench.ui.viewers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.canvas.models.canvas.Component;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationProperty;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyComplex;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteral;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyLiteralOption;
import uk.org.taverna.t3.workbench.canvas.models.canvas.ConfigurationPropertyReference;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldType;

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
			createFillerLabel(mainPropertiesContainer, "Nothing to configure here");
		}
		
		if (advancedCount == 0) {
			createFillerLabel(advancedPropertiesContainer, "Nothing to configure here");
		}
	}

	private void createPropertyControl(ConfigurationProperty property,
			Composite container) {
		
		Label propertyLabel = toolkit.createLabel(container, property.getLabel());
		propertyLabel.setLayoutData(buildTableWrapData(1));
		
		if (property instanceof ConfigurationPropertyLiteral) {
			ConfigurationPropertyLiteral propertyLiteral = (ConfigurationPropertyLiteral) property;
			
			Control valueControl = null;
			
			switch (ConfigFieldType.valueOf(propertyLiteral.getFieldType())) {
				case SINGLE_TEXT:
					valueControl = toolkit.createText(container, propertyLiteral.getValue(), SWT.SINGLE);
					break;
				case MULTI_TEXT:
					valueControl = toolkit.createText(container, propertyLiteral.getValue(), SWT.SINGLE);
					break;
				case DROPDOWN:
					Combo combo = new Combo(container, SWT.VERTICAL | SWT.BORDER | SWT.READ_ONLY);
					for (ConfigurationPropertyLiteralOption option : propertyLiteral.getOptions()) {
						combo.add(option.getValue());
					}
					toolkit.adapt(combo);
					
					valueControl = combo;
					break;
			}
			
			if (valueControl != null) {
				valueControl.setLayoutData(buildTableWrapData(1));
				
				if (property.isFixed() && valueControl instanceof Text) {
					((Text) valueControl).setEditable(false);
				}
			}
			
		} else if (property instanceof ConfigurationPropertyReference) {
			Label tmpLabel = toolkit.createLabel(container, "<currently not supported>");
			tmpLabel.setLayoutData(buildTableWrapData(1));
		} else if (property instanceof ConfigurationPropertyComplex) {
			Label tmpLabel = toolkit.createLabel(container, "<currently not supported>");
			tmpLabel.setLayoutData(buildTableWrapData(1));
		}
		
	}
	
	private TableWrapData buildTableWrapData(int columns) {
		TableWrapData td = new TableWrapData();
		td.colspan = columns;
		td.grabHorizontal = true;
		
		return td;
	}
	
	private void createFillerLabel(Composite container, String text) {
		Label label = toolkit.createLabel(container, text);
		label.setLayoutData(buildTableWrapData(2));
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
