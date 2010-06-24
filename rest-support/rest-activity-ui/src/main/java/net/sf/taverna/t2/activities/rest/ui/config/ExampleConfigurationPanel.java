package net.sf.taverna.t2.activities.rest.ui.config;

import java.awt.GridLayout;
import java.net.URI;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ActivityConfigurationPanel;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;


@SuppressWarnings("serial")
public class ExampleConfigurationPanel
		extends
		ActivityConfigurationPanel<RESTActivity, RESTActivityConfigurationBean> {

	private RESTActivity activity;
	private RESTActivityConfigurationBean configBean;
	
	private JTextField fieldHTTPMethod;
	private JTextField fieldURLSignature;
	

	public ExampleConfigurationPanel(RESTActivity activity) {
		this.activity = activity;
		initGui();
	}

	protected void initGui() {
		removeAll();
		setLayout(new GridLayout(0, 2));

		// FIXME: Create GUI depending on activity configuration bean
		
		JLabel labelMethod = new JLabel("HTTP Method:");
		add(labelMethod);
		fieldHTTPMethod = new JTextField(30);
		fieldHTTPMethod.setEditable(false);
    add(fieldHTTPMethod);
		
		JLabel labelString = new JLabel("URL Signature:");
		labelString.setLabelFor(fieldURLSignature);
		add(labelString);
		fieldURLSignature = new JTextField(30);
		add(fieldURLSignature);

		// Populate fields from activity configuration bean
		refreshConfiguration();
	}

	/**
	 * Check that user values in UI are valid
	 */
	@Override
	public boolean checkValues()
	{
	  // TODO - check values; especially, validity of the URL signature
          //		try {
          //			URI.create(fieldURI.getText());
          //		} catch (IllegalArgumentException ex) {
          //			JOptionPane.showMessageDialog(this, ex.getCause().getMessage(),
          //					"Invalid URI", JOptionPane.ERROR_MESSAGE);
          //			// Not valid, return false
          //			return false;
          //		}
		// All valid, return true
		return true;
	}

	/**
	 * Return configuration bean generated from user interface last time
	 * noteConfiguration() was called.
	 */
	@Override
	public RESTActivityConfigurationBean getConfiguration() {
		// Should already have been made by noteConfiguration()
		return configBean;
	}

	/**
	 * Check if the user has changed the configuration from the original
	 */
	@Override
	public boolean isConfigurationChanged() {
	  // TODO - use all necessary fields
		String originalURLSignature = configBean.getUrlSignature();
		
		// true (changed) unless all fields match the originals
		return ! (originalURLSignature.equals(fieldURLSignature.getText()));
	}

	
	/**
	 * Prepare a new configuration bean from the UI, to be returned with
	 * getConfiguration()
	 */
	@Override
	public void noteConfiguration() {
		configBean = new RESTActivityConfigurationBean();
		
		// FIXME: Update bean fields from your UI elements
		configBean.setUrlSignature(fieldURLSignature.getText());
	}

	/**
	 * Update GUI from a changed configuration bean (perhaps by undo/redo).
	 * 
	 */
	@Override
	public void refreshConfiguration() {
		configBean = activity.getConfiguration();
		
		// FIXME: Update UI elements from your bean fields
		fieldHTTPMethod.setText("" + configBean.getHttpMethod());
		fieldURLSignature.setText(configBean.getUrlSignature());
	}
}
