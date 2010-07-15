package net.sf.taverna.t2.activities.rest.ui.view;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.lowagie.text.Font;

import net.sf.taverna.t2.workbench.ui.views.contextualviews.ContextualView;

import net.sf.taverna.t2.activities.rest.RESTActivity;
import net.sf.taverna.t2.activities.rest.RESTActivityConfigurationBean;
import net.sf.taverna.t2.activities.rest.ui.config.RESTActivityConfigureAction;

@SuppressWarnings("serial")
public class RESTActivityMainContextualView extends ContextualView
{
	private final RESTActivity activity;
	
	private JTextField tfHTTPMethod;
	private JTextField tfURLSignature;
	private JTextField tfAcceptHeader;
	private JTextField tfContentTypeHeader;
	
	
	public RESTActivityMainContextualView(RESTActivity activity) {
		this.activity = activity;
		initView();
	}
	
	
	@Override
	public JComponent getMainFrame()
	{
		JPanel jpMainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weighty = 0;
		
		
		c.weightx = 1.0;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 2;
		c.anchor = GridBagConstraints.NORTH;
		JLabel jlTitle = new JLabel("REST Service Details", JLabel.CENTER);
		jlTitle.setFont(jlTitle.getFont().deriveFont(Font.BOLD));
		jpMainPanel.add(jlTitle, c);
		c.gridwidth = 1;
		c.weightx = 0;
		c.anchor = GridBagConstraints.WEST;
		
		c.gridx = 0;
		c.gridy++;
		JLabel jlHTTPMethod = new JLabel("HTTP Method:");
		jlHTTPMethod.setFont(jlHTTPMethod.getFont().deriveFont(Font.BOLD));
		jpMainPanel.add(jlHTTPMethod, c);
		
		c.gridx++;
		tfHTTPMethod = new JTextField();
		tfHTTPMethod.setEditable(false);
		jpMainPanel.add(tfHTTPMethod, c);
		
		
		c.gridx = 0;
		c.gridy++;
		JLabel jlURLSignature = new JLabel("URL Signature:");
		jlURLSignature.setFont(jlURLSignature.getFont().deriveFont(Font.BOLD));
		jpMainPanel.add(jlURLSignature, c);
		
		c.gridx++;
    tfURLSignature = new JTextField(20);
    tfURLSignature.setEditable(false);
    jpMainPanel.add(tfURLSignature, c);
		
    
    c.gridx = 0;
    c.gridy++;
		JLabel jlAcceptHeader = new JLabel("'Accept' header:");
		jlAcceptHeader.setFont(jlAcceptHeader.getFont().deriveFont(Font.BOLD));
		jpMainPanel.add(jlAcceptHeader, c);
		
		c.gridx++;
    tfAcceptHeader = new JTextField();
    tfAcceptHeader.setEditable(false);
    jpMainPanel.add(tfAcceptHeader, c);
		
		
//		tfContentTypeHeader = new JTextField();
		
    
		// populate the view with values
		refreshView();
		
		return jpMainPanel;
	}

	@Override
	/**
	 * This is the title of the contextual view - shown in the list of other available
	 * views (even when this contextual view is collapsed).
	 */
	public String getViewTitle() {
		RESTActivityConfigurationBean configuration = activity.getConfiguration();
		return "REST Service - Processor Details";
	}

	/**
	 * Typically called when the activity configuration has changed.
	 */
	@Override
	public void refreshView()
	{
		RESTActivityConfigurationBean configuration = activity.getConfiguration();
		
		tfHTTPMethod.setText("" + configuration.getHttpMethod());
		tfURLSignature.setText(configuration.getUrlSignature());
		tfAcceptHeader.setText(configuration.getAcceptsHeaderValue());
	}

	/**
	 * View position hint
	 */
	@Override
	public int getPreferredPosition() {
		// want to be on top, as it's the main contextual view for this activity
		return 100;
	}
	
	@Override
	public Action getConfigureAction(final Frame owner) {
	  // "Configure" button appears because of this action being returned
		return new RESTActivityConfigureAction(activity, owner);
	}

}
