package uk.org.taverna.t3.workbench.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.org.taverna.t3.workbench.ui.commands.Commands;
import uk.org.taverna.t3.workbench.ui.util.ComponentsPaletteLayout;
import uk.org.taverna.t3.workbench.ui.views.ComponentsPaletteView;

public class ComponentsPaletteLayoutHandler extends AbstractHandler implements
		IHandler {

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
		final ComponentsPaletteView paletteView = (ComponentsPaletteView) HandlerUtil
				.getActiveWorkbenchWindow(event).getActivePage()
				.findView(ComponentsPaletteView.ID);
		
		ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class);
		final Command layoutSelectorCommand = commandService.getCommand(Commands.COMPONENTS_PALETTE_LAYOUT_SELECTOR);


		PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				ComponentsPaletteLayout layout = paletteView
						.cycleComponentsLayout();

				try {
					HandlerUtil.updateRadioState(layoutSelectorCommand,
							layout.toString());
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
