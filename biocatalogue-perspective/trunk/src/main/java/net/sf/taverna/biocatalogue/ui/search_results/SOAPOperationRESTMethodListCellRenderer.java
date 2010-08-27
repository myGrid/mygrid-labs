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
import java.net.Proxy.Type;
import java.util.ArrayList;
import java.util.List;

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
import org.biocatalogue.x2009.xml.rest.RestMethod;
import org.biocatalogue.x2009.xml.rest.RestParameter;
import org.biocatalogue.x2009.xml.rest.RestRepresentation;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceProvider;
import org.biocatalogue.x2009.xml.rest.SoapInput;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.SoapOutput;
import org.biocatalogue.x2009.xml.rest.User;

import com.blogspot.rabbit_hole.AnimatedIcon;


/**
 * This list cell renderer is specifically designed to render various resource items in
 * a list box - specifically: users, registries and service providers. An icon and the name
 * of the entity will be shown in each row.
 * 
 * @author Sergejs Aleksejevs
 */
public class SOAPOperationRESTMethodListCellRenderer extends JPanel implements ListCellRenderer
{
  private static final int DESCRIPTION_MAX_LENGTH_COLLAPSED = 90;
  private static final int DESCRIPTION_MAX_LENGTH_EXPANDED = 500;
  
  private static final int LINE_LENGTH = 90;
  
  
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
  
  private static Rectangle expandRect;

  
  public SOAPOperationRESTMethodListCellRenderer() {
    /* do nothing */
    this.thisPanel = this;
  }
  
  public static Rectangle getExpandRect() {
    return (expandRect == null ? new Rectangle() : expandRect);
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
      prepareInitiallyLoadingEntry(itemToRender);
    }
    
    // SoapOperation - real data about the operation: full details
    else if (itemToRender instanceof SoapOperation || itemToRender instanceof RestMethod) {
      prepareLoadedCollapsedEntry(itemToRender, false);
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
  
  
  
  /**
   * This entry can be in one of two states:
   * -- containing only the name of the resource and NOT loading further details;
   * -- containing only the name of the resource and LOADING further details.
   * 
   * @param itemToRender
   * @return
   */
  private GridBagConstraints prepareInitiallyLoadingEntry(Object itemToRender)
  {
    TYPE resourceType = determineResourceType(itemToRender);
    LoadingResource resource = (LoadingResource)itemToRender;
    
    jlTypeIcon = new JLabel(resourceType.getIcon());
    
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
   *                     fragment of the expanded list entry for this SOAP operation / REST method.
   * @return
   */
  private GridBagConstraints prepareLoadedCollapsedEntry(Object itemToRender, boolean expandedView)
  {
    TYPE resourceType = determineResourceType(itemToRender);
    SoapOperation soapOp = null;
    RestMethod restMethod = null;
    
    if (resourceType == TYPE.SOAPOperation) {
      soapOp = (SoapOperation)itemToRender;
    }
    else {
      restMethod = (RestMethod)itemToRender;
    }
    
    
    jlTypeIcon = new JLabel(resourceType.getIcon());
    
    jlItemTitle = new JLabel(Resource.getListingNameForResource(resourceType == TYPE.SOAPOperation ? soapOp : restMethod), JLabel.LEFT);
    jlItemTitle.setForeground(Color.decode("#AD0000"));  // very dark red
    jlItemTitle.setFont(jlItemTitle.getFont().deriveFont(Font.PLAIN, jlItemTitle.getFont().getSize() + 2));
    
    jlPartOf = new JLabel("<html><b>Part of: </b>" + 
                            (resourceType == TYPE.SOAPOperation ?
                             soapOp.getAncestors().getSoapService().getResourceName() :
                             restMethod.getAncestors().getRestService().getResourceName()) +
                          "</html>");
    
    int descriptionMaxLength = (expandedView ? DESCRIPTION_MAX_LENGTH_EXPANDED : DESCRIPTION_MAX_LENGTH_COLLAPSED);
    String strDescription = null;
    if (resourceType == TYPE.SOAPOperation) {
      strDescription = (soapOp.getDescription() == null || soapOp.getDescription().length() == 0 ?
                        "<font color=\"gray\">no description</font>" :
                        Util.stripAllHTML(soapOp.getDescription()));
    }
    else {
      strDescription = (restMethod.getDescription() == null || restMethod.getDescription().length() == 0 ?
          "<font color=\"gray\">no description</font>" :
            Util.stripAllHTML(restMethod.getDescription()));
    }
    strDescription = Util.ensureLineLengthWithinString(strDescription, LINE_LENGTH, false);
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
    GridBagConstraints c = prepareLoadedCollapsedEntry(expandedResource.getAssociatedObj(), true);
    
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
      TYPE resourceType = determineResourceType(itemToRender);
      
      // *** additional data for SOAP operations ***
      if (resourceType == TYPE.SOAPOperation)
      {
        SoapOperation soapOp = (SoapOperation) expandedResource.getAssociatedObj();
        
        // add SOAP inputs
        List<String> names = new ArrayList<String>();
        for (SoapInput soapInput : soapOp.getInputs().getSoapInputList()) {
          names.add(soapInput.getName());
        }
        
        String soapInputs = "<b>" + names.size() + " " + Util.pluraliseNoun("Input", names.size()) + "</b>";
        if(names.size() > 0) {
          soapInputs += ": " + Util.ensureLineLengthWithinString(Util.join(names, ", "), LINE_LENGTH, false);
        }
        soapInputs = "<html>" + soapInputs + "</html>";
        
        c.gridy++;
        this.add(new JLabel(soapInputs), c);
        
        
        // add SOAP outputs
        names.clear();
        for (SoapOutput soapOutput : soapOp.getOutputs().getSoapOutputList()) {
          names.add(soapOutput.getName());
        }
        
        String soapOutputs = "<b>" + names.size() + " " + Util.pluraliseNoun("Output", names.size()) + "</b>";
        if(names.size() > 0) {
          soapOutputs += ": " + Util.ensureLineLengthWithinString(Util.join(names, ", "), LINE_LENGTH, false);
        }
        soapOutputs = "<html>" + soapOutputs + "</html>";
        
        c.gridy++;
        this.add(new JLabel(soapOutputs), c);
      }
      
      // *** additional data for REST methods ***
      else
      {
        RestMethod restMethod = (RestMethod) expandedResource.getAssociatedObj();
        
        // URL template
        c.gridy++;
        this.add(new JLabel("<html><b>URL Template: </b>" + restMethod.getUrlTemplate() + "</html>"), c);
        
        
        // add REST method parameters
        List<String> names = new ArrayList<String>();
        for (RestParameter restParameter : restMethod.getInputs().getParameters().getRestParameterList()) {
          names.add(restParameter.getName() + (restParameter.getIsOptional() ? " (optional)" : ""));
        }
        
        String methodParameters = "<b>" + names.size() + " " + Util.pluraliseNoun("Parameter", names.size()) + "</b>";
        if(names.size() > 0) {
          methodParameters += ": " + Util.ensureLineLengthWithinString(Util.join(names, ", "), LINE_LENGTH, false);
        }
        methodParameters = "<html>" + methodParameters + "</html>";
        
        c.gridy++;
        this.add(new JLabel(methodParameters), c);
        
        
        // input representations (e.g. content types of data that can be sent)
        if (restMethod.getInputs().getRepresentations().getRestRepresentationList().size() > 0)
        {
          names.clear();
          for (RestRepresentation restRepresentation : restMethod.getInputs().getRepresentations().getRestRepresentationList()) {
            names.add(restRepresentation.getContentType());
          }
          
          String inputRerpresentations = "<b>" + names.size() + " " + Util.pluraliseNoun("Input representation", names.size()) + "</b>";
          if(names.size() > 0) {
            inputRerpresentations += ": " + Util.ensureLineLengthWithinString(Util.join(names, ", "), LINE_LENGTH, false);
          }
          inputRerpresentations = "<html>" + inputRerpresentations + "</html>";
          
          c.gridy++;
          this.add(new JLabel(inputRerpresentations), c);
        }
        
        // output representations
        names.clear();
        for (RestRepresentation restRepresentation : restMethod.getOutputs().getRepresentations().getRestRepresentationList()) {
          names.add(restRepresentation.getContentType());
        }
        
        String outputRerpresentations = "<b>" + names.size() + " " + Util.pluraliseNoun("Output representation", names.size()) + "</b>";
        if(names.size() > 0) {
          outputRerpresentations += ": " + Util.ensureLineLengthWithinString(Util.join(names, ", "), LINE_LENGTH, false);
        }
        outputRerpresentations = "<html>" + outputRerpresentations + "</html>";
        
        c.gridy++;
        this.add(new JLabel(outputRerpresentations), c);
      }
    }
    
    
  }
  
  
  
  private TYPE determineResourceType(Object itemToRender) {
    if (itemToRender instanceof ResourceLink) {
      return (Resource.getResourceTypeFromResourceURL(((ResourceLink)itemToRender).getHref()));
    }
    else {
      return (null);
    }
  }
  
}
