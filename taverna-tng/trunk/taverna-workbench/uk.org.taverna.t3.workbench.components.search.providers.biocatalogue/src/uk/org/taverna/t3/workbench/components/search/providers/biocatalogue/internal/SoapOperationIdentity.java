package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

/**
 * Identifies a SOAP operation (or "Processor" in Taverna terms)
 * in the most straightforward way - by WSDL location and operation name. 
 * 
 * @author Sergejs Aleksejevs
 */
public class SoapOperationIdentity extends SoapServiceIdentity
{
  public static final String ACTION_STRING_SEPARATOR = "���";
  
  private final String operationName;

  public SoapOperationIdentity(String wsdlLocation, String operationName) {
    super(wsdlLocation);
    this.operationName = operationName;
  }
  
  public SoapOperationIdentity(Object errorDetails) {
    super(errorDetails);
    this.operationName = null;
  }
  
  public String getOperationName() {
    return operationName;
  }
  
  
  /**
   * @return String that can be placed into an action command (i.e. into JClickableLabel)
   *         to identify a SOAP operation - WSDL location and operation name are concatenated
   *         with <code>SoapOperationIdentity.ACTION_STRING_SEPARATOR</code>.
   */
  public String toActionString() {
    return (getWsdlLocation() + ACTION_STRING_SEPARATOR + this.operationName);
  }
  
  
  /**
   * @param actionString String that includes WSDL location appended by
   *                     <code>SoapOperationIdentity.ACTION_STRING_SEPARATOR</code>
   *                     and by the operation name of a SOAP operations.
   *                     <br/>
   *                     The action string may either contain only WSDL location and operation
   *                     name (which are joined by a specified separator) OR the action string
   *                     may start from <code>BioCataloguePluginConstants.ACTION_PREVIEW_SOAP_OPERATION_AFTER_LOOKUP</code>. 
   * @return Instance of this class initialised with the values from the <code>actionString</code>
   *         or <code>null</code> if an error occurred. 
   */
  public static SoapOperationIdentity fromActionString(String actionString)
  {
    if (actionString == null) return (null);
    
    String[] parts = actionString.split(ACTION_STRING_SEPARATOR);
    if (parts == null || parts.length != 2 ||
        parts[0].length() == 0 || parts[1].length() == 0)
    {
      return (null);
    }
    
    return (new SoapOperationIdentity(parts[0], parts[1]));
  }
  
}
