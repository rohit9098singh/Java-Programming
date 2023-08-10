import java.applet.*;
import java.awt.*;
public class ch16_appletcycle extends Applet{

    public void init()
    {
        System.out.println("initializing the applet");
    }
    public void start()
    {
        System.out.println("starting the applet");
    }
    public void paint(Graphics g)
    {
        g.drawString("hello",20,30);
        System.out.println("painting the applet");
    }
    public void stop()
    {
        System.out.println("stopping the applet");
    }
    public void display()
    {
        System.out.println("destroying the applet");
    }
    public static void main(String[] args) {
         ch16_appletcycle a=new ch16_appletcycle();
         a.init();
         a.start();
        // a.paint(Applet.getGraphics());//(Applet.getGraphics());
         a.stop();
         a.destroy();
    }
}

