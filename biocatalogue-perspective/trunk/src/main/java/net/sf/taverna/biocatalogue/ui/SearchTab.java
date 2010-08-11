package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.LayoutFocusTraversalPolicy;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.SearchInstance;
import net.sf.taverna.biocatalogue.model.Tag;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.apache.avalon.framework.activity.Startable;
import org.apache.log4j.Logger;


/**
 * This class generates contents of the general "Search" tab in the perspective.
 * 
 * @author Sergejs Aleksejevs
 */
public class SearchTab extends JPanel implements HasDefaultFocusCapability, ActionListener
{
  private static final String TAB_BASE_TITLE = "Search";
  
  private final MainComponent pluginPerspectiveMainComponent;
  private final BioCatalogueClient client;
  private final Logger logger;
  
  
  // COMPONENTS
  private SearchTab thisPanel;
  private JSplitPane spMainSplitPane;
  
  // left side of the split pane
  private SearchOptionsPanel searchOptionsPanel;
  private TagCloudPanel tagCloudPanel;
  
  // right side of the split pane
  private SearchResultsMainPanel searchResultsMainPanel;
  
  
  public SearchTab(MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    this.thisPanel = this;
    
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    initialiseUI();
    initialiseData();
    
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
    // *** Left side of the split pane ***
    
    // create the search options as a separate panel
    searchOptionsPanel = new SearchOptionsPanel(this, pluginPerspectiveMainComponent, client, logger);
    
    // wrap the search options panel into another panel to make sure that options are displayed
    // at the top of the left part of split pane
    JPanel jpLeftComponent = new JPanel();
    jpLeftComponent.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    c.anchor = GridBagConstraints.NORTH;
    c.weightx = 1.0;
    c.weighty = 0.0;
    c.gridx = 0;
    c.gridy = 0;
    jpLeftComponent.add(searchOptionsPanel, c);
    
    // create and add the tag cloud panel
    tagCloudPanel = new TagCloudPanel("Tag Cloud", TagCloudPanel.TAGCLOUD_TYPE_GENERAL, 
                                      TagCloudPanel.TAGCLOUD_SINGLE_SELECTION, this);
    c.fill = GridBagConstraints.BOTH;
    c.weighty = 1.0;
    c.gridx = 0;
    c.gridy = 1;
    jpLeftComponent.add(tagCloudPanel, c);
    
    
    // *** Right side of the split pane
    searchResultsMainPanel = new SearchResultsMainPanel(pluginPerspectiveMainComponent, this, client, logger);
    
    
    // *** Put everything together ***
    spMainSplitPane = new JSplitPane();
    spMainSplitPane.setContinuousLayout(true);
    spMainSplitPane.setLeftComponent(jpLeftComponent);
    spMainSplitPane.setRightComponent(searchResultsMainPanel);
    
    this.setLayout(new BorderLayout());
    this.add(spMainSplitPane, BorderLayout.CENTER);
    
    
    // set default title for the current tab
    pluginPerspectiveMainComponent.setWindowTitle(this.getClass().getName(), TAB_BASE_TITLE);
  }
  
  
  private void initialiseData()
  {
    // currently only needed to 'ask' the tag cloud panel to load the tags
    tagCloudPanel.refresh();
  }
  
  
  /**
   * Uses search instance's settings to restore the state of the search options panel.
   * This is useful when a search from history / favourites is started or
   * when the previous search is being re-run. 
   */
  protected void restoreSearchOptions(SearchInstance si)
  {
    searchOptionsPanel.restoreState(si);
  }
  
  
  public SearchResultsMainPanel getSearchResultsMainPanel() {
    return (this.searchResultsMainPanel);
  }
  
  
  // *** Callbacks for HasDefaultFocusCapability interface ***
  
  public void focusDefaultComponent() {
    this.searchOptionsPanel.focusDefaultComponent();
    
    // this method is called each time current tab is activated;
    // we reuse this functionality here to update the UI of
    // the search history and favourites panel with the latest
    // changes from the underlying data collections
    this.searchResultsMainPanel.getHistoryAndFavouritesPanel().updateUIFromDataCollections();
  }
  
  public Component getDefaultComponent() {
    return (this.searchOptionsPanel.getDefaultComponent());
  }
  
  
  // *** Callback for ActionListener interface ***
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource().equals(this.searchOptionsPanel.bSearch))
    {
      if (this.searchOptionsPanel.getSearchQuery().length() == 0) {
        JOptionPane.showMessageDialog(null, "Please specify your search query", "Search - No search query", JOptionPane.WARNING_MESSAGE);
        this.searchOptionsPanel.focusDefaultComponent();
      }
      else {
        // search query available - collect data about the current search and execute it
        searchResultsMainPanel.startNewSearch(searchOptionsPanel.getState());
      }
    }
    
    else if ((e.getSource().equals(this.tagCloudPanel) || e.getSource().equals(pluginPerspectiveMainComponent.getPreviewBrowser())) &&
             e.getActionCommand().startsWith(BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX))
    {
      // event from the tag cloud panel OR preview browser - tag search required
      final String tagURI = e.getActionCommand().substring(BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX.length());
      
      // try to find details of the tag by the supplied URI in the tag cloud
      // (this will definitely succeed for a tag that was clicked in the tag
      //  cloud to initiate this search)
      Tag t = tagCloudPanel.getTagCloudData().getTagByTagURI(tagURI);
      
      if (t != null)
      {
        // tag details were found, start the search immediately
        SearchInstance si = new SearchInstance(t);
        searchResultsMainPanel.startNewSearch(si);
      }
      else
      {
        // details couldn't be found, need to lookup on BioCatalogue
        // (this is because the tag was clicked in, for example, a service preview)
        new Thread("lookup tag details") {
          public void run() {
            try {
              // TODO - it is necessary to show some sort of notification that lookup is in progress
              org.biocatalogue.x2009.xml.rest.Tag fetchedTag = client.getBioCatalogueTag(tagURI);
              Tag t1 = new Tag(fetchedTag);
              
              SearchInstance si = new SearchInstance(t1);
              searchResultsMainPanel.startNewSearch(si);
            }
            catch (Exception ex)
            {
              JOptionPane.showMessageDialog(null, "Couldn't lookup details of the clicked tag to start the search",
                  "BioCatalogue Plugin - Error", JOptionPane.ERROR_MESSAGE);
              ex.printStackTrace();
            }
          }
        }.start();
      }
    }
    
  }
  
}
