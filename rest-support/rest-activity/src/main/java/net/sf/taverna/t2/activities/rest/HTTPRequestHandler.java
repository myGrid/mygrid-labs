package net.sf.taverna.t2.activities.rest;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;

import net.sf.taverna.t2.security.credentialmanager.CredentialManager;
import net.sf.taverna.t2.security.credentialmanager.UsernamePassword;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class HTTPRequestHandler
{
  public static HTTPRequestResponse initiateHTTPRequest(RESTActivity.HTTP_METHOD httpMethod, String requestURL, String inputMessageBody)
  {
    try {
      switch (httpMethod) {
        case GET:    return (doGET(requestURL));
        case POST:   return (doPOST(requestURL, inputMessageBody));
        case PUT:    return (doPUT(requestURL, inputMessageBody));
        case DELETE: return (doDELETE(requestURL));
      }
    }
    catch (Exception ex) {
      return (new HTTPRequestResponse(ex));
    }
    
    return (new HTTPRequestResponse(new Exception("SOMETHING WENT WRONG... No failure, but unexpected HTTP method occurred.")));
  }
  
  
  private static HTTPRequestResponse doGET(String requestURL) {
    HttpGet httpGet = new HttpGet(requestURL);
    httpGet.addHeader("Accept", "application/xml");
    return (performHTTPRequest(httpGet));
  }
  
  
  private static HTTPRequestResponse doPOST(String requestURL, String inputMessageBody) throws UnsupportedEncodingException {
    // POST TO MYEXPERIMENT - basic auth
    HttpPost httpPost = new HttpPost("http://sandbox.myexperiment.org/comment.xml");
//    httpPost.addHeader("Authorization", "Basic " + new String(Base64.encodeBase64(("LOGIN" + ":" + "PASSWORD").getBytes())));
    httpPost.addHeader("Accept", "application/xml");
    httpPost.addHeader("Content-Type", "application/xml");
    httpPost.setEntity(new StringEntity("<comment><subject resource=\"http://sandbox.myexperiment.org/files/226\"/><comment>1122</comment></comment>"));
    return(performHTTPRequest(httpPost));
    
    // POST TO BIOCATALOGUE - no auth
//    HttpPost httpPost = new HttpPost(requestURL);
//    httpPost.addHeader("Accept", "application/xml");
//    httpPost.addHeader("Content-Type", "application/xml");
//    httpPost.setEntity(new StringEntity("<searchByData><searchType>input</searchType><limit>20</limit><data>test</data></searchByData>"));
//    return (performHTTPRequest(httpPost));
  }
  
  
  private static HTTPRequestResponse doPUT(String requestURL, String inputMessageBody) throws UnsupportedEncodingException {
    HttpPut httpPut = new HttpPut("http://sandbox.myexperiment.org/comment.xml?id=251");
    httpPut.addHeader("Authorization", "Basic " + new String(Base64.encodeBase64(("LOGIN" + ":" + "PASSWORD").getBytes())));
    httpPut.addHeader("Accept", "application/xml");
    httpPut.addHeader("Content-Type", "application/xml");
    httpPut.setEntity(new StringEntity("<comment><subject resource=\"http://sandbox.myexperiment.org/files/226\"/><comment>12345678</comment></comment>"));
    return (performHTTPRequest(httpPut));
  }
  
  
  private static HTTPRequestResponse doDELETE(String requestURL) {
    HttpDelete httpDelete = new HttpDelete("http://sandbox.myexperiment.org/comment.xml?id=251");
    httpDelete.addHeader("Authorization", "Basic " + new String(Base64.encodeBase64(("LOGIN" + ":" + "PASSWORD").getBytes())));
    httpDelete.addHeader("Accept", "application/xml");
    return (performHTTPRequest(httpDelete));
  }
  
  
  /**
   * TODO - may need to set PROXY from Taverna's / Java's settings...
   * TODO - will the response always have "entity"? e.g. HEAD method?
   * TODO - REDIRECTION output:: if there was no redirection, should just show the actual initial URL?
   * 
   * @param httpRequest
   */
  private static HTTPRequestResponse performHTTPRequest(HttpRequestBase httpRequest)
  {
    HTTPRequestResponse requestResponse = new HTTPRequestResponse();
    
    try {
      StringBuilder responseBodyString = new StringBuilder();
      // ---------------------------------------------
      
      HttpClient httpClient = new DefaultHttpClient();
      ((DefaultHttpClient)httpClient).setCredentialsProvider(new RESTActivityCredentialsProvider()); // TODO - getInstance() - i.e. make it singleton
      HttpContext localContext = new BasicHttpContext();
      
      // execute the request
      HttpResponse response = httpClient.execute(httpRequest, localContext);
      
//      // check if wasn't authorised - then need to obtain credentials from CredentialManager + repeat request
//      if (response.getStatusLine().getStatusCode() == HttpStatus.SC_UNAUTHORIZED) {
//        HttpHost targetHost = (HttpHost) localContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
//        
//        CredentialManager credManager = CredentialManager.getInstance();
//        UsernamePassword credentials = credManager.getUsernameAndPasswordForService(
//            URI.create(targetHost.toURI()), true, "This REST service requires authentication");
//        System.out.println(targetHost.toURI());
//        
//        if (credentials != null) {
//          // repeat request
//          ((DefaultHttpClient)httpClient).getCredentialsProvider().setCredentials(
//              new AuthScope(targetHost.getHostName(), targetHost.getPort()), 
//              new UsernamePasswordCredentials(credentials.getUsername(), credentials.getPasswordAsString()));
//          
//          System.out.println(credentials.getUsername() + " - " + credentials.getPasswordAsString());
//          response.getEntity().consumeContent(); // make sure the old connection is released before making the new one
//          response = httpClient.execute(httpRequest, localContext);
//        }
//      }
      
      
      
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
