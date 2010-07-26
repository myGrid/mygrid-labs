package net.sf.taverna.biocatalogue.ui;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.SearchInstance;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.log4j.Logger;

public class SearchOptionsPanel extends JPanel implements ItemListener, KeyListener, CaretListener, HasDefaultFocusCapability
{
  // CONSTANTS
  protected static final int SEARCH_RESULT_LIMIT_MIN = 1;
  protected static final int SEARCH_RESULT_LIMIT_INIT = 20;
  protected static final int SEARCH_RESULT_LIMIT_MAX = 100;
  
  private MainComponent pluginPerspectiveMainComponent;
  private BioCatalogueClient client;
  private Logger logger;
  private ActionListener clickHandler;
  
  // COMPONENTS
  protected JButton bSearch;
  private JTextField tfSearchQuery;
  private JCheckBox cbSearchAllTypes;
  private JCheckBox cbServices;
  private JCheckBox cbServiceProviders;
  private JCheckBox cbUsers;
  private JCheckBox cbRegistries;
  
  // Data
  ArrayList<JCheckBox> alDataTypeCheckboxes;
  
  
  public SearchOptionsPanel(ActionListener actionListener, MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    super();
    
    // set main variables to ensure access to main frame, click handler, logger and API client
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    this.clickHandler = actionListener;
    
    this.initialiseUI();
    
    // this will hold the collection of all checkboxes that correspond to data types (will be used in item event handling)
    alDataTypeCheckboxes = new ArrayList<JCheckBox>(Arrays.asList(new JCheckBox[]{cbServices, cbServiceProviders, cbUsers, cbRegistries})); 
  }
  
  
  private void initialiseUI()
  {
    this.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), " Search Settings "),
        BorderFactory.createEmptyBorder(5, 5, 5, 5)
    ));
    
    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    c.anchor = GridBagConstraints.WEST;
    this.add(new JLabel("Query"), c);
    
    c.gridx = 0;
    c.gridy = 1;
    c.gridwidth = 4;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1.0;
    c.ipady = 6;
    tfSearchQuery = new JTextField();
    tfSearchQuery.setToolTipText(
                    "<html>&nbsp;Tips for creating search queries:<br>" +
                    "&nbsp;1) Use wildcards to make more flexible queries. Asterisk (<b>*</b>) matches any zero or more<br>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;characters (e.g. <b><i>Seq*</i></b> would match <b><i>Sequence</i></b>), question mark (<b>?</b>) matches any single<br>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;character (e.g. <b><i>Bla?t</i></b> would match <b><i>Blast</i></b>).<br>" +
                    "&nbsp;2) Enclose the <b><i>\"search query\"</i></b> in double quotes to make exact phrase matching, otherwise<br>" +
                    "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;items that contain any (or all) words in the <b><i>search query</i></b> will be found.</html>");
    tfSearchQuery.addKeyListener(this);
    tfSearchQuery.addCaretListener(this);
    this.add(tfSearchQuery, c);
    
    c.gridx = 4;
    c.gridy = 1;
    c.gridwidth = 1;
    c.fill = GridBagConstraints.NONE;
    c.weightx = 0;
    c.ipady = 0;
    c.insets = new Insets(0, 5, 0, 0);
    bSearch = new JButton("Search", ResourceManager.getImageIcon(ResourceManager.SEARCH_ICON));
    bSearch.setEnabled(false);      // will be enabled automatically when search query is typed in
    bSearch.setToolTipText(tfSearchQuery.getToolTipText());
    bSearch.addActionListener(this.clickHandler);
    bSearch.addKeyListener(this);
    this.add(bSearch, c);
    
    c.gridx = 0;
    c.gridy = 2;
    c.insets = new Insets(10, 0, 3, 0);
    this.add(new JLabel("Search for..."), c);
    
    c.gridx = 0;
    c.gridy = 3;
    c.gridwidth = 2;
    c.insets = new Insets(0, 0, 0, 0);
    cbSearchAllTypes = new JCheckBox("all resource types", true);
    cbSearchAllTypes.addItemListener(this);
    cbSearchAllTypes.addKeyListener(this);
    this.add(cbSearchAllTypes, c);
    
    c.gridx = 0;
    c.gridy = 4;
    c.gridwidth = 1;
    c.ipady = 0;
    cbServices = new JCheckBox("services", true);
    cbServices.addItemListener(this);
    cbServices.addKeyListener(this);
    this.add(cbServices, c);
    
    c.gridx = 0;
    c.gridy = 5;
    cbServiceProviders = new JCheckBox("service providers", true);
    cbServiceProviders.addItemListener(this);
    cbServiceProviders.addKeyListener(this);
    this.add(cbServiceProviders, c);
    
    c.gridx = 1;
    c.gridy = 4;
    cbUsers = new JCheckBox("users", true);
    cbUsers.addItemListener(this);
    cbUsers.addKeyListener(this);
    this.add(cbUsers, c);
    
    c.gridx = 1;
    c.gridy = 5;
    cbRegistries = new JCheckBox("registries", true);
    cbRegistries.addItemListener(this);
    cbRegistries.addKeyListener(this);
    this.add(cbRegistries, c);
  }
  
  
  /**
   * Uses search instance's settings to restore the state of the search options panel.
   * This is useful when a search from history / favourites is started or
   * when the previous search is being re-run. 
   */
  public void restoreState(SearchInstance si)
  {
    // a quick check to make sure that we possess a valid SearchInstance object
    if (si.getSearchType() == SearchInstance.QUERY_SEARCH) {
      tfSearchQuery.setText(si.getSearchString());
      cbServices.setSelected(si.getSearchServices());
      cbServiceProviders.setSelected(si.getSearchServiceProviders());
      cbUsers.setSelected(si.getSearchUsers());
      cbRegistries.setSelected(si.getSearchRegistries());
      
      // TODO - check if 'all' should be selected too (currently seems to happen automatically,
      // because of ItemListener interface handler).
    }
  }
  
  
  /**
   * Saves the current state of the search options into a single SearchInstance object.
   */
  public SearchInstance getState()
  {
    return (new SearchInstance(getSearchQuery(),
                               getSearchServices(),
                               getSearchServiceProviders(),
                               getSearchUsers(),
                               getSearchRegistries()
           ));
  }
  
  
  public String getSearchQuery()
  {
    return (this.tfSearchQuery.getText().trim());
  }
  
  public void setSearchQuery(String strSearchQuery)
  {
    this.tfSearchQuery.setText(strSearchQuery);
  }
  
  public void setSearchAllResourceTypes(boolean bSearchAllTypes)
  {
    this.cbSearchAllTypes.setSelected(bSearchAllTypes);
  }
  
  public boolean getSearchServices()
  {
    return (this.cbServices.isSelected());
  }
  
  public void setSearchServices(boolean bSearchServices)
  {
    this.cbServices.setSelected(bSearchServices);
  }
  
  public boolean getSearchServiceProviders()
  {
    return (this.cbServiceProviders.isSelected());
  }
  
  public void setSearchServiceProviders(boolean bSearchServiceProviders)
  {
    this.cbServiceProviders.setSelected(bSearchServiceProviders);
  }
  
  public boolean getSearchUsers()
  {
    return (this.cbUsers.isSelected());
  }
  
  public void setSearchUsers(boolean bSearchUsers)
  {
    this.cbUsers.setSelected(bSearchUsers);
  }

  public boolean getSearchRegistries()
  {
    return (this.cbRegistries.isSelected());
  }
  
  public void setSearchRegistries(boolean bSearchRegistries)
  {
    this.cbRegistries.setSelected(bSearchRegistries);
  }
  
  
  // *** Callback for ItemListener interface ***
  
  /**
   * this monitors all checkbox clicks and selects / deselects other checkboxes which are relevant
   */
  public void itemStateChanged(ItemEvent e)
  {
    if (e.getItemSelectable().equals(this.cbSearchAllTypes))
    {
      // "all resource types" clicked - need to select / deselect all data type checkboxes accordingly
      for (JCheckBox cb : this.alDataTypeCheckboxes) {
        cb.removeItemListener(this);
        cb.setSelected(this.cbSearchAllTypes.isSelected());
        cb.addItemListener(this);
      }
      
      // also, enable / disable the search button
      this.bSearch.setEnabled(this.cbSearchAllTypes.isSelected() && getSearchQuery().length() > 0);
    }
    else if (this.alDataTypeCheckboxes.contains(e.getItemSelectable())) {
      // one of the checkboxes for data types was clicked (e.g. workflows, files, etc);
      // need to calculate how many of those are currently selected
      int iSelectedCnt = 0;
      for (JCheckBox cb : this.alDataTypeCheckboxes) {
        if (cb.isSelected()) iSelectedCnt++;
      }
      
      // if all are selected, tick "search all types" checkbox; uncheck otherwise
      this.cbSearchAllTypes.removeItemListener(this);
      this.cbSearchAllTypes.setSelected(iSelectedCnt == this.alDataTypeCheckboxes.size());
      this.cbSearchAllTypes.addItemListener(this);
      
      // enable search button if at least one data type is selected and search query is present; disable otherwise
      this.bSearch.setEnabled(iSelectedCnt > 0 && getSearchQuery().length() > 0);
    }
  }
  
  
  // *** Callbacks for KeyListener interface ***
  
  public void keyPressed(KeyEvent e)
  {
    // ENTER pressed - start search by simulating "search" button click
    // (only do this if the "search" button was active at that moment)
    if (e.getKeyCode() == KeyEvent.VK_ENTER && this.bSearch.isEnabled() && 
        (Arrays.asList(new JComponent[] {this.tfSearchQuery, this.bSearch, this.cbSearchAllTypes}).contains(e.getSource()) ||
        this.alDataTypeCheckboxes.contains(e.getSource())))
    {    
      this.clickHandler.actionPerformed(new ActionEvent(this.bSearch, 0, ""));
    }
  }


  public void keyReleased(KeyEvent e)
  {
    // do nothing
  }


  public void keyTyped(KeyEvent e)
  {
    // do nothing
  }
  
  
  
  // *** Callbacks for HasDefaultFocusCapability interface ***
  
  public void focusDefaultComponent() {
    this.tfSearchQuery.selectAll();
    this.tfSearchQuery.requestFocusInWindow();
  }
  
  public Component getDefaultComponent() {
    return(this.tfSearchQuery);
  }
  
  
  // *** Callback for CaretListener ***
  
  public void caretUpdate(CaretEvent e) {
    if (e.getSource().equals(tfSearchQuery))
    {
      int iSelectedCnt = 0;
      for (JCheckBox cb : this.alDataTypeCheckboxes) {
        if (cb.isSelected()) iSelectedCnt++;
      }
      
      // enable search button if at least one data type is selected and search query is present; disable otherwise
      this.bSearch.setEnabled(iSelectedCnt > 0 && getSearchQuery().length() > 0);
    }
  }
  
  
}
