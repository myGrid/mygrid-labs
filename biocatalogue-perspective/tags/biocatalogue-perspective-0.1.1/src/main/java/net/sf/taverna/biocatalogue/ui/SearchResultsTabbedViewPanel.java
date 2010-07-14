package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.SearchInstance;
import net.sf.taverna.biocatalogue.model.SearchResults;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.User;

import edu.stanford.ejalbert.BrowserLauncher;

/**
 * This class is responsible for producing search results output
 * panel. It only contains the tabbed pane; each tab shows results
 * of one particular type as a list wrapped into a scroll pane. 
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchResultsTabbedViewPanel extends JPanel implements ActionListener, MouseListener
{
  // main elements
  private final MainComponent pluginPerspectiveMainComponent;
  private final BioCatalogueClient client;
  private final Logger logger;
  private final SearchResultsMainPanel parentMainSearchResultsPanel;
  
  // currently displayed search results
  SearchInstance searchInstance;
  
  
  // main UI components
  private JTabbedPane tpSearchResults;
  private JPanel jpResultsContainer;
  
  private JList jlFoundUsers;
  private JList jlFoundServices;
  private JList jlFoundServiceProviders;
  private JList jlFoundRegistries;
  
  private JScrollPane spFoundUsers;
  private JScrollPane spFoundServices;
  private JScrollPane spFoundServiceProviders;
  private JScrollPane spFoundRegistries;
  
  // this panel will hold the scroll pane with found services and the suggestion to filter those
  private JPanel jpFoundServices; 
  private JClickableLabel jclServiceFilteringSuggestion;
  
  // contextual menu
  private JPopupMenu contextualMenu;
  
  // this is used for previewing items from the tabbed result panels through contextual menu -
  // value will be updated by mouse event accordingly
  private ResourceLink potentialObjectToPreview;
  
  
  public SearchResultsTabbedViewPanel(SearchResultsMainPanel parentMainSearchResultsPanel, 
                                      MainComponent pluginPerspectiveMainComponent,
                                      BioCatalogueClient client, Logger logger)
  {
    this.parentMainSearchResultsPanel = parentMainSearchResultsPanel;
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    initialiseUI();
  }

  
  private void initialiseUI()
  {
    // *** Create placeholders for various types of found items ***
    
    // create lists to hold search results
    jlFoundUsers = new JListWithPositionedToolTip();
    jlFoundUsers.setCellRenderer(new JResourceListCellRenderer());
    jlFoundUsers.addMouseListener(this);
    
    jlFoundServices = new JListWithPositionedToolTip();
    jlFoundServices.setCellRenderer(new JServiceListCellRenderer());
    jlFoundServices.addMouseListener(this);
    
    jlFoundServiceProviders = new JListWithPositionedToolTip();
    jlFoundServiceProviders.setCellRenderer(new JResourceListCellRenderer());
    jlFoundServiceProviders.addMouseListener(this);
    
    jlFoundRegistries = new JListWithPositionedToolTip();
    jlFoundRegistries.setCellRenderer(new JResourceListCellRenderer());
    jlFoundRegistries.addMouseListener(this);
    
    // wrap all result lists into scroll panes
    spFoundUsers = new JScrollPane(jlFoundUsers);
    spFoundServices = new JScrollPane(jlFoundServices);
    spFoundServiceProviders = new JScrollPane(jlFoundServiceProviders);
    spFoundRegistries = new JScrollPane(jlFoundRegistries);
    
    
    // there will be a suggestion to filter the results for found services, so
    // wrap the scroll pane into a panel
    jpFoundServices = new JPanel();
    jpFoundServices.setLayout(new BorderLayout());
    jpFoundServices.add(spFoundServices, BorderLayout.CENTER);
    
    // (only show suggestion to filter when in Search tab)
    if (parentMainSearchResultsPanel.isRunningInSearchTab()) {
      jclServiceFilteringSuggestion = new JClickableLabel("<html>Would you like to <b>filter</b> these services?</html>", 
          BioCataloguePluginConstants.ACTION_FILTER_FOUND_SERVICES, this,
          ResourceManager.getImageIcon(ResourceManager.SUGGESTION_TO_USER_ICON), JLabel.LEFT,
          "<html>You can apply various filters to the found services - this will help<br>" +
          "to narrow down the collection of found services.<br><br>" +
          "Clicking here will transfer found services into the \"Filter Services\"<br>" +
          "tab, where you will have a choice of filtering criteria in the tree<br>" +
          "on the left-hand side of the window.</html>");
      jclServiceFilteringSuggestion.setBorder(BorderFactory.createCompoundBorder(
          BorderFactory.createEtchedBorder(EtchedBorder.LOWERED),
          BorderFactory.createEmptyBorder(3, 3, 3, 3))
        );
      jpFoundServices.add(jclServiceFilteringSuggestion, BorderLayout.NORTH);
    }
    
    // create the panel to hold search results and the inner tabbed pane for various result types;
    tpSearchResults = new JTabbedPane();
    
    // tie components to the class panel itself
    jpResultsContainer = new JPanel();
    this.clearPreviousSearchResults();
    this.setLayout(new BorderLayout());
    this.add(jpResultsContainer, BorderLayout.CENTER);
    
    
    // *** Create CONTEXTUAL MENU ***
    JMenuItem miPreviewItem = new JMenuItem("Preview", ResourceManager.getImageIcon(ResourceManager.PREVIEW_ICON));
    miPreviewItem.setToolTipText("<html>Load and preview information about this item in a separate window.</html>");
    miPreviewItem.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        pluginPerspectiveMainComponent.getPreviewBrowser().preview(BioCataloguePluginConstants.ACTION_PREVIEW_RESOURCE +
            potentialObjectToPreview.getHref());
      }
    });
    
    JMenuItem miOpenInBioCatalogue = new JMenuItem("Open in BioCatalogue", 
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
    contextualMenu.add(miPreviewItem);
    contextualMenu.add(miOpenInBioCatalogue);
  }
  
  
  /**
   * This helper method is used to initialise the panel which is supposed to hold
   * search results. Also invoked when search results need to be cleared.
   */
  protected void clearPreviousSearchResults()
  {    
    jpResultsContainer.removeAll();
    jpResultsContainer.setLayout(new FlowLayout());
    jpResultsContainer.setBorder(
        BorderFactory.createCompoundBorder(
            BorderFactory.createEmptyBorder(5, 0, 0, 0),
            BorderFactory.createEtchedBorder()
        ));
    jpResultsContainer.add(new JLabel("No items to show"));
    jpResultsContainer.validate();
    
    // disable "more results" and "all results" buttons - have to do it from here, not
    // parent main search results panel, because results are parsed in this class and the decision
    // to enable/disable the buttons is made here, too
    parentMainSearchResultsPanel.bAllResults.setEnabled(false);
    parentMainSearchResultsPanel.bMoreResults.setEnabled(false);
    
    // this doesn't make any harm, even if fetching all results
    // wasn't attempted before this
    parentMainSearchResultsPanel.adjustUIOnStopFetchAllResultsThread();
  }
  
  
  /**
   * Statistics will be rendered along with the collection of found items.
   * 
   * The method will automatically decide whether it's running within
   * Search of Filtering tab. In Search tab any result types are shown,
   * also for services there's a suggestion to filter the results. Both
   * of these will not be available in Filtering tab. 
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
    
    // if nothing was found - display notification and finish result processing
    if (searchInstance.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) == 0) {
      String searchStatus = "No results found ";
      if (parentMainSearchResultsPanel.isRunningInSearchTab()) {
        searchStatus += "for " + (searchInstance.isTagSearch() ? "tag " : "") +
                        "\"" + searchInstance.getSearchTerm() + "\"";
      }
      else {
        searchStatus += "while filtering services index by " + 
        (searchInstance.getSearchTerm().length() > 0 ?
         (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
         "");
      }
      
      parentMainSearchResultsPanel.setSearchStatusText(searchStatus, !parentMainSearchResultsPanel.isRunningInSearchTab(), false);
      clearPreviousSearchResults();
      return;
    }
    
    // populate results
    int iOpenedTabIdx = tpSearchResults.getSelectedIndex();
    tpSearchResults.removeAll();
    
    // process each possible result type in turn (this will preserve the ordering imposed by corresponding constant values)
    // (but only display services if not runs in Search tab)
    SortedSet<Integer> itemTypesToProcess = new TreeSet<Integer>();
    itemTypesToProcess.addAll(parentMainSearchResultsPanel.isRunningInSearchTab() ? Resource.ALL_SUPPORTED_RESOURCE_TYPES : Collections.singleton(Resource.SERVICE_TYPE));
    Iterator<Integer> typeIterator = itemTypesToProcess.iterator();
    while (typeIterator.hasNext()) {
      switch(typeIterator.next()) {
        case Resource.USER_TYPE:
                              if (searchInstance.getSearchResults().getTotalItemCount(Resource.USER_TYPE) > 0) {
                                // populate the list box with users
                                DefaultListModel listModel = new DefaultListModel();
                                for (User u : searchInstance.getSearchResults().getFoundUsers()) {
                                  listModel.addElement(u);
                                }
                                jlFoundUsers.setModel(listModel);
                                tpSearchResults.add(getResultTabTitleString(Resource.USER_TYPE),
                                                    spFoundUsers);
                              }
                              break;
                                    
        case Resource.SERVICE_TYPE:
                              if (searchInstance.getSearchResults().getTotalItemCount(Resource.SERVICE_TYPE) > 0) {
                                // populate the list box with services
                                DefaultListModel listModel = new DefaultListModel();
                                for (Service s : searchInstance.getSearchResults().getFoundServices()) {
                                  listModel.addElement(s);
                                }
                                jlFoundServices.setModel(listModel);
                                tpSearchResults.add(getResultTabTitleString(Resource.SERVICE_TYPE),
                                                    jpFoundServices);  // NB! this *must* add the panel (see its creation above), not scroll pane as for other types!
                              }
                              break;
                                    
        case Resource.SERVICE_PROVIDER_TYPE: 
                              if (searchInstance.getSearchResults().getTotalItemCount(Resource.SERVICE_PROVIDER_TYPE) > 0) {
                                // populate the list box with service providers
                                DefaultListModel listModel = new DefaultListModel();
                                for (ServiceProvider sp : searchInstance.getSearchResults().getFoundServiceProviders()) {
                                  listModel.addElement(sp);
                                }
                                jlFoundServiceProviders.setModel(listModel);
                                tpSearchResults.add(getResultTabTitleString(Resource.SERVICE_PROVIDER_TYPE),
                                                    spFoundServiceProviders);
                              }
                              break;
                              
        case Resource.REGISTRY_TYPE:
                              if (searchInstance.getSearchResults().getTotalItemCount(Resource.REGISTRY_TYPE) > 0) {
                                // populate the list box with registries
                                DefaultListModel listModel = new DefaultListModel();
                                for (Registry r : searchInstance.getSearchResults().getFoundRegistries()) {
                                  listModel.addElement(r);
                                }
                                jlFoundRegistries.setModel(listModel);
                                tpSearchResults.add(getResultTabTitleString(Resource.REGISTRY_TYPE),
                                                    spFoundRegistries);
                              }
                              break;
      }
    }
    
    jpResultsContainer.removeAll();
    jpResultsContainer.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    jpResultsContainer.setLayout(new BorderLayout());
    jpResultsContainer.add(tpSearchResults, BorderLayout.CENTER);
    jpResultsContainer.repaint();
    
    
    // *** Also update status text and enable/disable relevant buttons ***
    
    // this section won't be executed if only update of tabbed results was
    // requested - generally when displaying partial results during 'long'
    // searches with multiple result pages fetched sequentially
    if (!onlyDoTabUpdate)
    {
      // some results were found; perform regular rendering;
      // start off with displaying the status of the results
      int iFetchedResultPercentage = (int)(searchInstance.getSearchResults().getFetchedItemCount(Resource.ALL_RESOURCE_TYPES) * 1.0 /
                                           searchInstance.getSearchResults().getTotalItemCount(Resource.ALL_RESOURCE_TYPES) * 100);
      
      String searchStatus = "";
      if (parentMainSearchResultsPanel.isRunningInSearchTab()) {
        searchStatus += "Search results for " + (searchInstance.isTagSearch() ? "tag " : "") +
        "\"" + searchInstance.getSearchTerm() + "\"" +
        (iFetchedResultPercentage < 100 ? " - fetched top " + iFetchedResultPercentage + "% of results" : "");
      }
      else {
        searchStatus += (iFetchedResultPercentage < 100 ? "Showing top " + iFetchedResultPercentage + "% of r" : "R") +
                        "esults of filtering services index by " + 
                        (searchInstance.getSearchTerm().length() > 0 ?
                         (searchInstance.getServiceFilteringBasedOn() == SearchInstance.QUERY_SEARCH ? "term" : "tag") + " \"" + searchInstance.getSearchTerm() + "\" and " :
                         "");
      }
      
      parentMainSearchResultsPanel.setSearchStatusText(searchStatus, !parentMainSearchResultsPanel.isRunningInSearchTab(), false);
      
      // if there are more search results available, enable relevant buttons in the UI
      boolean bEnableMoreResultsButtons = searchInstance.getSearchResults().hasMoreResults(Resource.ALL_RESOURCE_TYPES);
      parentMainSearchResultsPanel.bMoreResults.setEnabled(bEnableMoreResultsButtons);
      parentMainSearchResultsPanel.bAllResults.setEnabled(bEnableMoreResultsButtons);
    }
    else {
      // open the same tab, if possible
      if (iOpenedTabIdx != -1 && iOpenedTabIdx < tpSearchResults.getTabCount()) {
        tpSearchResults.setSelectedIndex(iOpenedTabIdx);
      }
    }
  }
  
  
  /**
   * @param resultItemType One of <code>Resource::{SERVICE_TYPE, SERVICE_PROVIDER_TYPE, USER_TYPE, REGISTRY_TYPE}</code>
   * @return String that acts as a title of the results tab with the <code>resultItemType</code> type of results.
   *         The title string looks like: "<type_of_results_in_this_tab> (<fetched_item_count>/<total_item_count>)".  
   */
  private String getResultTabTitleString(int resultItemType)
  {
    String tabTitle = Resource.getResourceCollectionName(resultItemType);
    if (tabTitle == null || tabTitle.length() == 0) {
      return ("[ERROR: Unknown type]");
    }
    
    return (tabTitle + " (" + searchInstance.getSearchResults().getFetchedItemCount(resultItemType) +
            "/" + searchInstance.getSearchResults().getTotalItemCount(resultItemType) + ")");
  }
  
  
  // *** Callback for ActionListener interface ***
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource() instanceof JClickableLabel) {
      if (e.getActionCommand().startsWith(BioCataloguePluginConstants.ACTION_FILTER_FOUND_SERVICES)) {
        // this will initiate transfer of current search results into service filtering pane
        // (only services are filtered, so other results will be removed, but that will be
        //  done on a separate instance of SearchInstance, so current tab' search results will not be
        //  affected)
        pluginPerspectiveMainComponent.getServiceFilteringTab().getFilterTree().selectAllNodes(false); // make sure no selections are done in the filter tree - new filtering
        pluginPerspectiveMainComponent.getServiceFilteringTab().getSearchResultsMainPanel().prepareForServiceFilteringFromExistingSearchInstance(searchInstance);
        pluginPerspectiveMainComponent.setTabActive(pluginPerspectiveMainComponent.getServiceFilteringTab());
      }
    }
  }
  
  
  // Callbacks for MouseListener
  
  public void mouseClicked(MouseEvent e)
  {
    // if mouse clicked on one of the tabbed results lists and one of the items was selected
    if (mouseClickFromOneOfTheResultJLists(e) &&
        getObjectToPreviewFromResultsJList((JList)e.getSource()) != null)
    {
      // double-click with the left mouse button - show preview of that item
      if (e.getClickCount() == 2 && e.getButton() == MouseEvent.BUTTON1) {
        String itemURL = getObjectToPreviewFromResultsJList((JList)e.getSource()).getHref();
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
   * @return True if mouse clicked on one of the tabbed results lists.
   */
  private boolean mouseClickFromOneOfTheResultJLists(MouseEvent e) {
    return (new ArrayList<JList>(Arrays.asList(new JList[] {jlFoundServices, jlFoundServiceProviders,
                                           jlFoundUsers, jlFoundRegistries})).contains(e.getSource()));
  }
  
  /**
   * Gets the selected object from the specified list. Used for previewing items through
   * double-clicks and contextual menu.
   * @return Null if no selection in the list, ResourceLink object that is currently selected otherwise.
   */
  private ResourceLink getObjectToPreviewFromResultsJList(JList list) {
    return (list.getSelectedIndex() == -1 ?
            null :
            (ResourceLink)list.getSelectedValue());
  }
  
  private void maybeShowPopupMenu(MouseEvent e) {
    if (mouseClickFromOneOfTheResultJLists(e) &&
        e.isPopupTrigger() &&
        ((JList)e.getSource()).locationToIndex(e.getPoint()) != -1)
    {
      // select the entry in the list that triggered the event to show this popup menu
      JList sourceJList = (JList)e.getSource();
      sourceJList.setSelectedIndex(sourceJList.locationToIndex(e.getPoint()));
      
      // update value to be used in contextual menu click handler to act on the just-selected entry
      this.potentialObjectToPreview = getObjectToPreviewFromResultsJList(sourceJList);
      
      // show the contextual menu
      this.contextualMenu.show(e.getComponent(), e.getX(), e.getY());
    }
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
