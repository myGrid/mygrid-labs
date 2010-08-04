package net.sf.taverna.t2.activities.xpath.ui.servicedescription;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import net.sf.taverna.t2.workbench.activityicons.ActivityIconSPI;
import net.sf.taverna.t2.workflowmodel.processor.activity.Activity;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class XPathActivityIcon implements ActivityIconSPI
{
  private static final String FAMFAMFAM_SILK_PATH = "famfamfam_silk/";
  
  public static final String XPATH_ACTIVITY_ICON = FAMFAMFAM_SILK_PATH + "page_white_code.png";
  public static final String XPATH_ACTIVITY_CONFIGURATION_PARSE_XML_ICON = "arrow_right.png";
  
  public static final String XML_TREE_ROOT_ICON = FAMFAMFAM_SILK_PATH + "page_white_code.png";
  public static final String XML_TREE_NODE_ICON = FAMFAMFAM_SILK_PATH + "tag.png";
  public static final String XML_TREE_ATTRIBUTE_ICON = "xpath_attribute.png";
  
  public static final String XML_TREE_EXPAND_ALL_ICON = FAMFAMFAM_SILK_PATH + "text_linespacing.png";
  public static final String XML_TREE_COLLAPSE_ALL_ICON = FAMFAMFAM_SILK_PATH + "text_linespacing (collapse).png";
  
  public static final String XPATH_STATUS_OK_ICON = FAMFAMFAM_SILK_PATH + "accept.png";
  public static final String XPATH_STATUS_ERROR_ICON = FAMFAMFAM_SILK_PATH + "exclamation.png";
  public static final String XPATH_STATUS_UNKNOWN_ICON = FAMFAMFAM_SILK_PATH + "help.png";
  
  
  
  private static ImageIcon icon;
  
  public int canProvideIconScore(Activity<?> activity)
  {
    if (activity.getClass().getName().equals(XPathActivityIcon.class.getName()))
      return DEFAULT_ICON + 1;
    else
      return NO_ICON;
  }

  public Icon getIcon(Activity<?> activity) {
    return (getXPathActivityIcon());
  }

  public static Icon getXPathActivityIcon() {
    if (icon == null) {
      synchronized(XPathActivityIcon.class) {
        if (icon == null) {
          try {
            icon = new ImageIcon(XPathActivityIcon.class.getResource(XPATH_ACTIVITY_ICON));
          }
          catch (NullPointerException e) {
            /* icon wasn't found - do nothing, but no icon will be available */
          }
        }
      }
    }
    return (icon);
  }
  
  
  // TODO - exception handling
  public static Icon getIconById(String iconID) {
    return (new ImageIcon(XPathActivityIcon.class.getResource(iconID)));
  }

}
