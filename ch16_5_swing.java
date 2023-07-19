import javax.swing.JFrame;

import java.awt.*;
import javax.swing.*;
class textwritingswing extends JFrame{
    textwritingswing()
    {
    /*SETTING LAYOUT */
    setLayout(new FlowLayout());
    /*Creating fields */
    
    } 

}
public class ch16_5_swing {
    public static void main(String[] args) {
        textwritingswing t=new textwritingswing();
        t.setTitle("cromepage");
        t.setSize(400,400);
        t.setMinimumSize(new Dimension(300, 400));
        t.setVisible(true);
        t.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }
    
}
