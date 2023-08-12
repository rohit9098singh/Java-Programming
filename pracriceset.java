import javax.swing.*;
import java.awt.event.*;

public class pracriceset {
    public static void main(String[] args) {
        JFrame f = new JFrame("button event");
        JButton b = new JButton("click me");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showInputDialog(f, "button clicked", 0);
               System.out.println("button clicked");
            }
        });
        f.add(b);
        f.setSize(300, 400);
        f.setVisible(true);
    }
}
