import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.taverna.t2.activities.rest.HTTPRequestHandler;

/**
 * The idea behind using this class is that both servlets (publicly open
 * and requiring BASIC / DIGEST authentication) in this server would
 * have identical functionality apart from being configured with
 * different authentication settings.
 * 
 * This class provides this common functionality.
 * 
 * Appropriate authentication settings in web.xml make sure that the
 * servlet container takes care of authentication and no specific code
 * is needed to be written. 
 * 
 * -----------------------------------------------------------------
 * Examples of URLs:
 * 
 * Get all status details:
 * http://localhost:8080/test-server/NoAuthServlet?getAllDetails=true
 * 
 * Get only the value of "Accept" header:
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept
 * 
 * Get only the value of the HTTP method in the request:
 * http://localhost:8080/test-server/NoAuthServlet?include=1
 * 
 * Get values of "Content-Type" and "Accept" headers and include values
 * of request URL and request HTTP method (also use data labels):
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept,content-type&getSelectedDetails=1,2&outputDataLabels=true
 * 
 * @author Sergejs Aleksejevs
 */
public class ServerResponseGenerator
{
  public static String INCLUDE_DATA_LABELS = "includeDataLabels";
  
  // NB! Output of the received message cannot be combined with any other
  //     option; GET_SELECTED_DETAILS | GET_ALL_DETAILS can be combined
  //     with GET_HEADERS_WITH_NAMES
  public static String GET_RECEIVED_MESSAGE = "getReceivedMessage";     // will make the server to respond with the body of the received message
  public static String GET_HEADERS_WITH_NAMES = "getHeadersWithNames";  // the value is the comma-separated list of names of headers for which values are to be retrieved
  public static String GET_ALL_DETAILS = "getAllDetails";
  public static String GET_SELECTED_DETAILS = "getSelectedDetails";     // value will be comma-separated list integer IDs of possible fields to be included into the output 
  
  // .. status details to select from
  public static int GET_HTTP_METHOD =  1;
  public static int GET_REQUEST_URL =  2;
  public static int GET_QUERY_STRING =  3;
  public static int GET_ALL_PARAMETER_NAMES =  4;
  public static int GET_ALL_HEADER_NAMES =  5;
  public static int GET_AUTHENTICATION_METHOD =  6;
  public static int GET_REMOTE_USER_NAME =  7;
  
  
  @SuppressWarnings("unchecked")
  protected static void generateResponse(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
    boolean bOutputAllStatusDetails = false;
    boolean bOutputDataLabels = false;
    
    
    // SET THE MIME TYPE OF SERVER'S RESPONSE according to the request
    // (this won't correspond to the real output from the server - done just for testing purposes)
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
    
    
    // ANALYSE PARAMETERS TO CHOOSE WHAT TO RESPOND WITH
    
    if (request.getParameter(GET_RECEIVED_MESSAGE) != null &&
        request.getParameter(GET_RECEIVED_MESSAGE).equals(true))
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
      byte[] inData = HTTPRequestHandler.readFromInputStreamAsBinary(request.getInputStream());
      
      OutputStream out = response.getOutputStream();
      out.write(inData);
      out.close();
    }
    
    else {
      // response will be made as a string - get reference of output object
      PrintWriter out = response.getWriter();
      
      
      // all status details will only be included if this is explicitly requested
      bOutputAllStatusDetails = request.getParameter(GET_ALL_DETAILS) != null &&
                                request.getParameter(GET_ALL_DETAILS).equals("true");
      
      
      // check which status details will need to be included into the output
      List<Integer> includeValueIDs = new ArrayList<Integer>();
      if (!bOutputAllStatusDetails) {
        String strInclude = request.getParameter(GET_SELECTED_DETAILS);
        if (strInclude != null && strInclude.length() > 0) {
          for (String includeParamID : strInclude.split(",")) {
            includeValueIDs.add(Integer.parseInt(includeParamID));
          }
        }
      }
      
      // check if labels for output pieces of data need to be output
      // (or if just data is needed)
      if (request.getParameter(INCLUDE_DATA_LABELS) != null &&
          request.getParameter(INCLUDE_DATA_LABELS).equals("true")) {
        bOutputDataLabels = true;
      }
      
      
      // PREPARE THE ACTUAL RESPONSE
      
      // check if any HTTP request headers need to output
      String getHeadersWithNames = request.getParameter(GET_HEADERS_WITH_NAMES);
      if (getHeadersWithNames != null) {
        for (String headerName : getHeadersWithNames.split(",")) {
          out.println((bOutputDataLabels ? ("Header \"" + headerName + "\": ") : "") + request.getHeader(headerName));
        }
      }
      
      
      // output necessary status details
      
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_HTTP_METHOD)) {
        out.println((bOutputDataLabels ? "HTTP method: " : "") + request.getMethod());
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_REQUEST_URL)) {
        out.println((bOutputDataLabels ? "Request URL: " : "") + request.getRequestURL());
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_QUERY_STRING)) {
        out.println((bOutputDataLabels ? "Query string: " : "") + request.getQueryString());
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_ALL_PARAMETER_NAMES)) {
        out.println((bOutputDataLabels ? "Parameter names: " : "") + Collections.list(request.getParameterNames()));
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_ALL_HEADER_NAMES)) {
        out.println((bOutputDataLabels ? "Header names: " : "") + Collections.list(request.getHeaderNames()));
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_AUTHENTICATION_METHOD)) {
        out.println((bOutputDataLabels ? "Authentication type: " : "") + request.getAuthType());
      }
      if (bOutputAllStatusDetails || includeValueIDs.contains(GET_REMOTE_USER_NAME)) {
        out.println((bOutputDataLabels ? "Remote user name: " : "") + request.getRemoteUser());
      }
      
      out.close();
    }
    
  }
}
