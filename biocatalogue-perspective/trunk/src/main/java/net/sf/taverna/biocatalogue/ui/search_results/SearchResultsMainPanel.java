package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.connectivity.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.biocatalogue.model.search.SearchInstanceTracker;
import net.sf.taverna.biocatalogue.ui.JClickableLabel;
import net.sf.taverna.biocatalogue.ui.JPanelWithOverlay;
import net.sf.taverna.biocatalogue.ui.SearchHistoryAndFavouritesPanel;
import net.sf.taverna.biocatalogue.ui.SearchOptionsPanel.SearchOptions;
import net.sf.taverna.biocatalogue.ui.filtertree.FilterTreePane;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

/**
 * This class represents the main panel that deals with the status
 * and results of the current search.
 * 
 * It has a status label, spinner to depict search in progress,
 * actual search results split into tabs by their type, a toolbar
 * with search history, favourite searches settings, favourite filters,
 * ability to restart last search, etc.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchResultsMainPanel extends JPanel implements ActionListener, SearchInstanceTracker
{
  private final MainComponent pluginPerspectiveMainComponent;
  private final SearchResultsMainPanel instanceOfSelf;
  
  private LinkedHashMap<TYPE, JComponent> searchResultTabs;
  private Map<TYPE, SearchResultsListingPanel> searchResultListings;
  
  // holds a reference to the instance of the search instances in the current context
  // that should be active at the moment (will aid early termination of older searches
  // when new ones are started)
  private Map<TYPE, SearchInstance> currentSearchInstances;
  
  
  // previous search instance (will include search results data if search was already executed)
  private SearchInstance siPreviousSearch;
  
  
  // COMPONENTS
  protected JPanel jpSearchStatus;
  private JLabel jlSearchSpinner;
  private JClickableLabel jclPreviewCurrentFilteringCriteria;
  
  private JTabbedPane tabbedSearchResultPanel;
  
  private JPanelWithOverlay searchResultsWithSearchHistoryAndFavouritesOverlay;
  private SearchHistoryAndFavouritesPanel searchHistoryAndFavouritesPanel;
  
  // toolbar and action buttons for it
  private JToolBar tbSearchActions;
  protected JToggleButton bToggleSearchHistory;
  protected JButton bRefreshLastSearch;
  protected JButton bClearSearchResults;
  
  
  public SearchResultsMainPanel()
  {
    this.instanceOfSelf = this;
    this.pluginPerspectiveMainComponent = MainComponentFactory.getSharedInstance();
    
    this.searchResultListings = new HashMap<TYPE, SearchResultsListingPanel>();
    this.searchResultTabs = new LinkedHashMap<TYPE, JComponent>(); // crucial to preserve the order -- so that these tabs always appear in the UI in the same order!
    initialiseResultTabsMap();
    
    this.currentSearchInstances = new HashMap<TYPE,SearchInstance>();
    
    initialiseUI();
  }
  
  
  private void initialiseUI()
  {
    /*
     * Search results component group - status at the top, 
     * tabbed listing in the middle, action buttons at the bottom.
     */
    
    // prepare search results status panel
    jpSearchStatus = new JPanel(new GridBagLayout());
    setSearchStatusText("No searches were made yet", false);
    
    jlSearchSpinner = new JLabel(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE));
    jclPreviewCurrentFilteringCriteria = new JClickableLabel("<html>filtering criteria<span color=\"black\"> ...</span></html>", BioCataloguePluginConstants.ACTION_PREVIEW_CURRENT_FILTER, instanceOfSelf,
                                                             null, JLabel.CENTER, "Preview current filtering criteria");
    
    
    // create a panel for tabbed listings of search results
    this.tabbedSearchResultPanel = new JTabbedPane();
    reloadResultTabsFromMap();
    
    
    // create panel with search history and favourite searches -
    // wrap both of them into a panel with overlay
    searchHistoryAndFavouritesPanel = new SearchHistoryAndFavouritesPanel(this);
    searchResultsWithSearchHistoryAndFavouritesOverlay = 
      new JPanelWithOverlay(tabbedSearchResultPanel, searchHistoryAndFavouritesPanel, JPanelWithOverlay.HORIZONTAL_SPLIT, false, false);
    
    // pack all main components together
    JPanel jpMainResultsPanel = new JPanel(new BorderLayout());
    jpMainResultsPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 3));
    jpMainResultsPanel.add(jpSearchStatus, BorderLayout.NORTH);
    jpMainResultsPanel.add(searchResultsWithSearchHistoryAndFavouritesOverlay, BorderLayout.CENTER);
    
    
    // --- Create action toolbar ---
    bToggleSearchHistory = new JToggleButton(ResourceManager.getImageIcon(ResourceManager.HISTORY_ICON));
    bToggleSearchHistory.setToolTipText("View your favourite searches and search history");
    bToggleSearchHistory.addActionListener(this);
    searchResultsWithSearchHistoryAndFavouritesOverlay.registerOverlayActivationToggleButton(bToggleSearchHistory);
    
    bRefreshLastSearch = new JButton(ResourceManager.getImageIcon(ResourceManager.REFRESH_ICON));
    bRefreshLastSearch.setToolTipText("Run previous search once again");
    bRefreshLastSearch.addActionListener(this);
    bRefreshLastSearch.setEnabled(false);
    
    bClearSearchResults = new JButton(ResourceManager.getImageIcon(ResourceManager.CLEAR_ICON));
    bClearSearchResults.setToolTipText("Clear the search results (and stop current search if it is running)");
    bClearSearchResults.addActionListener(this);
    bClearSearchResults.setEnabled(false);
    
    tbSearchActions = new JToolBar(JToolBar.VERTICAL);
    tbSearchActions.setBorderPainted(true);
    tbSearchActions.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 3));
    tbSearchActions.setFloatable(false);
    tbSearchActions.addSeparator(new Dimension(0, 31));  // creates vertical spacing, so that toolbar buttons start at the top of results tabbed pane
    tbSearchActions.add(bToggleSearchHistory);
    tbSearchActions.addSeparator();
    tbSearchActions.add(bRefreshLastSearch);
    tbSearchActions.add(bClearSearchResults);

    // --- Put together all parts ---
    // main components in the middle, toolbar on the right
    this.setMinimumSize(new Dimension(450, 50));
    this.setLayout(new BorderLayout());
    this.add(jpMainResultsPanel, BorderLayout.CENTER);
    this.add(tbSearchActions, BorderLayout.EAST);
  }
  
  
  
  // ----- Hiding / Showing tabs for various search result types -----
  
  /**
   * Dynamically populates the map of resource types and components that represent these types
   * in the tabbed pane -- this is only to be done once during the initialisation.
   */
  private void initialiseResultTabsMap()
  {
    for (TYPE t : TYPE.values()) {
      toggleResultTabsInMap(t, t.isDefaultSearchType());
    }
  }
  
  
  /**
   * Adds or removes a tab for a specified type of resource.
   * 
   * @param type Resource type for which the tab is to be added / removed.
   * @param doShowTab Defines whether to add or remove tab for this resource type.
   */
  public void toggleResultTabsInMap(TYPE type, boolean doShowTab)
  {
    JPanel jpResultTabContent = null;
    
    if (doShowTab)
    {
      jpResultTabContent = new JPanel(new GridBagLayout());
      GridBagConstraints c = new GridBagConstraints();
      c.gridx = 0;
      c.gridy = 0;
      c.anchor = GridBagConstraints.WEST;
      c.fill = GridBagConstraints.VERTICAL;
      c.weightx = 0;
      c.weighty = 1.0;
      
      // TODO - have a switch here to generate correct panels here
      switch (type)
      {
        case Service: 
          jpResultTabContent.add(new FilterTreePane(BioCatalogueClient.API_SERVICE_FILTERS_URL), c);
          break;
        
        case SOAPOperation:
          jpResultTabContent.add(new FilterTreePane(BioCatalogueClient.API_SOAP_OPERATION_FILTERS_URL), c);
          break;
          
        case RESTMethod:
          jpResultTabContent.add(new FilterTreePane(BioCatalogueClient.API_REST_METHOD_FILTERS_URL), c);
          break;
          
        default:
          /* TODO: do nothing? */
      }
      
      c.gridx++;
      c.weightx = 1.0;
      c.weighty = 1.0;
      c.fill = GridBagConstraints.BOTH;
      SearchResultsListingPanel resultsListingPanel = new SearchResultsListingPanel(type, this);
      jpResultTabContent.add(resultsListingPanel, c);
      this.searchResultListings.put(type, resultsListingPanel);
    }
    
    this.searchResultTabs.put(type, jpResultTabContent);
  }
  
  
  /**
   * (Re-)loads the user interface from the internal map.
   */
  public void reloadResultTabsFromMap()
  {
    Component selectedTabsComponent = tabbedSearchResultPanel.getSelectedComponent();
    tabbedSearchResultPanel.removeAll();
    for (TYPE type : this.searchResultTabs.keySet()) {
      JComponent c = this.searchResultTabs.get(type);
      if (c != null) {
        tabbedSearchResultPanel.addTab(type.getCollectionName(), type.getIcon(), c, /*tooltip*/null);
      }
    }
    
    // attempt to re-select the same tab that was open before reloading
    try {
      tabbedSearchResultPanel.setSelectedComponent(selectedTabsComponent);
    }
    catch (IllegalArgumentException e) {
      // failed - probably previously selected tab got removed - select the first one
      tabbedSearchResultPanel.setSelectedIndex(0);
    }
  }
  
  
  /**
   * @param resourceType Resource type to look for.
   * @return Current index of the tab in the results tabbed pane view
   *         that holds a component showing search results for this type.
   *         Returns <code>-1</code> if requested type is not currently displayed.
   */
  protected int getTabIndexForResourceType(TYPE resourceType) {
    return (tabbedSearchResultPanel.indexOfComponent(searchResultTabs.get(resourceType)));
  }
  
  
  // ----- ------
  
  
  
  
  
  /**
   * This method is called when search results from Search Tab need to be
   * transferred to the Filtering tab.
   * 
   * The main thing that this achieves is the deep copy of provided
   * SearchInstance object, so that the 2 tabs are completely independent.  
   * 
   * Also, this initiates rendering of the search results without performing
   * the new search.
   * 
   * @param si SearchInstance with search results to filter.
   */
  protected void prepareForServiceFilteringFromExistingSearchInstance(SearchInstance si)
  {
    // FIXME
//    // start with cloning the SearchInstance - local copy will be altered, but
//    // we don't want this to affect the provided instance
//    this.siPreviousSearch = si.deepCopy();
//    
//    // display found services from received search instance - the
//    // tabbed results pane will automatically know to display only
//    // services, because it runs within the Filtering, not Search tab
//    this.searchResultsPanel.renderResults(siPreviousSearch, false);
//    
//    // since some results are available, can safely allow to clear them or
//    // to refresh
//    bRefreshLastSearch.setEnabled(true);
//    bClearSearchResults.setEnabled(true);
  }
  
  
  /**
   * This method is intended to be called when "Filter" button is pressed
   * in the Filtering Tab. It starts the new filtering operation.
   * 
   * Effectively it sets the filtering parameters for the SearchInstance
   * and then starts a new search with that SearchInstance.
   * 
   * NB! If a <code>SearchInstance si</code> with filtering settings pre-set already exists,
   *     caller should use <code>startNewSearch(si)</code> directly.
   * 
   * @param filteringSettings Filtering settings for the current filtering operation
   *                          obtained from the filter tree (or favourite filters).
   */
  protected void startNewFiltering(ServiceFilteringSettings filteringSettings)
  {
    // FIXME
//    // pass on the filtering parameters to the relevant search instance (this will overwrite the old ones if any were present!)
//    if (siPreviousSearch == null) {
//      // no filterings have been done earlier and no search results have been transferred
//      // from the Search tab; we'll need a new (blank) query search SearchInstance and
//      // wrap it into a service filtering SearchInstance
//      siPreviousSearch = new SearchInstance(new SearchInstance("", true, true, true, false, false), filteringSettings);
//    }
//    else {
//      if (!siPreviousSearch.isServiceFilteringSearch()) {
//        // just wrap existing search instance that was (probably) transferred from the Search tab
//        // into another SearchInstance that explicitly deals with service filtering
//        siPreviousSearch = new SearchInstance(siPreviousSearch, filteringSettings);
//      }
//      else {
//        // previous search instance dealt with filtering -
//        // simply update the filtering settings
//        siPreviousSearch.setFilteringParameters(filteringSettings);
//      }
//    }
//    
//    // proceed with "search" as usual - it will treat this search instance differently
//    // from "ordinary" search
//    startNewSearch(siPreviousSearch);
  }
  
  
  /**
   * Worker method responsible for starting a new search via the API.
   * 
   * This method is to be used when a *new* search is started. It will
   * mainly make updates to the UI and store the new search in the history.
   * 
   * Another worker method is then called to actually initiate the search
   * operation. 
   */
  public void startNewSearch(final SearchOptions searchOptions)
  {
    new Thread("Search via the API") {
      public void run() {
        try {
          // "forget" about any old searches - new ones will be recorded 
          clearPreviousSearchInstances();
          
          // SEARCH
          CountDownLatch searchDoneSignal = new CountDownLatch(1);
          
          for (TYPE resourceType : searchOptions.getResourceTypesToSearchFor())
          {
            // start spinner icon for this tab to indicate search in progress
            setSpinnerIconForTab(resourceType);
            setDefaultTitleForTab(resourceType);
            
            SearchInstance si = null;
            if (searchOptions.getSearchType() == SearchInstance.TYPE.QuerySearch) {
              si = new SearchInstance(searchOptions.getSearchString(), resourceType);
            }
            else {
              si = new SearchInstance(searchOptions.getSearchTags(), resourceType);
            }
            
            // Record 'this' search instance and set it as the new "primary" one for
            // this resource type;
            // (this way it if a new search thread starts afterwards, it is possible to
            //  detect this and stop the 'older' search, because it is no longer relevant)
            registerSearchInstance(resourceType, si);
            
            si.startNewSearch(instanceOfSelf, searchDoneSignal, searchResultListings.get(resourceType));
          }
          
          searchDoneSignal.await(); // block until the search is complete
          
          JOptionPane.showMessageDialog(null, "all search threads finished -- " + searchDoneSignal.toString());
        }
        catch (Exception e) {
          System.err.println("\n\nError while searching via BioCatalogue API. Error details:");
          e.printStackTrace();
        }
      }
    }.start();
    
    
    
    // FIXME
//    // search was initiated - allow to re-run it at any time now
//    bRefreshLastSearch.setEnabled(true);
//    
//    // NB! this is required for search to be treated as "new" one - it could be that
//    //     this method is called as a search from history/favourites, but this *must*
//    //     appear as a new search either way
//    searchInstance.clearSearchResults();
//    
//    // store these search settings as the current search
//    this.siPreviousSearch = searchInstance;
//    
//    // update search history (but only do so when working within the Search Tab)
//    this.searchHistoryAndFavouritesPanel.addToSearchHistory(searchInstance);
//    
//    // now call another worker method to perform the remainder of search operations
//    // which are common for new searches and fetching more results
//    startSearch(searchOptions);
  }
  
  
  /**
   * This method is to be used when a further results for an existing search are obtained.
   * It will not make UI updates that are done at the start of the new search.
   */
  protected void startSearch(final SearchOptions searchInstance)
  {
    // FIXME - show spinner icons on all tabs that start search
    
    // FIXME
//    new Thread("Search via the API") {
//      public void run() {
//        try {
//          // Record 'this' search thread and set it as the new "primary" one
//          // (this way it if a new search thread starts afterwards, it is possible to
//          //  detect this and stop the 'older' search, because it is no longer relevant)
//          final Long lThisSearchThreadID = Thread.currentThread().getId();
//          vCurrentSearchThreadID.set(0, lThisSearchThreadID);
//          
//          // SHOW SEARCHING... STATUS  -- TODO: fix this FIXME
//          String searchStatus = "";
////          if (bRunsInSearchTab) {
//            if (bDoFetchAllResults) searchStatus += "Fetching all results";
//            else if (!searchInstance.isNewSearch()) searchStatus += "Fetching more results";
//            else searchStatus += "Searching";
//            
//            searchStatus += " for " + (searchInstance.isTagSearch() ? "tag " : "") +
//                            "\"" + searchInstance.getSearchTerm() + "\"...";
////          }
////          else {
////            if (bDoFetchAllResults) searchStatus += "Fetching all results for services index filtered";
////            else if (!searchInstance.isNewSearch()) searchStatus += "Fetching more results for services index filtered";
////            else searchStatus += "Filtering services index";
////            
////            searchStatus += " by " + 
////                            (searchInstance.getSearchTerm().length() > 0 ?
////                             (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
////                             "");
////          }
//          setSearchStatusText(searchStatus, true);
//          
//          
//          // SEARCH
//          CountDownLatch searchDoneSignal = new CountDownLatch(1);
//          searchInstance.executeSearch(vCurrentSearchThreadID, lThisSearchThreadID, searchDoneSignal, bDoFetchAllResults, instanceOfSelf);
//          searchDoneSignal.await(); // block until the search is complete
//          
//          // check if the current thread is still the active one (that is if a new search
//          // thread hasn't been started yet - if the new search has been started, the
//          // current one should terminate)
//          if (!isCurrentSearchThread(lThisSearchThreadID)) return;
//          
//          // it's still the active search - it was completed successfully, save the search instance as the 'previous search'
//          siPreviousSearch = searchInstance;
//          
//          // DISPLAY RESULTS
//          SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//              // display search results
//              searchResultsPanel.renderResults(searchInstance, false);
//              
//              // if a new search was not initiated by now, "forget" about the current search
//              // thread, because it has finished all work
//              if (isCurrentSearchThread(lThisSearchThreadID)) vCurrentSearchThreadID.set(0, null);
//              
//              // all done, allow to refresh and clear results now
//              bRefreshLastSearch.setEnabled(true);
//              bClearSearchResults.setEnabled(true);
//            }
//          });
//        }
//        catch (Exception e) {
//          System.err.println("\n\nError while searching via BioCatalogue API. Error details:");
//          e.printStackTrace();
//        }
//      }
//    }.start();
  }
  
  
  /**
   * Allows to set the search status by supplying the message to display.
   * Call to this method will also activate the search indicator
   * (e.g. a "spinner" image).
   * 
   * @param searchTerm The current search term.
   * @param isSpinnerActive Indicates whether or not the search spinner image should be active.
   */
  protected void setSearchStatusText(String statusString, boolean isSpinnerActive)
  {
    this.jpSearchStatus.removeAll();
    
    JPanel jpStatusDetails = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.anchor = GridBagConstraints.WEST;
    c.weightx = 0;
    jpStatusDetails.add(new JLabel(statusString.trim()), c);
    
    c.weightx = 1.0;
    c.insets = new Insets(0, 4, 0, 0);
//    jpStatusDetails.add(jclPreviewCurrentFilteringCriteria, c); // FIXME - this is null
    
    c.insets = new Insets(0, 0, 0, 0);
    c.weightx = 1.0;
    this.jpSearchStatus.add(jpStatusDetails, c);
    
    if (isSpinnerActive) {
      c.weightx = 0;  // component having a weight of zero is always shown - because even if container expands, it won't get any more space
      c.insets = new Insets(0, 5, 0, 0);
      this.jpSearchStatus.add(jlSearchSpinner, c);
    }
    
    this.jpSearchStatus.validate();
    this.jpSearchStatus.repaint();
  }
  
  
  protected void setSpinnerIconForTab(TYPE resourceType) {
    tabbedSearchResultPanel.setIconAt(getTabIndexForResourceType(resourceType), ResourceManager.getImageIcon(ResourceManager.SPINNER));
  }
  
  protected void setDefaultIconForTab(TYPE resourceType) {
    this.tabbedSearchResultPanel.setIconAt(getTabIndexForResourceType(resourceType), resourceType.getIcon());
  }
  
  
  /**
   * Same as {@link SearchResultsMainPanel#setDefaultTitleForTab(TYPE)},
   * but allows to append a specified string at the end of the default title.
   * 
   * @param resourceType
   * @param suffix
   */
  protected void setDefaultTitleForTabWithSuffix(TYPE resourceType, String suffix) {
    tabbedSearchResultPanel.setTitleAt(getTabIndexForResourceType(resourceType),
        resourceType.getCollectionName() + (suffix == null ? "" : suffix) );
  }
  
  
  /**
   * Sets default title for a tab that contains panel representing 
   * search results of the specified resource type. Default title
   * is just a name of the collections of resources in that tab. 
   * 
   * @param resourceType 
   */
  protected void setDefaultTitleForTab(TYPE resourceType) {
    setDefaultTitleForTabWithSuffix(resourceType, null);
  }
  
  
  /**
   * @param resourceType Resource type for which the search result listing panel is requested.
   * @return Reference to the requested panel or <code>null</code> if a tab for the specified
   *         <code>resourceType</code> does not exist.
   */
  protected SearchResultsListingPanel getResultsListingFor(TYPE resourceType) {
    return (this.searchResultListings.get(resourceType));
  }
  
  
  /**
   * @return An instance of the JPanel that holds search history,
   *         favourite searches and filters.
   */
  protected SearchHistoryAndFavouritesPanel getHistoryAndFavouritesPanel() {
    return (this.searchHistoryAndFavouritesPanel);
  }
  
  
  /**
   * @return An instance of the JPanel with the overlay of search history and
   *         favourite searches.
   */
  protected JPanelWithOverlay getHistoryAndFavouritesOverlayPanel() {
    return (this.searchResultsWithSearchHistoryAndFavouritesOverlay);
  }
  
  
  // *** Callback for ActionListener interface ***
  
  public void actionPerformed(ActionEvent e)
  {
    // FIXME -- remove this...
//    if (e.getSource().equals(bMoreResults))
//    {
//      // disable "all results" and "more results" buttons
//      bAllResults.setEnabled(false);
//      bMoreResults.setEnabled(false);
//      
//      // need to fetch more results
//      startSearch(siPreviousSearch, false);
//    }
//    else if (e.getSource().equals(bAllResults))
//    {
//      // need to fetch all results for the current search
//      
//      // will display the progress bar on top of "All Results" button during data fetching
//      jpbProgress = new JProgressBar(0, 100); // standard progress bar - represents fetched result percentage
//      jpbProgress.setStringPainted(true);
//      jpbProgress.setValue((int)((double)siPreviousSearch.getSearchResults().getFetchedItemCount(Resource.ALL_RESOURCE_TYPES) / 
//          siPreviousSearch.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) * 100));
//      bAllResults.setLayout(new BorderLayout());
//      bAllResults.add(jpbProgress, BorderLayout.CENTER);
//      bAllResults.setBorder(BorderFactory.createEmptyBorder());
//      
//      startSearch(siPreviousSearch, true);
//    }
//    
//    else if (e.getSource().equals(bToggleSearchHistory)) {
//      // show search history and favourites
//      searchResultsWithSearchHistoryAndFavouritesOverlay.setOverlayVisible(bToggleSearchHistory.isSelected());
//    }
//    else if (e.getSource().equals(bRefreshLastSearch))
//    {
//      // restore state of the search options panel
//      pluginPerspectiveMainComponent.getSearchTab().restoreSearchOptions(siPreviousSearch);
//      
//      // completely re-run the previous search
//      startNewSearch(siPreviousSearch);
//    }
//    else if (e.getSource().equals(bClearSearchResults))
//    {
//      // manual request to clear results of previous search
//      
//      // if any search thread was running, deactivate it as well
//      if (isSearchThreadRunning()) {
//        vCurrentSearchThreadID.set(0, null);
//      }
//      
//      // changing both - spinner image and the status text simultaneously
//      setSearchStatusText("No searches were made yet", false);
//      
//      // removed the previous search, hence makes no sense to allow to clear "previous" results again
//      bClearSearchResults.setEnabled(false);
//      
//      // only remove data about previous search and disable refresh button 
//      // if no search thread is currently running - otherwise keep the button
//      // enabled in case there is a need to re-start the search if it's frozen
//      if (!isSearchThreadRunning()) {
//        siPreviousSearch = null;
//        bRefreshLastSearch.setEnabled(false);
//      }
//      
//      // also notify tabbed results panel, so that it removes the actual search results 
//      searchResultsPanel.clearPreviousSearchResults();
//    }
//    else if (e.getSource().equals(this.jclPreviewCurrentFilteringCriteria))
//    {
//      // open a preview window showing current filtering settings
//      SwingUtilities.invokeLater(new Runnable()
//      {
//        public void run() {
//          ServiceFilteringSettingsPreview p = new ServiceFilteringSettingsPreview(siPreviousSearch.getFilteringSettings());
//          p.setVisible(true);
//        }
//      });
//      
//    }
  }
  
  
  // *** Callbacks for SearchInstanceTracker interface ***
  
  public void clearPreviousSearchInstances() {
    this.currentSearchInstances.clear();
  }
  
  public boolean isCurrentSearchInstance(TYPE searchType, SearchInstance searchInstance) {
    // NB! it is crucial to perform test by reference here (hence the use of "==", not equals()!)
    return (this.currentSearchInstances.get(searchType) == searchInstance);
  }
  
  public void registerSearchInstance(TYPE searchType, SearchInstance searchInstance) {
    this.currentSearchInstances.put(searchType, searchInstance);
  }
  
}
