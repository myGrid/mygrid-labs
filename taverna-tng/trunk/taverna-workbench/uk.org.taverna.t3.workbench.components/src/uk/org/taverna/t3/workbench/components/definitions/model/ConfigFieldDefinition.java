package uk.org.taverna.t3.workbench.components.definitions.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ConfigFieldDefinition extends InnerItemDefinition {
	private ConfigFieldType fieldType = ConfigFieldType.TEXT;
	private String dataType;
	private String group;
	private Boolean required = true;
	private String defaultValue;
	private Boolean fixed = false;
	private Boolean hidden = false;
	private Boolean multiple = false;
	private Boolean constrainedToOptions = false;
	private List<Option> options = new ArrayList<Option>();
	private String additionalConstraints;
	private ConfigFieldMapping mapping;
	private Boolean makeInputPort = false;
	
	@Getter @Setter
	public class Option {
		private String label;
		private String value;
	}
}
