package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

import org.apache.log4j.Logger;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceFilteringSettings;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.biocatalogue.model.search.SearchResults;
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
public class SearchResultsMainPanel extends JPanel implements ActionListener, PartialSearchResultsRenderer
{
  private final MainComponent pluginPerspectiveMainComponent;
  private final SearchResultsMainPanel instanceOfSelf;
  
  // holds a reference to the instance of the search thread in the current context
  // that should be active at the moment (will aid early termination of older searches
  // when new ones are started)
  private Vector<Long> vCurrentSearchThreadID;
  
  // previous search instance (will include search results data if search was already executed)
  private SearchInstance siPreviousSearch;
  
  
  // COMPONENTS
  protected JPanel jpSearchStatus;
  private JLabel jlSearchSpinner;
  private JClickableLabel jclPreviewCurrentFilteringCriteria;
  
  private JPanelWithOverlay searchResultsWithSearchHistoryAndFavouritesOverlay;
  private SearchResultsTabbedViewPanel searchResultsPanel;
  private SearchHistoryAndFavouritesPanel searchHistoryAndFavouritesPanel;
  
  protected JButton bMoreResults;
  protected JButton bAllResults;
  
  private JProgressBar jpbProgress;
  
  // toolbar and action buttons for it
  private JToolBar tbSearchActions;
  protected JToggleButton bToggleSearchHistory;
  protected JButton bRefreshLastSearch;
  protected JButton bClearSearchResults;
  
  
  public SearchResultsMainPanel()
  {
    this.pluginPerspectiveMainComponent = MainComponentFactory.getSharedInstance();
    
    this.instanceOfSelf = this;
    
    this.vCurrentSearchThreadID = new Vector<Long>();
    this.vCurrentSearchThreadID.add(null);
    
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
    
    // create action buttons (bottom of the panel)
    bMoreResults = new JButton("More results");
    bMoreResults.setEnabled(false);
    bMoreResults.addActionListener(this);
    bAllResults = new JButton("All results");
    bAllResults.setEnabled(false);
    bAllResults.addActionListener(this);
    
    JPanel jpActionButtons = new JPanel();
    jpActionButtons.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    GridLayout gl = new GridLayout(1,0);
    gl.setHgap(5);
    jpActionButtons.setLayout(gl);
    jpActionButtons.add(bMoreResults);
    jpActionButtons.add(bAllResults);
    
    // create a panel for tabbed listings of search results; panel with search history and favourite searches -
    // wrap both of them into a panel with overlay
    searchResultsPanel = new SearchResultsTabbedViewPanel(this);
    searchHistoryAndFavouritesPanel = new SearchHistoryAndFavouritesPanel(this);
    searchResultsWithSearchHistoryAndFavouritesOverlay = 
      new JPanelWithOverlay(searchResultsPanel, searchHistoryAndFavouritesPanel, JPanelWithOverlay.HORIZONTAL_SPLIT, false, false);
    
    // pack all main components together
    JPanel jpMainResultsPanel = new JPanel(new BorderLayout());
    jpMainResultsPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 3));
    jpMainResultsPanel.add(jpSearchStatus, BorderLayout.NORTH);
    jpMainResultsPanel.add(searchResultsWithSearchHistoryAndFavouritesOverlay, BorderLayout.CENTER);
    jpMainResultsPanel.add(jpActionButtons, BorderLayout.SOUTH);
    
    
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
    // start with cloning the SearchInstance - local copy will be altered, but
    // we don't want this to affect the provided instance
    this.siPreviousSearch = si.deepCopy();
    
    // display found services from received search instance - the
    // tabbed results pane will automatically know to display only
    // services, because it runs within the Filtering, not Search tab
    this.searchResultsPanel.renderResults(siPreviousSearch, false);
    
    // since some results are available, can safely allow to clear them or
    // to refresh
    bRefreshLastSearch.setEnabled(true);
    bClearSearchResults.setEnabled(true);
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
    // pass on the filtering parameters to the relevant search instance (this will overwrite the old ones if any were present!)
    if (siPreviousSearch == null) {
      // no filterings have been done earlier and no search results have been transferred
      // from the Search tab; we'll need a new (blank) query search SearchInstance and
      // wrap it into a service filtering SearchInstance
      siPreviousSearch = new SearchInstance(new SearchInstance("", true, true, true, false, false), filteringSettings);
    }
    else {
      if (!siPreviousSearch.isServiceFilteringSearch()) {
        // just wrap existing search instance that was (probably) transferred from the Search tab
        // into another SearchInstance that explicitly deals with service filtering
        siPreviousSearch = new SearchInstance(siPreviousSearch, filteringSettings);
      }
      else {
        // previous search instance dealt with filtering -
        // simply update the filtering settings
        siPreviousSearch.setFilteringParameters(filteringSettings);
      }
    }
    
    // proceed with "search" as usual - it will treat this search instance differently
    // from "ordinary" search
    startNewSearch(siPreviousSearch);
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
  protected void startNewSearch(SearchInstance searchInstance)
  {
    // this doesn't make any harm, even if fetching all results
    // wasn't attempted before this, but just in case try to revert
    // some buttons to a normal state
    adjustUIOnStopFetchAllResultsThread();
    
    // search was initiated - allow to re-run it at any time now
    bRefreshLastSearch.setEnabled(true);
    
    // NB! this is required for search to be treated as "new" one - it could be that
    //     this method is called as a search from history/favourites, but this *must*
    //     appear as a new search either way
    searchInstance.clearSearchResults();
    
    // store these search settings as the current search
    this.siPreviousSearch = searchInstance;
    
    // update search history (but only do so when working within the Search Tab)
    this.searchHistoryAndFavouritesPanel.addToSearchHistory(searchInstance);
    
    // now call another worker method to perform the remainder of search operations
    // which are common for new searches and fetching more results
    startSearch(searchInstance, false);
  }
  
  
  /**
   * This method is to be used when a further results for an existing search are obtained.
   * It will not make UI updates that are done at the start of the new search.
   */
  protected void startSearch(final SearchInstance searchInstance, final boolean bDoFetchAllResults)
  {
    // disable "all results" and "more results" buttons
    bAllResults.setEnabled(false);
    bMoreResults.setEnabled(false);
    
    new Thread("Search via the API") {
      public void run() {
        try {
          // Record 'this' search thread and set it as the new "primary" one
          // (this way it if a new search thread starts afterwards, it is possible to
          //  detect this and stop the 'older' search, because it is no longer relevant)
          final Long lThisSearchThreadID = Thread.currentThread().getId();
          vCurrentSearchThreadID.set(0, lThisSearchThreadID);
          
          // SHOW SEARCHING... STATUS  -- TODO: fix this FIXME
          String searchStatus = "";
//          if (bRunsInSearchTab) {
            if (bDoFetchAllResults) searchStatus += "Fetching all results";
            else if (!searchInstance.isNewSearch()) searchStatus += "Fetching more results";
            else searchStatus += "Searching";
            
            searchStatus += " for " + (searchInstance.isTagSearch() ? "tag " : "") +
                            "\"" + searchInstance.getSearchTerm() + "\"...";
//          }
//          else {
//            if (bDoFetchAllResults) searchStatus += "Fetching all results for services index filtered";
//            else if (!searchInstance.isNewSearch()) searchStatus += "Fetching more results for services index filtered";
//            else searchStatus += "Filtering services index";
//            
//            searchStatus += " by " + 
//                            (searchInstance.getSearchTerm().length() > 0 ?
//                             (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
//                             "");
//          }
          setSearchStatusText(searchStatus, true);
          
          
          // SEARCH
          CountDownLatch searchDoneSignal = new CountDownLatch(1);
          searchInstance.executeSearch(vCurrentSearchThreadID, lThisSearchThreadID, searchDoneSignal, bDoFetchAllResults, instanceOfSelf);
          searchDoneSignal.await(); // block until the search is complete
          
          // check if the current thread is still the active one (that is if a new search
          // thread hasn't been started yet - if the new search has been started, the
          // current one should terminate)
          if (!isCurrentSearchThread(lThisSearchThreadID)) return;
          
          // it's still the active search - it was completed successfully, save the search instance as the 'previous search'
          siPreviousSearch = searchInstance;
          
          // DISPLAY RESULTS
          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              // display search results
              searchResultsPanel.renderResults(searchInstance, false);
              
              // if this was 'fetch all results' type of search, return UI back to normal
              if (bDoFetchAllResults) adjustUIOnStopFetchAllResultsThread();
              
              // if a new search was not initiated by now, "forget" about the current search
              // thread, because it has finished all work
              if (isCurrentSearchThread(lThisSearchThreadID)) vCurrentSearchThreadID.set(0, null);
              
              // all done, allow to refresh and clear results now
              bRefreshLastSearch.setEnabled(true);
              bClearSearchResults.setEnabled(true);
            }
          });
        }
        catch (Exception e) {
          System.err.println("\n\nError while searching via BioCatalogue API. Error details:");
          e.printStackTrace();
        }
      }
    }.start();
  }
  
  
  /**
   * Return "all results" button into a normal state.
   * (To be invoked when fetching all results has been finished).
   */
  protected void adjustUIOnStopFetchAllResultsThread() {
    // return "all results" button to a normal state
    bAllResults.removeAll();
    bAllResults.setBorder(new JButton().getBorder());
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
    jpStatusDetails.add(jclPreviewCurrentFilteringCriteria, c);
    
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
  
  
  /**
   * @return Boolean value; true if the search tab has a search thread which is currently running.
   */
  public boolean isSearchThreadRunning() {
    return (this.vCurrentSearchThreadID.get(0) != null);
  }
  
  
  /**
   * Checks if supplied thread is the active search thread.
   * 
   * This is checked against one of the search threads that
   * were started to support the UI in this panel, rather than
   * against the real search threads operated by the search engine.
   * 
   * @param threadID ID of the thread to check.
   * @return True if the provided <code>threadID</code> is indeed the
   *         active search thread; false otherwise.
   */
  public boolean isCurrentSearchThread(Long threadID)
  {
    return (threadID == null ?
            false :
            threadID.equals(vCurrentSearchThreadID.get(0)));
  }
  
  
  // *** Callback for PartialSearchResultsRenderer ***
  
  public void renderPartialResults(Long searchThreadID, final SearchInstance si)
  {
    if (isCurrentSearchThread(searchThreadID))
    {
      // NB! critical to have UI update done within the invokeLater()
      //     method - this is to prevent UI from 'flashing' and to
      //     avoid some weird errors
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          // update the progress bar
          jpbProgress.setValue((int)((double)si.getSearchResults().getFetchedItemCount(Resource.ALL_RESOURCE_TYPES) / 
              si.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) * 100));
          
          // display the partial search results
          searchResultsPanel.renderResults(si, true);
        }
      });
    }
  }
  
  
  // *** Callback for ActionListener interface ***
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource().equals(bMoreResults))
    {
      // disable "all results" and "more results" buttons
      bAllResults.setEnabled(false);
      bMoreResults.setEnabled(false);
      
      // need to fetch more results
      startSearch(siPreviousSearch, false);
    }
    else if (e.getSource().equals(bAllResults))
    {
      // need to fetch all results for the current search
      
      // will display the progress bar on top of "All Results" button during data fetching
      jpbProgress = new JProgressBar(0, 100); // standard progress bar - represents fetched result percentage
      jpbProgress.setStringPainted(true);
      jpbProgress.setValue((int)((double)siPreviousSearch.getSearchResults().getFetchedItemCount(Resource.ALL_RESOURCE_TYPES) / 
          siPreviousSearch.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) * 100));
      bAllResults.setLayout(new BorderLayout());
      bAllResults.add(jpbProgress, BorderLayout.CENTER);
      bAllResults.setBorder(BorderFactory.createEmptyBorder());
      
      startSearch(siPreviousSearch, true);
    }
    
    else if (e.getSource().equals(bToggleSearchHistory)) {
      // show search history and favourites
      searchResultsWithSearchHistoryAndFavouritesOverlay.setOverlayVisible(bToggleSearchHistory.isSelected());
    }
    else if (e.getSource().equals(bRefreshLastSearch))
    {
      // disable "all results" and "more results" buttons
      bAllResults.setEnabled(false);
      bMoreResults.setEnabled(false);
      
      // restore state of the search options panel
      pluginPerspectiveMainComponent.getSearchTab().restoreSearchOptions(siPreviousSearch);
      
      // completely re-run the previous search
      startNewSearch(siPreviousSearch);
    }
    else if (e.getSource().equals(bClearSearchResults))
    {
      // manual request to clear results of previous search
      
      // if any search thread was running, deactivate it as well
      if (isSearchThreadRunning()) {
        vCurrentSearchThreadID.set(0, null);
      }
      
      // changing both - spinner image and the status text simultaneously
      setSearchStatusText("No searches were made yet", false);
      
      // removed the previous search, hence makes no sense to allow to clear "previous" results again
      bClearSearchResults.setEnabled(false);
      
      // only remove data about previous search and disable refresh button 
      // if no search thread is currently running - otherwise keep the button
      // enabled in case there is a need to re-start the search if it's frozen
      if (!isSearchThreadRunning()) {
        siPreviousSearch = null;
        bRefreshLastSearch.setEnabled(false);
      }
      
      // also notify tabbed results panel, so that it removes the actual search results 
      searchResultsPanel.clearPreviousSearchResults();
    }
    else if (e.getSource().equals(this.jclPreviewCurrentFilteringCriteria))
    {
      // open a preview window showing current filtering settings
      SwingUtilities.invokeLater(new Runnable()
      {
        public void run() {
          ServiceFilteringSettingsPreview p = new ServiceFilteringSettingsPreview(siPreviousSearch.getFilteringSettings());
          p.setVisible(true);
        }
      });
      
    }
  }

}
