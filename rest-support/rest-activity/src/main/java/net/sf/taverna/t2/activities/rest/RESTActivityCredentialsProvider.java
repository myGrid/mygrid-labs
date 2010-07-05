package net.sf.taverna.t2.activities.rest;

import java.net.URI;
import java.net.URLEncoder;
import java.security.Principal;

import javax.management.remote.JMXPrincipal;

import net.sf.taverna.t2.security.credentialmanager.CredentialManager;
import net.sf.taverna.t2.security.credentialmanager.UsernamePassword;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.log4j.Logger;
import org.springframework.core.type.StandardClassMetadata;

/**
 * This CredentialsProvider acts as a mediator between the Apache HttpClient
 * and Taverna's CredentialManager that stores all user's credentials.
 * 
 * The only role of it is to retrieve stored details from CredentialManager
 * when they are required for HTTP authentication.
 * 
 * @author Sergejs Aleksejevs
 */
public class RESTActivityCredentialsProvider implements CredentialsProvider
{
  private static RESTActivityCredentialsProvider credentialsProvider;
  
  private RESTActivityCredentialsProvider() {
    // making constructor private - nobody can now instantiate this class manually
  }
  
  /**
   * @return The only existing instance of the RESTActivityCredentialsProvider - singleton
   */
  public static RESTActivityCredentialsProvider getInstance()
  {
    if (credentialsProvider == null) {
      synchronized (RESTActivityCredentialsProvider.class) {
        if (credentialsProvider == null) {
          credentialsProvider = new RESTActivityCredentialsProvider();
        }
      }
    }
    return (credentialsProvider);
  }
  
  
  public Credentials getCredentials(AuthScope authscope)
  {
    // TODO - remove print out
    System.out.println(authscope.getHost() + "\n" + authscope.getPort() + "\n" + authscope.getRealm() + "\n" + authscope.getScheme() + "\n\n");
    
    
    String AUTHENTICATION_REQUEST_MSG = "This REST service requires authentication in " + authscope.getRealm();
    
    try {
      CredentialManager credManager = CredentialManager.getInstance();
      UsernamePassword credentials = null;
      
      /*
       * if port is 80 - use HTTP, don't append port
       * if port is 443 - use HTTPS, don't append port
       * any other port - append port + do 2 tests:
       * --- test HTTPS first  has...()
       * --- if not there, do get...() for HTTP (which will save the thing)
       * (save both these entries for HTTP + HTTPS if not there)
       * 
       */
      
      // build the service URI back to front 
      StringBuilder serviceURI = new StringBuilder();
      serviceURI.insert(0, "/#" + URLEncoder.encode(authscope.getRealm(), "UTF-16"));
      if (authscope.getPort() != 80 && authscope.getPort() != 443) {
        // non-default port - add port name to the URI
        serviceURI.insert(0, ":" + authscope.getPort());
      }
      serviceURI.insert(0, authscope.getHost());
      serviceURI.insert(0, "://");
      
      
      // now the URI is complete, apart from the protocol name
      if (authscope.getPort() == 80 || authscope.getPort() == 443)
      {
        // definitely HTTP or HTTPS
        serviceURI.insert(0, (authscope.getPort() == 80 ? "http" : "https"));
        
        // request credentials from CrendentialManager
        credentials = credManager.getUsernameAndPasswordForService(
            URI.create(serviceURI.toString()), true, AUTHENTICATION_REQUEST_MSG);
      }
      else {
        // non-default port - will need to try both HTTP and HTTPS;
        // just check (no pop-up will be shown) if credentials are there - one protocol that
        // matched will be used; if 
        if (credManager.hasUsernamePasswordForService(URI.create("https" + serviceURI.toString()))) {
          credentials = credManager.getUsernameAndPasswordForService(
              URI.create("https" + serviceURI.toString()), true, AUTHENTICATION_REQUEST_MSG);
        }
        else if (credManager.hasUsernamePasswordForService(URI.create("http" + serviceURI.toString()))) {
          credentials = credManager.getUsernameAndPasswordForService(
              URI.create("http" + serviceURI.toString()), true, AUTHENTICATION_REQUEST_MSG);
        }
        else {
          // non of the two options succeeded, request details with a popup for HTTP...
          credentials = credManager.getUsernameAndPasswordForService(
              URI.create("http" + serviceURI.toString()), true, AUTHENTICATION_REQUEST_MSG);
          
          // ...then save a second entry with HTTPS protocol (if the user has chosen to save the credentials)
          if (credentials != null && credentials.isShouldSave()) {
            credManager.saveUsernameAndPasswordForService(credentials, URI.create("https" + serviceURI.toString()));
          }
        }
      }
      
      
      if (credentials != null) {
        System.out.println("credentials obtained");
        return new RESTActivityCredentials(credentials.getUsername(), credentials.getPasswordAsString());
      }
    }
    catch (Exception e) {
      // TODO - enable the "proper" way of logging
//      Logger.getLogger(RESTActivityCredentialsProvider.class).error(
//          "Unexpected error while trying to obtain user's credential from CredentialManager", e);
      System.err.println("Unexpected error while trying to obtain user's credential from CredentialManager\n" + e);
    }
    
    // error or nothing was found
    System.out.println("credentials NOT found");
    return null;
  }
  
  
  public void setCredentials(AuthScope authscope, Credentials credentials) { /* do nothing */ }
  public void clear() { /* do nothing */ }
  
  
  /**
   * This class encapsulates user's credentials that this CredentialsProvider can
   * pass to Apache HttpClient.
   * 
   * @author Sergejs Aleksejevs
   */
  public class RESTActivityCredentials implements Credentials
  {
    // this seems to be the simplest existing implementation of Principal interface
    // TODO - however, check this it is safe to use JMXPrincipal for this purpose
    private final JMXPrincipal user;
    private final String password;

    public RESTActivityCredentials(String username, String password) {
      this.user = new JMXPrincipal(username);
      this.password = password;
    }

    public String getPassword() {
      return password;
    }

    public Principal getUserPrincipal() {
      return user;
    }
    
  }
  

}
