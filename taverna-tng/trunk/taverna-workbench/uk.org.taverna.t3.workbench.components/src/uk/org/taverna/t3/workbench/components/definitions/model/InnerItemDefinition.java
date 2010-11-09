package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

@Getter @Setter
public abstract class InnerItemDefinition {
	@SerializedName(RDFTermsKeys.about)
	private String relativeId;
	
	private String name;
	
	private String label;
	
	@SerializedName(DCTermsKeys.description)
	private String description;
}
