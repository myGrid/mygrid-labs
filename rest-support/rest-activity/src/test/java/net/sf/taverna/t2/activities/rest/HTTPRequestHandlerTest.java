package net.sf.taverna.t2.activities.rest;

import org.junit.*;

import static junit.framework.Assert.*;
import net.sf.taverna.t2.activities.rest.HTTPRequestHandler.HTTPRequestResponse;
import net.sf.taverna.t2.activities.rest.RESTActivity.DATA_FORMAT;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;


/**
 * NB! If tests are failing, make sure to check <code>TEST_SERVER_LOCATION</code>,
 *     <code>TEST_SERVER_CONTEXT</code> and the name of the servlet -
 *     <code>NO_AUTH_SERVLET</code>
 * 
 * @author Sergejs Aleksejevs
 */
public class HTTPRequestHandlerTest
{
  // --------------- CONSTANTS FOR THIS SET OF TESTS ------------------------
  
  // TEST SERVER LOCATION
  private static final String TEST_SERVER_LOCATION = "http://localhost:8080";
  private static final String TEST_SERVER_CONTEXT = "/rest-test-server-0.1-SNAPSHOT";
  private static final String NO_AUTH_SERVLET = "/NoAuthServlet";
  private static final String AUTH_SERVLET = "/AuthServlet";
  
  // OPTIONS FOR REQUESTS TO THE TEST SERVER
  public static String INCLUDE_DATA_LABELS = "includeDataLabels";
  
      // NB! Output of the received message cannot be combined with any other
      //     option; GET_SELECTED_DETAILS | GET_ALL_DETAILS can be combined
      //     with GET_HEADERS_WITH_NAMES
  public static String GET_RECEIVED_MESSAGE = "getReceivedMessage";     // will make the server to respond with the body of the received message
  public static String GET_HEADERS_WITH_NAMES = "getHeadersWithNames";  // the value is the comma-separated list of names of headers for which values are to be retrieved
  public static String GET_ALL_DETAILS = "getAllDetails";
  public static String GET_SELECTED_DETAILS = "getSelectedDetails";     // value will be comma-separated list integer IDs of possible fields to be included into the output 
  
  // .. status details to select from
  public static int GET_HTTP_METHOD = 1;
  public static int GET_REQUEST_URL = 2;
  public static int GET_QUERY_STRING = 3;
  public static int GET_ALL_PARAMETER_NAMES = 4;
  public static int GET_ALL_HEADER_NAMES = 5;
  public static int GET_AUTHENTICATION_METHOD = 6;
  public static int GET_REMOTE_USER_NAME = 7;
  
  // ------------------------------------------------------------------------
  
  
  @Test
  public void basicServerInvocation_testingRedirectionLeadsToTheOriginalRequestURL()
  {
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET;
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.GET);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("text/plain");
    
    // make sure the configBean doesn't complain about being invalid
    assertTrue("Configuration bean is invalid", configBean.isValid());
    
    // it's a GET - input message body can be null
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    
    assertEquals("GET " + url, response.getRedirection());
  }
  
  
  @Test
  /**
   * This test case verifies that the <code>HTTPRequestHandler</code> does indeed transmit the
   * value for <code>Accept</code> header - and that this does have effect on the
   * <code>Content-Type</code> of the response that is received from the test server.
   */
  public void testAcceptHeaderValueInRequestTranslatesIntoCorrectContentTypeOfResponse()
  {
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET + "?" + GET_HEADERS_WITH_NAMES + "=accept";
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.GET);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    
    
    // now a number of possible Accept header values is set in turn - 
    // server's responses are then checked to have the same Content-Type
    // set on the response message bodies
    
    
    // TEXT/PLAIN
    configBean.setAcceptsHeaderValue("text/plain");
    assertTrue(configBean.isValid());
    
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals("text/plain", response.getResponseContentTypes()[0].getValue());
    
    
    // TEXT/CSV
    configBean.setAcceptsHeaderValue("text/csv");
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals("text/csv", response.getResponseContentTypes()[0].getValue());
    
    
    // APPLICATION/XML
    configBean.setAcceptsHeaderValue("application/xml");
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals("application/xml", response.getResponseContentTypes()[0].getValue());
  }
  
  
  @Test
  public void testDifferentHTTPMethodsAreUsedCorrectly()
  {
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET + "?" + GET_SELECTED_DETAILS + "=" + GET_HTTP_METHOD;
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("text/plain");
    
    // all HTTP methods are tested in turn to see that the test server does indeed
    // recognise them as being different (although it doesn't perform any real
    // operations in return)
    
    // GET
    configBean.setHttpMethod(HTTP_METHOD.GET);
    assertTrue(configBean.isValid());
    
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.GET.toString(), (new String((byte[])response.getResponseBody()).trim()));
    
    
    // DELETE
    configBean.setHttpMethod(HTTP_METHOD.DELETE);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.DELETE.toString(), (new String((byte[])response.getResponseBody()).trim()));
    
    
    // POST
    configBean.setContentTypeForUpdates("text/plain");  // now POST/PUT - will be "sending data", so need to set the content type for the configBean validation to succeed
    configBean.setHttpMethod(HTTP_METHOD.POST);
    configBean.setOutgoingDataFormat(DATA_FORMAT.String);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.POST.toString(), (new String((byte[])response.getResponseBody()).trim()));
    
    
    // PUT
    configBean.setHttpMethod(HTTP_METHOD.PUT);
    configBean.setOutgoingDataFormat(DATA_FORMAT.String);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.PUT.toString(), (new String((byte[])response.getResponseBody()).trim()));
  }
  
  
  @Test
  public void testMessageBodyIsPostedCorrectly()
  {
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET + "?" + GET_RECEIVED_MESSAGE + "=true";
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.POST);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("text/plain");
    configBean.setContentTypeForUpdates("text/plain");
    configBean.setOutgoingDataFormat(DATA_FORMAT.String);
    
    assertTrue(configBean.isValid());
    
    // this message is supposed to be read back from the server as binary,
    // as the response Content-Type will not contain "charset=..." fragment
    // (by design of the test server)
    String outgoingMsg = "this is the message!";
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, outgoingMsg);
    assertEquals(outgoingMsg, (new String((byte[])response.getResponseBody()).trim()));
  }
  
}
