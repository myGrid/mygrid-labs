package uk.org.taverna.t3.workbench.components.tests;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.TestCase;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ContributorRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DocRef;
import uk.org.taverna.t3.workbench.components.definitions.model.RelatedItemRef;

public class ComponentDefinitionTest extends TestCase {
	
	@BeforeClass
	public void setup() {
		
	}
	
	@Test
	public void testLoadingOfComponentDefinitionFromJson() throws IOException, URISyntaxException {
		String dummyString = "dummy";
		String dummyUrlString = "http://example.com/dummy";
		String dummyRelativeIdString = "dummy/dummy";
		URL dummyUrl = new URL("http://example.com/dummy");
		URI dummyUri = new URI("http://example.com/dummy"); 
		
		String filePath = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions/_dummy.json";
		File file = new File(filePath);
		
		assertTrue(file.isFile());
		
		ObjectMapper mapper = new ObjectMapper();
		ComponentDefinition cd = mapper.readValue(file, ComponentDefinition.class);
		
		assertEquals(dummyUri, cd.getId());
		assertEquals("1.0.0", cd.getVersion());
		assertEquals(dummyString, cd.getTitle());
		
		assertEquals(2, cd.getAlternativeTitles().size());
		for (String alternativeTitle : cd.getAlternativeTitles()) {
			assertNotNull(alternativeTitle);
			assertFalse(alternativeTitle.isEmpty());
		}
		
		assertEquals(dummyString, cd.getDescription());
		
		assertNotNull(cd.getPublisher());
		assertEquals(dummyUrl, cd.getPublisher().getResource());
		assertEquals(dummyString, cd.getPublisher().getTitle());
		
		assertNotNull(cd.getSource());
		assertEquals(dummyUrl, cd.getSource().getResource());
		assertEquals(dummyString, cd.getSource().getTitle());
		
		assertNotNull(cd.getCreator());
		assertEquals(dummyUrl, cd.getCreator().getResource());
		assertEquals(dummyString, cd.getCreator().getName());
		
		assertEquals(2, cd.getContributors().size());
		for (ContributorRef contributor : cd.getContributors()) {
			assertNotNull(contributor);
			assertEquals(dummyUrl, contributor.getResource());
			assertEquals(dummyString, contributor.getName());
		}
		
		assertNotNull(cd.getCreated());
		assertNotNull(cd.getModified());
		
		assertNotNull(cd.getFamily());
		assertEquals(dummyUrl, cd.getFamily().getResource());
		assertEquals(dummyString, cd.getFamily().getTitle());
		assertEquals(dummyString, cd.getFamily().getDescription());
		assertEquals(dummyUrl, cd.getFamily().getDiscoveryUrl());
		
		assertEquals(2, cd.getGroups().size());
		for (String group : cd.getGroups()) {
			assertNotNull(group);
			assertEquals(dummyString, group);
		}
		
		assertNotNull(cd.getIcons());
		assertEquals(dummyUrlString, cd.getIcons().getMain());
		assertEquals(dummyUrlString, cd.getIcons().getSmall());
		assertEquals(dummyUrlString, cd.getIcons().getLarge());
		assertEquals(dummyUrl, cd.getIcons().getDiscoveryUrl());
		
		assertNotNull(cd.getTavernaActivity());
		assertEquals(dummyUrl, cd.getTavernaActivity().getResource());
		assertEquals(dummyUrl, cd.getTavernaActivity().getDiscoveryUrl());
		
		assertEquals(1, cd.getDocs().size());
		for (DocRef doc : cd.getDocs()) {
			assertNotNull(doc);
			assertEquals(dummyUrl, doc.getResource());
			assertEquals(dummyString, doc.getType());
			assertEquals(dummyString, doc.getTitle());
			assertEquals(dummyString, doc.getDescription());
		}
		
		assertEquals(2, cd.getTags().size());
		for (String tag : cd.getTags()) {
			assertNotNull(tag);
			assertEquals(dummyString, tag);
		}
		
		assertEquals(1, cd.getRelated().size());
		for (RelatedItemRef related : cd.getRelated()) {
			assertNotNull(related);
			assertEquals(dummyUrl, related.getResource());
			assertEquals(dummyString, related.getType());
			assertEquals(dummyString, related.getTitle());
			assertEquals(dummyString, related.getDescription());
		}
		
		assertNotNull(cd.getPorts());
		assertEquals(1, cd.getPorts().getInputs().size());
		assertEquals(1, cd.getPorts().getOutputs().size());
		
		assertNotNull(cd.getConfiguration());
		assertEquals(1, cd.getConfiguration().getFields().size());
		
		assertNotNull(cd.getHelpers());
		assertEquals(1, cd.getHelpers().getPreconfigured().size());
		assertEquals(1, cd.getHelpers().getSuggested().size());
	}
	
}
