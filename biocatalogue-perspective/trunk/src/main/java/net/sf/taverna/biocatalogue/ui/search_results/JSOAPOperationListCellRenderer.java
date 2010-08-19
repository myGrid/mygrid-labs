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
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.User;


/**
 * This list cell renderer is specifically designed to render various resource items in
 * a list box - specifically: users, registries and service providers. An icon and the name
 * of the entity will be shown in each row.
 * 
 * @author Sergejs Aleksejevs
 */
public class JSOAPOperationListCellRenderer extends JPanel implements ListCellRenderer
{
  private static final int TOOLTIP_DESCRIPTION_LENGTH = 150;
  private static final int TOOLTIP_LINE_LENGTH = 60;
  
  
  private Icon loaderBarIcon = ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_ORANGE);
  private JLabel jlLoaderBar;
  
  private JLabel jlStatusIcon;
  private JLabel jlItemTitle;
  private JLabel jlPartOf;
  private JLabel jlDescription;
  private String toolTipTitle;
  
  private GridBagConstraints c;
  
  
  public JSOAPOperationListCellRenderer()
  {
    // can set any settings that should be reflected in all items - e.g. opacity, alignment, etc
    this.setLayout(new GridBagLayout());
    c = new GridBagConstraints();
    c.anchor = GridBagConstraints.WEST;
    c.weightx = 1.0;
  }
  
  public Component getListCellRendererComponent(JList list, Object itemToRender, int itemIndex, boolean isSelected, boolean cellHasFocus)
  {
    // the same instance of the cell renderer is used for all cells, so
    // need to remove everything from the current panel to ensure clean
    // painting of the current cell
    this.removeAll();
    c.gridx = 0;
    c.gridy = 0;
    
    // GET THE DATA
    
    // icon to represent the type of resource
    if (itemToRender instanceof LoadingResource)
    {
      LoadingResource resource = (LoadingResource)itemToRender;
      
      jlItemTitle = new JLabel(Resource.getListingNameForResource(resource));
      jlPartOf = new JLabel(" __part_of__ ");
      jlLoaderBar = new JLabel(loaderBarIcon);
      jlDescription = new JLabel(" __no_desc__ ");
      
      this.add(jlItemTitle, c);
      
      c.gridy++;
      this.add((resource.isLoading() ? jlLoaderBar : jlPartOf), c);
      
      c.gridy++;
      this.add(jlDescription, c);
    }
    
    else if (itemToRender instanceof SoapOperation)
    {
      SoapOperation soapOp = (SoapOperation)itemToRender;
      
      jlItemTitle = new JLabel(Resource.getListingNameForResource(soapOp));
      jlPartOf = new JLabel("Part of: " + soapOp.getAncestors().getSoapService().getTitle());
      
      String strDescription = soapOp.getDescription() == null ? "no description" : "Description: " + soapOp.getDescription();
      if (strDescription.length() > 30) {
        strDescription = strDescription.substring(0, 30);
      }
      jlDescription = new JLabel(strDescription);
      
      this.add(jlItemTitle, c);
      
      c.gridy++;
      this.add(jlPartOf, c);
      
      c.gridy++;
      this.add(jlDescription, c);
    }
    
    else
    {
      jlItemTitle = new JLabel("<html><font color=\"#FF0000\">ERROR: This item shoulnd't have been here...</font></html>");
      jlPartOf = new JLabel(" ");
      jlDescription = new JLabel(" ");
      
      this.add(jlItemTitle, c);
      
      c.gridy++;
      this.add(jlPartOf, c);
      
      c.gridy++;
      this.add(jlDescription, c);
    }
    
    
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
