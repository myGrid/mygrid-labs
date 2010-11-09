package uk.org.taverna.t3.workbench.components.definitions.model;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

@Getter @Setter
public abstract class InnerItemRef {
	@SerializedName(RDFTermsKeys.resource)
	private String relativeIdRef;
}
