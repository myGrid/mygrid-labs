package uk.org.taverna.t3.workbench.components.tests;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import junit.framework.TestCase;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

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
import uk.org.taverna.t3.workbench.components.definitions.model.json.JsonHandler;

public class ComponentDefinitionTest extends TestCase {

	private static final String DUMMY_CD_FILE_PATH = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions/_dummy.json";
	private static final String DNA2RNA_CD_FILE_PATH = "./../uk.org.taverna.t3.workbench.components/examples/component-definitions/dna_to_rna.json";

	@BeforeClass
	public void setup() {

	}

	@Test
	public void testLoadingOfDummyComponentDefinitionFromJson()
			throws JsonParseException, JsonMappingException, IOException,
			URISyntaxException {
		String dummyString = "dummy";
		String dummyUrlString = "http://example.com/dummy";
		String dummyRelativeIdString = "dummy/dummy";
		URL dummyUrl = new URL("http://example.com/dummy");
		URI dummyUri = new URI("http://example.com/dummy");

		ComponentDefinition cd = JsonHandler.getInstance()
				.buildComponentDefinition(DUMMY_CD_FILE_PATH);

		assertThat(cd.getId(), is(equalTo(dummyUri)));
		assertThat(cd.getVersion(), is(equalTo("1.0.0")));
		assertThat(cd.getTitle(), is(equalTo(dummyString)));

		assertThat(cd.getAlternativeTitles().size(), is(equalTo(2)));
		for (String alternativeTitle : cd.getAlternativeTitles()) {
			assertNotNull(alternativeTitle);
			assertFalse(alternativeTitle.isEmpty());
		}

		assertThat(cd.getDescription(), is(equalTo(dummyString)));

		assertNotNull(cd.getPublisher());
		assertThat(cd.getPublisher().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getPublisher().getTitle(), is(equalTo(dummyString)));

		assertNotNull(cd.getSource());
		assertThat(cd.getSource().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getSource().getTitle(), is(equalTo(dummyString)));

		assertNotNull(cd.getCreator());
		assertThat(cd.getCreator().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getCreator().getName(), is(equalTo(dummyString)));

		assertThat(cd.getContributors().size(), is(equalTo(2)));
		for (ContributorRef contributor : cd.getContributors()) {
			assertNotNull(contributor);
			assertThat(contributor.getResource(), is(equalTo(dummyUrl)));
			assertThat(contributor.getName(), is(equalTo(dummyString)));
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

		assertNotNull(cd.getTavernaActivity());
		assertThat(cd.getTavernaActivity().getResource(), is(equalTo(dummyUrl)));
		assertThat(cd.getTavernaActivity().getDiscoveryUrl(),
				is(equalTo(dummyUrl)));

		assertThat(cd.getDocs().size(), is(equalTo(1)));
		for (DocRef doc : cd.getDocs()) {
			assertNotNull(doc);
			assertThat(doc.getResource(), is(equalTo(dummyUrl)));
			assertThat(doc.getType(), is(equalTo(dummyString)));
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
			assertThat(related.getType(), is(equalTo(dummyString)));
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
			assertThat(port.getDepth().intValue(), is(equalTo(0)));
			assertThat(port.getDescription(), is(equalTo(dummyString)));
			assertTrue(port.getVisible());

			assertThat(port.getDataTypes().size(), is(equalTo(2)));
			for (String dataType : port.getDataTypes()) {
				assertThat(dataType, is(equalTo(dummyString)));
			}

			assertThat(port.getExamples().size(), is(equalTo(1)));
			for (ExampleValue example : port.getExamples()) {
				assertThat(example.getDataType(), is(equalTo(dummyString)));
				assertThat(example.getValue(), is(equalTo(dummyString)));
			}

			assertThat(port.getTags().size(), is(equalTo(2)));
			for (String tag : port.getTags()) {
				assertThat(tag, is(equalTo(dummyString)));
			}

			assertNotNull(port.getMapping());
			assertTrue(port.getMapping().getToProcessorPort());
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
					is(equalTo(String.class.getSimpleName())));
			assertThat(field.getDescription(), is(equalTo(dummyString)));
			assertTrue(field.getConfigGroup().isEmpty());
			assertTrue(field.getRequired());
			assertThat(field.getDefaultValue(), is(equalTo(dummyString)));
			assertFalse(field.getFixed());
			assertFalse(field.getHidden());
			assertFalse(field.getMultiple());
			assertFalse(field.getConstrainedToOptions());

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
			assertTrue(field.getMapping().getToActivityConfigurationProperty());
			assertNotNull(field.getMapping().getActivityConfigurationProperty());
			assertThat(field.getMapping().getActivityConfigurationProperty()
					.getName(), is(equalTo(dummyString)));
			assertFalse(field.getMapping().getToComponentPort());
			assertNotNull(field.getMapping().getComponentPort());
			assertThat(field.getMapping().getComponentPort().getResource(),
					is(equalTo(dummyRelativeIdString)));
			assertFalse(field.getMapping().getToProcessorPort());
			assertNotNull(field.getMapping().getProcessorPort());
			assertThat(field.getMapping().getProcessorPort().getName(),
					is(equalTo(dummyString)));

			assertFalse(field.getMakeInputPort());
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
	}

	@Test
	public void testLoadingOfRealComponentDefinitionFromJson()
			throws JsonParseException, JsonMappingException, IOException {
		ComponentDefinition cd = JsonHandler.getInstance()
				.buildComponentDefinition(DNA2RNA_CD_FILE_PATH);

		assertNotNull(cd);

		assertNotNull(cd.getId());
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
