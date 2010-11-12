package uk.org.taverna.t3.workbench.ui.handlers;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;

import org.eclipse.emf.transaction.TransactionalEditingDomain;

import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditor;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditorUtil;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CanvasFactory;
import uk.org.taverna.t3.workbench.canvas.models.canvas.CoreComponentInstance;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Node;
import uk.org.taverna.t3.workbench.canvas.models.canvas.WorkflowInput;

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
		
		try {
			
			createProject();
			
		} catch (CoreException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Resource r = CanvasDiagramEditorUtil.createDiagram(createProjectURI("myFile"), new NullProgressMonitor());
		
		try {
			
			boolean opened = CanvasDiagramEditorUtil.openDiagram(r);
		
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		
		IEditorPart editorPart = page.getActiveEditor();
	
		// model object instances for testing purposes
		
		Canvas myCanvas = CanvasFactory.eINSTANCE.createCanvas();
		
		Node myNode = CanvasFactory.eINSTANCE.createNode();
		
		WorkflowInput myWorkflowInput = CanvasFactory.eINSTANCE.createWorkflowInput();
		
		EList<EObject> objects = r.getContents();	
		 
		//TransactionalEditingDomain editingDomain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(r.getResourceSet());
		
			// to look up emf commands
		//editingDomain.getCommandStack().execute(command)
		
		
		
		return null;
	}
	
	public IProject createProject() throws CoreException {
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		
		root.refreshLocal(3, monitor);
		
		myProject = root.getProject("This Is The ProjectName");
		
		if (myProject.exists()) {
			myProject.delete(true, monitor);
		}
		
		myProject.create(monitor);
		myProject.open(monitor);
		
		return myProject;
		
	}
	
	protected URI createProjectURI(String filename) {
        return URI.createPlatformResourceURI(myProject.getFile(filename).getFullPath().toString(), true);
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
