package prototype003.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.handlers.HandlerUtil;

public class ExitHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Hello Workbench!"); // Confirmed!
		HandlerUtil.getActiveWorkbenchWindow(event).close();
		return null;
	}

}
