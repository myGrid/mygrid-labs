package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

public class InnerItemDefinition {
	@Getter	@Setter
	@SerializedName(RDFTermsKeys.about)
	private String relativeId;
	
	@Getter	@Setter
	private String name;
	
	@Getter	@Setter
	private String label;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.description)
	private String description;
}
