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
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentInfoSectionFormTextWrapper;

import com.google.common.base.Preconditions;

public class ComponentInfoViewer implements IDisposable {
	
	private Composite container;
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private ComponentInfoSectionFormTextWrapper version;
	private ComponentInfoSectionFormTextWrapper description;
	private ComponentInfoSectionFormTextWrapper inputs;
	private ComponentInfoSectionFormTextWrapper outputs;
	
	private ComponentDefinition componentDefinition;
	
	public ComponentInfoViewer(ViewPart viewPart, Composite parent) {
		container = new Composite(parent, SWT.NONE);
		
		toolkit = new FormToolkit(parent.getDisplay());
		
		createControls();
		refresh();
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
		
		version = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Version");
		description = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Description");
		inputs = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Inputs");
		outputs = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Outputs");
	}
	
	public Control getControl() {
		return container;
	}
	
	public void setFocus(){
		form.setFocus();
	}

	public void setComponentDefinition(ComponentDefinition cd) {
		Preconditions.checkNotNull(cd);
		componentDefinition = cd;
		refresh();
	}

	public void refresh() {
		if (componentDefinition != null) {
			form.setBusy(true);
			form.setText(componentDefinition.getTitle());
			
			version.setContent(componentDefinition.getVersion());
			
			description.setContent(componentDefinition.getDescription());
			
			inputs.setTitle("Inputs  (" + componentDefinition.getPorts().getInputs().size() + ")");
			inputs.setContent(wrapInFormTags(listStringText(componentDefinition.getPorts().getInputs())), true, false);
			
			outputs.setTitle("Outputs  (" + componentDefinition.getPorts().getOutputs().size() + ")");
			outputs.setContent(wrapInFormTags(listStringText(componentDefinition.getPorts().getOutputs())), true, false);
			
			form.layout();
			form.setBusy(false);
		}
	}

	@Override
	public void dispose() {
		toolkit.dispose();
	}
	
	private String wrapInFormTags(String s) {
		return "<form>" + s + "</form>";
	}

	private String listStringText(List<PortDefinition> ports) {
		StringBuilder sb = new StringBuilder();
		
		for (PortDefinition port : ports) {
			sb.append(port.getLabel());
			
			if (ports.indexOf(port) != (ports.size()-1)) {
				sb.append("<br/>");
			}
		}
		
		return sb.toString();
	}
}
