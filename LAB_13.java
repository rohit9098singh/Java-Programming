import javax.swing.*;
import java.awt.*;

 class MessageDisplay extends JFrame {

    public MessageDisplay() {
                                        
        setTitle("Message Window");//Set the window title
      setSize(300, 200); // Set the size of the window                                
       Panel p = new Panel();// Create a panel to hold the message label
       Label message = new Label("Hello, this is a message!");// Create a label with the message to be displayed
    
       p.add(message);// Add the label to the panel
       
       getContentPane().add(p); // Add the panel to the content pane of the frame
        
       // Set the default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Make the window visible
        setVisible(true);
        

   }
 }    
    public class LAB_13
    {
      public static void main(String[] args) {
        // Create an instance of the MessageDisplay class to display the window
        MessageDisplay d= new MessageDisplay();
    }
    
    }
    /*<Applet code=Myapplet.class width=400 height=500>
</Applet>
*/


