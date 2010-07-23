package uk.org.taverna.tng.mockup3.workbench.util;

import org.eclipse.jface.resource.ImageDescriptor;

public class ComponentSearchResultItem {
	
	private final ComponentSearchSourceResults parent;
	
	private final Object originalInfo;
	private final String name;
	private final String description;
	private final ImageDescriptor icon;
	
	public ComponentSearchResultItem(ComponentSearchSourceResults parent, Object originalInfo, String name,
			String description, ImageDescriptor icon) {
		this.parent = parent;
		this.originalInfo = originalInfo;
		this.name = name;
		this.description = description;
		this.icon = icon;
	}
	
	public ComponentSearchSourceResults getParent() {
		return parent;
	}

	public Object getOriginalInfo() {
		return originalInfo;
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

}
