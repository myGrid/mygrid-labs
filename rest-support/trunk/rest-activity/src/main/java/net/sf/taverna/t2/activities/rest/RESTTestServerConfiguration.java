package net.sf.taverna.t2.activities.rest;

/**
 * This class is mainly needed by the {@link HTTPRequestHandlerTest} and
 * {@link ServerResponseGenerator} classes.
 * 
 * Maven does not allow for any artifacts to depend on the test classes of
 * other artifacts, therefore this class acts as a workaround for providing
 * these configuration constants within this Maven artifact (but not within
 * its test classes).
 * 
 * @author Sergejs Aleksejevs
 */
public class RESTTestServerConfiguration
{
  // --------------- CONSTANTS FOR THIS SET OF TESTS ------------------------
  
  // TEST SERVER LOCATION
  public static final String TEST_SERVER_LOCATION = "http://localhost:8080";
  public static final String TEST_SERVER_CONTEXT = "/rest-test-server-0.1-SNAPSHOT";
  public static final String NO_AUTH_SERVLET = "/NoAuthServlet";
  public static final String AUTH_SERVLET = "/AuthServlet";
  
  // OPTIONS FOR REQUESTS TO THE TEST SERVER
  public static String INCLUDE_DATA_LABELS = "includeDataLabels";
  
      // NB! Output of the received message cannot be combined with any other
      //     option; GET_SELECTED_DETAILS | GET_ALL_DETAILS can be combined
      //     with GET_HEADERS_WITH_NAMES
  public static final String GET_RECEIVED_MESSAGE = "getReceivedMessage";     // will make the server to respond with the body of the received message
  public static final String GET_HEADERS_WITH_NAMES = "getHeadersWithNames";  // the value is the comma-separated list of names of headers for which values are to be retrieved
  public static final String GET_ALL_DETAILS = "getAllDetails";
  public static final String GET_SELECTED_DETAILS = "getSelectedDetails";     // value will be comma-separated list integer IDs of possible fields to be included into the output 
  
  // .. status details to select from
  public static final int GET_HTTP_METHOD = 1;
  public static final int GET_REQUEST_URL = 2;
  public static final int GET_QUERY_STRING = 3;
  public static final int GET_ALL_PARAMETER_NAMES = 4;
  public static final int GET_ALL_HEADER_NAMES = 5;
  public static final int GET_AUTHENTICATION_METHOD = 6;
  public static final int GET_REMOTE_USER_NAME = 7;
  
  // ------------------------------------------------------------------------
}
