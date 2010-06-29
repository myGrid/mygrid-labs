package net.sf.taverna.t2.activities.rest.ui.config;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.codemodel.internal.JOp;

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
	
	private RESTActivityConfigurationPanel thisPanel;
	
	private JComboBox cbHTTPMethod;           // HTTP method of this REST activity
	private JTextField tfURLSignature;        // URL signature that determines its input ports
	private JLabel jlContentType;
	private JLabel jlContentTypePlaceholder;  // this placeholder label will take up space of the ContentType combo-box when the latter is not shown
	private JComboBox cbContentType;          // for MIME type of data sent to the server by POST / PUT methods
	private JComboBox cbAccepts;              // for Accepts header
	

	public RESTActivityConfigurationPanel(RESTActivity activity) {
	  this.thisPanel = this;
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
		cbHTTPMethod = new JComboBox(RESTActivity.HTTP_METHOD.values());
		cbHTTPMethod.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        boolean contentTypeSelEnabled = RESTActivity.hasMessageBodyInputPort((HTTP_METHOD)cbHTTPMethod.getSelectedItem());
        
        jlContentType.setVisible(contentTypeSelEnabled);
        cbContentType.setVisible(contentTypeSelEnabled);
        jlContentTypePlaceholder.setVisible(!contentTypeSelEnabled);
      }
    });
    add(cbHTTPMethod, c);
		
    c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 3, 3);
		JLabel labelString = new JLabel("URL Signature:");
		labelString.setLabelFor(tfURLSignature);
		add(labelString, c);
		
		c.gridx++;
		c.insets = new Insets(3, 3, 3, 7);
		tfURLSignature = new JTextField(50);
		add(tfURLSignature, c);
		
		c.gridx = 0;
		c.gridy++;
		c.insets = new Insets(3, 7, 3, 3);
		JLabel jlAccepts = new JLabel("Accepts:");
		jlAccepts.setLabelFor(cbAccepts);
		add(jlAccepts, c);
		
		c.gridx++;
		c.insets = new Insets(3, 3, 3, 7);
		cbAccepts = new JComboBox(RESTActivity.MIME_TYPES);
		cbAccepts.setEditable(true);
		add(cbAccepts, c);
		
		c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 3, 3);
    jlContentType = new JLabel("ContentType:");
    jlContentType.setLabelFor(cbContentType);
    add(jlContentType, c);
    
    c.gridx++;
    c.insets = new Insets(3, 3, 3, 7);
    cbContentType = new JComboBox(RESTActivity.MIME_TYPES);
    cbContentType.setEditable(true);
    add(cbContentType, c);
    
    c.gridx = 1;
    c.gridy++;
    c.insets = new Insets(3, 3, 3, 7);
    jlContentTypePlaceholder = new JLabel();
    jlContentTypePlaceholder.setPreferredSize(cbContentType.getPreferredSize());
    add(jlContentTypePlaceholder, c);
    
		
		// Populate fields from activity configuration bean
		refreshConfiguration();
	}
	
	
	/**
	 * Check that user values in UI are valid
	 */
	@Override
	public boolean checkValues()
	{
	  // TODO - check URL signature is not blank
	  // TODO - check values; especially, validity of the URL signature
	  // TODO - check ACCEPT / ContentType are not blank
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
	public boolean isConfigurationChanged()
	{
	  HTTP_METHOD originalHTTPMethod = configBean.getHttpMethod();
		String originalURLSignature = configBean.getUrlSignature();
		String originalAcceptsHeaderValue = configBean.getAcceptsHeaderValue();
		String originalContentType = configBean.getContentTypeForUpdates();
		
		// true (changed) unless all fields match the originals
		return ! (originalHTTPMethod == (HTTP_METHOD)cbHTTPMethod.getSelectedItem() &&
		          originalURLSignature.equals(tfURLSignature.getText()) &&
		          originalAcceptsHeaderValue.equals((String)cbAccepts.getSelectedItem()) &&
		          originalContentType.equals((String)cbContentType.getSelectedItem()));
	}
	
	
	/**
	 * Prepare a new configuration bean from the UI, to be returned with getConfiguration()
	 */
	@Override
	public void noteConfiguration() {
		configBean = new RESTActivityConfigurationBean();
		
		// safe to cast, as it's the type of values that have been placed there
		configBean.setHttpMethod((RESTActivity.HTTP_METHOD)cbHTTPMethod.getSelectedItem());
		configBean.setUrlSignature(tfURLSignature.getText());
		configBean.setAcceptsHeaderValue((String)cbAccepts.getSelectedItem());
		configBean.setContentTypeForUpdates((String)cbContentType.getSelectedItem());
	}
	
	
	/**
	 * Update GUI from a changed configuration bean (perhaps by undo / redo).
	 */
	@Override
	public void refreshConfiguration() {
		configBean = activity.getConfiguration();
		
		cbHTTPMethod.setSelectedItem(configBean.getHttpMethod());
		tfURLSignature.setText(configBean.getUrlSignature());
		cbAccepts.setSelectedItem(configBean.getAcceptsHeaderValue());
		cbContentType.setSelectedItem(configBean.getContentTypeForUpdates());
	}
}
