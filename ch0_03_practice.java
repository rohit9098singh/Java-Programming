import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

class pannelext extends JFrame {
    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> classList = new ArrayList<>();
    private ArrayList<String> rollNoList = new ArrayList<>();
    private ArrayList<String> subjectList = new ArrayList<>();
    private JPanel detailsPanel;

    pannelext() {
        setTitle("cromepage");
        setSize(600, 400);
        setMinimumSize(new Dimension(600, 400));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // Creating the panel for student details
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        JLabel classLabel = new JLabel("Class:");
        JTextField classField = new JTextField();
        JLabel rollNoLabel = new JLabel("Roll No:");
        JTextField rollNoField = new JTextField();
        JLabel subjectLabel = new JLabel("Subject:");
        JTextField subjectField = new JTextField();

        inputPanel.add(nameLabel);
        inputPanel.add(nameField);
        inputPanel.add(classLabel);
        inputPanel.add(classField);
        inputPanel.add(rollNoLabel);
        inputPanel.add(rollNoField);
        inputPanel.add(subjectLabel);
        inputPanel.add(subjectField);

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

                // Updating the displayed details
                updateDetailsPanel();
            }
        });

        // Creating the view all details button
        JButton viewDetailsButton = new JButton("View All Details");

        viewDetailsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Displaying the recorded student details in a message dialog
                StringBuilder message = new StringBuilder();
                for (int i = 0; i < nameList.size(); i++) {
                    message.append("Name: ").append(nameList.get(i)).append(" | ")
                            .append("Class: ").append(classList.get(i)).append(" | ")
                            .append("Roll No: ").append(rollNoList.get(i)).append(" | ")
                            .append("Subject: ").append(subjectList.get(i)).append("\n");
                }
                if (message.length() > 0) {
                    JOptionPane.showMessageDialog(null, message.toString(), "All Student Details", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "No student details recorded yet.", "All Student Details", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        detailsPanel = new JPanel();
        detailsPanel.setLayout(new BoxLayout(detailsPanel, BoxLayout.PAGE_AXIS));

        JScrollPane scrollPane = new JScrollPane(detailsPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(viewDetailsButton);

        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        add(enterButton, BorderLayout.EAST);
    }

    private void updateDetailsPanel() {
        detailsPanel.removeAll();

        for (int i = 0; i < nameList.size(); i++) {
            JPanel studentPanel = new JPanel();
            studentPanel.setLayout(new GridLayout(1, 4));
            studentPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel nameLabel = new JLabel("Name: " + nameList.get(i));
            JLabel classLabel = new JLabel("Class: " + classList.get(i));
            JLabel rollNoLabel = new JLabel("Roll No: " + rollNoList.get(i));
            JLabel subjectLabel = new JLabel("Subject: " + subjectList.get(i));

            studentPanel.add(nameLabel);
            studentPanel.add(classLabel);
            studentPanel.add(rollNoLabel);
            studentPanel.add(subjectLabel);

            detailsPanel.add(studentPanel);
        }

        detailsPanel.revalidate();
        detailsPanel.repaint();
    }
}

public class ch0_03_practice{
    public static void main(String[] args) {
        pannelext pan = new pannelext();
    }
}


