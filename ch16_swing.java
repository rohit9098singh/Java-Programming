
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MySwing1 extends JFrame {
    private JLabel label;
    private JTextField emailField;
    private JButton enterButton;
    private JButton emailIdButton;

    MySwing1() {
        setTitle("Welcome");
        setSize(400, 400);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Create components
        label = new JLabel("Your first GUI program");
        emailField = new JTextField(20);
        enterButton = new JButton("Enter");
        emailIdButton = new JButton("Email ID");

        // Set layout
        setLayout(new BorderLayout());

        // Create panel for the "Your first GUI program" section
        JPanel firstSectionPanel = new JPanel(new FlowLayout());
        firstSectionPanel.add(label);
        firstSectionPanel.add(emailField);
        firstSectionPanel.add(enterButton);

        // Create panel for the "Email ID" button
        JPanel emailIdPanel = new JPanel(new FlowLayout());
        emailIdPanel.add(emailIdButton);

        // Add panels to the frame
        add(firstSectionPanel, BorderLayout.NORTH);
        add(emailIdPanel, BorderLayout.CENTER);

        // Register button listeners
        enterButton.setEnabled(true); // Disable enterButton initially

        enterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                performTask(email);
            }
        });

        emailIdButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                if (!email.isEmpty()) {
                    performTask(email);
                } else {
                    JOptionPane.showMessageDialog(MySwing1.this, "Please enter an email ID");
                }
            }
        });

        emailField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emailIdButton.doClick(); // Trigger emailIdButton click when Enter key is pressed in emailField
            }
        });

        setVisible(true);
    }

    private void performTask(String email) {
        JOptionPane.showMessageDialog(MySwing1.this, "Entered email: " + email);
        emailField.setText(""); // Clear emailField after performing the task
    }
}

public class ch16_swing {
    public static void main(String[] args) {
        MySwing1 s = new MySwing1();
    }
}
