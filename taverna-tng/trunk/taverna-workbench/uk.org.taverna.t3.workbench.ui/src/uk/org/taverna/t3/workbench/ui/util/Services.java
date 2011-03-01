package uk.org.taverna.t3.workbench.ui.util;

import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.platform.activity.ActivityService;

public class Services {

	/*
	 * ==================
	 * Singleton handling
	 */

	// Private constructor prevents instantiation from other classes
	private Services() {

	}

	/**
	 * SingletonHolder is loaded on the first execution of
	 * Services() or the first access to
	 * SingletonHolder.INSTANCE, not before.
	 */
	private static class SingletonHolder {
		public static final Services INSTANCE = new Services();
	}

	public static Services getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/*
	 * ==================
	 */
	
	@Getter
	@Setter
	private ActivityService activityService;
	
}
