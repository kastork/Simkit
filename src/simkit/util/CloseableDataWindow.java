package simkit.util;
/**
 *  A simple class for displaying windows.  As each one is created, a counter is incremented;
 *  as each is closed, the counter is decremented.  When the counter reaches zero the
 *  application is closed.
**/
import java.awt.*;
import java.awt.event.*;

public class CloseableDataWindow extends Frame {
   private static int numberWindows = 0;
   public CloseableDataWindow(String title) {
      super(title);
      numberWindows++;
      addWindowListener( 
         new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                closeWindow();
            }
         } );
   }
/**
 *  Close the window and decrement the counter, exiting the application if it reaches zero.
 *  The dispose() statement is important because it releases native graphics resources.
**/
   public void closeWindow() {
      numberWindows--;
      dispose();
      if (numberWindows == 0) {
          System.exit(0);               
      }
   }
}