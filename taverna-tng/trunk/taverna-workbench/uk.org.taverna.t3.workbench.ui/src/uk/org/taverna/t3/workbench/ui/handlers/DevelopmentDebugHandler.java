package uk.org.taverna.t3.workbench.ui.handlers;

import java.net.URI;

import net.sf.taverna.t2.reference.ReferenceService;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import uk.org.taverna.platform.activity.ActivityService;
import uk.org.taverna.platform.execution.api.ExecutionService;
import uk.org.taverna.platform.run.api.RunService;
import uk.org.taverna.t3.workbench.ui.util.Services;

public class DevelopmentDebugHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Generate some debugging info and output to system out. 
		
		StringBuilder sb = new StringBuilder();
		
		// ActivityService
		sb.append("\nProbing ActivityService...");
		ActivityService activityService = Services.getInstance().getActivityService();
		if (activityService == null) {
			sb.append("\n\tActivityService currently not available! (is null)");
		} else {
			sb.append("\n\tTaverna Activities found: " + activityService.getActivityURIs().size());
			for(URI uri : activityService.getActivityURIs()) {
				sb.append("\n\t\tTaverna Activity found: " + uri.toString());
			}
		}
		
		// ReferenceService
		sb.append("\nProbing ReferenceService");
		ReferenceService referenceService = Services.getInstance().getReferenceService();
		if (referenceService == null) {
			sb.append("\n\tReferenceService currently not available! (is null)");
		} else {
			
		}
		
		
		// RunService
		sb.append("\nProbing RunService");
		RunService runService = Services.getInstance().getRunService();
		if (runService == null) {
			sb.append("\n\tRunService currently not available! (is null)");
		} else {
			
		}
		
		// ExecutionService
		sb.append("\nProbing ExecutionService");
		ExecutionService executionService = Services.getInstance().getExecutionService();
		if (executionService == null) {
			sb.append("\n\tExecutionService currently not available! (is null)");
		} else {
			
		}
		
		sb.append("\n");
		
		System.out.println(sb.toString());
		
		return null;
	}

}
