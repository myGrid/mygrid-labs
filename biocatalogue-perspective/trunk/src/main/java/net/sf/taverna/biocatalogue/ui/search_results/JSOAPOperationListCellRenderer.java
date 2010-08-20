package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.ToolTipManager;

import net.sf.taverna.biocatalogue.model.LoadingResource;
import net.sf.taverna.biocatalogue.model.Resource;
import net.sf.taverna.biocatalogue.model.Resource.TYPE;
import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.Util;

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
  private static final int DESCRIPTION_MAX_LENGTH = 100;
  
  private static final int TOOLTIP_DESCRIPTION_LENGTH = 150;
  private static final int TOOLTIP_LINE_LENGTH = 60;
  
  // list cells are not repainted by Swing by default - hence to use animated GIFs inside cells,
  // need to have a special class that takes care of changing the frames as necessary
  private Icon loaderBarIcon = new AnimatedIcon(ResourceManager.getImageIcon(ResourceManager.BAR_LOADER_GREY));
  
  private JLabel jlTypeIcon;
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
    
    // LoadingResource is a placeholder for the detailed data on the resource --
    // it is being quickly fetched from the API and contanins just the name and the URL
    // of the actual resource;
    // 
    // these entries will be placed into the list when the initial part of the search
    // is complete, further details will be loaded asynchronously and inserted into
    // the same area
    if (itemToRender instanceof LoadingResource)
    {
      LoadingResource resource = (LoadingResource)itemToRender;
      
      jlTypeIcon = new JLabel(TYPE.SOAPOperation.getIcon());
      jlItemTitle = new JLabel(Resource.getListingNameForResource(resource), JLabel.LEFT);
      jlPartOf = (resource.isLoading() ? new JLabel(loaderBarIcon, JLabel.LEFT) : new JLabel(" "));
      jlDescription = new JLabel(" ");
    }
    
    // SoapOperation - real data about the operation: full details
    else if (itemToRender instanceof SoapOperation)
    {
      SoapOperation soapOp = (SoapOperation)itemToRender;
      
      jlTypeIcon = new JLabel(TYPE.SOAPOperation.getIcon());
      jlItemTitle = new JLabel(Resource.getListingNameForResource(soapOp), JLabel.LEFT);
      jlPartOf = new JLabel("<html><b>Part of: </b>" + soapOp.getAncestors().getSoapService().getResourceName() + "</html>");
      
      String strDescription = (soapOp.getDescription() == null || soapOp.getDescription().length() == 0 ?
                               "<font color=\"gray\">no description</font>" :
                               soapOp.getDescription());
      if (strDescription.length() > DESCRIPTION_MAX_LENGTH) {
        strDescription = strDescription.substring(0, DESCRIPTION_MAX_LENGTH) + "(...)";
      }
      strDescription = "<html><b>Description: </b>" + strDescription + "</html>";
      jlDescription = new JLabel(strDescription);
    }
    
    // error case - unknown resource...
    else
    {
      jlTypeIcon = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE_ICON));
      jlItemTitle = new JLabel("<html><font color=\"#FF0000\">ERROR: This item shoulnd't have been here...</font></html>");
      jlPartOf = new JLabel(" ");
      jlDescription = new JLabel(" ");
    }
    
    
    // POPULATE PANEL WITH PREPARED COMPONENTS
    c.anchor = GridBagConstraints.WEST;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.insets = new Insets(3,3,3,3);
    
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    this.add(jlTypeIcon, c);
    
    c.gridx = 1;
    c.weightx = 1.0;
    this.add(jlItemTitle, c);
    
    c.gridy++;
    this.add(jlPartOf, c);
    
    c.gridy++;
    this.add(jlDescription, c);
    
    
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
    return (this);
  }
  
  
}
