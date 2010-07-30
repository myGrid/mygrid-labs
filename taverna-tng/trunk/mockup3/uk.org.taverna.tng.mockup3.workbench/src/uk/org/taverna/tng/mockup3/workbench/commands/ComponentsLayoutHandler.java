package uk.org.taverna.tng.mockup3.workbench.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RadioState;

import uk.org.taverna.tng.mockup3.workbench.views.ComponentPaletteView;

public class ComponentsLayoutHandler extends AbstractHandler implements
		IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final String currentState = event.getParameter(RadioState.PARAMETER_ID);

		System.out.println("currentState = " + currentState);

		final ComponentPaletteView paletteView = (ComponentPaletteView) HandlerUtil
				.getActiveWorkbenchWindow(event).getActivePage().findView(
						ComponentPaletteView.VIEW_ID);

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				paletteView.setComponentsLayout(currentState);
			}
		});

		// and finally update the current state
		HandlerUtil.updateRadioState(event.getCommand(), currentState);

		return null;
	}

}
