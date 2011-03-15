package uk.org.taverna.t3.workbench.ui.models;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import lombok.Getter;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.WritableList;

import uk.org.taverna.platform.execution.api.InvalidExecutionIdException;
import uk.org.taverna.platform.execution.api.InvalidWorkflowException;
import uk.org.taverna.platform.run.api.InvalidRunIdException;
import uk.org.taverna.platform.run.api.RunProfile;
import uk.org.taverna.platform.run.api.RunProfileException;
import uk.org.taverna.platform.run.api.RunService;
import uk.org.taverna.platform.run.api.RunStateException;
import uk.org.taverna.scufl2.api.container.WorkflowBundle;
import uk.org.taverna.scufl2.api.io.ReaderException;
import uk.org.taverna.scufl2.translator.t2flow.T2FlowParser;
import uk.org.taverna.t3.workbench.ui.util.Services;

public class WorkflowRunsModel implements PropertyChangeListener {

	private static class Singleton {
		public static final WorkflowRunsModel INSTANCE = new WorkflowRunsModel();
	}

	private final RunService runService;

	private final PropertyChangeSupport propertyChangeSupport;

	@Getter
	private final IObservableList workflowRuns;

	private WorkflowRunsModel() {
		propertyChangeSupport = new PropertyChangeSupport(this);
		runService = Services.getInstance().getRunService();
		workflowRuns = new WritableList();
		List<String> runIDs = runService.getRuns();
		for (String runID : runIDs) {
			try {
				workflowRuns.add(new WorkflowRun(runID, runService.getWorkflowReport(runID)));
			} catch (InvalidRunIdException e) {
				// TODO log
			}
		}
	}

	public static WorkflowRunsModel getInstance() {
		return Singleton.INSTANCE;
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	@Override
	public void propertyChange(PropertyChangeEvent arg0) {
	}

	public void run() {
//		File workflow = new File(
//		"/Users/david/Dropbox/TestWorkflows/Demonstration of configurable iteration.t2flow");
		File workflow = new File(
		"/Users/david/Dropbox/TestWorkflows/A workflow version of the EMBOSS tutorial.t2flow");
		try {
			T2FlowParser t2FlowParser = new T2FlowParser();
			WorkflowBundle workflowBundle = t2FlowParser.parseT2Flow(workflow);
			String runID = runService.createRun(new RunProfile(workflowBundle, Services
					.getInstance().getReferenceService(), Services.getInstance()
					.getExecutionService()));
			workflowRuns.add(new WorkflowRun(runID, runService.getWorkflowReport(runID)));
			runService.start(runID);
		} catch (InvalidWorkflowException e) {
			e.printStackTrace();
		} catch (RunProfileException e) {
			e.printStackTrace();
		} catch (InvalidRunIdException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ReaderException e) {
			e.printStackTrace();
		} catch (RunStateException e) {
			e.printStackTrace();
		} catch (InvalidExecutionIdException e) {
			e.printStackTrace();
		}

	}

	public void deleteWorkflowRun(WorkflowRun workflowRun) {
		workflowRuns.remove(workflowRun);
		try {
			runService.delete(workflowRun.getId());
		} catch (InvalidRunIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidExecutionIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
