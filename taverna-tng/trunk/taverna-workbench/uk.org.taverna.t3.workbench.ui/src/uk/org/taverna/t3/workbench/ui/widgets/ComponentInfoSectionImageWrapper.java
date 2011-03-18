package uk.org.taverna.t3.workbench.ui.widgets;

import java.net.URL;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

import uk.org.taverna.t3.workbench.ui.util.UIUtils;


public class ComponentInfoSectionImageWrapper extends ComponentInfoSectionFormTextWrapper {

	private Image image;
	
	public ComponentInfoSectionImageWrapper(FormToolkit toolkit,
			ScrolledForm form, String title) {
		super(toolkit, form, title);
	}

	public void setImageUrl(URL url) {
		if (url == null) {
			setContent("N/A");
		} else {
			String imageTag = "<p><img href=\"image\"/></p>";
			setContent(UIUtils.wrapInFormTags(imageTag), true, false);
			
			if (image != null)
				image.dispose();
			
			Image image = ImageDescriptor.createFromURL(url).createImage();
			getFormText().setImage("image", image);
		}
	}
	
	@Override
	public void dispose() {
		if (image != null)
			image.dispose();
		
		super.dispose();
	}
}