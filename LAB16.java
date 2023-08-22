import java.awt.*;
import java.awt.event.*;
public class LAB16 {
    public static void main(String[] args) {
        Frame f=new Frame("DETAIL PANNEL");
        Label l=new Label("my personal details example");
        l.setFont(new Font("calibri",Font.BOLD,16));
        Label l1=new Label();
        Label l2=new Label();
        Label l3=new Label();
        Label l4=new Label();
        l.setBounds(250,30,600,50);
       l1.setBounds(20,120,600,30);
       l2.setBounds(20,160,600,30);
       l3.setBounds(20,200,600,30);
       l4.setBounds(20,240,600,30);
       Button b=new Button("MY DETAILS");
       b.setBounds(210,70,320,30);
       b.setFont(new Font("calibri",Font.BOLD,16));
       b.addActionListener(new ActionListener()
       {
        public void actionPerformed(ActionEvent e)
        {
            l1.setText("NAME"+""+"RAHUL KUMAR SINGH");
            l2.setText("FATHERS NAME="+""+"RAMESH"+""+"MOTHER NAME"+""+"SUSHILA");
            l3.setText("COLLEGE NAME"+""+"ACHARYA INSTITUTE OF GRADUATE STUDIES"+"AUID"+"AGS22ABCA030"+""+"SECTION"+""+"C");
            l4.setText("ADDRESS:"+""+"SOLADEVANAHALLI NEAR POLICE STATION"+""+"CONTACT NO"+""+"9572439721");
        }

       });
    f.add(l1);
    f.add(l2);
    f.add(l3);
    f.add(l4);
    f.setSize(300,400);
    f.setVisible(true);
    f.setLayout(null);

    }
    
}
