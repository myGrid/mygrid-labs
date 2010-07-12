package net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.config;

import java.util.HashMap;
import java.util.Map;

import net.sf.taverna.t2.workbench.configuration.AbstractConfigurable;
import net.sf.taverna.t2.workbench.configuration.Configurable;

/**
 * 
 * 
 * @author Sergejs Aleksejevs
 */
public class BioCataloguePluginConfiguration extends AbstractConfigurable
{
  private static class Singleton {
    private static BioCataloguePluginConfiguration instance = new BioCataloguePluginConfiguration();
  }

  // private static Logger logger = Logger.getLogger(MyExperimentConfiguration.class);
  
  private Map<String, String> defaultPropertyMap;
  
  
  public static Configurable getInstance() {
    return Singleton.instance;
  }
  
  public String getCategory() {
    return "general";
  }
  
  public Map<String,String> getDefaultPropertyMap() {
    if (defaultPropertyMap == null) {
      defaultPropertyMap = new HashMap<String,String>();
    }
    return defaultPropertyMap;
  }
  
  public String getDisplayName() {
    return "BioCatalogue";
  }
  
  public String getFilePrefix() {
    return "BioCatalogue";
  }
  
  public String getUUID() {
    return "4daac25c-bd56-4f90-b909-1e49babe5197";
  }
  
}
