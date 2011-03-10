package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.biocatalogue.x2009.xml.rest.SoapOperation;

import uk.org.taverna.t3.workbench.components.definitions.ComponentDefinitionUtil;
import uk.org.taverna.t3.workbench.components.definitions.model.ActivityRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.SourceRef;

public class ComponentDefinitionBuilder {
	
	private static final String TAVERNA_ACTIVITY_URI = "http://ns.taverna.org.uk/2010/activity/wsdl";

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
	
	public ComponentDefinition buildComponentDefinition(SoapOperation op) {
		ComponentDefinition cd = new ComponentDefinition();
		
		cd.setId(ComponentDefinitionUtil.generateNewId());
		cd.setLabel(op.getName());
		cd.setVersion("N/A");
		cd.setTavernaActivity(tavernaActivity);
		cd.setDescription(op.getDescription());
		
		// Set source to point to the original BioCatalogue SOAP operation entry
		SourceRef source = new SourceRef();
		URL sourceUrl;
		try {
			sourceUrl = new URL(op.getHref());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			sourceUrl = null;
		}
		source.setResource(sourceUrl);
		source.setTitle(op.getName());
		
		
		return cd;
	}
	
}
