/*menubar--> se whole box banta hai; 
 * menu--> se table name;
 * menuItem--->se menu ke andar ka content 
*/
/*import java.awt.*;
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
    
}*/
import java.awt.*;
import java.awt.event.*;

class YourMenuExample {
    YourMenuExample() {
        Frame p = new Frame("More");

        MenuBar b = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");

        MenuItem a = new MenuItem("View");
        MenuItem i = new MenuItem("Open");
        MenuItem c = new MenuItem("Save");
        MenuItem d = new MenuItem("Cut");
        MenuItem f = new MenuItem("Show");

        fileMenu.add(i);
        edit.add(c);
        edit.add(d);
        view.add(a);
        view.add(f);

        b.add(fileMenu);
        b.add(edit);
        b.add(view);

        p.setMenuBar(b);/*So, the p.setMenuBar(b); line in the code is like telling the computer, "Hey, put
         the names of the differentcategories (menus) at the top of the window, and when someone clicks on
          a category, show them the options (menu items) related to that category."
         In simple words, it's like showing the names of different toy categories on 
         the top, and when you click on a category, you get to see the toys in that category. */
        p.setSize(300, 400);
        p.setVisible(true);
        p.setLayout(null); // Using null layout
        
        p.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class ch16_AWT7_menubar {
    public static void main(String[] args) {
        YourMenuExample u = new YourMenuExample();
    }
}

