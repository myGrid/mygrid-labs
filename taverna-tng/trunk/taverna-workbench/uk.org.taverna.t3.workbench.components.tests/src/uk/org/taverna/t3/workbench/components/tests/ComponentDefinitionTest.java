package uk.org.taverna.t3.workbench.components.tests;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.org.taverna.t3.workbench.components.definitions.gson.ComponentDefinitionGsonBuilderWrapper;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ContributorRef;

import com.google.gson.Gson;

public class ComponentDefinitionTest extends TestCase {
	
	@BeforeClass
	public void setup() {
		
	}
	
	@Test
	public void testLoadingOfComponentDefinitionFromJson() throws IOException, URISyntaxException {
		String filePath = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions/dna_to_rna.json";
		String jsonString = FileUtils.readFileToString(new File(filePath));
		
		assertNotNull(jsonString);
		assertFalse(jsonString.isEmpty());
		
		Gson gson = ComponentDefinitionGsonBuilderWrapper.getInstance().getBuilder().create();
		ComponentDefinition cd = gson.fromJson(jsonString, ComponentDefinition.class);
		
		assertEquals(new URI("http://components.taverna.org.uk/definitions/2f90b0d0-e03e-11df-85ca-0800200c9a66"), cd.getId());
		assertEquals("1.0.0", cd.getVersion());
		assertEquals("DNA to RNA Transcriber", cd.getTitle());
		
		assertEquals(2, cd.getAlternativeTitles().size());
		for (String alternativeTitle : cd.getAlternativeTitles()) {
			assertNotNull(alternativeTitle);
			assertFalse(alternativeTitle.isEmpty());
		}
		
		assertEquals("Transcribes a DNA sequence into an RNA sequence", cd.getDescription());
		
		assertNotNull(cd.getPublisher());
		assertEquals(new URL("http://components.taverna.org.uk"), cd.getPublisher().getResource());
		assertEquals("Taverna Workflow Components Library", cd.getPublisher().getTitle());
		
		assertNull(cd.getSource());
		
		assertEquals(2, cd.getContributors().size());
		for (ContributorRef contributor : cd.getContributors()) {
			assertNotNull(contributor);
			assertFalse(contributor.getResource().toString().isEmpty());
			assertFalse(contributor.getName().isEmpty());
		}
		
		assertNotNull(cd.getCreated());
		assertNotNull(cd.getModified());
		
		assertNull(cd.getFamily());
		
		assertEquals(3, cd.getGroups());
		for (String group : cd.getGroups()) {
			assertNotNull(group);
			assertFalse(group.isEmpty());
		}
		
		assertNotNull(cd.getIcons());
		assertEquals("http://myexperiment.rubyforge.org/svn/trunk/public/images/famfamfam_silk/lightning_go.png", cd.getIcons().getMain());
		assertEquals("", cd.getIcons().getSmall());
		assertEquals("", cd.getIcons().getLarge());
		assertEquals("", cd.getIcons().getDiscoveryUrl());
		
		assertNotNull(cd.getTavernaActivity());
		assertEquals(new URL("http://ns.taverna.org.uk/2010/taverna/activities/beanshell#Activity"), cd.getTavernaActivity().getResource());
		assertEquals(new URL("http://www.taverna.org.uk"), cd.getTavernaActivity().getDiscoveryUrl());
		
		assertEquals(0, cd.getDocs().size());
		
		assertEquals(5, cd.getTags().size());
		for (String tag : cd.getTags()) {
			assertNotNull(tag);
			assertFalse(tag.isEmpty());
		}
		
		assertEquals(0, cd.getRelated().size());
		
		assertNotNull(cd.getPorts());
		assertEquals(1, cd.getPorts().getInputs().size());
		assertEquals(1, cd.getPorts().getOutputs().size());
		
		assertNotNull(cd.getConfiguration());
		assertEquals(1, cd.getConfiguration().getFields().size());
		
		assertNotNull(cd.getHelpers());
		assertEquals(0, cd.getHelpers().getPreconfigured().size());
		assertEquals(0, cd.getHelpers().getSuggested().size());
	}
	
}
