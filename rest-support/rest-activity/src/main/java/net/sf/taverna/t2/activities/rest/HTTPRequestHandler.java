package net.sf.taverna.t2.activities.rest;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

/**
 * This class deals with the actual remote REST service invocation.
 * The main four HTTP methods (GET | POST | PUT | DELETE) are supported.
 * <br/><br/>
 * 
 * Configuration for request execution is obtained from the related
 * REST activity - encapsulated in a configuration bean.
 * 
 * @author Sergejs Aleksejevs
 */
public class HTTPRequestHandler
{
  private static final String CONTENT_TYPE_HEADER_NAME = "Content-Type";
  private static final String ACCEPT_HEADER_NAME = "Accept";
  
  
  /**
   * This method is the entry point to the invocation of a remote REST
   * service. It accepts a number of parameters from the related REST
   * activity and uses those to assemble, execute and fetch results of
   * a relevant HTTP request.
   * 
   * @param requestURL The URL for the request to be made. This cannot be
   *                   taken from the <code>configBean</code>, because this
   *                   should be the complete URL which may be directly used
   *                   to make the request (<code>configBean</code> would only
   *                   contain the URL signature associated with the REST activity). 
   * @param configBean Configuration of the associated REST activity is passed to
   *                   this class as a configuration bean. Settings such as HTTP method,
   *                   MIME types for "Content-Type" and "Accept" headers, etc are taken
   *                   from the bean.
   * @param inputMessageBody Body of the message to be sent to the server - only needed
   *                         for POST and PUT requests; for GET and DELETE it will be discarded.
   * @return
   */
  public static HTTPRequestResponse initiateHTTPRequest(String requestURL,
      RESTActivityConfigurationBean configBean, String inputMessageBody)
  {
    switch (configBean.getHttpMethod()) {
      case GET:    return (doGET   (requestURL, configBean));
      case POST:   return (doPOST  (requestURL, configBean, inputMessageBody));
      case PUT:    return (doPUT   (requestURL, configBean, inputMessageBody));
      case DELETE: return (doDELETE(requestURL, configBean));
      default:     return (new HTTPRequestResponse(new Exception("Error: something went wrong; " +
      		                  "no failure has occurred, but but unexpected HTTP method (\"" +
      		                  configBean.getHttpMethod() + "\") encountered.")));
    }
  }
  
  
  private static HTTPRequestResponse doGET(String requestURL, RESTActivityConfigurationBean configBean) {
    HttpGet httpGet = new HttpGet(requestURL);
    return (performHTTPRequest(httpGet, configBean));
  }
  
  
  private static HTTPRequestResponse doPOST(String requestURL,
      RESTActivityConfigurationBean configBean, String inputMessageBody)
  {
    HttpPost httpPost = new HttpPost(requestURL);
    httpPost.addHeader(CONTENT_TYPE_HEADER_NAME, configBean.getContentTypeForUpdates());
    try {
      httpPost.setEntity(new StringEntity(inputMessageBody));
    }
    catch (UnsupportedEncodingException e) {
      return(new HTTPRequestResponse(new Exception("Error occurred while trying to " +
      		"attach a message body to the POST request. See attached cause of this " +
      		"exception for details.")));
    }
    return(performHTTPRequest(httpPost, configBean));
  }
  
  
  private static HTTPRequestResponse doPUT(String requestURL,
      RESTActivityConfigurationBean configBean, String inputMessageBody)
  {
    HttpPut httpPut = new HttpPut(requestURL);
    httpPut.addHeader(CONTENT_TYPE_HEADER_NAME, configBean.getContentTypeForUpdates());
    try {
      httpPut.setEntity(new StringEntity(inputMessageBody));
    }
    catch (UnsupportedEncodingException e) {
      return(new HTTPRequestResponse(new Exception("Error occurred while trying to " +
          "attach a message body to the PUT request. See attached cause of this " +
          "exception for details.")));
    }
    return (performHTTPRequest(httpPut, configBean));
  }
  
  
  private static HTTPRequestResponse doDELETE(String requestURL, RESTActivityConfigurationBean configBean) {
    HttpDelete httpDelete = new HttpDelete(requestURL);
    return (performHTTPRequest(httpDelete, configBean));
  }
  
  
  /**
   * TODO - may need to set PROXY from Taverna's / Java's settings...
   * TODO - will the response always have "entity"? e.g. HEAD method?
   * TODO - REDIRECTION output:: if there was no redirection, should just show the actual initial URL?
   * 
   * @param httpRequest
   * @param acceptHeaderValue 
   */
  private static HTTPRequestResponse performHTTPRequest(HttpRequestBase httpRequest, RESTActivityConfigurationBean configBean)
  {
    // headers are set identically for all HTTP methods, therefore can do centrally - here
    httpRequest.setHeader(ACCEPT_HEADER_NAME, configBean.getAcceptsHeaderValue());
    
    
    HTTPRequestResponse requestResponse = new HTTPRequestResponse();
    
    try {
      StringBuilder responseBodyString = new StringBuilder();
      // ---------------------------------------------
      
      HttpClient httpClient = new DefaultHttpClient();
      ((DefaultHttpClient)httpClient).setCredentialsProvider(RESTActivityCredentialsProvider.getInstance());
      HttpContext localContext = new BasicHttpContext();
      
      // execute the request
      HttpResponse response = httpClient.execute(httpRequest, localContext);
      
      // record response code
      requestResponse.setStatusCode(response.getStatusLine().getStatusCode());
      requestResponse.setReasonPhrase(response.getStatusLine().getReasonPhrase());
      
      // track where did the final redirect go to (if there was any)
      HttpHost targetHost = (HttpHost) localContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
      HttpUriRequest targetRequest = (HttpUriRequest) localContext.getAttribute(ExecutionContext.HTTP_REQUEST);
      requestResponse.setRedirection(targetRequest.getMethod() + " " + targetHost + targetRequest.getURI());
      
      // read and store response body
      HttpEntity entity = response.getEntity();
      if (entity != null) {
        InputStream in = entity.getContent();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        
        String str;
        while ((str = reader.readLine()) != null) {
          responseBodyString.append(str + "\n");
        }
        
        requestResponse.setResponseBody(responseBodyString.toString());
      }
      
      // release resources (e.g. connection pool, etc)
      httpClient.getConnectionManager().shutdown();
     
    }
    catch (Exception ex) {
      requestResponse = new HTTPRequestResponse(ex);
    }
    
    return (requestResponse);
  }
  
  
  
  /**
   * All fields have public accessor, but private mutators. This
   * is because it should only be allowed to modify the HTTPRequestResponse
   * partially inside the HTTPRequestHandler class only. For users of this
   * class it will behave as immutable.
   * 
   * @author Sergejs Aleksejevs
   */
  public static class HTTPRequestResponse
  {
    private int statusCode;
    private String reasonPhrase;
    private String redirection;
    private String responseBody;
    
    private Exception exception;
    
    
    /**
     * Private default constructor - will only be accessible from HTTPRequestHandler.
     * Values for the entity will then be set using the private mutator methods.
     */
    private HTTPRequestResponse()
    {
      /* 
       * do nothing here - values will need to be manually set later by using
       * private mutator methods
       */
    }
    
    /**
     * Standard public constructor for a regular case, where all values are known and
     * the request has succeeded.
     * 
     * @param statusCode
     * @param reasonPhrase
     * @param redirection
     * @param responseBody
     */
    public HTTPRequestResponse(int statusCode, String reasonPhrase, String redirection, String responseBody)
    {
      this.statusCode = statusCode;
      this.reasonPhrase = reasonPhrase;
      this.redirection = redirection;
      this.responseBody = responseBody;
    }
    
    /**
     * Standard public constructor for an error case, where an error has occurred
     * and request couldn't be executed because of an internal exception (rather
     * than an error received from the remote server).
     * 
     * @param exception
     */
    public HTTPRequestResponse(Exception exception)
    {
      this.exception = exception;
    }
    
    
    private void setStatusCode(int statusCode) {
      this.statusCode = statusCode;
    }
    public int getStatusCode() {
      return statusCode;
    }
    
    public String getReasonPhrase() {
      return reasonPhrase;
    }
    private void setReasonPhrase(String reasonPhrase) {
      this.reasonPhrase = reasonPhrase;
    }
    
    public String getRedirection() {
      return redirection;
    }
    private void setRedirection(String redirection) {
      this.redirection = redirection;
    }
    
    public String getResponseBody() {
      return responseBody;
    }
    private void setResponseBody(String outputBody) {
      this.responseBody = outputBody;
    }
    
    public boolean hasException() {
      return (this.exception != null);
    }
    public Exception getException() {
      return exception;
    }
    private void setException(Exception exception) {
      this.exception = exception;
    }
  }
  
}
