package prototype;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

import net.sf.taverna.t2.renderers.XMLTree;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.XPath;
import org.dom4j.tree.DefaultAttribute;


public class XPathActivityXMLTree extends JTree
{
  /**
   * 
   */
  private XPathActivityConfigurationPanel parentConfigPanel;

  private Document documentUsedToPopulateTree;
  
  /**
   *  holds value of the current XPath expression obtained from 
   *  the combination of nodes selected in the XML tree 
   */
  private XPath currentXPathExpression;
  
  private Map<String,String> currentXPathNamespaces;
  
  
  private XPathActivityXMLTree(XPathActivityXMLTreeNode root, Document documentUsedToPopulateTree, 
      boolean bIncludeElementValues, XPathActivityConfigurationPanel parentConfigPanel)
  {
    super(root);
    this.documentUsedToPopulateTree = documentUsedToPopulateTree;
    this.currentXPathExpression = null;
    this.currentXPathNamespaces = new HashMap<String,String>();
    this.parentConfigPanel = parentConfigPanel;
    
    this.setCellRenderer(new XPathActivityXMLTreeRenderer(bIncludeElementValues));
    
    this.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        handleTreeSelectionEvent(e);
      }
    });
    
  }
  
  
  
  public XPath getCurrentXPathExpression() {
    return currentXPathExpression;
  }
  
  
  public Document getDocumentUsedToPopulateTree() {
    return documentUsedToPopulateTree;
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
    // ----- XML DOCUMENT PARSING -----
    // try to parse the XML document - the next line will throw an exception if
    // the document is not well-formed; proceed otherwise
    Document doc = DocumentHelper.parseText(xmlData);
    Element rootElement = doc.getRootElement();
    
    
//    // ----- DEFAULT NAMESPACE MAPPING -----
//    Namespace defaultNamespace = rootElement.getNamespace();
//    System.out.println(defaultNamespace); // TODO - remove debug output
//    String newDefaultNamespacePrefix = "";
//    if (defaultNamespace.getPrefix() == null || defaultNamespace.getPrefix().length() == 0 &&
//        (defaultNamespace.getURI() != null && defaultNamespace.getURI().length() != 0))
//    {
//      do {
//        newDefaultNamespacePrefix += "default"; // TODO - in case of collisions, this is going to be replicated several times
//      } while (rootElement.getNamespaceForPrefix(newDefaultNamespacePrefix) != null);
//      
//      System.out.println("New default namespace prefix is: " + newDefaultNamespacePrefix);  // TODO - remove debug output
//      rootElement.add(new Namespace(newDefaultNamespacePrefix, defaultNamespace.getURI()));
//    }
//    else {
//      System.out.println("default namespace not specified or already has a prefix ('" + defaultNamespace.getPrefix() + "')"); // TODO - remove debug output
//    }
    
    
    // ----- POPULATE XML TREE -----
    XPathActivityXMLTreeElementNode rootNode = new XPathActivityXMLTreeElementNode(rootElement);
    populate(rootNode, rootElement, bIncludeAttributesIntoTree);
    
    return (new XPathActivityXMLTree(rootNode, doc, bIncludeValuesIntoTree, parentConfigPanel));
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
      XPathActivityXMLTreeElementNode childNode = new XPathActivityXMLTreeElementNode(childElement);
      node.add(childNode);
      
      // recursively repeat for all children of the current child element
      populate(childNode, childElement, bIncludeAttributesIntoTree);
    }
    
    
    // add attributes of the element as its children, if necessary
    if (bIncludeAttributesIntoTree) {
      List<Attribute> attributes = element.attributes();
      for (Attribute attribute : attributes) {
        node.add(new XPathActivityXMLTreeAttributeNode(attribute));
      }
    }
  }
  
  
  // ---------------- TREE SELECTION MODEL + XPath GENERATION -----------------
  
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
    for (int i = 0; i < newSelectedPath.getPathCount(); i++)
    {
      XPathActivityXMLTreeNode lastXMLTreeNodeInThisPath = (XPathActivityXMLTreeNode)parentPath.getLastPathComponent();
      QName qname = lastXMLTreeNodeInThisPath.getNodeQName();
      String effectiveNamespacePrefix = addNamespaceToXPathMap(qname.getNamespace());
      
      xpath.insert(0, "/" +
                      (lastXMLTreeNodeInThisPath.isAttribute() ? "@" : "") +
                      (effectiveNamespacePrefix.length() > 0 ? (effectiveNamespacePrefix + ":") : "") +
                      qname.getName());
      
      parentPath = parentPath.getParentPath();
      this.addSelectionPath(parentPath);
    }
    
    this.currentXPathExpression = DocumentHelper.createXPath(xpath.toString());
    this.currentXPathExpression.setNamespaceURIs(currentXPathNamespaces);
    
    // TODO - remove
    System.out.println("\n" + this.currentXPathNamespaces + "\n");
    
    
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
  
  
  
  private String addNamespaceToXPathMap(Namespace namespace) 
  {
    // EMTPY PREFIX
    if (namespace.getPrefix().length() == 0) {
      if (namespace.getURI().length() == 0) {
        // DEFAULT NAMESPACE with no URI - nothing to worry about
        return "";
      }
      else {
        // DEFAULT NAMESPACE WITH NO PREFIX, BUT URI IS KNOWN
        return (addNamespaceToXPathMap(new Namespace("default", namespace.getURI())));
      }
    }
    
    // NEW NON-EMPTY PREFIX
    if (!this.currentXPathNamespaces.containsKey(namespace.getPrefix())) {
      this.currentXPathNamespaces.put(namespace.getPrefix(), namespace.getURI());
      return (namespace.getPrefix());
    }
    
    // EXISTING NON-EMPYT PREFIX AND THE SAME URI - NO NEED TO ADD AGAIN
    else if (this.currentXPathNamespaces.get(namespace.getPrefix()).equals(namespace.getURI())) {
      return (namespace.getPrefix());
    }
    
    // EXISTING NON-EMPTY PREFIX, BUT DIFFERENT URI
    else {
      String repeatedPrefix = namespace.getPrefix();
      
      int i = 0;
      while (this.currentXPathNamespaces.containsKey(repeatedPrefix + i)) {
        // check if current alternative prefix wasn't yet applied to current URI
        if (this.currentXPathNamespaces.get(repeatedPrefix + i).equals(namespace.getURI())) {
          return (repeatedPrefix + i);
        }
        else {
          // still another URI for the same prefix, keep trying to increase the ID in the prefix
          i++;
        }
      }
      
      String modifiedPrefix = repeatedPrefix + i;
      this.currentXPathNamespaces.put(modifiedPrefix, namespace.getURI());
      return (modifiedPrefix);
    }
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
    
    
    public QName getNodeQName() {
      if (this.isAttribute()) {
        return (((XPathActivityXMLTreeAttributeNode)this).getAssociatedAttribute().getQName());
      }
      else {
        return (((XPathActivityXMLTreeElementNode)this).getAssociatedElement().getQName());
      }
    }
    
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue, boolean bUseStyling)
    {
      if (this.isAttribute()) {
        return (((XPathActivityXMLTreeAttributeNode)this).getTreeNodeDisplayLabel(bIncludeValue, bUseStyling));
      }
      else {
        return (((XPathActivityXMLTreeElementNode)this).getTreeNodeDisplayLabel(bIncludeValue, bUseStyling));
      }
    }
  }
  
  
  private static class XPathActivityXMLTreeElementNode extends XPathActivityXMLTreeNode
  {
    private Element associatedElement;
    
    public XPathActivityXMLTreeElementNode(Element associatedElement) {
      super(associatedElement, false);
      this.associatedElement = associatedElement;
    }
    
    public Element getAssociatedElement() {
      return associatedElement;
    }
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue, boolean bUseStyling)
    {
      StringBuilder label = new StringBuilder();
      
      // add qualified element name
      label.append(this.associatedElement.getQualifiedName());
      
      // add element value
      if (bIncludeValue)
      {
        String elementTextValue = this.associatedElement.getTextTrim();
        
        if (elementTextValue != null && elementTextValue.length() > 0) {
          // TODO - truncate to MAX_LENGTH
          // TODO - remove all blank lines...
          label.append((bUseStyling ? "<font color=\"gray\"> - </font><font color=\"blue\">" : "") +
              elementTextValue +
              (bUseStyling ? "</font>" : ""));
        }
      }
      
      if (bUseStyling) {
        label.insert(0, "<html>");
        label.append("</html>");
      }
      
      return (label.toString());
    }
    
  }
  
  private static class XPathActivityXMLTreeAttributeNode extends XPathActivityXMLTreeNode
  {
    private Attribute associatedAttribute;
    
    public XPathActivityXMLTreeAttributeNode(Attribute associatedAttribute) {
      super(associatedAttribute, true);
      this.associatedAttribute = associatedAttribute;
    }
    
    public Attribute getAssociatedAttribute() {
      return associatedAttribute;
    }
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue, boolean bUseStyling)
    {
      StringBuilder label = new StringBuilder();
      
      // add qualified attribute name (possibly) with styling
      label.append((bUseStyling ? "<font color=\"purple\">" : "") +
                   this.associatedAttribute.getQualifiedName() +
                   (bUseStyling ? "</font>" : ""));
      
      // add attribute value
      if (bIncludeValue)
      {
        String attributeTextValue = this.associatedAttribute.getText();
        
        if (attributeTextValue != null && attributeTextValue.length() > 0) {
          // TODO - truncate to MAX_LENGTH
          // TODO - remove all blank lines...
          label.append((bUseStyling ? "<font color=\"gray\"> - </font><font color=\"green\">" : "") +
                       attributeTextValue +
                       (bUseStyling ? "</font>" : ""));
        }
      }
      
      if (bUseStyling) {
        label.insert(0, "<html>");
        label.append("</html>");
      }
      
      return (label.toString());
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
          defaultRenderedLabel.setText(((XPathActivityXMLTreeNode)value).getTreeNodeDisplayLabel(this.bIncludeElementValues, true));
        }
      }
      
      return (defaultRendering);
    }
  }
}
