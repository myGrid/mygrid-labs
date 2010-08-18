package net.sf.taverna.biocatalogue.ui.search_results;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.ToolTipManager;

import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceMonitoringStatusInterpreter;
import net.sf.taverna.biocatalogue.model.Util;

import org.biocatalogue.x2009.xml.rest.Service;


/**
 * This list cell renderer is specifically designed to render (web) Service items in
 * a list box. Three data items will be shown per service -- status (as per monitoring data),
 * service type (soap / rest) and the name of the service.
 * 
 * @author Sergejs Aleksejevs
 */
public class JServiceListCellRenderer extends JPanel implements ListCellRenderer
{
  private static final int TOOLTIP_DESCRIPTION_LENGTH = 150;
  private static final int TOOLTIP_LINE_LENGTH = 40;
  
  private JLabel jlItemTitle;
  private JLabel jlItemType;
  private JLabel jlItemStatus;
  
  private String toolTipTitle;
  private String toolTipType;
  private String toolTipStatus;
  private String toolTipDescription;
  
  private GridBagConstraints c;
  
  
  public JServiceListCellRenderer()
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
    jlItemType = null;
    jlItemStatus = null;
    toolTipTitle = "<b>Service title: </b>";
    toolTipType = "<b>Type: </b>";
    toolTipStatus = "<b>Status: </b>";
    toolTipDescription = "<br><b>Description: </b>";
    
    
    // GET THE DATA
    if (itemToRender instanceof Service) {
      Service service = (Service)itemToRender;
      
      if (service.getServiceTechnologyTypes() != null && service.getServiceTechnologyTypes().getTypeList().size() > 0)
      {
        if (service.getServiceTechnologyTypes().getTypeList().size() > 1 &&
             !(service.getServiceTechnologyTypes().getTypeList().get(0).toString().equalsIgnoreCase("SOAP")) && 
               service.getServiceTechnologyTypes().getTypeList().get(1).toString().equalsIgnoreCase("SOAPLAB")
           )
        {
          jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_TYPE_MULTITYPE_ICON));
          toolTipType += "This service has more than one type<br>";
        }
        else if (service.getServiceTechnologyTypes().getTypeArray(0).toString().equalsIgnoreCase("SOAP")) {
          jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_TYPE_SOAP_ICON));
          toolTipType += "SOAP service<br>";
        }
        else if (service.getServiceTechnologyTypes().getTypeArray(0).toString().equalsIgnoreCase("REST")) {
          jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_TYPE_REST_ICON));
          toolTipType += "REST service<br>";
        }
      }
      
      
      jlItemTitle = new JLabel(service.getName());
      toolTipTitle += service.getName() + "<br>";
      
      
      jlItemStatus = new JLabel(ServiceMonitoringStatusInterpreter.getStatusIcon(service, true));
      toolTipStatus += service.getLatestMonitoringStatus().getLabel() + " - " + service.getLatestMonitoringStatus().getMessage() + "<br>";
      
      String strDescription = (service.getDescription() != null && 
                               service.getDescription().length() > 0) ?
                               service.getDescription() :
                               "no data is available";
      strDescription = Util.ensureStringLength(strDescription, TOOLTIP_DESCRIPTION_LENGTH);
      strDescription = Util.ensureLineLengthWithinString(strDescription, TOOLTIP_LINE_LENGTH, false);
      toolTipDescription += strDescription; 
      
    }
    else if (itemToRender != null) {
      jlItemTitle = new JLabel("(Error - not an instance of Service!) - " + itemToRender.toString());
      toolTipTitle = "<b>Error - not an instance of Service!</b><br>";
    }
    else {
      // item wasn't yet loaded
      jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE));
      jlItemStatus = new JLabel(ResourceManager.getImageIcon(ResourceManager.UNKNOWN_RESOURCE_TYPE));
      
      jlItemTitle = new JLabel("<html><font color=\"#BBBBBB\">Item was not loaded yet</font></html>");
      toolTipTitle = "<b>This item was not loaded yet</b><br>";
    }
    
    
    
    // VERIFY THAT ALL DATA IS AVAILABLE
    if (jlItemType == null) {
      jlItemType = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_TYPE_UNKNOWN_ICON));
      toolTipType += "data is not available<br>";
    }
    if (jlItemStatus.getIcon() == null) {
      jlItemStatus = new JLabel(ResourceManager.getImageIcon(ResourceManager.SERVICE_STATUS_UNCHECKED_ICON));
      // TODO - may cause problems if some value was already set
      toolTipStatus += "data is not available<br>";
    }
    
    
    // SET THE TOOLTIP
    this.setToolTipText("<html>" + toolTipTitle + toolTipType + toolTipStatus + toolTipDescription + "</html>");
    
    
    // CELL DATA IS KNOWN - put everything together into the panel
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    c.insets = new Insets(2, 2, 2, 2);
    this.add(jlItemStatus, c);
    
    c.gridx = 1;
    this.add(jlItemType, c);
    
    c.gridx = 2;
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
