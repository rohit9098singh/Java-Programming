import java.awt.*;
import java.awt.event.*;
class checkboxdemo extends Frame
{
    checkboxdemo()
    {
      setTitle("check box programme");
      setSize(300,400);
      setVisible(true);
      Checkbox c=new Checkbox();
      CheckboxGroup cb=new CheckboxGroup();
      Checkbox c2=new Checkbox("option",cb,true);
      Checkbox c3=new Checkbox("java",cb,true);
       Checkbox c5=new Checkbox("ds",cb,true);
      Checkbox c4=new Checkbox("pst",cb,true);
      setLayout(null);
       // c.setBounds(50, 50, 100, 30);
        c2.setBounds(50, 100, 100, 30);
        c3.setBounds(50, 150, 100, 30);
        c4.setBounds(50, 200, 100, 30);
        c5.setBounds(50,50,100,30);
        add(c);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
         
         ItemListener itemListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Checkbox checkbox = (Checkbox) e.getSource();
                String checkboxLabel = checkbox.getLabel();
                if (checkbox.getState()) {
                    System.out.println(checkboxLabel + " Checkbox selected");
                } else {
                    System.out.println(checkboxLabel + " Checkbox deselected");
                }
            }
        };

        c2.addItemListener(itemListener);
        c3.addItemListener(itemListener);
        c4.addItemListener(itemListener);
        c5.addItemListener(itemListener);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

public class ch16_AWT_8_combobox{
    public static void main(String[] args) {
        checkboxdemo d = new checkboxdemo();
    }
}

