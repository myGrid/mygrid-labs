package uk.org.taverna.tng.mockup3.workbench.util;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import uk.org.taverna.tng.mockup3.workbench.Application;

public class ComponentSearchSource {
	public final String name;
	public final String description;
	public final ImageDescriptor icon;

	public ComponentSearchSource(String name, String description,
			ImageDescriptor icon) {
		super();
		this.name = name;
		this.description = description;
		this.icon = icon;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public ImageDescriptor getIcon() {
		return icon;
	}

	public static final ComponentSearchSource BIOCATALOGUE = new ComponentSearchSource(
			"BioCatalogue", "The Life Sciences Web Service Registry",
			AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
					IImageKeys.BIOCAT_ICON));

	public static final ComponentSearchSource MYEXPERIMENT = new ComponentSearchSource(
			"myExperiment", "Social VRE for sharing workflows",
			AbstractUIPlugin.imageDescriptorFromPlugin(Application.PLUGIN_ID,
					IImageKeys.MYEXP_ICON));
}