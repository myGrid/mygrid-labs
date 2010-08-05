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

import org.apache.commons.io.output.NullWriter;

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
		
    // place the whole configuration panel into a raised area, so that
    // automatically added 'Apply' / 'Close' buttons visually apply to
    // the whole of the panel, not just part of it
    this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(12, 12, 2, 12), BorderFactory.createRaisedBevelBorder()));
    
    
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
	  // the only validity condition is the correctness of the XPath expression --
	  // so checking that
		return (XPathActivityConfigurationBean.validateXPath(
		    this.configPanel.getCurrentXPathExpression()) == XPathActivityConfigurationBean.XPATH_VALID);
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
	  boolean xmlDocumentHasNotChanged =
	              (configPanel.getCurrentXMLTree() == null && configBean.getXmlDocument() == null)
	              ||
	              (configPanel.getCurrentXMLTree() != null && configBean.getXmlDocument() != null &&
	               configPanel.getCurrentXMLTree().getDocumentUsedToPopulateTree().asXML().equals(configBean.getXmlDocument().asXML()));
	  boolean xpathExpressionHasNotChanged = configPanel.getCurrentXPathExpression().equals(configBean.getXpathExpression());
	  boolean xpathNamespaceMapHasNotChanged = configPanel.getCurrentXPathNamespaceMap().equals(configBean.getXpathNamespaceMap());
	  
		// true (changed) unless all fields match the originals
		return ! (xmlDocumentHasNotChanged && xpathExpressionHasNotChanged && xpathNamespaceMapHasNotChanged);
	}
	
	
	/**
	 * Prepare a new configuration bean from the UI, to be returned with getConfiguration()
	 */
	@Override
	public void noteConfiguration()
	{
	  configBean = new XPathActivityConfigurationBean();
	  
	  if (configPanel.getCurrentXMLTree() != null) {
	    configBean.setXmlDocument(configPanel.getCurrentXMLTree().getDocumentUsedToPopulateTree());
	  }
	  configBean.setXpathExpression(configPanel.getCurrentXPathExpression());
	  configBean.setXpathNamespaceMap(configPanel.getCurrentXPathNamespaceMap());
	}
	
	
	/**
	 * Update GUI from a changed configuration bean (perhaps by undo / redo).
	 */
	@Override
	public void refreshConfiguration()
	{
		configBean = activity.getConfiguration();
		
		if (configBean.getXmlDocument() != null) {
		  configPanel.setSourceXML(configBean.getXmlDocument().asXML());
		  configPanel.parseXML();
		}
		
		configPanel.setCurrentXPathExpression(configBean.getXpathExpression());
		
		configPanel.setCurrentXPathNamespaceMapValues(configBean.getXpathNamespaceMap());
		configPanel.reloadNamespaceMappingTableFromLocalMap();
	}
}
