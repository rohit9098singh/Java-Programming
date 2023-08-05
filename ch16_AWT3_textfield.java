import java.awt.*;
import java.awt.event.*;
public class ch16_AWT3_textfield {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("textfied");

        TextField t=new TextField();
        t.setBounds(50, 50, 200, 30);
        f.add(t);

        f.setVisible(true);
        f.setLayout(null);
        f.setSize(300,400);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
    }
    
}
