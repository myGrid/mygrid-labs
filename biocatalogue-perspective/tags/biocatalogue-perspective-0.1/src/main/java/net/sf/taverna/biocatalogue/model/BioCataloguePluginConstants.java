package net.sf.taverna.biocatalogue.model;

import java.io.File;

/**
 * This class contains the collection of important constants,
 * which are used throughout the BioCatalogue plugin.
 * 
 * @author Sergejs Aleksejevs
 */
public class BioCataloguePluginConstants
{
  public static final String APP_VISIBLE_NAME = "BioCatalogue Plugin";
  public static final String APP_PREFIX = "T2BioCataloguePlugin:";
  
  
  public static final boolean PERFORM_API_RESPONSE_TIME_LOGGING = true;
  public static final boolean PERFORM_API_XML_DATA_BINDING_TIME_LOGGING = true;
  public static final String API_OPERATION_LOG_FILENAME = "biocatalogue_api.log";
  
  
  public static final int DEFAULT_SCROLL = 15;               // default vertical scroll increment to be used in all JScrollPane instances within the plugin
  public static final int DEFAULT_TOOLTIP_DURATION = 10000;  // default duration of visibility of tooltips (in "ms")
  public static final int DEFAULT_THREAD_STARTUP_TIME = 10;  // this is the time (in "ms") that we think the system takes at most to start a new thread
  
  public static final int API_DEFAULT_REQUESTED_ITEM_COUNT_PER_PAGE = 50;
  
  public static final int SEARCH_HISTORY_LENGTH = 50;        // maximum number of search history items to store (if exceeded, oldest will be removed)
  public static final int FAVOURITE_SEARCHES_LENGTH = 30;    // maximum number of favourite search settings to store (if exceeded, oldest will be removed)
  public static final int FAVOURITE_FILTERS_LENGTH = 30;     // maximum number of favourite service filters to store (if exceeded, oldest will be removed)
  public static final int RESOURCE_PREVIEW_HISTORY_LENGTH = 50;
  
  public static final int RESOURCE_PREVIEW_BROWSER_PREFERRED_WIDTH = 750;
  public static final int RESOURCE_PREVIEW_BROWSER_PREFERRED_HEIGHT = 600;
  
  public static final String ACTION_FILTER_FOUND_SERVICES = APP_PREFIX + "filterFoundServices:";
  public static final String ACTION_FILTER_BY_CATEGORY = APP_PREFIX + "filterByCategory:";
  public static final String ACTION_SHOW_IN_WEB_BROWSER = APP_PREFIX + "showInWebBrowser:";
  public static final String ACTION_PREVIEW_CURRENT_FILTER = APP_PREFIX + "previewCurrentFilter";
  public static final String ACTION_PREVIEW_RESOURCE = APP_PREFIX + "preview:";
  public static final String ACTION_PREVIEW_SOAP_OPERATION_AFTER_LOOKUP = APP_PREFIX + "previewSoapOperationAfterLookup:";
  public static final String ACTION_PREVIEWED_SERVICE_HEALTH_CHECK = APP_PREFIX + "previewedServiceHealthCheck";
  public static final String ACTION_TAG_SEARCH_PREFIX = APP_PREFIX + "tag:";
  
  
  
  public static final String CONFIG_FILE_FOLDER_WHEN_RUNNING_STANDALONE = ".Taverna2-BioCatalogue Plugin";
  
  
  // ------------------------------------------------------------------------------
  
  /*
   * Some of the settings are determined during the runtime - hence are non-final.
   */
  
  public static File CONFIG_FILE_FOLDER = null;
}
