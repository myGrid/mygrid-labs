package uk.org.taverna.tng.mockup3.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IWorkbenchPage;

public class SearchNewComponentsHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String searchTerm = "";
		
		searchTerm = event.getParameter(CommandParameters.SEARCH_TERM); 

		if (searchTerm != null && searchTerm != "") {
			System.out.println("Searching for: " + searchTerm + "...");
		}

		return null;
	}

}
