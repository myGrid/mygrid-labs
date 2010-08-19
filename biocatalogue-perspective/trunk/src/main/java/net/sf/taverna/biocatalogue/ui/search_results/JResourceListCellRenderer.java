package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.ToolTipManager;

import net.sf.taverna.biocatalogue.model.LoadingResource;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;

import org.biocatalogue.x2009.xml.rest.Registry;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.User;


/**
 * This list cell renderer is specifically designed to render various resource items in
 * a list box - specifically: users, registries and service providers. An icon and the name
 * of the entity will be shown in each row.
 * 
 * @author Sergejs Aleksejevs
 */
public class JResourceListCellRenderer extends JPanel implements ListCellRenderer
{
  private static final int TOOLTIP_DESCRIPTION_LENGTH = 150;
  private static final int TOOLTIP_LINE_LENGTH = 60;
  
  private JLabel jlItemTypeIcon;
  private JLabel jlItemTitle;
  private String toolTipTitle;
  
  private GridBagConstraints c;
  
  
  public JResourceListCellRenderer()
  {
    // can set any settings that should be reflected in all items - e.g. opacity, alignment, etc
    this.setLayout(new GridBagLayout());
    c = new GridBagConstraints();
    c.anchor = GridBagConstraints.WEST;
  }
  
  public Component getListCellRendererComponent(JList list, Object itemToRender, int itemIndex, boolean isSelected, boolean cellHasFocus)
  {
    // the same instance of the cell renderer is used for all cells, so
    // need to remove everything from the current panel to ensure clean
    // painting of the current cell
    this.removeAll();
    jlItemTitle = null;
    
    // GET THE DATA
    
    // icon to represent the type of resource
    if (itemToRender instanceof ResourceLink) {
      ResourceLink resourceToRender = (ResourceLink)itemToRender;
      
      Resource.TYPE itemType = Resource.getResourceTypeFromResourceURL(resourceToRender.getHref());
      String resourceDisplayName = Resource.getListingNameForResource(resourceToRender);
      
      if (resourceToRender instanceof LoadingResource && ((LoadingResource)resourceToRender).isLoading()) {
        jlItemTypeIcon = new JLabel(ResourceManager.getImageIcon(ResourceManager.SPINNER));
        jlItemTitle = new JLabel(resourceDisplayName);
      }
      else {
        jlItemTypeIcon = new JLabel(itemType.getIcon());
        jlItemTitle = new JLabel(resourceDisplayName + " - loaded");
      }
      
      toolTipTitle = "<b>" + itemType.getTypeName() + ": </b>" + resourceDisplayName;
    }
    else if (itemToRender != null) {
      jlItemTypeIcon = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE));
      jlItemTitle = new JLabel("UNKNOWN ITEM: " + itemToRender.toString());
      toolTipTitle = "<b>This item type is not recognised!</b><br>";
    }
    else {
      // item wasn't yet loaded
      jlItemTypeIcon = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE));
      jlItemTitle = new JLabel("<html><font color=\"#BBBBBB\">Item was not loaded yet</font></html>");
      toolTipTitle = "<b>This item was not loaded yet</b><br>";
    }
    
    
    // SET THE TOOLTIP
    this.setToolTipText("<html>" + toolTipTitle + "</html>");
    
    
    // CELL DATA IS KNOWN - put everything together into the panel
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    c.insets = new Insets(2, 2, 2, 2);
    this.add(jlItemTypeIcon, c);
    
    c.gridx = 1;
    c.weightx = 1.0;
    this.add(jlItemTitle, c);
    
    
    // MAKE SURE CELL SELECTION WORKS AS DESIRED
    if (isSelected) {
        this.setBorder(BorderFactory.createLineBorder(list.getBackground().darker()));
        setBackground(list.getSelectionBackground());
        setForeground(list.getSelectionForeground());
    } else {
        this.setBorder(BorderFactory.createLineBorder(list.getBackground()));
        setBackground(list.getBackground());
        setForeground(list.getForeground());
    }
    
    
    return (this);
  }
  
  
}
