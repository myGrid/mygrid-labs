package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.tree.TreePath;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.SearchInstance;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.tristatetree.JTriStateTree;
import net.sf.taverna.biocatalogue.ui.tristatetree.TriStateCheckBox;
import net.sf.taverna.biocatalogue.ui.tristatetree.TriStateTreeNode;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.Filter;
import org.biocatalogue.x2009.xml.rest.FilterGroup;
import org.biocatalogue.x2009.xml.rest.FilterType;
import org.biocatalogue.x2009.xml.rest.Filters;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.Services;

public class ServiceFilteringTab extends JPanel implements ActionListener, HasDefaultFocusCapability
{
  private static final String TAB_BASE_TITLE = "Browse Services";
  
  private final MainComponent pluginPerspectiveMainComponent;
  private final BioCatalogueClient client;
  private final Logger logger;
  
  private Filters filtersRoot;     // last filters element which was received from the API
  private JTriStateTree filterTree; // tree component to display filter selections
  
  private ServiceFilteringTab thisPanel = null;
  private JSplitPane spMainSplitPane = null;
  private JScrollPane spFilters;
  private JPanel jpFilters = null;
  private JButton bFilter = null;
  private SearchResultsMainPanel searchResultsMainPanel = null;
  
  
  public ServiceFilteringTab(MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    this.thisPanel = this;
    
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    initializeUI();
    initializeData();
    
    // this is to make sure that search will get focused when this tab is opened
    // -- is a workaround to a bug in JVM
    setFocusCycleRoot(true);
    setFocusTraversalPolicy(new LayoutFocusTraversalPolicy() {
      public Component getDefaultComponent(Container cont) {
          return (thisPanel.getDefaultComponent());
      }
    });
    
  }


  private void initializeUI()
  {
    // *** Left side of the split pane ***
    
    // create filters panel and button
    jpFilters = new JPanel();
    jpFilters.setBackground(Color.WHITE);
    spFilters = new JScrollPane(jpFilters);
    spFilters.setPreferredSize(new Dimension(300,0));
    spFilters.getVerticalScrollBar().setUnitIncrement(BioCataloguePluginConstants.DEFAULT_SCROLL);
    
    bFilter = new JButton("Filter");
    bFilter.addActionListener(this);
    bFilter.setEnabled(false);
    
    JPanel jpFilterButtonPanel = new JPanel();
    jpFilterButtonPanel.setLayout(new BorderLayout());
    jpFilterButtonPanel.add(bFilter, BorderLayout.CENTER);
    jpFilterButtonPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
    
    // wrap filters panel and button into one component
    JPanel jpAllFilteringComponents = new JPanel();
    jpAllFilteringComponents.setLayout(new BorderLayout());
    jpAllFilteringComponents.add(spFilters, BorderLayout.CENTER);
    jpAllFilteringComponents.add(jpFilterButtonPanel, BorderLayout.SOUTH);
    
    
    // *** Right side of the split pane ***
    searchResultsMainPanel = new SearchResultsMainPanel(pluginPerspectiveMainComponent, this, client, logger);
    
    
    // create main split pane
    spMainSplitPane = new JSplitPane();
    spMainSplitPane.setContinuousLayout(true);
    spMainSplitPane.setDividerLocation(300);
    spMainSplitPane.setLeftComponent(jpAllFilteringComponents);
    spMainSplitPane.setRightComponent(searchResultsMainPanel);
    
    this.setLayout(new BorderLayout());
    this.add(spMainSplitPane, BorderLayout.CENTER);
    
    
    // set default title for the current tab
    pluginPerspectiveMainComponent.setWindowTitle(this.getClass().getName(), TAB_BASE_TITLE);
  }
  
  
  /**
   * This method currently only loads the data about filters.
   */
  protected void initializeData()
  {
    loadFilters();
  }
  
  
  /**
   * This method loads filter data from API and populates the view.
   */
  private void loadFilters()
  {
    jpFilters.removeAll();
    jpFilters.setLayout(new BorderLayout());
    jpFilters.add(new JLabel(" Loading filters..."), BorderLayout.NORTH);
    jpFilters.add(new JLabel(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE)), BorderLayout.CENTER);
    spFilters.validate();
    spFilters.repaint(); // validate and repaint parent component to make sure that
                         // scroll bar disappears
    
    new Thread("Load filters") {
      public void run() {
        try {
          // load filter data
          filtersRoot = client.getBioCatalogueFilters(BioCatalogueClient.API_SERVICE_FILTERS_URL);
          
          // prepare panel
          jpFilters.removeAll();
          jpFilters.setLayout(new GridLayout(0,1));
          
          
          // Create root of the filter tree component
          FilterTreeNode root = new FilterTreeNode("root");
          
          // populate the tree via its root element
          for (FilterGroup fgroup : filtersRoot.getGroupList())
          {
            FilterTreeNode nodeToAttachFiltersFromThisGroup = root;
            
            // if there's more than one filter type in the group, add the group as another level of nesting
            if (fgroup.getTypeList().size() > 1) {
              nodeToAttachFiltersFromThisGroup = new FilterTreeNode("<html><span style=\"color: black; font-weight: bold;\">" + StringEscapeUtils.escapeHtml(fgroup.getName().toString()) + "</span></html>");
              root.add(nodeToAttachFiltersFromThisGroup);
            }
            
            // go through all filter types in this group and add them to the tree
            for (FilterType ftype : fgroup.getTypeList())
            {
              FilterTreeNode filterTypeNode =
                new FilterTreeNode("<html><span style=\"color: black; font-weight: bold;\">" + StringEscapeUtils.escapeHtml(ftype.getName().toString()) + "</span></html>");
              
              addFilterChildren(filterTypeNode, ftype.getUrlKey().toString(), ftype.getFilterList());
              nodeToAttachFiltersFromThisGroup.add(filterTypeNode);
            }
          }
          
          // Create the tree view with the populated root
          filterTree = new JTriStateTree(root);
          filterTree.setRootVisible(false);      // don't want the root to be visible; not a standard thing, so not implemented within JTriStateTree
          filterTree.setLargeModel(true);        // potentially can have many filters!
          
          
          // Add custom functionality to the tree - ability to reload the filters and save the current filter
          JMenuItem miRefreshFilters = new JMenuItem("Refresh filters", ResourceManager.getImageIcon(ResourceManager.REFRESH_ICON));
          miRefreshFilters.setToolTipText("Refresh available filtering criteria");
          miRefreshFilters.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e) {
              loadFilters();
            }
          });
          
          JMenuItem miSaveFilter = new JMenuItem("Save current filter", ResourceManager.getImageIcon(ResourceManager.SAVE_ICON));
          miSaveFilter.setToolTipText("Save current filtering criteria selection as your favourite filter");
          miSaveFilter.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
              // check if there is any selection in the filter tree
              if (filterTree.getRootsOfCheckedPaths().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No filtering criteria are currently specified.\n" +
                    "Please choose required criteria from the filtering tree and try again.",
                    BioCataloguePluginConstants.APP_VISIBLE_NAME, JOptionPane.WARNING_MESSAGE);
                return;
              }
              
              String filterName = null;
              do {
                // keep asking for the filter name until users clicks
                // "cancel" button or actually inputs a valid name
                filterName = JOptionPane.showInputDialog("Please choose a name for the current filter");
              } while (filterName != null && filterName.length() == 0);
              
              // if filter name was entered, store it
              if (filterName != null) {
                System.err.println("\nOnly saves filter itself, but not other search criteria - e.g. term / tag.\n");
                ServiceFilteringSettings currentFilter = new ServiceFilteringSettings(filterName, filterTree);
                SearchInstance filteringSearchInstance = new SearchInstance(new SearchInstance("", true, false, false, false), currentFilter);
                searchResultsMainPanel.getHistoryAndFavouritesPanel().addToFavouriteFilters(filteringSearchInstance);
              }
            }
          });
          
          // attach the created menu items to the tree (as first three entries)
          filterTree.getContextualMenu().insert(miSaveFilter, 0);
          filterTree.getContextualMenu().insert(miRefreshFilters, 1);
          filterTree.getContextualMenu().insert(new JPopupMenu.Separator(), 2);
          
          // insert the created tree view into the filters panel
          jpFilters.add(filterTree);
          jpFilters.validate();
          
          bFilter.setEnabled(true);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
      
      
      /**
       * Recursive method to populate a node of the filter tree with all
       * sub-filters.
       * 
       * @param root Tree node to add children to.
       * @param filterList A list of Filters to add to "root" as childred.
       */
      private void addFilterChildren(FilterTreeNode root, String filterCategory, List<Filter> filterList) {
        for (Filter f : filterList) {
          FilterTreeNode fNode =
            new FilterTreeNode("<html><span color=\"black\">" + StringEscapeUtils.escapeHtml(f.getName()) + "</span><span color=\"gray\">&nbsp;&nbsp;(" + f.getCount().intValue() + ")</span></html>",
                               filterCategory, f.getUrlValue());
          
          addFilterChildren(fNode, filterCategory, f.getFilterList());
          root.add(fNode);
        }
      }
      
    }.start();
  }
  
  
  /**
   * @param si Uses this SearchInstance to restore the checking
   *           state of filtering criteria in the filter tree. 
   */
  public void restoreFilteringSettings(SearchInstance si) {
    this.filterTree.restoreFilterCheckingSettings(si.getFilteringSettings().getFilterTreeRootsOfCheckedPaths());
  }
  
  
  protected SearchResultsMainPanel getSearchResultsMainPanel() {
    return (this.searchResultsMainPanel);
  }
  
  protected JTriStateTree getFilterTree() {
    return filterTree;
  }
  
  
  // *** Callback for ActionListener ***
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource().equals(bFilter)) {
      // just do the filtering with the filter selection made in the filter tree
      this.searchResultsMainPanel.startNewFiltering(new ServiceFilteringSettings(filterTree));
    }
  }
  
  
  // *** Callbacks for HasDefaultFocusCapability interface ***
  
  /**
   * This method is to be called by the main perspective frame, when the current tab
   * becomes active
   */
  public void focusDefaultComponent()
  {
      // TODO - focus the "main" component (one to be focused on opening the tab)
//    tfSearch.selectAll();
//    tfSearch.requestFocusInWindow();
    
    // this method is called each time current tab is activated;
    // we reuse this functionality here to update the UI of
    // the search history and favourites panel with the latest
    // changes from the underlying data collections
    this.searchResultsMainPanel.getHistoryAndFavouritesPanel().updateUIFromDataCollections();
  }
  
  public Component getDefaultComponent() {
    // TODO - return the "main" component (one to be focused on opening the tab)
    return null;
  }
  
  
}
