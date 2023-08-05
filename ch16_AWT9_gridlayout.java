import java.awt.*;
import java.awt.event.*;

public class ch16_AWT9_gridlayout  {

    public static void main(String[] args) {
        Frame frame = new Frame("Grid Layout Example");
        frame.setLayout(new GridLayout(4, 4));
        
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");
        Button button7 = new Button("Button 7");
        
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        
        frame.setSize(300, 200);
        frame.setVisible(true);


        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
        });
}
}

