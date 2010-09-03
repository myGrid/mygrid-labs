package net.sf.taverna.biocatalogue.ui.filtertree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.connectivity.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.biocatalogue.ui.tristatetree.JTriStateTree;
import net.sf.taverna.biocatalogue.ui.tristatetree.TriStateTreeCheckingListener;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.log4j.Logger;

import org.biocatalogue.x2009.xml.rest.Filter;
import org.biocatalogue.x2009.xml.rest.FilterGroup;
import org.biocatalogue.x2009.xml.rest.FilterType;
import org.biocatalogue.x2009.xml.rest.Filters;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class FilterTreePane extends JPanel implements TriStateTreeCheckingListener
{
  private TYPE resourceType;
  private String filtersURL;
  private BioCatalogueClient client;
  private Logger logger;
  
  private FilterTreePane thisPanel;
  
  private JToolBar tbFilterTreeToolbar;
  private JButton bSaveFilter;
  private JButton bRefreshFilters;
  private JButton bExpandAll;
  private JButton bCollapseAll;
  private JButton bSelectAll;
  private JButton bDeselectAll;
  
  
  private JPanel jpFilters = null;
  private JTriStateTree filterTree; // tree component to display filter selections
  private Filters filtersRoot;     // last filters element which was received from the API

  
  
  public FilterTreePane(TYPE resourceType)
  {
    this.thisPanel = this;
    
    this.resourceType = resourceType;
    this.filtersURL = resourceType.getAPIResourceCollectionFilters();
    this.client = MainComponentFactory.getSharedInstance().getBioCatalogueClient();
    this.logger = Logger.getLogger(this.getClass());
    
    initialiseUI();
    loadFiltersAndBuildTheTree();
  }
  
  
  private void initialiseUI()
  {
    jpFilters = new JPanel();
    jpFilters.setBackground(Color.WHITE);
    
    JScrollPane spFilters = new JScrollPane(jpFilters);
    spFilters.setPreferredSize(new Dimension(300,0));
    spFilters.getVerticalScrollBar().setUnitIncrement(BioCataloguePluginConstants.DEFAULT_SCROLL);
    
    this.setLayout(new BorderLayout());
    this.add(createTreeActionToolbar(), BorderLayout.NORTH);
    this.add(spFilters, BorderLayout.CENTER);
  }
  
  
  /**
   * @return A toolbar that replicates all actions available in the contextual menu of
   *         the filtering tree - mainly: saving current filter, reloading filter tree,
   *         expanding/collapsing and selecting/deselecting everything in the tree.
   */
  private JToolBar createTreeActionToolbar()
  {
    bSaveFilter = new JButton(ResourceManager.getImageIcon(ResourceManager.SAVE_ICON));
    bSaveFilter.setToolTipText("Save current filter");
    bSaveFilter.setEnabled(false);
    bSaveFilter.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        saveCurrentFilter();
      }
    });
    
    bRefreshFilters = new JButton(ResourceManager.getImageIcon(ResourceManager.REFRESH_ICON));
    bRefreshFilters.setToolTipText("Refresh the filter tree");
    bRefreshFilters.setEnabled(false);
    bRefreshFilters.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        loadFiltersAndBuildTheTree();
      }
    });
    
    bExpandAll = new JButton(ResourceManager.getImageIcon(ResourceManager.EXPAND_ALL_ICON));
    bExpandAll.setToolTipText("Expand all nodes in the tree");
    bExpandAll.setEnabled(false);
    bExpandAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        filterTree.expandAll();
      }
    });
    
    bCollapseAll = new JButton(ResourceManager.getImageIcon(ResourceManager.COLLAPSE_ALL_ICON));
    bCollapseAll.setToolTipText("Collapse all nodes in the tree");
    bCollapseAll.setEnabled(false);
    bCollapseAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        filterTree.collapseAll();
      }
    });
    
    bSelectAll = new JButton(ResourceManager.getImageIcon(ResourceManager.SELECT_ALL_ICON));
    bSelectAll.setToolTipText("Select all");
    bSelectAll.setEnabled(false);
    bSelectAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        filterTree.selectAllNodes(true);
      }
    });
    
    bDeselectAll = new JButton(ResourceManager.getImageIcon(ResourceManager.DESELECT_ALL_ICON));
    bDeselectAll.setToolTipText("Deselect all");
    bDeselectAll.setEnabled(false);
    bDeselectAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        filterTree.selectAllNodes(false);
      }
    });
    
    
    JToolBar tbTreeActions = new JToolBar(JToolBar.HORIZONTAL);
    tbTreeActions.setAlignmentX(RIGHT_ALIGNMENT);
    tbTreeActions.setBorderPainted(true);
    tbTreeActions.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
    tbTreeActions.setFloatable(false);
    tbTreeActions.add(bSaveFilter);
    tbTreeActions.add(bRefreshFilters);
    tbTreeActions.addSeparator();
    
    tbTreeActions.add(bExpandAll);
    tbTreeActions.add(bCollapseAll);
    tbTreeActions.addSeparator();
    
    tbTreeActions.add(bSelectAll);
    tbTreeActions.add(bDeselectAll);
    
    return (tbTreeActions);
  }
  
  
  /**
   * This method loads filter data from API and populates the view.
   */
  private void loadFiltersAndBuildTheTree()
  {
    jpFilters.removeAll();
    jpFilters.setLayout(new BorderLayout());
    jpFilters.add(new JLabel(" Loading filters..."), BorderLayout.NORTH);
    jpFilters.add(new JLabel(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE)), BorderLayout.CENTER);
    this.validate();
    this.repaint();      // validate and repaint this component to make sure that
                         // scroll bar around the filter tree placeholder panel disappears
    
    new Thread("Load filters") {
      public void run() {
        try {
          // load filter data
          filtersRoot = client.getBioCatalogueFilters(filtersURL);
          
          // Create root of the filter tree component
          FilterTreeNode root = new FilterTreeNode("root");
          
          // populate the tree via its root element
          for (FilterGroup fgroup : filtersRoot.getGroupList())
          {
            // attach filter group directly to the root node
            FilterTreeNode fgroupNode = new FilterTreeNode("<html><span style=\"color: black; font-weight: bold;\">" + StringEscapeUtils.escapeHtml(fgroup.getName().toString()) + "</span></html>");
            root.add(fgroupNode);
            
            
            // go through all filter types in this group and add them to the tree
            for (FilterType ftype : fgroup.getTypeList())
            {
              // if there's more than one filter type in the group, add the type node as another level of nesting
              // (otherwise, attach filters inside the single type directly to the group node)
              FilterTreeNode filterTypeNode = fgroupNode;
              if (fgroup.getTypeList().size() > 1) {
                filterTypeNode = new FilterTreeNode("<html><span style=\"color: black; font-weight: bold;\">" + StringEscapeUtils.escapeHtml(ftype.getName().toString()) + "</span></html>");
                fgroupNode.add(filterTypeNode);
              }
              
              addFilterChildren(filterTypeNode, ftype.getUrlKey().toString(), ftype.getFilterList());
            }
          }
          
          // Create the tree view with the populated root
          filterTree = new JTriStateTree(root);
          filterTree.setRootVisible(false);      // don't want the root to be visible; not a standard thing, so not implemented within JTriStateTree
          filterTree.setLargeModel(true);        // potentially can have many filters!
          filterTree.addCheckingListener(thisPanel);
          
          
          // Add custom functionality to the tree - ability to reload the filters and save the current filter
          JMenuItem miRefreshFilters = new JMenuItem("Refresh filters", ResourceManager.getImageIcon(ResourceManager.REFRESH_ICON));
          miRefreshFilters.setToolTipText("Refresh available filtering criteria");
          miRefreshFilters.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              loadFiltersAndBuildTheTree();
            }
          });
          
          JMenuItem miSaveFilter = new JMenuItem("Save current filter", ResourceManager.getImageIcon(ResourceManager.SAVE_ICON));
          miSaveFilter.setToolTipText("Save current filtering criteria selection as your favourite filter");
          miSaveFilter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              saveCurrentFilter();
            }
          });
          
          // attach the created menu items to the tree (as first three entries)
          filterTree.getContextualMenu().insert(miSaveFilter, 0);
          filterTree.getContextualMenu().insert(miRefreshFilters, 1);
          filterTree.getContextualMenu().insert(new JPopupMenu.Separator(), 2);
          
          
          // insert the created tree view into the filters panel
          jpFilters.removeAll();
          jpFilters.setLayout(new GridLayout(0,1));
          jpFilters.add(filterTree);
          jpFilters.validate();
          
          
          // enable all tree actions
          bSaveFilter.setEnabled(true);
          bRefreshFilters.setEnabled(true);
          bExpandAll.setEnabled(true);
          bCollapseAll.setEnabled(true);
          bSelectAll.setEnabled(true);
          bDeselectAll.setEnabled(true);
        }
        catch (Exception e) {
          logger.error("Failed to load filter tree from the following URL: " + filtersURL, e);
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
  
  
  private void saveCurrentFilter()
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
      JOptionPane.showMessageDialog(null, "ERROR: not implemented!!!");  // TODO - fix saving the filters
//      System.err.println("\nOnly saves filter itself, but not other search criteria - e.g. term / tag.\n");
//      ServiceFilteringSettings currentFilter = new ServiceFilteringSettings(filterName, filterTree);
//      SearchInstance filteringSearchInstance = new SearchInstance(new SearchInstance("", true, false, false, false), currentFilter);
//      searchResultsMainPanel.getHistoryAndFavouritesPanel().addToFavouriteFilters(filteringSearchInstance);
    }
  }
  
  
  /**
   * @param si Uses this SearchInstance to restore the checking
   *           state of filtering criteria in the filter tree. 
   */
  public void restoreFilteringSettings(SearchInstance si) {
    this.filterTree.restoreFilterCheckingSettings(si.getFilteringSettings().getFilterTreeRootsOfCheckedPaths());
  }
  
  
  /**
   * Clears any selections made in the filter tree -
   * i.e. both clears checked nodes and removes all tree path selections.
   */
  public void clearSelection() {
    // filter tree may not have been initialised yet, so perform a check
    if (this.filterTree != null)
    {
      // remove, then restore self as a listener - this is to avoid
      // receiving checking state change event
      this.filterTree.removeCheckingListener(thisPanel);
      this.filterTree.selectAllNodes(false);
      this.filterTree.clearSelection();
      this.filterTree.addCheckingListener(thisPanel);
    }
  }
  
  
  /**
   * Collapses all expanded nodes in the filter tree.
   */
  public void collapseAll() {
    // filter tree may not have been initialised yet, so perform a check
    if (this.filterTree != null) {
      this.filterTree.collapseAll();
    }
  }
  
  
  // *** Callback for TriStateTreeCheckingListener ***
  
  /**
   * We start a new search as soon as checking state of the filter tree changes.
   */
  public void triStateTreeCheckingChanged(JTriStateTree source)
  {
    MainComponentFactory.getSharedInstance().getBioCatalogueExplorationTab().getTabbedSearchResultsPanel().
        startNewFiltering(resourceType, new ServiceFilteringSettings(filterTree));
  }
  
}
