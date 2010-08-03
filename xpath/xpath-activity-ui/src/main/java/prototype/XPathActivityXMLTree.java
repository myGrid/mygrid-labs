package prototype;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Namespace;
import org.dom4j.QName;
import org.dom4j.XPath;


public class XPathActivityXMLTree extends JTree
{
  private XPathActivityXMLTree instanceOfSelf;
  private XPathActivityXMLTreeRenderer treeRenderer;
  
  private TreeSelectionListener[] allSelectionListeners;
  
  private JPopupMenu contextualMenu;
  
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
      boolean bIncludeElementValues, boolean bIncludeElementNamespaces, XPathActivityConfigurationPanel parentConfigPanel)
  {
    super(root);
    
    this.instanceOfSelf = this;
    this.allSelectionListeners = new TreeSelectionListener[0];
    
    this.documentUsedToPopulateTree = documentUsedToPopulateTree;
    this.currentXPathExpression = null;
    this.currentXPathNamespaces = new HashMap<String,String>();
    this.parentConfigPanel = parentConfigPanel;
    
    
    // custom renderer of the nodes in the XML tree
    this.treeRenderer = new XPathActivityXMLTreeRenderer(bIncludeElementValues, bIncludeElementNamespaces);
    this.setCellRenderer(treeRenderer);
    
    
    // add listener to handle various selections of nodes in the tree 
    this.addTreeSelectionListener(new TreeSelectionListener() {
      public void valueChanged(TreeSelectionEvent e) {
        handleTreeSelectionEvent(e);
      }
    });
    
    
    // create popup menu for expanding / collapsing all nodes in the tree
    JMenuItem miExpandAll = new JMenuItem("Expand all", XPathActivityIcon.getIconById(XPathActivityIcon.XML_TREE_EXPAND_ALL_ICON));
    miExpandAll.setToolTipText("Expand all nodes in the filtering tree");
    miExpandAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < getRowCount(); i++) {
          instanceOfSelf.expandRow(i);
        }
      }
    });
    JMenuItem miCollapseAll = new JMenuItem("Collapse all", XPathActivityIcon.getIconById(XPathActivityIcon.XML_TREE_COLLAPSE_ALL_ICON));
    miCollapseAll.setToolTipText("Collapse all expanded nodes in the filtering tree");
    miCollapseAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        for (int i = getRowCount() - 1; i >= 0; i--) {
          instanceOfSelf.collapseRow(i);
        }
      }
    });
    
    // populate the popup menu with created menu items
    contextualMenu = new JPopupMenu();
    contextualMenu.add(miExpandAll);
    contextualMenu.add(miCollapseAll);
    
    // mouse events may cause the contextual menu to be shown - adding a listener
    this.addMouseListener(new MouseAdapter()
    {
      public void mousePressed(MouseEvent e) {
        if (e.isPopupTrigger()) {
          contextualMenu.show(instanceOfSelf, e.getX(), e.getY());
        }
      }
      public void mouseReleased(MouseEvent e) {
        if (e.isPopupTrigger()) {
          // another way a popup menu may be called on different systems
          contextualMenu.show(instanceOfSelf, e.getX(), e.getY());
        }
      }
    });
    
  }
  
  
  
  public Document getDocumentUsedToPopulateTree() {
    return documentUsedToPopulateTree;
  }
  
  public XPath getCurrentXPathExpression() {
    return currentXPathExpression;
  }
  
  public Map<String,String> getCurrentXPathNamespaces() {
    return currentXPathNamespaces;
  }
  
  
  
  /**
   * Creates an instance of the XML tree from provided XML data.
   * 
   * @param xmlData XML document in the form of a <code>String</code> to
   *        derive the tree from.
   * @param bIncludeAttributesIntoTree
   * @param bIncludeValuesIntoTree
   * @param bIncludeElementNamespacesIntoTree
   * @param parentConfigPanel
   * @return
   * @throws DocumentException if <code>xmlData</code> does not
   *                           contain a valid XML document. 
   * 
   */
  public static XPathActivityXMLTree createFromXMLData(String xmlData, boolean bIncludeAttributesIntoTree,
                   boolean bIncludeValuesIntoTree, boolean bIncludeElementNamespacesIntoTree,
                   XPathActivityConfigurationPanel parentConfigPanel) throws DocumentException
  {
    // ----- XML DOCUMENT PARSING -----
    // try to parse the XML document - the next line will throw an exception if
    // the document is not well-formed; proceed otherwise
    Document doc = DocumentHelper.parseText(xmlData);
    Element rootElement = doc.getRootElement();
    
    
    // ----- POPULATE XML TREE -----
    XPathActivityXMLTreeElementNode rootNode = new XPathActivityXMLTreeElementNode(rootElement);
    populate(rootNode, rootElement, bIncludeAttributesIntoTree);
    
    return (new XPathActivityXMLTree(rootNode, doc, bIncludeValuesIntoTree, bIncludeElementNamespacesIntoTree, parentConfigPanel));
  }
  
  
  /**
   * Worker method for populating the tree recursively from a list of Elements.
   * 
   * @param node
   * @param element
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
  
  
  // ---------------- RESPONDING TO REQUESTS TO CHANGE APPEARANCE OF EXISTING TREE -----------------
  
  /**
   * NB! May be inefficient, as this solution re-generates the whole tree from
   *     stored XML document and replaces the root node of itself with a newly
   *     generated root node (that will be populated with updated children,
   *     according to the new values of options).
   *  
   *     However, this is a simple solution that will work for now.
   * 
   * @param bIncludeAttributes
   * @param bIncludeValues
   * @param bIncludeNamespaces
   */
  protected void refreshFromExistingDocument(boolean bIncludeAttributes, boolean bIncludeValues, boolean bIncludeNamespaces)
  {
    this.setEnabled(false);
    removeAllSelectionListeners();
    
    // store expansion and selection state of the XML tree
    // see documentation for restoreExpandedPaths() for more details
    //
    // stored paths to expanded nodes are quite reliable, as paths are recorded;
    // stored selected rows are less reliable, as only indices are kept -- however,
    // the tree is re-created from the same document, so ordering/number of nodes
    // cannot change (apart from attributes that may be added / removed - the attributes
    // appear after other child nodes of some node in the tree, therefore only their
    // selection could be affected)
    HashMap<String,ArrayList<String>> toExpand = new HashMap<String,ArrayList<String>>();
    ArrayList<Integer> toSelect = new ArrayList<Integer>();
    for( int i = 1; i < this.getRowCount(); i++) {
      if( this.isExpanded(i) ) {
        TreePath path = this.getPathForRow(i);
        String parentPath = path.getParentPath().toString();
        ArrayList<String> values = toExpand.get(parentPath);
        if(values == null) {
          values = new ArrayList<String>();
        }
        values.add(path.getLastPathComponent().toString());
        toExpand.put(parentPath, values);
      }
      if (this.isRowSelected(i)) {
        toSelect.add(i);
      }
    }
    
    
    // update presentation options
    this.treeRenderer.setIncludeElementValues(bIncludeValues);
    this.treeRenderer.setIncludeElementNamespaces(bIncludeNamespaces);
    
    // re-create the root node of the tree and replace the old one with it
    Element rootElement = this.documentUsedToPopulateTree.getRootElement();
    XPathActivityXMLTreeNode newRootNode = new XPathActivityXMLTreeElementNode(rootElement);
    populate(newRootNode, rootElement, bIncludeAttributes);
    ((DefaultTreeModel)this.getModel()).setRoot(newRootNode);
    
    
    // restore previous state of the tree from saved values
    restoreExpandedPaths(toExpand, this.getPathForRow(0));
    restoreSelectedPaths(toSelect);
    
    this.restoreAllSelectionListeners();
    this.setEnabled(true);
  }
  
  
  /**
   * This method can only reliably work when the tree is re-generated from the same
   * XML document, so that number / order of nodes would not change.
   * 
   * @param toSelect List of indices of rows to re-select after tree was re-generated.
   */
  private void restoreSelectedPaths(ArrayList<Integer> toSelect)
  {
    if (toSelect == null || toSelect.isEmpty()) return;
    
    // something definitely needs to be selected, so include root element into selection
    this.addSelectionRow(0);
    
    // select all stored rows
    for (Integer value : toSelect) {
      this.addSelectionRow(value);
    }
  }



  /**
   * Taken from: <a href="http://java.itags.org/java-core-gui-apis/58504/">http://java.itags.org/java-core-gui-apis/58504/</a>
   * 
   * This method recursively expands all previously stored paths.
   * Works under assumption that the name of the root node did not change.
   * Otherwise, it can handle changed structure of the tree.
   * 
   * To achieve its goal, it cannot simply use stored TreePath from your the original tree,
   * since the paths are invalid after the tree is refreshed. Instead, a HashMap which links
   * a String representation of the parent tree path to all expanded child node names is used.
   * 
   * @param toExpand Map which links a String representation of the parent tree path to all
   *                 expanded child node names is used.
   * @param rootPath Path to root node.
   */
  void restoreExpandedPaths(HashMap<String,ArrayList<String>> toExpand, TreePath rootPath)
  {
    ArrayList<String> values = toExpand.remove(rootPath.toString());
    if (values == null) return;
    
    int row = this.getRowForPath(rootPath);
    for (String value : values)
    {
      TreePath nextMatch = this.getNextMatch(value, row, Position.Bias.Forward);
      this.expandPath(nextMatch);
      if (toExpand.containsKey(nextMatch.toString())) {
        restoreExpandedPaths(toExpand, nextMatch);
      }
    }
  }
  
  
  
  // ---------------- TREE SELECTION MODEL + XPath GENERATION -----------------
  
  private void removeAllSelectionListeners()
  {
    this.allSelectionListeners = this.getTreeSelectionListeners();
    for (TreeSelectionListener listener : this.allSelectionListeners) {
      this.removeTreeSelectionListener(listener);
    }
  }
  
  private void restoreAllSelectionListeners()
  {
    for (TreeSelectionListener listener : this.allSelectionListeners) {
      this.addTreeSelectionListener(listener);
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
    removeAllSelectionListeners();
    
    
    // get the newly made selection
    TreePath newSelectedPath = e.getNewLeadSelectionPath();
    
    // TODO - remove this HACK!!! it simply ignores the empty selection done by the container for now.... 
    if (newSelectedPath == null) return;
    
    
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
    restoreAllSelectionListeners();
    
    
    // inform the parent activity configuration panel to update the XPath
    // expression in the UI
    this.parentConfigPanel.updateXPathEditingPanelValues();
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
    
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue, boolean bIncludeElementNamespace, boolean bUseStyling)
    {
      if (this.isAttribute()) {
        return (((XPathActivityXMLTreeAttributeNode)this).getTreeNodeDisplayLabel(bIncludeValue, bUseStyling));
      }
      else {
        return (((XPathActivityXMLTreeElementNode)this).getTreeNodeDisplayLabel(bIncludeValue, bIncludeElementNamespace, bUseStyling));
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
    
    public String getTreeNodeDisplayLabel(boolean bIncludeValue, boolean bIncludeNamespace, boolean bUseStyling)
    {
      StringBuilder label = new StringBuilder();
      
      // add qualified element name
      label.append(this.associatedElement.getQualifiedName());
      
      // add element namespace
      if (bIncludeNamespace)
      {
        Namespace ns = this.associatedElement.getNamespace();
        
        label.append((bUseStyling ? "<font color=\"gray\">" : "") +
            " - xmlns" + (ns.getPrefix().length() > 0 ? (":" + ns.getPrefix()) : "") + "=\"" + 
            this.associatedElement.getNamespaceURI() +
            (bUseStyling ? "\"</font>" : ""));
      }
      
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
    
    
    public boolean equals(Object other) {
      // TODO - make sure this is removed or fixed
//      System.out.println("equals on element node");
      return (other instanceof XPathActivityXMLTreeElementNode &&
          ((XPathActivityXMLTreeElementNode)other).getAssociatedElement().equals(associatedElement));
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
    private boolean bIncludeElementNamespaces;
    
    public XPathActivityXMLTreeRenderer(boolean bIncludeElementValues, boolean bIncludeElementNamespaces) {
      super();
      this.bIncludeElementValues = bIncludeElementValues;
      this.bIncludeElementNamespaces = bIncludeElementNamespaces;
    }
    
    
    public boolean getIncludeElementValues() {
      return bIncludeElementValues;
    }
    public void setIncludeElementValues(boolean bIncludeElementValues) {
      this.bIncludeElementValues = bIncludeElementValues;
    }
    
    public boolean getIncludeElementNamespaces() {
      return bIncludeElementNamespaces;
    }
    public void setIncludeElementNamespaces(boolean bIncludeElementNamespaces) {
      this.bIncludeElementNamespaces = bIncludeElementNamespaces;
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
          defaultRenderedLabel.setText(((XPathActivityXMLTreeNode)value).getTreeNodeDisplayLabel(
              this.bIncludeElementValues, this.bIncludeElementNamespaces, true));
        }
      }
      
      return (defaultRendering);
    }
    
  }
}
