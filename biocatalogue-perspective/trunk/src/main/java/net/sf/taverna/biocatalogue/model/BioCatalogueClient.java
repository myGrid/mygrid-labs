package net.sf.taverna.biocatalogue.model;

import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

import net.sf.taverna.t2.ui.perspectives.biocatalogue.integration.config.BioCataloguePluginConfiguration;

import org.apache.log4j.Logger;
import org.biocatalogue.x2009.xml.rest.Annotations;
import org.biocatalogue.x2009.xml.rest.AnnotationsDocument;
import org.biocatalogue.x2009.xml.rest.Filters;
import org.biocatalogue.x2009.xml.rest.FiltersDocument;
import org.biocatalogue.x2009.xml.rest.ResourceLink;
import org.biocatalogue.x2009.xml.rest.Search;
import org.biocatalogue.x2009.xml.rest.SearchDocument;
import org.biocatalogue.x2009.xml.rest.Service;
import org.biocatalogue.x2009.xml.rest.ServiceDocument;
import org.biocatalogue.x2009.xml.rest.Services;
import org.biocatalogue.x2009.xml.rest.ServicesDocument;
import org.biocatalogue.x2009.xml.rest.SoapInput;
import org.biocatalogue.x2009.xml.rest.SoapInputDocument;
import org.biocatalogue.x2009.xml.rest.SoapOperation;
import org.biocatalogue.x2009.xml.rest.SoapOperationDocument;
import org.biocatalogue.x2009.xml.rest.SoapOutput;
import org.biocatalogue.x2009.xml.rest.SoapOutputDocument;
import org.biocatalogue.x2009.xml.rest.SoapService;
import org.biocatalogue.x2009.xml.rest.SoapServiceDocument;
import org.biocatalogue.x2009.xml.rest.Tag;
import org.biocatalogue.x2009.xml.rest.TagDocument;
import org.biocatalogue.x2009.xml.rest.Tags;
import org.biocatalogue.x2009.xml.rest.TagsDocument;


/**
 * @author Sergejs Aleksejevs
 */
public class BioCatalogueClient
{
  // ******* CONSTANTS *******
  // plugin details
  public static final String PLUGIN_VERSION = "0.1.1";
  public static final String PLUGIN_USER_AGENT = "Taverna2-BioCatalogue-plugin/" +
                                                 PLUGIN_VERSION +
                                                 " Java/" + System.getProperty("java.version");
  
  // API URLs
  public static final String DEFAULT_API_SANDBOX_BASE_URL = "http://sandbox.biocatalogue.org";
  public static final String DEFAULT_API_TEST_SERVER_BASE_URL = "http://test.biocatalogue.org";
  public static final String DEFAULT_API_LIVE_SERVER_BASE_URL = "http://www.biocatalogue.org";
  
  private static String BASE_URL;    // BioCatalogue base URL to use (can be updated at runtime)
  
  public static String API_REGISTRIES_URL;
  public static String API_SERVICE_PROVIDERS_URL;
  public static String API_USERS_URL;
  public static String API_SERVICES_URL;
  public static String API_SOAP_OPERATIONS_URL;
  public static String API_SERVICE_FILTERS_URL;
  public static String API_TAG_CLOUD_URL;
  public static String API_SEARCH_URL;
  public static String API_LOOKUP_URL;
  
  // URL modifiers
  public static final String[] API_INCLUDE_SUMMARY = {"include","summary"};          // for fetching Service
  public static final String[] API_SORT_BY_NAME = {"sort","name"};                   // for tag cloud
  public static final String[] API_SORT_BY_COUNTS = {"sort","counts"};               // for tag cloud
  public static final String[] API_ALSO_INPUTS_OUTPUTS = {"also","inputs,outputs"};  // for annotations on SOAP operation
  
  public static final String API_PER_PAGE_PARAMETER = "per_page";
  public static final String API_LIMIT_PARAMETER = "limit";
  public static final String API_SERVICE_MONITORING_URL_SUFFIX = "/monitoring";
  
  // API Request scope
  public static final String API_SCOPE_PARAMETER = "scope";
  public static final String API_SCOPE_SERVICES = "services";
  public static final String API_SCOPE_SERVICE_PROVIDERS = "service_providers";
  public static final String API_SCOPE_REGISTRIES = "registries";
  public static final String API_SCOPE_USERS = "users";
  
  public static final String API_TAG_PARAMETER = "tag";
  
  public static final String API_LOOKUP_WSDL_LOCATION_PARAMETER = "wsdl_location";
  public static final String API_LOOKUP_OPERATION_NAME_PARAMETER = "operation_name";
  public static final String API_LOOKUP_SOAP_INPUT_NAME_PARAMETER = "input_name";
  public static final String API_LOOKUP_SOAP_OUTPUT_NAME_PARAMETER = "output_name";
  
  
  // *************************
  
  // universal date formatters
  private static final DateFormat DATE_FORMATTER = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy");
  private static final DateFormat SHORT_DATE_FORMATTER = new SimpleDateFormat("HH:mm 'on' dd/MM/yyyy");
  private static final DateFormat API_LOGGING_TIMESTAMP_FORMATTER = DateFormat.getDateTimeInstance();
  
  
  // SETTINGS
  private Properties iniSettings;    // settings that are read/stored from/to INI file
  
  private File fAPIOperationLog;
  private PrintWriter pwAPILogWriter;
  
  // the logger
  private Logger logger = Logger.getLogger(BioCatalogueClient.class);
  
  
  // default constructor
  public BioCatalogueClient()
  {
    // TODO: load any config settings (if necessary)
    
    // load the BioCatalogue API base URL from the plugin's configuration settings
    this.setBaseURL(BioCataloguePluginConfiguration.getInstance().
            getProperty(BioCataloguePluginConfiguration.BIOCATALOGUE_BASE_URL));
    
    // open API operation log file, if necessary
    if (BioCataloguePluginConstants.PERFORM_API_RESPONSE_TIME_LOGGING || 
        BioCataloguePluginConstants.PERFORM_API_XML_DATA_BINDING_TIME_LOGGING )
    {
      try {
        BioCataloguePluginConstants.CONFIG_FILE_FOLDER.mkdirs(); // just in case this log file was never written - create the folder as well
        fAPIOperationLog = new File(BioCataloguePluginConstants.CONFIG_FILE_FOLDER, 
                                    BioCataloguePluginConstants.API_OPERATION_LOG_FILENAME);
        pwAPILogWriter = new PrintWriter(new FileOutputStream(fAPIOperationLog, true), true);  // auto-flush makes sure that even if app crashes, log will not be lost
      }
      catch (NullPointerException e) {
        pwAPILogWriter = new PrintWriter(System.out, true);
        System.err.println("ERROR: Folder to log API operation details is unknown (using System.out instead)... Details:");
        e.printStackTrace();
      }
      catch (FileNotFoundException e) {
        System.err.println("ERROR: Couldn't open API operation log file... Details:");
        e.printStackTrace();
      }
    }
  }
  
  
  public String getBaseURL() {
    return this.BASE_URL;
  }
  
  /**
   * Updates the base API URL and also
   * updates derived URLs of sub-URLs
   * (e.g. BASE_URL + /services, etc)
   * 
   * @param baseURL The new value for the BioCatalogue API base URL.
   */
  public void setBaseURL(String baseURL)
  {
    this.BASE_URL = baseURL;
    
    API_REGISTRIES_URL = BASE_URL + "/registries";
    API_SERVICE_PROVIDERS_URL = BASE_URL + "/service_providers";
    API_USERS_URL = BASE_URL + "/users";
    API_SERVICES_URL = BASE_URL + "/services";
    API_SOAP_OPERATIONS_URL = BASE_URL + "/soap_operations";
    API_SERVICE_FILTERS_URL = API_SERVICES_URL + "/filters";
    API_TAG_CLOUD_URL = BASE_URL + "/tags";
    API_SEARCH_URL = BASE_URL + "/search";
    API_LOOKUP_URL = BASE_URL + "/lookup";
  }
  
  public File getAPIOperationLog() {
    return fAPIOperationLog;
  }
  
  public PrintWriter getAPILogWriter() {
    return pwAPILogWriter;
  }
  
  
  // ************ METHODS FOR RETRIEVAL OF SPECIALISED OBJECT FROM THE API ************
  
  public Annotations getBioCatalogueAnnotations(String strAnnotationsURL) throws Exception {
    return (parseAPIResponseStream(Annotations.class, doBioCatalogueGET(strAnnotationsURL)));
  }
  
  public Filters getBioCatalogueFilters(String strURL) throws Exception {
    return (parseAPIResponseStream(Filters.class, doBioCatalogueGET(strURL)));
  }
  
  public Services getBioCatalogueServices(String strURL) throws Exception {
    return (parseAPIResponseStream(Services.class, doBioCatalogueGET(strURL)));
  }
  
  public Service getBioCatalogueService(String serviceURL) throws Exception {
    return (parseAPIResponseStream(Service.class, doBioCatalogueGET(serviceURL)));
  }
  
  public Service getBioCatalogueServiceSummary(String serviceURL) throws Exception {
    return (parseAPIResponseStream(Service.class, doBioCatalogueGET(Util.appendURLParameter(serviceURL, API_INCLUDE_SUMMARY))));
  }
  
  public Service getBioCatalogueServiceMonitoringData(String serviceURL) throws Exception
  {
    return (parseAPIResponseStream(Service.class,
                                   doBioCatalogueGET(serviceURL + API_SERVICE_MONITORING_URL_SUFFIX))
           );
  }
  
  public SoapService getBioCatalogueSoapService(String soapServiceURL) throws Exception {
    return (parseAPIResponseStream(SoapService.class, doBioCatalogueGET(soapServiceURL)));
  }
  
  public SoapOperation getBioCatalogueSoapOperation(String soapOperationURL) throws Exception {
    return (parseAPIResponseStream(SoapOperation.class, doBioCatalogueGET(soapOperationURL)));
  }
  
  public Search getBioCatalogueSearchData(String searchURL) throws Exception {
    return (parseAPIResponseStream(Search.class, doBioCatalogueGET(searchURL)));
  }
  
  public Tag getBioCatalogueTag(String searchByTagURL) throws Exception {
    return (parseAPIResponseStream(Tag.class, doBioCatalogueGET(searchByTagURL)));
  }
  
  public Tags getBioCatalogueTags(String tagsURL) throws Exception {
    return (parseAPIResponseStream(Tags.class, doBioCatalogueGET(tagsURL)));
  }
  
  
  /**
   * @param wsdlLocation
   * @param operationName
   * @return SoapOperation instance or <code>null</code> if nothing was found (or error occurred).
   * @throws Exception
   */
  public SoapOperation lookupSoapOperation(SoapOperationIdentity soapOperationDetails) throws Exception
  {
    // first of all check for any problems with input data
    if (soapOperationDetails == null || soapOperationDetails.hasError() ||
        soapOperationDetails.getWsdlLocation() == null || soapOperationDetails.getWsdlLocation().length() == 0 ||
        soapOperationDetails.getOperationName() == null || soapOperationDetails.getOperationName().length() == 0)
    {
      // something's not right - return null
      return (null);
    }
    
    String lookupURL = Util.appendURLParameter(API_LOOKUP_URL, API_LOOKUP_WSDL_LOCATION_PARAMETER, soapOperationDetails.getWsdlLocation());
    lookupURL = Util.appendURLParameter(lookupURL, API_LOOKUP_OPERATION_NAME_PARAMETER, soapOperationDetails.getOperationName());
    
    ServerResponseStream lookupResponse = doBioCatalogueGET(lookupURL);
    if (lookupResponse.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
      return null;
    }
    return (parseAPIResponseStream(SoapOperation.class, lookupResponse));
  }
  
  
  public <T extends ResourceLink> T lookupSoapOperationPort(Class<T> requiredResultClass, SoapOperationPortIdentity portDetails) throws Exception
  {
    // first of all check for any problems with port details
    if (portDetails == null || portDetails.hasError() ||
        portDetails.getWsdlLocation() == null || portDetails.getWsdlLocation().length() == 0 ||
        portDetails.getOperationName() == null || portDetails.getOperationName().length() == 0 ||
        portDetails.getPortName() == null || portDetails.getPortName().length() == 0)
    {
      // something's not right - return null
      return (null);
    }
    
    // now check that specified class matches the port type
    if (portDetails.isInput() && !requiredResultClass.equals(SoapInput.class) ||
        !portDetails.isInput() && !requiredResultClass.equals(SoapOutput.class))
    {
      return (null);
    }
    
    String lookupURL = Util.appendURLParameter(API_LOOKUP_URL, API_LOOKUP_WSDL_LOCATION_PARAMETER, portDetails.getWsdlLocation());
    lookupURL = Util.appendURLParameter(lookupURL, API_LOOKUP_OPERATION_NAME_PARAMETER, portDetails.getOperationName());
    if (portDetails.isInput()) {
      lookupURL = Util.appendURLParameter(lookupURL, API_LOOKUP_SOAP_INPUT_NAME_PARAMETER, portDetails.getPortName());
    }
    else {
      lookupURL = Util.appendURLParameter(lookupURL, API_LOOKUP_SOAP_OUTPUT_NAME_PARAMETER, portDetails.getPortName());
    }
    
    ServerResponseStream lookupResponse = doBioCatalogueGET(lookupURL);
    if (lookupResponse.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
      return null;
    }
    return (parseAPIResponseStream(requiredResultClass, lookupResponse));
  }
  
  
  public Service lookupParentService(SoapOperationIdentity soapOperationDetails) throws Exception
  {
    SoapOperation soapOperation = this.lookupSoapOperation(soapOperationDetails);
    if (soapOperation != null) {
      return (getBioCatalogueService(soapOperation.getAncestors().getService().getHref()));
    }
    else {
      // lookup didn't find the SOAP operation or there
      // was some problem with the input data
      return (null);
    }
  }
  
  
  public Service lookupParentServiceMonitoringData(SoapOperationIdentity soapOperationDetails) throws Exception
  {
    SoapOperation soapOperation = this.lookupSoapOperation(soapOperationDetails);
    if (soapOperation != null) {
      return (getBioCatalogueServiceMonitoringData(soapOperation.getAncestors().getService().getHref()));
    }
    else {
      // lookup didn't find the SOAP operation or there
      // was some problem with the input data
      return (null);
    }
  }
  
  
  // ************ GENERIC API CONNECTIVITY METHODS ************
  
  /**
   * Generic method to issue GET requests to BioCatalogue server.
   * 
   * @param strURL The URL on BioCatalogue to issue GET request to.
   * @return TODO
   * @throws Exception
   */
  public ServerResponseStream doBioCatalogueGET(String strURL) throws Exception
  {
    // TODO - HACK to speed up processing append .xml to all URLs
    strURL = Util.appendStringBeforeParametersOfURL(strURL, ".xml");
    
    // open server connection using provided URL (with no modifications to it)
    URL url = new URL(strURL);
    
    Calendar requestStartedAt = Calendar.getInstance();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestProperty("User-Agent", PLUGIN_USER_AGENT);
    conn.setRequestProperty("Accept", "application/xml");
    
//    if(LOGGED_IN) {
//      // if the user has "logged in", also add authentication details
//      conn.setRequestProperty("Authorization", "Basic " + AUTH_STRING);
//    }
    
    // fetch server's response
    ServerResponseStream serverResponse = doBioCatalogueReceiveServerResponse(conn, strURL, true);
    
    if (BioCataloguePluginConstants.PERFORM_API_RESPONSE_TIME_LOGGING) {
      logAPIOperation(requestStartedAt, true, serverResponse);
    }
    return (serverResponse);
  }
  
  
  /**
   * Generic method to execute GET requests to myExperiment server.
   * 
   * @param strURL The URL on myExperiment to POST to. 
   * @param strXMLDataBody Body of the XML data to be POSTed to strURL. 
   * @return An object containing XML Document with server's response body and
   *         a response code. Response body XML document might be null if there
   *         was an error or the user wasn't authorised to perform a certain action.
   *         Response code will always be set.
   * @throws Exception
   */
  /*public ServerResponse doMyExperimentPOST(String strURL, String strXMLDataBody) throws Exception
  {
    // POSTing to myExperiment is only allowed for authorised users
    if (! LOGGED_IN) return (null);
    
    // open server connection using provided URL (with no modifications to it)
    URL url = new URL (strURL);
    HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
    
    // "tune" the connection
    urlConn.setRequestMethod("POST");
    urlConn.setDoOutput(true);
    urlConn.setRequestProperty("Content-Type", "application/xml");
    urlConn.setRequestProperty("User-Agent", PLUGIN_USER_AGENT);
    urlConn.setRequestProperty("Authorization", "Basic " + AUTH_STRING);  // this wouldn't be executed if the user wasn't logged in (see code above), so safe to run
    
    // prepare and POST XML data
    String strPOSTContent = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + strXMLDataBody;
    OutputStreamWriter out = new OutputStreamWriter(urlConn.getOutputStream());
    out.write(strPOSTContent);
    out.close();
    
    // check server's response
    return (doMyExperimentReceiveServerResponse(urlConn, strURL, false));
  }*/
  
  
  /**
   * Generic method to execute DELETE requests to myExperiment server.
   * This is only to be called when a user is logged in. 
   * 
   * @param strURL The URL on myExperiment to direct DELETE request to.
   * @return An object containing XML Document with server's response body and
   *         a response code. Response body XML document might be null if there
   *         was an error or the user wasn't authorised to perform a certain action.
   *         Response code will always be set.
   * @throws Exception
   */
  /*public ServerResponse doMyExperimentDELETE(String strURL) throws Exception
  {
    // open server connection using provided URL (with no modifications to it)
    URL url = new URL(strURL);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    // "tune" the connection
    conn.setRequestMethod("DELETE");
    conn.setRequestProperty("User-Agent", PLUGIN_USER_AGENT);
    conn.setRequestProperty("Authorization", "Basic " + AUTH_STRING);
    
    // check server's response
    return (doMyExperimentReceiveServerResponse(conn, strURL, true));
  }*/
  
  
  /**
   * A common method for retrieving BioCatalogue server's response for both
   * GET and POST requests.
   * 
   * @param conn Instance of the established URL connection to poll for server's response.
   * @param strURL The URL on BioCatalogue with which the connection is established.
   * @param bIsGetRequest Flag for identifying type of the request. True when the current 
   *        connection executes GET request; false when it executes a POST / DELETE request.
   * @return TODO
   */
  @SuppressWarnings("unchecked")
  private ServerResponseStream doBioCatalogueReceiveServerResponse(HttpURLConnection conn, String strURL, boolean bIsGETRequest) throws Exception
  {
    int iResponseCode = conn.getResponseCode();
    
    switch (iResponseCode)
    {
      case HttpURLConnection.HTTP_OK:
        // regular operation path - simply return the reference to the data input stream
        return (new ServerResponseStream(iResponseCode, conn.getInputStream(), strURL));
        
      case HttpURLConnection.HTTP_BAD_REQUEST:
        // this was a bad XML request - need full XML response to retrieve the error message from it;
        // Java throws IOException if getInputStream() is used when non HTTP_OK response code was received -
        // hence can use getErrorStream() straight away to fetch the error document
        return (new ServerResponseStream(iResponseCode, conn.getErrorStream(), strURL));
        
      case HttpURLConnection.HTTP_UNAUTHORIZED:
        // this content is not authorised for current user
        return (new ServerResponseStream(iResponseCode, null, strURL));
      
      case HttpURLConnection.HTTP_NOT_FOUND:
        // nothing was found at the provided URL
        return (new ServerResponseStream(iResponseCode, conn.getErrorStream(), strURL));
      
      default:
        // unexpected response code - raise an exception
        throw new IOException("Received unexpected HTTP response code (" + iResponseCode + ") while " +
            (bIsGETRequest ? "fetching data at " : "posting data to ") + strURL);
    }
  }
  
  
  /**
   * This method is here to make sure that *all* parsing of received input stream data
   * from the API is parsed ("bound") into Java objects in a central place - so it's
   * possible to measure performance of XmlBeans for various inputs.
   * 
   * NB! There is a serious limitation in Java's generics. Generic methods cannot
   *     access any of the static context of the classes of type parameters, because
   *     it wasn't designed for this. The only purpose of type parameters is compile-time
   *     type-checking.
   *     This means that even though all classes that could potentially be supplied as a
   *     type-parameter would have certain static functionality, it's not possible to access
   *     that through using the type-parameter like it's done in normal polymorhic situations.
   *     Therefore, some switching based on the class of the type-parameter for this method is
   *     done...
   * 
   * @param <T>
   * @param classOfRequiredReturnedObject Class of the object that the caller expects to receive
   *                                      after parsing provided server's response. For example,
   *                                      a call to /tags.xml return the <pre>[tags]...[/tags]</pre>
   *                                      document. <code>TagsDocument</code> should be used to access
   *                                      its static factory and parse the input stream - the return
   *                                      value will have type <code>Tags</code> -- <code>Tags.class</code>
   *                                      is the required input value for this parameter in this situation then.
   * @param serverResponse This object should contain the input stream obtained from the API in return
   *                       to the call on some URL.
   * @return               InputStream data parsed into the Java object of the supplied type [T].
   * @throws Exception
   */
  @SuppressWarnings("unchecked")
  private <T extends ResourceLink> T parseAPIResponseStream(Class<T> classOfRequiredReturnedObject, ServerResponseStream serverResponse) throws Exception
  {
    T parsedObject = null;
    InputStream xmlInputStream = serverResponse.getResponseStream();
    
    // choose a factory to parse the response and perform parsing
    Calendar parsingStartedAt = Calendar.getInstance();
    if (classOfRequiredReturnedObject.equals(Annotations.class)) {
      parsedObject = (T)AnnotationsDocument.Factory.parse(xmlInputStream).getAnnotations();
    }
    else if (classOfRequiredReturnedObject.equals(Filters.class)) {
      parsedObject = (T)FiltersDocument.Factory.parse(xmlInputStream).getFilters();
    }
    else if (classOfRequiredReturnedObject.equals(Services.class)) {
      parsedObject = (T)ServicesDocument.Factory.parse(xmlInputStream).getServices();
    }
    else if (classOfRequiredReturnedObject.equals(Service.class)) {
      parsedObject = (T)ServiceDocument.Factory.parse(xmlInputStream).getService();
    }
    else if (classOfRequiredReturnedObject.equals(SoapService.class)) {
      parsedObject = (T)SoapServiceDocument.Factory.parse(xmlInputStream).getSoapService();
    }
    else if (classOfRequiredReturnedObject.equals(SoapOperation.class)) {
      parsedObject = (T)SoapOperationDocument.Factory.parse(xmlInputStream).getSoapOperation();
    }
    else if (classOfRequiredReturnedObject.equals(SoapInput.class)) {
      parsedObject = (T)SoapInputDocument.Factory.parse(xmlInputStream).getSoapInput();
    }
    else if (classOfRequiredReturnedObject.equals(SoapOutput.class)) {
      parsedObject = (T)SoapOutputDocument.Factory.parse(xmlInputStream).getSoapOutput();
    }
    else if (classOfRequiredReturnedObject.equals(Search.class)) {
      parsedObject = (T)SearchDocument.Factory.parse(xmlInputStream).getSearch();
    }
    else if (classOfRequiredReturnedObject.equals(Tag.class)) {
      parsedObject = (T)TagDocument.Factory.parse(xmlInputStream).getTag();
    }
    else if (classOfRequiredReturnedObject.equals(Tags.class)) {
      parsedObject = (T)TagsDocument.Factory.parse(xmlInputStream).getTags();
    }
    else if (classOfRequiredReturnedObject.equals(SoapOperation.class)) {
      parsedObject = (T)SoapOperationDocument.Factory.parse(xmlInputStream).getSoapOperation();
    }
     
    // log the operation if necessary
    if (BioCataloguePluginConstants.PERFORM_API_XML_DATA_BINDING_TIME_LOGGING) {
      logAPIOperation(parsingStartedAt, false, serverResponse);
    }
    
    return (parsedObject);
  }
  
  
  // ************ HELPERS ************
  
  public static DateFormat getDateFormatter() {
    return(BioCatalogueClient.DATE_FORMATTER);
  }
  
  public static DateFormat getShortDateFormatter() {
    return(BioCatalogueClient.SHORT_DATE_FORMATTER);
  }
  
  
  /**
   * This is a helper to facilitate performance monitoring of the API usage.
   * 
   * @param opearationStartedAt Instance of Calendar initialised with the date/time value of
   *                            when the logged operation was started.
   * @param isDataFetching True to indicate that this was the actual URL connection with the BioCatalogue server
   *                       to fetch some data; false to indicate an xml-binding operation using XmlBeans.
   * @param serverResponse Will be used to extract the request URL.
   */
  private void logAPIOperation(Calendar opearationStartedAt, boolean isDataFetching, ServerResponseStream serverResponse)
  {
    // just in case check that the writer was initialised
    if (pwAPILogWriter != null) {
      pwAPILogWriter.println(API_LOGGING_TIMESTAMP_FORMATTER.format(opearationStartedAt.getTime()) + ", " +
                             (System.currentTimeMillis() - opearationStartedAt.getTimeInMillis()) + ", " +
                             (isDataFetching ? "data_fetching" : "xml_parsing") + ", " +
                             serverResponse.getRequestURL());
    }
  }
  
}
