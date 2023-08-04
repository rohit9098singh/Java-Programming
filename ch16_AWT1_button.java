import java.awt.*;
import java.awt.event.*;
public class ch16_AWT1_button {
    public static void main(String[] args) {
        Frame f=new Frame("button");
        Button b=new Button("click me ");
        b.setBounds(100,100,100,50);
        b.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            System.out.println("button clicked");
          }
        }); 
        f.add(b);
        f.setSize(300,400);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        } ); 
    }
    
}
