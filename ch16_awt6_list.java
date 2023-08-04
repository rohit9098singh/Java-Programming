import java.awt.*;
import java.awt.event.*;
class listexample{
    listexample()
    {
        Frame k=new Frame();
        List l=new List();
        l.add("java");
        l.add("math");
        l.add("java");
        l.add("geo");
        l.add("math");
        l.add("hindi");
         k.setSize(300,400);
        k.setVisible(true);
        k.setLayout(null);
        k.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }



    }
public class ch16_awt6_list {
    listexample m=new listexample();
    
}
