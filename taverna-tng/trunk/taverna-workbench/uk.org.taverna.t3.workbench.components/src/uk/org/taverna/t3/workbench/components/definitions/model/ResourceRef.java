package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

@Getter @Setter
public abstract class ResourceRef {
	@SerializedName(RDFTermsKeys.resource)
	private URL resource;
	
	@SerializedName(DCTermsKeys.title)
	private String title;
	
	@SerializedName(DCTermsKeys.description)
	private String description;
	
	private URL discoveryUrl;
}
