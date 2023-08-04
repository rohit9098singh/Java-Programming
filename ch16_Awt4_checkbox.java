import java.awt.*;
import java.awt.event.*;

public class ch16_Awt4_checkbox {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple Checkbox Example");
        Checkbox checkbox = new Checkbox("Check me!");

        checkbox.setBounds(100, 100, 150, 30);

        frame.add(checkbox);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        checkbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (checkbox.getState()) {
                    System.out.println("Checkbox is checked.");
                } else {
                    System.out.println("Checkbox is unchecked.");
                }
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
