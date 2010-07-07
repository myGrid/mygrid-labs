package net.sf.taverna.t2.activities.rest.ui.config;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import net.sf.taverna.t2.lang.ui.ShadedLabel;
import net.sf.taverna.t2.workbench.MainWindow;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ActivityConfigurationPanel;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;
import net.sf.taverna.t2.activities.rest.URISignatureHandler;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;
import net.sf.taverna.t2.activities.rest.URISignatureHandler.URISignatureParsingException;


@SuppressWarnings("serial")
public class RESTActivityConfigurationPanel	extends
		ActivityConfigurationPanel<RESTActivity, RESTActivityConfigurationBean>
{
  private static final Icon infoIcon = new ImageIcon(RESTActivityConfigurationPanel.class.getResource("information.png"));
  
	private RESTActivity activity;
	private RESTActivityConfigurationBean configBean;
	
	private RESTActivityConfigurationPanel thisPanel;
	
	private JComboBox cbHTTPMethod;           // HTTP method of this REST activity
	private JTextField tfURLSignature;        // URL signature that determines its input ports
	private JLabel jlContentTypeExplanation;
	private JLabel jlContentTypeExplanationPlaceholder;
	private JLabel jlContentType;
	private JLabel jlContentTypeLabelPlaceholder;  // this placeholder label will take up space of the ContentType combo-box when the latter is not shown
	private JLabel jlContentTypeFieldPlaceholder;
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
		JLabel labelMethod = new JLabel("HTTP Method:", infoIcon, JLabel.LEFT);
		labelMethod.setToolTipText("Select HTTP method from the drop-down menu");
		add(labelMethod, c);
		
		// the HTTP method combo-box will always contain the same values - it is the selected
		// method which is important; therefore, can prepopulate as the set of values is known
		c.gridx++;
		c.insets = new Insets(7, 3, 3, 7);
		cbHTTPMethod = new JComboBox(RESTActivity.HTTP_METHOD.values());
		cbHTTPMethod.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        boolean contentTypeSelEnabled = RESTActivity.hasMessageBodyInputPort((HTTP_METHOD)cbHTTPMethod.getSelectedItem());
        
        jlContentTypeExplanation.setVisible(contentTypeSelEnabled);
        jlContentType.setVisible(contentTypeSelEnabled);
        cbContentType.setVisible(contentTypeSelEnabled);
        jlContentTypeExplanationPlaceholder.setVisible(!contentTypeSelEnabled);
        jlContentTypeLabelPlaceholder.setVisible(!contentTypeSelEnabled);
        jlContentTypeFieldPlaceholder.setVisible(!contentTypeSelEnabled);
      }
    });
    add(cbHTTPMethod, c);
		
    c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 3, 3);
		JLabel labelString = new JLabel("URL Signature:", infoIcon, JLabel.LEFT);
		labelString.setToolTipText("<html>URL signature identifies a template for the URLs that will<br>" +
				                             "be used to access a remote server.<br><br>" +
				                             "URL signature may contain zero or more <b>placeholders</b> - each<br>" +
				                             "enclosed within curly braces <b>\"{\"</b> and <b>\"}\"</b>. An individual input<br>" +
				                             "port will be created in this activity for each placeholder - these<br>" +
				                             "will be used to obtain values during the workflow execution<br>" +
				                             "that will replace the placeholders to form complete URLs.</html>");
		labelString.setLabelFor(tfURLSignature);
		add(labelString, c);
		
		c.gridx++;
		c.insets = new Insets(3, 3, 3, 7);
		tfURLSignature = new JTextField(50);
		add(tfURLSignature, c);
		
		c.gridx = 0;
		c.gridwidth = 2;
    c.gridy++;
    c.insets = new Insets(15, 7, 3, 7);
    JLabel jlAcceptsExplanation = new JLabel("Preferred MIME type for data to be fetched from the remote server --");
    add(jlAcceptsExplanation, c);
    c.gridwidth = 1;
		
		c.gridx = 0;
		c.gridy++;
		c.insets = new Insets(3, 7, 3, 3);
		JLabel jlAccepts = new JLabel("'Accept' header:", infoIcon, JLabel.LEFT);
		jlAccepts.setToolTipText("Select a MIME type from the drop-down menu or type your own");
		jlAccepts.setLabelFor(cbAccepts);
		add(jlAccepts, c);
		
		c.gridx++;
		c.insets = new Insets(3, 3, 3, 7);
		cbAccepts = new JComboBox(RESTActivity.MIME_TYPES);
		cbAccepts.setEditable(true);
		add(cbAccepts, c);
		
		
		c.gridx = 0;
    c.gridwidth = 2;
    c.gridy++;
    c.insets = new Insets(15, 7, 3, 7);
    jlContentTypeExplanation = new JLabel("MIME type of data that will be sent to the remote server --");
    add(jlContentTypeExplanation, c);
    c.gridwidth = 1;
    
		c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 3, 3);
    jlContentType = new JLabel("'Content-Type' header:", infoIcon, JLabel.LEFT);
    jlContentType.setToolTipText("Select a MIME type from the drop-down menu or type your own");
    jlContentType.setLabelFor(cbContentType);
    add(jlContentType, c);
    
    c.gridx++;
    c.insets = new Insets(3, 3, 3, 7);
    cbContentType = new JComboBox(RESTActivity.MIME_TYPES);
    cbContentType.setEditable(true);
    add(cbContentType, c);
    
    
    c.gridx = 0;
    c.gridwidth = 2;
    c.gridy++;
    c.insets = new Insets(15, 7, 3, 7);
    jlContentTypeExplanationPlaceholder = new JLabel();
    jlContentTypeExplanationPlaceholder.setPreferredSize(jlContentTypeExplanation.getPreferredSize());
    add(jlContentTypeExplanationPlaceholder, c);
    c.gridwidth = 1;
    
    c.gridx = 0;
    c.gridy++;
    c.insets = new Insets(3, 7, 3, 3);
    jlContentTypeLabelPlaceholder = new JLabel();
    jlContentTypeLabelPlaceholder.setPreferredSize(jlContentType.getPreferredSize());
    add(jlContentTypeLabelPlaceholder, c);
    
    c.gridx++;
    c.insets = new Insets(3, 3, 3, 7);
    jlContentTypeFieldPlaceholder = new JLabel();
    jlContentTypeFieldPlaceholder.setPreferredSize(cbContentType.getPreferredSize());
    add(jlContentTypeFieldPlaceholder, c);
    
		
		// Populate fields from activity configuration bean
		refreshConfiguration();
	}
	
	
	/**
	 * Check that user values in the UI are valid.
	 */
	@Override
	public boolean checkValues()
	{
	  // HTTP method is a fixed selection combo-box - no validation required
	  
	  // URL signature must be present and be valid
	  String candidateURLSignature = tfURLSignature.getText();
	  if (candidateURLSignature == null || candidateURLSignature.length() == 0) {
	    JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
	        "URL signature must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
	    return (false);
	  }
	  else {
	    try {
	      // test if any exceptions will be thrown - if not, proceed to other validations
	      URISignatureHandler.validate(candidateURLSignature);
	    }
	    catch (URISignatureParsingException e) {
	      JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
	          e.getMessage(), "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
	      return (false);
	    }
	  }
	  
	  // check if Accept header value is at least not empty
	  Object candidateAcceptHeaderValue = cbAccepts.getSelectedItem();
	  if (candidateAcceptHeaderValue == null || ((String)candidateAcceptHeaderValue).length() == 0) {
	    JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
          "Accept header value must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
      return (false);
	  }
	  
	  // check if Content-Type header value is at least not empty - only do this for those HTTP
	  // methods which actually use this value; otherwise, it doesn't really matter, as the value
	  // will not be stored to the bean anyway
	  if (RESTActivity.hasMessageBodyInputPort((RESTActivity.HTTP_METHOD)cbHTTPMethod.getSelectedItem())) {
	    Object candidateContentTypeHeaderValue = cbContentType.getSelectedItem();
	    if (candidateContentTypeHeaderValue == null || ((String)candidateContentTypeHeaderValue).length() == 0) {
	      JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
	          "Content-Type header value must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
	      return (false);
	    }
	  }
	  
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
		
		boolean contentTypeHasNotChanged =
		            (originalContentType == null && ((String)cbContentType.getSelectedItem()).length() == 0)
		            ||
		            (originalContentType != null && originalContentType.equals((String)cbContentType.getSelectedItem()));
		
		// true (changed) unless all fields match the originals
		return ! (originalHTTPMethod == (HTTP_METHOD)cbHTTPMethod.getSelectedItem() &&
		          originalURLSignature.equals(tfURLSignature.getText()) &&
		          originalAcceptsHeaderValue.equals((String)cbAccepts.getSelectedItem()) &&
		          contentTypeHasNotChanged);
	}
	
	
	/**
	 * Prepare a new configuration bean from the UI, to be returned with getConfiguration()
	 */
	@Override
	public void noteConfiguration()
	{
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
	public void refreshConfiguration()
	{
		configBean = activity.getConfiguration();
		
		cbHTTPMethod.setSelectedItem(configBean.getHttpMethod());
		tfURLSignature.setText(configBean.getUrlSignature());
		cbAccepts.setSelectedItem(configBean.getAcceptsHeaderValue());
	  cbContentType.setSelectedItem(configBean.getContentTypeForUpdates());
	}
}
