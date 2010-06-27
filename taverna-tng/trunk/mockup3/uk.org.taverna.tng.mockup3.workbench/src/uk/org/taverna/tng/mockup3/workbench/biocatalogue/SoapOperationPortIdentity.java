package uk.org.taverna.tng.mockup3.workbench.biocatalogue;

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
