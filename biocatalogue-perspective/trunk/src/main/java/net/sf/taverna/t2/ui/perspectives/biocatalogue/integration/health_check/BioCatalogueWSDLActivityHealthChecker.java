package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.health_check;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.UIManager;

import org.biocatalogue.x2009.xml.rest.MonitoringStatusLabel;
import org.biocatalogue.x2009.xml.rest.Service;

import net.sf.taverna.biocatalogue.model.ResourceManager;
import net.sf.taverna.biocatalogue.model.ServiceMonitoringStatusInterpreter;
import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;
import net.sf.taverna.t2.activities.wsdl.WSDLActivity;
import net.sf.taverna.t2.activities.wsdl.WSDLActivityConfigurationBean;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;
import net.sf.taverna.t2.visit.VisitReport;
import net.sf.taverna.t2.visit.VisitReport.Status;
import net.sf.taverna.t2.workflowmodel.health.HealthCheck;
import net.sf.taverna.t2.workflowmodel.health.HealthChecker;

/**
 * A {@link HealthChecker} for a {@link WSDLActivity}.
 *
 * @author Sergejs Aleksejevs
 */
public class BioCatalogueWSDLActivityHealthChecker implements HealthChecker<WSDLActivity>
{
  public boolean canVisit(Object subject) {
    return (subject instanceof WSDLActivity);
  }
  
  
  public VisitReport visit(WSDLActivity activity, List<Object> ancestors)
  {
    WSDLActivityConfigurationBean configBean = activity.getConfiguration();
    SoapOperationIdentity soapOpIdentity = new SoapOperationIdentity(configBean.getWsdl(), configBean.getOperation(), null);
    
    try {
      Service serviceWithMonitoringData = MainComponentFactory.getSharedInstance().
                                          getBioCatalogueClient().lookupParentServiceMonitoringData(soapOpIdentity);
      MonitoringStatusLabel.Enum serviceStatusLabel = null;
      
      VisitReport.Status status = null;
      String visitReportMessage = null;
      
      if (serviceWithMonitoringData == null) {
        visitReportMessage = "BioCatalogue monitoring: no data about this service in BioCatalogue";
        status = Status.OK;
      }
      else if (serviceWithMonitoringData.getLatestMonitoringStatus() == null) {
        visitReportMessage = "BioCatalogue monitoring: known service, but no monitoring data available";
        status = Status.OK;
      }
      else
      {
        serviceStatusLabel = serviceWithMonitoringData.getLatestMonitoringStatus().getLabel();
        
        switch (serviceStatusLabel.intValue()) {
          case MonitoringStatusLabel.INT_PASSED:
            visitReportMessage = "BioCatalogue monitoring: all tests passed"; 
            status = Status.OK;
            break;
                  
          case MonitoringStatusLabel.INT_WARNING:
            visitReportMessage = "BioCatalogue monitoring: some tests failed";
            status = Status.WARNING;
            break;
                  
          case MonitoringStatusLabel.INT_FAILED:
            visitReportMessage = "BioCatalogue monitoring: all tests failed";
            status = Status.SEVERE;
            break;
          
          case MonitoringStatusLabel.INT_UNCHECKED:
            visitReportMessage = "BioCatalogue monitoring: no tests have been made";
            status = Status.OK;
            break;
                  
          default:
            visitReportMessage = "BioCatalogue monitoring: unknown monitoring status received - " + serviceStatusLabel.toString();
            status = Status.WARNING;
            break;
        }
      }
      
      return (new VisitReport(BioCatalogueWSDLActvityHealthCheck.getInstance(), activity, 
                              visitReportMessage, (serviceStatusLabel == null ? -1 : serviceStatusLabel.intValue()), status));  // TODO - fix "-1"
    }
    catch (Exception e) {
      // TODO  -- logger!!
      e.printStackTrace();
      return null;
    }
  }
  
  
  
  /**
   * Health check for the WSDL activities involves fetching
   * the monitoring status of each activity from BioCatalogue - 
   * this *may* be time consuming.
   */
  public boolean isTimeConsuming() {
    return true;
  }

}
