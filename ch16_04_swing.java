import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class studentpanel extends JFrame {
    studentpanel() {
        setTitle("cromepage");
        setSize(400, 400);
        setMinimumSize(new Dimension(300, 400));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());//helps to keep all the labels at proper place

        // Creating the panel for student details
        Panel studentPanel = new Panel();
        studentPanel.setLayout(new GridLayout(4, 2));//exception can be used not be used

        Label nameLabel = new Label("Name:");
        TextField nameField = new TextField();
        Label classLabel = new Label("Class:");
        TextField classField = new TextField();
        Label rollNoLabel = new Label("Roll No:");
        TextField rollNoField = new TextField();
        Label subjectLabel = new Label("Subject:");
        TextField subjectField = new TextField();

        studentPanel.add(nameLabel);
        studentPanel.add(nameField);
        studentPanel.add(classLabel);
        studentPanel.add(classField);
        studentPanel.add(rollNoLabel);
        studentPanel.add(rollNoField);
        studentPanel.add(subjectLabel);
        studentPanel.add(subjectField);

        // Creating the enter button
        JButton enterButton = new JButton("Enter");

        enterButton.addActionListener(new ActionListener() {/*By combining these two parts together, addActionListener(new ActionListener()),
             you are creating an anonymous inner class instance of the ActionListener interface and passing it as an argument to the
              addActionListener() method. This allows you to define the ActionListener's behavior inline, without having to create
               a separate class to implement the ActionListener interface. */
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String className = classField.getText();
                String rollNo = rollNoField.getText();
                String subject = subjectField.getText();

                // Perform any desired operations with the entered student details here
                
                // Displaying the entered details
                /*System.out.println("Name: " + name);
                System.out.println("Class: " + className);
                System.out.println("Roll No: " + rollNo);
                System.out.println("Subject: " + subject);*/
                String message = "Name: " + name + "\nClass: " + className + "\nRoll No: " + rollNo + "\nSubject: " + subject;
               JOptionPane.showMessageDialog(null,message, "Entered Details", JOptionPane.INFORMATION_MESSAGE);/*JOptionPane.ERROR_MESSAGE);
                JOptionPane.INFORMATION_MESSAGE //can be any thing as per our choice apart from this 
                JOptionPane.WARNING_MESSAGE 
                JOptionPane.QUESTION_MESSAGE
                 JOptionPane.PLAIN_MESSAGE); */  
            }
        });

        add(studentPanel);
        add(enterButton);

        // Setting the layout constraints
         GridBagConstraints gbc = new GridBagConstraints();/*Since gridx and gridy specify the row and column position, 
         respectively, in the grid, you can use different values (e.g., 1, 2, 3, etc.) 
         to position the components in different rows and columns. 
         The GridBagLayout allows you to create complex layouts by placing components in specific cells of the grid,
          and you can adjust gridx and gridy accordingly to achieve the desired layout. */
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        add(studentPanel, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(enterButton, gbc);
    }
}

public class ch16_04_swing {
    public static void main(String[] args) {
        studentpanel pan = new studentpanel();
    }
}
