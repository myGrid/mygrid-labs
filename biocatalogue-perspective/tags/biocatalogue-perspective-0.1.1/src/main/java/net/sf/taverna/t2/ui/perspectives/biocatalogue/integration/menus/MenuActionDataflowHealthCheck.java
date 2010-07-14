package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.menus;

import java.awt.event.ActionEvent;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;

import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;
import net.sf.taverna.biocatalogue.model.SoapProcessorIdentity;
import net.sf.taverna.biocatalogue.ui.ServiceHealthChecker;
import net.sf.taverna.t2.ui.menu.AbstractContextualMenuAction;
import net.sf.taverna.t2.ui.menu.ContextualSelection;
import net.sf.taverna.t2.ui.menu.DefaultContextualMenu;
import net.sf.taverna.t2.ui.menu.MenuComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.Integration;
import net.sf.taverna.t2.workflowmodel.Dataflow;
import net.sf.taverna.t2.workflowmodel.InputPort;
import net.sf.taverna.t2.workflowmodel.Processor;

import net.sf.taverna.t2.activities.wsdl.servicedescriptions.WSDLServiceDescription;
import net.sf.taverna.t2.workbench.ui.workflowview.WorkflowView;

public class MenuActionDataflowHealthCheck extends AbstractContextualMenuAction {

  public MenuActionDataflowHealthCheck() throws URISyntaxException {
    super(BioCatalogueContextualMenuSection.BIOCATALOGUE_MENU_SECTION_ID, 50);
  }

  @Override
  protected Action createAction() {
    Action action = new AbstractAction("Workflow Health Check") {
      public void actionPerformed(ActionEvent e) {
        List<SoapProcessorIdentity> processorsToCheck = Integration.extractSupportedProcessorsFromDataflow(getContextualSelection());
        ServiceHealthChecker.checkAllProcessorsInTheWorkflow(processorsToCheck);
      }
    };
    action.putValue(Action.SHORT_DESCRIPTION, "Check monitoring status of all processors in this workflow");
    return (action);
  }

  @Override
  public boolean isEnabled() {
    return super.isEnabled() && getContextualSelection().getSelection() instanceof Dataflow;
  }
  
  
}
