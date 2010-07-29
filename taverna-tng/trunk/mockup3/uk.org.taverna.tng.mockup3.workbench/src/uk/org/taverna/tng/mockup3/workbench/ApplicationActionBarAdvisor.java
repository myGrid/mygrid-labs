package uk.org.taverna.tng.mockup3.workbench;

import java.io.File;
import java.util.Iterator;

import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.ui.action.WorkbenchWindowActionDelegate;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

import uk.org.taverna.tng.mockup3.models.workflow.diagram.part.WorkflowCreationWizard;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.
	private IWorkbenchAction exitAction;


	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	protected void makeActions(final IWorkbenchWindow window) {
		// Creates the actions and registers them.
		// Registering is needed to ensure that key bindings work.
		// The corresponding commands keybindings are defined in the plugin.xml
		// file.
		// Registering also provides automatic disposal of the actions when
		// the window is closed.

		exitAction = ActionFactory.QUIT.create(window);

		register(exitAction);
	
	}

	protected void fillMenuBar(IMenuManager menuBar) {
//		MenuManager fileMenu = new MenuManager("&File",
//				IWorkbenchActionConstants.M_FILE);
//		menuBar.add(fileMenu);
//		fileMenu.add(exitAction);
	}
	
	public static class NewDiagramAction extends WorkbenchWindowActionDelegate {

		@Override
		public void run(IAction action) {
			WorkflowCreationWizard wizard = new WorkflowCreationWizard();
			
			wizard.init(getWindow().getWorkbench(), StructuredSelection.EMPTY);
			wizard.setForcePreviousAndNextButtons(true);
		
			WizardDialog wizardDialog = new WizardDialog(getWindow().getShell(), wizard);
			wizardDialog.open();
		}		
	}

	public static class OpenURIAction extends WorkbenchWindowActionDelegate {

		@Override
		public void run(IAction action) {
			LoadResourceAction.LoadResourceDialog loadResourceDialog = new LoadResourceAction.LoadResourceDialog(getWindow().getShell());
			
			if (Dialog.OK == loadResourceDialog.open()) {
				for (Iterator i = loadResourceDialog.getURIs().iterator(); i.hasNext();) {
					openEditor(getWindow().getWorkbench(), (URI)i.next());
				}
			}
		}
		
	}
	
	public static class OpenAction extends WorkbenchWindowActionDelegate {

		@Override
		public void run(IAction action) {

			FileDialog fileDialog = new FileDialog(getWindow().getShell(), SWT.OPEN);
			fileDialog.open();
			if (fileDialog.getFileName().length() > 0) {
				openEditor(getWindow().getWorkbench(), URI.createFileURI(fileDialog.getFilterPath() + File.separator + fileDialog.getFileName()));
			}
		}

		
	}

	public static boolean openEditor(IWorkbench workbench, URI fileURI) {
		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		IEditorDescriptor editorDescriptor = workbench.getEditorRegistry().getDefaultEditor(fileURI.toFileString());
		
		if (editorDescriptor == null) {
			System.out.println("Something went wrong.");
			return false;
		} else {
			
			try {
		
				page.openEditor(new URIEditorInput(fileURI), editorDescriptor.getId());
			} catch (PartInitException exception) {
				System.out.println("Something went wrong.");
				return false;
			}
				
		}
		return true;
	}
	
	public static class AboutAction extends WorkbenchWindowActionDelegate {

		@Override
		public void run(IAction action) {
			MessageDialog.openInformation(getWindow().getShell(), null , null);
		}
		
	}
	
}
