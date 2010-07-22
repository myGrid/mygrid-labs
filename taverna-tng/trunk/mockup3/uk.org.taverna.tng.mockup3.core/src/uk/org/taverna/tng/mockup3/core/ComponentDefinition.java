package uk.org.taverna.tng.mockup3.core;

import org.eclipse.core.runtime.IConfigurationElement;

public class ComponentDefinition implements IComponentDefinition {
	
	public final static String ATTR_ID = "id";
	public final static String ATTR_NAME = "name";
	public final static String ATTR_GROUP = "group";
	public final static String ATTR_DESCRIPTION = "description";
	public final static String ATTR_ICON = "icon";
	
	private IConfigurationElement element;
	
	private String id;
	private String name;
	private String group;
	private String description;
	private String icon; 
	
	public ComponentDefinition(String id, String name, String group, String description, String icon) {
		this.id = id;
		this.name = name;
		this.group = group;
		this.description = description;
		this.icon = icon;
	}
	
	public ComponentDefinition(IConfigurationElement element) {
		this.element = element;
		this.id = element.getAttribute(ATTR_ID);
		this.name = element.getAttribute(ATTR_NAME);
		this.group = element.getAttribute(ATTR_GROUP);
		this.description = element.getAttribute(ATTR_DESCRIPTION);
		this.icon = element.getAttribute(ATTR_ICON);
		
		// TODO: See http://www.eclipse.org/forums/index.php?&t=msg&th=97717 for more info on how to load up an ImageDescriptor for the icon.
		// BUT this requires JFace (for the ImageDescriptor class), so maybe this should be done elsewhere.
	}

	public String getExternalId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getGroup() {
		return group;
	}

	public String getDescription() {
		return description;
	}
	
	public String getIcon() {
		return icon;
	}

}
