package net.sf.taverna.biocatalogue.ui;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.Popup;
import javax.swing.PopupFactory;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.filtertree.FilterTreePane;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.apache.log4j.Logger;


/**
 * 
 * @author Sergejs Aleksejevs
 */
public class BioCatalogueExplorationTab extends JPanel implements HasDefaultFocusCapability
{
  public static enum RESOURCE_TYPE {
    // the order is important - all these types will appear in the user interface
    // in the same order as listed here
    SOAPOperation ("SOAP Operation", "SOAP Operations", true, ResourceManager.getImageIcon(ResourceManager.SERVICE_OPERATION_ICON)),     // TODO - identical icons -- replace
    RESTMethod ("REST Method", "REST Methods", true, ResourceManager.getImageIcon(ResourceManager.SERVICE_OPERATION_ICON)),              // TODO - identical icons
    Service ("Web Service", "Web Services", true, ResourceManager.getImageIcon(ResourceManager.SERVICE_ICON)),
    ServiceProvider ("Service Provider", "Service Providers", false, ResourceManager.getImageIcon(ResourceManager.SERVICE_PROVIDER_ICON)),
    User ("User", "Users", false, ResourceManager.getImageIcon(ResourceManager.USER_ICON));
    
    private final String resourceTypeName;
    private final String resourceCollectionName;
    private boolean defaultType;
    private Icon icon;
    
    RESOURCE_TYPE(String resourceTypeName, String resourceCollectionName, boolean defaultType, Icon icon) {
      this.resourceTypeName = resourceTypeName;
      this.resourceCollectionName = resourceCollectionName;
      this.defaultType = defaultType;
      this.icon = icon;
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
     * @return Small icon that represents this resource type.
     */
    public Icon getIcon() {
      return this.icon;
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
  
  private SearchOptionsPanel searchOptionsPanel;
  
  private JTabbedPane tpSearchResultTypes;
  private LinkedHashMap<RESOURCE_TYPE, JComponent> resultTypeTabsMap;
  
  
  
  
  
  public BioCatalogueExplorationTab()
  {
    this.thisPanel = this;
    
    this.pluginPerspectiveMainComponent = MainComponentFactory.getSharedInstance();
    this.client = pluginPerspectiveMainComponent.getBioCatalogueClient();
    this.logger = Logger.getLogger(this.getClass());
    
    this.resultTypeTabsMap = new LinkedHashMap<BioCatalogueExplorationTab.RESOURCE_TYPE, JComponent>();
    
    initialiseUI();
    
    // this is to make sure that search will get focused when this tab is opened
    // -- is a workaround to a bug in JVM
    setFocusCycleRoot(true);
    setFocusTraversalPolicy(new LayoutFocusTraversalPolicy() {
      public Component getDefaultComponent(Container cont) {
          return (thisPanel.getDefaultComponent());
      }
    });
  }
  
  
  private void initialiseUI()
  {
    this.searchOptionsPanel = new SearchOptionsPanel();
    
    this.tpSearchResultTypes = new JTabbedPane();
    initialiseResultTabsMap();
    reloadResultTabsFromMap();
    
    this.setLayout(new BorderLayout(0, 10));
    this.add(searchOptionsPanel, BorderLayout.NORTH);
    this.add(tpSearchResultTypes, BorderLayout.CENTER);
    
    this.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));
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
    
    if (doShowTab)
    {
      jpResultPanel = new JPanel(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();
      c.anchor = GridBagConstraints.WEST;
      c.fill = GridBagConstraints.VERTICAL;
      c.weighty = 1.0;
      c.weightx = 1.0;
      
      // TODO - have a switch here to generate correct panels here
      switch (type)
      {
        case Service: 
          jpResultPanel.add(new FilterTreePane(BioCatalogueClient.API_SERVICE_FILTERS_URL), c);
          break;
        
        case SOAPOperation:
          jpResultPanel.add(new FilterTreePane(BioCatalogueClient.API_SOAP_OPERATION_FILTERS_URL), c);
          break;
          
        case RESTMethod:
          jpResultPanel.add(new FilterTreePane(BioCatalogueClient.API_REST_METHOD_FILTERS_URL), c);
          break;
          
        default:
          jpResultPanel.add(new JLabel(type.getCollectionName()));
      }
    }
    
    this.resultTypeTabsMap.put(type, jpResultPanel);
  }
  
  
  /**
   * (Re-)loads the user interface from the internal map.
   */
  private void reloadResultTabsFromMap()
  {
    Component selectedTabsComponent = tpSearchResultTypes.getSelectedComponent();
    tpSearchResultTypes.removeAll();
    for (RESOURCE_TYPE type : this.resultTypeTabsMap.keySet()) {
      JComponent c = this.resultTypeTabsMap.get(type);
      if (c != null) {
        tpSearchResultTypes.addTab(type.getCollectionName(), type.getIcon(), c, /*tooltip*/null);
      }
    }
    
    // attempt to re-select the same tab that was open before reloading
    try {
      tpSearchResultTypes.setSelectedComponent(selectedTabsComponent);
    }
    catch (IllegalArgumentException e) {
      // failed - probably previously selected tab got removed - select the first one
      tpSearchResultTypes.setSelectedIndex(0);
    }
  }
  
  
  
  
  
  // *** Callbacks for HasDefaultFocusCapability interface ***
  
  public void focusDefaultComponent() {
    this.searchOptionsPanel.focusDefaultComponent();
  }
  
  public Component getDefaultComponent() {
    return (this.searchOptionsPanel.getDefaultComponent());
  }
  
  // *********************************************************
  
  
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.getContentPane().add(new BioCatalogueExplorationTab());
    f.setSize(1000, 800);
    f.setLocationRelativeTo(null);
    
    f.setVisible(true);
  }
}
