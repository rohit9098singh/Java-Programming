import java.awt.*;
import java.awt.event.*;

class ListExample {
    ListExample() {
        Frame k = new Frame();
        List l = new List();
        l.add("java");
        l.add("math");
        l.add("java");
        l.add("geo");
        l.add("math");
        l.add("hindi");
    
        k.setLayout(null); // Using absolute layout
        l.setBounds(100, 100, 100, 100); // Set position and size of the List
        
        k.add(l); // Adding the List to the Frame
        
        k.setSize(300, 400);
        k.setVisible(true);
        
        k.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class ch16_AWT6_AwtListExample{
    public static void main(String[] args) {
        ListExample m = new ListExample();
    }
}
