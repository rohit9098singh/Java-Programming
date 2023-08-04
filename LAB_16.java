import java .awt.*;
 class MenuDemo
{
MenuDemo()
{
Frame fr=new Frame("Menu Demo");
MenuBar mb=new MenuBar();
MenuItem fileMenu=new MenuItem("New");
MenuItem editMenu=new MenuItem("Edit");
MenuItem viewMenu=new MenuItem("View");
mb.add(fileMenu);
mb.add(editMenu);
mb.add(viewMenu);
MenuItem a1=new MenuItem("New");
MenuItem a2=new MenuItem("Open");
MenuItem a3=new MenuItem("Save");
MenuItem b2=new MenuItem("copy");
MenuItem c1=new MenuItem("Find");
MenuItem z1 =new MenuItem("Show");
fileMenu.add(a1);

fileMenu.add(a2);
fileMenu.add(a3);
fileMenu.add(b2);
fileMenu.add(c1);
fileMenu.add(z1);
fr.setMenuBar(mb);
fr.setSize(200,200);
fr.setLayout(null);
fr.setVisible(true);
}
}
public class LAB_16 {
Public static void main(String agrs[])
{
  MenuDemo d=New MenuDemo();
}
}

