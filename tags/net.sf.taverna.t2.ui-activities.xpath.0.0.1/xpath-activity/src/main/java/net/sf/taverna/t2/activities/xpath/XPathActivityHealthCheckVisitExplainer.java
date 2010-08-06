package net.sf.taverna.t2.activities.xpath;

import java.awt.Component;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;

import net.sf.taverna.t2.lang.ui.ReadOnlyTextArea;
import net.sf.taverna.t2.visit.VisitKind;
import net.sf.taverna.t2.visit.VisitReport;
import net.sf.taverna.t2.workbench.report.explainer.VisitExplainer;
import net.sf.taverna.t2.workbench.report.view.ReportViewConfigureAction;
import net.sf.taverna.t2.workflowmodel.Processor;

// import status constants
import static net.sf.taverna.t2.activities.xpath.XPathActivityHealthCheck.*;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class XPathActivityHealthCheckVisitExplainer implements VisitExplainer
{
  
  public boolean canExplain(VisitKind vk, int resultId) {
    return (vk instanceof XPathActivityHealthCheck);
  }
  
  
  /**
   * This class only handles {@link VisitReport} instances that are of
   * {@link XPathActivityHealthCheck} kind. Therefore, decisions on
   * the explanations / solutions are made solely by visit result IDs.
   */
  public JComponent getExplanation(VisitReport vr)
  {
    int resultId = vr.getResultId();
    String explanation = null;
    
    switch (resultId) {
      case CORRECTLY_CONFIGURED:
        explanation = "No problem found"; break;
        
      case EMPTY_XPATH_EXPRESSION:
        explanation = "XPath expression that this activity would apply to " +
        		          "the XML document at its input is not set"; break;
        
      case INVALID_XPATH_EXPRESSION:
        explanation = "XPath expression that this activity would apply to " +
                      "the XML document at its input is invalid or ill-formed"; break;
        
      case GENERAL_CONFIG_PROBLEM:
        explanation = "Configuration of this XPath activity is not valid"; break;
        
      case NO_EXAMPLE_DOCUMENT:
        explanation = "Current configuration of this XPath activity does not " +
        		          "contain an example XML document, from the tree structure of " +
        		          "which the XPath expression could be generated automatically.\n\n" +
        		          "This means that you have manually added the XPath expression - " +
        		          "this is fine, but semantical mistakes can be easily introduced into " +
        		          "the XPath expression in this case."; break;
        
      case NO_NAMESPACE_MAPPINGS:
        explanation = "Current configuration of this XPath activity does not include " +
        		          "any mappings of XML namespaces.\n\n" +
        		          "This does not indicate a problem with the configuration of this " +
        		          "activity, especially if the XPath expression was generated " +
        		          "automatically (by selecting desired element from the example " +
        		          "XML tree structure).\n\n" +
        		          "However, if you have typed in (or pasted) the XPath expression," +
        		          "it may be the case that the required XML namespace mappings were " +
        		          "not manually added."; break;
        
      default:
        explanation = "Unknown issue - no expalanation available"; break;
    }
    
    return new ReadOnlyTextArea(explanation);
  }
  
  
  
  /**
   * This class only handles {@link VisitReport} instances that are of
   * {@link XPathActivityHealthCheck} kind. Therefore, decisions on
   * the explanations / solutions are made solely by visit result IDs.
   */
  public JComponent getSolution(VisitReport vr)
  {
    int resultId = vr.getResultId();
    String explanation = null;
    boolean includeConfigButton = false;
    
    switch (resultId) {
      case CORRECTLY_CONFIGURED:
        explanation = "No change necessary"; break;
        
      case EMPTY_XPATH_EXPRESSION:
        explanation = "Enter the XPath expression manually or paste an example XML document " +
        		          "and select desired element from the automatically-generated tree structure:";
                      includeConfigButton = true;
                      break;
        
      case INVALID_XPATH_EXPRESSION:
        explanation = "Please check correctness of the XPath expression:";
                      includeConfigButton = true;
                      break;
        
      case GENERAL_CONFIG_PROBLEM:
        explanation = "Please check configuration of the XPath activity:";
                      includeConfigButton = true;
                      break;
        
      case NO_EXAMPLE_DOCUMENT:
        explanation = "Example XML document can be added in the configuration panel:";
                      includeConfigButton = true;
                      break;
        
      case NO_NAMESPACE_MAPPINGS:
        explanation = "Namespace mappings can be added in the configuration panel:";
                      includeConfigButton = true;
                      break;
        
      default:
        explanation = "Unknown issue - no expalanation available"; break;
    }
    
    
    JPanel jpSolution = new JPanel();
    jpSolution.setLayout(new BoxLayout(jpSolution, BoxLayout.Y_AXIS));
    
    ReadOnlyTextArea taExplanation = new ReadOnlyTextArea(explanation);
    taExplanation.setAlignmentX(Component.LEFT_ALIGNMENT);
    jpSolution.add(taExplanation);
    
    if (includeConfigButton)
    {
      JButton button = new JButton();
      Processor p = (Processor) (vr.getSubject());
      button.setAction(new ReportViewConfigureAction(p));
      button.setText("Open XPath Activity configuration dialog");
      button.setAlignmentX(Component.LEFT_ALIGNMENT);
      
      jpSolution.add(button);
    }
    
    
    return (jpSolution);
  }
  
}
