package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.health_check;

import net.sf.taverna.t2.visit.VisitKind;
import net.sf.taverna.t2.visit.Visitor;

/**
 * A {@link BioCatalogueWSDLActvityHealthCheck} is a kind of visit that determines
 * if the corresponding WSDL activity in a workflow will work during a workflow run -
 * checks will be made based on the monitoring status held about that service in BioCatalogue.
 * 
 * @author Sergejs Aleksejevs
 */
public class BioCatalogueWSDLActvityHealthCheck extends VisitKind
{
  @Override
  public Class<? extends Visitor> getVisitorClass() {
    return BioCatalogueWSDLActivityHealthChecker.class;
  }
  
  private static class Singleton {
    private static BioCatalogueWSDLActvityHealthCheck instance = new BioCatalogueWSDLActvityHealthCheck();
  }
  
  public static BioCatalogueWSDLActvityHealthCheck getInstance() {
    return Singleton.instance;
  }
}
