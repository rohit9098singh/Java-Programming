import javax.swing.JOptionPane;

public class ch16_8_DialogueBoxExample {
    public static void main(String[] args) {
        // Display a message dialog
        JOptionPane.showMessageDialog(null, "Welcome to the Dialogue Box Example!");

        // Collect user input using an input dialog
        String userInput = JOptionPane.showInputDialog("Please enter your name:");
        JOptionPane.showMessageDialog(null, "Hello, " + userInput + "!");

        // Confirm user's choice using a confirm dialog
        int choice = JOptionPane.showConfirmDialog(
            null, 
            "Do you want to proceed?", 
            "Confirmation", 
            JOptionPane.YES_NO_OPTION
        );

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You chose to proceed. Good choice!");
        } else {
            JOptionPane.showMessageDialog(null, "You chose not to proceed. That's okay!");
        }
    }
}

