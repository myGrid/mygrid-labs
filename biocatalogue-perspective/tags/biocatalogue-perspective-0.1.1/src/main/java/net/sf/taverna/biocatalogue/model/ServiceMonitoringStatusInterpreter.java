package net.sf.taverna.biocatalogue.model;

import java.net.URL;

import javax.swing.Icon;

import org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel;
import org.biocatalogue.x2009.xml.rest.Service;

/**
 * @author Sergejs Aleksejevs
 */
public class ServiceMonitoringStatusInterpreter
{
  // prevent instantiation of this class
  private ServiceMonitoringStatusInterpreter() { /* do nothing */ }
  
  
  /**
   * @param service
   * @param listingIconRequired True to get a small icon suitable for a JList entry;
   *                            false to get a larger icon.
   * @return
   */
  public static Icon getStatusIcon(Service service, boolean listingIconRequired) {
    return ResourceManager.getImageIcon(getStatusIconURL(service, listingIconRequired));
  }
  
  
  /**
   * @param service
   * @param listingIconRequired True to get a small icon suitable for a JList entry;
   *                            false to get a larger icon.
   * @return
   */
  public static URL getStatusIconURL(Service service, boolean listingIconRequired)
  {
    MonitoringStatusLabel.Enum serviceStatusLabel = service.getLatestMonitoringStatus().getLabel();
    
    switch (serviceStatusLabel.intValue()) {
      case MonitoringStatusLabel.INT_PASSED:
              return ResourceManager.getResourceLocalURL((listingIconRequired ?
                                                          ResourceManager.SERVICE_STATUS_PASSED_ICON :
                                                          ResourceManager.SERVICE_STATUS_PASSED_ICON_LARGE));
      case MonitoringStatusLabel.INT_WARNING:
              return ResourceManager.getResourceLocalURL((listingIconRequired ?
                                                          ResourceManager.SERVICE_STATUS_WARNING_ICON :
                                                          ResourceManager.SERVICE_STATUS_WARNING_ICON_LARGE));
      case MonitoringStatusLabel.INT_FAILED:
              return ResourceManager.getResourceLocalURL((listingIconRequired ?
                                                          ResourceManager.SERVICE_STATUS_FAILED_ICON :
                                                          ResourceManager.SERVICE_STATUS_FAILED_ICON_LARGE));
      case MonitoringStatusLabel.INT_UNCHECKED:
              return ResourceManager.getResourceLocalURL((listingIconRequired ?
                                                          ResourceManager.SERVICE_STATUS_UNCHECKED_ICON :
                                                          ResourceManager.SERVICE_STATUS_UNCHECKED_ICON_LARGE));
      default:
              return (ResourceManager.getResourceLocalURL(ResourceManager.SERVICE_STATUS_UNKNOWN_ICON));
    }
    
  }
}
