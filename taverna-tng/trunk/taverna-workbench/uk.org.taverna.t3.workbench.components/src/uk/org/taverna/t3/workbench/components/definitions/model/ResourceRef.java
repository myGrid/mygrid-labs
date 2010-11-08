package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

public abstract class ResourceRef {
	@Getter	@Setter
	@SerializedName(RDFTermsKeys.resource)
	private URL resource;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.title)
	private String title;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.description)
	private String description;
	
	@Getter	@Setter
	private URL discoveryUrl;
}
