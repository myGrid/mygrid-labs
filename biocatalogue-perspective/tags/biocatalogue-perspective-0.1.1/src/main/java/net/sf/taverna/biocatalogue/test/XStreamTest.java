package net.sf.taverna.biocatalogue.test;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import net.sf.taverna.biocatalogue.model.SoapOperationIdentity;


public class XStreamTest
{

  public static void main(String[] args)
  {
    List<SoapOperationIdentity> processors = new ArrayList<SoapOperationIdentity>();
    processors.add(new SoapOperationIdentity("http://www.test.com/test.wsdl", "aa"));
    processors.add(new SoapOperationIdentity("http://www.example.com/example.wsdl", "bb"));
    
    XStream xstream = new XStream();
    String xml = xstream.toXML(processors);
    
    System.out.println(xml);
    
    List<SoapOperationIdentity> processorsFromXML = (List<SoapOperationIdentity>)xstream.fromXML(xml);
    System.out.println("\n\n");
    System.out.println(processorsFromXML.get(0).getWsdlLocation() + " - " + processorsFromXML.get(0).getOperationName());
    System.out.println(processorsFromXML.get(1).getWsdlLocation() + " - " + processorsFromXML.get(1).getOperationName());
  }

}
