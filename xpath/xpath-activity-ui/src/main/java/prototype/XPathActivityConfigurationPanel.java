package prototype;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collections;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.InvalidXPathException;
import org.dom4j.Namespace;
import org.dom4j.Node;
import org.dom4j.XPath;
import org.jaxen.NamespaceContext;


/**
 * @author Sergejs Aleksejevs
 */
public class XPathActivityConfigurationPanel extends JPanel
{
  // --- CONSTANTS ---
  private static final Color INACTIVE_PANEL_BACKGROUND_COLOR = new Color(215, 215, 215); 
  
  
  // --- COMPONENTS FOR ACTIVITY CONFIGURATION PANEL ---
  private JPanel jpActivityConfiguration;
  
  private JPanel jpLeft;
  private JPanel jpRight;
  
  private JCheckBox cbIncludeAttributes;
  private JCheckBox cbIncludeValues;
  private JCheckBox cbIncludeNamespaces;
  
  private JTextArea taSourceXML;
  private JButton bParseXML;
  private XPathActivityXMLTree xmlTree;
  private JScrollPane spXMLTreePlaceholder;
  
  private JLabel jlXPathExpressionStatus;
  private JTextField tfXPathExpression;
  private JButton bRunXPath;
  
  
  // --- COMPONENTS FOR XPATH TEST PANEL ---
  private JPanel jpXPathTesting;
  
  private JTextField tfExecutedXPathExpression;
  private JTextField tfMatchingElementCount;
  private JTextArea taExecutedXPathExpressionResults;
  
  
  
  public XPathActivityConfigurationPanel()
  {
    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    c.weighty = 0.60;
    c.insets = new Insets (10, 10, 15, 10);
    this.jpActivityConfiguration = createActivityConfigurationPanel();
    this.add(this.jpActivityConfiguration, c);
    
    
    c.gridy++;;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weighty = 0;
    c.insets = new Insets (0, 10, 0, 10);
    this.add(new JSeparator(), c);
    
    
    c.gridy++;
    c.fill = GridBagConstraints.BOTH;
    c.weighty = 0.40;
    c.insets = new Insets (15, 10, 10, 10);
    this.jpXPathTesting = createXPathExpressionTestingPanel();
    this.add(this.jpXPathTesting, c);
  }
  
  
  private JPanel createActivityConfigurationPanel()
  {
    JPanel jpConfig = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    
    // settings for generation of XML tree from example XML document 
    
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 3;
    c.insets = new Insets(0, 0, 0, 0);
    c.anchor = GridBagConstraints.WEST;
    cbIncludeAttributes = new JCheckBox("Show XML node attributes in the tree");
    cbIncludeAttributes.setSelected(true);
    jpConfig.add(cbIncludeAttributes, c);
    
    c.gridy++;
    c.gridwidth = 3;
    c.insets = new Insets(0, 0, 0, 0);
    cbIncludeValues = new JCheckBox("Show values of XML nodes and attributes in the tree");
    cbIncludeValues.setSelected(true);
    jpConfig.add(cbIncludeValues, c);
    
    
    c.gridy++;
    c.gridwidth = 3;
    c.insets = new Insets(0, 0, 0, 0);
    cbIncludeNamespaces = new JCheckBox("Show namespaces of XML elements in the tree");
    jpConfig.add(cbIncludeNamespaces, c);
    
    
    // text area for example XML document
    
    c.gridx = 0;
    c.gridy++;
    c.gridwidth = 1;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 0.5;
    c.weighty = 1.0;
    c.insets = new Insets(10, 0, 0, 5);
    taSourceXML = new JTextArea(10, 10);
    jpLeft = new JPanel(new GridLayout(1,1));
    jpLeft.add(new JScrollPane(taSourceXML));
    jpConfig.add(jpLeft, c);
    
    
    // button to parse example XML document
    
    c.gridx++;
    c.fill = GridBagConstraints.NONE;
    c.weightx = 0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 0, 0);
    bParseXML = new JButton(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_ACTIVITY_CONFIGURATION_PARSE_XML_ICON));
    bParseXML.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        parseXML();
      }
    });
    jpConfig.add(bParseXML, c);
    
    
    // placeholder for XML tree (will be replaced by a real tree when the parsing is done)
    
    c.gridx++;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 0.5;
    c.weighty = 1.0;
    c.insets = new Insets(10, 5, 0, 0);
    JTextArea taXMLTreePlaceholder = new JTextArea(10, 10);
    taXMLTreePlaceholder.setEditable(false);
    taXMLTreePlaceholder.setBackground(INACTIVE_PANEL_BACKGROUND_COLOR);
    spXMLTreePlaceholder = new JScrollPane(taXMLTreePlaceholder);
    jpRight = new JPanel(new GridLayout(1,1));
    jpRight.add(spXMLTreePlaceholder);
    jpConfig.add(jpRight, c);
    
    
    // XPath expression editing panel
    
    c.gridx = 0;
    c.gridy++;
    c.gridwidth = 3;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1.0;
    c.weighty = 0;
    c.insets = new Insets(10, 0, 10, 0);
    jpConfig.add(createXPathExpressionEditingPanel(), c);
    
    
    return (jpConfig);
  }
  
    
  private JPanel createXPathExpressionEditingPanel()
  {
    this.jlXPathExpressionStatus = new JLabel(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_UNKNOWN_ICON));
    
    this.bRunXPath = new JButton("Run XPath");
    this.bRunXPath.setEnabled(false);
    this.bRunXPath.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        runXPath();
      }
    });
    
    this.tfXPathExpression = new JTextField(30);
    this.tfXPathExpression.setPreferredSize(new Dimension(0, this.bRunXPath.getPreferredSize().height));
    this.tfXPathExpression.addCaretListener(new CaretListener() {
      public void caretUpdate(CaretEvent e) {
        validateXPath();
      }
    });
    this.tfXPathExpression.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) { 
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
          runXPath();
        }
      }
      public void keyReleased(KeyEvent e) { /* not in use */ }
      public void keyTyped(KeyEvent e) { /* not in use */ }
    });
    
    JPanel jpXPath = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.HORIZONTAL;
    
    c.weightx = 0;
    jpXPath.add(jlXPathExpressionStatus);
    
    c.weightx = 1.0;
    c.insets = new Insets(0, 10, 0, 10);
    jpXPath.add(tfXPathExpression, c);
    
    c.weightx = 0;
    c.insets = new Insets(0, 0, 0, 0);
    jpXPath.add(bRunXPath, c);
    
    return (jpXPath);
  }
  
  
  private JPanel createXPathExpressionTestingPanel()
  {
    JPanel jpTesting = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    c.gridwidth = 1;
    c.anchor = GridBagConstraints.WEST;
    c.fill = GridBagConstraints.NONE;
    c.weightx = 0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 5, 10);
    jpTesting.add(new JLabel("Executed XPath expression:"), c);
    
    c.gridx++;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1.0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 5, 10);
    tfExecutedXPathExpression = new JTextField("--");
    tfExecutedXPathExpression.setEditable(false);
    tfExecutedXPathExpression.setBorder(null);
    jpTesting.add(tfExecutedXPathExpression, c);
    
    
    c.gridx = 0;
    c.gridy++;
    c.fill = GridBagConstraints.NONE;
    c.weightx = 0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 10, 10);
    jpTesting.add(new JLabel("Number of mathing nodes:"), c);
    
    c.gridx++;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 1.0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 10, 10);
    tfMatchingElementCount = new JTextField("--");
    tfMatchingElementCount.setEditable(false);
    tfMatchingElementCount.setBorder(null);
    jpTesting.add(tfMatchingElementCount, c);
    
    
    c.gridx = 0;
    c.gridy++;
    c.gridwidth = 2;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    c.weighty = 1.0;
    taExecutedXPathExpressionResults = new JTextArea();
    taExecutedXPathExpressionResults.setBackground(INACTIVE_PANEL_BACKGROUND_COLOR);
    taExecutedXPathExpressionResults.setEditable(false);
    jpTesting.add(new JScrollPane(taExecutedXPathExpressionResults), c);
    
    
    return (jpTesting);
  }
  
  
  private void parseXML()
  {
    String xmlData = taSourceXML.getText();
    
    try {
      xmlTree = XPathActivityXMLTree.createFromXMLData(xmlData, cbIncludeAttributes.isSelected(),
          cbIncludeValues.isSelected(), cbIncludeNamespaces.isSelected(), this);
      xmlTree.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      JScrollPane spXMLTree = new JScrollPane(xmlTree);
      spXMLTree.setPreferredSize(spXMLTreePlaceholder.getPreferredSize());
      jpRight.removeAll();
      jpRight.add(spXMLTree);
      
      this.validate();
      this.repaint();
    }
    catch (DocumentException e) {
      JOptionPane.showMessageDialog(this, e.getMessage(), "XPath Activity", JOptionPane.ERROR_MESSAGE);
      return;
    }
  }
  
  
  protected void updateXPathTextField() {
    tfXPathExpression.setText(xmlTree.getCurrentXPathExpression().getText());
  }
  
  
  private void validateXPath()
  {
    String candidatePath = tfXPathExpression.getText().trim();
    
    if (candidatePath.length() == 0) {
      jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_UNKNOWN_ICON));
      this.bRunXPath.setEnabled(false);
    }
    else {
      try {
        DocumentHelper.createXPath(candidatePath);
        jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_OK_ICON));
        this.bRunXPath.setEnabled(true);
      }
      catch (InvalidXPathException e) {
        jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_ERROR_ICON));
        this.bRunXPath.setEnabled(false);
      }
    }
  }
  
  
  private void runXPath()
  {
    // ----- RUNNING THE XPath EXPRESSION -----
    XPath expr = xmlTree.getCurrentXPathExpression();
    Document doc = xmlTree.getDocumentUsedToPopulateTree();
    List<Node> matchingNodes = expr.selectNodes(doc);
    
    // ----- DISPLAYING THE RESULTS -----
    tfExecutedXPathExpression.setText(expr.getText());
    tfMatchingElementCount.setText("" + matchingNodes.size());
    
    StringBuffer outNodes = new StringBuffer();
    for (Node n : matchingNodes) {
      outNodes.append(n.asXML() + "\n");
    }
    taExecutedXPathExpressionResults.setText(outNodes.toString());
    taExecutedXPathExpressionResults.setBackground(Color.WHITE);
  }
  
  
  /**
   * For testing
   */
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new XPathActivityConfigurationPanel());
    frame.pack();
    frame.setSize(new Dimension(800, 600));
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

}
