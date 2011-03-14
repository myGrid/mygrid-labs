package uk.org.taverna.t3.workbench.ui.viewers;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.services.IDisposable;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;

import com.google.common.base.Preconditions;

public class ComponentInfoViewer implements IDisposable {
	
	private Composite container;
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	private FormText version;
	private FormText description;
	
	private ComponentDefinition componentDefinition;
	
	public ComponentInfoViewer(ViewPart viewPart, Composite parent) {
		this.container = new Composite(parent, SWT.NONE);
		
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
		
		version = toolkit.createFormText(form.getBody(), false);
		description = toolkit.createFormText(form.getBody(), true);
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
			version.setText(componentDefinition.getVersion(), false, false);
			description.setText(componentDefinition.getDescription(), false, true);
			form.layout();
			form.setBusy(false);
		}
	}

	@Override
	public void dispose() {
		toolkit.dispose();
	}

}
