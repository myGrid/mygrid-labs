package mockup2_v001;

import org.eclipse.gef.ContextMenuProvider;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.ui.actions.ActionRegistry;
import org.eclipse.gef.ui.actions.GEFActionConstants;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.actions.ActionFactory;
/*
 *	Context Menu class 
 */
public class ApplicationContextMenuProvider extends ContextMenuProvider {
	
	private ActionRegistry actionRegistry;
	
	public ApplicationContextMenuProvider(EditPartViewer viewer, ActionRegistry registry) {
		super(viewer);
		setActionRegistry(registry);
	}
	
	@Override
	public void buildContextMenu(IMenuManager menu) {
		IAction action;
		
		GEFActionConstants.addStandardActionGroups(menu);
		
		action = getActionRegistry().getAction(ActionFactory.UNDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		action = getActionRegistry().getAction(ActionFactory.REDO.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_UNDO, action);
		
		action = getActionRegistry().getAction(ActionFactory.DELETE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(ActionFactory.RENAME.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_EDIT, action);
		
		action = getActionRegistry().getAction(ActionFactory.COPY.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);
		
		action = getActionRegistry().getAction(ActionFactory.PASTE.getId());
		menu.appendToGroup(GEFActionConstants.GROUP_COPY, action);
		
	}
	
	private ActionRegistry getActionRegistry() {
		return actionRegistry;
	}

	private void setActionRegistry(ActionRegistry registry) {
		actionRegistry = registry;
	}



}
