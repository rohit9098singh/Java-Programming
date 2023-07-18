import java.awt.*;

import javax.swing.JFrame;
class dframe extends JFrame{
    dframe()
    {
    Button b=new Button("submit");
    add(b);
    setSize(400,400);
    setTitle("my frame");
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
public class ch16_3_swing {
    public static void main(String[] args) {
        dframe d=new dframe();
    }
    
}
