package net.sf.taverna.biocatalogue.ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.biocatalogue.model.BioCataloguePluginConstants;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.StringToInputStreamConverter;
import net.sf.taverna.biocatalogue.model.Tag;
import net.sf.taverna.biocatalogue.model.TagCloud;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.Tags;
import org.xhtmlrenderer.render.Box;
import org.xhtmlrenderer.simple.FSScrollPane;
import org.xhtmlrenderer.simple.XHTMLPanel;
import org.xhtmlrenderer.swing.BasicPanel;
import org.xhtmlrenderer.swing.FSMouseListener;
import org.xhtmlrenderer.swing.HoverListener;
import org.xhtmlrenderer.swing.LinkListener;

import com.santhoshkumar.ComponentTitledBorder;


public class TagCloudPanel extends JPanel implements ChangeListener, ItemListener, ActionListener, ComponentListener
{
  // CONSTANTS
  private static final int TAGCLOUD_MAX_FONTSIZE = 36;
  private static final int TAGCLOUD_MIN_FONTSIZE = 12;
  private static final int TAGCLOUD_DEFAULT_MAX_SIZE = 350;
  private static final int TAGCLOUD_DEFAULT_DISPLAY_SIZE = 50;
  
  public static final int TAGCLOUD_TYPE_GENERAL = 0;
  public static final int TAGCLOUD_TYPE_USER = 1;
  public static final int TAGCLOUD_TYPE_RESOURCE_PREVIEW = 2;  // This type is to be used inside a tab of a resource preview frame (avoids tag count selection slider)
  
  private static final int SORT_AND_REFRESH_BUTTON_HORIZONTAL_PADDING = 4; // left-right padding for bRefresh / bSort
  
  
  private MainComponent pluginPerspectiveMainComponent;
  private BioCatalogueClient client;
  private Logger logger;
  
  // COMPONENTS
  private TagCloudPanel instanceOfSelf;
  
  private String strTitle;
  private int iType;
  private JLabel jlCloudTitle;
  private ComponentTitledBorder ctbCloudTitledBorder;
  private JPanel jpTagCloudControlPanel;
  private JLabel jlTagCloudLoadingSpinner;
  private JSlider jsCloudSizeSlider;
  private JCheckBox cbShowAllTags;
  private JButton bRefresh;
  private JButton bSort;
  
  private JPanel jpTagCloudContentWithControls;
  private XHTMLPanel xhtmlTagCloudPanel;
  private FSScrollPane xhtmlTagCloudPanelScollPane;
  
  
  private ActionListener clickHandler;
  private TagCloud tcData = new TagCloud();
  private boolean bUserTagCloudSliderValueNeverSet = true;
  
  private SortByTagNameAction sortByTagNameAction;
  private SortByTagCountsAction sortByTagCountsAction;
  
  
  public TagCloudPanel(String title, int iTagCloudType, ActionListener clickHandler,
                       MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    super();
    
    instanceOfSelf = this;
    
    // set parameters and the main variables to ensure access to BioCatalogue, logger and the parent component
    this.strTitle = title;
    this.iType = iTagCloudType;
    this.clickHandler = clickHandler;
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    // initialise "actions" for sorting the tag cloud
    this.sortByTagNameAction = new SortByTagNameAction();
    this.sortByTagCountsAction = new SortByTagCountsAction();
    
    initialiseUI();
  }
  
  private void initialiseUI()
  {
    // not used right now, prepare just to make it available
    this.jlTagCloudLoadingSpinner = new JLabel(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE));
    this.jlTagCloudLoadingSpinner.setBorder(BorderFactory.createEmptyBorder(0, 2, 0, 0));
    
    // create the tag cloud controls panel
    // (all controls will be created anyway, but if that's a resource
    //  preview tag cloud, make sure that these controls are not displayed)
    this.jsCloudSizeSlider = new JSlider(1, TAGCLOUD_DEFAULT_MAX_SIZE, TAGCLOUD_DEFAULT_DISPLAY_SIZE);
    this.cbShowAllTags = new JCheckBox("All tags", false);
    this.bRefresh = new JButton("Refresh", ResourceManager.getImageIcon(ResourceManager.REFRESH_ICON));
    this.bSort = new JButton(sortByTagNameAction);
    
    if (this.iType != TagCloudPanel.TAGCLOUD_TYPE_RESOURCE_PREVIEW)
    {
      this.jsCloudSizeSlider.addChangeListener(this);
      this.jsCloudSizeSlider.setToolTipText("Drag the slider to select how big the tag cloud should be, or check the \"All tags\" box to get the full tag cloud.");
      
      this.cbShowAllTags.addItemListener(this);
      
      this.bRefresh.addActionListener(this);
      this.bRefresh.setMargin(new Insets(bRefresh.getMargin().top, SORT_AND_REFRESH_BUTTON_HORIZONTAL_PADDING,
                                         bRefresh.getMargin().bottom, SORT_AND_REFRESH_BUTTON_HORIZONTAL_PADDING));
      this.bRefresh.setToolTipText("Click this button to refresh the Tag Cloud");
      this.bRefresh.doLayout();
      
      this.bSort.setPreferredSize(bRefresh.getPreferredSize());
      this.bSort.setMargin(new Insets(bSort.getMargin().top, SORT_AND_REFRESH_BUTTON_HORIZONTAL_PADDING,
                                      bSort.getMargin().bottom, SORT_AND_REFRESH_BUTTON_HORIZONTAL_PADDING));
      this.bSort.setBorder(BorderFactory.createCompoundBorder(
                             BorderFactory.createEmptyBorder(0, 1, 0, 2),
                             bSort.getBorder())
                           );
      
      
      // put components of the control panel together
      jpTagCloudControlPanel = new JPanel();
      jpTagCloudControlPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
      jpTagCloudControlPanel.setLayout(new GridBagLayout());
      arrangeComponentsInTagCloudControlPanel(false);
    }
    
    // body of the tag cloud with the actual tags - XHTML panel
    xhtmlTagCloudPanel = new XHTMLPanel();
    xhtmlTagCloudPanel.getSharedContext().getTextRenderer().setSmoothingThreshold(0); // Anti-aliasing for all font sizes
    for (Object o : xhtmlTagCloudPanel.getMouseTrackingListeners()) {
      // remove all default link listeners, as we don't need the XHTMLPanel
      // to navigate to the 'new' page automatically via any clicked link
      if (o instanceof LinkListener) {
        xhtmlTagCloudPanel.removeMouseTrackingListener((FSMouseListener)o);
      }
    }
    xhtmlTagCloudPanel.addMouseTrackingListener(new HoverListener() {
      public void onMouseOver(BasicPanel panel, Box box) {
        if (box.getElement().getTagName() == "a") {
          // when mouse is hovered over a tag, display Swing tooltip over the XHTML panel
          // with details of that tag
          String tagURI = box.getElement().getAttribute("href").substring(BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX.length());
          Tag hoveredOverTag = tcData.getTagByTagURI(tagURI);
          if (hoveredOverTag != null) {
            xhtmlTagCloudPanel.setToolTipText(hoveredOverTag.getTagCloudTooltip());
          }
        }
      }
      public void onMouseOut(BasicPanel panel, Box box) {
        // mouse is not hovering over the tag anymore - remove Swing tooltip
        xhtmlTagCloudPanel.setToolTipText(null);
      }
    });
    xhtmlTagCloudPanel.addMouseTrackingListener(new LinkListener() {
      public void onMouseUp(BasicPanel panel, Box box) {
        if (box.getElement().getTagName() == "a") {
          // set selection around the clicked tag
          if (box.getElement().getAttribute("class").equals("")) {
            box.getElement().setAttribute("class", "selected");
          }
          else {
            box.getElement().setAttribute("class", "");
          }
          
          // this will 'catch' clicks on the tag URLs and dispatch the processing
          // of that click to the relevant handler in order to initiate search by tag
          clickHandler.actionPerformed(new ActionEvent(instanceOfSelf, 0, box.getElement().getAttribute("href")));
        }
      }
    });
    
    xhtmlTagCloudPanelScollPane = new FSScrollPane(xhtmlTagCloudPanel);
    xhtmlTagCloudPanelScollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    xhtmlTagCloudPanelScollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
    
    jpTagCloudContentWithControls = new JPanel();
    jpTagCloudContentWithControls.setLayout(new BorderLayout());
    jpTagCloudContentWithControls.add(xhtmlTagCloudPanelScollPane, BorderLayout.CENTER);
    if (this.iType != TagCloudPanel.TAGCLOUD_TYPE_RESOURCE_PREVIEW) {
      jpTagCloudContentWithControls.add(jpTagCloudControlPanel, BorderLayout.NORTH);
    }
    jpTagCloudContentWithControls.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
    
    
    // *** Put everything together ***
    
    this.setLayout(new BorderLayout());
    this.addComponentListener(this); // HACK - explanation inside the listener
    this.add(jpTagCloudContentWithControls, BorderLayout.CENTER);
    
    // border around the tag cloud panel with the title
    this.jlCloudTitle = new JLabel(this.strTitle);
    this.jlCloudTitle.setOpaque(true);
    this.jlCloudTitle.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
    
    this.ctbCloudTitledBorder = new ComponentTitledBorder(this.jlCloudTitle, this, BorderFactory.createEtchedBorder());
    this.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(2, 2, 2, 2),
        (this.iType != TagCloudPanel.TAGCLOUD_TYPE_RESOURCE_PREVIEW) ? this.ctbCloudTitledBorder : BorderFactory.createEtchedBorder()
    ));
  }
  
  
  /**
   * Control panel of the tag cloud has quite complex behaviour,
   * based on whether the tag cloud is fetching its data or is
   * in idle condition. Components have to be resized differently,
   * hence this logic is encapsulated into one method.
   * 
   * @param bTagCloudFetchingInProgress True if tag cloud data fetching
   *                      from the API is in progress; false when tag cloud
   *                      is idle.
   */
  private void arrangeComponentsInTagCloudControlPanel(boolean bTagCloudFetchingInProgress)
  {
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 1.0;
    c.weighty = 0;
    c.fill = GridBagConstraints.NONE;
    
    if (bTagCloudFetchingInProgress) {
      c.anchor = GridBagConstraints.LINE_START;
      this.jpTagCloudControlPanel.add(this.jlTagCloudLoadingSpinner, c);
    }
    else {
      c.fill = GridBagConstraints.HORIZONTAL;
      c.anchor = GridBagConstraints.CENTER;
      jpTagCloudControlPanel.add(this.jsCloudSizeSlider, c);
      
      c.gridx++;
      c.weightx = 0;
      c.fill = GridBagConstraints.NONE;
      jpTagCloudControlPanel.add(this.cbShowAllTags, c);
    }
    
    c.gridx++;
    c.weightx = 0;
    c.anchor = GridBagConstraints.CENTER;
    jpTagCloudControlPanel.add(this.bSort, c);
    
    c.gridx++;
    jpTagCloudControlPanel.add(this.bRefresh, c);
  }
  
  
  private void updateTagCloudPanelTitle(String auxiliaryText)
  {
    this.jlCloudTitle.setText("<html>" + strTitle + " <span style='color: gray;'>" +
                              (auxiliaryText == null ? "" : auxiliaryText) +
                              "</span></html>");
    this.repaint();
  }
  
  
  public void refresh()
  {
    // change the view to reflect fetching of tags
    this.jpTagCloudControlPanel.removeAll();
    arrangeComponentsInTagCloudControlPanel(true);
    
    updateTagCloudPanelTitle("(Loading...)");
    
    // Make call to BioCatalogue API in a different thread
    // (then use SwingUtilities.invokeLater to update the UI when ready)
    new Thread("Get '" + this.strTitle + "' tag cloud data") {
      public void run() {
//        logger.debug("Getting '" + strTitle + "' tag cloud data"); TODO -- re-enable

        try {
          int size = -1;
          if (!cbShowAllTags.isSelected()) {
            size = jsCloudSizeSlider.getValue();
          }
          
          // based on the type of the tag cloud, different data needs to be fetched
          switch (iType) {
            case TagCloudPanel.TAGCLOUD_TYPE_GENERAL:
              tcData = getGeneralTagCloud(bSort.getAction().equals(sortByTagNameAction), size);
              break;
            /*  
            TODO -- currently supports only the general type of tag cloud
            case TagCloudPanel.TAGCLOUD_TYPE_USER:
              tcData = myExperimentClient.getUserTagCloud(myExperimentClient.getCurrentUser(), size);
              break;
            
            case TagCloudPanel.TAGCLOUD_TYPE_RESOURCE_PREVIEW:
              // fetch tag counts for tags that are already pre-set
              myExperimentClient.convertTagListIntoTagCloudData(tcData.getTags());
              break;
            */ 
            default:
              // unknown type of tag cloud; show no data
              tcData = new TagCloud();
              break;
          }

          SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              repopulate();
            }
          });
        } catch (Exception ex) {
          logger.error("Failed to get tag cloud data from BioCatalogue", ex);
        }
      }
    }.start();
  }
  
  
  public void repopulate()
  {
    // we've received the values for the tag cloud, can enable the sort actions
    sortByTagNameAction.setEnabled(true);
    sortByTagCountsAction.setEnabled(true);
    
    
    // TODO - re-enable
    //    logger.debug("Building '" + this.strTitle + "' tag cloud...");
    
    try {
      this.jsCloudSizeSlider.removeChangeListener(this);
      /*
       * TODO -- currently only support general tag clouds
      if (this.iType == TAGCLOUD_TYPE_USER)
      {
        jsCloudSizeSlider.setMinimum(1);
        jsCloudSizeSlider.setMaximum(myExperimentClient.getCurrentUser().getTags().size());
        if (bUserTagCloudSliderValueNeverSet)
        {
          // this is the first load of the cloud, show all user tags
          jsCloudSizeSlider.setValue(jsCloudSizeSlider.getMaximum());
          bUserTagCloudSliderValueNeverSet = false;
        }
        else
        {
          // not the first load, test if the position of the slider is still within the scope
          // (put that back to maximum if exceeds)
          if (jsCloudSizeSlider.getValue() > jsCloudSizeSlider.getMaximum() || this.cbShowAllTags.isSelected())
            jsCloudSizeSlider.setValue(jsCloudSizeSlider.getMaximum());
        }
      }
      else
      {
      */
        // if "All tags" check box is ticked, set the slider max to the max no of tags
        // (this will be the total number of tags available from myExperiment);
        // if "All tags" was never checked before, max position of the slider will
        // stay at predefined default value (because the total number of tags is not known yet)
        if (this.cbShowAllTags.isSelected()) {
          int size = this.tcData.getTags().size();
          this.jsCloudSizeSlider.setMaximum(size);
          this.jsCloudSizeSlider.setValue(size);
        }
      /*
       * TODO -- currently only support general tag clouds
      }
      */
      this.jsCloudSizeSlider.addChangeListener(this);
      
      // Generate the tag cloud HTML document
      final StringBuilder content = new StringBuilder();
      if (this.tcData.getTags().size() > 0)
      {
        // For tag cloud font size calculations
        int iMaxCount = this.tcData.getMaxTagCount();
        
        content.append("<html>" +
                          "<head>" +
                              "<link href=\"" + ResourceManager.getResourceLocalURL(ResourceManager.STYLES_CSS) +
                               "\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" />" +
                          "</head>" +
                          "<body>" +
                              "<div class='outer'>" +
                              "<div class='tag_cloud'>");
        
        for (int i = 0; i < this.tcData.getTags().size(); i++)
        {
          Tag t = this.tcData.getTags().get(i);
          
          // Normalise count and use it to obtain a font size value. 
          // Also chops off based on min and max.
          int fontSize = (int) (((double)t.getItemCount()/((double)iMaxCount/3))*TAGCLOUD_MAX_FONTSIZE);
          if (fontSize < TAGCLOUD_MIN_FONTSIZE) {
            fontSize = TAGCLOUD_MIN_FONTSIZE;
          }
          if (fontSize > TAGCLOUD_MAX_FONTSIZE) {
            fontSize = TAGCLOUD_MAX_FONTSIZE;
          }
          
          content.append("<a style=\"font-size: " + fontSize + "pt;\" href=\"" + BioCataloguePluginConstants.ACTION_TAG_SEARCH_PREFIX + t.getTagURI() + "\">" + t.getTagDisplayName() + "</a>");
        }
        
        content.append("<br/>");
        content.append("</div>");
        content.append("</div></body></html>");
      }
      else {
        content.append("<html><body><span style=\"color: gray; font-weight: italic;\">No tags to display</span></body></html>");
      }
      
      
      // tag cloud HTML document prepared - render it within the XHTML panel
      try {
        StringToInputStreamConverter converter = new StringToInputStreamConverter(content.toString());
        xhtmlTagCloudPanel.setDocument(converter.getInputStream(), System.getProperty("user.dir"));
        xhtmlTagCloudPanel.validate();
        converter.closeAllStreams();  // close all streams
      }
      catch (Exception e) {
        e.printStackTrace();
      }
    }
    catch (Exception e) {
      logger.error("Failed to populate tag cloud", e);
    }
    
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        jpTagCloudControlPanel.removeAll();
        arrangeComponentsInTagCloudControlPanel(false);
        jpTagCloudControlPanel.validate();
        
        updateTagCloudPanelTitle("(currently showing " + tcData.getTags().size() + " tag" +
            (tcData.getTags().size() % 10 != 1 ? "s" : "") + ")");
      }
    });
  }
  
  
  /**
   * @param bSortByCounts True to sort by tag counts, false to sort by tag names.
   * @param size Desired size of the tag cloud (will fetch top 'size' tags).
   *             Size will only be taken into account if sorting by counts;
   *             for sorting by tag names it only makes sense to fetch all tags.
   * @return
   */
  public TagCloud getGeneralTagCloud(boolean bSortByCounts, int size)
  {
    TagCloud tcCloud = new TagCloud();
    
    try {
      // assemble tag cloud URL and fetch the XML document
      String strTagCloudURL = Util.appendURLParameter(BioCatalogueClient.API_TAG_CLOUD_URL, 
                                                      (bSortByCounts ? 
                                                       BioCatalogueClient.API_SORT_BY_COUNTS :
                                                       BioCatalogueClient.API_SORT_BY_NAME));
      strTagCloudURL = Util.appendURLParameter(strTagCloudURL, BioCatalogueClient.API_PER_PAGE_PARAMETER,
                                               ""+BioCataloguePluginConstants.API_DEFAULT_REQUESTED_ITEM_COUNT_PER_PAGE);
      if (bSortByCounts && size > 0) {
        strTagCloudURL = Util.appendURLParameter(strTagCloudURL, BioCatalogueClient.API_LIMIT_PARAMETER, ""+size);
      }
      
      
      int iCurrentPageIdx = 0;
      int iTotalPageCount = 0;
      do {
        // fetch a page of tags from the API
        Tags tags = client.getBioCatalogueTags(strTagCloudURL);
        iCurrentPageIdx = tags.getParameters().getPage().getBigIntegerValue().intValue();
        iTotalPageCount = tags.getStatistics().getPages().intValue();
        
        // get URL of the next page of tags
        if (tags.getRelated().getNext() != null) {
          strTagCloudURL = tags.getRelated().getNext().getHref();
        }
        else if (iCurrentPageIdx < iTotalPageCount) {
          // ERROR - not the last page of results, but no link to the next page...
          throw (new Exception("ERROR while fetching tag cloud data.\nPage " + iCurrentPageIdx +
                               " of " + iTotalPageCount + " has no link to the next page of tags.")
                );
        }
        
        // process all tags from currently fetched page and add them to the cloud
        if (tags != null) {
          for (org.biocatalogue.x2009.xml.rest.Tag t : tags.getResults().getTagList()) {
            tcCloud.getTags().add(new Tag(t));
          }
        }
        
        // update the UI to show the progress of loading tags - especially relevant
        // when fetching full tag cloud with many entries
        updateTagCloudPanelTitle("(Loading... " + (int)((double)iCurrentPageIdx/iTotalPageCount * 100) + "%)");
        
      } while (iCurrentPageIdx < iTotalPageCount);
    }
    catch (Exception e) {
      // TODO - re-enable
      //this.logger.error("ERROR: Failed to get tag cloud.\n", e);
      System.err.println("ERROR: while fetching tag cloud data");
      e.printStackTrace();
    }
    
    // TODO - re-enable
    //logger.debug("Tag cloud retrieval successful; fetched " + tcCloud.getTags().size() + " tags from BioCatalogue");
    
    return (tcCloud);
  }
  
  
  
  /**
   * Helper method to get hold of the tag cloud data. Needed to be able to
   * set tag cloud data when using this for resource preview (when tag fetching
   * is not required).
   */
  public TagCloud getTagCloudData()
  {
    return this.tcData;
  }
  
  
  // *** Callback for ChangeListener interface ***
  
  public void stateChanged(ChangeEvent e)
  {
    if (e.getSource().equals(this.jsCloudSizeSlider)) {
      // cloud size slider was dragged to a new place and the drag event
      // has finished; refresh the tag cloud with the newly selected tag count
      if (!this.jsCloudSizeSlider.getValueIsAdjusting()) {
        this.cbShowAllTags.removeItemListener(this);
        this.cbShowAllTags.setSelected(false);
        this.cbShowAllTags.addItemListener(this);
        
        this.refresh();
      }
    }
  }
  
  
  // *** Callback for ItemListener interface ***
  
  public void itemStateChanged(ItemEvent e)
  {
    if (e.getItemSelectable().equals(this.cbShowAllTags)) {
      // "Show all" clicked - need to refresh with all tags being displayed
      this.refresh();
    }
  }
  
  
  // *** Callback for ActionListener interface ***
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource().equals(this.bRefresh)) {
      // refresh button clicked on the cloud controls panel -
      // simply refresh the cloud with the same parameters
      this.refresh();
    }
  }
  
  
  // *** Callbacks for ComponentListener interface ***
  
  public void componentShown(ComponentEvent e) { /* Not used */ }
  public void componentHidden(ComponentEvent e) { /* Not used */ }
  public void componentMoved(ComponentEvent e) { /* Not used */ }
  public void componentResized(ComponentEvent e)
  {
    // HACK: this is required to keep the size of the tag cloud in line with the
    //       changing size of the TagCloudPanel as a whole. Problem was introduced
    //       by ComponentTitleBorder, but having such workaround isn't a problem
    Dimension d = this.getSize();
    Insets i = this.getInsets();
    
    this.jpTagCloudContentWithControls.setSize(d.width - i.left - i.right, d.height - i.top - i.bottom);
    this.jpTagCloudContentWithControls.validate();
  }

  
  
  // *** Actions for sorting the tag cloud ***
  
  private class SortByTagNameAction extends AbstractAction
  {
    public SortByTagNameAction() {
      super("Sort", ResourceManager.getImageIcon(ResourceManager.SORT_BY_NAME_ICON));
      this.putValue(SHORT_DESCRIPTION, "Sort the tag cloud by tag names");
      this.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      bSort.setAction(sortByTagCountsAction);
      cbShowAllTags.setEnabled(false);
      jsCloudSizeSlider.setEnabled(false);
      refresh();
    }
  }
  
  private class SortByTagCountsAction extends AbstractAction
  {
    public SortByTagCountsAction() {
      super("Sort", ResourceManager.getImageIcon(ResourceManager.SORT_BY_COUNTS_ICON));
      this.putValue(SHORT_DESCRIPTION, "Sort the tag cloud by the number of tagged items");
      this.setEnabled(false);
    }
    
    public void actionPerformed(ActionEvent e)
    {
      bSort.setAction(sortByTagNameAction);
      cbShowAllTags.setEnabled(true);
      jsCloudSizeSlider.setEnabled(true);
      refresh();
    }
  }
}
