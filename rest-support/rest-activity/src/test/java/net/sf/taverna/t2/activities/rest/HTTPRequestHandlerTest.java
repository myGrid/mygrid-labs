package net.sf.taverna.t2.activities.rest;

import org.junit.*;

import static junit.framework.Assert.*;
import net.sf.taverna.t2.activities.rest.HTTPRequestHandler.HTTPRequestResponse;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;


/**
 * 
 * @author Sergejs Aleksejevs
 */
public class HTTPRequestHandlerTest
{
  private static final String TEST_SERVER_LOCATION = "http://localhost:8080";
  private static final String TEST_SERVER_CONTEXT = "/test-server";
  private static final String NO_AUTH_SERVLET = "/NoAuthServlet";
  private static final String AUTH_SERVLET = "/AuthServlet";
  
  
  @Test
  public void basicServerInvocation_testingRedirectionLeadsToTheOriginalRequestURL()
  {
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET;
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.GET);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("text/plain");
    
    // make sure the configBean doesn't complain about being invalid
    assertTrue(configBean.isValid());
    
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
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET;
    
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
    // TODO - hack: would be better to use constants from 'test-server' project's class
    //        ServerResponseGenerator, but don't know how to add such dependency to Maven
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET + "?include=1";
    
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
    assertEquals(HTTP_METHOD.GET.toString(), response.getResponseBody().trim());
    
    
    // DELETE
    configBean.setHttpMethod(HTTP_METHOD.DELETE);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.DELETE.toString(), response.getResponseBody().trim());
    
    
    // POST
    configBean.setContentTypeForUpdates("text/plain");  // now POST/PUT - will be "sending data", so need to set the content type for the configBean validation to succeed
    configBean.setHttpMethod(HTTP_METHOD.POST);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.POST.toString(), response.getResponseBody().trim());
    
    
    // PUT
    configBean.setHttpMethod(HTTP_METHOD.PUT);
    assertTrue(configBean.isValid());
    
    response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, null);
    assertEquals(HTTP_METHOD.PUT.toString(), response.getResponseBody().trim());
  }
  
  
  @Test
  public void testMessageBodyIsPostedCorrectly()
  {
    // TODO - hack: would be better to use constants from 'test-server' project's class
    //        ServerResponseGenerator, but don't know how to add such dependency to Maven
    String url = TEST_SERVER_LOCATION + TEST_SERVER_CONTEXT + NO_AUTH_SERVLET + "?include=8";
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.POST);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("text/plain");
    configBean.setContentTypeForUpdates("text/plain");
    
    assertTrue(configBean.isValid());
    
    String outgoingMsg = "this is the message!";
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, outgoingMsg);
    assertEquals(outgoingMsg, response.getResponseBody().trim());
  }
  
}
