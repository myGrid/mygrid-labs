package uk.org.taverna.t3.workbench.canvas.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;

/**
 * @generated
 */
public class CanvasDiagramActionBarContributor extends
		DiagramActionBarContributor {

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return CanvasDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return CanvasDiagramEditor.ID;
	}

	/**
	 * @generated NOT
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		//fileMenu.remove("pageSetupAction"); //$NON-NLS-1$
		IToolBarManager toolBarManager = bars.getToolBarManager();
		   IContributionItem[] items = toolBarManager.getItems();
		   for (IContributionItem contributionItem : items) {
		      
		         contributionItem.setVisible(false);
		         toolBarManager.remove(contributionItem);
		      
		   }
	}
}
