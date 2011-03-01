package uk.org.taverna.t3.workbench.ui.util;

import uk.org.taverna.platform.activity.ActivityService;

public class ServicesConsumer {
	
	public void setActivityService(ActivityService service) {
		System.out.println("ActivityService was set. Thank you DS!");
		Services.getInstance().setActivityService(service);
	}
	
	public void unsetActivityService(ActivityService service) {
		System.out.println("ActivityService was unset. Why did you do this to me?");
		Services.getInstance().setActivityService(null);
	}
}
