import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
 * http://localhost:8080/test-server/NoAuthServlet
 * http://localhost:8080/test-server/NoAuthServlet?getAllStatusDetails=true
 * 
 * Get only the value of "Accept" header:
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept
 * 
 * Get only the value of the HTTP method in the request:
 * http://localhost:8080/test-server/NoAuthServlet?include=1
 * 
 * Get values of "Content-Type" and "Accept" headers and include values
 * of request URL and request HTTP method (also use data labels):
 * http://localhost:8080/test-server/NoAuthServlet?getHeadersWithNames=accept,content-type&include=1,2&outputDataLabels=true
 * 
 * @author Sergejs Aleksejevs
 */
public class ServerResponseGenerator
{
  public static String INCLUDE = "include";
  public static String GET_HEADERS_WITH_NAMES = "getHeadersWithNames";  // the value is the comma-separated list of names of headers for which values are to be retrieved
  public static String OUTPUT_DATA_LABELS = "outputDataLabels";
  public static String OUTPUT_ALL_STATUS_DETAILS = "outputAllStatusDetails";
  
  public static int INCLUDE_HTTP_METHOD =  1;
  public static int INCLUDE_REQUEST_URL =  2;
  public static int INCLUDE_QUERY_STRING =  3;
  public static int INCLUDE_ALL_PARAMETER_NAMES =  4;
  public static int INCLUDE_ALL_HEADER_NAMES =  5;
  public static int INCLUDE_AUTHENTICATION_METHOD =  6;
  public static int INCLUDE_REMOTE_USER_NAME =  7;
  public static int INCLUDE_RECEIVED_MESSAGE_BODY = 8;
  
  
  @SuppressWarnings("unchecked")
  protected static void generateResponse(HttpServletRequest request, HttpServletResponse response) throws IOException
  {
    boolean bOutputAllStatusDetails = false;
    boolean bOutputDataLabels = false;
    
    
    // SET THE MIME TYPE OF SERVER'S RESPONSE according to the request
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
    
    
    // PARSE REQUEST TO GET GENERAL SETTINGS
    
    // all status details will only be included if:
    // - this is explicitly requested
    // - there is no request to include any header values and
    //   no request to include any status details
    String strInclude = request.getParameter(INCLUDE);
    List<Integer> includeValueIDs = new ArrayList<Integer>();
    if ((request.getParameter(OUTPUT_ALL_STATUS_DETAILS) != null &&
         request.getParameter(OUTPUT_ALL_STATUS_DETAILS).equals("true"))
        ||
        ((strInclude == null || strInclude.length() == 0) &&
        (request.getParameter(GET_HEADERS_WITH_NAMES) == null ||
         request.getParameter(GET_HEADERS_WITH_NAMES).length() == 0))
       ) {
      bOutputAllStatusDetails = true;
    }
    
    // check which status details will need to be included into the output
    if (strInclude != null && strInclude.length() > 0) {
      for (String includeParamID : strInclude.split(",")) {
        includeValueIDs.add(Integer.parseInt(includeParamID));
      }
    }
    
    // check if labels for output pieces of data need to be output
    // (or if just data is needed)
    if (request.getParameter(OUTPUT_DATA_LABELS) != null &&
        request.getParameter(OUTPUT_DATA_LABELS).equals("true")) {
      bOutputDataLabels = true;
    }
    
    // check if need to output all status details
    if (request.getParameter(OUTPUT_ALL_STATUS_DETAILS) != null &&
        request.getParameter(OUTPUT_ALL_STATUS_DETAILS).equals("true")) {
      bOutputAllStatusDetails = true;
    }
    
    
    // PREPARE THE ACTUAL RESPONSE
    
    PrintWriter out = response.getWriter();
    
    
    // check if any HTTP request headers need to output
    String getHeadersWithNames = request.getParameter(GET_HEADERS_WITH_NAMES);
    if (getHeadersWithNames != null) {
      for (String headerName : getHeadersWithNames.split(",")) {
        out.println((bOutputDataLabels ? ("Header \"" + headerName + "\": ") : "") + request.getHeader(headerName));
      }
    }
    
    
    // output necessary status details
    
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_HTTP_METHOD)) {
      out.println((bOutputDataLabels ? "HTTP method: " : "") + request.getMethod());
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_REQUEST_URL)) {
      out.println((bOutputDataLabels ? "Request URL: " : "") + request.getRequestURL());
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_QUERY_STRING)) {
      out.println((bOutputDataLabels ? "Query string: " : "") + request.getQueryString());
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_ALL_PARAMETER_NAMES)) {
      out.println((bOutputDataLabels ? "Parameter names: " : "") + Collections.list(request.getParameterNames()));
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_ALL_HEADER_NAMES)) {
      out.println((bOutputDataLabels ? "Header names: " : "") + Collections.list(request.getHeaderNames()));
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_AUTHENTICATION_METHOD)) {
      out.println((bOutputDataLabels ? "Authentication type: " : "") + request.getAuthType());
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_REMOTE_USER_NAME)) {
      out.println((bOutputDataLabels ? "Remote user name: " : "") + request.getRemoteUser());
    }
    if (bOutputAllStatusDetails || includeValueIDs.contains(INCLUDE_RECEIVED_MESSAGE_BODY))
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(request.getInputStream()));
      
      StringBuffer msg = new StringBuffer();
      String line = null;
      while ((line = reader.readLine()) != null) { msg.append(line + "\n"); }
      
      out.println((bOutputDataLabels ? "Received message: " : "") + msg.toString());
    }
    
    
    out.close();
  }
}
