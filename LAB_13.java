import java.awt.*;
class framedemo {
    framedemo()
    {
        Frame f=new Frame();
        f.setTitle("first gui programme");
       // Panel p=new Panel();
        Label l=new Label("welcome to gui interface happy to see u here dear");
        f.setBounds(50,75,350,50);
        f.add(l);
       f. setVisible(true);
        f.setSize(300,300);
        f.setLayout(null);
    }
}
public class LAB_13 {
    public static void main(String[] args) {
     framedemo d=new framedemo();   
    }
}
