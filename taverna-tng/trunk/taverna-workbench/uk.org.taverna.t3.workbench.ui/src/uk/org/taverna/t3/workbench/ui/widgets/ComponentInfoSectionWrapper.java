package uk.org.taverna.t3.workbench.ui.widgets;

import lombok.Getter;
import lombok.Setter;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.services.IDisposable;

public abstract class ComponentInfoSectionWrapper implements IDisposable {

	private static final int SEPARATOR_HEIGHT = 5;
	
	@Getter
	private final FormToolkit toolkit;
	@Getter
	private final ScrolledForm form;
	
	@Getter
	@Setter
	private String title;
	
	@Getter
	private Section section;
	
	public ComponentInfoSectionWrapper(FormToolkit toolkit, ScrolledForm form, String title) {
		this.toolkit = toolkit;
		this.form = form;
		
		setTitle(title);
		
		createSectionControl();
		createSectionClientControl();
		createSpacer();
	}
	
	private void createSectionControl() {
		section = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE);
	}
	
	protected abstract void createSectionClientControl();
	
	protected void createSpacer() {
		createSpacer(form.getBody(), SEPARATOR_HEIGHT);
	}

	protected void createSpacer(Composite container, int height) {
		Label separator = toolkit.createLabel(container, "", SWT.NONE);
		TableWrapData td = new TableWrapData();
		td.colspan = 1;
		td.grabHorizontal = true;
		td.heightHint = height;
		separator.setLayoutData(td);
	}
	
	public void setVisible(boolean visible) {
		section.setVisible(visible);
	}
	
	public void show() {
		setVisible(true);
	}
	
	public void hide() {
		setVisible(false);
	}
	
}
