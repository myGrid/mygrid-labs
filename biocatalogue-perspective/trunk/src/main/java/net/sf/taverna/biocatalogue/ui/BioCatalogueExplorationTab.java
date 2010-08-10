package net.sf.taverna.biocatalogue.ui;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.util.LinkedHashMap;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.log4j.Logger;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class BioCatalogueExplorationTab extends JPanel
{
  public static enum RESOURCE_TYPE {
    // the order is important - all these types will appear in the user interface
    // in the same order as listed here
    SOAPOperation ("SOAP Operation", "SOAP Operations", true),
    RESTMethod ("REST Method", "REST Methods", true),
    Service ("Service", "Services", true),
    ServiceProvider ("Service Provider", "Service Providers", false),
    User ("User", "Users", false);
    
    private final String resourceTypeName;
    private final String resourceCollectionName;
    private boolean defaultType;
    
    RESOURCE_TYPE(String resourceTypeName, String resourceCollectionName, boolean defaultType) {
      this.resourceTypeName = resourceTypeName;
      this.resourceCollectionName = resourceCollectionName;
      this.defaultType = defaultType;
    }
    
    public String getTypeName() {
      return this.resourceTypeName;
    }
    
    public String getCollectionName() {
      return this.resourceCollectionName;
    }
    
    /**
     * @return <code>true</code> - if used for search by default;<br/>
     *         <code>false</code> - otherwise.
     */
    public boolean isDefaultSearchType() {
      return this.defaultType;
    }
    
    
    /**
     * This method is useful for adding / removing tabs into the results view - provides
     * and index for the tabbed view to place a tab, relevant to a particular resource type.
     * This helps to preserve the order of tabs after adding / removing them.
     * 
     * @return Zero-based index of this resource type in the <code>RESOURCE_TYPE</code> enum or 
     *         <code>-1</code> if not found (which is impossible under normal conditions).
     */
    public int index()
    {
      RESOURCE_TYPE[] values = RESOURCE_TYPE.values();
      for (int i = 0; i < values.length; i++) {
        if (this == values[i]) {
          return (i);
        }
      }
      return (-1);
    }
    
  };
  
  
  
  private final MainComponent pluginPerspectiveMainComponent;
  private final BioCatalogueClient client;
  private final Logger logger;
  
  
  
  // COMPONENTS
  private BioCatalogueExplorationTab thisPanel;
  
  private JPanel jpSearchOptions;
  private JToggleButton bSearchForTypes;
  private Popup searchTypesMenu;
  private JPanel jpSearchTypesMenuContents;
  private long searchTypesMenuLastShownAt;
  private JTextField tfSearchQuery;
  private JButton bSearch;
  private JClickableLabel jclChooseTag;
  
  private JTabbedPane tpSearchResultTypes;
  private LinkedHashMap<RESOURCE_TYPE, JComponent> resultTypeTabsMap;
  
  
  
  
  
  public BioCatalogueExplorationTab(MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    this.thisPanel = this;
    
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    this.resultTypeTabsMap = new LinkedHashMap<BioCatalogueExplorationTab.RESOURCE_TYPE, JComponent>();
    
    initialiseUI();
    initialiseData();
    
  }
  
  
  private void initialiseUI()
  {
    this.jpSearchOptions = createSearchOptionsPanel();
    
    this.tpSearchResultTypes = new JTabbedPane();
    initialiseResultTabsMap();
    reloadResultTabsFromMap();
    
    this.setLayout(new BorderLayout());
    this.add(jpSearchOptions, BorderLayout.NORTH);
    this.add(tpSearchResultTypes, BorderLayout.CENTER);
  }
  
  
  private JPanel createSearchOptionsPanel()
  {
    JPanel jpOptions = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    jpOptions.add(new JLabel("Search for:"), c);
    
    
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
          if (!mi.isSelected() && tpSearchResultTypes.getTabCount() <= 1) {
            mi.setSelected(true);
          }
          else {
            toggleResultTabsInMap(type, mi.isSelected());
            reloadResultTabsFromMap();
          }
        }
      });
      jpSearchTypesMenuContents.add(mi);
    }
    
    // ----
    
    c.gridx++;
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
    jpOptions.add(bSearchForTypes, c);
    
    
    c.gridx++;
    this.tfSearchQuery = new JTextField(30);
    jpOptions.add(tfSearchQuery, c);
    
    
    c.gridx++;
    c.weightx = 1.0;
    this.bSearch = new JButton("Search");
    this.bSearch.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      }
    });
    jpOptions.add(bSearch);
    
    
    c.gridx = 0;
    c.gridy++;
    this.jclChooseTag = new JClickableLabel("Choose tag...", "strDataForAction", new ActionListener() {  // TODO - set up constant for this "strDataForAction"
      public void actionPerformed(ActionEvent e) {
        TagSelectionDialog tagSelectionDialog = new TagSelectionDialog(pluginPerspectiveMainComponent, client, logger);
        tagSelectionDialog.setVisible(true);
      }
    });
    jpOptions.add(jclChooseTag, c);
    
    return (jpOptions);
  }
  
  
  /**
   * Dynamically populates the map of resource types and components that represent these types
   * in the tabbed pane -- this is only to be done once during the initialisation.
   */
  private void initialiseResultTabsMap()
  {
    for (RESOURCE_TYPE t : RESOURCE_TYPE.values()) {
      toggleResultTabsInMap(t, t.isDefaultSearchType());
    }
  }
  
  
  /**
   * Adds or removes a tab for a specified type of resource.
   * 
   * @param type Resource type for which the tab is to be added / removed.
   * @param doShowTab Defines whether to add or remove tab for this resource type.
   */
  private void toggleResultTabsInMap(RESOURCE_TYPE type, boolean doShowTab)
  {
    JPanel jpResultPanel = null;
    
    if (doShowTab) {
      // TODO - have a switch here to generate correct panels here
      jpResultPanel = new JPanel();
      jpResultPanel.add(new JLabel(type.getCollectionName()));
    }
    
    this.resultTypeTabsMap.put(type, jpResultPanel);
  }
  
  
  /**
   * (Re-)loads the user interface from the internal map.
   */
  private void reloadResultTabsFromMap() {
    tpSearchResultTypes.removeAll();
    for (RESOURCE_TYPE type : this.resultTypeTabsMap.keySet()) {
      JComponent c = this.resultTypeTabsMap.get(type);
      if (c != null) {
        tpSearchResultTypes.addTab(type.getCollectionName(), /*icon*/null, c, /*tooltip*/null);
      }
    }
  }
  
  
  
  private void initialiseData()
  {
    
  }
  
  
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.getContentPane().add(new BioCatalogueExplorationTab(null, null, null));
    f.setSize(1000, 800);
    f.setLocationRelativeTo(null);
    
    f.setVisible(true);
  }
}
