package net.sf.taverna.t2.activities.xpath;

import java.util.ArrayList;
import java.util.List;

import net.sf.taverna.t2.visit.VisitReport;
import net.sf.taverna.t2.visit.VisitReport.Status;
import net.sf.taverna.t2.workflowmodel.health.HealthCheck;
import net.sf.taverna.t2.workflowmodel.health.HealthChecker;

/**
 * A {@link HealthChecker} for a {@link XPathActivity}.
 *
 * @author Sergejs Aleksejevs
 */
public class XPathActivityHealthChecker implements HealthChecker<XPathActivity>
{
  public boolean canVisit(Object subject) {
    return (subject instanceof XPathActivity);
  }
  
  
  public VisitReport visit(XPathActivity activity, List<Object> ancestors)
  {
    // collection of validation reports that this health checker will create
    List<VisitReport> reports = new ArrayList<VisitReport>();
    
    
    XPathActivityConfigurationBean configBean = activity.getConfiguration();
    if (configBean.isValid()) {
      reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                  "XPath Activity is configured correctly", 
                                  XPathActivityHealthCheck.CORRECTLY_CONFIGURED, Status.OK));
    }
    else {
      int xpathStatus = XPathActivityConfigurationBean.validateXPath(configBean.getXpathExpression());
      if (xpathStatus == XPathActivityConfigurationBean.XPATH_EMPTY) {
        reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                    "XPath Activity - XPath expression is missing", 
                                    XPathActivityHealthCheck.EMPTY_XPATH_EXPRESSION, Status.SEVERE));
      }
      else if (xpathStatus == XPathActivityConfigurationBean.XPATH_INVALID) {
        reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                    "XPath Activity - XPath expression is invalid", 
                                    XPathActivityHealthCheck.INVALID_XPATH_EXPRESSION, Status.SEVERE));
      }
      else {
        reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                    "XPath Activity - bad configuration", 
                                    XPathActivityHealthCheck.GENERAL_CONFIG_PROBLEM, Status.SEVERE));
      }
    }
    
    
    // warn if there is no example XML document
    if (configBean.getXmlDocument() == null) {
      reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                  "XPath activity - no example XML document", 
                                  XPathActivityHealthCheck.NO_EXAMPLE_DOCUMENT, Status.WARNING));
    }
    
    
    // warn if there are no namespace mappings
    if (configBean.getXpathNamespaceMap() == null || configBean.getXpathNamespaceMap().isEmpty()) {
      reports.add(new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                  "XPath activity - empty namespace map", 
                                  XPathActivityHealthCheck.NO_NAMESPACE_MAPPINGS, Status.WARNING));
    }
    
    
    // collection all reports together
    Status worstStatus = VisitReport.getWorstStatus(reports);
    VisitReport report = new VisitReport(XPathActivityHealthCheck.getInstance(), activity, 
                                         "XPath Activity Report", HealthCheck.NO_PROBLEM, worstStatus, reports);
    
    return report;
  }
  
  
  
  /**
   * Health check for the XPath activity only involves
   * verifying details in the configuration bean -
   * that is quick.
   */
  public boolean isTimeConsuming() {
    return false;
  }

}
