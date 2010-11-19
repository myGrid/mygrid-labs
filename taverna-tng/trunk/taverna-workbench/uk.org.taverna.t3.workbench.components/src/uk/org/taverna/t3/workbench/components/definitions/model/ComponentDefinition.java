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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((modified == null) ? 0 : modified.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComponentDefinition other = (ComponentDefinition) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modified == null) {
			if (other.modified != null)
				return false;
		} else if (!modified.equals(other.modified))
			return false;
		if (version == null) {
			if (other.version != null)
				return false;
		} else if (!version.equals(other.version))
			return false;
		return true;
	}
}
