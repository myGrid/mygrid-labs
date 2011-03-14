package uk.org.taverna.t3.workbench.components.search.providers.myexperiment.internal;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.myexperiment.api.client.model.Workflow;

import uk.org.taverna.t3.workbench.components.definitions.ComponentDefinitionUtil;
import uk.org.taverna.t3.workbench.components.definitions.model.ActivityRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.SourceRef;

public class ComponentDefinitionBuilder {
	
	private static final String TAVERNA_ACTIVITY_URI = "http://ns.taverna.org.uk/2010/activity/nested-workflow";

	private ActivityRef tavernaActivity;
	
	public ComponentDefinitionBuilder() {
		tavernaActivity = new ActivityRef();
		try {
			tavernaActivity.setType(new URI(TAVERNA_ACTIVITY_URI));
		} catch (URISyntaxException e) {
			e.printStackTrace();
			throw new RuntimeException("Internal error - failed to set up the ComponentDefinitionBuilder for the myExperiment search provider");
		}
	}
	
	public ComponentDefinition buildComponentDefinition(Workflow wf) {
		ComponentDefinition cd = new ComponentDefinition();
		
		cd.setId(ComponentDefinitionUtil.generateNewId());
		cd.setLabel(wf.getTitle());
		cd.setTitle(wf.getTitle());
		cd.setTavernaActivity(tavernaActivity);
		cd.setDescription(wf.getDescription());
		
		// Set source to point to the original myExperiment workflow
		SourceRef source = new SourceRef();
		URL sourceUrl;
		try {
			sourceUrl = new URL(wf.getResource());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			sourceUrl = null;
		}
		source.setResource(sourceUrl);
		source.setTitle(wf.getTitle());
		
		return cd;
	}
	
	
}
