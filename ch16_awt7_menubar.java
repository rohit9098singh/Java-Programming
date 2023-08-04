/*menubar--> se whole box banta hai; 
 * menu--> se table name;
 * menuItem--->se menu ke andar ka content 
*/
import java.awt.*;
import java.awt.event.*;
class yourmenuexample
{
    yourmenuexample()
    {
        Frame p=new Frame("more");
       MenuBar b=new MenuBar();
       Menu fileMenu=new Menu();
       Menu edit=new Menu();
       Menu view=new Menu();
       MenuItem a=new MenuItem("view");
        MenuItem i=new MenuItem("open");
         MenuItem c=new MenuItem("save");
          MenuItem d=new MenuItem("cut");
           MenuItem f=new MenuItem("show");
           fileMenu.add(a);
           fileMenu.add(i);
           edit.add(c);
           edit.add(d);
           view.add(f);
           p.setMenuBar(b);
           p.setSize(300,400);
        p.setVisible(true);
       // p.setLayout(null);
        p.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });


       
    }
}
public class ch16_awt7_menubar {
    public static void main(String[] args) {
        yourmenuexample u=new yourmenuexample();
    }
    
}
