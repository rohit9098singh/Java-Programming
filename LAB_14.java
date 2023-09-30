import java.awt.*;
//import javax.swing.*;
 class Drawings extends Canvas
{
public void paint(Graphics g)
{
g.drawRect(100,85,200,250);
g.fillRect(150,275,100,150);
g.drawRoundRect(25,141,100,50,15,15);
g.fillRoundRect(50,150,100,50,15,15);
g.drawOval(50,275,100,50);
g.fillOval(50,275,100,50);
g.drawArc(20,350,100,50,25,75);
g.fillArc(20,350,100,50,25,75);
}
public static void main (String args[]){
Drawings m=new Drawings();
Frame f=new Frame("shapes");
f.add(m);
f.setSize(700,500);
f.setVisible(true);
}
}
 