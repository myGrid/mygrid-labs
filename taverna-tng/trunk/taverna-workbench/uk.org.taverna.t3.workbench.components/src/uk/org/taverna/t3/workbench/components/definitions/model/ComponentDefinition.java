package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URI;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.joda.time.DateTime;

import uk.org.taverna.t3.workbench.common.DCTermsKeys;
import uk.org.taverna.t3.workbench.common.RDFTermsKeys;

import com.google.gson.annotations.SerializedName;

@Getter @Setter
public class ComponentDefinition {
	@SerializedName(RDFTermsKeys.about)
	private URI id;
	
	private String version;
	
	private String label;
	
	@SerializedName(DCTermsKeys.title)
	private String title;
	
	@SerializedName(DCTermsKeys.alternative)
	private List<String> alternative_titles;
	
	@SerializedName(DCTermsKeys.description)
	private String description;
	
	@SerializedName(DCTermsKeys.publisher)
	private PublisherRef publisher;
	
	@SerializedName(DCTermsKeys.source)
	private SourceRef source;
	
	@SerializedName(DCTermsKeys.creator)
	private CreatorRef creator;
	
	@SerializedName(DCTermsKeys.contributor)
	private List<ContributorRef> contributors;
	
	@SerializedName(DCTermsKeys.created)
	private DateTime created;
	
	@SerializedName(DCTermsKeys.modified)
	private DateTime modified;
	
	private FamilyRef family;
	
	private List<String> groups;
	
	private IconsDefinition icons;
	
	private ActivityRef tavernaActivity;
	
	private List<DocRef> docs;
	
	private List<String> tags;
	
	private List<RelatedItemRef> related;
	
	private PortsDefinition ports;
	
	private ConfigDefinition configuration;
	
	private HelpersDefinition helpers;
}
