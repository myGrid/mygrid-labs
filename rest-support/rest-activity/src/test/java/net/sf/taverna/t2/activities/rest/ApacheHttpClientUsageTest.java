package net.sf.taverna.t2.activities.rest;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class ApacheHttpClientUsageTest extends JFrame implements ActionListener
{
  private JComboBox cbHttpMethod;
  private JTextField tfAddressBar;
  private JButton bGo;
  private JTextArea taResponse;
  private JScrollPane spResponse;
  
  
  public ApacheHttpClientUsageTest()
  {
    Container contentPane = this.getContentPane();
    contentPane.setLayout(new BorderLayout(5,5));
    
    bGo = new JButton("GO!");
    bGo.addActionListener(this);
    bGo.setDefaultCapable(true);
    this.getRootPane().setDefaultButton(bGo);
    
    tfAddressBar = new JTextField(50);
    tfAddressBar.setPreferredSize(new Dimension(0,bGo.getPreferredSize().height));
    tfAddressBar.setText("http://www.biocatalogue.org/");
    
    JPanel jpAddressBar = new JPanel();
    jpAddressBar.add(tfAddressBar);
    jpAddressBar.add(bGo);
    
    cbHttpMethod = new JComboBox(RESTActivity.HTTP_METHOD.values());
    cbHttpMethod.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(5, 5, 5, 5),
        cbHttpMethod.getBorder()));
    
    JPanel jpAllNavigation = new JPanel(new BorderLayout());
    jpAllNavigation.add(jpAddressBar, BorderLayout.NORTH);
    jpAllNavigation.add(cbHttpMethod, BorderLayout.CENTER);
    
    contentPane.add(jpAllNavigation, BorderLayout.NORTH);
    
    taResponse = new JTextArea(20, 20);
    taResponse.setEditable(true);
    
    spResponse = new JScrollPane(taResponse);
    spResponse.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createEmptyBorder(0, 5, 5, 5),
        BorderFactory.createEtchedBorder()));
    contentPane.add(spResponse, BorderLayout.CENTER);
    
    this.pack();
    this.setLocationRelativeTo(null); // center on screen
  }
  
  
  public void actionPerformed(ActionEvent e)
  {
    if (e.getSource().equals(bGo))
    {
      try {
        StringBuilder responseStr = new StringBuilder();
        // ---------------------------------------------
        
        HttpClient httpClient = new DefaultHttpClient();
        HttpContext localContext = new BasicHttpContext();
        HttpGet httpGet = new HttpGet(tfAddressBar.getText());
        httpGet.addHeader("Accept", "application/xml");
        
        HttpResponse response = httpClient.execute(httpGet, localContext);
        // ---
        // TRACK WHERE THE FINAL REDIRECT ENDS UP - target host + URI
        HttpHost target = (HttpHost) localContext.getAttribute(ExecutionContext.HTTP_TARGET_HOST);
        HttpUriRequest req = (HttpUriRequest) localContext.getAttribute(ExecutionContext.HTTP_REQUEST);

        responseStr.append("Final request URI: " + target + req.getURI() + "\n");
//        System.out.println("Target host: " + target);
//        System.out.println("Final request URI: " + req.getURI());
//        System.out.println("Final request method: " + req.getMethod());
        // ---
        responseStr.append(response.getStatusLine() + "\n");
        
        HttpEntity entity = response.getEntity();
        responseStr.append(entity.getContentType() + "\n\n");
        
        if (entity != null) {
          InputStream in = entity.getContent();
          BufferedReader reader = new BufferedReader(new InputStreamReader(in));
          
          String str;
          while ((str = reader.readLine()) != null) {
            responseStr.append(str + "\n");
          }
          
          taResponse.setText(responseStr.toString());
          taResponse.setCaretPosition(0);
        }
        
        httpClient.getConnectionManager().shutdown();
      }
      catch (Exception ex) {
        taResponse.setText(ex.getMessage() + "\n\n" + ex.getStackTrace());
      }
    }
  }
  
  
  public static void main(String[] args)
  {
    ApacheHttpClientUsageTest frame = new ApacheHttpClientUsageTest();
    frame.setVisible(true);
    frame.tfAddressBar.setCaretPosition(frame.tfAddressBar.getText().length());
  }
  
}
