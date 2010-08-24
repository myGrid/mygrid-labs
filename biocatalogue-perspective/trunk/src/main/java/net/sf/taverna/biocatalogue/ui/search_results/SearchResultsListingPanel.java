package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;
import javax.swing.event.ListDataListener;

import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.LoadingExpandedResource;
import net.sf.taverna.biocatalogue.model.LoadingResource;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.ResourceLink;

import edu.stanford.ejalbert.BrowserLauncher;

/**
 * This class is responsible for producing search results listing panel.
 * It only shows a single listing for a specified type. Multiple types are
 * handled by having different tabs in {@link SearchResultsMainPanel} with
 * instances of this class in each.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchResultsListingPanel extends JPanel implements MouseListener, SearchResultsRenderer
{
  // main elements
  private final MainComponent pluginPerspectiveMainComponent;
  private final Logger logger;
  private final SearchResultsMainPanel parentMainSearchResultsPanel;
  
  // currently displayed search results
  SearchInstance searchInstance;
  
  
  // main UI components
  private SearchResultsListingPanel thisPanel;
  private DefaultListModel resultsListingModel; 
  private JList jlResultsListing;
  private JScrollPane spResultsListing;
  
  // contextual menu
  private JPopupMenu contextualMenu;
  private JMenuItem miExpand;
  private JMenuItem miPreviewItem;
  private JMenuItem miOpenInBioCatalogue; 
  
  // this is used for previewing items from the result listing through contextual menu -
  // value will be updated by mouse event accordingly
  private ResourceLink potentialObjectToPreview;
  private final TYPE typeToPreview;
  
  
  /**
   * @param typeToPreview Resource type that will be previewed in this panel.
   * @param parentMainSearchResultsPanel Reference to a "parent" of this panel -
   *             this is needed to notify the main results panel with the
   */
  public SearchResultsListingPanel(TYPE typeToPreview, SearchResultsMainPanel parentMainSearchResultsPanel)
  {
    this.thisPanel = this;
    
    this.typeToPreview = typeToPreview;
    this.parentMainSearchResultsPanel = parentMainSearchResultsPanel;
    this.pluginPerspectiveMainComponent = MainComponentFactory.getSharedInstance();
    this.logger = Logger.getLogger(this.getClass());
    
    initialiseUI();
  }

  
  private void initialiseUI()
  {
    // *** Create placeholders for various types of found items ***
    
    // create list to hold search results and wrap it into a scroll pane
    resultsListingModel = new DefaultListModel();
    jlResultsListing = new JListWithPositionedToolTip(resultsListingModel);
    jlResultsListing.setDoubleBuffered(true);
    jlResultsListing.setCellRenderer(this.typeToPreview.getResultListingCellRenderer());
    jlResultsListing.addMouseListener(this);
    jlResultsListing.setBackground(Color.decode("#ECE9D8"));  // default "grey" background colour that is used in all windows 
    
    spResultsListing = new JScrollPane(jlResultsListing);
    spResultsListing.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {
      public void adjustmentValueChanged(AdjustmentEvent e) {
        if (!e.getValueIsAdjusting()) {
          // load missing details on adjusting the scroll bar
          //
          // only start loading more results in case if the value is "not adjusting" -
          // this means that the mouse has been released and is not dragging the scroll bar
          // any more, so effectively the user has stopped scrolling
          checkAllEntriesInTheVisiblePartOfJListAreLoaded();
        }
      }
    });
    
    
    // TODO - filtering suggestion?
//    // (only show suggestion to filter when in Search tab)
//    if (parentMainSearchResultsPanel.isRunningInSearchTab()) {
//      jclServiceFilteringSuggestion = new JClickableLabel("<html>Would you like to <b>filter</b> these services?</html>", 
//          BioCataloguePluginConstants.ACTION_FILTER_FOUND_SERVICES, this,
//          ResourceManager.getImageIcon(ResourceManager.SUGGESTION_TO_USER_ICON), JLabel.LEFT,
//          "<html>You can apply various filters to the found services - this will help<br>" +
//          "to narrow down the collection of found services.<br><br>" +
//          "Clicking here will transfer found services into the \"Filter Services\"<br>" +
//          "tab, where you will have a choice of filtering criteria in the tree<br>" +
//          "on the left-hand side of the window.</html>");
//      jclServiceFilteringSuggestion.setBorder(BorderFactory.createCompoundBorder(
//          BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
//          BorderFactory.createEmptyBorder(3, 3, 3, 3))
//        );
//      jpFoundServices.add(jclServiceFilteringSuggestion, BorderLayout.NORTH);
//    }
    
    
    // tie components to the class panel itself
    this.clearPreviousSearchResults();
    
    
    // *** Create CONTEXTUAL MENU ***
    miExpand = new JMenuItem("Expand this entry to see more details", ResourceManager.getImageIcon(ResourceManager.UNFOLD_ICON));
    miExpand.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        expandCollapseListEntry(jlResultsListing.getSelectedIndex());
      }
    });
    
    miPreviewItem = new JMenuItem("Preview", ResourceManager.getImageIcon(ResourceManager.PREVIEW_ICON));
    miPreviewItem.setToolTipText("<html>Load and preview information about this item in a separate window.</html>");
    miPreviewItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        pluginPerspectiveMainComponent.getPreviewBrowser().preview(BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE +
            potentialObjectToPreview.getHref());
      }
    });
    
    miOpenInBioCatalogue = new JMenuItem("Open in BioCatalogue", 
                  ResourceManager.getImageIcon(ResourceManager.OPEN_IN_BIOCATALOGUE_ICON));
    miOpenInBioCatalogue.setToolTipText("<html>View this item on the BioCatalogue website.<br>" +
    		                                "This will open your standard web browser.</html>");
    miOpenInBioCatalogue.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e) {
        pluginPerspectiveMainComponent.getPreviewBrowser().openInWebBrowser(potentialObjectToPreview.getHref());
      }
    });
    
    contextualMenu = new JPopupMenu();
    contextualMenu.add(miExpand);
    contextualMenu.add(miPreviewItem);
    contextualMenu.add(miOpenInBioCatalogue);
  }
  
  
  /**
   * This helper method is used to initialise this panel.
   * Also invoked when search results need to be cleared.
   */
  protected void clearPreviousSearchResults()
  {    
    this.removeAll();
    this.setLayout(new FlowLayout());
    this.setBorder(
        BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 0, 0, 0),
            BorderFactory.createEtchedBorder()
        ));
    this.add(new JLabel("No items to show"));
    this.validate();
  }
  
  
  /**
   * Statistics will be rendered along with the collection of found items.
   * 
   * @param searchInstance SearchInstance containing search results to render.
   * @param onlyDoTabUpdate True to only update the tabbed results, but not status
   *                        message and not enable/disable more/all results buttons
   *                        (typically to display more results for the same search);
   *                        false to update all (typically to display results of new
   *                        search). When set to true this also will make
   *                        an attempt to keep the same tab opened.
   */
  public void renderResults(SearchInstance searchInstance, boolean onlyDoTabUpdate)
  {
    // make the current search instance available globally within this class 
    this.searchInstance = searchInstance;
    
    // stop spinner icon on the tab that is populated and add number of results 
    parentMainSearchResultsPanel.setDefaultIconForTab(typeToPreview);
    parentMainSearchResultsPanel.setDefaultTitleForTabWithSuffix(typeToPreview, " (" + searchInstance.getSearchResults().getTotalMatchingItemCount() + ")");
    
    // if nothing was found - display notification and finish result processing
    if (searchInstance.getSearchResults().getTotalMatchingItemCount() == 0) {
      String searchStatus = "No results found ";
//      if (parentMainSearchResultsPanel.isRunningInSearchTab()) { FIXME
        searchStatus += "for " + (searchInstance.isTagSearch() ? "tag " : "") +
                        "\"" + searchInstance.getSearchTerm() + "\"";
//      }
//      else {
//        searchStatus += "while filtering services index by " + 
//        (searchInstance.getSearchTerm().length() > 0 ?
//         (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
//         "");
//      }
      
      parentMainSearchResultsPanel.setSearchStatusText(searchStatus, false);
      clearPreviousSearchResults();
      return;
    }
    
    // populate results
    if (searchInstance.getSearchResults().getTotalMatchingItemCount() > 0) {
      // populate the list box with users
      
      List<? extends ResourceLink> foundItems = searchInstance.getSearchResults().getFoundItems();
      for (ResourceLink item : foundItems) {
        resultsListingModel.addElement(item);
      }
    }
    
    
    
    this.removeAll();
    this.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    this.setLayout(new BorderLayout());
    this.add(spResultsListing, BorderLayout.CENTER);
    this.repaint();
    
    
    // automatically start loading details for the first section of result listing
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        checkAllEntriesInTheVisiblePartOfJListAreLoaded();
      }
    });
    
    
    // *** Also update status text and enable/disable relevant buttons ***
    
    // this section won't be executed if only update of tabbed results was
    // requested - generally when displaying partial results during 'long'
    // searches with multiple result pages fetched sequentially
    if (!onlyDoTabUpdate)
    {
      // some results were found; perform regular rendering;
      // start off with displaying the status of the results
      int iFetchedResultPercentage = 1;
//      int iFetchedResultPercentage = (int)(searchInstance.getSearchResults().getFetchedItemCount(Resource.ALL_RESOURCE_TYPES) * 1.0 /
//                                           searchInstance.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) * 100);
      
      String searchStatus = "";
//      if (parentMainSearchResultsPanel.isRunningInSearchTab()) { // FIXME
        searchStatus += "Search results for " + (searchInstance.isTagSearch() ? "tag " : "") +
        "\"" + searchInstance.getSearchTerm() + "\"" +
        (iFetchedResultPercentage < 100 ? " - fetched top " + iFetchedResultPercentage + "% of results" : "");
//      }
//      else {
//        searchStatus += (iFetchedResultPercentage < 100 ? "Showing top " + iFetchedResultPercentage + "% of r" : "R") +
//                        "esults of filtering services index by " + 
//                        (searchInstance.getSearchTerm().length() > 0 ?
//                         (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
//                         "");
//      }
      
      parentMainSearchResultsPanel.setSearchStatusText(searchStatus, false);
    }
  }
  
  
  /**
   * Check if details are fetched for all result entries that are currently
   * visible in the JList.
   * 
   * If some are not yet loaded, identifies the page in the index of corresponding
   * resources to fetch details.
   * 
   * When done, recursively calls itself again to verify that no more entries
   * need further details loaded.
   */
  private void checkAllEntriesInTheVisiblePartOfJListAreLoaded()
  {
    int firstVisibleIndex = jlResultsListing.getFirstVisibleIndex();
    
    if (firstVisibleIndex >= 0)
    {
      int lastVisibleIndex = jlResultsListing.getLastVisibleIndex();
      
      final int firstNotFetchedMatchingItemIndex = searchInstance.getSearchResults().
                   getFirstMatchingItemIndexNotYetFetched(firstVisibleIndex, lastVisibleIndex);
      final int pageToFetchNumber = searchInstance.getSearchResults().
                   getMatchingItemPageNumberFor(firstNotFetchedMatchingItemIndex);
      
      // check if found a valid page to load
      if (pageToFetchNumber != -1)
      {
        int numberOfResourcesPerPageForThisResourceType = searchInstance.getSearchResults().
                       getTypeOfResourcesInTheResultSet().getApiResourceCountPerIndexPage();
        
        int firstListIndexToLoad = searchInstance.getSearchResults().getFirstItemIndexOn(pageToFetchNumber);  // first element on the page that is about to be loaded
        int countToLoad = Math.min(numberOfResourcesPerPageForThisResourceType,                               // if the last page isn't full, need to mark less items than the full page
                                   resultsListingModel.getSize() - firstListIndexToLoad);
        
        
        // mark the next "page" of items in the JList as "loading" -
        // but also mark them in the SearchResults backing list, so
        // that next calls to this listener are aware of the previous
        // items that were marked as "loading"
        for (int i = firstListIndexToLoad; i < firstListIndexToLoad + countToLoad; i++) {
          ((LoadingResource)searchInstance.getSearchResults().getFoundItems().get(i)).setLoading(true);
        }
        
        // now make the UI update, too
        renderFurtherResults(searchInstance, firstListIndexToLoad, countToLoad);
        
        // TODO now start loading these results //FIXME problem with the callto the search instance - need other way to deal with threading
        final CountDownLatch latch = new CountDownLatch(1);
        new Thread("Search via the API") {
          public void run() {
            try {
              searchInstance.fetchMoreResults(parentMainSearchResultsPanel, latch, thisPanel, pageToFetchNumber);
            }
            catch (Exception e) {
              System.err.println("\n\nError while searching via BioCatalogue API. Error details:");
              e.printStackTrace();
            }
          }
        }.start();
        
        // wait for the previous portion of results to load, then fetch the next portion
        new Thread("Fetch more another page of details for search results") {
          public void run() {
            try {
              latch.await();
              checkAllEntriesInTheVisiblePartOfJListAreLoaded();
            }
            catch (InterruptedException e) {
              logger.error("Failed to wait for the previous page of results to load to check if " +
              		         "another one needs loading as well. Details in the attache exception.", e);
            }
          }  
        }.start();
        
      }
    }
  }
  
  
  /**
   * Expands or collapses currently selected entry in the search results list.
   * 
   * @param selectedIndex Index of the row currently selected in the results JList.
   */
  private void expandCollapseListEntry(int selectedIndex)
  {
    if (selectedIndex != -1) {
      ResourceLink resourceToExpand = getResourceSelectedInJList();
      if (isListEntryExpanded(resourceToExpand)) {
        // need to collapse...
        searchInstance.getSearchResults().getFoundItems().set(selectedIndex, ((LoadingExpandedResource)resourceToExpand).getAssociatedObj());
      }
      else {
        // need to expand and load additional data...
        searchInstance.getSearchResults().getFoundItems().set(selectedIndex, new LoadingExpandedResource(resourceToExpand));
        loadAdditionalDataToExpandListEntry(selectedIndex, resourceToExpand);
      }
      
      // refresh UI either way - data listeners *must* stay enabled to make sure
      // that the size of the updated entry in the list does indeed update 
      renderFurtherResults(searchInstance, selectedIndex, 1, false);
    }
  }
  
  
  /**
   * Checks whether {@link ResourceLink} object corresponding to an entry
   * in the search results list is representing an expanded or collapsed state.
   * 
   * @param resource
   * @return
   */
  private boolean isListEntryExpanded(ResourceLink resource) {
    return (resource instanceof LoadingExpandedResource);
  }
  
  /**
   * Tests whether {@link ResourceLink} object corresponding to an entry
   * in the search results list is in the state where only the first (initial)
   * fragment of data was loaded (through BioCatalogue LITE JSON API) that
   * contains just the title + URL of the resource.
   * 
   * @param resource
   * @return
   */
  private boolean isListEntryOnlyWithInitialDetails(ResourceLink resource) {
    return (resource instanceof LoadingResource);
  }
  
  
  // *** Callback for ActionListener interface ***
  
  
  // FIXME - example of how to start filtering after search finished
//  public void actionPerformed(ActionEvent e)
//  {
//    if (e.getSource() instanceof JClickableLabel) {
//      if (e.getActionCommand().startsWith(BioCataloguePluginConstants.ACTION_FILTER_FOUND_SERVICES)) {
//        // this will initiate transfer of current search results into service filtering pane
//        // (only services are filtered, so other results will be removed, but that will be
//        //  done on a separate instance of SearchInstance, so current tab' search results will not be
//        //  affected)
//        pluginPerspectiveMainComponent.getServiceFilteringTab().getFilterTree().selectAllNodes(false); // make sure no selections are done in the filter tree - new filtering
//        pluginPerspectiveMainComponent.getServiceFilteringTab().getSearchResultsMainPanel().prepareForServiceFilteringFromExistingSearchInstance(searchInstance);
//        pluginPerspectiveMainComponent.setTabActive(pluginPerspectiveMainComponent.getServiceFilteringTab());
//      }
//    }
//  }
  
  
  // Callbacks for MouseListener
  
  public void mouseClicked(MouseEvent e)
  {
    // if mouse clicked on one of the tabbed results lists and one of the items was selected
    if (e.getSource().equals(jlResultsListing) &&
        getResourceSelectedInJList() != null)
    {
      // *** single click with the left mouse button - possibly need to expand the item ***
      if (e.getClickCount() == 1 && e.getButton() == MouseEvent.BUTTON1) {
        int selIndex = jlResultsListing.getSelectedIndex();
        if (selIndex != -1) {
          // coordinates of the selected row's panel inside JList
          Rectangle selectedRowRect = jlResultsListing.getCellBounds(selIndex, selIndex);
          
          // translate coordinates of the click from JList's coordinates into coordinates
          // of the selected row's panel
          Point clickPoint = e.getPoint();
          clickPoint.translate(-1 * selectedRowRect.x, -1 * selectedRowRect.y);
          
          // stored value of the Rectangle filled by the expand/collapse link is the
          // negative offset from the top-right corner of the list entry panel --
          // need to calculate the position of the expected link in real coordinates
          //
          // deep copy is necessary, because we don't want to modify the actual values stored
          // in the JSOAPOperationListCellRenderer (as new calculations will be necessary if the
          // size of the window changes)
          Rectangle targetRect = (Rectangle)Util.deepCopy(JSOAPOperationListCellRenderer.expandRect);
          targetRect.translate(selectedRowRect.width, 0);
          
          // "EXPAND/COLLAPSE" clicked on selected row
          if (targetRect.contains(clickPoint)) {
            expandCollapseListEntry(selIndex);
          }
        }
      }
      
      // *** double-click with the left mouse button - show preview of that item ***
      if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
        String itemURL = getResourceSelectedInJList().getHref();
        pluginPerspectiveMainComponent.getPreviewBrowser().
            preview(BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE + itemURL);
      }
    }
  }
  
  public void mouseEntered(MouseEvent e) { /* NOT IN USE */ }
  public void mouseExited(MouseEvent e) { /* NOT IN USE */ }
  
  public void mousePressed(MouseEvent e)
  {
    // checked in both mousePressed() & mouseReleased() for cross-platform operation
    maybeShowPopupMenu(e);
  }

  public void mouseReleased(MouseEvent e)
  {
    // checked in both mousePressed() & mouseReleased() for cross-platform operation
    maybeShowPopupMenu(e);
  }
  
  
  /**
   * Gets the selected object from the specified list. Used for previewing items through
   * double-clicks and contextual menu.
   * 
   * @return <code>null</code> if no selection in the list, <code>ResourceLink</code>
   *         object that is currently selected otherwise.
   */
  private ResourceLink getResourceSelectedInJList() {
    return (jlResultsListing.getSelectedIndex() == -1 ?
            null :
            (ResourceLink)jlResultsListing.getSelectedValue());
  }
  
  
  private void maybeShowPopupMenu(MouseEvent e)
  {
    if (e.getSource().equals(jlResultsListing) &&
        e.isPopupTrigger() &&
        jlResultsListing.locationToIndex(e.getPoint()) != -1)
    {
      // select the entry in the list that triggered the event to show this popup menu
      jlResultsListing.setSelectedIndex(jlResultsListing.locationToIndex(e.getPoint()));
      
      // update value to be used in contextual menu click handler to act on the just-selected entry
      this.potentialObjectToPreview = getResourceSelectedInJList();
      
      // update menu item for expanding / collapsing the current entry
      if (isListEntryExpanded(this.potentialObjectToPreview)) {
        miExpand.setText("Collapse this entry");
        miExpand.setIcon(ResourceManager.getImageIcon(ResourceManager.FOLD_ICON));
        miExpand.setToolTipText("<html>Hide extra information and return the list entry to previous state.</html>");
      }
      else {
        miExpand.setText("Expand this entry");
        miExpand.setIcon(ResourceManager.getImageIcon(ResourceManager.UNFOLD_ICON));
        miExpand.setToolTipText("<html>Load more information about this entry and show it within this results list.</html>");
      }
      
      // only enable actions in the menu if the list entry that is being
      // clicked on is beyond the initial 'loading' state
      miExpand.setEnabled(!isListEntryOnlyWithInitialDetails(this.potentialObjectToPreview));
      miPreviewItem.setEnabled(!isListEntryOnlyWithInitialDetails(this.potentialObjectToPreview));
      miOpenInBioCatalogue.setEnabled(!isListEntryOnlyWithInitialDetails(this.potentialObjectToPreview));
      
      // show the contextual menu
      this.contextualMenu.show(e.getComponent(), e.getX(), e.getY());
    }
  }
  
  
  private void loadAdditionalDataToExpandListEntry(final int indexInList, final ResourceLink resource)
  {
    new Thread("load additional data for resource") {
      public void run() {
        String resourceURL = resource.getHref();
        try {
          ResourceLink fullResourceData = MainComponentFactory.getSharedInstance().getBioCatalogueClient().
                          getBioCatalogueResource(Resource.getResourceTypeFromResourceURL(resourceURL).getXmlBeansGeneratedClass(), resourceURL);
          
          LoadingExpandedResource expandedResource = new LoadingExpandedResource(fullResourceData);
          expandedResource.setLoading(false);
          
          searchInstance.getSearchResults().getFoundItems().set(indexInList, expandedResource);
          renderFurtherResults(searchInstance, indexInList, 1, false);
        }
        catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    }.start();
    
  }
  
  
  // *** Callbacks for SearchResultsRenderer ***
  
  public void renderInitialResults(final SearchInstance si)
  {
    // NB! critical to have UI update done within the invokeLater()
    //     method - this is to prevent UI from 'flashing' and to
    //     avoid some weird errors
    
    // make sure to remove any old results from the list model!
    resultsListingModel.clear();
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        // display the partial search results
        renderResults(si, true);
      }
    });
  }
  
  
  public void renderFurtherResults(SearchInstance si, int startIndex, int count) {
    renderFurtherResults(si, startIndex, count, true);
  }
  
  public void renderFurtherResults(final SearchInstance si, final int startIndex, final int count,
                                   final boolean disableListDataListeners)
  {
    // NB! critical to have UI update done within the invokeLater()
    //     method - this is to prevent UI from 'flashing' and to
    //     avoid some weird errors
    SwingUtilities.invokeLater(new Runnable() {
      public void run()
      {
        // NB! very important to remove all listeners here, so that the JList won't "freeze"
        //     on updating the components
        ListDataListener[] listeners = null;
        if (disableListDataListeners) {
          listeners = resultsListingModel.getListDataListeners();
          for (ListDataListener listener : listeners) {
            resultsListingModel.removeListDataListener(listener);
          }
        }
        
        for (int i = startIndex; i < startIndex + count && i < resultsListingModel.getSize(); i++) {
          resultsListingModel.set(i, searchInstance.getSearchResults().getFoundItems().get(i));
        }
        
        // reset all listeners in case they were removed
        if (disableListDataListeners) {
          for (ListDataListener listener : listeners) {
            resultsListingModel.addListDataListener(listener);
          }
        }
        
        jlResultsListing.validate();
        jlResultsListing.repaint();
      }
    });
  }
  
  
  
  
  // *** Specialised JList class ***
  
  /**
   * This is a modification over the regular JList.
   * The only difference is that the tooltip will be shown
   * directly below the row over which the mouse currently hovers. 
   * 
   * @author Sergejs Aleksejevs
   */
  private class JListWithPositionedToolTip extends JList
  {
    // can't easily get width of cursor from Java - this will be used to pad
    // the tooltip exactly to the right of the cursor
    private static final int CURSOR_WIDTH = 12;
    
    // the following 2 variables help decide whether the mouse has
    // moved within the row for which the tooltip is currently shown or
    // not - in the first case, position of the tooltip will stay the same;
    // in the second it will be updated
    private int indexOflastRowWithTooltip = -1;
    private Point lastToolTipLocation = null; 
    
    public JListWithPositionedToolTip(ListModel listModel) {
      super(listModel);
    }

    public Point getToolTipLocation(MouseEvent e)
    {
      int iListRowIdx = locationToIndex(e.getPoint());
      if (iListRowIdx != -1)
      {
        // mouse is over one of the rows
        if (iListRowIdx == indexOflastRowWithTooltip) {
          // keep old tooltip position
          return (lastToolTipLocation);
        }
        else {
          // calculate new tooltip position
          indexOflastRowWithTooltip = iListRowIdx;
          lastToolTipLocation = new Point(e.getX() + CURSOR_WIDTH, (int)getCellBounds(iListRowIdx,iListRowIdx).getMaxY());
          return (lastToolTipLocation);
        }
      }
      else {
        // let ToolTipManager decide where to display the tooltip if it will be shown
        return (null);
      }
    }
  }
}
