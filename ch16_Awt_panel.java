import java.awt.*;
public class ch16_Awt_panel {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("panel example");
        Panel p=new Panel();
        Label l=new Label("hello awt");
        Panel p2=new Panel(null);
        Label l2=new Label("bye bye");
        p2.add(l2);
        p.add(l);
        f.add(p);
        f.setVisible(true);
        f.setSize(300,400 );
        f.setLayout(null);
      

    }
    
}
