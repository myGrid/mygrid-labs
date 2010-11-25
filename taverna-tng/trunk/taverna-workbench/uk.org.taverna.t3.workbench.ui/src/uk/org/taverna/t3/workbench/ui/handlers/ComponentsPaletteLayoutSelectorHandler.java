package uk.org.taverna.t3.workbench.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.RadioState;

import uk.org.taverna.t3.workbench.ui.util.ComponentsPaletteLayout;
import uk.org.taverna.t3.workbench.ui.views.ComponentsPaletteView;

public class ComponentsPaletteLayoutSelectorHandler extends AbstractHandler
		implements IHandler {

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		final String requiredLayout = event
				.getParameter(RadioState.PARAMETER_ID);

		final ComponentsPaletteView paletteView = (ComponentsPaletteView) HandlerUtil
				.getActiveWorkbenchWindow(event).getActivePage()
				.findView(ComponentsPaletteView.ID);

		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				paletteView.setComponentsLayout(ComponentsPaletteLayout
						.valueOf(requiredLayout));

				try {
					HandlerUtil.updateRadioState(event.getCommand(),
							requiredLayout);
				} catch (ExecutionException e) {
					// TODO: log!
					e.printStackTrace();
				}
			}
		});

		return null;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isHandled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

}
