package uk.org.taverna.t3.workbench.ui.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IWorkbenchSiteProgressService;

import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.ComponentSearcher;
import uk.org.taverna.t3.workbench.ui.commands.CommandParameters;
import uk.org.taverna.t3.workbench.ui.views.ComponentsSearchView;

public class SearchNewComponentsHandler extends AbstractHandler implements
		IHandler {
	
	private Job searchJob;
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		final String searchQuery = event
				.getParameter(CommandParameters.SEARCH_QUERY);

		if (searchQuery != null && searchQuery != "") {
			System.out.println("Searching initiated for: " + searchQuery
					+ "...");

			final ComponentsSearchView searchView = (ComponentsSearchView) HandlerUtil
					.getActiveWorkbenchWindow(event).getActivePage()
					.findView(ComponentsSearchView.ID);

			if (searchView != null) {
				searchView.setSearchQuery(searchQuery);
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().activate(searchView);
				
				if (searchJob != null)
					searchJob.cancel();
				
				createSearchJob(searchView, searchQuery);
				
				IWorkbenchSiteProgressService progressService = (IWorkbenchSiteProgressService) searchView.getSite().getService(IWorkbenchSiteProgressService.class);
				progressService.schedule(searchJob);
			}
		}

		return null;
	}

	private void createSearchJob(final ComponentsSearchView searchView, final String searchQuery) {
		searchJob = new Job("Searching for new components") {
			
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Searching for new components", 100);
				
				final List<ComponentSearchResults> results = ComponentSearcher .getInstance().search(searchQuery);
				
				System.out.println("Results sets found: " + results.size());
				
				monitor.worked(50);
				
				if (searchView.getControl().isDisposed()) {
					return Status.CANCEL_STATUS;
				}
				
				Display.getDefault().asyncExec(new Runnable() {
					public void run() {
						searchView.setSearchResults(results);
					}
				});
				
				monitor.worked(100);
				
				return Status.OK_STATUS;
			}
			
		};
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}
	
}
