package net.sf.taverna.biocatalogue.model;

import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.impl.ResourceLinkImpl;

/**
 * @author Sergejs Aleksejevs
 */
public class LoadingResource extends ResourceLinkImpl
{
  public LoadingResource() {
    super(ResourceLink.type);
  }
  
}
