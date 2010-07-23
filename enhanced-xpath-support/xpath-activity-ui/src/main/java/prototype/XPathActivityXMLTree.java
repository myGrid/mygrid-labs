package prototype;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreePath;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;


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
  
  
  public XPathActivityXMLTree(MutableTreeNode root, XPathActivityConfigurationPanel parentConfigPanel)
  {
    super(root);
    this.parentConfigPanel = parentConfigPanel;
    this.currentXPathExpression = "";
    
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
   * @param parentConfigPanel
   * @return
   * @throws DocumentException if <code>xmlData</code> does not
   *                           contain a valid XML document. 
   * 
   */
  public static XPathActivityXMLTree createFromXMLData(String xmlData,
                   XPathActivityConfigurationPanel parentConfigPanel) throws DocumentException
  {
    // try to parse the XML document - the next line will throw an exception if
    // the document is not well-formed; proceed otherwise
    Document doc = DocumentHelper.parseText(xmlData);
    
    Element rootEl = doc.getRootElement();
    DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode(rootEl.getName());
    populate(rootNode, rootEl.elements());
    
    return (new XPathActivityXMLTree(rootNode, parentConfigPanel));
  }
  
  /**
   * Worker method for populating the tree recursively from a list of Elements.
   * 
   * @param node
   * @param elements
   */
  private static void populate(DefaultMutableTreeNode node, List<Element> elements)
  {
    Iterator<Element> elementIterator = elements.iterator();
    while (elementIterator.hasNext()) {
      Element childElement = elementIterator.next();
      DefaultMutableTreeNode childNode = new DefaultMutableTreeNode(childElement.getName());
      node.add(childNode);
      
      // recursively repeat for all children of the current child element
      populate(childNode, childElement.elements());
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
    while (parentPath.getPathCount() > 1) {
      xpath.insert(0, "/" + parentPath.getLastPathComponent());
      parentPath = parentPath.getParentPath();
      this.addSelectionPath(parentPath);
    }
    xpath.insert(0, "/" + parentPath.getLastPathComponent());
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
}
