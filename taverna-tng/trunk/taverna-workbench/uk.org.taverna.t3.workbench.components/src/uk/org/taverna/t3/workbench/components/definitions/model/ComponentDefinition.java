package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URI;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

public class ComponentDefinition {
	@Getter @Setter
	@SerializedName(RDFTermsKeys.about)
	private URI id;
	
	@Getter	@Setter
	private String version;
	
	@Getter	@Setter
	private String label;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.title)
	private String title;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.alternative)
	private List<String> alternative_titles;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.description)
	private String description;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.publisher)
	private PublisherRef publisher;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.source)
	private SourceRef source;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.creator)
	private CreatorRef creator;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.contributor)
	private List<ContributorRef> contributors;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.created)
	private DateTime created;
	
	@Getter	@Setter
	@SerializedName(DCTermsKeys.modified)
	private DateTime modified;
	
	@Getter	@Setter
	private FamilyRef family;
	
	@Getter	@Setter
	private List<String> groups;
	
	@Getter	@Setter
	private IconsDefinition icons;
	
	@Getter	@Setter
	private ActivityRef tavernaActivity;
	
	@Getter	@Setter
	private List<DocRef> docs;
	
	@Getter	@Setter
	private List<String> tags;
	
	@Getter	@Setter
	private List<RelatedItemRef> related;
	
	@Getter	@Setter
	private PortsDefinition ports;
	
	@Getter	@Setter
	private ConfigDefinition configuration;
	
	@Getter	@Setter
	private HelpersDefinition helpers;
}
