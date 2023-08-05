import java.awt.*;

public class ch16_AWT10_gridlayout {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example");
        
        Label button1 = new Label("North");
        Button button2 = new Button("South");
        Button button3 = new Button("East");
        Button button4 = new Button("West");
        Button button5 = new Button("Center");
        
        frame.setLayout(new BorderLayout());
        
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);
        
        frame.setSize(300, 150);
        frame.setVisible(true);
    }
}
