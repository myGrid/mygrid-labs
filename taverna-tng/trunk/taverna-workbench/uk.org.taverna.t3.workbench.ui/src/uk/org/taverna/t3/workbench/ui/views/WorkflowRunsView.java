package uk.org.taverna.t3.workbench.ui.views;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.part.ViewPart;

import uk.org.taverna.t3.workbench.ui.dialogs.WorkflowRunStatusDialog;
import uk.org.taverna.t3.workbench.ui.models.WorkflowRun;
import uk.org.taverna.t3.workbench.ui.models.WorkflowRunsModel;
import uk.org.taverna.t3.workbench.ui.util.UIUtils;

public class WorkflowRunsView extends ViewPart {

	public static final String ID = "uk.org.taverna.t3.workbench.ui.views.workflowRuns";

	private TableViewer tableViewer;
	private final WorkflowRunsModel workflowRunsModel;
	private final DateFormat dateFormat = new SimpleDateFormat("HH:mm");

	public WorkflowRunsView() {
		workflowRunsModel = WorkflowRunsModel.getInstance();
	}

	@Override
	public void createPartControl(Composite parent) {
		GridLayout mainLayout = new GridLayout(1, true);
		mainLayout.marginWidth = 0;
		mainLayout.marginHeight = 0;
		parent.setLayout(mainLayout);

		createViewer(parent);

		Button delete = new Button(parent, SWT.PUSH);
		delete.setText("Delete");
		delete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (!tableViewer.getSelection().isEmpty()) {
					IStructuredSelection selection = (IStructuredSelection) tableViewer
							.getSelection();
					List<WorkflowRun> selectedWorkflowRuns = selection.toList();
					for (WorkflowRun selectedWorkflowRun : selectedWorkflowRuns) {
						workflowRunsModel.deleteWorkflowRun(selectedWorkflowRun);
					}
				}
			}
		});
	}

	private void createViewer(Composite parent) {
		tableViewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL
				| SWT.FULL_SELECTION | SWT.BORDER);
		createColumns(tableViewer);
		final Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
				WorkflowRun workflowRun = (WorkflowRun) selection.getFirstElement();
				if (workflowRun != null) {
					System.out.println("Double-click on : "
							+ workflowRun.getWorkflowReport().getWorkflow().getName());
					
					WorkflowRunStatusDialog statusDialog = new WorkflowRunStatusDialog(getSite().getShell(), workflowRun);
					
//					PopupDialog popup = new PopupDialog(null, PopupDialog.INFOPOPUP_SHELLSTYLE,
//							true, true, true, false, false, "Worflow Report", workflowRun.getName());
					
					statusDialog.create();
					statusDialog.open();
				}
			}
		});

		bind(new DataBindingContext());

		// Make the selection available to other views
		getSite().setSelectionProvider(tableViewer);

		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		tableViewer.getControl().setLayoutData(gridData);
	}

	private void bind(DataBindingContext bindingContext) {
		ViewerSupport.bind(
				tableViewer,
				workflowRunsModel.getWorkflowRuns(),
				BeanProperties.values(WorkflowRun.class, new String[] { "name", "date",
						"workflowReport.state" }));
	}

	private void createColumns(final TableViewer viewer) {
		TableViewerColumn column = UIUtils.createTableViewerColumn(viewer, "Workflow", 150, 0);

		column = UIUtils.createTableViewerColumn(viewer, "Date", 40, 1);
		column.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return dateFormat.format((Date) element);
			}
		});

		column = UIUtils.createTableViewerColumn(viewer, "Status", 60, 2);
	}

	

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		super.dispose();
	}

}
