package net.sf.taverna.biocatalogue.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.sf.taverna.biocatalogue.model.BioCatalogueClient;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponent;
import net.sf.taverna.t2.ui.perspectives.biocatalogue.MainComponentFactory;
import net.sf.taverna.t2.workbench.MainWindow;

import org.apache.log4j.Logger;

/**
 * 
 * @author Sergejs Aleksejevs
 */
public class TagSelectionDialog extends JDialog
{
  
  private MainComponent pluginPerspectiveMainComponent;
  private BioCatalogueClient client;
  private Logger logger;
  
  private TagCloudPanel tagCloudPanel;
  
  
  
  public TagSelectionDialog(MainComponent pluginPerspectiveMainComponent, BioCatalogueClient client, Logger logger)
  {
    super(MainWindow.getMainWindow());
    
    this.pluginPerspectiveMainComponent = pluginPerspectiveMainComponent;
    this.client = client;
    this.logger = logger;
    
    this.setLayout(new GridLayout(1,1));
    
    tagCloudPanel = new TagCloudPanel("Tag Cloud", TagCloudPanel.TAGCLOUD_TYPE_GENERAL, 
        TagCloudPanel.TAGCLOUD_MULTIPLE_SELECTION, new ActionListener() {
                                                      public void actionPerformed(ActionEvent e) {
                                                        System.out.println(tagCloudPanel.getCurrentlySelectedTagFullNames());
                                                      }
                                                    },
        pluginPerspectiveMainComponent, client, logger);
    this.add(tagCloudPanel);
    
    
    this.setSize(new Dimension(800,600));
    this.setLocationRelativeTo(null);
    
    
    
    initialiseData();
  }


  private void initialiseData()
  {
    tagCloudPanel.refresh();
  }
}
