package prototype;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultTreeModel;

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
  
  private static final String EXAMPLE_XML_PROMPT = "Paste example XML here...";
  
  
  
  private XPathActivityConfigurationPanel thisPanel;
  
  
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
  
  // --- COMPONENTS FOR XPATH EDITING PANEL ---
  private JLabel jlXPathExpressionStatus;
  private JTextField tfXPathExpression;
  private JButton bRunXPath;
  
  private JLabel jlShowHideNamespaceMappings;
  private JTable jtXPathNamespaceMappings;
  private JButton bAddMapping;
  private JPanel jpNamespaceMappingsWithButton;
  
  
  // --- COMPONENTS FOR XPATH TESTING PANEL ---
  private JPanel jpXPathTesting;
  
  private JTextField tfExecutedXPathExpression;
  private JTextField tfMatchingElementCount;
  
  private JTabbedPane tpExecutedXPathExpressionResults;
  private JTextArea taExecutedXPathExpressionResultsAsText;
  private JTextArea taExecutedXPathExpressionResultsAsXML;
  
  
  
  public XPathActivityConfigurationPanel()
  {
    this.thisPanel = this;
    
    this.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    c.gridx = 0;
    c.gridy = 0;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    c.weighty = 0.50;
    c.insets = new Insets (10, 10, 20, 10);
    this.jpActivityConfiguration = createActivityConfigurationPanel();
    this.add(this.jpActivityConfiguration, c);
    
    
    c.gridy++;;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weighty = 0;
    c.insets = new Insets (0, 10, 0, 10);
    this.add(new JSeparator(), c);
    
    
    // XPath expression editing panel
    c.gridy++;
    c.fill = GridBagConstraints.BOTH;
    c.weighty = 0.15;
    c.insets = new Insets(20, 10, 20, 10);
    this.add(createXPathExpressionEditingPanel(), c);
    
    
    c.gridy++;;
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weighty = 0;
    c.insets = new Insets (0, 10, 0, 10);
    this.add(new JSeparator(), c);
    
    
    // XPath expression testing panel
    c.gridy++;
    c.fill = GridBagConstraints.BOTH;
    c.weighty = 0.35;
    c.insets = new Insets (20, 10, 10, 10);
    this.jpXPathTesting = createXPathExpressionTestingPanel();
    this.add(this.jpXPathTesting, c);
  }
  
  
  private JPanel createActivityConfigurationPanel()
  {
    JPanel jpConfig = new JPanel(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    
    
    // text area for example XML document
    c.gridx = 0;
    c.gridy = 0;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 0.5;
    c.weighty = 1.0;
    c.insets = new Insets(10, 0, 0, 5);
    taSourceXML = new JTextArea(10, 30);
    taSourceXML.setText(EXAMPLE_XML_PROMPT);
    taSourceXML.addFocusListener(new FocusListener() {
      public void focusGained(FocusEvent e) {
        taSourceXML.selectAll();
      }
      public void focusLost(FocusEvent e) { /* do nothing */ }
    });
    taSourceXML.addCaretListener(new CaretListener() {
      public void caretUpdate(CaretEvent e) {
        // make sure that it is only allowed to "parse example XML"
        // when something is actually present in the text area
        bParseXML.setEnabled(taSourceXML.getText().trim().length() > 0 &&
                            !taSourceXML.getText().trim().equals(EXAMPLE_XML_PROMPT));
      }
    });
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
    bParseXML.setToolTipText("Parse example XML document and generate its tree structure");
    bParseXML.setEnabled(false);
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
    JTextArea taXMLTreePlaceholder = new JTextArea(10, 30);
    taXMLTreePlaceholder.setEditable(false);
    taXMLTreePlaceholder.setBackground(INACTIVE_PANEL_BACKGROUND_COLOR);
    spXMLTreePlaceholder = new JScrollPane(taXMLTreePlaceholder);
    jpRight = new JPanel(new GridLayout(1,1));
    jpRight.add(spXMLTreePlaceholder);
    jpConfig.add(jpRight, c);
    
    
    
    // settings for the view of XML tree from example XML document
    
    c.gridx = 0;
    c.gridy++;
    c.gridwidth = 3;
    c.fill = GridBagConstraints.NONE;
    c.weightx = 0;
    c.weighty = 0;
    c.insets = new Insets(0, 0, 0, 0);
    c.anchor = GridBagConstraints.WEST;
    cbIncludeAttributes = new JCheckBox("Show XML node attributes");
    cbIncludeAttributes.setEnabled(false);
    cbIncludeAttributes.setSelected(true);
    cbIncludeAttributes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        refreshXMLTreeUI();
      }
    });
    jpConfig.add(cbIncludeAttributes, c);
    
    c.gridy++;
    cbIncludeValues = new JCheckBox("Show values of XML elements and attributes");
    cbIncludeValues.setEnabled(false);
    cbIncludeValues.setSelected(true);
    cbIncludeValues.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        refreshXMLTreeUI();
      }
    });
    jpConfig.add(cbIncludeValues, c);
    
    c.gridy++;
    cbIncludeNamespaces = new JCheckBox("Show namespaces of XML elements");
    cbIncludeNamespaces.setEnabled(false);
    cbIncludeNamespaces.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        refreshXMLTreeUI();
      }
    });
    jpConfig.add(cbIncludeNamespaces, c);
    
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
    c.weighty = 0;
    
    c.gridx = 0;
    c.gridy = 0;
    c.weightx = 0;
    jpXPath.add(jlXPathExpressionStatus);
    
    c.gridx++;
    c.weightx = 1.0;
    c.insets = new Insets(0, 10, 0, 10);
    jpXPath.add(tfXPathExpression, c);
    
    c.gridx++;
    c.weightx = 0;
    c.insets = new Insets(0, 0, 0, 0);
    jpXPath.add(bRunXPath, c);
    
    
    c.gridx = 1;
    c.gridy++;
    c.weightx = 1.0;
    c.weighty = 0;
    c.gridwidth = 2;
    c.fill = GridBagConstraints.NONE;
    c.anchor = GridBagConstraints.WEST;
    c.insets = new Insets(0, 10, 0, 10);
    jlShowHideNamespaceMappings = new JLabel("Show namespace mappings...");
    jlShowHideNamespaceMappings.setForeground(Color.BLUE);
    jlShowHideNamespaceMappings.setCursor(new Cursor(Cursor.HAND_CURSOR));
    jlShowHideNamespaceMappings.addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        jpNamespaceMappingsWithButton.setVisible(!jpNamespaceMappingsWithButton.isVisible());
        jlShowHideNamespaceMappings.setText((jpNamespaceMappingsWithButton.isVisible() ? "Hide" : "Show") + " namespace mappings...");
        thisPanel.validate();
      }
    });
    jpXPath.add(jlShowHideNamespaceMappings, c);
    
    
    // namespace mapping table
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Namespace Prefix");
    tableModel.addColumn("Namespace URI");
    
    jtXPathNamespaceMappings = new JTable();
    jtXPathNamespaceMappings.setModel(tableModel);
    jtXPathNamespaceMappings.setFillsViewportHeight(true);
    jtXPathNamespaceMappings.setCellSelectionEnabled(true);
    jtXPathNamespaceMappings.setPreferredScrollableViewportSize(new Dimension(200, 30)); // NB! this prevents the table from occupying most of the space in the panel when screen is maximized
    
    jtXPathNamespaceMappings.getColumnModel().getColumn(0).setPreferredWidth(20);  // set relative sizes of columns
    jtXPathNamespaceMappings.getColumnModel().getColumn(1).setPreferredWidth(300);
    
    JScrollPane spXPathNamespaceMappings = new JScrollPane(jtXPathNamespaceMappings);
    spXPathNamespaceMappings.setAlignmentY(TOP_ALIGNMENT);
    
    bAddMapping = new JButton("Add Mapping");
    bRunXPath.setPreferredSize(bAddMapping.getPreferredSize()); // make sure that the 'run xpath' button above is of the same size
    bAddMapping.setAlignmentY(TOP_ALIGNMENT);
    
    jpNamespaceMappingsWithButton = new JPanel();
    jpNamespaceMappingsWithButton.setVisible(false);
    jpNamespaceMappingsWithButton.setLayout(new BoxLayout(jpNamespaceMappingsWithButton, BoxLayout.X_AXIS));
    jpNamespaceMappingsWithButton.add(spXPathNamespaceMappings);
    jpNamespaceMappingsWithButton.add(Box.createHorizontalStrut(10));
    jpNamespaceMappingsWithButton.add(bAddMapping);
    
    c.gridx = 0;
    c.gridy++;
    c.gridwidth = 3;
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    c.weighty = 1.0;
    c.insets = new Insets(10, 0, 0, 0);
    jpXPath.add(jpNamespaceMappingsWithButton, c);
    
    
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
    tpExecutedXPathExpressionResults = new JTabbedPane();
    jpTesting.add(tpExecutedXPathExpressionResults, c);
    
    taExecutedXPathExpressionResultsAsText = new JTextArea();
    taExecutedXPathExpressionResultsAsText.setBackground(INACTIVE_PANEL_BACKGROUND_COLOR);
    taExecutedXPathExpressionResultsAsText.setBorder(BorderFactory.createEmptyBorder(3, 7, 3, 7));
    taExecutedXPathExpressionResultsAsText.setEditable(false);
    tpExecutedXPathExpressionResults.add("Results as text", new JScrollPane(taExecutedXPathExpressionResultsAsText));
    
    taExecutedXPathExpressionResultsAsXML = new JTextArea();
    taExecutedXPathExpressionResultsAsXML.setBackground(INACTIVE_PANEL_BACKGROUND_COLOR);
    taExecutedXPathExpressionResultsAsXML.setBorder(BorderFactory.createEmptyBorder(3, 7, 3, 7));
    taExecutedXPathExpressionResultsAsXML.setEditable(false);
    tpExecutedXPathExpressionResults.add("Results as XML", new JScrollPane(taExecutedXPathExpressionResultsAsXML));
    
    
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
      
      // all successful - enable options to modify the tree
      this.cbIncludeAttributes.setEnabled(true);
      this.cbIncludeValues.setEnabled(true);
      this.cbIncludeNamespaces.setEnabled(true);
      
      // check if there is any XPath expression already - validate it, and possibly
      // enable execution of it through the button "Run XPath"
      validateXPath();
      
      this.validate();
      this.repaint();
    }
    catch (DocumentException e) {
      JOptionPane.showMessageDialog(this, e.getMessage(), "XPath Activity", JOptionPane.ERROR_MESSAGE);
      return;
    }
  }
  
  
  /**
   * Makes the {@link XPathActivityXMLTree} to refresh its UI from
   * the original XML document that was used to create it in first place.
   * 
   * The reason for using this method is to apply new options to the
   * way the tree is rendered - e.g. attributes shown/hidden in the tree,
   * values and namespaces shown/hidden, etc.
   */
  protected void refreshXMLTreeUI()
  {
    this.xmlTree.refreshFromExistingDocument(
            this.cbIncludeAttributes.isSelected(),
            this.cbIncludeValues.isSelected(),
            this.cbIncludeNamespaces.isSelected());
  }
  
  
  protected void updateXPathEditingPanel()
  {
    tfXPathExpression.setText(xmlTree.getCurrentXPathExpression().getText());
    
    // clear the namespace mapping table and reload the data from the map
    DefaultTableModel tableModel = (DefaultTableModel)jtXPathNamespaceMappings.getModel();
    tableModel.getDataVector().removeAllElements();
    for (Map.Entry<String,String> mapping : xmlTree.getCurrentXPathNamespaces().entrySet()) {
      tableModel.addRow(new Object[] {mapping.getKey(), mapping.getValue()});
    }
  }
  
  
  private void validateXPath()
  {
    String candidatePath = tfXPathExpression.getText().trim();
    
    if (candidatePath.length() == 0) {
      // no XPath expression - can't tell if it is correct + nothing to execute
      jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_UNKNOWN_ICON));
      this.bRunXPath.setEnabled(false);
    }
    else {
      try {
        // try to parse the XPath expression...
        DocumentHelper.createXPath(candidatePath);
        
        // ...success: expression is correct
        jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_OK_ICON));
        
        // could allow to execute against example XML, with only condition: XML tree must be populated
        // (that is, there should be something to run the expression against)
        this.bRunXPath.setEnabled(xmlTree != null);
      }
      catch (InvalidXPathException e) {
        // ...failed to parse the XPath expression: notify of the error
        jlXPathExpressionStatus.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XPATH_STATUS_ERROR_ICON));
        this.bRunXPath.setEnabled(false);
      }
    }
  }
  
  
  private void runXPath()
  {
    // ----- RUNNING THE XPath EXPRESSION -----
    XPath expr = DocumentHelper.createXPath(this.tfXPathExpression.getText());
    expr.setNamespaceURIs(xmlTree.getCurrentXPathNamespaces());
    
    
    Document doc = xmlTree.getDocumentUsedToPopulateTree();
    List<Node> matchingNodes = expr.selectNodes(doc);
    
    // ----- DISPLAYING THE RESULTS -----
    tfExecutedXPathExpression.setText(expr.getText());
    tfMatchingElementCount.setText("" + matchingNodes.size());
    
    StringBuffer outNodesText = new StringBuffer();
    StringBuffer outNodesXML = new StringBuffer();
    for (Node n : matchingNodes) {
      if (n.getStringValue() != null && n.getStringValue().length() > 0) {
        outNodesText.append(n.getStringValue() + "\n");
      }
      outNodesXML.append(n.asXML() + "\n");
    }
    
//    tpExecutedXPathExpressionResults.setSelectedIndex(0); // open the first tab (should be the one with textual results) // TODO - enable if needed
    
    taExecutedXPathExpressionResultsAsText.setText(outNodesText.toString());
    taExecutedXPathExpressionResultsAsText.setBackground(Color.WHITE);
    
    taExecutedXPathExpressionResultsAsXML.setText(outNodesXML.toString());
    taExecutedXPathExpressionResultsAsXML.setBackground(Color.WHITE);
  }
  
  
  /**
   * For testing
   */
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new XPathActivityConfigurationPanel());
    frame.pack();
    frame.setSize(new Dimension(900, 600));
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

}
