package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

public class ConfigFieldMapping {
	@Getter	@Setter
	private Boolean toActivityConfigurationProperty = false;
	@Getter	@Setter
	private ActivityConfigurationProperty activityConfigurationProperty;
	
	@Getter	@Setter
	private Boolean toComponentPort = false;
	@Getter	@Setter
	private ComponentPortRef componentPort;
	
	@Getter	@Setter
	private Boolean toProcessorPort = false;
	@Getter	@Setter
	private ProcessorPort processorPort;
	
	public class ActivityConfigurationProperty {
		@Getter	@Setter
		private String name;
	}
	
	public class ComponentPortRef {
		@Getter	@Setter
		@SerializedName(RDFTermsKeys.resource)
		private String relativeIdRef;
	}
	
	public class ProcessorPort {
		@Getter	@Setter
		private String name;
	}
}
