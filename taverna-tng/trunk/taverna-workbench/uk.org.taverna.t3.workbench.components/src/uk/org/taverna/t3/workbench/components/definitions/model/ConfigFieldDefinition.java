package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;

public class ConfigFieldDefinition extends InnerItemDefinition {
	@Getter	@Setter
	private FieldType fieldType = FieldType.TEXT;
	
	@Getter	@Setter
	private String dataType;
	
	@Getter	@Setter
	private String group;
	
	@Getter	@Setter
	private Boolean required = true;
	
	@Getter	@Setter
	private String defaultValue;
	
	@Getter	@Setter
	private Boolean fixed = false;
	
	@Getter	@Setter
	private Boolean hidden = false;
	
	@Getter	@Setter
	private Boolean multiple = false;

	@Getter	@Setter
	private Boolean constrainedToOptions = false;
	
	@Getter	@Setter
	private Options options;
	
	@Getter	@Setter
	private String additionalConstraints;
	
	@Getter	@Setter
	private ConfigFieldMapping mapping;
	
	@Getter	@Setter
	private Boolean makeInputPort = false;
	
	public class Options {
		@Getter	@Setter
		private String label;
		
		@Getter	@Setter
		private String value;
	}
}
