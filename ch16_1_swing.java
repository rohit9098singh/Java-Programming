import javax.swing.JFrame;
import javax.swing.WindowConstants;

import java.awt.*;
class myswing extends JFrame{
    myswing()
    {
        
        setTitle("welcome");
        setSize(400,400);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
public class ch16_1_swing
{
    public static void main(String[] args) {
        myswing s=new myswing();
    }
}