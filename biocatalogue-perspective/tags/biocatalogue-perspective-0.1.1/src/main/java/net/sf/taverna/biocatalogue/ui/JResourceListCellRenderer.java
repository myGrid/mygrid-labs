package net.sf.taverna.biocatalogue.ui;

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

import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;

import org.biocatalogue.x2009.xml.rest.Registry;
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
  
  private JLabel jlItemType;
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
    if (itemToRender instanceof User) {
      User user = (User)itemToRender;
      
      jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.USER_ICON));
      jlItemTitle = new JLabel(user.getName());
      toolTipTitle = "<b>User: </b>" + user.getName();
    }
    else if (itemToRender instanceof ServiceProvider) {
      ServiceProvider provider = (ServiceProvider)itemToRender;
      
      jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_PROVIDER_ICON));
      jlItemTitle = new JLabel(provider.getName());
      toolTipTitle = "<b>Service Provider: </b>" + provider.getName();
    }
    else if (itemToRender instanceof Registry) {
      Registry registry = (Registry)itemToRender;
      
      jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.REGISTRY_ICON));
      jlItemTitle = new JLabel(registry.getName());
      toolTipTitle = "<b>Registry: </b>" + registry.getName();
    }
    else {
      jlItemTitle = new JLabel(itemToRender.toString());
      toolTipTitle = "<b>This item type is not recognised!</b><br>";
    }
    
    
    // SET THE TOOLTIP
    this.setToolTipText("<html>" + toolTipTitle + "</html>");
    
    
    // CELL DATA IS KNOWN - put everything together into the panel
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    c.insets = new Insets(2, 2, 2, 2);
    this.add(jlItemType, c);
    
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
