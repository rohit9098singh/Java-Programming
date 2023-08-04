import java.awt.*;
public class ch16_AWT3 {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("textfied");
        TextField t=new TextField();
        t.setBounds(100,100,100,30);
        f.add(t);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(300,400);
        
    }
    
}
