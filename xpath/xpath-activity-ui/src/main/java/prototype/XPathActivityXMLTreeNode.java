package prototype;

import javax.swing.tree.DefaultMutableTreeNode;

import org.dom4j.QName;


/**
 * 
 * @author Sergejs Aleksejevs
 */
public abstract class XPathActivityXMLTreeNode extends DefaultMutableTreeNode
{
  protected static final int DISPLAY_LABEL_MAX_LENGTH = 200;
  
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
  
  
  protected String truncateElementTextValue(String textValue)
  {
    if (textValue != null && textValue.length() > DISPLAY_LABEL_MAX_LENGTH) {
      textValue = textValue.substring(0, DISPLAY_LABEL_MAX_LENGTH) + "(...)";
    }
    return (textValue);
  }
  
}