package uk.org.taverna.t3.workbench.ui.models;

import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import uk.org.taverna.platform.report.WorkflowReport;

public class WorkflowRun {

	private final String id;

	private final WorkflowReport workflowReport;

//	private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

	private final DateFormat dateFormat = new SimpleDateFormat("HH:mm");
	
	public WorkflowRun(String id, WorkflowReport workflowReport) {
		this.id = id;
		this.workflowReport = workflowReport;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return workflowReport.getWorkflow().getName();
	}

	public String getDate() {
		return dateFormat.format(workflowReport.getCreatedDate());
	}

	public WorkflowReport getWorkflowReport() {
		return workflowReport;
	}


	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
//		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
//		propertyChangeSupport.removePropertyChangeListener(listener);
	}

}
