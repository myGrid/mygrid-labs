package net.sf.taverna.biocatalogue.ui;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicSplitPaneUI;


/**
 * This class creates a Swing component that specifically allows display of
 * a single component in a base layer and an overlay that covers part of
 * the main component in the base layer.
 * 
 * @author Sergejs Aleksejevs
 */
public class JPanelWithOverlay extends JLayeredPane implements AWTEventListener
{
  public static final int HORIZONTAL_SPLIT = JSplitPane.HORIZONTAL_SPLIT;
  public static final int VERTICAL_SPLIT = JSplitPane.VERTICAL_SPLIT;
  
  private static final int OVERLAY_SLIDE_TIMER_DELAY = 5;
  private static final int OVERLAY_SLIDE_PIXEL_STEP = 35;  // number of pixels by which the overlay will slide in and out on each timer event
  
  private static final int OVERLAY_FADE_TIMER_DELAY = 6;
  private static final int OVERLAY_FADE_STEP = 2;
  private static final int OVERLAY_TRANSPARENT_LABEL_ALPHA_VALUE = 36;
  
  
  private JPanelWithOverlay thisPanel;
  
  private JComponent mainComponent;                // the main "base" component to be always shown in the background, beneath the overlayComponent 
  private JComponent overlayComponent;             // the component to be shown on top of the "base" mainComponent
  private JPanel overlayPanel;                     // a local wrapper around the overlayComponent - this is to help deal with the multiple nested borders
  private JToggleButton bPin;                      // "pins" and "unpins" the overlay
  private JSplitPane overlaySplitPane;             // allows the overlay to be resizeable - one part will be transparent, the other will shown the overlayPanel
  private int orientation;                         // orientation of the overlaySplitPane (HORIZONTAL_SPLIT / VERTICAL_SPLIT)
  private boolean overlayOnTopOrLeft;              // position of the overlayPanel within the overlaySplitPane - in the left/top or bottom/right part of it, based on orientation
  
  private boolean overlayVisible;                  // local notion of whether the overlay is currently visible; essentially denotes the value of overlaySplitPane.isVisible() 
  private long overlayLastMadeVisible;             // when was the last event of showing the overlay
  
  private int dividerPosition = Integer.MIN_VALUE; // position of the divider in the overlay split pane
  
  JLabel jlDummy;                                  // transparent label to occupy the whole second part of the overlaySplitPane
  
  private Timer timerFadeOut;
  private Timer timerFadeIn;
  private Timer timerSlideIn;
  private Timer timerSlideOut;
  
  private List<JToggleButton> associatedToggleButtons;  // these toggle buttons will be notified of state change (shown/hidden) of the overlay
  
  
  /**
   * @param mainComponent
   * @param overlayComponent
   * @param orientation <code>JSplitPane.HORIZONTAL_SPLIT</code> or <code>JSplitPane.VERTICAL_SPLIT</code>
   * @param overlayOnTopOrLeft
   */
  public JPanelWithOverlay(JComponent mainComponent, JComponent overlayComponent, int orientation, boolean overlayOnTopOrLeft, boolean overlayVisibleOnCreation)
  {
    this.thisPanel = this;
    
    // store provided values
    this.mainComponent = mainComponent;
    this.overlayComponent = overlayComponent;
    this.orientation = orientation;
    this.overlayOnTopOrLeft = overlayOnTopOrLeft;
    
    // initialise local variables
    this.overlayVisible = overlayVisibleOnCreation;
    this.associatedToggleButtons = new ArrayList<JToggleButton>();
    
    // lay out the whole of the UI
    initialiseUI();
    
    // this will finalise any initialisation procedures that can't be done prior to
    // the final layout of the components on the screen
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        if (overlayVisible) setOverlayVisible(true);
      }
    });
  }
  
  
  /**
   * This method initially lays out the components so that the overlay is
   * properly positioned.
   */
  private void initialiseUI()
  {
    bPin = new JToggleButton("pin");
    bPin.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e)
      {
        if (bPin.isSelected()) {
          SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
              Toolkit.getDefaultToolkit().removeAWTEventListener(thisPanel);
              for (JToggleButton toggleButton : associatedToggleButtons) {
                toggleButton.setEnabled(false);
              }
              
              final JSplitPane p = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
              p.setLeftComponent(mainComponent);
              p.setRightComponent(overlayPanel);
              
              SplitPaneUI spui = p.getUI();
              if (spui instanceof BasicSplitPaneUI) {
                ((BasicSplitPaneUI) spui).getDivider().addMouseListener(new MouseAdapter() {
                  public void mouseReleased(MouseEvent e) {
                    dividerPosition = p.getDividerLocation();
                  }
                });
              }
              
              thisPanel.removeAll();
              thisPanel.setLayout(new GridLayout(1,1));
              thisPanel.add(p);
              
              thisPanel.validate();
              thisPanel.repaint();
              
              SwingUtilities.invokeLater(new Runnable() {
                public void run()
                {
                  p.setDividerLocation(dividerPosition);
                }
              });
            }
          });
        }
        else {
          SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
              for (JToggleButton toggleButton : associatedToggleButtons) {
                toggleButton.setEnabled(true);
              }
              
              thisPanel.setOverlayComponent(overlayComponent);
              thisPanel.setOverlayVisible(true);
            }
          });
        }
      }
    });
    
    
    // ensure that the overlay component is non-transparent - it must
    // be visible on top of the main component; also, add a visible border
    // to the component - overlay panel will help to manage multiple nested borders;
    overlayComponent.setOpaque(true);
    overlayComponent.setBorder(BorderFactory.createCompoundBorder(
                                   BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(10073297)),  // #99B4D1 == 10073297  --> the color of overlay border in Eclipse
                                   BorderFactory.createEmptyBorder(2, 2, 2, 2)
                              ));
    
    overlayPanel = new JPanel(new BorderLayout());
    overlayPanel.add(bPin, BorderLayout.NORTH);
    overlayPanel.add(overlayComponent, BorderLayout.CENTER);
    overlayPanel.setBorder(BorderFactory.createCompoundBorder(
                              BorderFactory.createEmptyBorder(0, 5, 0, 5),
                              BorderFactory.createBevelBorder(BevelBorder.RAISED)
                           ));
    
    
    jlDummy = new JLabel();
    jlDummy.setOpaque(true);
    jlDummy.setBackground(new Color(0,0,0,0));    
    
    // in order to make the overlay component resizeable, need to create
    // a SplitPane where one half will be empty and transparent and the other
    // will contain the required overlay component
    overlaySplitPane = new JSplitPane(orientation);
    overlaySplitPane.setOneTouchExpandable(true);
    overlaySplitPane.setContinuousLayout(true);
    overlaySplitPane.setBorder(null);
    overlaySplitPane.setOpaque(false);
    overlaySplitPane.setVisible(false); // set this to invisible (if necessary, constructor will take care of making the overlay appearing shown)
    
    SplitPaneUI spui = overlaySplitPane.getUI();
    if (spui instanceof BasicSplitPaneUI) {
      ((BasicSplitPaneUI) spui).getDivider().addMouseListener(new MouseAdapter() {
        public void mouseReleased(MouseEvent e) {
          dividerPosition = overlaySplitPane.getDividerLocation();
        }
      });
    }
    
    // set the overlay and placeholder components
    setOverlaySplitPaneContentComponent(overlayComponent, true);
    setOverlaySplitPaneContentComponent(jlDummy, false);           // empty transparent label as a placeholder
    
    // put overlay and the main component together into a single component
    this.removeAll();
    this.setLayout(new LayeredPaneLayout());
    this.add(mainComponent, JLayeredPane.DEFAULT_LAYER);
    this.add(overlaySplitPane, JLayeredPane.PALETTE_LAYER);
    
    
    // register this panel to be the listener of all AWT mouse event - this will be used
    // to identify clicks outside of the overlay component and hide the overlay if it is visible
    Toolkit.getDefaultToolkit().addAWTEventListener(this, AWTEvent.MOUSE_EVENT_MASK);
        
    // this means that when window is resized, all extra space goes to the overlay split pane
    // half, which doesn't contain the overlay component itself (e.g. extra space goes to
    // the semi-transparent JLabel component)
    if (overlayOnTopOrLeft) { overlaySplitPane.setResizeWeight(0); }
    else { overlaySplitPane.setResizeWeight(1); }
  }
  
  
  /**
   * Resets overlay component after this panel with overlay was already initialised.
   * 
   * @param overlay New overlay component to replace the old one.
   */
  public void setOverlayComponent(JComponent overlay)
  {
    this.overlayComponent = overlay;
    this.initialiseUI();
    this.validate();
  }
  
  
  /**
   * Allows to placing the overlay component on top/left or bottom/right
   * of the overlay {@link JSplitPane}, based on the chosen orientation.
   * 
   * @param content Component to add to the split pane.
   * @param isOverlayComponent <code>true</code> to indicate that the supplied
   *                           component is the overlay component;<br/>
   *                           <code>false</code> to indicate that the supplied
   *                           component is the placeholder component.
   */
  private void setOverlaySplitPaneContentComponent(JComponent content, boolean isOverlayComponent)
  {
    if (overlayOnTopOrLeft) {
      if (isOverlayComponent) {
        overlaySplitPane.setLeftComponent(overlayPanel);  // overlay component
      }
      else {
        overlaySplitPane.setRightComponent(jlDummy);      // placeholder component
      }
    }
    else {
      if (isOverlayComponent) {
        overlaySplitPane.setRightComponent(overlayPanel); // overlay component
      }
      else {
        overlaySplitPane.setLeftComponent(jlDummy);       // placeholder component
      }
    }
  }
  
  
  /**
   * This method allows to show and hide the overlay.
   */
  public void setOverlayVisible(boolean showOverlay) {
    if (showOverlay) {
      // set the initial position of the divider in the overlay split pane --
      // only do this the first time the overlay is to be shown 
      if (this.dividerPosition == Integer.MIN_VALUE) {
        this.dividerPosition = overlaySplitPane.getSize().width - overlayComponent.getPreferredSize().width;
        overlaySplitPane.setDividerLocation(this.dividerPosition);
      }
      
      // remember the last time when the overlay was made visible -- this is used to
      // ignore clicks anywhere within a certain (small) time range from the recorded point,
      // so that no clicks would make the overlay disappear immediately after it was shown
      overlayLastMadeVisible = System.currentTimeMillis();
      
      overlayVisible = true;
      overlaySplitPane.setVisible(true);
      
      timerFadeOut = new Timer(OVERLAY_FADE_TIMER_DELAY, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (jlDummy.getBackground().getAlpha() < OVERLAY_TRANSPARENT_LABEL_ALPHA_VALUE) {
            jlDummy.setBackground(new Color(0,0,0,jlDummy.getBackground().getAlpha() + OVERLAY_FADE_STEP));
            overlaySplitPane.repaint();
          }
          else {
            timerFadeOut.stop();
            
            // notify all associated toggle buttons
            for (JToggleButton button : associatedToggleButtons) {
              button.setSelected(overlayVisible);
            }
          }
        }
      });
      if (timerFadeIn != null && timerFadeIn.isRunning()) timerFadeIn.stop();
      timerFadeOut.start();
      
      
      overlaySplitPane.setDividerLocation(1.0);
      timerSlideIn = new Timer(OVERLAY_SLIDE_TIMER_DELAY, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (overlaySplitPane.getDividerLocation() > dividerPosition) {  // TODO: this only works with overlay component being on the right of overlay split pane
            int iNewDividerPosition = overlaySplitPane.getDividerLocation() - OVERLAY_SLIDE_PIXEL_STEP;
            if (iNewDividerPosition < dividerPosition) iNewDividerPosition = dividerPosition; // TODO -- same as above
            overlaySplitPane.setDividerLocation(iNewDividerPosition);
            overlaySplitPane.repaint();
          }
          else {
            timerSlideIn.stop();
          }
        }
      });
      if (timerSlideOut != null && timerSlideOut.isRunning()) timerSlideOut.stop();
      timerSlideIn.start();
    }
    else {
      overlayVisible = false;
      
      timerFadeIn = new Timer(OVERLAY_FADE_TIMER_DELAY, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (jlDummy.getBackground().getAlpha() > 0) {
            jlDummy.setBackground(new Color(0,0,0,jlDummy.getBackground().getAlpha() - OVERLAY_FADE_STEP));
            overlaySplitPane.repaint();
          }
          else {
            timerFadeIn.stop();
            overlaySplitPane.setVisible(false);
            
            // notify all associated toggle buttons
            for (JToggleButton button : associatedToggleButtons) {
              button.setSelected(overlayVisible);
            }
          }
        }
      });
      if (timerFadeOut != null && timerFadeOut.isRunning()) timerFadeOut.stop();
      timerFadeIn.start();
      
      
      // store the divider position, so that it will be restored the next time overlay is invoked
      this.dividerPosition = overlaySplitPane.getDividerLocation();
      timerSlideOut = new Timer(OVERLAY_SLIDE_TIMER_DELAY, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          if (overlaySplitPane.getDividerLocation() < overlaySplitPane.getSize().getWidth()) {
            overlaySplitPane.setDividerLocation(overlaySplitPane.getDividerLocation() + OVERLAY_SLIDE_PIXEL_STEP);
            overlaySplitPane.repaint();
          }
          else {
            timerSlideOut.stop();
          }
        }
      });
      if (timerSlideIn != null && timerSlideIn.isRunning()) timerSlideIn.stop();
      timerSlideOut.start();
    }
  }
  
  
  /**
   * This method will register any toggle button that is designated to showing
   * the overlay. This is to make sure that when the overlay gets hidden by
   * a click outside of the overlay area, the toggle button also changes the
   * state accordingly.
   * 
   * @param button The toggle button to register.
   */
  public void registerOverlayActivationToggleButton(JToggleButton button)
  {
    this.associatedToggleButtons.add(button);
  }
  
  
  /**
   * @return True if the overlay is currently visible.
   */
  public boolean isOverlayVisible() {
    return (this.overlayVisible);
  }
  
  
  /**
   * A very simple Layout Manager that makes both main and overlay SplitPane
   * to take the whole area of the container.
   * 
   * @author Sergejs Aleksejevs
   */
  public class LayeredPaneLayout implements LayoutManager
  {
    public LayeredPaneLayout() {
      // empty constructor
    }
    
    /**
     * This method simply makes both components to occupy the whole of
     * the area of the container.
     */
    public void layoutContainer(Container target) {
      mainComponent.setSize(target.getSize());
      overlaySplitPane.setSize(target.getSize());
    }
    
    public Dimension minimumLayoutSize(Container target) {
      return (mainComponent.getMinimumSize());
    }
    
    public Dimension preferredLayoutSize(Container target) {
      return (mainComponent.getPreferredSize());
    }
    
    // NOT USED
    public void addLayoutComponent(String arg0, Component arg1) {
    }
    
    public void removeLayoutComponent(Component arg0) {
    }
  }
  
  
  // *** Callback for AWTEventListener interface ***
  
  /**
   * This method is responsible for hiding the overlay if a click was made outside
   * of the overlay component.
   * 
   * Note: to make sure that dragging divider of the split pane doesn't
   * trigger action in this listener, the split pane should have a 
   * continuous layout.
   */
  public void eventDispatched(AWTEvent e)
  {
    // we only deal with mouse events here
    if (e instanceof MouseEvent)
    {
      // first convert generic AWTEvent to a MouseEvent,
      // this provides more event details to work with
      MouseEvent event = (MouseEvent)e;
      
      // only proceed if the overlay was visible and a mouse click was made
      // (i.e. we don't care about simple mouse movements); also, make sure that
      // we don't process a click on the toggle button which actually made the overlay
      // visible - hence some minor delay should have passed since the last display of overlay
      if (overlayVisible && event.getClickCount() > 0 && (event.getWhen() - overlayLastMadeVisible) > 100) {
        // convert a point where mouse click was made from relative coordinates of the source component
        // to the coordinates of the overlaySplitPane
        Point clickRelativeToOverlay = SwingUtilities.convertPoint((Component)event.getSource(), event.getPoint(), overlaySplitPane);
        
        // next - calculate the total area of the overlay component on one side of the
        // divider plus the divider itself
        Area areaOfOverlayComponentPlusDivider = new Area(overlaySplitPane.getBounds());
        areaOfOverlayComponentPlusDivider.subtract(new Area(jlDummy.getBounds()));
        
        // only hide the overlay if a click was made outside of the calculated area --
        // plus not on one of the associated toggle buttons
        if (!areaOfOverlayComponentPlusDivider.getBounds().contains(clickRelativeToOverlay) &&
            !associatedToggleButtons.contains(event.getSource()))
        {
          this.setOverlayVisible(false);
        }
      }
    }
  }
  
}


