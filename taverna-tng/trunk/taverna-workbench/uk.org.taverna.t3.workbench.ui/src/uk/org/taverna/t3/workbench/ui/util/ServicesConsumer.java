package uk.org.taverna.t3.workbench.ui.util;

import net.sf.taverna.t2.reference.ReferenceService;
import uk.org.taverna.platform.activity.ActivityService;
import uk.org.taverna.platform.execution.api.ExecutionService;
import uk.org.taverna.platform.run.api.RunService;

public class ServicesConsumer {
	
	public void setActivityService(ActivityService service) {
		System.out.println("ActivityService was set. Thank you DS!");
		Services.getInstance().setActivityService(service);
	}
	
	public void unsetActivityService(ActivityService service) {
		System.out.println("ActivityService was unset. Why did you do this to me?");
		Services.getInstance().setActivityService(null);
	}
	
	public void setReferenceService(ReferenceService service) {
		System.out.println("ReferenceService was set. Thank you DS!");
		Services.getInstance().setReferenceService(service);
	}
	
	public void unsetReferenceService(ReferenceService service) {
		System.out.println("ReferenceService was unset. Why did you do this to me?");
		Services.getInstance().setReferenceService(null);
	}
	
	public void setRunService(RunService service) {
		System.out.println("RunService was set. Thank you DS!");
		Services.getInstance().setRunService(service);
	}
	
	public void unsetRunService(RunService service) {
		System.out.println("RunService was unset. Why did you do this to me?");
		Services.getInstance().setRunService(null);
	}
	
	public void setExecutionService(ExecutionService service) {
		System.out.println("ExecutionService was set. Thank you DS!");
		Services.getInstance().setExecutionService(service);
	}
	
	public void unsetExecutionService(ExecutionService service) {
		System.out.println("ExecutionService was unset. Why did you do this to me?");
		Services.getInstance().setExecutionService(null);
	}
}
