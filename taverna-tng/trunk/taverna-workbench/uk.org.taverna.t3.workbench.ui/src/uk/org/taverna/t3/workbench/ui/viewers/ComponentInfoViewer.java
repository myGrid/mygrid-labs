package uk.org.taverna.t3.workbench.ui.viewers;

import java.net.URL;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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

import uk.org.taverna.t3.workbench.components.definitions.model.AttributionRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.CreditRef;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.ui.util.UIUtils;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentInfoSectionFormTextWrapper;
import uk.org.taverna.t3.workbench.ui.widgets.ComponentInfoSectionImageWrapper;

import com.google.common.base.Preconditions;

public class ComponentInfoViewer implements IDisposable {
	
	private Composite container;
	
	private FormToolkit toolkit;
	private ScrolledForm form;
	
	private ComponentInfoSectionFormTextWrapper version;
	private ComponentInfoSectionFormTextWrapper description;
	private ComponentInfoSectionImageWrapper preview;
	private ComponentInfoSectionFormTextWrapper inputs;
	private ComponentInfoSectionFormTextWrapper outputs;
	private ComponentInfoSectionFormTextWrapper tags;
	private ComponentInfoSectionFormTextWrapper source;
	private ComponentInfoSectionFormTextWrapper creator;
	private ComponentInfoSectionFormTextWrapper credits;
	private ComponentInfoSectionFormTextWrapper attributions;
	
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
		preview = new ComponentInfoSectionImageWrapper(toolkit, form, "Preview");
		inputs = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Inputs");
		outputs = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Outputs");
		tags = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Keywords");
		source = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Original Source");
		creator = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Creator");
		credits = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Credits");
		attributions = new ComponentInfoSectionFormTextWrapper(toolkit, form, "Attributions");
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
			form.setRedraw(false);
			
			form.setText(componentDefinition.getTitle());
			
			version.setContent(componentDefinition.getVersion());
			
			description.setContent(componentDefinition.getDescription());
			
			preview.setImageUrl(componentDefinition.getPreviewImage());
			
			inputs.setTitle("Inputs  (" + componentDefinition.getPorts().getInputs().size() + ")");
			inputs.setContent(portsToTextualList(componentDefinition.getPorts().getInputs()), true, false);
			
			outputs.setTitle("Outputs  (" + componentDefinition.getPorts().getOutputs().size() + ")");
			outputs.setContent(portsToTextualList(componentDefinition.getPorts().getOutputs()), true, false);
			
			tags.setTitle("Keywords (" + componentDefinition.getTags().size() + ")");
			tags.setContent(tagsToTextualList(componentDefinition.getTags()), true, false);
			
			if (componentDefinition.getSource() == null) {
				source.setContent("N/A");
			} else {
				source.setContent(UIUtils.wrapInFormTags(link(componentDefinition.getSource().getTitle(), componentDefinition.getSource().getResource())), true, false);
			}
			
			if (componentDefinition.getCreator() == null) {
				creator.setContent("N/A");
			} else {
				creator.setContent(UIUtils.wrapInFormTags(link(componentDefinition.getCreator().getName(), componentDefinition.getCreator().getHomepage())), true, false);
			}
			
			credits.setContent(creditRefsToTextualList(componentDefinition.getCredits()), true, false);
			
			attributions.setContent(attributionRefsToTextualList(componentDefinition.getAttributions()), true, false);
			
			
			form.setRedraw(true);
			form.setBusy(false);
		}
	}
	
	private String link(String label, String href) {
		if (StringUtils.isBlank(label) || StringUtils.isEmpty(label))
			return "";
		else
			return "<p><a href=\"" + href + "\">" + label + "</a></p>";	
	}
	
	private String link(String label, URL url) {
		String href = "";
		if (url != null) {
			href = url.toString();
		}
		return link(label, href);
	}
	
	private String creditRefsToTextualList(List<CreditRef> refs) {
		StringBuilder sb = new StringBuilder();
		
		for (CreditRef ref : refs) {
			sb.append(link(ref.getName(), ref.getHomepage()));
			
			if (refs.indexOf(ref) != (refs.size()-1)) {
				sb.append("<br/>");
			}
		}
		
		return UIUtils.wrapInFormTags(sb.toString());
	}
	
	private String attributionRefsToTextualList(List<AttributionRef> refs) {
		StringBuilder sb = new StringBuilder();
		
		for (AttributionRef ref : refs) {
			sb.append(link(ref.getTitle(), ref.getResource()));
		}
		
		return UIUtils.wrapInFormTags(sb.toString());
	}

	private String tagsToTextualList(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		
		for (String s : strings) {
			sb.append(s);
			
			if (strings.indexOf(s) != (strings.size()-1)) {
				sb.append(", ");
			}
		}
		
		return UIUtils.wrapInFormTags(sb.toString());
	}

	private String portsToTextualList(List<PortDefinition> ports) {
		StringBuilder sb = new StringBuilder();
		
		for (PortDefinition port : ports) {
			sb.append(port.getLabel());
			
			if (ports.indexOf(port) != (ports.size()-1)) {
				sb.append("<br/>");
			}
		}
		
		return UIUtils.wrapInFormTags(sb.toString());
	}
	
	@Override
	public void dispose() {
		toolkit.dispose();
	}
}
