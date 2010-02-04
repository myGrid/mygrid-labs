package prototype003.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.handlers.HandlerUtil;

import prototype003.MyGraphView;

public class ChangeLayout extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		IViewPart findView = HandlerUtil.getActiveWorkbenchWindow(event)
		.getActivePage().findView("prototype003.MyGraphView");
		MyGraphView view = (MyGraphView) findView;
		view.setLayoutManager();
		
		return null;
	}

}
