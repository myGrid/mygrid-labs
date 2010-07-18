package net.sf.taverna.t2.activities.rest;

import org.junit.*;
import static org.junit.Assert.*;

import net.sf.taverna.t2.activities.rest.HTTPRequestHandler.HTTPRequestResponse;
import net.sf.taverna.t2.activities.rest.RESTActivity.DATA_FORMAT;
import net.sf.taverna.t2.activities.rest.RESTActivity.HTTP_METHOD;


/**
 * NB! If tests are failing, make sure to check {@link RESTTestServerConfiguration#TEST_SERVER_LOCATION},
 *     {@link RESTTestServerConfiguration#TEST_SERVER_CONTEXT} and the name of the servlet -
 *     {@link RESTTestServerConfiguration#NO_AUTH_SERVLET}.
 * 
 * @author Sergejs Aleksejevs
 */
public class HTTPRequestHandlerTest
{
  
  @Test
  public void basicServerInvocation_testingRedirectionLeadsToTheOriginalRequestURL()
  {
    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION +
                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT +
                 RESTTestServerConfiguration.NO_AUTH_SERVLET;
    
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
    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION + 
                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT + 
                 RESTTestServerConfiguration.NO_AUTH_SERVLET + 
                 "?" + RESTTestServerConfiguration.GET_HEADERS_WITH_NAMES + "=accept";
    
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
    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION +
                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT + 
                 RESTTestServerConfiguration.NO_AUTH_SERVLET +
                 "?" + RESTTestServerConfiguration.GET_SELECTED_DETAILS + "=" + RESTTestServerConfiguration.GET_HTTP_METHOD;
    
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
  public void testMessageBodyIsPostedCorrectlyAsString()
  {
    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION +
                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT + 
                 RESTTestServerConfiguration.NO_AUTH_SERVLET + 
                 "?" + RESTTestServerConfiguration.GET_RECEIVED_MESSAGE + "=true";
    
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
  
  
  @Test
  public void testMessageBodyIsPostedCorrectlyAsBinary()
  {
    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION +
                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT + 
                 RESTTestServerConfiguration.NO_AUTH_SERVLET + 
                 "?" + RESTTestServerConfiguration.GET_RECEIVED_MESSAGE + "=true";
    
    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
    configBean.setHttpMethod(HTTP_METHOD.POST);
    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
    configBean.setAcceptsHeaderValue("application/octet-stream");
    configBean.setContentTypeForUpdates("application/octet-stream");
    configBean.setOutgoingDataFormat(DATA_FORMAT.Binary);
    
    assertTrue(configBean.isValid());
    
    byte[] outgoingMsg = new byte[] {(byte)0x12, (byte)0x0F, (byte)0xF0};
    HTTPRequestResponse response = HTTPRequestHandler.initiateHTTPRequest(url, configBean, outgoingMsg);
    assertArrayEquals(outgoingMsg, (byte[])response.getResponseBody());
  }
  
  
  @Test
  public void testMessageBodiesAreDifferentWhenTheSameDataSentAsBinaryVsAsString()
  {
    // TODO - don't know how to execute this.. when similar is executed in Taverna, the
    //        difference is visible: if PNG image is sent as a String, it comes back as
    //        a string, not an image; however, when sent as Binary, it comes back as an
    //        image and is recognised by Taverna as such.
    
//    String url = RESTTestServerConfiguration.TEST_SERVER_LOCATION +
//                 RESTTestServerConfiguration.TEST_SERVER_CONTEXT + 
//                 RESTTestServerConfiguration.NO_AUTH_SERVLET + 
//                 "?" + RESTTestServerConfiguration.GET_RECEIVED_MESSAGE + "=true";
//    
//    RESTActivityConfigurationBean configBean = new RESTActivityConfigurationBean();
//    configBean.setHttpMethod(HTTP_METHOD.POST);
//    configBean.setUrlSignature(url); // set the complete URL as the signature - won't be used anyway
//    configBean.setAcceptsHeaderValue("application/octet-stream");
//    configBean.setContentTypeForUpdates("application/octet-stream");
//    
//    // POST as a String first
//    configBean.setOutgoingDataFormat(DATA_FORMAT.String);
//    assertTrue(configBean.isValid());
//    
//    byte[] outgoingMsg = new byte[] {(byte)0x12, (byte)0x0F, (byte)0xF0};
//    HTTPRequestResponse responseAsString = HTTPRequestHandler.initiateHTTPRequest(url, configBean, outgoingMsg);
//    Object receivedMsgAsString = responseAsString.getResponseBody();
//    
//    
//    // now POST as a Binary
//    configBean.setOutgoingDataFormat(DATA_FORMAT.Binary);
//    assertTrue(configBean.isValid());
//    
//    HTTPRequestResponse responseAsBinary = HTTPRequestHandler.initiateHTTPRequest(url, configBean, outgoingMsg);
//    Object receivedMsgAsBinary = responseAsBinary.getResponseBody();
//    
//    
//    // now COMPARE the two results - should be different
//    assertEquals(receivedMsgAsString, receivedMsgAsBinary);
  }
}
