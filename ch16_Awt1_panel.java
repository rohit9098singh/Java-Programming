import java.awt.*;
import java.awt.event.*;
public class ch16_Awt1_panel {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("panel example");
        
        Panel p=new Panel();
        p.setBounds(50, 300, 400, 200);
        Label l=new Label("hello awt");
         p.add(l);
        f.add(p);
         
        Panel p2=new Panel(null);
         p2.setBounds(50, 50, 400, 200);
        Label l2=new Label("bye bye");
        p2.add(l2);
        f.add(p2);
       
        f.setVisible(true);
        f.setSize(500,600 );
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
      

    }
    
}
