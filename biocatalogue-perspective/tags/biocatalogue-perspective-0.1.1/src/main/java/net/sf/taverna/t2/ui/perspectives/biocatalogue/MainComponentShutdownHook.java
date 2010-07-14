package net.sf.taverna.t2.ui.perspectives.biocatalogue;

import com.thoughtworks.xstream.XStream;

import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.config.BioCataloguePluginConfiguration;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.service_panel.BioCatalogueServiceProvider;
import net.sf.taverna.t2.workbench.ShutdownSPI;

/**
 * @author Sergejs Aleksejevs
 */
public class MainComponentShutdownHook implements ShutdownSPI
{
  public int positionHint()
  {
    // all custom plugins are suggested to return a value of > 100;
    // this affects when in the termination process will this plugin
    // be shutdown;
    return 100;
  }
  
  public boolean shutdown()
  {
    new MyExperimentClientShutdownThread().start();
    
    // "true" means that shutdown operations are complete and Taverna can terminate
    return true;
  }
  
  
  /**
   * Actual shutdown cleaning up, saving settings and flushing caches.
   */
  // ************** CLEANUP THREAD *****************
  protected static class MyExperimentClientShutdownThread extends Thread
  {
    public void run()
    {
      this.setName("myExperiment Plugin shutdown thread");
      System.out.println("Starting shutdown operations for BioCatalogue plugin");
      
//      logger.debug("Starting shutdown operations for myExperiment plugin"); -  TODO
//      try {
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_FAVOURITE_SEARCHES, Base64.encodeObject(pluginMainComponent.getSearchTab().getSearchFavouritesList()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_SEARCH_HISTORY, Base64.encodeObject(pluginMainComponent.getSearchTab().getSearchHistory()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_TAG_SEARCH_HISTORY, Base64.encodeObject(pluginMainComponent.getTagBrowserTab().getTagSearchHistory()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_PREVIEWED_ITEMS_HISTORY, Base64.encodeObject(pluginMainComponent.getPreviewBrowser().getPreviewHistory()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_DOWNLOADED_ITEMS_HISTORY, Base64.encodeObject(pluginMainComponent.getHistoryBrowser().getDownloadedItemsHistoryList()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_OPENED_ITEMS_HISTORY, Base64.encodeObject(pluginMainComponent.getHistoryBrowser().getOpenedItemsHistoryList()));
//        myExperimentClient.getSettings().put(MyExperimentClient.INI_COMMENTED_ITEMS_HISTORY, Base64.encodeObject(pluginMainComponent.getHistoryBrowser().getCommentedOnItemsHistoryList()));
//        
//        myExperimentClient.storeSettings();
//      }
//      catch(Exception e)
//      {
//        logger.error("Failed while serializing myExperiment plugin settings:\n" + e);
//        e.printStackTrace();
//      }
//      logger.debug("myExperiment plugin shutdown is completed; terminated...");
      
      
      // store services that were added to the Service Panel
      XStream xstream = new XStream();
      BioCataloguePluginConfiguration configuration = BioCataloguePluginConfiguration.getInstance();
      configuration.setProperty(
          BioCataloguePluginConfiguration.SOAP_OPERATIONS_IN_SERVICE_PANEL,
          xstream.toXML(BioCatalogueServiceProvider.getRegistereSOAPOperations()));
      
      
      // close API operation log
      MainComponentFactory.getSharedInstance().getBioCatalogueClient().getAPILogWriter().close();
      
      System.out.println("BioCatalogue plugin shutdown is completed; terminated...");
    }
  }
  
}
