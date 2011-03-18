package uk.org.taverna.t3.workbench.ui.widgets;

import lombok.Getter;

import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapData;

public class ComponentInfoSectionFormTextWrapper extends ComponentInfoSectionWrapper {
	
	@Getter
	private FormText formText;
	
	public ComponentInfoSectionFormTextWrapper(FormToolkit toolkit,
			ScrolledForm form, String title) {
		super(toolkit, form, title);
	}

	@Override
	protected void createSectionClientControl() {
		formText = getToolkit().createFormText(getSection(), true);
		getSection().setClient(formText);
		TableWrapData td = new TableWrapData();
		td.colspan = 1;
		td.grabHorizontal = true;
		getSection().setLayoutData(td);
		getSection().setVisible(false);
	}
	
	public void setContent(String content) {
		setContent(content, false, true);
	}
	
	public void setContent(String content, boolean parseTags, boolean expandURLs) {
		getSection().setText(getTitle());
		formText.setText(content, parseTags, expandURLs);
		getSection().setExpanded(true);
		getSection().setVisible(true);
	}

	@Override
	public void dispose() {
		
	}
	
}
