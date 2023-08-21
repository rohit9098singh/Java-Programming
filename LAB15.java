import java.awt.*;
import java.awt.event.*;
public class LAB15  {
    public static void main(String[] args) {
        Frame f=new Frame();
        f.setTitle("button example");
        f.setSize(300,400);
        f.setVisible(true);
        Label l=new Label("Details of the parents");
        l.setFont(new Font("Calibri",Font.BOLD,16));
        Label l1=new Label();
        Label l2=new Label();
        Label l3=new Label();
        l.setBounds(20, 20, 500, 50);
         l1.setBounds(20, 110, 500, 30);
       l2.setBounds (20, 150, 500, 30);
       l3.setBounds(20, 190, 500, 30);
        Button b=new Button("mother");
        b.setBounds (20, 70, 50, 30);
        Button b2=new Button("father");
        b2.setBounds (80, 70, 50, 30);

        b.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
          {
            l1.setText("name="+""+ "sushila");
            l2.setText("designation"+""+"profressor of maths in acharya");
            l3.setText("age:"+""+"45");
          }
        });
        b2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                l1.setText("name ="+""+"ramesha");
                l2.setText("designatio"+""+"house wife");
                l3.setText("age"+""+"34");
            }

        });
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(b);
        f.add(b2);
        f.setLayout(null);
    
    }
    
}
