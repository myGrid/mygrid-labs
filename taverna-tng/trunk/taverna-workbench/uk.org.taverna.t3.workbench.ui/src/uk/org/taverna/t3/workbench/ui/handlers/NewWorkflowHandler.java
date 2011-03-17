package uk.org.taverna.t3.workbench.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;

import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditor;
import uk.org.taverna.t3.workbench.ui.editors.NonExistingCanvasEditorInput;

public class NewWorkflowHandler extends AbstractHandler implements IHandler {

	protected IProject myProject;
	protected IProgressMonitor monitor = new NullProgressMonitor();

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IFileStore fileStore = queryFileStore();
		IEditorInput input = new NonExistingCanvasEditorInput(fileStore, "New Canvas");
		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		try {
			IEditorPart editorPart = page.openEditor(input, CanvasDiagramEditor.ID);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private IFileStore queryFileStore() {
		@SuppressWarnings("restriction")
		IPath stateLocation = EditorsPlugin.getDefault().getStateLocation();
		IPath path = stateLocation.append("/_" + new Object().hashCode()); //$NON-NLS-1$
		return EFS.getLocalFileSystem().getStore(path);
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
