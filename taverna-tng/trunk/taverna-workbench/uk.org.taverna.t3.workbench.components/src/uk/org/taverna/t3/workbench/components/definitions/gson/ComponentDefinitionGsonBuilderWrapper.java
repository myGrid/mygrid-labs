package uk.org.taverna.t3.workbench.components.definitions.gson;

import org.joda.time.DateTime;

import uk.org.taverna.t3.workbench.common.GsonDateTimeTypeConverter;

import com.google.gson.GsonBuilder;

public class ComponentDefinitionGsonBuilderWrapper {
	private final GsonBuilder gsonBuilder = new GsonBuilder();
	
	// Private constructor prevents instantiation from other classes
	private ComponentDefinitionGsonBuilderWrapper() {
		gsonBuilder.registerTypeAdapter(DateTime.class, new GsonDateTimeTypeConverter());
	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * ComponentDefinitionGsonBuilderWrapper.getInstance() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final ComponentDefinitionGsonBuilderWrapper INSTANCE = new ComponentDefinitionGsonBuilderWrapper();
	}

	public static ComponentDefinitionGsonBuilderWrapper getInstance() {
		return SingletonHolder.INSTANCE;
	}
	
	public GsonBuilder getBuilder() {
		return gsonBuilder;
	}
}
