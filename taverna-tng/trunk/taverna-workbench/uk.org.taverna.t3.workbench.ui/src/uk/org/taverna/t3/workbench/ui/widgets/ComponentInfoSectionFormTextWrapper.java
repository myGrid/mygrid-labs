package uk.org.taverna.t3.workbench.ui.widgets;

import lombok.Getter;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;

import com.google.common.base.Preconditions;

public class ComponentInfoSectionFormTextWrapper {
	
	private static final int SEPARATOR_HEIGHT = 5;
	
	private final FormToolkit toolkit;
	private final ScrolledForm form;
	
	@Getter
	private String title;
	
	private Section section;
	private FormText formText;
	
	public ComponentInfoSectionFormTextWrapper(FormToolkit toolkit, ScrolledForm form, String title) {
		this.toolkit = toolkit;
		this.form = form;
		
		setTitle(title);
		
		createControls();
	}

	private void createControls() {
		section = toolkit.createSection(form.getBody(), Section.TITLE_BAR | Section.TWISTIE);
		formText = toolkit.createFormText(section, true);
		section.setClient(formText);
		TableWrapData td = new TableWrapData();
		td.colspan = 1;
		td.grabHorizontal = true;
		section.setLayoutData(td);
		section.setVisible(false);
		
		createSeparator();
	}
	
	public void setTitle(String title) {
		Preconditions.checkNotNull(title);
		Preconditions.checkArgument(StringUtils.isNotBlank(title));
		this.title = title;
	}
	
	public void setContent(String content) {
		setContent(content, false, true);
	}
	
	public void setContent(String content, boolean parseTags, boolean expandURLs) {
		section.setText(title);
		formText.setText(content, parseTags, expandURLs);
		section.setExpanded(true);
		section.setVisible(true);
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
	
	private void createSeparator() {
		createSeparator(form.getBody(), SEPARATOR_HEIGHT);
	}

	private void createSeparator(Composite container, int height) {
		Label separator = toolkit.createSeparator(container, SWT.NONE);
		TableWrapData td = new TableWrapData();
		td.colspan = 1;
		td.grabHorizontal = true;
		td.heightHint = height;
		separator.setLayoutData(td);
	}
}
