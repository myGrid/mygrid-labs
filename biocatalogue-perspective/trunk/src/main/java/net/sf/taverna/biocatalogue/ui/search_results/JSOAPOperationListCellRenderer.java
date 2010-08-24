package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

import net.sf.taverna.biocatalogue.model.LoadingExpandedResource;
import net.sf.taverna.biocatalogue.model.LoadingResource;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;
import net.sf.taverna.biocatalogue.ui.JClickableLabel;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;

import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.User;

import com.blogspot.rabbit_hole.AnimatedIcon;


/**
 * This list cell renderer is specifically designed to render various resource items in
 * a list box - specifically: users, registries and service providers. An icon and the name
 * of the entity will be shown in each row.
 * 
 * @author Sergejs Aleksejevs
 */
public class JSOAPOperationListCellRenderer extends JPanel implements ListCellRenderer
{
  private static final int DESCRIPTION_MAX_LENGTH_COLLAPSED = 90;
  private static final int DESCRIPTION_MAX_LENGTH_EXPANDED = 500;
  
  private static final int DESCRIPTION_LINE_LENGTH = 90;
  
  
  private static final int TOOLTIP_DESCRIPTION_LENGTH = 150;
  private static final int TOOLTIP_LINE_LENGTH = 60;
  
  // list cells are not repainted by Swing by default - hence to use animated GIFs inside cells,
  // need to have a special class that takes care of changing the frames as necessary
  private Icon loaderBarAnimationOrange = new AnimatedIcon(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE));
  private Icon loaderBarAnimationGrey = new AnimatedIcon(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_GREY));
  private Icon loaderBarAnimationGreyStill = ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_GREY_STILL);
  
  
  private JPanel thisPanel;
  
  private JLabel jlTypeIcon;
  private JLabel jlItemTitle;
  private JLabel jlPartOf;
  private JLabel jlDescription;
  private String toolTipTitle;
  
  private JLabel jlExpand;
  
  private GridBagConstraints c;
  
  public static Rectangle expandRect;

  
  public JSOAPOperationListCellRenderer() {
    /* do nothing */
    this.thisPanel = this;
  }
  
  public Component getListCellRendererComponent(JList list, Object itemToRender, int itemIndex, boolean isSelected, boolean cellHasFocus)
  {
    // the same instance of the cell renderer is used for all cells, so
    // need to remove everything from the current panel to ensure clean
    // painting of the current cell
    this.removeAll();
    
    // GET THE DATA
    
    // LoadingResource is a placeholder for the detailed data on the resource --
    // it is being quickly fetched from the API and contanins just the name and the URL
    // of the actual resource;
    // 
    // these entries will be placed into the list when the initial part of the search
    // is complete, further details will be loaded asynchronously and inserted into
    // the same area
    if (itemToRender instanceof LoadingResource) {
      prepareLoadingResourceEntry(itemToRender);
    }
    
    // SoapOperation - real data about the operation: full details
    else if (itemToRender instanceof SoapOperation) {
      prepareSOAPOperationEntry(itemToRender, false);
    }
    
    // SoapOperation that's been expanded for more details
    else if (itemToRender instanceof LoadingExpandedResource) {
      prepareLoadingExpandedEntry(itemToRender);
    }
    
    // error case - unknown resource...
    else {
      prepareUnknownResourceTypeEntry();
    }
    
    
    
    // MAKE SURE CELL SELECTION WORKS AS DESIRED
    if (isSelected) {
      this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(3, 4, 3, 4, list.getBackground()),
                                                        BorderFactory.createLineBorder(Color.DARK_GRAY)));
        setBackground(Color.decode("#BAE8FF"));         // very light blue colour
        setForeground(list.getSelectionForeground());
    } else {
        this.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(3, 4, 3, 4, list.getBackground()),
                                                          BorderFactory.createLineBorder(Color.DARK_GRAY)));
        setBackground(Color.WHITE);
        setForeground(list.getForeground());
    }
    
    
    this.revalidate();
    
    if (expandRect == null && jlExpand != null) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          expandRect = jlExpand.getBounds();
          expandRect.x -= Math.abs(thisPanel.getBounds().x);
        }
      });
    }
    
    return (this);
  }
  
  
  
  private GridBagConstraints prepareLoadingResourceEntry(Object itemToRender) {
    LoadingResource resource = (LoadingResource)itemToRender;
    
    jlTypeIcon = new JLabel(TYPE.SOAPOperation.getIcon());
    
    jlItemTitle = new JLabel(Resource.getListingNameForResource(resource), JLabel.LEFT);
    jlItemTitle.setForeground(Color.decode("#AD0000"));  // very dark red
    jlItemTitle.setFont(jlItemTitle.getFont().deriveFont(Font.PLAIN, jlItemTitle.getFont().getSize() + 2));
    
    jlPartOf = new JLabel((resource.isLoading() ? loaderBarAnimationGrey : loaderBarAnimationGreyStill), JLabel.LEFT);
    jlDescription = new JLabel(" ");
    
    return (arrangeLayout(false, false));
  }
  
  
  /**
   * 
   * @param itemToRender
   * @param expandedView <code>true</code> to indicate that this method generates the top
   *                     fragment of the expanded list entry for this SOAP operation.
   * @return
   */
  private GridBagConstraints prepareSOAPOperationEntry(Object itemToRender, boolean expandedView)
  {
    SoapOperation soapOp = (SoapOperation)itemToRender;
    
    jlTypeIcon = new JLabel(TYPE.SOAPOperation.getIcon());
    
    jlItemTitle = new JLabel(Resource.getListingNameForResource(soapOp), JLabel.LEFT);
    jlItemTitle.setForeground(Color.decode("#AD0000"));  // very dark red
    jlItemTitle.setFont(jlItemTitle.getFont().deriveFont(Font.PLAIN, jlItemTitle.getFont().getSize() + 2));
    
    jlPartOf = new JLabel("<html><b>Part of: </b>" + soapOp.getAncestors().getSoapService().getResourceName() + "</html>");
    
    int descriptionMaxLength = (expandedView ? DESCRIPTION_MAX_LENGTH_EXPANDED : DESCRIPTION_MAX_LENGTH_COLLAPSED);
    String strDescription = (soapOp.getDescription() == null || soapOp.getDescription().length() == 0 ?
                             "<font color=\"gray\">no description</font>" :
                             Util.stripAllHTML(soapOp.getDescription()));
    strDescription = Util.ensureLineLengthWithinString(strDescription, DESCRIPTION_LINE_LENGTH, false);
    if (strDescription.length() > descriptionMaxLength) {
      strDescription = strDescription.substring(0, descriptionMaxLength) + "<font color=\"gray\">(...)</font>";
    }
    strDescription = "<html><b>Description: </b>" + strDescription + "</html>";
    jlDescription = new JLabel(strDescription);
    
    return (arrangeLayout(true, expandedView));
  }
  
  
  private GridBagConstraints prepareUnknownResourceTypeEntry()
  {
    jlTypeIcon = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE_ICON));
    jlItemTitle = new JLabel("<html><font color=\"#FF0000\">ERROR: This item shoulnd't have been here...</font></html>");
    jlPartOf = new JLabel(" ");
    jlDescription = new JLabel(" ");
    
    return (arrangeLayout(false, false));
  }
  
  
  /**
   * @return Final state of the {@link GridBagConstraints} instance
   *         that was used to lay out components in the panel.
   */
  private GridBagConstraints arrangeLayout(boolean showActionButtons, boolean expanded)
  {
    // POPULATE PANEL WITH PREPARED COMPONENTS
    this.setLayout(new GridBagLayout());
    c = new GridBagConstraints();
    c.anchor = GridBagConstraints.NORTHWEST;
    c.fill = GridBagConstraints.HORIZONTAL;
    
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    c.insets = new Insets(8, 6, 6, 3);
    this.add(jlTypeIcon, c);
    
    c.gridx++;
    c.weightx = 1.0;
    c.insets = new Insets(8, 3, 6, 3);
    this.add(jlItemTitle, c);
    
    if (showActionButtons) {
      c.gridx++;
      c.gridheight = 3;
      c.weightx = 0;
      c.weighty = 1.0;
      jlExpand = new JLabel(ResourceManager.getImageIcon((expanded ? ResourceManager.FOLD_ICON : ResourceManager.UNFOLD_ICON)));
      this.add(jlExpand, c);
    }
    
    c.gridx = 1;
    c.gridy++;
    c.gridheight = 1;
    c.weightx = 1.0;
    c.weighty = 0;
    c.insets = new Insets(3, 3, 3, 3);
    this.add(jlPartOf, c);
    
    c.gridy++;
    c.insets = new Insets(3, 3, 8, 3);
    this.add(jlDescription, c);
    
    return (c);
  }
  
  
  
  private void prepareLoadingExpandedEntry(Object itemToRender)
  {
    LoadingExpandedResource expandedResource = (LoadingExpandedResource) itemToRender;
    GridBagConstraints c = prepareSOAPOperationEntry(expandedResource.getAssociatedObj(), true);
    
    if (expandedResource.isLoading())
    {
      c.gridx = 0;
      c.gridy++;
      c.gridwidth = 3;
      c.anchor = GridBagConstraints.CENTER;
      c.fill = GridBagConstraints.HORIZONTAL;
      c.weightx = 1.0;
      this.add(new JLabel(loaderBarAnimationOrange, JLabel.CENTER), c);
    }
    else
    {
      c.gridy++;
      this.add(new JLabel("loaded!"), c);
    }
    
    
  }
  
}
