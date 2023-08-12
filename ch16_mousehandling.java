import java.awt.*;
import java.awt.event.*;
public class ch16_mousehandling implements MouseListener
{
Label l1,l2;
Frame fr;
ch16_mousehandling()
{
fr = new Frame("Java Mouse Listener Example");
l1 = new Label("Demo for the Mouse Event", Label.CENTER);
l2 = new Label();
fr.setLayout(new FlowLayout());
fr.add(l1);
fr.add(l2);
fr.addMouseListener(this);
fr.setSize(250, 250);
fr.setVisible(true);
}
public void mouseClicked(MouseEvent ev)
{
l2.setText("Mouse Button Clicked");
fr.setVisible(true);
}
public void mouseEntered(MouseEvent ev)
{
l2.setText("Mouse has entered the area of window");
fr.setVisible(true);
}
public void mouseExited(MouseEvent ev)
{
l2.setText("Mouse has left the area of window");
fr.setVisible(true);
}
public void mousePressed(MouseEvent ev)
{
l2.setText("Mouse button is being pressed");
fr.setVisible(true);
}
public void mouseReleased(MouseEvent ev)
{
l2.setText(" Mouse Released");
fr.setVisible(true);
}
public static void main(String args[])
{
new ch16_mousehandling();
}
}