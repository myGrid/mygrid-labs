package net.sf.taverna.t2.activities.rest.ui.config;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.net.URI;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.sf.taverna.t2.lang.ui.ShadedLabel;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ActivityConfigurationPanel;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;


@SuppressWarnings("serial")
public class RESTActivityConfigurationPanel	extends
		ActivityConfigurationPanel<RESTActivity, RESTActivityConfigurationBean>
{
	private RESTActivity activity;
	private RESTActivityConfigurationBean configBean;
	
	private JComboBox jcbHTTPMethod;
	private JTextField fieldURLSignature;
	

	public RESTActivityConfigurationPanel(RESTActivity activity) {
		this.activity = activity;
		initGui();
	}
	

	protected void initGui()
	{
		removeAll();
		setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.gridwidth = 2;
		ShadedLabel slConfigurationLabel = new ShadedLabel("Configuration options for this REST service", ShadedLabel.ORANGE);
		add (slConfigurationLabel, c);
		
		c.gridx = 0;
		c.gridwidth = 1;
		c.gridy++;
		c.insets = new Insets(7, 7, 3, 3);
		JLabel labelMethod = new JLabel("HTTP Method:");
		add(labelMethod, c);
		
		// the HTTP method combo-box will always contain the same values - it is the selected
		// method which is important; therefore, can prepopulate as the set of values is known
		c.gridx++;
		c.insets = new Insets(7, 3, 3, 7);
		jcbHTTPMethod = new JComboBox(RESTActivity.HTTP_METHOD.values());
    add(jcbHTTPMethod, c);
		
    c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 0, 3);
		JLabel labelString = new JLabel("URL Signature:");
		labelString.setLabelFor(fieldURLSignature);
		add(labelString, c);
		
		c.gridx++;
		c.insets = new Insets(3, 3, 0, 7);
		fieldURLSignature = new JTextField(50);
		add(fieldURLSignature, c);

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
		
		// safe to cast, as it's the type of values that have been placed there
		configBean.setHttpMethod((RESTActivity.HTTP_METHOD)jcbHTTPMethod.getSelectedItem());
		configBean.setUrlSignature(fieldURLSignature.getText());
	}
	
	
	/**
	 * Update GUI from a changed configuration bean (perhaps by undo/redo).
	 * 
	 */
	@Override
	public void refreshConfiguration() {
		configBean = activity.getConfiguration();
		
		jcbHTTPMethod.setSelectedItem(configBean.getHttpMethod());
		fieldURLSignature.setText(configBean.getUrlSignature());
	}
}
