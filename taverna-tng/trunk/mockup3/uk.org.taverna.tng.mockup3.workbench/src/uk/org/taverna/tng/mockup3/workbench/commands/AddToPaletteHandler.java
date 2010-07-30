package uk.org.taverna.tng.mockup3.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.tng.mockup3.core.ComponentDefinition;
import uk.org.taverna.tng.mockup3.core.ComponentDefinitionsRegistry;
import uk.org.taverna.tng.mockup3.workbench.util.ComponentSearchResults;
import uk.org.taverna.tng.mockup3.workbench.util.ComponentSearcher;
import uk.org.taverna.tng.mockup3.workbench.views.ComponentPaletteView;
import uk.org.taverna.tng.mockup3.workbench.views.ComponentSearchView;

public class AddToPaletteHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final String componentDefinition = event
				.getParameter(ICommandParameters.COMPONENT_DEFINITION);

		if (componentDefinition != null && componentDefinition != "") {
			System.out.println("Adding component definition... "
					+ componentDefinition);
			
			ComponentDefinitionsRegistry.INSTANCE.addComponentDefinition(new ComponentDefinition("http://www.biocatalogue.org/" + componentDefinition, componentDefinition, "", null, null, null));

			final ComponentPaletteView paletteView = (ComponentPaletteView) HandlerUtil
					.getActiveWorkbenchWindow(event).getActivePage().findView(
							ComponentPaletteView.VIEW_ID);

			PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
				@Override
				public void run() {
					paletteView.refresh();
				}
			});
		}

		return null;
	}

}
