import javax.swing.*;
class radiobuttonex extends JFrame
{
    radiobuttonex()
    {
      setTitle("RADIO BUTTON PAGE");
      setSize(300,400);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);

      JRadioButton b=new JRadioButton("java");
      JRadioButton c=new JRadioButton("english");
      JRadioButton d=new JRadioButton("math");
      JRadioButton e=new JRadioButton("geography");
      JRadioButton f=new JRadioButton("hindi");

      ButtonGroup g=new ButtonGroup();
      g.add(b);
      g.add(c);
      g.add(d);
      g.add(e);
      g.add(f);

      JPanel p=new JPanel();
      p.add(b);
      p.add(c);
      p.add(d);
      p.add(e);
      p.add(f);

      add(p);
   }
}
public class ch16_7_swing_radiobutton {
    public static void main(String[] args) {
        radiobuttonex b=new radiobuttonex();
        
    }
    
}
