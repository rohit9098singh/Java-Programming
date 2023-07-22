import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class pannelexyz extends JFrame {
    pannelexyz() {
        setTitle("cromepage");
        setSize(400, 400);
        setMinimumSize(new Dimension(300, 400));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());

        // Creating the panel for student details
        Panel studentPanel = new Panel();
       studentPanel.setLayout(new GridLayout(4, 2));
 
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel classLabel = new JLabel("Class:");
        JTextField classField = new JTextField();
        JLabel rollNoLabel = new JLabel("Roll No:");
        JTextField rollNoField = new JTextField();
        JLabel subjectLabel = new JLabel("Subject:");
        JTextField subjectField = new JTextField();

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

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String className = classField.getText();
                String rollNo = rollNoField.getText();
                String subject = subjectField.getText();

                // Perform any desired operations with the entered student details here
                
                // Displaying the entered details
                System.out.println("Name: " + name);
                System.out.println("Class: " + className);
                System.out.println("Roll No: " + rollNo);
                System.out.println("Subject: " + subject);
                
                // Displaying success message
                JOptionPane.showMessageDialog(null, "Student details recorded successfully");
            }
        });

        add(studentPanel);
        add(enterButton);

        // Setting the layout constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        add(studentPanel, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(enterButton, gbc);
    }
}

public class ch0_0practice {
    public static void main(String[] args) {
        pannelexyz pan = new pannelexyz();
    }
}
