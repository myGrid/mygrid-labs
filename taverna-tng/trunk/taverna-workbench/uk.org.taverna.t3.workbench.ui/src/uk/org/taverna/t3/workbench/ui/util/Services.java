package uk.org.taverna.t3.workbench.ui.util;

import net.sf.taverna.t2.reference.ReferenceService;
import lombok.Getter;
import lombok.Setter;
import uk.org.taverna.platform.activity.ActivityService;
import uk.org.taverna.platform.execution.api.ExecutionService;
import uk.org.taverna.platform.run.api.RunService;

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
	
	@Getter
	@Setter
	private ReferenceService referenceService;
	
	@Getter
	@Setter
	private RunService runService;
	
	@Getter
	@Setter
	private ExecutionService executionService;
}
