package uk.org.taverna.t3.workbench.components.definitions.model;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonFields;

@Getter @Setter
public class ComponentDefinition {
	private URI id;
	private String version;
	private String label;
	private String title;
	@JsonProperty(JsonFields.ALTERNATIVE_TITLES) private List<String> alternativeTitles = new ArrayList<String>();
	private String description;
	private PublisherRef publisher;
	private SourceRef source;
	private CreatorRef creator;
	private List<ContributorRef> contributors = new ArrayList<ContributorRef>();
	private DateTime created;
	private DateTime modified;
	private FamilyRef family;
	private List<String> groups = new ArrayList<String>();
	private IconsDefinition icons;
	@JsonProperty(JsonFields.TAVERNA_ACTIVITY) private ActivityRef tavernaActivity;
	private List<DocRef> docs = new ArrayList<DocRef>();
	private List<String> tags = new ArrayList<String>();
	private List<RelatedItemRef> related = new ArrayList<RelatedItemRef>();
	private PortsDefinition ports;
	private ConfigDefinition configuration;
	private HelpersDefinition helpers;
}
