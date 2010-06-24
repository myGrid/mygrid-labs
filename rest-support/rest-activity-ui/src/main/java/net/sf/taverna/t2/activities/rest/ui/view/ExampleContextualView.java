package net.sf.taverna.t2.activities.rest.ui.view;

import java.awt.Frame;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;
import net.sf.taverna.t2.activities.rest.ui.config.ExampleConfigureAction;

@SuppressWarnings("serial")
public class ExampleContextualView extends ContextualView {
	private final RESTActivity activity;
	private JLabel description = new JLabel("ads");

	public ExampleContextualView(RESTActivity activity) {
		this.activity = activity;
		initView();
	}

	@Override
	public JComponent getMainFrame() {
		JPanel jPanel = new JPanel();
		jPanel.add(description);
		refreshView();
		return jPanel;
	}

	@Override
	public String getViewTitle() {
		RESTActivityConfigurationBean configuration = activity.getConfiguration();
		return "VIEW TITLE: Example service " + configuration.getHttpMethod() + " " + configuration.getUrlSignature();
	}

	/**
	 * Typically called when the activity configuration has changed.
	 */
	@Override
	public void refreshView() {
		RESTActivityConfigurationBean configuration = activity
				.getConfiguration();
		description.setText("DESCRIPTION: Example service " + configuration.getHttpMethod() + " " + configuration.getUrlSignature());
		// TODO: Might also show extra service information looked
		// up dynamically from endpoint/registry
	}

	/**
	 * View position hint
	 */
	@Override
	public int getPreferredPosition() {
		// We want to be on top
		return 100;
	}
	
	@Override
	public Action getConfigureAction(final Frame owner) {
	  // "Configure" button appears because of this action being returned
		return new ExampleConfigureAction(activity, owner);
	}

}
