package net.sf.taverna.t2.activities.rest;

import java.net.URI;
import java.security.Principal;

import javax.management.remote.JMXPrincipal;

import net.sf.taverna.t2.security.credentialmanager.CredentialManager;
import net.sf.taverna.t2.security.credentialmanager.UsernamePassword;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.springframework.core.type.StandardClassMetadata;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class RESTActivityCredentialsProvider implements CredentialsProvider
{

  public void clear() {
    // TODO Auto-generated method stub

  }

  public Credentials getCredentials(AuthScope authscope)
  {
    System.out.println(authscope.getHost() + "\n" + authscope.getPort() + "\n" + authscope.getRealm() + "\n" + authscope.getScheme() + "\n\n");
    
    try {
      CredentialManager credManager = CredentialManager.getInstance();
      
      
      /*
       * Append REALM - always
       * 
       * if port is 80 - use HTTP, don't append port
       * if port is 443 - use HTTPS, don't append port
       * any other port - append port + do 2 tests:
       * --- test HTTPS first  has...()
       * --- if not there, do get...() for HTTP (which will save the thing)
       * 
       * 
       */
      UsernamePassword credentials = credManager.getUsernameAndPasswordForService(
          URI.create("http://" + authscope.getHost()+ ":" + authscope.getPort() + "/#" + authscope.getRealm()), true, "This REST service requires authentication + REALM");  // TODO - HACK!!! (can't just add HTTP)
      System.out.println(credentials.getUsername() + " - " + credentials.getPasswordAsString());
      
      if (credentials != null) {
        return new RESTActivityCredentials(credentials.getUsername(), credentials.getPasswordAsString());
      }
    }
    catch (Exception e) {
      System.err.println(e);
    }
    
    // error or nothing was found
    return null;
  }

  public void setCredentials(AuthScope authscope, Credentials credentials) {
    // TODO Auto-generated method stub
  }
  
  
  
  /**
   * 
   * @author Sergejs Aleksejevs
   */
  public class RESTActivityCredentials implements Credentials
  {
    private final JMXPrincipal user;
    private final String password;

    public RESTActivityCredentials(String username, String password) {
      this.user = new JMXPrincipal(username); // TODO - check this is safe to do? unknown class
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
