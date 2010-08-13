package net.sf.taverna.biocatalogue.ui;

import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.biocatalogue.ui.BioCatalogueExplorationTab.RESOURCE_TYPE;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.log4j.Logger;

public class SearchOptionsPanel extends JPanel implements HasDefaultFocusCapability
{
  // COMPONENTS
  private JToggleButton bSearchForTypes;
  private Popup searchTypesMenu;
  private JPanel jpSearchTypesMenuContents;
  private long searchTypesMenuLastShownAt;
  private JTextField tfSearchQuery;
  private JButton bSearch;
  private JClickableLabel jclChooseTag;
  
  private LinkedHashMap<RESOURCE_TYPE, JCheckBoxMenuItem> searchTypeMenuItems;
  
  
  public SearchOptionsPanel()
  {
    super();
    
    this.searchTypeMenuItems = new LinkedHashMap<BioCatalogueExplorationTab.RESOURCE_TYPE,JCheckBoxMenuItem>();
    
    this.initialiseUI();
  }
  
  
  private void initialiseUI()
  {
    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    this.add(new JLabel("Search for:"), c);
    
    
    // ---- POPUP MENU FOR SELECTION OF AVAILABLE RESOURCE TYPES ----    
    
    jpSearchTypesMenuContents = new JPanel();
    jpSearchTypesMenuContents.setBorder(BorderFactory.createRaisedBevelBorder());
    jpSearchTypesMenuContents.setLayout(new BoxLayout(jpSearchTypesMenuContents, BoxLayout.Y_AXIS));
    
    // register this panel to be the listener of all AWT mouse event - this will be used
    // to identify clicks outside of the overlay component and hide the overlay if it is visible
    Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
              public void eventDispatched(AWTEvent event)
              {
                if (event instanceof MouseEvent && searchTypesMenu != null) {
                  MouseEvent e = (MouseEvent) event;
                  if (e.getClickCount() > 0 && (e.getWhen() - searchTypesMenuLastShownAt) > 100) {
                    // convert a point where mouse click was made from relative coordinates of the source component
                    // to the coordinates of the overlaySplitPane
                    Point clickRelativeToOverlay = SwingUtilities.convertPoint((Component)e.getSource(), e.getPoint(), jpSearchTypesMenuContents);
                    
                    
                    Area areaOfPopupPanelAndToggleButton = new Area(jpSearchTypesMenuContents.getBounds());
                    
                    // only hide the overlay if a click was made outside of the calculated area --
                    // plus not on one of the associated toggle buttons
                    if (!areaOfPopupPanelAndToggleButton.contains(clickRelativeToOverlay)) {
                      searchTypesMenu.hide();
                      bSearchForTypes.setSelected(false);
                      
                      // if the popup menu was dismissed by a click on the toggle button that
                      // has made it visible, this timer makes sure that this click doesn't
                      // re-show the popup menu
                      new Timer(100, new ActionListener() {
                        public void actionPerformed(ActionEvent e)
                        {
                          ((Timer)e.getSource()).stop();
                          searchTypesMenu = null;
                        }
                      }).start();
                        
                      
                    }
                  }
                }
              }
            }, AWTEvent.MOUSE_EVENT_MASK);
    
    
    // dynamic population of resource types available for search
    for (RESOURCE_TYPE t : RESOURCE_TYPE.values())
    {
      final RESOURCE_TYPE type = t;
      final JCheckBoxMenuItem mi = new JCheckBoxMenuItem(type.getCollectionName());
      mi.setSelected(type.isDefaultSearchType());
      mi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          // enable / disable the relevant tab - but only if this is not the last tab which is shown
          if (!mi.isSelected() && getNumberOfTypesToSearchFor() <= 1) {
            mi.setSelected(true);
          }
          else {
            JOptionPane.showMessageDialog(null, "SearchOptionsPanel -- dynamic population of resource types available for search");
            // FIXME - should do something about the tabs here
//            toggleResultTabsInMap(type, mi.isSelected());
//            reloadResultTabsFromMap();
            
            updateSearchTypeSelectionButtonLabel();
          }
        }
      });
      jpSearchTypesMenuContents.add(mi);
      searchTypeMenuItems.put(type, mi);
    }
    
    // --- Attach popup menu to the toggle button ---
    
    c.gridx++;
    c.insets = new Insets(0, 7, 0, 0);
    bSearchForTypes = new JToggleButton("Search for types...", ResourceManager.getImageIcon(ResourceManager.UNFOLD_ICON));
    bSearchForTypes.setSelectedIcon(ResourceManager.getImageIcon(ResourceManager.FOLD_ICON));
    bSearchForTypes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) 
      {
        if (searchTypesMenu == null) {
          searchTypesMenuLastShownAt = System.currentTimeMillis();
          
          Point parentPosition = bSearchForTypes.getLocationOnScreen();
          searchTypesMenu = PopupFactory.getSharedInstance().getPopup(bSearchForTypes, jpSearchTypesMenuContents,
              parentPosition.x, parentPosition.y + bSearchForTypes.getHeight());
          searchTypesMenu.show();
        }
        else {
          bSearchForTypes.setSelected(false);
        }
      }
    });
    updateSearchTypeSelectionButtonLabel();  // dynamic loading of available / default search types is done by now - update the label of this button accordingly
    this.add(bSearchForTypes, c);
    
    
    // --- Text field for search queries ---
    
    c.gridx++;
    c.weightx = 1.0;
    c.fill = GridBagConstraints.HORIZONTAL;
    this.tfSearchQuery = new JTextField(30);
    this.tfSearchQuery.setToolTipText(
        "<html>&nbsp;Tips for creating search queries:<br>" +
        "&nbsp;1) Use wildcards to make more flexible queries. Asterisk (<b>*</b>) matches any zero or more<br>" +
        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;characters (e.g. <b><i>Seq*</i></b> would match <b><i>Sequence</i></b>), question mark (<b>?</b>) matches any single<br>" +
        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;character (e.g. <b><i>Bla?t</i></b> would match <b><i>Blast</i></b>).<br>" +
        "&nbsp;2) Enclose the <b><i>\"search query\"</i></b> in double quotes to make exact phrase matching, otherwise<br>" +
        "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;items that contain any (or all) words in the <b><i>search query</i></b> will be found.</html>");
    this.tfSearchQuery.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        tfSearchQuery.selectAll();
      }
      public void focusLost(FocusEvent e) { /* do nothing */ }
    });
    this.tfSearchQuery.addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        // ENTER pressed - start search by simulating "search" button click
        // (only do this if the "search" button was active at that moment)
        if (e.getKeyCode() == KeyEvent.VK_ENTER && bSearch.isEnabled()) {    
          bSearch.doClick();
        }
      }
    });
    this.tfSearchQuery.addCaretListener(new CaretListener() {
      public void caretUpdate(CaretEvent e) {
        // enable search button if search query is present; disable otherwise
        bSearch.setEnabled(getSearchQuery().length() > 0);
      }
    });
    this.add(tfSearchQuery, c);
    
    
    // --- Search button ---
    
    c.gridx++;
    c.weightx = 0;
    c.fill = GridBagConstraints.NONE;
    this.bSearch = new JButton("Search");
    this.bSearch.setEnabled(false);      // will be enabled automatically when search query is typed in
    this.bSearch.setToolTipText(tfSearchQuery.getToolTipText());
    this.bSearch.setPreferredSize(new Dimension(bSearch.getPreferredSize().width * 2, bSearch.getPreferredSize().height));
    this.bSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "SEARCH NOT IMPLEMENTED YET!!!");
        
        // TODO - start search
//        if (getSearchQuery().length() == 0) {
//          JOptionPane.showMessageDialog(null, "Please specify your search query", "Search - No search query", JOptionPane.WARNING_MESSAGE);
//          this.searchOptionsPanel.focusDefaultComponent();
//        }
//        else {
//        // search query available - collect data about the current search and execute it
//        searchResultsMainPanel.startNewSearch(searchOptionsPanel.getState());
//        }
      }
    });
    this.add(bSearch, c);
    
    
    // --- Clickable label that invokes tag cloud selection dialog ---
    
    c.gridx = 2;
    c.gridy++;
    c.weightx = 0;
    c.anchor = GridBagConstraints.WEST;
    this.jclChooseTag = new JClickableLabel("Choose tag...", "strDataForAction", new ActionListener() {  // TODO - set up constant for this "strDataForAction"
      public void actionPerformed(ActionEvent e) {
        TagSelectionDialog tagSelectionDialog = new TagSelectionDialog();
        tagSelectionDialog.setVisible(true);
      }
    });
    this.add(jclChooseTag, c);
  }
  
  
  /**
   * Updates the label of the toggle button that is used
   * to bring up a popup menu for selecting resource types
   * to search for.
   * 
   * The label consists of comma-separated names of all
   * item types that will be searched for.
   */
  private void updateSearchTypeSelectionButtonLabel()
  {
    List<String> searchTypeNames = new ArrayList<String>();
    
    for (RESOURCE_TYPE type : this.searchTypeMenuItems.keySet()) {
      JCheckBoxMenuItem mi = this.searchTypeMenuItems.get(type);
      if (mi.isSelected()) {
        searchTypeNames.add(type.getCollectionName());
      }
    }
    this.bSearchForTypes.setText(Util.join(searchTypeNames, ", "));
  }
  
  
  /**
   * @return Number of different resource types that will be searched for.<br/>
   *         E.g. if the user has selected to search for SOAP operations and
   *         web services, the return value will be 2.
   */
  public int getNumberOfTypesToSearchFor() 
  {
    int iCount = 0;
    for (JCheckBoxMenuItem mi : this.searchTypeMenuItems.values()) {
      if (mi.isSelected()) {
        iCount++;
      }
    }
    
    return (iCount);
  }
  
  
  // *** GETTING AND RESTORING STATE OF THE SEARCH PANEL ***
  
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
      searchTypeMenuItems.get(RESOURCE_TYPE.SOAPOperation).setSelected(si.getSearchSOAPOperations());
      searchTypeMenuItems.get(RESOURCE_TYPE.RESTMethod).setSelected(si.getSearchRESTMethods());
      searchTypeMenuItems.get(RESOURCE_TYPE.Service).setSelected(si.getSearchServices());
      searchTypeMenuItems.get(RESOURCE_TYPE.ServiceProvider).setSelected(si.getSearchServiceProviders());
      searchTypeMenuItems.get(RESOURCE_TYPE.User).setSelected(si.getSearchUsers());
    }
  }
  
  
  /**
   * Saves the current state of the search options into a single SearchInstance object.
   */
  public SearchInstance getState()
  {
    return (new SearchInstance(getSearchQuery(),
                               getSearchSOAPOperations(),
                               getSearchRESTMethods(),
                               getSearchServices(),
                               getSearchServiceProviders(),
                               getSearchUsers()
           ));
  }
  
  
  // *** GETTERS AND SETTERS ***
  
  public String getSearchQuery() {
    return (this.tfSearchQuery.getText().trim());
  }
  public void setSearchQuery(String strSearchQuery) {
    this.tfSearchQuery.setText(strSearchQuery);
  }
  
  public boolean getSearchSOAPOperations() {
    return (searchTypeMenuItems.get(RESOURCE_TYPE.SOAPOperation).isSelected());
  }
  public void setSearchSOAPOperations(boolean bSearchSOAPOperations) {
    this.searchTypeMenuItems.get(RESOURCE_TYPE.SOAPOperation).setSelected(bSearchSOAPOperations);
  }
  
  public boolean getSearchRESTMethods() {
    return (searchTypeMenuItems.get(RESOURCE_TYPE.RESTMethod).isSelected());
  }
  public void setSearchRESTMethods(boolean bSearchRESTMethods) {
    this.searchTypeMenuItems.get(RESOURCE_TYPE.RESTMethod).setSelected(bSearchRESTMethods);
  }
  
  public boolean getSearchServices() {
    return (searchTypeMenuItems.get(RESOURCE_TYPE.Service).isSelected());
  }
  public void setSearchServices(boolean bSearchServices) {
    this.searchTypeMenuItems.get(RESOURCE_TYPE.Service).setSelected(bSearchServices);
  }
  
  public boolean getSearchServiceProviders() {
    return (searchTypeMenuItems.get(RESOURCE_TYPE.ServiceProvider).isSelected());
  }
  public void setSearchServiceProviders(boolean bSearchServiceProviders) {
    this.searchTypeMenuItems.get(RESOURCE_TYPE.ServiceProvider).setSelected(bSearchServiceProviders);
  }
  
  public boolean getSearchUsers() {
    return (searchTypeMenuItems.get(RESOURCE_TYPE.User).isSelected());
  }
  public void setSearchUsers(boolean bSearchUsers) {
    this.searchTypeMenuItems.get(RESOURCE_TYPE.User).setSelected(bSearchUsers);
  }

  
  
  // *** Callbacks for HasDefaultFocusCapability interface ***
  
  public void focusDefaultComponent() {
    this.tfSearchQuery.selectAll();
    this.tfSearchQuery.requestFocusInWindow();
  }
  
  public Component getDefaultComponent() {
    return(this.tfSearchQuery);
  }
  
  
}
