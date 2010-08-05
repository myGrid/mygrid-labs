package net.sf.taverna.t2.activities.xpath.ui.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import net.sf.taverna.t2.lang.ui.ShadedLabel;
import net.sf.taverna.t2.workbench.MainWindow;
import net.sf.taverna.t2.workbench.ui.views.contextualviews.activity.ActivityConfigurationPanel;

import net.sf.taverna.t2.activities.xpath.XPathActivity;
import net.sf.taverna.t2.activities.xpath.XPathActivityConfigurationBean;


@SuppressWarnings("serial")
/**
 * 
 * @author Sergejs Aleksejevs
 */
public class XPathActivityConfigurationPanelProvider	extends
		ActivityConfigurationPanel<XPathActivity, XPathActivityConfigurationBean>
{
	private XPathActivity activity;
	private XPathActivityConfigurationBean configBean;
	
	private XPathActivityConfigurationPanel configPanel;
	
	
	public XPathActivityConfigurationPanelProvider(XPathActivity activity) {
		this.activity = activity;
		initGui();
	}
	

	protected void initGui()
	{
		removeAll();
		setLayout(new BorderLayout());
		
		// create view title
		ShadedLabel slConfigurationLabel = new ShadedLabel("Configuration options for this XPath service", ShadedLabel.ORANGE);
    JPanel jpConfigurationLabel = new JPanel(new GridLayout(1,1));
    jpConfigurationLabel.add(slConfigurationLabel);
    jpConfigurationLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
    add(jpConfigurationLabel, BorderLayout.NORTH);
    
    // create actual contents of the config panel
    this.configPanel = new XPathActivityConfigurationPanel();
    add(configPanel, BorderLayout.CENTER);
		
    // set preferred size for the panel (otherwise it will be way too small)
    this.setMinimumSize(new Dimension(800, 600));
    this.setPreferredSize(new Dimension(950, 650));
    
		// Populate fields from activity configuration bean
		refreshConfiguration();
	}
	
	
	
	
	
	/**
	 * Check that user values in the UI are valid.
	 */
	@Override
	public boolean checkValues()
	{
//	  // HTTP method is a fixed selection combo-box - no validation required
//	  
//	  // URL signature must be present and be valid
//	  String candidateURLSignature = tfURLSignature.getText().trim();
//	  if (candidateURLSignature == null || candidateURLSignature.length() == 0) {
//	    JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
//	        "URL signature must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
//	    return (false);
//	  }
//	  else {
//	    try {
//	      // test if any exceptions will be thrown - if not, proceed to other validations
//	      URISignatureHandler.validate(candidateURLSignature);
//	    }
//	    catch (URISignatureParsingException e) {
//	      JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
//	          e.getMessage(), "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
//	      return (false);
//	    }
//	  }
//	  
//	  // check if Accept header value is at least not empty
//	  Object candidateAcceptHeaderValue = cbAccepts.getSelectedItem();
//	  if (candidateAcceptHeaderValue == null || ((String)candidateAcceptHeaderValue).length() == 0) {
//	    JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
//          "Accept header value must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
//      return (false);
//	  }
//	  
//	  // check if Content-Type header value is at least not empty - only do this for those HTTP
//	  // methods which actually use this value; otherwise, it doesn't really matter, as the value
//	  // will not be stored to the bean anyway
//	  if (RESTActivity.hasMessageBodyInputPort((RESTActivity.HTTP_METHOD)cbHTTPMethod.getSelectedItem())) {
//	    Object candidateContentTypeHeaderValue = cbContentType.getSelectedItem();
//	    if (candidateContentTypeHeaderValue == null || ((String)candidateContentTypeHeaderValue).length() == 0) {
//	      JOptionPane.showMessageDialog(MainWindow.getMainWindow(),
//	          "Content-Type header value must not be empty", "REST Activity Configuration - Warning", JOptionPane.WARNING_MESSAGE);
//	      return (false);
//	    }
//	  }
	  
		// All valid, return true
		return true;
	}
	
	
	/**
	 * Return configuration bean generated from user interface last time
	 * noteConfiguration() was called.
	 */
	@Override
	public XPathActivityConfigurationBean getConfiguration() {
		// Should already have been made by noteConfiguration()
		return configBean;
	}
	
	
	/**
	 * Check if the user has changed the configuration from the original
	 */
	@Override
	public boolean isConfigurationChanged()
	{
//	  HTTP_METHOD originalHTTPMethod = configBean.getHttpMethod();
//		String originalURLSignature = configBean.getUrlSignature();
//		String originalAcceptsHeaderValue = configBean.getAcceptsHeaderValue();
//		String originalContentType = configBean.getContentTypeForUpdates();
//		DATA_FORMAT originalOutgoingDataFormat = configBean.getOutgoingDataFormat();
//		boolean originalSendHTTPExpectRequestHeader = configBean.getSendHTTPExpectRequestHeader();
//		boolean originalShowRedirectionOutputPort = configBean.getShowRedirectionOutputPort();
//		
//		boolean contentTypeHasNotChanged =
//		            (originalContentType == null && ((String)cbContentType.getSelectedItem()).length() == 0)
//		            ||
//		            (originalContentType != null && originalContentType.equals((String)cbContentType.getSelectedItem()));
//		
//		// true (changed) unless all fields match the originals
//		return ! (originalHTTPMethod == (HTTP_METHOD)cbHTTPMethod.getSelectedItem() &&
//		          originalURLSignature.equals(tfURLSignature.getText()) &&
//		          originalAcceptsHeaderValue.equals((String)cbAccepts.getSelectedItem()) &&
//		          contentTypeHasNotChanged &&
//		          originalOutgoingDataFormat == (DATA_FORMAT)cbSendDataAs.getSelectedItem() &&
//		          originalSendHTTPExpectRequestHeader == cbSendHTTPExpectHeader.isSelected() &&
//		          originalShowRedirectionOutputPort == cbShowRedirectionOutputPort.isSelected());
	  return false;
	}
	
	
	/**
	 * Prepare a new configuration bean from the UI, to be returned with getConfiguration()
	 */
	@Override
	public void noteConfiguration()
	{
//	  configBean = new RESTActivityConfigurationBean();
//		
//		// safe to cast, as it's the type of values that have been placed there
//		configBean.setHttpMethod((RESTActivity.HTTP_METHOD)cbHTTPMethod.getSelectedItem());
//		configBean.setUrlSignature(tfURLSignature.getText().trim());
//		configBean.setAcceptsHeaderValue((String)cbAccepts.getSelectedItem());
//	  configBean.setContentTypeForUpdates((String)cbContentType.getSelectedItem());
//	  configBean.setOutgoingDataFormat((DATA_FORMAT)cbSendDataAs.getSelectedItem());
//	  configBean.setSendHTTPExpectRequestHeader(cbSendHTTPExpectHeader.isSelected());
//	  configBean.setShowRedirectionOutputPort(cbShowRedirectionOutputPort.isSelected());
	}
	
	
	/**
	 * Update GUI from a changed configuration bean (perhaps by undo / redo).
	 */
	@Override
	public void refreshConfiguration()
	{
//		configBean = activity.getConfiguration();
//		
//		cbHTTPMethod.setSelectedItem(configBean.getHttpMethod());
//		tfURLSignature.setText(configBean.getUrlSignature());
//		cbAccepts.setSelectedItem(configBean.getAcceptsHeaderValue());
//	  cbContentType.setSelectedItem(configBean.getContentTypeForUpdates());
//	  cbSendDataAs.setSelectedItem(configBean.getOutgoingDataFormat());
//	  cbSendHTTPExpectHeader.setSelected(configBean.getSendHTTPExpectRequestHeader());
//	  cbShowRedirectionOutputPort.setSelected(configBean.getShowRedirectionOutputPort());
	}
}
