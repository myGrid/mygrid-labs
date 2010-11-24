package uk.org.taverna.t3.workbench.components.tests;

import java.util.List;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import uk.org.taverna.t3.workbench.components.definitions.model.ComponentDefinition;
import uk.org.taverna.t3.workbench.components.registry.ComponentDefinitionGroup;

public class ComponentDefinitionGroupTest extends TestCase {
	private static class TestComponentDefinitionGroup extends ComponentDefinitionGroup {

		public TestComponentDefinitionGroup(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}

		public TestComponentDefinitionGroup(String name,
				List<ComponentDefinition> definitions) {
			super(name, definitions);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	
	@BeforeClass
	public void setup() {
		
	}
	
	@Test
	public void testComparable() {
		TestComponentDefinitionGroup tg1 = new TestComponentDefinitionGroup("world");
		TestComponentDefinitionGroup tg2 = new TestComponentDefinitionGroup("hello");
		TestComponentDefinitionGroup tg3 = new TestComponentDefinitionGroup("Hello");
		
		assertTrue(tg1.compareTo(tg2) >= 1);
		assertTrue(tg2.compareTo(tg1) <= -1);
		assertTrue(tg2.compareTo(tg3) == 0);
		assertTrue(tg3.compareTo(tg2) == 0);
		
		try {
			tg1.compareTo(null);
			fail("Should have caused a NullPointerException");
		} catch (NullPointerException npe) {
			// Expected
		}
	}
}
