package net.sf.taverna.biocatalogue.ui.filtertree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.SearchInstance;
import net.sf.taverna.biocatalogue.ui.tristatetree.JTriStateTree;
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
public class FilterTreePane extends JScrollPane
{
  private String filtersURL;
  private BioCatalogueClient client;
  private Logger logger;
  
  private JPanel jpFilters = null;
  
  private Filters filtersRoot;     // last filters element which was received from the API
  private JTriStateTree filterTree; // tree component to display filter selections

  
  
  public FilterTreePane(String filtersURL)
  {
    this.filtersURL = filtersURL;
    this.client = MainComponentFactory.getSharedInstance().getBioCatalogueClient();
    this.logger = Logger.getLogger(this.getClass());
    
    initialiseUI();
    loadFilters();
  }
  
  
  private void initialiseUI()
  {
    jpFilters = new JPanel();
    jpFilters.setBackground(Color.WHITE);
    
    this.setViewportView(jpFilters);
    this.setPreferredSize(new Dimension(300,0));
    this.getVerticalScrollBar().setUnitIncrement(BioCataloguePluginConstants.DEFAULT_SCROLL);
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
    this.validate();
    this.repaint();      // validate and repaint this component to make sure that
                         // scroll bar around the filter tree placeholder panel disappears
    
    new Thread("Load filters") {
      public void run() {
        try {
          // load filter data
          filtersRoot = client.getBioCatalogueFilters(filtersURL);
          
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
                JOptionPane.showMessageDialog(null, "ERROR: not implemented!!!");  // TODO - fix saving the filters
//                System.err.println("\nOnly saves filter itself, but not other search criteria - e.g. term / tag.\n");
//                ServiceFilteringSettings currentFilter = new ServiceFilteringSettings(filterName, filterTree);
//                SearchInstance filteringSearchInstance = new SearchInstance(new SearchInstance("", true, false, false, false), currentFilter);
//                searchResultsMainPanel.getHistoryAndFavouritesPanel().addToFavouriteFilters(filteringSearchInstance);
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
  
  
  /**
   * @param si Uses this SearchInstance to restore the checking
   *           state of filtering criteria in the filter tree. 
   */
  public void restoreFilteringSettings(SearchInstance si) {
    this.filterTree.restoreFilterCheckingSettings(si.getFilteringSettings().getFilterTreeRootsOfCheckedPaths());
  }
  
}
