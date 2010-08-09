package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
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
  private JPopupMenu searchTypesMenu;
  private JTextField tfSearchQuery;
  private JButton bSearch;
  
  private JTabbedPane tpSearchResultTypes;
  
  
  
  
  public BioCatalogueExplorationTab(MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    this.thisPanel = this;
    
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    initialiseUI();
    initialiseData();
    
  }
  
  
  private void initialiseUI()
  {
    this.jpSearchOptions = createSearchOptionsPanel();
    this.tpSearchResultTypes = createSearchResultTabbedPane();
    
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
    
    
    
    searchTypesMenu = new JPopupMenu();
    searchTypesMenu.setDoubleBuffered(true);
    searchTypesMenu.addPopupMenuListener(new PopupMenuListener() {
      public void popupMenuWillBecomeInvisible(PopupMenuEvent e) { 
        bSearchForTypes.setSelected(false);
        bSearchForTypes.setIcon(ResourceManager.getImageIcon(ResourceManager.UNFOLD_ICON));
      }
      public void popupMenuWillBecomeVisible(PopupMenuEvent e) { 
        bSearchForTypes.setIcon(ResourceManager.getImageIcon(ResourceManager.FOLD_ICON));
      }
      public void popupMenuCanceled(PopupMenuEvent e) { /* do nothing */ }
    });
    
    
    // dynamic population of resource types available for search
    for (RESOURCE_TYPE t : RESOURCE_TYPE.values())
    {
      final RESOURCE_TYPE type = t;
      final JCheckBoxMenuItem mi = new JCheckBoxMenuItem(type.getCollectionName());
      mi.setSelected(type.isDefaultSearchType());
      mi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
          bSearchForTypes.doClick(0);              // make sure that the popup menu stays open after the click on the menu item
          toggleResultTabs(type, mi.isSelected()); // enable / disable the relevant tab
        }
      });
      
      searchTypesMenu.add(mi);
    }
    
    
    c.gridx++;
    bSearchForTypes = new JToggleButton("Search for types...", ResourceManager.getImageIcon(ResourceManager.UNFOLD_ICON));
    bSearchForTypes.setDoubleBuffered(true);
    bSearchForTypes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        searchTypesMenu.show(bSearchForTypes, 0, bSearchForTypes.getHeight());
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
    
    
    return (jpOptions);
  }
  
  
  
  private JTabbedPane createSearchResultTabbedPane()
  {
    JTabbedPane tpResults = new JTabbedPane();
    
    // dynamic population with default resource types
    for (RESOURCE_TYPE t : RESOURCE_TYPE.values()) {
      if (t.isDefaultSearchType()) {
        JPanel jpResultPanel = new JPanel();
        tpResults.insertTab(t.getCollectionName(), /*icon*/null, jpResultPanel, /**/null, t.index());
      }
    }
    
    return (tpResults);
  }
  
  
  private void toggleResultTabs(RESOURCE_TYPE type, boolean doShowTab)
  {
    if (doShowTab) {
      JPanel jpResultPanel = new JPanel();
      tpSearchResultTypes.insertTab(type.getCollectionName(), /*icon*/null, jpResultPanel, /**/null, type.index());
    }
    else {
      tpSearchResultTypes.remove(type.index());
    }
//    System.out.println(type + " need to show: " + doShowTab);
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
