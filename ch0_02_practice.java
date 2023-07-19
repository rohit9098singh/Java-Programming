import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

class pannelexw extends JFrame {
    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> classList = new ArrayList<>();
    private ArrayList<String> rollNoList = new ArrayList<>();
    private ArrayList<String> subjectList = new ArrayList<>();

    pannelexw() {
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

                // Store the entered details in the respective ArrayLists
                nameList.add(name);
                classList.add(className);
                rollNoList.add(rollNo);
                subjectList.add(subject);

                // Clearing the text fields for the next entry
                nameField.setText("");
                classField.setText("");
                rollNoField.setText("");
                subjectField.setText("");

                // Displaying success message
                JOptionPane.showMessageDialog(null, "Student details recorded successfully");
            }
        });

        // Creating the view details button
        JButton viewDetailsButton = new JButton("View Details");

        viewDetailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Displaying the recorded student details in a message dialog
                StringBuilder message = new StringBuilder();
                for (int i = 0; i < nameList.size(); i++) {
                    message.append("Name: ").append(nameList.get(i)).append("\n")
                            .append("Class: ").append(classList.get(i)).append("\n")
                            .append("Roll No: ").append(rollNoList.get(i)).append("\n")
                            .append("Subject: ").append(subjectList.get(i)).append("\n\n");
                }
                if (message.length() > 0) {
                    JOptionPane.showMessageDialog(null, message.toString(), "All Student Details", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No student details recorded yet.", "All Student Details", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        add(studentPanel);
        add(enterButton);
        add(viewDetailsButton);

        // Setting the layout constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        add(studentPanel, gbc);

        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        add(enterButton, gbc);

        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(viewDetailsButton, gbc);
    }
}


public class ch0_02_practice {
    public static void main(String[] args) {
        pannelexw pan = new pannelexw();
    }
}


    

