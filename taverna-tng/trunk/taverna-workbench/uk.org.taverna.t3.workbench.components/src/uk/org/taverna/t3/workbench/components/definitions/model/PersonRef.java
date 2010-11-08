package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URL;

import lombok.Getter;
import lombok.Setter;

import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

public abstract class PersonRef {
	@Getter	@Setter
	@SerializedName(RDFTermsKeys.resource)
	private URL resource;
	
	@Getter	@Setter
	private String name;
}
