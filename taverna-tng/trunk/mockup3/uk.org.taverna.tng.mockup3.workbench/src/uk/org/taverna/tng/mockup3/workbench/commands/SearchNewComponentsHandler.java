package uk.org.taverna.tng.mockup3.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.tng.mockup3.workbench.util.ComponentSearchResults;
import uk.org.taverna.tng.mockup3.workbench.util.ComponentSearcher;
import uk.org.taverna.tng.mockup3.workbench.views.ComponentSearchView;

public class SearchNewComponentsHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final String searchTerm = event
				.getParameter(ICommandParameters.SEARCH_TERM);

		if (searchTerm != null && searchTerm != "") {
			System.out.println("Searching for: " + searchTerm + "...");

			final ComponentSearchView searchView = (ComponentSearchView) HandlerUtil
					.getActiveWorkbenchWindow(event).getActivePage().findView(
							ComponentSearchView.VIEW_ID);

			if (searchView != null) {
				searchView.setSearchTerm(searchTerm);
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().activate(searchView);

				PlatformUI.getWorkbench().getDisplay().asyncExec(
						new Runnable() {
							@Override
							public void run() {
								ComponentSearchResults results = ComponentSearcher.INSTANCE
										.search(searchTerm);
								searchView.setSearchResults(results);
							}
						});
			}
		}

		return null;
	}
}
