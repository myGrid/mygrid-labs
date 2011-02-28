package uk.org.taverna.t3.workbench.ui.handlers;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.t3.workbench.components.search.ComponentSearchResults;
import uk.org.taverna.t3.workbench.components.search.ComponentSearcher;
import uk.org.taverna.t3.workbench.ui.commands.CommandParameters;
import uk.org.taverna.t3.workbench.ui.views.ComponentsSearchView;

public class SearchNewComponentsHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO: wrap this in a background job instead
		final String searchQuery = event
				.getParameter(CommandParameters.SEARCH_QUERY);

		if (searchQuery != null && searchQuery != "") {
			System.out.println("Searching initiated, for: " + searchQuery
					+ "...");

			final ComponentsSearchView searchView = (ComponentsSearchView) HandlerUtil
					.getActiveWorkbenchWindow(event).getActivePage()
					.findView(ComponentsSearchView.ID);

			if (searchView != null) {
				searchView.setSearchQuery(searchQuery);
				PlatformUI.getWorkbench().getActiveWorkbenchWindow()
						.getActivePage().activate(searchView);

				PlatformUI.getWorkbench().getDisplay()
						.asyncExec(new Runnable() {
							@Override
							public void run() {
								List<ComponentSearchResults> results = ComponentSearcher
										.getInstance().search(searchQuery);
								System.out.println("Results sets found: "
										+ results.size());
								searchView.setSearchResults(results);
							}
						});
			}
		}

		return null;
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
