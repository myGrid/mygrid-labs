package net.sf.taverna.t2.activities.rest.test_server;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * The idea behind using this class is that both servlets (publicly open
 * and requiring BASIC / DIGEST authentication) in this server would
 * have identical functionality apart from being configured with
 * different authentication settings.
 * 
 * <br/><br/>
 * This class provides this common functionality.
 * 
 * <br/><br/>
 * Appropriate authentication settings in web.xml make sure that the
 * servlet container takes care of authentication and no specific code
 * is needed to be written. 
 * 
 * <br/><br/>
 * -----------------------------------------------------------------<br/><br/>
 * Examples of URLs:
 * 
 * <br/><br/>
 * Get all status details:
 * http://localhost:8080/test-server/NoAuthServlet?getAllDetails=true
 * 
 * <br/><br/>
 * Get only the value of "Accept" header:
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept
 * 
 * <br/><br/>
 * Get only the value of the HTTP method in the request:
 * http://localhost:8080/test-server/NoAuthServlet?include=1
 * 
 * <br/><br/>
 * Get values of "Content-Type" and "Accept" headers and include values
 * of request URL and request HTTP method (also use data labels):
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept,content-type&getSelectedDetails=1,2&outputDataLabels=true
 * 
 * <br/><br/>
 * NB! Output of the received message cannot be combined with any other
 *     option; {@link HTTPRequestHandlerTest#GET_SELECTED_DETAILS} |
 *     {@link HTTPRequestHandlerTest#GET_ALL_DETAILS} can be combined
 *     with {@link HTTPRequestHandlerTest#GET_HEADERS_WITH_NAMES}.
 * 
 * @author Sergejs Aleksejevs
 */
public class ServerResponseGenerator
{
  
  
  
  @SuppressWarnings("unchecked")
  protected static void generateResponse(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
    boolean bOutputAllStatusDetails = false;
    boolean bOutputDataLabels = false;
    
    boolean bNoResponseYet = true;
    
    
    // SET THE MIME TYPE OF SERVER'S RESPONSE according to the request
    setResponseMIMEType(request, response);
    
    // ANALYSE PARAMETERS TO CHOOSE WHAT TO RESPOND WITH
    
    if (request.getParameter(RESTTestServerConfiguration.GET_RECEIVED_MESSAGE) != null &&
        request.getParameter(RESTTestServerConfiguration.GET_RECEIVED_MESSAGE).equals("true"))
    {
     // Data read as string
  //    BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
  //    
  //    StringBuffer msg = new StringBuffer();
  //    String line = null;
  //    while ((line = reader.readLine()) != null) { msg.append(line + "\n"); }
  //    
  //    out.println((bOutputDataLabels ? "Received message: " : "") + msg.toString());
      
      // Data read as binary
      byte[] inData = readFromInputStreamAsBinary(request.getInputStream());
      
      OutputStream out = response.getOutputStream();
      out.write(inData);
      out.close();
      
      bNoResponseYet = false;
    }
    
    else {
      // response will be made as a string - get reference of output object
      PrintWriter out = response.getWriter();
      
      
      // all status details will only be included if this is explicitly requested
      bOutputAllStatusDetails = request.getParameter(RESTTestServerConfiguration.GET_ALL_DETAILS) != null &&
                                request.getParameter(RESTTestServerConfiguration.GET_ALL_DETAILS).equals("true");
      
      
      // check which status details will need to be included into the output
      List<Integer> includeValueIDs = new ArrayList<Integer>();
      if (!bOutputAllStatusDetails) {
        String strInclude = request.getParameter(RESTTestServerConfiguration.GET_SELECTED_DETAILS);
        if (strInclude != null && strInclude.length() > 0) {
          for (String includeParamID : strInclude.split(",")) {
            includeValueIDs.add(Integer.parseInt(includeParamID));
          }
        }
      }
      
      // check if labels for output pieces of data need to be output
      // (or if just data is needed)
      if (request.getParameter(RESTTestServerConfiguration.INCLUDE_DATA_LABELS) != null &&
          request.getParameter(RESTTestServerConfiguration.INCLUDE_DATA_LABELS).equals("true")) {
        bOutputDataLabels = true;
      }
      
      
      // PREPARE THE ACTUAL RESPONSE
      
      // check if any HTTP request headers need to output
      String getHeadersWithNames = request.getParameter(RESTTestServerConfiguration.GET_HEADERS_WITH_NAMES);
      if (getHeadersWithNames != null) {
        for (String headerName : getHeadersWithNames.split(",")) {
          out.println((bOutputDataLabels ? ("Header \"" + headerName + "\": ") : "") + request.getHeader(headerName));
          bNoResponseYet = false;
        }
      }
      
      
      // output necessary status details
      
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_HTTP_METHOD)) {
        out.println((bOutputDataLabels ? "HTTP method: " : "") + request.getMethod());
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_REQUEST_URL)) {
        out.println((bOutputDataLabels ? "Request URL: " : "") + request.getRequestURL());
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_QUERY_STRING)) {
        out.println((bOutputDataLabels ? "Query string: " : "") + request.getQueryString());
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_ALL_PARAMETER_NAMES)) {
        out.println((bOutputDataLabels ? "Parameter names: " : "") + Collections.list(request.getParameterNames()));
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_ALL_HEADER_NAMES)) {
        out.println((bOutputDataLabels ? "Header names: " : "") + Collections.list(request.getHeaderNames()));
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_AUTHENTICATION_METHOD)) {
        out.println((bOutputDataLabels ? "Authentication type: " : "") + request.getAuthType());
        bNoResponseYet = false;
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(RESTTestServerConfiguration.GET_REMOTE_USER_NAME)) {
        out.println((bOutputDataLabels ? "Remote user name: " : "") + request.getRemoteUser());
        bNoResponseYet = false;
      }
      
      
      // TEST IF NO RESPONSE MADE - OUTPUT SOMETHING
      if (bNoResponseYet) {
        out.println("No data requested - some request parameters are necessary; see source code...");
      }
      
      
      out.close();
    }
    
  }
  
  
  /**
   * Sets the MIME type of this server's response according to the request.
   * NB! This won't correspond to the real output from the server - done just for testing purposes.
   * 
   * This method must be called after .getWriter() / .getOutputStream() was called on the response.
   * 
   * @param request
   * @param response
   */
  private static void setResponseMIMEType(HttpServletRequest request, HttpServletResponse response)
  {
    String strAcceptHeader = request.getHeader("accept");
    if (strAcceptHeader != null) {
      if (strAcceptHeader.indexOf(",") == -1) {
        // just a single MIME type - use it
        response.setContentType(strAcceptHeader);
      }
      else {
        // multiple MIME types, just use the first one
        response.setContentType(strAcceptHeader.split(",")[0]);
      }
    }
  }
  
  
  
  
  /**
   * Worker method that extracts the content of the input stream as binary data.
   * 
   * NB! This method is fully copied from net.sf.taverna.t2.activities.rest.HTTPRequestHandler class --
   *     this is to make sure that there is no dependency on the REST activity project
   * 
   * @param inputStream
   * @return
   * @throws IOException
   */
  public static byte[] readFromInputStreamAsBinary(InputStream inputStream) throws IOException
  {
    // use BufferedInputStream for better performance
    BufferedInputStream in = new BufferedInputStream(inputStream);
    
    try
    {
      // this list is to hold all fetched data
      List<byte[]> data = new ArrayList<byte[]>();
      
      // set up buffers for reading the data
      int bufLength = 100 * 1024; // 100K
      byte[] buf = new byte[bufLength];
      byte[] currentPortionOfData = null;
      int currentlyReadByteCount = 0;
      
      // read the data portion by portion into a list
      while ((currentlyReadByteCount = in.read(buf, 0, bufLength)) != -1) {
        currentPortionOfData = new byte[currentlyReadByteCount];
        System.arraycopy(buf, 0, currentPortionOfData, 0, currentlyReadByteCount);
        data.add(currentPortionOfData);
      }
      
      // now check how much data was read and return that as a single byte array
      if (data.size() == 1)
      {
        // just a single block of data - return it as it is
        return (data.get(0));
      }
      else {
        // there is more than one block of data -- calculate total length of data
        bufLength = 0;
        for (byte[] portionOfData : data) bufLength += portionOfData.length;
        
        // allocate a single large byte array that could contain all data
        buf = new byte[bufLength];
        
        // fill this byte array with data from all fragments
        int lastFilledPositionInOutputArray = 0;
        for (byte[] portionOfData : data) {
          System.arraycopy(portionOfData, 0, buf, lastFilledPositionInOutputArray, portionOfData.length);
          lastFilledPositionInOutputArray += portionOfData.length;
        }
        
        return (buf);
      }
    }
    finally {
      // this method will still throw any IOExceptions that may occur, but
      // this block is used to close the input stream anyway
      if (in != null) {
        try { in.close(); }
        catch (Exception e) { /* do nothing on this failure - it was just an attempt to recover resources */ }
      }
    }
  }
  
  
}
