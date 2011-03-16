package uk.org.taverna.t3.workbench.components.tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Iterator;

import junit.framework.TestCase;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import uk.org.taverna.t3.workbench.components.definitions.model.AttributionRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldDefinition.Option;
import uk.org.taverna.t3.workbench.components.definitions.model.ConfigFieldType;
import uk.org.taverna.t3.workbench.components.definitions.model.CreditRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DocRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DynamicConfigFieldsProviderRef;
import uk.org.taverna.t3.workbench.components.definitions.model.DynamicPortsProviderRef;
import uk.org.taverna.t3.workbench.components.definitions.model.ExampleValue;
import uk.org.taverna.t3.workbench.components.definitions.model.HelperDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.PortDefinition;
import uk.org.taverna.t3.workbench.components.definitions.model.RelatedItemRef;
import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonHandler;

public class ComponentDefinitionTest extends TestCase {

	private static final String EXAMPLES_DIR_PATH = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions";
	private static final String DUMMY_CD_FILE_PATH = EXAMPLES_DIR_PATH + "/_dummy.json";
	private static final String DNA2RNA_CD_FILE_PATH = EXAMPLES_DIR_PATH + "/dna_to_rna.json";

	@Before
	public void setup() {
		
	}
	
	@After
	public void teardown() {
		
	}
	
	@Test
	public void testLoadingOfComponentDefinitionsFromJson()
			throws JsonParseException, JsonMappingException, IOException {
		
		Iterator<File> iterator = FileUtils.iterateFiles(new File(EXAMPLES_DIR_PATH),
				new String[] { "json" }, true);

		while (iterator.hasNext()) {
			File file = (File) iterator.next();
			
			if (!file.getName().startsWith("_")) {
				try {
					ComponentDefinition cd = JsonHandler.getInstance()
								.buildComponentDefinition(file);
			
					assertNotNull(cd);
					assertNotNull(cd.getId());
				} catch (Exception ex) {
					System.out.println("Exception - " + ex.toString() + " - whilst processing file: " + file.getCanonicalPath());
					throw new RuntimeException(ex);
				}
			}
		}
	}

	@Test
	public void testThoroughLoadingOfDummyComponentDefinitionFromJson()
			throws JsonParseException, JsonMappingException, IOException,
			URISyntaxException {
		String dummyString = "dummy";
		String dummyUrlString = "http://example.com/dummy";
		String dummyRelativeIdString = "dummy/dummy";
		URL dummyUrl = new URL("http://example.com/dummy");
		URI dummyUri = new URI("http://example.com/dummy");
		URI dummyDataTypeUri = new URI("urn:java:String");

		ComponentDefinition cd = JsonHandler.getInstance()
				.buildComponentDefinition(DUMMY_CD_FILE_PATH);

		assertThat(cd.getId(), is(equalTo(dummyUri)));
		assertThat(cd.getVersion(), is(equalTo("1.0.0")));
		assertThat(cd.getTitle(), is(equalTo(dummyString)));
		assertThat(cd.getDescription(), is(equalTo(dummyString)));

		assertThat(cd.getAlternativeLabels().size(), is(equalTo(2)));
		for (String alternativeTitle : cd.getAlternativeLabels()) {
			assertNotNull(alternativeTitle);
			assertFalse(alternativeTitle.isEmpty());
		}
		
		assertNotNull(cd.getTavernaActivity());
		assertThat(cd.getTavernaActivity().getType(), is(equalTo(dummyUri)));
		assertThat(cd.getTavernaActivity().getDiscoveryUrl(),
				is(equalTo(dummyUrl)));
		
		assertNotNull(cd.getCreator());
		assertThat(cd.getCreator().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getCreator().getName(), is(equalTo(dummyString)));
		assertThat(cd.getCreator().getHomepage(), is(equalTo(dummyUrl)));
		
		assertNotNull(cd.getPublisher());
		assertThat(cd.getPublisher().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getPublisher().getTitle(), is(equalTo(dummyString)));

		assertNotNull(cd.getSource());
		assertThat(cd.getSource().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getSource().getTitle(), is(equalTo(dummyString)));

		assertThat(cd.getCredits().size(), is(equalTo(2)));
		for (CreditRef credit : cd.getCredits()) {
			assertNotNull(credit);
			assertThat(credit.getResource(), is(equalTo(dummyUrl)));
			assertThat(credit.getName(), is(equalTo(dummyString)));
			assertThat(credit.getHomepage(), is(equalTo(dummyUrl)));
		}
		
		assertThat(cd.getAttributions().size(), is(equalTo(2)));
		for (AttributionRef attribution : cd.getAttributions()) {
			assertNotNull(attribution);
			assertThat(attribution.getResource(), is(equalTo(dummyUrl)));
			assertThat(attribution.getType(), is(equalTo(dummyUri)));
			assertThat(attribution.getTitle(), is(equalTo(dummyString)));
			assertThat(attribution.getDescription(), is(equalTo(dummyString)));
		}

		assertNotNull(cd.getCreated());
		assertNotNull(cd.getModified());

		assertNotNull(cd.getFamily());
		assertThat(cd.getFamily().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getFamily().getTitle(), is(equalTo(dummyString)));
		assertThat(cd.getFamily().getDescription(), is(equalTo(dummyString)));
		assertThat(cd.getFamily().getDiscoveryUrl(), is(equalTo(dummyUrl)));

		assertThat(cd.getGroups().size(), is(equalTo(2)));
		for (String group : cd.getGroups()) {
			assertNotNull(group);
			assertThat(group, is(equalTo(dummyString)));
		}

		assertNotNull(cd.getIcons());
		assertThat(cd.getIcons().getMain(), is(equalTo(dummyUrlString)));
		assertThat(cd.getIcons().getSmall(), is(equalTo(dummyUrlString)));
		assertThat(cd.getIcons().getLarge(), is(equalTo(dummyUrlString)));
		assertThat(cd.getIcons().getDiscoveryUrl(), is(equalTo(dummyUrl)));

		assertThat(cd.getDocs().size(), is(equalTo(1)));
		for (DocRef doc : cd.getDocs()) {
			assertNotNull(doc);
			assertThat(doc.getResource(), is(equalTo(dummyUrl)));
			assertThat(doc.getType(), is(equalTo(dummyUri)));
			assertThat(doc.getTitle(), is(equalTo(dummyString)));
			assertThat(doc.getDescription(), is(equalTo(dummyString)));
		}

		assertThat(cd.getTags().size(), is(equalTo(2)));
		for (String tag : cd.getTags()) {
			assertNotNull(tag);
			assertThat(tag, is(equalTo(dummyString)));
		}

		assertThat(cd.getRelated().size(), is(equalTo(1)));
		for (RelatedItemRef related : cd.getRelated()) {
			assertNotNull(related);
			assertThat(related.getResource(), is(equalTo(dummyUrl)));
			assertThat(related.getType(), is(equalTo(dummyUri)));
			assertThat(related.getTitle(), is(equalTo(dummyString)));
			assertThat(related.getDescription(), is(equalTo(dummyString)));
		}

		assertNotNull(cd.getPorts());
		assertThat(cd.getPorts().getInputs().size(), is(equalTo(1)));
		assertThat(cd.getPorts().getInputs().size(), is(equalTo(1)));

		// Check only the input port...

		for (PortDefinition port : cd.getPorts().getInputs()) {
			assertThat(port.getRelativeId(), is(equalTo(dummyRelativeIdString)));
			assertThat(port.getName(), is(equalTo(dummyString)));
			assertThat(port.getLabel(), is(equalTo(dummyString)));
			assertThat(port.getDepth(), is(equalTo(0)));
			assertThat(port.getDescription(), is(equalTo(dummyString)));
			assertTrue(port.isVisible());

			assertThat(port.getDataTypes().size(), is(equalTo(1)));
			for (URI dataType : port.getDataTypes()) {
				assertThat(dataType, is(equalTo(dummyDataTypeUri)));
			}

			assertThat(port.getExamples().size(), is(equalTo(1)));
			for (ExampleValue example : port.getExamples()) {
				assertThat(example.getDataType(), is(equalTo(dummyDataTypeUri)));
				assertThat(example.getValue(), is(equalTo(dummyString)));
			}

			assertThat(port.getTags().size(), is(equalTo(2)));
			for (String tag : port.getTags()) {
				assertThat(tag, is(equalTo(dummyString)));
			}

			assertNotNull(port.getMapping());
			assertTrue(port.getMapping().isToProcessorPort());
			assertNotNull(port.getMapping().getProcessorPort());
			assertThat(port.getMapping().getProcessorPort().getName(),
					is(equalTo(dummyString)));
		}

		assertThat(cd.getPorts().getDynamicProviders().size(), is(equalTo(1)));
		for (DynamicPortsProviderRef ref : cd.getPorts().getDynamicProviders()) {
			assertThat(ref.getRelativeId(), is(equalTo(dummyRelativeIdString)));
			assertThat(ref.getResource(), is(equalTo(dummyUrl)));
			assertThat(ref.getDiscoveryUrl(), is(equalTo(dummyUrl)));
		}

		assertNotNull(cd.getConfiguration());
		assertThat(cd.getConfiguration().getFields().size(), is(equalTo(1)));
		for (ConfigFieldDefinition field : cd.getConfiguration().getFields()) {
			assertThat(field.getRelativeId(),
					is(equalTo(dummyRelativeIdString)));
			assertThat(field.getName(), is(equalTo(dummyString)));
			assertThat(field.getLabel(), is(equalTo(dummyString)));
			assertThat(field.getFieldType(),
					is(equalTo(ConfigFieldType.DROPDOWN)));
			assertThat(field.getDataType(),
					is(equalTo(dummyDataTypeUri)));
			assertThat(field.getDescription(), is(equalTo(dummyString)));
			assertTrue(field.getConfigGroup().isEmpty());
			assertTrue(field.isRequired());
			assertThat(field.getDefaultValue(), is(equalTo(dummyString)));
			assertFalse(field.isFixed());
			assertFalse(field.isHidden());
			assertFalse(field.isMultiple());
			assertFalse(field.isConstrainedToOptions());

			assertThat(field.getOptions().size(), is(equalTo(1)));
			for (Option opt : field.getOptions()) {
				assertThat(opt.getLabel(), is(equalTo(dummyString)));
				assertThat(opt.getValue(), is(equalTo(dummyString)));
			}

			assertTrue(field.getAdditionalConstraints().isEmpty());

			assertThat(field.getExamples().size(), is(equalTo(2)));
			for (String example : field.getExamples()) {
				assertThat(example, is(equalTo(dummyString)));
			}

			assertNotNull(field.getMapping());
			assertTrue(field.getMapping().isToActivityConfigurationProperty());
			assertNotNull(field.getMapping().getActivityConfigurationProperty());
			assertThat(field.getMapping().getActivityConfigurationProperty()
					.getPredicate(), is(equalTo(dummyUri)));
			assertFalse(field.getMapping().isToComponentPort());
			assertNotNull(field.getMapping().getComponentPort());
			assertThat(field.getMapping().getComponentPort().getResource(),
					is(equalTo(dummyRelativeIdString)));
			assertFalse(field.getMapping().isToProcessorPort());
			assertNotNull(field.getMapping().getProcessorPort());
			assertThat(field.getMapping().getProcessorPort().getName(),
					is(equalTo(dummyString)));

			assertFalse(field.isMakeInputPort());
		}

		assertThat(cd.getConfiguration().getDynamicProviders().size(),
				is(equalTo(1)));
		for (DynamicConfigFieldsProviderRef ref : cd.getConfiguration()
				.getDynamicProviders()) {
			assertThat(ref.getRelativeId(), is(equalTo(dummyRelativeIdString)));
			assertThat(ref.getResource(), is(equalTo(dummyUrl)));
			assertThat(ref.getDiscoveryUrl(), is(equalTo(dummyUrl)));
		}

		assertNotNull(cd.getHelpers());
		assertThat(cd.getHelpers().size(), is(equalTo(1)));
		for (HelperDefinition helper : cd.getHelpers()) {
			assertThat(helper.getRelativeId(), is(equalTo(dummyRelativeIdString)));
			assertThat(helper.getName(), is(equalTo(dummyString)));
			assertThat(helper.getLabel(), is(equalTo(dummyString)));
			assertThat(helper.getDescription(), is(equalTo(dummyString)));
			
			assertThat(helper.getForPorts().size(), is(equalTo(1)));
			assertThat(helper.getForPorts().get(0).getResource(), is(equalTo(dummyRelativeIdString)));
			
			assertNotNull(helper.getExternalComponentDefinition());
			assertThat(helper.getExternalComponentDefinition().getResource(), is(equalTo(dummyUrl)));
			
			assertFalse(helper.isInline());
			assertNull(helper.getInlineComponentDefinition());
		}
	}

	@Test
	public void testHashCodeAndEquals() throws JsonParseException,
			JsonMappingException, IOException {
		ComponentDefinition cd1 = JsonHandler.getInstance()
				.buildComponentDefinition(DNA2RNA_CD_FILE_PATH);
		ComponentDefinition cd2 = JsonHandler.getInstance()
				.buildComponentDefinition(DNA2RNA_CD_FILE_PATH);
		ComponentDefinition cd3 = JsonHandler.getInstance()
				.buildComponentDefinition(DUMMY_CD_FILE_PATH);

		// hashCode()

		assertThat(cd1.hashCode(), is(equalTo(cd2.hashCode())));
		assertFalse(cd1.hashCode() == cd3.hashCode());

		// equals()

		assertTrue(cd1.equals(cd2));
		assertTrue(cd2.equals(cd1));
		assertFalse(cd1.equals(cd3));
		assertFalse(cd3.equals(cd1));

		// Modify one of the non identity fields of the CDs and see if it is
		// still matches up.

		// TODO: This is actually a bug in the system - changes to any values
		// should result in the modified date changing and the object having a
		// different identity. There is a todo item for this
		// in the ComponentDefinition class.

		cd2.setDescription("Hello World");
		assertThat(cd1.hashCode(), is(equalTo(cd2.hashCode())));
		assertTrue(cd1.equals(cd2));
		assertTrue(cd2.equals(cd1));
	}
}
