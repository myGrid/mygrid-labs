package uk.org.taverna.tng.mockup3.core;

import org.eclipse.core.runtime.IConfigurationElement;

public class ComponentDefinition implements IComponentDefinition {
	
	public final static String ATTR_ID = "id";
	public final static String ATTR_NAME = "name";
	public final static String ATTR_DESCRIPTION = "description";
	public final static String ATTR_GROUP = "group";
	public final static String ATTR_FAMILY = "family";
	public final static String ATTR_ICON = "icon";
	
	private IConfigurationElement element;
	
	private final String id;
	private final String name;
	private final String description;
	private final String group;
	private final String family;
	private final String icon; 
	
	public ComponentDefinition(String id, String name, String description, String group, String family, String icon) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.group = group;
		this.family = family;
		this.icon = icon;
	}
	
	public ComponentDefinition(IConfigurationElement element) {
		this.element = element;
		this.id = element.getAttribute(ATTR_ID);
		this.name = element.getAttribute(ATTR_NAME);
		this.description = element.getAttribute(ATTR_DESCRIPTION);
		this.group = element.getAttribute(ATTR_GROUP);
		this.family = element.getAttribute(ATTR_FAMILY);
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
	
	public String getDescription() {
		return description;
	}

	public String getGroup() {
		return group;
	}

	public String getFamily() {
		return family;
	}
	
	public String getIcon() {
		return icon;
	}

}
