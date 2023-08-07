import javax.swing.JOptionPane;

public class ch16_8_DialogueBoxExample {
    public static void main(String[] args) {
        // Display a message dialog
        JOptionPane.showMessageDialog(null, "Welcome to the Dialogue Box Example!");
        /*The "OK" button in a JOptionPane dialog is created automatically by the JOptionPane.showMessageDialog method.
         When you use this method to display a message dialog, it creates a dialog box with the specified message and a 
         default "OK" button. The "OK" button is used to close the dialog when clicked. */

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

