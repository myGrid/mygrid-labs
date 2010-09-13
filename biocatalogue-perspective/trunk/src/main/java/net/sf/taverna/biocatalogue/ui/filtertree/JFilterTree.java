package net.sf.taverna.biocatalogue.ui.filtertree;

import java.awt.event.MouseEvent;

import net.sf.taverna.biocatalogue.ui.tristatetree.JTriStateTree;
import net.sf.taverna.biocatalogue.ui.tristatetree.TriStateTreeNode;

public class JFilterTree extends JTriStateTree
{
  
  public JFilterTree(TriStateTreeNode root) {
    super(root);
  }
  
  
  public String getToolTipText(MouseEvent e)
  {
    Object correspondingObject = super.getTreeNodeObject(e);
    if (correspondingObject != null && correspondingObject instanceof FilterTreeNode) {
      FilterTreeNode filterNode = (FilterTreeNode) correspondingObject;
      
      if (filterNode.isTagWithNamespaceNode())
      {
        String nameAndNamespace = filterNode.getUrlValue().substring(1, filterNode.getUrlValue().length() - 1);
        String[] namePlusNamespace = nameAndNamespace.split("#");
        
        return ("<html>" + namePlusNamespace[1] + " (<b>Namespace: </b>" + namePlusNamespace[0] + ")</html>");
      }
    }
    
    return super.getToolTipText(e);
  }
  
}
