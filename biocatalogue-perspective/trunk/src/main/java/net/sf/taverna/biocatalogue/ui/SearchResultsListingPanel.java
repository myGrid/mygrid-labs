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
import java.util.List;
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
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.search.SearchInstance;
import net.sf.taverna.biocatalogue.model.search.SearchResults;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.User;

import edu.stanford.ejalbert.BrowserLauncher;

/**
 * This class is responsible for producing search results listing panel.
 * It only shows a single listing for a specified type. Multiple types are
 * handled by having different tabs in {@link SearchResultsMainPanel} with
 * instances of this class in each.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchResultsListingPanel extends JPanel implements MouseListener, PartialSearchResultsRenderer
{
  // main elements
  private final MainComponent pluginPerspectiveMainComponent;
  private final Logger logger;
  private final SearchResultsMainPanel parentMainSearchResultsPanel;
  
  // currently displayed search results
  SearchInstance searchInstance;
  
  
  // main UI components
  private JList jlResultsListing;
  private JScrollPane spResultsListing;
  
  // contextual menu
  private JPopupMenu contextualMenu;
  
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
    jlResultsListing = new JListWithPositionedToolTip();
    jlResultsListing.setCellRenderer(this.typeToPreview.getResultListingCellRenderer());
    jlResultsListing.addMouseListener(this);
    spResultsListing = new JScrollPane(jlResultsListing);
    
    
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
    
    // if nothing was found - display notification and finish result processing
    if (searchInstance.getSearchResults().getTotalItemCount() == 0) {
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
    if (searchInstance.getSearchResults().getTotalItemCount() > 0) {
      // populate the list box with users
      DefaultListModel listModel = new DefaultListModel();
      
//      this.typeToPreview.getXmlBeansGeneratedClass()
      Object aaa = Service.class; 
      List<? extends ResourceLink> foundItems = searchInstance.getSearchResults().getFoundItems();
      for (ResourceLink item : foundItems) {
        listModel.addElement(this.typeToPreview.getXmlBeansGeneratedClass().cast(item));
      }
      jlResultsListing.setModel(listModel);
    }
    
    
    
    this.removeAll();
    this.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
    this.setLayout(new BorderLayout());
    this.add(spResultsListing, BorderLayout.CENTER);
    this.repaint();
    
    
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
   * @param resultItemType One of <code>Resource::{SERVICE_TYPE, SERVICE_PROVIDER_TYPE, USER_TYPE, REGISTRY_TYPE}</code>
   * @return String that acts as a title of the results tab with the <code>resultItemType</code> type of results.
   *         The title string looks like: "<type_of_results_in_this_tab> (<fetched_item_count>/<total_item_count>)".  
   */
  private String getResultTabTitleString(int resultItemType)
  {
//    String tabTitle = Resource.getResourceCollectionName(resultItemType);
//    if (tabTitle == null || tabTitle.length() == 0) {
//      return ("[ERROR: Unknown type]");
//    }
//    
//    return (tabTitle + " (" + searchInstance.getSearchResults().getFetchedItemCount(resultItemType) +
//            "/" + searchInstance.getSearchResults().getTotalItemCount(resultItemType) + ")");
    
    return ("Tab Title");
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
    if (e.getSource().equals(jlResultsListing) &&
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
  
  
  // *** Callback for PartialSearchResultsRenderer ***
  
  public void renderPartialResults(final SearchInstance si)
  {
    // NB! critical to have UI update done within the invokeLater()
    //     method - this is to prevent UI from 'flashing' and to
    //     avoid some weird errors
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        // display the partial search results
        renderResults(si, true);
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
