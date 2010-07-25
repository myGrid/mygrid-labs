package prototype;
import java.awt.Component;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeCellRenderer;
import javax.swing.tree.TreePath;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.tree.DefaultAttribute;


public class XPathActivityXMLTree extends JTree
{
  /**
   *  holds value of the current XPath expression obtained from 
   *  the combination of nodes selected in the XML tree 
   */
  private String currentXPathExpression;
  
  /**
   * 
   */
  private XPathActivityConfigurationPanel parentConfigPanel;
  
  public XPathActivityXMLTree(MutableTreeNode root, XPathActivityConfigurationPanel parentConfigPanel, boolean bIncludeElementValues)
  {
    super(root);
    this.parentConfigPanel = parentConfigPanel;
    this.currentXPathExpression = "";
    
    this.setCellRenderer(new XPathActivityXMLTreeRenderer(bIncludeElementValues));
    
    this.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        handleTreeSelectionEvent(e);
      }
    });
    
  }
  
  
  /**
   * Creates an instance of the XML tree from provided XML data.
   * 
   * @param xmlData XML document in the form of a <code>String</code> to
   *        derive the tree from.
   * @param bIncludeAttributesIntoTree
   * @param bIncludeValuesIntoTree
   * @param parentConfigPanel
   * @return
   * @throws DocumentException if <code>xmlData</code> does not
   *                           contain a valid XML document. 
   * 
   */
  public static XPathActivityXMLTree createFromXMLData(String xmlData, boolean bIncludeAttributesIntoTree,
                   boolean bIncludeValuesIntoTree, XPathActivityConfigurationPanel parentConfigPanel) throws DocumentException
  {
    // try to parse the XML document - the next line will throw an exception if
    // the document is not well-formed; proceed otherwise
    Document doc = DocumentHelper.parseText(xmlData);
    
    Element rootEl = doc.getRootElement();
    XPathActivityXMLTreeNode rootNode = new XPathActivityXMLTreeNode(rootEl, false);
    populate(rootNode, rootEl, bIncludeAttributesIntoTree);
    
    return (new XPathActivityXMLTree(rootNode, parentConfigPanel, bIncludeValuesIntoTree));
  }
  
  /**
   * Worker method for populating the tree recursively from a list of Elements.
   * 
   * @param node
   * @param elements
   */
  private static void populate(DefaultMutableTreeNode node, Element element,
                               boolean bIncludeAttributesIntoTree)
  {
    Iterator<Element> elementIterator = element.elements().iterator();
    while (elementIterator.hasNext()) {
      Element childElement = elementIterator.next();
      XPathActivityXMLTreeNode childNode = new XPathActivityXMLTreeNode(childElement, false);
      node.add(childNode);
      
      // recursively repeat for all children of the current child element
      populate(childNode, childElement, bIncludeAttributesIntoTree);
    }
    
    
    // add attributes of the element as its children, if necessary
    if (bIncludeAttributesIntoTree) {
      List<Attribute> attributes = element.attributes();
      for (Attribute attribute : attributes) {
        node.add(new XPathActivityXMLTreeNode(attribute, true));
      }
    }
  }
  
  
  private void handleTreeSelectionEvent(TreeSelectionEvent e)
  {
//    JOptionPane.showMessageDialog(null, e.getNewLeadSelectionPath());
//    JOptionPane.showMessageDialog(null, e.getOldLeadSelectionPath());
//    JOptionPane.showMessageDialog(null, e.getPath());
//    JOptionPane.showMessageDialog(null, e.getPaths());
//    JOptionPane.showMessageDialog(null, this.getSelectionPaths());
//    System.out.println("sel handler");
    
    // store all tree selection listeners in order to temporarily remove them;
    // this is necessary as selection modifications will be made here -- don't
    // want any listeners to respond to these new events
    TreeSelectionListener[] selectionListeners = this.getTreeSelectionListeners();
    for (TreeSelectionListener listener : selectionListeners) {
      this.removeTreeSelectionListener(listener);
    }
    
    
    // get the newly made selection
    TreePath newSelectedPath = e.getNewLeadSelectionPath();
    
    // select all parent nodes of the newly selected node AND
    // generate the new XPath expression on the fly for the current selection
    StringBuilder xpath = new StringBuilder();
    TreePath parentPath = newSelectedPath;
    while (parentPath.getPathCount() > 1)
    {
      XPathActivityXMLTreeNode lastXMLTreeNodeInThisPath = (XPathActivityXMLTreeNode)parentPath.getLastPathComponent();
        
      xpath.insert(0, "/" +
                      (lastXMLTreeNodeInThisPath.isAttribute ? "@" : "") +
                      lastXMLTreeNodeInThisPath.getTreeNodeDisplayLabel(false));
      
      parentPath = parentPath.getParentPath();
      this.addSelectionPath(parentPath);
    }
    xpath.insert(0, "/" + ((XPathActivityXMLTreeNode)parentPath.getLastPathComponent()).getTreeNodeDisplayLabel(false)); // this is the root node, can only be element, not attribute
    this.currentXPathExpression = xpath.toString();
    
    
    // TODO - check other previous selections to see if they are still valid +
    // TODO - possibly apply wildcards
    
    
    // make sure the keyboard focus stays on the actual node that was clicked on -
    // no direct way to do this, so simply de-select and re-select again
    this.removeSelectionPath(newSelectedPath);
    this.addSelectionPath(newSelectedPath);
    
    
    // restore all previously stored selection listeners
    for (TreeSelectionListener listener : selectionListeners) {
      this.addTreeSelectionListener(listener);
    }
    
    // inform the parent activity configuration panel to update the XPath
    // expression in the UI
    this.parentConfigPanel.updateXPathTextField();
  }
  
  
  public String getCurrentXPathExpression() {
    return currentXPathExpression;
  }
  
  
  
  // ------------------------- XML Tree Nodes --------------------------
  
  
  private static class XPathActivityXMLTreeNode extends DefaultMutableTreeNode
  {
    private final boolean isAttribute;

    public XPathActivityXMLTreeNode(Object userObject, boolean isAttribute)
    {
      super(userObject);
      this.isAttribute = isAttribute;
    }
    
    public boolean isAttribute() {
      return (isAttribute);
    }
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue)
    {
      // TODO - add styling
      // TODO - add XML namespace to the root node...
      
      Object nodeUserObject = this.getUserObject();
      
      String nodeElementNamespacePrefix = null; 
      String nodeElementTextValue = null;
      StringBuilder nodeElementLabel = new StringBuilder();
      
      if (nodeUserObject instanceof Element)
      {
        Element enclosedElement = (Element)nodeUserObject;
        
        nodeElementLabel.append(enclosedElement.getName());
        nodeElementNamespacePrefix = enclosedElement.getNamespacePrefix();
        if (bIncludeValue) {
          nodeElementTextValue = enclosedElement.getTextTrim();
        }
      }
      else if (nodeUserObject instanceof Attribute)
      {
        Attribute enclodedAttribute = (Attribute)nodeUserObject;
        
        nodeElementLabel.append(enclodedAttribute.getName());
        nodeElementNamespacePrefix = enclodedAttribute.getNamespacePrefix();
        if (bIncludeValue) {
          nodeElementTextValue = enclodedAttribute.getText();
        }
      }
      
      // add namespace prefix, if one is known
      if (nodeElementNamespacePrefix != null && nodeElementNamespacePrefix.length() > 0) {
        nodeElementLabel.insert(0, nodeElementNamespacePrefix + ":");
      }
      
      // add element value, if necessary
      if (nodeElementTextValue != null && nodeElementTextValue.length() > 0) {
        // TODO - truncate to MAX_LENGTH
        // TODO - remove all blank lines...
        nodeElementLabel.append(" - " + nodeElementTextValue);
      }
    
      return (nodeElementLabel.toString());
    }
  }
  
  
  
  // ----------------------- Tree Cell Renderer --------------------------
  
  /**
   * 
   * @author Sergejs Aleksejevs
   */
  private class XPathActivityXMLTreeRenderer extends DefaultTreeCellRenderer
  {
    private boolean bIncludeElementValues;
    
    public XPathActivityXMLTreeRenderer(boolean bIncludeElementValues) {
      super();
      this.bIncludeElementValues = bIncludeElementValues;
    }
    
    
    public Component getTreeCellRendererComponent(JTree tree, Object value,
        boolean selected, boolean expanded, boolean leaf, int row,
        boolean hasFocus)
    {
      // obtain the default rendering, we'll then customize it
      Component defaultRendering = super.getTreeCellRendererComponent(tree, value, selected, expanded, leaf, row, hasFocus);
      
      // it is most likely that the default rendering will be a JLabel, check just to be safe
      if (defaultRendering instanceof JLabel)
      {
        JLabel defaultRenderedLabel = ((JLabel)defaultRendering);
        
        // ---------- CHOOSE APPROPRIATE ICON FOR THE NODE ------------
        if (row == 0) {
          // set the icon for the XML tree root node
          defaultRenderedLabel.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XML_TREE_ROOT_ICON));
        }
        else {
          // set the icon for the XML tree node
          if (value instanceof XPathActivityXMLTreeNode && 
              ((XPathActivityXMLTreeNode)value).isAttribute())
          {
            defaultRenderedLabel.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XML_TREE_ATTRIBUTE_ICON));
          }
          else {
            defaultRenderedLabel.setIcon(XPathActivityIcon.getIconById(XPathActivityIcon.XML_TREE_NODE_ICON));
          }
        }
        
        
        // ----------- CHOOSE THE DISPLAY TITLE FOR THE NODE ------------
        if (value instanceof XPathActivityXMLTreeNode) {
          defaultRenderedLabel.setText(((XPathActivityXMLTreeNode)value).getTreeNodeDisplayLabel(this.bIncludeElementValues));
        }
      }
      
      return (defaultRendering);
    }
  }
}
