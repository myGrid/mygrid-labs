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
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition.Option;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldType;
import uk.org.taverna.t3.workbench.components.definitions.model.ContributorRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DocRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DynamicConfigFieldsProviderRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DynamicPortsProviderRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ExampleValue;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
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
		
		// Check only the input port...
		
		for (PortDefinition port : cd.getPorts().getInputs()) {
			assertEquals(dummyRelativeIdString, port.getRelativeId());
			assertEquals(dummyString, port.getName());
			assertEquals(dummyString, port.getLabel());
			assertEquals(0, port.getDepth().intValue());
			assertEquals(dummyString, port.getDescription());
			assertTrue(port.getVisible());
			
			assertEquals(2, port.getDataTypes().size());
			for (String dataType : port.getDataTypes()) {
				assertEquals(dummyString, dataType);
			}
			
			assertEquals(1, port.getExamples().size());
			for (ExampleValue example : port.getExamples()) {
				assertEquals(dummyString, example.getDataType());
				assertEquals(dummyString, example.getValue());
			}
			
			assertEquals(2, port.getTags().size());
			for (String tag : port.getTags()) {
				assertEquals(dummyString, tag);
			}
			
			assertNotNull(port.getMapping());
			assertTrue(port.getMapping().getToProcessorPort());
			assertNotNull(port.getMapping().getProcessorPort());
			assertEquals(dummyString, port.getMapping().getProcessorPort().getName());
		}
		
		assertEquals(1, cd.getPorts().getDynamicProviders().size());
		for (DynamicPortsProviderRef ref : cd.getPorts().getDynamicProviders()) {
			assertEquals(dummyRelativeIdString, ref.getRelativeId());
			assertEquals(dummyUrl, ref.getResource());
			assertEquals(dummyUrl, ref.getDiscoveryUrl());
		}
		
		assertNotNull(cd.getConfiguration());
		assertEquals(1, cd.getConfiguration().getFields().size());
		for (ConfigFieldDefinition field : cd.getConfiguration().getFields()) {
			assertEquals(dummyRelativeIdString, field.getRelativeId());
			assertEquals(dummyString, field.getName());
			assertEquals(dummyString, field.getLabel());
			assertEquals(ConfigFieldType.DROPDOWN, field.getFieldType());
			assertEquals(String.class.getSimpleName(), field.getDataType());
			assertEquals(dummyString, field.getDescription());
			assertTrue(field.getConfigGroup().isEmpty());
			assertTrue(field.getRequired());
			assertEquals(dummyString, field.getDefaultValue());
			assertFalse(field.getFixed());
			assertFalse(field.getHidden());
			assertFalse(field.getMultiple());
			assertFalse(field.getConstrainedToOptions());
			
			assertEquals(1, field.getOptions().size());
			for (Option opt : field.getOptions()) {
				assertEquals(dummyString, opt.getLabel());
				assertEquals(dummyString, opt.getValue());
			}
			
			assertTrue(field.getAdditionalConstraints().isEmpty());
			
			assertEquals(2, field.getExamples().size());
			for (String example : field.getExamples()) {
				assertEquals(dummyString, example);
			}
			
			assertNotNull(field.getMapping());
			assertTrue(field.getMapping().getToActivityConfigurationProperty());
			assertNotNull(field.getMapping().getActivityConfigurationProperty());
			assertEquals(dummyString, field.getMapping().getActivityConfigurationProperty().getName());
			assertFalse(field.getMapping().getToComponentPort());
			assertNotNull(field.getMapping().getComponentPort());
			assertEquals(dummyRelativeIdString, field.getMapping().getComponentPort().getResource());
			assertFalse(field.getMapping().getToProcessorPort());
			assertNotNull(field.getMapping().getProcessorPort());
			assertEquals(dummyString, field.getMapping().getProcessorPort().getName());
			
			assertFalse(field.getMakeInputPort());
		}
		
		assertEquals(1, cd.getConfiguration().getDynamicProviders().size());
		for (DynamicConfigFieldsProviderRef ref : cd.getConfiguration().getDynamicProviders()) {
			assertEquals(dummyRelativeIdString, ref.getRelativeId());
			assertEquals(dummyUrl, ref.getResource());
			assertEquals(dummyUrl, ref.getDiscoveryUrl());
		}
		
		assertNotNull(cd.getHelpers());
		assertEquals(1, cd.getHelpers().getPreconfigured().size());
		assertEquals(1, cd.getHelpers().getSuggested().size());
	}
	
}
