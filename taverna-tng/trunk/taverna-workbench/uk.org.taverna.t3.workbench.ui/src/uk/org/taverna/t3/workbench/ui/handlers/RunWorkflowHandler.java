package uk.org.taverna.t3.workbench.ui.handlers;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;

import uk.org.taverna.scufl2.api.container.WorkflowBundle;
import uk.org.taverna.scufl2.api.io.ReaderException;
import uk.org.taverna.scufl2.translator.t2flow.T2FlowParser;
import uk.org.taverna.t3.workbench.ui.models.WorkflowRunsModel;
import uk.org.taverna.t3.workbench.ui.views.WorkflowRunsView;

public class RunWorkflowHandler extends AbstractHandler implements IHandler {

	private static WorkflowRunsModel workflowRunsModel = WorkflowRunsModel.getInstance();

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IEditorPart activeEditor = HandlerUtil.getActiveEditor(event);
		if (activeEditor != null) {
			FileEditorInput editorInput = (FileEditorInput) activeEditor.getEditorInput();
			File workflowFile = new File("/", editorInput.getFile().getFullPath()
					.removeFirstSegments(1).toString());
			try {
				T2FlowParser t2FlowParser = new T2FlowParser();
				WorkflowBundle workflowBundle = t2FlowParser.parseT2Flow(workflowFile);
				workflowRunsModel.runWorkflow(workflowBundle);

				final WorkflowRunsView workflowRunsView = (WorkflowRunsView) HandlerUtil
						.getActiveWorkbenchWindow(event).getActivePage()
						.findView(WorkflowRunsView.ID);

				if (workflowRunsView != null) {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
							.activate(workflowRunsView);
				}
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ReaderException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
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
	public void dispose() {
		super.dispose();
	}

}
