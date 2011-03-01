package uk.org.taverna.t3.workbench.ui.handlers;

import java.net.URI;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;

import uk.org.taverna.platform.activity.ActivityService;
import uk.org.taverna.t3.workbench.ui.util.Services;

public class DevelopmentDebugHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Generate some debugging info and output to system out. 
		
		StringBuilder sb = new StringBuilder();
		
		// ActivityService
		ActivityService activityService = Services.getInstance().getActivityService();
		sb.append("\nProbing ActivityService...");
		if (activityService == null) {
			sb.append("\n\tActivityService currently not available! (is null)");
		} else {
			sb.append("\n\tTaverna Activities found: " + activityService.getActivityURIs().size());
			for(URI uri : activityService.getActivityURIs()) {
				sb.append("\n\t\tTaverna Activity found: " + uri.getPath());
			}
		}
		
		System.out.println(sb.toString());
		
		return null;
	}

}
