package uk.org.taverna.t3.workbench.ui.handlers;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import uk.org.taverna.scufl2.api.container.WorkflowBundle;
import uk.org.taverna.scufl2.api.io.ReaderException;
import uk.org.taverna.scufl2.translator.t2flow.T2FlowParser;
import uk.org.taverna.t3.workbench.canvas.diagram.part.CanvasDiagramEditorUtil;
import uk.org.taverna.t3.workbench.canvas.models.canvas.Canvas;
import uk.org.taverna.t3.workbench.workflows.translator.Scufl2ToCanvas;

public class OpenWorkflowHandler extends AbstractHandler implements IHandler {

	private final IProgressMonitor monitor = new NullProgressMonitor();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		FileDialog fileDialog = new FileDialog(shell, SWT.OPEN);
		fileDialog.setFilterExtensions(new String[] { "*.t2flow" });
		fileDialog.open();

		if (!fileDialog.getFileName().equals("")) {
			File file = new File(fileDialog.getFilterPath(), fileDialog.getFileName());
			try {
				T2FlowParser t2FlowParser = new T2FlowParser();
				WorkflowBundle workflowBundle = t2FlowParser.parseT2Flow(file);
				Canvas canvas = Scufl2ToCanvas.translate(workflowBundle);

				IProject project = getProject("Recent");
				String filePath = project.getFile(file.getPath()).getFullPath().toString();
				URI platformResourceURI = URI.createPlatformResourceURI(filePath, true);

				Resource resource = CanvasDiagramEditorUtil.createDiagram(platformResourceURI,
						new NullProgressMonitor(), canvas);
				if (resource != null) {
					CanvasDiagramEditorUtil.openDiagram(resource);
				}
			} catch (JAXBException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ReaderException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public IProject getProject(String projectName) throws CoreException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();

		// TODO what does this do?
		// root.refreshLocal(3, monitor);

		IProject project = root.getProject(projectName);
		if (!project.exists()) {
			project.create(monitor);
			project.open(monitor);
		}

		return project;
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
	public void dispose() {
		super.dispose();
	}

}
