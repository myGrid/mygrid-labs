package uk.org.taverna.t3.workbench.components.search.providers.biocatalogue.internal;

public class SoapOperationPortIdentity extends SoapOperationIdentity
{
  private String portName;
  private boolean isInput;
  
  public SoapOperationPortIdentity(String wsdlLocation, String operationName, String portName, boolean isInput) {
    super(wsdlLocation, operationName);
    this.portName = portName;
    this.isInput = isInput;
  }
  
  public SoapOperationPortIdentity(Object errorDetails) {
    super(errorDetails);
  }
  
  public String getPortName() {
    return portName;
  }
  
  public boolean isInput() {
    return isInput;
  }
  
}
