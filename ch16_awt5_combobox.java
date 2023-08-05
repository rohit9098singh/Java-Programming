import java.awt.*;
import java.awt.event.*;;
class combobox_example
{
    combobox_example()
    {
        Frame f=new Frame();
        Choice c=new Choice();
        c.setBounds(50, 50, 200, 30);
        c.add("java");
        c.add("Dbms");
        c.add("math");
        f.add(c);
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
public class ch16_AWT5_combobox {
    public static void main(String[] args) {
        combobox_example e=new combobox_example();
        
    }
    
}
