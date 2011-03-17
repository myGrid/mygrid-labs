package uk.org.taverna.t3.workbench.ui.models;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import uk.org.taverna.platform.report.ProcessorReport;
import uk.org.taverna.platform.report.State;

public class ProcessorStatus implements PropertyChangeListener {
	
	private final PropertyChangeSupport propertyChangeSupport;

	private String name;
	
	private State state;
	
	private int queued, completed, running;

	private final ProcessorReport processorReport;
	
	public ProcessorStatus(ProcessorReport processorReport) {
		propertyChangeSupport = new PropertyChangeSupport(this);
		this.processorReport = processorReport;
		setName(processorReport.getProcessor().getName());
		setState(processorReport.getState());
		processorReport.addPropertyChangeListener("state", this);
		setQueued(processorReport.getJobsQueued());
		setCompleted(processorReport.getJobsCompleted());
		setRunning(processorReport.getJobsStarted());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		propertyChangeSupport.firePropertyChange("name", this.name, this.name = name);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		propertyChangeSupport.firePropertyChange("state", this.state, this.state = state);
	}

	public int getQueued() {
		return queued;
	}

	public void setQueued(int queued) {
		propertyChangeSupport.firePropertyChange("queued", this.queued, this.queued = queued);
	}

	public int getCompleted() {
		return completed;
	}

	public void setCompleted(int completed) {
		propertyChangeSupport.firePropertyChange("completed", this.completed, this.completed = completed);
	}

	public int getRunning() {
		return running;
	}

	public void setRunning(int running) {
		propertyChangeSupport.firePropertyChange("running", this.running, this.running = running);
	}

	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
		propertyChangeSupport.removePropertyChangeListener(listener);
	}

	public void update() {
		setQueued(processorReport.getJobsQueued());
		setCompleted(processorReport.getJobsCompleted());
		setRunning(processorReport.getJobsStarted());
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) {
		if (event.getPropertyName().equals("state")) {
			setState((State) event.getNewValue());
		}
	}

}
