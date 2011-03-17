package uk.org.taverna.t3.workbench.ui.dialogs;

import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.list.WritableList;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

import uk.org.taverna.platform.report.ProcessorReport;
import uk.org.taverna.t3.workbench.ui.models.WorkflowRun;
import uk.org.taverna.t3.workbench.ui.util.UIUtils;

public class WorkflowRunStatusDialog extends Dialog {
	
	WorkflowRun workflowRun;

	public WorkflowRunStatusDialog(Shell parentShell, WorkflowRun workflowRun) {
		super(parentShell);
		this.workflowRun = workflowRun;
		
		setBlockOnOpen(true);
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.CLOSE_ID,
	      IDialogConstants.CLOSE_LABEL, true);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
	
		TableViewer tableViewer = new TableViewer(container, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);
		
		UIUtils.createTableViewerColumn(tableViewer, "Processor", 150, 0);
		UIUtils.createTableViewerColumn(tableViewer, "Status", 40, 1);
//		UIUtils.createTableViewerColumn(tableViewer, "Queued", 60, 2);
//		UIUtils.createTableViewerColumn(tableViewer, "Complete", 60, 3);
//		UIUtils.createTableViewerColumn(tableViewer, "Errors", 60, 4);
		ViewerSupport.bind(
				tableViewer,
				new WritableList(workflowRun.getWorkflowReport().getAllProcessorReports(), ProcessorReport.class),
				BeanProperties.values(ProcessorReport.class, new String[] { "processor.name", "state" }));
		
		return container;
	}
}
